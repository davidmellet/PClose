package user;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.MatriceItemSet;
import utilitaire.UtilitaireFichierLu;

public class test {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		String filePath = "C:\\Users\\david\\workspace\\GestionEtudiant\\projetFDD\\src\\user\\data.txt";
		//String filePath ="/home/m1gil/melledav/workspace/projetFdd/src/user/data.txt";
		String dataLu = "";
		int compteurLigne = 0;
		int compteurPipe = 0;
		int nbPipeMax = 0;
		
		Scanner scanner;
		scanner = new Scanner(new File(filePath));
		
	    //if (scanner.hasNext()){dataLu = scanner.next();}
		while (scanner.hasNext())
		{
			dataLu = scanner.next();
			compteurPipe= UtilitaireFichierLu.retourneOccurenceCaractere(dataLu, "|");
				if (compteurPipe>nbPipeMax){nbPipeMax=compteurPipe;}
			compteurLigne ++;
			System.out.println("donnees Lues :" + dataLu);	
		}
		
		
		System.out.println("nb de lignes :" + compteurLigne);
		System.out.println("nb de colonnes :" + nbPipeMax);
		
		// on détermine la ligne qui contient le plus de pipe
		// quantité-1 de pipes donne le nombre d'item
		
		
		
		//MatriceItemSet matriceItemSet = new MatriceItemSet(compteurLigne);
		//System.out.println(dataLu);		
		
	}

}
