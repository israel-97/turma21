package Lista6;

public class BuscaAnimal {

	public static void main(String[] args) {
		
		Cachorro Pitchu = new Cachorro("PITCHU",3,true,"");
		Cavalo cavalo = new Cavalo("P� DE PANO",7,false,"");
		Preguica preguica = new Preguica("FLASH",1,true,"");
		
		
		System.out.println("MEU CACHORRO...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANOS, ELE � MUITO ESPULETA E EST� SEMPRE A DIZER : %s\n",Pitchu.getNome(), Pitchu.getIdade(), Pitchu.emitirSom());
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("MEU CAVALO...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANOS, E ELE � MUITO ZOEIRO EST� SEMPRE A DIZER : %s\n",cavalo.getNome(), cavalo.getIdade(), cavalo.emitirSom());
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("MINHA PREGUI�A...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANOS, E ELA � MUITO PREGUI�OSA EST� SEMPRE A DIZER : %s\n",preguica.getNome(), preguica.getIdade(), preguica.emitirSom());
	}

}
