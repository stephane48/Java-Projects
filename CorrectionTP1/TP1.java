import java.util.Scanner;

public class TP1 {

	public static void main(String[] args) {
		System.out.println("Entrer un nombre : \n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();

		System.out.println(affichageNombre(n));
		
		
		//Boucle pour tout vérifier
		System.out.println("\n\nVoici tous les nombres de 0 à 100 :\n");
		for(int i=0; i<100;i++ )
		{
			System.out.println(affichageNombre(i));	
		}
	}

	public static String affichageNombre(int n) {
		String[] tabdiz = { "","dix", "vingt", "trente", "quarante", "cinquante", "soixante", "soixante-dix",
				"quatre-vingt", "quatre-vingt-dix" };
		String[] tabunit = { "zero", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf" };
		String[] tabautre = { "","onze", "douze", "treize", "quatorze", "quinze", "seize" };

		int unite, diz;
		unite = n % 10;
		diz = n / 10;


		if(n==100) // Cas 100
			return "cent";
		else if(diz==0) // Nombres inférieurs à 10
			return tabunit[unite];
		else if(unite==0) // Nombres dont l'unité est 0
			return tabdiz[diz];
		else if(diz==1&&unite<=6) // Nombres entre 10 et 16
			return tabautre[unite];
		else if(unite==1) { // Nombres dont l'unité est 1
			if(diz==7)
				return tabdiz[diz-1]+" et "+tabautre[unite];
			else if(diz==8)
				return tabdiz[diz]+"-"+tabunit[unite];
			else if(diz==9)
				return tabdiz[diz-1]+"-"+tabautre[unite];				
			else
				return tabdiz[diz]+" et "+tabunit[unite];
		}
		else if(n==80) // 80
			return tabdiz[diz]+"s";
		else if((diz==7||diz==9)&&unite<=6) // 71 à 76 et 91 à 96
			return tabdiz[diz-1]+"-"+tabautre[unite];
		else // Tous les autres cas !
			return tabdiz[diz]+"-"+tabunit[unite];

		
	}

}
