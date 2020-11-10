
# Memento

Memento é um padrão de projeto de software documentado no Catálogo Gang of Four, sendo considerado como um padrão comportamental. Ele permite armazenar o estado interno de um objeto em um determinando momento, para que seja possível retorná-lo a este estado, sem que isso cause problemas com o encapsulamento.

Ele funciona de maneira que uma classe é responsável por salvar o estado do objeto desejado enquanto que uma outra classe fica responsável por armazenar todas essas copias (mementos).

O padrão Memento é implementado se utilizando de três elementos: Originador, Armazenador e o Memento.

## Motivação

O Padrão Comportamental Memento possui uma grande gama de aplicações onde é necessário a recuperação de um estado anterior de um objeto como um todo, qualquer tipo de editor precisa oferecer uma maneira de desfazer ações como restaurar imagens, textos etc. Para isso, o padrão Memento procura recuperar o estado anterior dessas ações e copiar os mesmos para um objeto a ser restaurado.

## Participantes

- Originador: é o objeto cujo estado se deseja capturar.
- Memento: responsável por armazenar o estado interno do objeto Originador.
- Armazenador: é o objeto que acessará o originador, e deseja desfazer qualquer mudança efetuada, caso necessário. Ele é responsável por armazenar todos os Mementos. Os Mementos devem ser recuperados de maneira LIFO (Last In First Out) onde o ultimo adicionado será o primeiro a ser recuperado.

O Armazenador deve requisitar um objeto memento, antes de se valer do originador. Após efetuar as operações desejadas no originador, o cliente devolve a este o objeto memento, caso deseje desfazer qualquer alteração.

O objeto memento não permite o acesso de qualquer classe além da classe originador. Assim, tal padrão mostra-se útil por não violar o conceito de encapsulamento.

## Aplicabilidade: 

Quando deixamos algumas informações de o
objeto disponível para outro objeto.
Quando queremos criar instantâneos de um
estado para um objeto.
Quando precisamos de operações undo/redo.

## Estrutura

![Estr](https://github.com/IgorAmato/Faculdade/blob/master/Padrão%20Projeto%20Memento/imagem_2020-11-10_110749.png)

## Código de exemplo

[exemplo](https://github.com/IgorAmato/Faculdade/blob/master/Padrão%20Projeto%20Memento/Exemplo.java)

