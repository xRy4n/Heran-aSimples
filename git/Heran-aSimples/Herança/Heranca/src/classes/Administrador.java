package classes;

	public class Administrador extends Empregado {
		private double ajudaDeCusto;

		//Metodo para calcular salario
		public double calcularSalario() {
	        return  this.ajudaDeCusto + (this.getSalarioBase() - this.getImposto());
	    }
		//Metodo construtor
		public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
				double imposto, double ajudaDeCusto) {
			super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
			this.ajudaDeCusto = ajudaDeCusto;
		}
		//Metodos get e set para: retornar e setar valores
		public double getAjudaDeCusto() {
			return ajudaDeCusto;
		}

		public void setAjudaDeCusto(double ajudaDeCusto) {
			this.ajudaDeCusto = ajudaDeCusto;
		}

	}

