package Lista6;

public class BuscaAnimal {

	public static void main(String[] args) {
		
		Animal Pitchu = new Cachorro("PITCHU",3,true);
		Animal cavalo = new Cavalo("P� DE PANO",7,true);
		Animal preguica = new Preguica("FLASH",1,true);
		
		
		System.out.println("MEU CACHORRO...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANOS, E ELE � MUTO ESPULETA EST� SEMPRE A DIZER : %s\n",Pitchu.getNome(), Pitchu.getIdade(),Pitchu.emitaSom());
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("MEU CAVALO...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANOS, E ELE � MUITO ZOEIRO EST� SEMPRE A DIZER : %s\n",cavalo.getNome(), cavalo.getIdade(), cavalo.emitaSom());
		
		System.out.println("----------------------------------------------------------------------------------");
		
		System.out.println("MINHA PREGUI�A...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANO, E ELA � MUITO PREGUI�OSA EST� SEMPRE A DIZER : %s\n",preguica.getNome(), preguica.getIdade(), preguica.emitaSom());
	}

}
