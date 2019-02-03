package SDA;

import java.util.ArrayList;
import java.util.List;

public class LiczbaPierwsza {
    //

    public ArrayList<Integer> getPrime(int przedzial){
        ArrayList<Integer> wynik = new ArrayList<>();

        boolean isPrime = true;
        for(int i=2; i<= przedzial; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;

                }
            }
            if (isPrime) {
                wynik.add(i);
            }
            isPrime = true;
        }return wynik;

    }
}
