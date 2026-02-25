package operadores;

public class logicos {
    public static void main(String[] args) {
        
       //&& (and) || (or) ! (not) 
       
        // && todas as condições precisam ser verdadeiras para retornar true
        int idade = 35;
        float salario = 5000.00f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.err.println("dentro da lei maior que trinta " + isDentroDaLeiMaiorQueTrinta);
        System.err.println("dentro da lei menor que trinta " + isDentroDaLeiMenorQueTrinta);


        // || apenas uma das condições precisa ser verdadeira para retornar true
        double valorTotalContaCorrente = 200.00;
        double valorTotalContaPoupanca = 10000.00;
        float valorPlay5 = 5000.00f;
        boolean isPlay5Compravel = valorTotalContaCorrente >= valorPlay5 || valorTotalContaPoupanca >= valorPlay5;
        System.out.println(isPlay5Compravel);

        // ! inverte o valor lógico, ou seja, se for true retorna false e vice-versa
        boolean isChovendo = true;
        boolean isSol = !isChovendo;
        System.out.println("Está chovendo? " + isChovendo);
        System.out.println("Está sol? " + isSol);

    }
}
