import java.util.Scanner;
import java.util.Stack;

public class seis {
    public static void main(String[] args) {

        Stack<Integer> P1 = new Stack<>();
        Stack<Integer> P2 = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um número: ");
            int x = scan.nextInt();
            P1.push(x);
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;

        while (!P1.isEmpty()) {
            int element = P1.pop();
            tempStack.push(element);
            sum += element;
            max = Math.max(max, element);
            min = Math.min(min, element);
            if (element % 2 == 0) {
                P2.push(element);
            }
            count++;
        }

        while (!tempStack.isEmpty()) {
            P1.push(tempStack.pop());
        }

        double average = (double) sum / count;

        System.out.println("Maior número: " + max);
        System.out.println("Menor número: " + min);
        System.out.println("Média: " + average);
        System.out.println("Números pares na pilha P2:");
        System.out.println(P2);
    }
}
