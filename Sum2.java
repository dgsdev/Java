// Elabore um programa completo que calcule e imprima o produto de três inteiros.

import java.util.Scanner; 

public class Sum2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1;
    int number2;
    int number3;
    int sum;

    System.out.print("Digite primeiro numero inteiro: ");
    number1 = input.nextInt();

    System.out.print("Digite segundo numero inteiro: ");
    number2 = input.nextInt();

    System.out.print("Digite terceiro numero inteiro: ");
    number3 = input.nextInt();

    sum = number1 + number2 + number3;

    System.out.printf("Soma = %d%n", sum);
  }
}
