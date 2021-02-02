package core;

public class QuestaoMultiplaEscolha {
	
	protected String enunciado;
	protected String resposta;
	protected String aplicarQuestao;
	protected String alternativa1, alternativa2, alternativa3, alternativa4; 	
	protected Boolean corrigir;
	
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public String getAplicarQuestao() {
		return aplicarQuestao;
	}
	public void setAplicarQuestao(String aplicarQuestao) {
		this.aplicarQuestao = aplicarQuestao;
	}
	public String getAlternativa1() {
		return alternativa1;
	}
	public void setAlternativa1(String alternativa1) {
		this.alternativa1 = alternativa1;
	}
	public String getAlternativa2() {
		return alternativa2;
	}
	public void setAlternativa2(String alternativa2) {
		this.alternativa2 = alternativa2;
	}
	public String getAlternativa3() {
		return alternativa3;
	}
	public void setAlternativa3(String alternativa3) {
		this.alternativa3 = alternativa3;
	}
	public String getAlternativa4() {
		return alternativa4;
	}
	public void setAlternativa4(String alternativa4) {
		this.alternativa4 = alternativa4;
	}
	public Boolean getCorrigir() {
		return corrigir;
	}
	public void setCorrigir(Boolean corrigir) {
		this.corrigir = corrigir;
	}
	
	

}
