package kebab;
import java.util.Scanner;

public class Exo3 {
    Scanner saisieUtilisateur = new Scanner(System.in);
    int a = saisieUtilisateur.nextInt();
    int b=0;
    for(int i=0; i<=10; i++) {
        b=a*i;
        System.out.println(a+"x"+i+" = "+b);

    }



}

} 

}
