import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreve seu nome:");
        String s = input.nextLine();

        System.out.println("Bem vido "+s+" sua conta foi criada");
        
    }
}
