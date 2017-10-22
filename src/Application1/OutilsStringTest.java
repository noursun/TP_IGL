package Application1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Application1.OutilsString;
import Application1.TexteVideException;

/**
 * La classe OutilsStringTest permet de tester les méthodes de la classe OutilsString.
 * @author noursun et
 * @version 1.0
 */
public class OutilsStringTest {

	@Test
//<<<<<<< HEAD
	/**
	 * La méthode testFracVrai, verifie si la chaine est fractionnée
	 */
	public void testFracVrai() {
		String chaine="imeimen";
		char  s='i';
		String[] essai=OutilsString.frac(s,chaine);
		Boolean bool=true;
		if (essai[0]!="ime") bool=false;
		if (essai[1]!="imen") bool=false;
		if(bool==true)fail("Resulat vrai pour frac avec separateur");
	}
	
	public void testFracF() {
		String chaine="imeimen";
		char  s='a';
		String[] essai=OutilsString.frac(s,chaine);
		Boolean bool=true;
		if (essai[0]!="imeimene") bool=false;
		if(bool==true)fail("Resulat vrai pour frac avec separateur non existant");
	}
//=======
	/**
	 * le test de la méthode join.
	 */
	public void testJoin() {
		
		/**
		 * cas1: tabStr.length > 2.
		 */
		
		String[] tabStr = new String[]{"je","tu","il/elle","nous","vous","ils/elles"};
		String strRes = OutilsString.join(tabStr);
		if(! strRes.equals("je;tu;il/elle;nous;vous;ils/elles"))
			fail("taille du tableau > 2 .");
		
		/**
		 * cas2: tabStr.length = 2.
		 */
		
		tabStr = new String[]{"je","tu"};
		strRes = OutilsString.join(tabStr);
		if(! strRes.equals("je;tu"))
			fail("taille du tableau = 2 .");
		
		/**
		 * cas3: tabStr.length = 1.
		 */
		
		tabStr = new String[]{"je"};
		strRes = OutilsString.join(tabStr);
		if(! strRes.equals("je"))
			fail("taille du tableau = 1 .");
		
		/**
		 * cas4: tabStr.length = 0.
		 */
		
		tabStr = new String[0];
		strRes = OutilsString.join(tabStr);
		if(! strRes.equals(""))
			fail("taille du tableau = 0 .");
		
		/**
		 * cas5: tabStr = null.
		 */
		
		tabStr = null;
		strRes = OutilsString.join(tabStr);
		if(! strRes.equals(""))
			fail("référence du tableau = null .");
	}

	@Test
	/**
	 * le test de la méthode noMotsVides.
	 */
	public void testNoMotsVides() {
		
		/**
		 * cas1: ou au milieu.
		 */
		
		String str = "Vous préferez prendre le train ou la voiture, ou bien prendre le bus.";
		String strRes = OutilsString.noMotsVides(str);
		if(!strRes.equals("Vous préferez prendre le train  la voiture,  bien prendre le bus."))
			fail("ou au milieu");
		
		/**
		 * cas2: ou à la fin.
		 */
		
		str = "Tu veux du pain ou";
		strRes = OutilsString.noMotsVides(str);
		if(!strRes.equals("Tu veux du pain "))
			fail("ou à la fin");
		
		/**
		 * cas3: ou au début.
		 */
		
		str = "ou quoi?";
		strRes = OutilsString.noMotsVides(str);
		if(!strRes.equals(" quoi?"))
			fail("ou à la fin");
		
		/**
		 * cas4: à au milieu.
		 */
		
		str = "Vous étiez à l'école. J'était à l'univercité.";
		strRes = OutilsString.noMotsVides(str);
		if(!strRes.equals("Vous étiez  l'école. J'était  l'univercité."))
			fail("à au milieu");
		
		/**
		 * cas5: à à la fin.
		 */
		
		str = "tu va à";
		strRes = OutilsString.noMotsVides(str);
		if(!strRes.equals("tu va "))
			fail("à à la fin");
		
		/**
		 * cas6: à au début.
		 */
		
		str = "à quoi sert-il ?";
		strRes = OutilsString.noMotsVides(str);
		if(!strRes.equals(" quoi sert-il ?"))
			fail("à au début.");
		
		/**
		 * cas7: les 4 au meme temps.
		 */

		str = "Demai j'irrai à l'école ou pas, et après demaim, non j'y irrai pas.";
		strRes = OutilsString.noMotsVides(str);
		if(!strRes.equals("Demai j'irrai  l'école  pas,  après demaim,  j'y irrai pas."))
			fail("les 4 au meme temps.");
	}

	
	/**
	 * le test de la méthode occrMot.
	 * @throws TexteVideException 
	 */
	@Test (expected = TexteVideException.class)
	public void testOccrMot() throws TexteVideException {
		
		/**
		 * cas1: nbOcc > 1.
		 */
		
		String texte = "je m'appele Nour elle houda et je suis étudiante à l'Esi, je m'appele Nour elle houda et je suis étudiante à l'Esi";
		String mot = "je";
		int nbOccur;
		
		nbOccur = OutilsString.occrMot(texte, mot); 
		if(nbOccur != 4)
			fail("le nombre d'occurence du mot est > 1");
		
		/**
		 * cas2: nbOcc = 1.
		 */
		
		texte = "je m'appele Nour elle houda";
		mot = "je";
		nbOccur = OutilsString.occrMot(texte, mot); 
		if(nbOccur != 1)
			fail("le nombre d'occurence du mot est > 1");
		
		/**
		 * cas3: le mot n'existe pas.
		 */
		
		texte = "je m'appele Nour elle houda";
		mot = "tu";
		nbOccur = OutilsString.occrMot(texte, mot); 
		if(nbOccur != 0)
			fail("le nombre d'occurence du mot est > 1");
		
		/**
		 * cas4: le texte est vide/null.
		 */
		
		texte = "";
		mot = "tu";
		nbOccur = OutilsString.occrMot(texte, mot);
		
		texte = null;
		nbOccur = OutilsString.occrMot(texte, mot);
		
		/**
		 * cas5: le mot est vide.
		 */
		
		texte = "je m'appele Nour elle houda";
		mot = "";
		nbOccur = OutilsString.occrMot(texte, mot); 
		if(nbOccur != 0)
			fail("le mot est vide.");
		
		mot = null;
		nbOccur = OutilsString.occrMot(texte, mot); 
		if(nbOccur != 0)
			fail("@ mot est null.");
//>>>>>>> 8a990b5f8e1870d3232df57e339fd0a3887fa1e1
	}

	/**
	 * La méthode testFracVrai, verifie si la chaine est fractionnée
	 */
	
	/**
	 * La méthode testMajMinEqualVrai, verifie si elle met la première lettre de la chaine est 
	 * mise en majuscule et la suite est mise en minuscule
	 */
	@Test
	public void testMajMinEqualVrai() {
		String s="j'ai Le  Droit99", att="J'ai le  droit99",res="";
		res=OutilsString.MajMin(s);
		Assert.assertEquals(res, att);
		
	}

	@Test
	public void testMajMinEqualVrai2() {
		String s="J'ai Le  Droit99", att="J'ai le  droit99",res="";
		res=OutilsString.MajMin(s);
		Assert.assertEquals(res, att);
		
	}

	/**
	 * La méthode testSuivLettre, verifie si chaque lettre de la chaine est remplacée par la
	 * lettre suivante
	 */
	@Test
	public void testSuivLettre() {
		String s="aaabc", att="aabc",res="";
		res=OutilsString.SuivLettre(s);
		Assert.assertEquals(res, att);
	}
	

}
