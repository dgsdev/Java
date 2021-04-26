// programa Soma utilizando a classe Scanner.

import java.util.Scanner; 

public class Sum {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number1;
    int number2;
    int sum;

    System.out.print("Digite primeiro numero inteiro: ");
    number1 = input.nextInt();

    System.out.print("Digite segundo numero inteiro: ");
    number2 = input.nextInt();

    sum = number1 + number2;

    System.out.printf("Soma = %d%n", sum);
  }
}
