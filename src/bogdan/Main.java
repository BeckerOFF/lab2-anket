package bogdan;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        	System.out.println("Введите количество основных цветов RGB палитры : ");
        long answer1 = k.nextLong();
        	System.out.println("Количество океанов на планете : ");
        long answer2 = k.nextLong();
        	System.out.println("Экономика в упадке (1=да,0-нет) :");
        long answer3 = k.nextLong();
        	System.out.println("Число Пи ");
        long answer4 = k.nextLong();

        if (answer1 == 3L) {
            System.out.println("Да ты прав");
        } else {
            System.out.println("НЕТ не угадал");
        }

        System.out.println("Ваш ответ " + answer2 + ",но правельный 5.");
        if (answer2 == 5L) {
            System.out.println("Да ты прав");
        } else {
            System.out.println("несовсем, гугли");
        }

        System.out.println("Твой ответ " + answer3 + "но верным был на 3 вопрос 1.");
        if (answer3 == 1L) {
            System.out.println("Верно");
        } else {
            System.out.println("НЕТ");
        }
        System.out.println("Ответ на 4 вопрос бы 3");
        if (answer4 == 3L) {
            System.out.println("Молодец");
        } else {
            System.out.println("ОШиБка");
        }

       
    }
}