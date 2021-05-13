package classes;

public class Historia extends Materia {

	public Historia(double nota, int faltas) {
		super(nota, faltas);	
	}
	@Override
	protected char engajamento() {
		if(super.getNota() >= 8.0 && super.getFaltas() <= 5) {
			return 'B'; //Ideia = retornar uma letra baseado na quantidade de faltas (por exemplo - B de Bom)
			//Aparece tudo
		}
		else if (super.getNota() >= 6.0 && super.getFaltas() <= 10) {
			return 'M';
			//Aparece +/-
		}
		else {
			return 'R';
			//Aparece nada
		}
	}
	
	@Override
	public void imprimirListaSugestoes() {
		if(engajamento() == 'B') {
			System.out.println("Seu engajamento est� bom. Lista de sugest�es a seguir nesta �rea: ");
			System.out.println("1 - Jornalismo       (x)");
			System.out.println("2 - Paleontologia    ( )");
			System.out.println("3 - Arqueologia      ( )");
			System.out.println("4 - Turismo          (x)");
			System.out.println("5 - Ci�ncia Sociais  ( )");
		}
		else if (engajamento() == 'M') {
			System.out.println("Seu engajamento est� m�dio. Lista de sugest�es a seguir nesta �rea: ");
			System.out.println("1 - Jornalismo       ( )");
			System.out.println("2 - Paleontologia    (x)");
			System.out.println("3 - Arqueologia      (x)");
			System.out.println("4 - Turismo          ( )");
			System.out.println("5 - Ci�ncia Sociais  (x)");
		}
		else {
			System.out.println("Seu engajamento est� ruim.");
			System.out.println("1 - Jornalismo       ( )");
			System.out.println("2 - Turismo          ( )");
			System.out.println("3 - Arqueologia      ( )");
			System.out.println("4 - Paleontologia    ( )");
			System.out.println("5 - Ci�ncia Sociais  ( )");
		}
	}
	

}

// ARQUEOLOGIA
// A arqueologia � a ci�ncia social que estuda o passado das civiliza��es humanas por meio dos vest�gios materiais deixados por elas, 
// sendo muito importante para a sociedade, pois resgata a hist�ria e a cultura dos antepassados. Ela come�ou ainda no s�culo XV com o h�bito 
// de colecionar rel�quias e antiguidades e, com o tempo, foi se tornando mais profissional e indispens�vel.


// PALEONTOLOGIA
// O instrumento principal de estudos de um paleont�logo s�o os f�sseis, que s�o restos e vest�gios de animais, plantas e outros seres vivos, 
// preservados em rochas, assim como ossos, rastros e pegadas que podem ser identificados em campos de escava��o e locais a c�u aberto. 
// H� demanda para aqueles que querem reconstituir o passado e passar os seus conhecimentos adiante para as novas gera��es.

// JORNALISMO
// O jornalista � o profissional respons�vel pela apura��o, investiga��o e apresenta��o de informa��es de interesse p�blico em forma de 
// not�cias, reportagens, artigos ou entrevistas.

// CI�NCIAS SOCIAIS
// Seu foco � na an�lise de movimentos e de conflitos sociais e na forma��o de opini�es e constru��o de identidades por meio da pesquisa 
// sobre h�bitos, costumes e as rela��es entre as pessoas tanto em grupos de interesses quanto na sociedade como um todo. Para isso, o  
// profissional elabora um conjunto de metodologias para analisar a coletividade e interpretar seus problemas culturais e pol�ticos.

// TURISMO
// O turism�logo � respons�vel por analisar e estudar o turismo em sua regi�o para planejar, organizar e gerenciar produtos e atividades 
// tur�sticas de todos os tipos. �reas em que se pode atuar, �Ag�ncia de Viagens, Ecoturismo, Hotelaria, Turismo de Neg�cios e etc�.
