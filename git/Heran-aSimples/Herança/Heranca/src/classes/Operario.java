package classes;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;

	//metodo que retorna o valor da comissao, pegando valores e multiplicando
	public double valorDaComissao() {
		return valorProducao * comissao;
	}

	//metodo para calcular o salario
	public double calcularSalario() {
		return valorDaComissao() + (this.getSalarioBase() - this.getImposto());
	}

	//metodo construtor
	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	
	//metodos get e set: para retornar e setar valores
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
