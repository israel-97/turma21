package classes;
              /*
               * Solicitar ao final dos 10 movimentos ou ao pedido de sair se o mesmo deseja solicitar 
               * impressão do boletim, limitando em apenas 3 emissões no mês.
               * 
               */
public class Medio extends Estudantes {
	
	private int contadorBoletim;
	
	public Medio(int matricula, String cpf, double pontos, boolean status, String nome) {
		super(matricula, cpf, pontos, status, nome);
		// TODO Auto-generated constructor stub
	}

	public int getSolicitarBoletim() {
		return contadorBoletim;
	}

	public void setSolicitarBoletim(int contadorBoletim) {
		this.contadorBoletim = contadorBoletim;
	}
    public boolean pedirBoletim() {
    	if (contadorBoletim < 3 ) {
    		return true;
    	
    	}else {
    		return false;
    	}

    }
	
	

	
	
}
