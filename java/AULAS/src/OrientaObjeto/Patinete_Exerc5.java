package OrientaObjeto;
                    /*
                     * Crie uma classe funcionário e apresente os atributos e métodos
					 * referentes esta classe, em seguida crie um objeto funcionário, defina as
					 * instancias deste objeto e apresente as informações deste objeto no
					 * console.
                     */
public class Patinete_Exerc5 {
	
	public String modelo;
	public String rodasRolamento;
	public String cor;
	public double altura;
	public double capacidaMaxima;
	
	public Patinete_Exerc5 (String modelo, String rodasRolamento, String cor, double altura, double capacidaMaxima)
	{
		this.modelo=modelo;
		this.rodasRolamento=rodasRolamento;
		this.cor=cor;
		this.altura=altura;
		this.capacidaMaxima=capacidaMaxima;
	}
	public String getCompleto() 
	{
		String getCompleto = "Modelo: "+modelo+"Calibragem das rodas: "+rodasRolamento+"cor do patinete: "+cor+ "Altura: "+altura+" Metros"+
				             "\nPeso máximo suportado: "+capacidaMaxima+ " Kg";
		return getCompleto.toUpperCase();
	}
}
