package OrientaObjeto;
                    /*
                     * Crie uma classe funcion�rio e apresente os atributos e m�todos
					 * referentes esta classe, em seguida crie um objeto funcion�rio, defina as
					 * instancias deste objeto e apresente as informa��es deste objeto no
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
				             "\nPeso m�ximo suportado: "+capacidaMaxima+ " Kg";
		return getCompleto.toUpperCase();
	}
}
