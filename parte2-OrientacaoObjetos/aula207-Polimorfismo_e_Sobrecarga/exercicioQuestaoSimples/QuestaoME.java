public class QuestaoME extends QuestaoSimples{
	private String alternativa1;
	private String alternativa2;
	private String alternativa3;
	private String alternativa4;

	public QuestaoME(String e, String r, String a1, String a2, String a3, String a4){
		super(e,r);
		this.alternativa1 = a1;
		this.alternativa2 = a2;
		this.alternativa3 = a3;
		this.alternativa4 = a4;
	}

	public String aplicarQuestao(){
		return "P: " + super.enunciado + "\n" +
		       "   a) " + alternativa1 + "\n" +
		       "   b) " + alternativa2 + "\n" +
		       "   c) " + alternativa3 + "\n" +
		       "   d) " + alternativa4;
	}
}