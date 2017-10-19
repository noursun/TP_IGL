package Application1;

import Application1.TexteVideException;

/**
 * OutilsString est une classe qui contient plusieur méthodes de traitement de chaine de caractère
 * @author noursun et
 * @version 1.0
 */
public class OutilsString {

	
	/**
	 * La méthode join, joind un tableau de chaînes de caractères avec un caractère de séparation
	 * dans ce cas le point_vergule.
	 * 
	 * @param tabStr
	 * 				le tableau qui contient les chaines de caractère
	 * 
	 * @return 
	 * 				une chaine de caractère qui contient toutes les chaines du tableau séparées deux à deux par un point_vergule.
	 */
	public static String join(String[] tabStr){
		
		int i;
		/**
		 * la chaine qui contiendra le resultat.
		 */
		String strRes = "";
		
		if ((tabStr != null) &&(tabStr.length > 0)){
			
			strRes = tabStr[0];
			
			for (i=1; i < tabStr.length; i++)
				strRes = strRes + ';' + tabStr[i];
		}
		return strRes;
	}

	/**
	 * La méthode noMotsVides, élimine les mots vides d’une chaîne (ou, et, à, non).
	 * 
	 * @param str
	 * 				la chaine de caractère à traiter
	 * @return
	 * 				une chaine de caractère qui représente str après l'élimination des mots vides
	 */
	public static String noMotsVides(String str){
		
		/**
		 * la chaine qui contiendra le resultat.
		 */
		String strRes = "";
		/**
		 * la chaine dans la quelle on reccupère un mot pour vérifier si c'est un mot vide ou pas.
		 */
		String motVide = "";
		int i;
		
		for(i=0; i<str.length();i++){
			

			while((i < str.length()) && Character.isAlphabetic(str.charAt(i))){
				motVide = motVide + Character.toString(str.charAt(i));
				i++;	
			}
			
			if(!motVide.equals("ou") && !motVide.equals("et") && !motVide.equals("non") && !motVide.equals("à")){
							strRes = strRes + motVide;	
						}
			if(i < str.length())
				strRes = strRes + Character.toString(str.charAt(i));
			
			motVide = "";
		}
		
		return strRes;
	}
	
	/**
	 * la méthode occrMot, calcule le nombre d'occurence d'un mot dans un texte.
	 * 
	 * @param texte
	 * 				un texte donné.
	 * @param mot
	 * 				le mot que l'on doit trouver le nombre d'occurence dans le texte.
	 * @return
	 * 				le nombre d'occurende du mot.
	 * 
	 * @throws TexteVideException
	 * 				si le texte est vide elle génère une exception.
	 */
	public static int occrMot(String texte,String mot) throws TexteVideException{
		
		int res = 0;
		int indice ;
		
		if(texte == null)
			throw new TexteVideException();
		
		if(texte.length() ==0)
			throw new TexteVideException();
		
		while((indice = texte.indexOf(mot)) >= 0){
			
			res++;
			texte = texte.substring(indice + mot.length(), texte.length() - 1);
		}
		
		return res;
	}
	
}
