import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class WeekTwoChallenege {
    public static void main(String args[]) {
        //array of 25 burritos
        int[] burritos;
        burritos = new int[25];
        double sum = 3.0;
        ArrayList<String> burr = new ArrayList<>();

        //display 1 burrito with 25 different ingredients
        for (int i = 1; i <= 25; i++) {//this is for 25 burritos
        burr = myBurr();
            if (burr.equals("allrice")) {
                sum = sum + 1.0;
            } else if (burr.equals("allmeat")) {
                sum = sum + 3.0;
            } else if (burr.equals("allsalsa")) {
                sum = sum + 1.5;
            } else {
                sum = sum + 0.5;
            }

            System.out.println("Burrito " + i + " " + burr + ". Price: " + sum);

        }//end for
    }

    //method to generate different burritos ingredients
    public static ArrayList myBurr() {
        ArrayList<String> completeBurr = new ArrayList<>();

        //array of ingredients
//
        String[] rice = {"white rice", "brown rice", "no rice", "allrice"};
        String[] meat = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies", "no meat", "allmeat"};
        String[] beans = {"pinto", "black", "no beans"};
        String[] salsa = {"mild salsa", "medium salsa", "hot salsa", "no salsa", "allsalsa"};
        String[] veggies = {"lettuce", "fajitas veggies", "no veggies", "allveggies"};
        String[] cheese = {"cheese","no cheese"};
        String[] guac = {"guac","no guac"};
        String[] queso = {"queso","no queso"};
        String[] sourCream = {"sour cream", "nosour"};

        //boolean cont = true;
        Random rand = new Random();


        //fill in complete burrito array
        // for (int i = 1; i < burritos.length; i++) {//for every burritos starting from 1
        int randRice = rand.nextInt(rice.length);//random generator for rice
        int randMeat = rand.nextInt(meat.length);//random generator for meat
        int randBeans = rand.nextInt(beans.length);//random generator for beans
        int randSalsa = rand.nextInt(salsa.length);//random generator for salsa
        int randVeg = rand.nextInt(veggies.length);//random generator for veggies
        int randCheese = rand.nextInt(cheese.length);
        int randQue = rand.nextInt(queso.length);
        int randGuac = rand.nextInt(guac.length);
        int randsour = rand.nextInt(sourCream.length);


        String r = (rice[randRice]);
        completeBurr.add(r);//add to burrito
        //System.out.println(r);

        String m = (meat[randMeat]);
        completeBurr.add(m);
        //System.out.println(m);

        String b = (beans[randBeans]);
        completeBurr.add(b);

        String s = (salsa[randSalsa]);
        completeBurr.add(s);

        String v = (veggies[randVeg]);
        completeBurr.add(v);

        String c = (cheese[randCheese]);
        completeBurr.add(c);

        String q = (queso[randQue]);
        completeBurr.add(q);

        String g = (guac[randGuac]);
        completeBurr.add(g);

        String sr= (sourCream[randsour]);
        completeBurr.add(sr);


        return completeBurr;
    }//end method
}//end class



