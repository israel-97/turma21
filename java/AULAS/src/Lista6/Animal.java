package Lista6;

public abstract class Animal {
	private String nome;
	private int idade;
	protected String som;
	
	

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}


	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public  String  emitaSom () {
		som = " Emitir som " ;
		return som;
	}

	}


    
	
	


