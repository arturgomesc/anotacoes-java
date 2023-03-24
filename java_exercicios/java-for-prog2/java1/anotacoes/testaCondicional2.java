public class testaCondicional2 {
    public static void main(String[] agrs) {
        System.out.println("Testando condicionais: \n");
        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        System.out.println("Valor acompanhado: " + acompanhado + "\n");

        if(idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo!"); 
        } else {
            System.out.println("Infelizmente nao podera entrar.");
        }
    }
}
