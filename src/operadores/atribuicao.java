package operadores;

public class atribuicao {
    public static void main(String[] args) {
        
        // = += -= *= /= %=

        double bonus = 1800.00;
        bonus += 1000.00;
        bonus -= 1000.00;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println("Bonus: " + bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        //colocando antes da variável, o incremento ou decremento é feito antes da variável ser usada, ou seja, é adicionado ou subtraído antes
        //de aparecer
        System.out.println("Contador: " + contador);

    }
}
