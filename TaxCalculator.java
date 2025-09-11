import java.util.Scanner;
public class TaxCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income<500000){
            System.out.println("0 percent tax");
        }
        else if(income >= 500000 && income < 1000000){
            System.out.println("20 percent tax");
        }
        else{
            System.out.println("30 percent tax");
        }
    //LARGEST OF THREE NUMBERS
        int a = 1;
        int b = 3;
        int c = 6;
        if( a>b && a>c){
            System.out.println("a");
        }
        else if( b>a && b>c){
            System.out.println("b");
        }else{
            System.out.println("c");
        }
    }
}