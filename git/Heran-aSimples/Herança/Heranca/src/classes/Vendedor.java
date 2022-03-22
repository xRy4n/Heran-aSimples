package classes;

public class Vendedor extends Empregado {
	
	private double valorVendas;
	private double comissao;

	//metodo que retorna o valor da comissão
	public double valorDaComissao() {
		return valorVendas * comissao;
	}
	//metodo para calcular o salario
	public double calcularSalario() {
		return valorDaComissao() + (this.getSalarioBase() - this.getImposto());
	}
	//metodo construtor 
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	//metodo get para retornar valores
	public double getValorVendas() {
		return valorVendas;
	}
	//metodo set para setar valores 
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
