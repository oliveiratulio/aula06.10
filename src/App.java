public class App {
    public static void main(String[] args) throws Exception {
       CalcularImprimirConta(80, "Pedro");
       CalcularImprimirConta(50, "Andre");
       CalcularImprimirConta(30, "Tulio");
       CalcularImprimirConta(100, "Lara");

    }

    /**
     * @param conta
     * @param Nome
     */
    public static void CalcularImprimirConta(double conta, String Nome ){
        double gurjeta = conta * 0.1;
        double couvert = conta * 0.2;
        double total = conta + gurjeta + couvert;
        System.out.println("Discriminação conta do" + Nome);
        System.out.println("Total consumido R$" + conta);
        System.out.println("Gurjeta R$" + gurjeta);
        System.out.println("Couvert R$" + couvert);
        System.out.println("Total Geral do" + Nome + " R$ " + total);
        System.out.println("");
    }

}
