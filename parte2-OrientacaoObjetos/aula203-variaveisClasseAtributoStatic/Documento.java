public class Documento{
    private int id;
    private String nome;
    private int status;

    public static final int NOVO_DOCUMENTO = 0;
    public static final int EM_PROCESSAMENTO = 1;
    public static final int AGUARDANDO_AUTORIZACAO = 2;
    public static final int FINALIZADO = 3;

    public Documento(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.status = NOVO_DOCUMENTO;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void exibirDados(){
        System.out.println(id + "." + nome + "(" + status + ")");
    }
}