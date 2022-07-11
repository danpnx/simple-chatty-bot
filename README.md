# simple-chatty-bot
Simple assistant, made for practicing fundamentals of java

# Paradigmas
Paradigmas são abordagens diferentes para a criação de programas. Existem dois principais paradigmas de programação: imperativo e declarativo.
## Paradigma Imperativo
O paradigma imperativo foca em atingir um resultado utilizando instruções passo a passo que alteram os dados sequencialmente. São imperativos os paradigmas de Programação Procedural, a Programação Orientada a Objeto (POO) e a Programação Paralela.

A POO é o paradigma em que o programa é escrito através de uma coleção de classes, onde cada classe possui suas próprias instâncias que são chamadas de Objetos. Uma classe é uma forma de descrever uma entidade no geral, definindo o seu estado e comportamento baseado em suas características, além de regras para que possam interagir com essa entidade.

## Paradigma Declarativo
O paradigma declarativo foca na tarefa e em encontrar um resultado esperado. São declarativos os paradigmas Lógico, Funcional e Restritivo.

# Dicas
O caractere especial underscore (_) pode ser usado para separar grupos de dígitos dentro de um número. Isso facilita na leitura do código.

Ex: 

`int million = 1_000_000;`

# Caracteres
'\n' is the newline character;
'\t' is the tab character;
'\r' is the carriage return character;
'\\' is the backslash character itself;
'\'' is the single quote mark;
'\"' is the double quote mark.]

# String
## Exceptions when processing strings
1. NullPointerException
Quando a string é nula e você chama um método para a string, então ocorre o NullPointerException.

Ex:

`String s = null;`

`int length = s.length();`

2. StringIndexOutOfBoundsException
Quando você tenta acessar um caractere que não existe através de um índice, então a exception ocorre.

Ex:

`String s = "ab";`

`char c = s.charAt(2);`

## Comparando strings
Existem dois métodos diferentes para a comparação de strings baseadas em seus valores: equals() e equalsIgnoreCase().

Ex:

`String first = "first";`

`String anotherFirst = "first";`

`String second = "second"`

`String secondInUpperCase = "SECOND";`

`first.equals(anotherFirst); // true`

`first.equals(second); // false`

`second.equals(secondInUpperCase); // false`

`second.equalsIgnoreCase(secondInUpperCase); // true`
