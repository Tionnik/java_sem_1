package java_sem_1;

import java.util.Scanner;

public class Task_01 {

    //Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    //1 + 2 + 3 1*2*3

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n =scan.nextInt();
        scan.close();
        int summ =0;
        for (int i=0; i<=n; i++ ) {
            summ += i;
        }
        int factorial =1;
        for (int j=1; j<=n; j++){
            factorial *= j;    
        }
    System.out.printf("Треугольное значение числа %d=%d  Факториал числа %d!=%d",n, summ, n, factorial);
    }
}
