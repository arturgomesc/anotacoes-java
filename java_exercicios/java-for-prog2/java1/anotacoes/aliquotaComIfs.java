public class aliquotaComIfs {
    public static void main(String[] args) {
        double salario = 3000.0;

        if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A sua aliquota é de 7,5%\nPodes deduzir a 142 reais.");
        } else if (salario > 2800.0 && salario <= 3751.0){
            System.out.println("o IR é de 15% e pode deduzir R$ 350.");
        } else if (salario > 3751.0 && salario <= 4400.0) {
            System.out.println("o IR é de 22.5% e pode deduzir R$ 636.");
        } else {
            System.out.println("Voce ganha muito pouco ou muito demais!");
        }
    }
}
