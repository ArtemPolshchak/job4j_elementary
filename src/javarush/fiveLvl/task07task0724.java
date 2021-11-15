package javarush.fiveLvl;


/*
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...
*/

import java.util.ArrayList;


public class task07task0724 {
    public static void main(String[] args)  {
        Human mothersFather = new Human("mothersGrandPa", true, 70);
        Human mothersMother = new Human("mothersGrandMa", false, 77);
        Human fathersFather = new Human("fathersGrandPa", true, 72);
        Human fathersMother = new Human("fathersGrandMa", false, 73);
        Human father = new Human("mother", true, 40, fathersFather, fathersMother);
        Human mother = new Human("father", false, 35, mothersFather, mothersMother);
        Human son = new Human("sonNick", true, 15, father, mother);
        Human daughter = new Human("daughterMonika", false, 13, father, mother);
        Human youngestSon = new Human("junior", true, 24, father, mother);

        ArrayList<Human> list = new ArrayList<>();
        list.add(mothersFather);
        list.add(mothersMother);
        list.add(fathersFather);
        list.add(fathersMother);
        list.add(father);
        list.add(mother);
        list.add(son);
        list.add(daughter);
        list.add(youngestSon);

        for (Human h : list) {
            System.out.println(h);
        }

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }

    }


}
