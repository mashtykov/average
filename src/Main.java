import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое неотрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }
    public static double avg(int num){
        String numString = String.valueOf(num);
        double sum=0;
        for (int i = 0; i < numString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        return sum/numString.length();
    }
}
