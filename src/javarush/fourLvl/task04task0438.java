package javarush.fourLvl;

public class task04task0438 {
    /*Используя цикл for вывести на экран:
            - горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).

    Требования:
            •	Программа не должна считывать числа c клавиатуры.
            •	Программа должна выводить числа на экран.
            •	Программа должна выводить горизонтальную линию из 10 восьмёрок.
            •	Программа должна выводить вертикальную линию из 10 восьмёрок.
            •	В программе должен использоваться цикл for.
*/
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print(8);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(8);
        }

    }

}
