public class AppDocumento {
    public static void main(String[] args) {
        Documento d1, d2, d3;

        d1 = new Documento(1, "Procuracao");
        d2 = new Documento(2, "Contrato");
        d3 = new Documento(3, "Peticao");

        d1.exibirDados();
        d1.setStatus(Documento.AGUARDANDO_AUTORIZACAO);
        d1.exibirDados();

        d2.exibirDados();
        d3.exibirDados();
    }
}

class Documento {
    public static final String AGUARDANDO_AUTORIZACAO = "Aguardando autorizacao";
    public static final String AUTORIZADO = "Autorizado";
    public static final String REJEITADO = "Rejeitado";

    private int id;
    private String tipo;
    private String status;

    public Documento(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        this.status = AGUARDANDO_AUTORIZACAO;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
    }
}