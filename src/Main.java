import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        String input = String.valueOf (num);
        double sum = 0;
        for(int i = 0; i < input.length(); ){
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            i++;
        }//todo Дописать логику работы метода сюда. Метод main не трогаем!!!
        return sum / input.length(); //todo заменить 0 на корректный результат.
    }
}
