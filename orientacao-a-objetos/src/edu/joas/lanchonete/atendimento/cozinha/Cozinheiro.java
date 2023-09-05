package edu.joas.lanchonete.atendimento.cozinha;

//  import edu.joas.lanchonete.atendimento.Atendente;

public class Cozinheiro {
    //pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
	}
	//pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCÃO");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		this.selecionarIngredientesLanche();
		this.lavarIngredientes();
		System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
	}
	private void prepararVitamina() {
		this.selecionarIngredientesVitamina();
		this.lavarIngredientes();
		this.baterVitaminaLiquidificador();
		System.out.println("PREPARANDO SUCO");
	}
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}
	public void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
	}
	
	void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
