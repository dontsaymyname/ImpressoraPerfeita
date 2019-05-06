public class Foto extends NomeETipo implements Imprimivel {



    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie");
        imprimirDados();
    }


}
