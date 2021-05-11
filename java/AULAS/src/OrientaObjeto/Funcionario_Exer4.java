package OrientaObjeto;

public class Funcionario_Exer4 {
	public String nome;
	public String cpf;
	public char genero;
	public double salario;
	
	public Funcionario_Exer4 (String nome, String cpf, char genero, double salario )
	{
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
		this.salario = salario;	
	}
	
	public String getCompleto() 
	{
		String getCompleto = "Nome do funcionário: "+nome+"cpf: "+cpf+"Genero: "+genero+ " Salário: "+salario;
		return getCompleto.toUpperCase();
	}
	
}
