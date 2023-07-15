package edu.tipos_variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {

        byte idade = 123;
        short ano = 2023;
        int cep = 05366150;
        long cpf = 29853584855;
        float valorPi = 3.14F;
        double salario = 1275.33;

        /*
         * esta linha é considerada como declaração de variável iniciamos a existência
         * variavel numero com valor 5 regra: tipo + nome + valor
         */
        int numero = 5;

        /*
         * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
         * não é mais necessário, pois a variável já foi declarada anteriormente
         */
        numero = 10;
        System.out.println(numero);

        /*
         * ao usar a palavra reservada final, você determina que jamais
         * esta variavel poderá obter outro valor;
         * isso é considerado uma CONSTANTE na linguagem Java
         */
        final double PI = 3.1415;

    }
}
