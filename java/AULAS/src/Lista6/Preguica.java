package Lista6;

public class Preguica extends Animal{
	
	private boolean subir;
	
	public Preguica(String nome, int idade, boolean subir) {
		super(nome, idade);
		this.subir = subir;
	}


	public boolean isSubir() {
		System.out.println("ESTÁ SUBINDO...");
		return subir;
	}

	public void setSubir(boolean subir) {
		this.subir = subir;
	}

	@Override
	public String emitaSom ()
	{
		super.setSom("Hmmm Hmmm");
		return super.getSom();
	}
	
}
