public class QuestaoSimples{
	protected String enunciado;
	protected String resposta;

	public QuestaoSimples(String e, String r){
		this.enunciado = e;
		this.resposta = r;
	}

	public String aplicarQuestao(){
		return "P: " + enunciado;
	}

	public boolean corrigir(String resposta){
		return this.resposta.equals(resposta);
	}
}