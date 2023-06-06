import java.util.Scanner;

public class LivrariaApplication {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        String statusIdade;

        if (idade <= 17) {
            statusIdade = "Menor idade!";
        } else {
            statusIdade = "Maior idade!";
        }

        sc.close();

        System.out.println("Olá: " + nome + "!");
        System.out.println("Você tem: " + statusIdade);
    }
}