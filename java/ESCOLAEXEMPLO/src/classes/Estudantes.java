package classes;

public abstract class Estudantes {
	//atributos
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	private String nome;
	
	//construtores
    public Estudantes(int matricula, String cpf, double pontos, boolean status, String nome) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
		this.nome = nome;
		
	}
	//encapsulamento - getters and setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getPontos() {
		return pontos;
	}
	
	/*
	 * public void setPontos(double pontos) {
	 *this.pontos = pontos;
	 */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	//metodos
	public void adicionarNota(double pontos) {
		this.pontos = this.pontos + pontos;
	}
	public void tirarNotas(double pontos) {
		this.pontos = this.pontos - pontos;
	}
}
