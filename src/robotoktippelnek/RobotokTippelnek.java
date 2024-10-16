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
        /* Random osztály használattal: */
        tipp1 = rnd.nextInt(1, 11);
        tipp2 = rnd.nextInt(1, 11);
        tipp3 = rnd.nextInt(1, 11);
        
        /* Math.random() használattal */
        tipp1 = (int)(Math.random() * 10) + 1;
        tipp2 = (int)(Math.random() * 10) + 1;
        tipp3 = (int)(Math.random() * 10) + 1;

        /* tippelések kiírása: */
        System.out.println("A kitalálandó szám: " + szam1);
        System.out.println("1. robot tippje: " + tipp1);
        System.out.println("2. robot tippje: " + tipp2);
        System.out.println("3. robot tippje: " + tipp3);

        
    }
    
}
