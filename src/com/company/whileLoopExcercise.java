//many errors, not finished
package com.company;
import java.util.Scanner;
public class whileLoopExcercise {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //fromhereToThere testing
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(fromHereToThere(a,b));
        //factors testing
        System.out.println(factors(a));
    }
    private static String fromHereToThere(int a,int b){
        if(a<=b) {
            return "invalid input";
        }else{
            int num = a;
            while(num<=b&&num>=a) {
                return num + " ";
                num++;
            }
        }
    }
    private static String factors(int a){
        int num = 1;
        while(num<=a){
            if(a%num==0){
                return num+" ";
                num++;
            }else{
                num++;
            }
        }
    }
    public static String countPosAndNeg(){
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        while(a==0){
            return ""
        }

    }
}
