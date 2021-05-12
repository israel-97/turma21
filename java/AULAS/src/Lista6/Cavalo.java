package Lista6;

public class Cavalo extends Animal{
	
    private boolean correr;
    
	
	
	public Cavalo(String nome, int idade, boolean correr) {
		super(nome, idade);
		this.correr = correr;
	}
	

	public boolean isCorrer() {
		System.out.println("ESTÁ CORRENDO...");
		return correr;
	}


	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

	@Override
	public String emitaSom ()
	{
		super.setSom("Hiin in in");
		return super.getSom();
	}
}
