# Trabalho Código Morse

Este projeto é uma aplicação em Java que implementa a codificação de mensagens de texto para código Morse utilizando uma árvore binária. Ele foi desenvolvido como parte de um trabalho acadêmico com foco no uso de estruturas de dados não lineares.

## Conceito
A árvore binária representa o alfabeto Morse, onde:

O ramo esquerdo (esquerda) representa um ponto .

O ramo direito (direita) representa um traço -

Cada caminho da raiz até uma folha representa o código Morse de uma letra ou número. A estrutura facilita a tradução reversa (decodificação), mas neste projeto o foco está na codificação de texto para Morse.

## Funcionalidades
Montagem da árvore binária com os caracteres alfabéticos (A-Z) e numéricos (0-9) baseados em seus códigos Morse.

Leitura de uma frase do usuário.

Impressão da frase codificada em código Morse.

## Estrutura do Código
Classe Main: Ponto de entrada do programa, responsável pela interação com o usuário.

Classe Node: Representa cada nó da árvore, contendo um caractere e ponteiros para esquerda e direita.

Classe ArvoreMorse:

inicializar(): Cria a raiz da árvore.

montarArvore(): Insere todos os caracteres com seus respectivos códigos Morse.

inserir(codigoMorse, caractere): Insere um caractere na árvore, seguindo o caminho especificado pelo código Morse.

codificarFrase(texto): Converte uma string para seu equivalente em Morse.

buscarCodigo(): Função recursiva que busca o caminho Morse de um caractere na árvore.

## Como executar
Salve o código em arquivos .java (por exemplo, Main.java, Node.java, ArvoreMorse.java).

