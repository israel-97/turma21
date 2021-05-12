package Lista5;
                    /*
                     * Crie uma classe cliente e apresente os atributos e métodos referentes
					 * esta classe, em seguida crie um objeto cliente, defina as instancias deste
					 * objeto e apresente as informações deste objeto no console.
                     */
public class Cliente_Exerc1 {
	
	public String nome;
	public String cpf;
	public String dataNascimento;
	public char genero;
	
	public Cliente_Exerc1 (String nome, String cpf, String dataNascimento, char genero)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		
	}
	
	
	public String getCompleto() 
	{
		String getCompleto = "Nome do cliente: "+nome+"cpf: "+cpf+"Data de nascimento: "+dataNascimento+"Genero: "+genero;
		return getCompleto.toUpperCase();
	}
}
