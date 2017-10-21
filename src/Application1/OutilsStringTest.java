package Application1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class OutilsStringTest {

	@Test
	public void testFracVrai() {
		String chaine="imeimen";
		char  s='i';
		String[] essai=OutilsString.frac(s,chaine);
		Boolean bool=true;
		if (essai[0]!="ime") bool=false;
		if (essai[1]!="imen") bool=false;
		if(bool==true)fail("Resulat vrai");
	}

	@Test
	public void testFracFaux() {
		String chaine="imeimen";
		char  s='i';
		String[] essai=OutilsString.frac(s,chaine);
		Boolean bool=true;
		if (essai[0]=="im") bool=false;
		if (essai[1]=="imm") bool=false;
		
		if(bool==false)fail("Resulat faux");
	}

	@Test
	void testMajMinEqualVrai() {
		String s="j'ai Le  Droit99", att="J'ai le  droit99",res="";
		res=OutilsString.MajMin(s);
		Assert.assertEquals(res, att);
		
	}

	
	@Test
	void testSuivLettre() {
		String s="aaabc", att="aabc",res="";
		res=OutilsString.SuivLettre(s);
		Assert.assertEquals(res, att);
	}
	

}
