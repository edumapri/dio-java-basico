public class Exemplo002ClasseReturn {

    public static void main(String[] args) {

        String primeiroNome = "Eduardo";
        String segundoNome = "Oliveira Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método >> " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
