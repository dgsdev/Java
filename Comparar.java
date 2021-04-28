/*
 * Compara inteiros utilizando instruções:
 * if, operadores relacionais e operadores de igualdade.
 */

import java.util.Scanner;

public class Comparar {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int number1;
    int number2;

    System.out.print("Digite primeiro numero inteiro: "); 
    number1 = input.nextInt(); 

    System.out.print("Digite segundo numero inteiro: "); 
    number2 = input.nextInt(); 

    if (number1 == number2) System.out.printf("%d == %d%n", number1, number2);

    if (number1 != number2) System.out.printf("%d != %d%n", number1, number2);

    if (number1 < number2) System.out.printf("%d < %d%n", number1, number2);

    if (number1 > number2) System.out.printf("%d > %d%n", number1, number2);

    if (number1 <= number2) System.out.printf("%d <= %d%n", number1, number2);

    if (number1 >= number2) System.out.printf("%d >= %d%n", number1, number2);
  }
}
