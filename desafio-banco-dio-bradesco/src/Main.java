//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta("Jurema");
        Conta c2 = new Conta("Noronha");

        c1.depositar(200d);
        c1.depositar(10);


        //c1.imprimirExtrato();
        //c2.imprimirExtrato();

        c1.imprimirInfo();
        c2.imprimirInfo();





    }
}