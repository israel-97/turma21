package Lista6;

public class Cachorro extends Animal {

    private boolean correr;

	public Cachorro(String nome, int idade, boolean correr) {
		super(nome, idade);
		this.correr = correr;
	}

	

	public boolean isCorrer() {
		return correr;
	}



	public void setCorrer(boolean correr) {
		this.correr = correr;
	}



	@Override
	public String emitaSom ()
	{
		super.setSom("Au Au");
		return super.getSom();
	}
}
     
	
	
