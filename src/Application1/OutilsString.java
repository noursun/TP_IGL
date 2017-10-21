package Application1;

import java.util.ArrayList;

public class OutilsString {
	
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

	public static String SuivLettre(String chaine){
		int i=1;
		String suiv="";
			
		while(i<chaine.length()){
			suiv=suiv+chaine.charAt(i);
			i++;
		}
			
		return suiv;
	}

	

}



