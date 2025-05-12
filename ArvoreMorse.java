public class ArvoreMorse {
    private Node raiz;

    public void inicializar() {
        raiz = new Node('\0');
    }

    public void inserir(String codigoMorse, char caractere) {
        Node atual = raiz;
        int i = 0;
        while (i < codigoMorse.length()) {
            char simbolo = codigoMorse.charAt(i);
            if (simbolo == '.') {
                if (atual.esquerda == null) {
                    atual.esquerda = new Node('\0');
                }
                atual = atual.esquerda;
            } else if (simbolo == '-') {
                if (atual.direita == null) {
                    atual.direita = new Node('\0');
                }
                atual = atual.direita;
            }
            i = i + 1;
        }
        atual.valor = caractere;
    }

    public void montarArvore() {
        inserir(".-", 'A');     inserir("-...", 'B');   inserir("-.-.", 'C');
        inserir("-..", 'D');    inserir(".", 'E');      inserir("..-.", 'F');
        inserir("--.", 'G');    inserir("....", 'H');   inserir("..", 'I');
        inserir(".---", 'J');   inserir("-.-", 'K');    inserir(".-..", 'L');
        inserir("--", 'M');     inserir("-.", 'N');     inserir("---", 'O');
        inserir(".--.", 'P');   inserir("--.-", 'Q');   inserir(".-.", 'R');
        inserir("...", 'S');    inserir("-", 'T');      inserir("..-", 'U');
        inserir("...-", 'V');   inserir(".--", 'W');    inserir("-..-", 'X');
        inserir("-.--", 'Y');   inserir("--..", 'Z');

        inserir("-----", '0');  inserir(".----", '1');  inserir("..---", '2');
        inserir("...--", '3');  inserir("....-", '4');  inserir(".....", '5');
        inserir("-....", '6');  inserir("--...", '7');  inserir("---..", '8');
        inserir("----.", '9');
    }

    public void codificarFrase(String texto) {
        texto = texto.toUpperCase();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == ' ') {
                System.out.print("  ");
            } else {
                String codigo = buscarCodigo(raiz, c, "");
                if (!codigo.equals("")) {
                    System.out.print(codigo + " ");
                } else {
                    System.out.print("? ");
                }
            }
        }
        System.out.println();
    }

    private String buscarCodigo(Node atual, char alvo, String caminho) {
        if (atual == null) return "";
        if (atual.valor == alvo) return caminho;

        String esquerda = buscarCodigo(atual.esquerda, alvo, caminho + ".");
        if (!esquerda.equals("")) return esquerda;

        String direita = buscarCodigo(atual.direita, alvo, caminho + "-");
        return direita;
    }
}
