public class Documento extends NomeETipo implements Imprimivel {

    @Override
    public void imprimir() {

        System.out.println("Sou um documento Word");
        imprimirDados();
    }


}
