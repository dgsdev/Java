// printf (f significa -> formato) exibe os dados formatados.
// Especificadores de formato iniciam com um sinal de porcentagem (%) ...
// seguido por um caractere que representa o tipo de dados.
// Especificador de formato %s ->  é um marcador de lugar para uma string.
// Especificador de formato %n ->  é uma linha separadora portável entre diferentes sistemas operacionais
// não pode usar %n no argumento para System.out.print ou System.out.println;

public class Hello3 {

  public static void main(String[] args) {
    System.out.printf("%s%n%s%n%s%n%s%n", "Bem-vindo", "Programar em Java", "Classes", "POO");
  }
}
