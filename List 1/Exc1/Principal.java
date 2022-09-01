package exc1;

import static java.lang.Math.*;
import java.util.Scanner;

public class Principal {
    public static Integer opcao;
    public static Float num1;
    public static Float num2;

    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("1-Abs");
        System.out.println("2-Ceil");
        System.out.println("3-Cos");
        System.out.println("4-Exp");
        System.out.println("5-Floor");
        System.out.println("6-Log");
        System.out.println("7-Max");
        System.out.println("8-Min");
        System.out.println("9-Pow");
        System.out.println("10-Sqrt");
        
        Scanner scan = new Scanner(System.in);
        opcao = scan.nextInt();
        scan.nextLine();
        
        switch(opcao){
            case 1 -> abs();
            case 2 -> ceil();
            case 3 -> cos();
            case 4 -> exp();
            case 5 -> floor();
            case 6 -> log();
            case 7 -> max();
            case 8 -> min();
            case 9 -> pow();
            case 10 -> sqrt();
        }//switch
    }//main
    
    public static void abs(){
        System.out.print("Digite um numero):\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println(num1+" em módulo é: " + abs(num1));
    }
    //--------------------------------------------------------------------------
    public static void ceil(){
        System.out.print("Digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("O maior número inteiro ao arredondar " + num1 + " eh "+ ceil(num1));
    }
    //--------------------------------------------------------------------------
    public static void cos(){
        System.out.print("Digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("O cosseno de " + num1 + " em radianos eh " + cos(num1));
    }
    //--------------------------------------------------------------------------
    public static void exp(){
        System.out.print("digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("O numero de euler elevado a " + num1 + " eh "+ exp(num1));
    }
    //--------------------------------------------------------------------------
    public static void floor(){
        System.out.print("Digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("O menor número inteiro ao arredondar " + num1 + " eh "+ floor(num1));
    }
    //--------------------------------------------------------------------------
    public static void log(){
        System.out.print("Digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("O logaritmo natural de " + num1 + " eh "+ log(num1));
    }
    //--------------------------------------------------------------------------
    public static void max(){
        System.out.print("Digite o primeiro numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        scan.nextLine();
        System.out.print("Digite o segundo numero:\n");
        num2 = scan.nextFloat();
        System.out.println("O maior numero entre " + num1 +" e "+num2+ " eh "+ max(num1,num2));
    }
    //--------------------------------------------------------------------------
    public static void min(){
        System.out.print("Digite o primeiro numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        scan.nextLine();
        System.out.print("Digite o segundo numero:\n");
        num2 = scan.nextFloat();
        System.out.println("O menor numero entre " + num1 +" e "+num2+ " eh "+ min(num1,num2));
    }
    //--------------------------------------------------------------------------
    public static void pow(){
        System.out.print("Digite o numero que sera a base:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        scan.nextLine();
        System.out.print("digite o numero do expoente(caso float, usar vírgula ','):\n");
        num2 = scan.nextFloat();
        System.out.println(num1+" elevado a "+ num2 + " eh "+ pow(num1,num2));
    }
    //--------------------------------------------------------------------------
    public static void sqrt(){
        System.out.print("Digite um numero:\n");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextFloat();
        System.out.println("A raiz quadrada de " + num1 + " eh "+ sqrt(num1));
    }
    
}//class
