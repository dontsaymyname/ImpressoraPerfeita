public class Teste {

    public static void main(String[] args) {

        Foto foto = new Foto();
        foto.setNome("Nome: Viagem");
        foto.setTipo("Tipo: JPEG");

        Contrato contrato = new Contrato();
        contrato.setNome("Nome: Contrato da Padaria");
        contrato.setTipo("Tipo: PDF");

        Documento documento = new Documento();
        documento.setNome("Nome: Trabson de Matemática");
        documento.setTipo("Tipo: doc");

        Impressora impressora = new Impressora();

        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(foto);
        impressora.adicionarImprimivel(documento);
        impressora.imprimirTudo();

    }


}
