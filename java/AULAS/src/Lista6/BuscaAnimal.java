package Lista6;

public class BuscaAnimal {

	public static void main(String[] args) {
		
		Animal Pitchu = new Cachorro("PITCHU",3,true);
		Animal cavalo = new Cavalo("PÉ DE PANO",7,true);
		Animal preguica = new Preguica("FLASH",1,true);
		
		
		System.out.println("MEU CACHORRO...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANOS, E ELE É MUTO ESPULETA ESTÁ SEMPRE A DIZER : %s\n",Pitchu.getNome(), Pitchu.getIdade(),Pitchu.emitaSom());
		
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("MEU CAVALO...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANOS, E ELE É MUITO ZOEIRO ESTÁ SEMPRE A DIZER : %s\n",cavalo.getNome(), cavalo.getIdade(), cavalo.emitaSom());
		
		System.out.println("----------------------------------------------------------------------------------");
		
		System.out.println("MINHA PREGUIÇA...");
		System.out.printf("QUE SE CHAMA %s, TEM %d ANO, E ELA É MUITO PREGUIÇOSA ESTÁ SEMPRE A DIZER : %s\n",preguica.getNome(), preguica.getIdade(), preguica.emitaSom());
	}

}
