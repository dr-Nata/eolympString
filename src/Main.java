public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        String s = readString();
        System.out.println(task1(s));
        System.out.println(task2(s));
        System.out.println(task3(s));
        System.out.println(task4(s));
        System.out.println(task5(s));
        System.out.println(task6(task5(s)));
        System.out.println(task7(s));
    }

    private String readString() {
        return "abrakadabra";
    }

    private String task1(String s) {
        //Слово, образованное третим, седьмым и одиннадцатым символом строки s.
        return null;
    }

    private String task2(String s) {
        //Слово, образованное первым и двума последними символами строки s.
        return null;
    }

    private String task3(String s) {
        //Слово, что образуют семь первых символов строки s.
        return null;
    }

    private String task4(String s) {
        //Строка s без четырех первых символов.
        return null;
    }

    private String task5(String s) {
        //Слово, что образуют все символы с нечетными индексами, начиная со второго символа строки s .
        return null;
    }

    private int task6(String s) {
        //Длину слова из предыдущего пункта.
        return s.length();
    }

    private String task7(String s) {
        //Строка s в обратном порядке.
        return null;
    }
}


/*
Входные данные #1

abrakadabra

Выходные данные #1

rda
ara
abrakad
kadabra
baaar
5
arbadakarba

 */
