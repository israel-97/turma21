package Lista6;

public class BuscaAnimal {

	public static void main(String[] args) {
		
		Cachorro Pitchu = new Cachorro("PITCHU",3,true,"");
		Cavalo cavalo = new Cavalo("PÉ DE PANO",7,false,"");
		Preguica preguica = new Preguica("FLASH",1,true,"");
		
		
		System.out.println("MEU CACHORRO...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANOS, ELE É MUITO ESPULETA E ESTÁ SEMPRE A DIZER : %s\n",Pitchu.getNome(), Pitchu.getIdade(), Pitchu.emitirSom());
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("MEU CAVALO...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANOS, E ELE É MUITO ZOEIRO ESTÁ SEMPRE A DIZER : %s\n",cavalo.getNome(), cavalo.getIdade(), cavalo.emitirSom());
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("MINHA PREGUIÇA...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANOS, E ELA É MUITO PREGUIÇOSA ESTÁ SEMPRE A DIZER : %s\n",preguica.getNome(), preguica.getIdade(), preguica.emitirSom());
	}

}
