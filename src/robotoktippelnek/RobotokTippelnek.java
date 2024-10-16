package robotoktippelnek;

import java.util.Random;

public class RobotokTippelnek {

    public static void main(String[] args) {
        System.out.println("Három robot tippel egyet-egyet:");
        /* tippelések beállítása: */
        int szam1;
        /* Random osztály használattal: */
        Random rnd = new Random();
        szam1 = rnd.nextInt(1, 11);
        
        /* Math.random() használattal */
        szam1 = (int)(Math.random() * 10) + 1;
        
        int tipp1, tipp2, tipp3;
        
    }
    
}
