package java_sem_1;

import java.util.Scanner;

public class Task_03 {

    //Реализовать простой калькулятор (+-/*)    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int n1 =scan.nextInt();
        System.out.printf("Знак: ");
        String sign = scan.next();
        System.out.printf("Введите второе число: ");
        int n2 =scan.nextInt();
        scan.close();
        if ("+".equals(sign)){
            int res=n1+n2;
            System.out.println(res);
        }
        if ("-".equals(sign)){
            int res = n1-n2;
            System.out.println(res);
        }
        if ("*".equals(sign)){
            int res = n1*n2;
            System.out.println(res);
        }
        if ("/".equals(sign)){
            int res = n1/n2;
            System.out.printf(res+" и "+(n1%n2)+"/"+n2);
        }
    }
}
