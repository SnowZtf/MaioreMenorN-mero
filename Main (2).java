import java.util.*;

//Programa para ler 10 número inteiros e exibir o maior e o menor número
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[] numeros = new int[10];
    int maior = 0, menor = 999;

    for (int i = 0; i < 10; i++) {
      System.out.println("Digite um número:");
      numeros[i] = entrada.nextInt();
    }

    for (int i = 0; i < 10; i++) {
      if (numeros[i] > maior) {
        maior = numeros[i];
      }
      if (numeros[i] < menor) {
        menor = numeros[i];
      }
    }
    System.out.println("O maior número é: " + maior);
    System.out.println("O menor número é: " + menor);
  }
}