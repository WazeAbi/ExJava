package kebab;
import java.util.Scanner;
public class MaClasse {

	public static void main(String[] args) {
		Scanner saisieUtilisateur = new Scanner(System.in);
	    String a = saisieUtilisateur.next();
	     a=a.toLowerCase();
		int j=a.length()-1;
		Boolean isPalindrom = true;
	    for (int i=0; i<a.length() ;i++) {
	    	
	    	if(a.charAt(i)==a.charAt(j)) {
	    		j--;
	    		
	    	}
	    	else isPalindrom = false;	
	    }
	    if(isPalindrom) {
	    	System.out.println("C'est un palindrome");
	    }
	    else System.out.println("Ce n'est pas un palindrome");
		
	}
}
