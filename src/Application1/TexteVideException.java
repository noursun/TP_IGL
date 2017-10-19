package Application1;

/**
 * la classe TexteVideException est une exception générée lorsque le texte est vide.
 * @author noursu et
 * @version 1.0
 */
public class TexteVideException extends Exception{

	/**
	 * le constructeur de la classe TexteVideException, il renvoit un message.
	 */
	public TexteVideException(){
		System.out.println("Le texte est vide !");
	}
	
}
