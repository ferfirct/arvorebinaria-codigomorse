import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreMorse arvore = new ArvoreMorse();
        arvore.inicializar();
        arvore.montarArvore();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto a ser codificado para Morse:");
        String texto = sc.nextLine();

        System.out.println("Mensagem em código Morse:");
        arvore.codificarFrase(texto);
    }
}
