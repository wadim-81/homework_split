package homework_split;

import java.util.Scanner;

public class Homework_split {
    public static void main(String[] args) {
        //1.
//Пользователь вводит строку
//Разделите строку на слова
//В каждом слове оставьте только первую букву
//Сложите все первые буквы слов в одно слово
//Напишите на экран размер получившейся строки, а также первую и последнюю буквы слова





        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        StringBuilder res = new StringBuilder();

        String[] array = string.split(" ");
        for (int i = 0; i < array.length; i++) {

            char answer = array[i].charAt(0);//выводит первую букву каждого слова
            String answer1 = array[i].substring(array[i].length() -1);//вывод последней буквы

          res.append(answer).append(answer1); //добавляем первую и последнюю букву в res

            System.out.println((array[i]));
            System.out.println("первая и последняя буква :"+ answer+answer1);
            System.out.println("слово из первых и последних букв :"+res.toString());
        }
    }
}