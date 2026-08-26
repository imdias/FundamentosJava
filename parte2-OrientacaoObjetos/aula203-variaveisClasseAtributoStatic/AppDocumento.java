public class AppDocumento{
    public static void main(String args[]){
        Documento d1, d2, d3;

        d1 = new Documento(1, "Procuracao");
        d2 = new Documento(2, "Contrato");
        d3 = new Documento(3, "Peticao");

        d1.exibirDados();
        d1.setStatus(Documento.AGUARDANDO_AUTORIZACAO);
        d1.exibirDados();
    }
}