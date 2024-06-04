import java.util.Scanner;

public class trabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vectorLength;
        float sum = 0;
        float secondSum = 0;
        int biggestValue, minorValue;
        int biggestIndex, minorIndex;
        int aux = 0;

        System.out.print("Informe um tamanho para um vetor: ");
        vectorLength = scanner.nextInt();
        int [] vector = new int[vectorLength]; // Insere o valor digitado na quantidade de índices do vetor.

        for (int i = 0; i < vectorLength; i++) { // Faz uma varredura pelos valores dos vetores.
            System.out.print("Digite o valor do vetor " + ( i + 1 ) + ": ");
            vector[i] = scanner.nextInt();
        }

        for (int i = 0; i < vectorLength; i++) { // Faz a soma dos vetores informados.
            sum += vector[i];
        }
        System.out.println("A soma dos índices do vetor são: " + sum);
        System.out.println("A média dos valores somados é: " + (sum / vectorLength));

        minorValue = vector[0];
        for (int i = 0; i < vectorLength; i++) { // Verifica e mostra o menor valor dentro do vetor.
            if (minorValue > vector[i]) {
                minorValue = vector[i];
            }
        }
        System.out.println("O menor valor inserido no vetor foi: " + minorValue);

        biggestValue = vector[0];
        for (int i = 0; i < vectorLength; i++) { // Verifica e mostra o maior valor dentro do vetor.
            if (biggestValue < vector[i]) {
                biggestValue = vector[i];
            }
        }
        System.out.println("O maior valor inserido no vetor foi: " + biggestValue);

        System.out.print("Informe uma posição do vetor: ");
        biggestIndex = scanner.nextInt();
        System.out.print("Agora informe outra posição para trocarmos os valores: ");
        minorIndex = scanner.nextInt();

        System.out.print("Agora, informe um valor para alocarmos no vetor " + biggestIndex + ": ");
        vector[biggestIndex] = scanner.nextInt();
        System.out.print("Agora informe o segundo valor para o vetor " + minorIndex + ": ");
        vector[minorIndex] = scanner.nextInt();

        System.out.println("O valor do vetor " + biggestIndex + " se tornou " + vector[biggestIndex] + " e o valor do vetor " + minorIndex + " se tornou " + vector[minorIndex] + ".");

        for (int i = 0; i < vectorLength; i++) {
            secondSum += vector[i];
        }
        System.out.println("Por fim, a soma dos valores substituídos ficou: " + secondSum + " e a média dos valores atualizados ficou " + (secondSum / vectorLength));
    }
}