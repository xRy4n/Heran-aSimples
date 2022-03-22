package classes;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;

	public double valorDaComissao() {
		return valorProducao * comissao;
	}

	public double calcularSalario() {
		return valorDaComissao() + (this.getSalarioBase() - this.getImposto());
	}

	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

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
