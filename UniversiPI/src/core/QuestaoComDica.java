package core;

public class QuestaoComDica {

	protected String enunciado;
	protected String resposta;
	protected String aplicarQuestao;
	protected String dica; 	
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
	public String getDica() {
		return dica;
	}
	public void setDica(String dica) {
		this.dica = dica;
	}
	public Boolean getCorrigir() {
		return corrigir;
	}
	public void setCorrigir(Boolean corrigir) {
		this.corrigir = corrigir;
	}

	
}
