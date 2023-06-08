package java_sem_1;

import java.util.Scanner;

public class Task_02 {

    //Вывести все простые числа от 1 до 1000

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n =scan.nextInt();
        scan.close();
        String s =null;
        if (n==1){
            s ="1";
        }
        if (n==2){
            s= "1, 2";
        }
        if (n>2){
            s= "1, 2";
            for (int i=3; i<=n; i++){
                for (int j=2; j<i; j++){
                    if (i%j==0){
                        break;
                    }    
                    if (i==j+1){
                        s +=(", "+i);  
                    }
                }
            }    
        }
    System.out.println(s);    
    }    
}

