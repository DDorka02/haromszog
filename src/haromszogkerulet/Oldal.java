package haromszogkerulet;

import java.util.Random;


public class Oldal {
    private static final Random rnd = new Random();
    private int tipp;
    
    
    public void egyikoldal(){
        tipp = rnd.nextInt(9);
        int b= 5;
        int c= 6;
        System.out.printf("Oldalak:%d,%d,%d".formatted(tipp,b,c));
}

    
}
