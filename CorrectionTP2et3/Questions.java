import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {

		// Exécution des différentes questions
		question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
//		question7();
//		question8();
//		question9();
//		question10();
//		question11();
//		question12();
//		question13();
//		question14();
//		question15();
//		question16();
//		question17();
//		question18();
//		question19();
//		question20();
	}

	public static void question1() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Entrez une valeur : ");
		int num1 = scan.nextInt();
		System.out.print("Entrez une autre valeur : ");
		int num2 = scan.nextInt();
		if (num2 != 0)
			System.out.print("Le reslutat de la division est : " + (double) num1 / num2);
		else
			System.out.print("Erreur - Pas de division par 0");
	}

	public static void question2() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Entrez un prix hors taxe : ");
		double prixHT = scan.nextDouble();
		System.out.print("Le prix TTC : " + 1.2 * prixHT);
	}

	public static void question3() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Entrez une valeur : ");
		double num1 = scan.nextDouble();
		System.out.print("Entrez une autre valeur : ");
		double num2 = scan.nextDouble();
		if (num1 > num2)
			System.out.println("Les nombres sont dans l'ordre décroissant");
		else
			System.out.println("Les nombres ne sont pas dans l'ordre décroissant");
	}

	public static void question4() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Entrez le nombre de photocopies ");
		int nbr = scan.nextInt();
		double prix;
		if (nbr <= 10) {
			prix = nbr * 0.1;
		} else if (nbr <= 30) {
			prix = 1 + (nbr - 10) * 0.09;
		} else {
			prix = 2.8 + (nbr - 30) * 0.08;
		}
		System.out.println("Prix total : " + prix + " euros");
	}

	public static void question5() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Quel est l'age de votre enfant ? ");
		int age = scan.nextInt();
		switch (age) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 15:
		case 16:
		case 17:
			System.out.println("Aucune catégorie");
			break;
		case 6:
		case 7:
			System.out.println("Poussin");
			break;
		case 8:
		case 9:
			System.out.println("Pupille");
			break;
		case 10:
		case 11:
			System.out.println("Minime");
			break;
		case 12:
		case 13:
			System.out.println("Cadet");
			break;
		default:
			System.out.println("Pas un enfant");
		}
	}

	public static void question6() {
		double num1 = Math.random();
		double num2 = Math.random();
		double num3 = Math.random();
		if (num1 < num2 && num2 < num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
		} else if (num1 < num3 && num3 < num2) {
			System.out.println(num1 + " " + num3 + " " + num2);
		} else if (num2 < num1 && num1 < num3) {
			System.out.println(num2 + " " + num1 + " " + num3);
		} else if (num2 < num3 && num3 < num1) {
			System.out.println(num2 + " " + num3 + " " + num1);
		} else if (num3 < num1 && num1 < num2) {
			System.out.println(num3 + " " + num1 + " " + num2);
		} else {
			System.out.println(num3 + " " + num2 + " " + num1);
		}
	}

	public static void question7() {
		int num = 50 + (int) (Math.random() * 50);
		System.out.println("Racine carrée : " + Math.sqrt(num));
		System.out.println("Carré : " + Math.pow(num, 2));
	}

	public static void question8() {
		boolean[] t = new boolean[3];
		int j = 0;
		for (int i = 0; i < 3; i++) {
			t[i] = (Math.random() >= 0.5);
			if (t[i])
				j++;
		}
		System.out.println("Nombre de variables vraies : " + j);
	}

	public static void question9() {
		Scanner scan = new Scanner(System.in);
		System.out.print("coordonnée x : ");
		double x = scan.nextDouble();
		System.out.print("coordonnée y : ");
		double y = scan.nextDouble();
		if(x>=7&&x<=10&&y>=2&&y<=10)
			System.out.println("Le point appartient au rectangle");
		else
			System.out.println("Le point n'appartient pas au rectangle");
	}

	public static void question10() {
		double x = (-10 + (Math.random() * (20)));
		double y = (-10 + (Math.random() * (20)));
		if ((x - 5) * (x - 5) + (y - 5) * (y - 5) <= 25)
			System.out.println("Le point appartient au cercle");
		else
			System.out.println("Le cercle n'appartient pas au cercle");
	}

	public static void question11() {
		Scanner scan = new Scanner(System.in);
		int num;
		int i=0;
		do {
			System.out.print("Entrez un nombre : ");
			num = scan.nextInt();
			i++;
		}while (num < 100 || num >= 200);
		System.out.println("Le nombre est : " + num + " et vous avez eu besoin de " + i + " tentatives");
	}

	public static void question12() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entrez une valeur : ");
		double a = scan.nextDouble();
		System.out.print("Entrez une autre valeur : ");
		int b = scan.nextInt();
		System.out.println("Le resultat 1 est : " + Math.pow(a, b));
		double p = 1;
		for (int i = 0; i < b; i++) {
			p = p * a;
		}
		System.out.println("Le resultat 2 est : " + p);

	}

	public static void question13() {
		int sum = 0;
		for (int i = 0; i <= 1000; i = i + 2) {
			if (i % 10 != 0)
				sum = sum + i;
		}
		System.out.println("Le résultat est :" + sum);
	}

	public static void question14() {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.print("Entrez un nombre entre 1 et 9 : ");
		num = scan.nextInt();			
		}while (num < 1 || num > 9);

		for (int i = 0; i < 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

	}

	public static void question15() {
		Scanner scan = new Scanner(System.in);
		int num = (int)(10 + (Math.random() * (100 - 10)));
		System.out.println("Deviner le nombre entre 10 et 100 !");
		System.out.print("Donnez un nombre : ");
		int num1 = scan.nextInt();
		int a=6;
		while ((num != num1) && a > 0) {
			a--;
			if (num < num1) {
				System.out.println("Trop haut");
			} else {
				System.out.println("Trop bas");
			}
			System.out.println("Il vous reste : " + a + " tentatives");
			System.out.print("Donnez un autre nombre : ");
			num1 = scan.nextInt();
		}
		if (a==0)
			System.out.println("Vous avez gagné.");
		else
			System.out.println("Vous avez perdu.");

	}

	public static void question16() {
		int capital = 1000;
		int i=0;
		while(capital<=2000) {
			capital*=1.03;
			i++;
		}
		System.out.println("Nombre d'années : "+i);
	}

	public static void question17() {
		Scanner scan = new Scanner(System.in);
		int n;
		do {
		System.out.println("Taille de la matrice ?");
		n = scan.nextInt();
		}while(n<5||n>10);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println("");
		}
	}

	public static void question18() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entrez un nombre : ");
		int num = scan.nextInt();
		int i=num+1;
		boolean trouve=false;
		while(!trouve) {
			int d = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					d = d + 1;
			}
			if (d == 2)
				trouve=true;
			i++;
		}
		System.out.println("Le plus petit nombre premier supérieur à " + num + " est " + i);
	}

	public static void question19() {
		int c = 0;
		int i=0;
		System.out.print("Les 3 premiers nombres parfaits sont : ");
		while(c<3) {
			i++;
			int sumd = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					sumd = sumd + j;
			}
			if (sumd == i) {
				c++;
				System.out.print(i);
				if (c == 1)
					System.out.print(" , ");
				if (c == 2)
					System.out.print(" et ");
				if (c == 3) {
					System.out.print(".");
					break;
				}
			}
		}

	}

	public static void question20() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Entrer un nombre : ");
		int n = scan.nextInt();
		int[][] tab = new int[n][n];
		for (int i = 1; i < n; i++) {
			tab[0][i] = 0;
		}
		for (int i = 0; i < n; i++) {
			tab[i][0] = 1;
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				tab[i][j] = (tab[i - 1][j - 1] + tab[i - 1][j]);
			}
		}
		System.out.println("Triangle de PASCAL");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(tab[i][j]!=0)
					System.out.print(tab[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
