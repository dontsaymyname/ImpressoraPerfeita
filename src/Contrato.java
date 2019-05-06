public class Contrato extends NomeETipo implements Imprimivel{



    @Override
    public void imprimir() {

        System.out.println("Sou um contrato muito legal");
        imprimirDados();
    }


}
