package utilitaire;

public class UtilitaireFichierLu {
	
	public static int retourneOccurenceCaractere(String chaineAnalysee,String delimiteur)
	{
		int count=0;
		for (int i=0; i<(chaineAnalysee.length()-delimiteur.length()); i++)
		{
			String subString = chaineAnalysee.substring(i, i+delimiteur.length());
            if (subString.equals(delimiteur)) 
            {
                count++;
            }
		}
		return count;
	}
}
