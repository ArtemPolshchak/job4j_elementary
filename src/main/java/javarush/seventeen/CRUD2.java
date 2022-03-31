package javarush.seventeen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @author User on 30.03.2022.
 * CrUD Batch - multiple Creation, Updates, Deletion.
 *
 * Программа запускается с одним из следующих наборов параметров:
 * -c name1 sex1 bd1 name2 sex2 bd2 ...
 * -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
 * -d id1 id2 id3 id4 ...
 * -i id1 id2 id3 id4 ...
 *
 * Значения параметров:
 * name - имя, String
 * sex - пол, "м" или "ж", одна буква
 * bd - дата рождения в следующем формате 15/04/1990
 * -с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
 * -u - обновляет соответствующие данные людей с заданными id
 * -d - производит логическое удаление человека с id, заменяет все его данные на null
 * -i - выводит на экран информацию о всех людях с заданными id: name sex bd
 *
 * id соответствует индексу в списке.
 * Формат вывода даты рождения 15-Apr-1990
 * Все люди должны храниться в allPeople.
 * Порядок вывода данных соответствует вводу данных.
 * Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных).
 * Используй Locale.ENGLISH в качестве второго параметра для SimpleDateFormat.
 *
 * Пример вывода для параметра -і с двумя id:
 * Миронов м 15-Apr-1990
 * Миронова ж 25-Apr-1997
 */
public class CRUD2 {
    public volatile static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {
        Date birthdayDate;
        Person person;
        switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i +=3) {
                            birthdayDate = simpleDateFormat1.parse(args[i + 2]);
                            if (args[i + 1].equals("м")) {
                                allPeople.add(Person.createMale(args[i], birthdayDate));
                            } else if (args[i + 1].equals("ж")) {
                                allPeople.add(Person.createFemale(args[i], birthdayDate));
                            }
                            System.out.println(allPeople.size() - 1);
                        }

                        break;

                    }
                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i ++) {
                            person = allPeople.get(Integer.parseInt(args[i]));
                            System.out.println(person.getName() + " "
                                    + (person.getSex() == Sex.MALE ? "м" : "ж")
                                    + " " + simpleDateFormat2.format(person.getBirthDate()));
                        }

                        break;
                    }
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i +=4) {
                            person = allPeople.get(Integer.parseInt(args[i]));
                            person.setName(args[i + 1]);
                            person.setSex(getSex(args[i + 2]));
                            person.setBirthDate(simpleDateFormat1.parse(args[i + 3]));
                        }
                        break;
                    }
                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i ++) {
                            person = allPeople.get(Integer.parseInt(args[i]));
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                        break;
                    }
            }

    }

    private static Sex getSex(String sexParam) {
        return sexParam.equals("м") ? Sex.MALE : Sex.FEMALE;
    }

}

