package works;
import java.util.Scanner;
public class works {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //вводить числа с запятой а не точкой. Пример 1,2 а не 1.2!!!
        System.out.println("Введите число a:");
        float a = sc.nextFloat();
        System.out.println("Введите число b:");
        float b = sc.nextFloat();
        System.out.println("Введите число c:");
        float c = sc.nextFloat();
        System.out.println("Введите число d:");
        float d = sc.nextFloat();
        sc.close();
        float P = a*(b+(c/d));
        System.out.println("Ответ= " + P);

    }
}
