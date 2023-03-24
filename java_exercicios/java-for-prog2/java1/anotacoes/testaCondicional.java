public class testaCondicional {
    public static void main(String[] agrs) {
        System.out.println("Testando condicionais: \n");
        int idade = 16;
        int quantidade = 2;

        if(idade >= 18) {
            System.out.println("Maior de idade."); 
        } else {
            if (quantidade >= 2) {
                System.out.println("Pode entrar por estar acompanhado.");
            } else {
                System.out.println("Nao pode entrar.");
            }
        }
    }
}
