package classes;

	public class Administrador extends Empregado {
		private double ajudaDeCusto;

		public double calcularSalario() {
	        return  this.ajudaDeCusto + (this.getSalarioBase() - this.getImposto());
	    }

		public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
				double imposto, double ajudaDeCusto) {
			super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
			this.ajudaDeCusto = ajudaDeCusto;
		}

		public double getAjudaDeCusto() {
			return ajudaDeCusto;
		}

		public void setAjudaDeCusto(double ajudaDeCusto) {
			this.ajudaDeCusto = ajudaDeCusto;
		}

	}

