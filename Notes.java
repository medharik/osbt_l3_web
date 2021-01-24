package pac_bases;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Notes {
public static void main(String[] args) {
	Scanner clavier =new Scanner(System.in);
	System.out.println("Entrer le nombre de notes : ");
	int nombreNote=clavier.nextInt();
	double []t={12,15,8};

	
	double notes[]=new double[nombreNote];
	int coeficient[]=new int[nombreNote];
	double somme=0,sommeCoef = 0;
	for (int i = 0; i < notes.length; i++) {
		boolean noteValide,coeficientValide;
		int cptErreur=3;	

		do{
		
		System.out.println("Entrer la note numero "+(i+1));
		notes[i]=clavier.nextDouble();	
		 noteValide=(notes[i]>=0 && notes[i]<=20);	
		if (!noteValide) {
			System.out.println("Note incorrecte, il vous reste "+--cptErreur+" Essai(s)");
		if(cptErreur==0){
			System.out.println("Arret du programme");
			return;
		}
		}
		}while(!noteValide);
	cptErreur=3;
		do{
			
			System.out.println("Entrer son coeficient ");
			coeficient[i]=clavier.nextInt();	
			 coeficientValide=(coeficient[i]>=2 && coeficient[i]<=5);	
			if (!coeficientValide) {
				System.out.println("Coeficient incorrect, il vous reste "+--cptErreur+" Essai(s)");
			if(cptErreur==0){
				System.out.println("Arret du programme");
				return;
			}
			}
			}while(!coeficientValide);
			
		
		
		
		
		
		somme+=notes[i]*coeficient[i];//somme=somme+notes[i]
		sommeCoef+=coeficient[i];
		
	}
	double moyenne =somme/sommeCoef;
	System.out.println("la moyenne est "+moyenne );
	
	// peupler une matrice contenant les notes et les coeficients
	double matrice[][]=new double[2][nombreNote];
	//for (int i = 0; i < matrice.length; i++) {//matrice.length=2
//		System.out.println("Saisie des "+nombreNote+" notes");
			for (int j = 0; j < matrice[0].length; j++) {
				matrice[0][j]=notes[j];
				matrice[1][j]=coeficient[j];
				
			}
			
	//}
	
//	System.out.println("le contenu de la matrice note/coef est : "+Arrays.asList(matrice));
	
	//for (int i = 0; i < matrice.length; i++) {
		for (int j = 0; j < matrice[0].length; j++) {
			double notesM[]=matrice[0];
			double coef[]=matrice[1];
			System.out.println(" Note "+notesM[j]);
			System.out.println(" Coef "+coef[j]);
		}
	//}
	
	
	
}
}
