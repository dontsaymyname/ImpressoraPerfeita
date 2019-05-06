import java.util.ArrayList;
import java.util.List;

public class Impressora {

    private List<Imprimivel> listaDeImprimivel = new ArrayList();


    public void adicionarImprimivel(Imprimivel umImprimivel){

        listaDeImprimivel.add(umImprimivel);
    }

    public void imprimirTudo(){

        for (Imprimivel umImprimivel : listaDeImprimivel){
            umImprimivel.imprimir();
            System.out.println("________________________");
        }
    }


}
