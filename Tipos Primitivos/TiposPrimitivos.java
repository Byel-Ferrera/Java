/* antes da aula de tipos primitivos, aprendi sobre os comentários (de linha única e múltiplas linhas) 
        e sobre as convenções de nomeclatura mais básicas:
        CamelCase em que a primeira palavra começa minúscula e as próximas maiúsculas. (variáveis, métodos e atributos)
        e a Pascalcase em que todas as palavras começam com letra maiúscula. (classes, interfaces e enums)
        Aprendi também a dar nomes significativos, claros e objetivos para variáveis, métodos e classes, evitando abreviações e siglas, 
        e a usar palavras reservadas do Java como nomes de variáveis ou métodos, pra deixar o código mais legível e manutenível.
        */

public class TiposPrimitivos {
    public static void main(String[] args) {
   

        // TIPOS PRIMITIVOS             dia 18/02/2026
        // byte, short, int, long, float, double, char, boolean

        System.out.println("-------------PRIMITIVOS-------------");
        System.out.println("                                 ");

        int age = 19;
        long bignumber = 10000000000L;
        double wageDouble = 1600;
        float wageFloat = 1600f;
        byte wageByte = 10;
        short wageShort = 1000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 100;
         //ou usando a unicode:
        
         char caracter01 = '\u0064'; // 'd' em unicode
        
         //Todos (exceto expressões booleanas) são numéricas, a diferença é o espaço que ocupam na memória.

        System.out.println("Idade: " + age);
        System.out.println("Numero grande: " + bignumber);
        System.out.println("Salario em double: " + wageDouble);
        System.out.println("Salario em float: " + wageFloat);
        System.out.println("Salario em byte: " + wageByte);
        System.out.println("Salario em short: " + wageShort);
        System.out.println("Valor booleano verdadeiro: " + verdadeiro);
        System.out.println("Valor booleano falso: " + falso);
        System.out.println("Caractere: " + caracter);
        System.out.println("Caractere unicode: " + caracter01);
    
        System.out.println("                                 ");
        System.out.println("-------------CASTING-------------");
        System.out.println("                                 ");

        /* CASTING:
        É a conversão de um tipo de dado para outro.
        No Java, cada tipo de dado ocupa um tamanho diferente na memória (int, double, long, etc.).
        Quando atribuimos um valor de um tipo para uma variável de outro tipo, o Java pode:

        -> Fazer a conversão automaticamente → casting implícito (Menor para maior)
        -> Exigir que você force a conversão → casting explícito (Maior para menor)*/

        int age01 = (int) 1000000000000000000l; // casting implícito (está forçando um valor long virar um int)
        double wageDouble01 = 1600.0; // não precisa de letra, pois já é um tipo double (padrão)
        float wageFloat01 = 1600f; // precisa da letra 'f' para indicar que é um tipo float
        //se eu quiser forçar um double num float
        float wageFloat02 =  1600.0f; // casting explícito ( valor double para float)
        System.out.println("Idade com casting: " + age01); //Aqui ele fará o valor caber no int, mesmo que ele corte dados.
        System.out.println("Salario em double: " + wageDouble01);
        System.out.println("Salario em float: " + wageFloat01);
        System.out.println("Salario em float com casting: " + wageFloat02);

        System.out.println("                                 ");

        //String não é um tipo primitivo, é uma classe e não tem limite de caracteres.
        //diferente dos caracteres do char (por exemplo), nele é usado duas aspas para indicar que é uma string, e não uma letra ou símbolo.
        
        String name = "Jao";
        System.out.println("Nome: " + name);

        System.out.println("                                 ");
        System.out.println("-------------Pratica-------------");
        System.out.println("                                 ");

        /*Prática: 
        Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
        Eu <nome>, morando no endereço <endereço>,
        confirmo que recebi o salário de <salário>, na data <data>.       
        */

        String name01 = "Gabryel";
        String address = "Rua J, Quadra 11, Numero 36";
        double wege = 2500.00;
        String date = "20/02/2026";

        System.out.println("Eu " + name01 + ", morando no endereco " + address + ", confirmo que recebi o salario de " + wege + ", na data " + date + ".");
    }
}