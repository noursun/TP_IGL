package Application1;

//<<<<<<< HEAD
import java.util.ArrayList;

//=======
import Application1.TexteVideException;

/**
 * OutilsString est une classe qui contient plusieur m�thodes de traitement de chaine de caract�re
 * @author noursun et mimene
 * @version 1.0
 */
//>>>>>>> 8a990b5f8e1870d3232df57e339fd0a3887fa1e1
public class OutilsString {
	/**
	 * La m�thode frac, fractionne une cha�nes de caract�res avec un caract�re de s�paration
	 * 
	 * @param s
	 * 			le caract�re de s�paration
	 * 
	 * @param chaine
	 * 			la chaine � fractionner
	 * 
	 * @return
	 * 			un tableau de chaine
	 */
	public static String[] frac(char s,String chaine){

        ArrayList<String> nouvs = new ArrayList<String>();
		char r;
		String temp="";
		int i=0;
		while(i<chaine.length()){
			r=chaine.charAt(i);
			if(s==r){
				nouvs.add(temp);
				temp="";
				}		
			i++;
			temp= temp+ Character.toString(r) ;
		}
		return nouvs.toArray(new String[0]);
		
	}

	/**
	 * La m�thode MajMin, met en majuscule le premier caract�re d'une cha�nes de caract�res 
	 * et en minuscule la suite
	 * 
	 * @param chaine
	 * 				une chaine de caract�re
	 * 
	 * @return
	 * 		une chaine de caract�re
	 */
	public static String MajMin(String chaine){
		String nouv = "";
		int i=1;
		nouv=nouv+Character.toUpperCase(chaine.charAt(0));

		while(i<chaine.length()){
			nouv=nouv+Character.toLowerCase(chaine.charAt(i));
			i++;
		}
		
		return nouv;
	}

	/**
	 * La m�thode SuivLettre, remplace chaque caract�re d'une cha�nes de caract�res avec le 
	 * caract�re suivant
	 * 
	 * @param chaine
	 * 				une chaine de caract�re
	 * 
	 * @return
	 * 		une chaine de caract�re
	 */
	public static String SuivLettre(String chaine){
		int i=1;
		String suiv="";
			
		while(i<chaine.length()){
			suiv=suiv+chaine.charAt(i);
			i++;
		}
			
		return suiv;
	}

	

	
	/**
	 * La m�thode join, joind un tableau de cha�nes de caract�res avec un caract�re de s�paration
	 * dans ce cas le point_vergule.
	 * 
	 * @param tabStr
	 * 				le tableau qui contient les chaines de caract�re
	 * 
	 * @return 
	 * 				une chaine de caract�re qui contient toutes les chaines du tableau s�par�es deux � deux par un point_vergule.
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
	 * La m�thode noMotsVides, �limine les mots vides d�une cha�ne (ou, et, �, non).
	 * 
	 * @param str
	 * 				la chaine de caract�re � traiter
	 * @return
	 * 				une chaine de caract�re qui repr�sente str apr�s l'�limination des mots vides
	 */
	public static String noMotsVides(String str){
		
		/**
		 * la chaine qui contiendra le resultat.
		 */
		String strRes = "";
		/**
		 * la chaine dans la quelle on reccup�re un mot pour v�rifier si c'est un mot vide ou pas.
		 */
		String motVide = "";
		int i;
		
		for(i=0; i<str.length();i++){
			

			while((i < str.length()) && Character.isAlphabetic(str.charAt(i))){
				motVide = motVide + Character.toString(str.charAt(i));
				i++;	
			}
			
			if(!motVide.equals("ou") && !motVide.equals("et") && !motVide.equals("non") && !motVide.equals("�")){
							strRes = strRes + motVide;	
						}
			if(i < str.length())
				strRes = strRes + Character.toString(str.charAt(i));
			
			motVide = "";
		}
		
		return strRes;
	}
	
	/**
	 * la m�thode occrMot, calcule le nombre d'occurence d'un mot dans un texte.
	 * 
	 * @param texte
	 * 				un texte donn�.
	 * @param mot
	 * 				le mot que l'on doit trouver le nombre d'occurence dans le texte.
	 * @return
	 * 				le nombre d'occurende du mot.
	 * 
	 * @throws TexteVideException
	 * 				si le texte est vide elle g�n�re une exception.
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



