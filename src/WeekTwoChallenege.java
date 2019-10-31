import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class WeekTwoChallenege {
    public static void main (String args[])
    {
        //array of 25 burritos
        int[] burritos;
        burritos = new int[6];
        ArrayList<String> completeBurr = new ArrayList<>();

        //array of ingredients
//        ArrayList<String> rice = new ArrayList<>();
//        Collections.addAll(rice, "white", "brown", "none", "all");
        String[] rice= {"white", "brown", "none", "all"};
        String[] meat = {"chicken","steak","carnidas","chorizo","sofritas","veggies","none","all"};
        String[] beans = {"pinto","black","none"};
        String[] salsa ={"mild","medium","hot","none","all"};
        String[] veggies = {"lettuce","fajitas veggies","none","all"};
        boolean[] cheese, guac, queso, sourcream;


        Random rand = new Random();

        //fill in complete burrito array
        //for (int i = 1; i < burritos.length; i++) {//for every burritos starting from 1
            int randRice = rand.nextInt(rice.length);//random generator for rice
            String r= (rice[randRice]);
            completeBurr.add(r);//add to burrito

            //System.out.println(r);

            int randMeat = rand.nextInt(meat.length);//random generator for meat
            String m= (meat[randMeat]);
            completeBurr.add(m);
            //System.out.println(m);

            int randBeans = rand.nextInt(beans.length);//random generator for beans
            String b = (beans[randBeans]);
            completeBurr.add(b);

            int randSalsa = rand.nextInt(salsa.length);//random generator for salsa
            String s = (salsa[randSalsa]);
            completeBurr.add(s);

            int randVeg = rand.nextInt(salsa.length);//random generator for veggies
            String v = (veggies[randVeg]);
            completeBurr.add(v);

        System.out.println("After add ingredients: " + completeBurr);

            int ranBurr = rand.nextInt(completeBurr.size());
            String burr = completeBurr.get(ranBurr);

            for (int i = 1; i<ranBurr; i++) {
                System.out.println("After loop "+ i + " " + burr);
            }
        //}//end for loop to generate burritos

    }




    public static double getPrice(double p)
    {
        double sum = 0;
        int numIngr = 0;
        sum = 3.00 + (0.50*numIngr);
        return sum;

    }




}
