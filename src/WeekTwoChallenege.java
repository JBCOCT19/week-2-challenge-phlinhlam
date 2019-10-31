import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class WeekTwoChallenege {
    public static void main (String args[])
    {
        //array of 25 burritos
        int[] burritos;
        burritos = new int[25];
        ArrayList<String> completeBurr = new ArrayList<>();

        //array of ingredients
//        ArrayList<String> rice = new ArrayList<>();
//        Collections.addAll(rice, "white", "brown", "none", "all");
        String[] rice= {"white", "brown", "no rice", "all rice"};
        String[] meat = {"chicken","steak","carnidas","chorizo","sofritas","veggies","no meat","all meat"};
        String[] beans = {"pinto","black","no beans"};
        String[] salsa ={"mild","medium","hot","no salsa","all salsa"};
        String[] veggies = {"lettuce","fajitas veggies","no veggies","all veggies"};
        boolean cheese = false;
        boolean guac = false;
        boolean queso = false;
        boolean sourcream = false;

        boolean cont = true;
        Random rand = new Random();
           //int numOfBurr = 25;
        while(cont) {
            //fill in complete burrito array
           // for (int i = 1; i < burritos.length; i++) {//for every burritos starting from 1
                int randRice = rand.nextInt(rice.length);//random generator for rice
                String r = (rice[randRice]);
                completeBurr.add(r);//add to burrito

                //System.out.println(r);

                int randMeat = rand.nextInt(meat.length);//random generator for meat
                String m = (meat[randMeat]);
                completeBurr.add(m);
                //System.out.println(m);

                int randBeans = rand.nextInt(beans.length);//random generator for beans
                String b = (beans[randBeans]);
                completeBurr.add(b);

                int randSalsa = rand.nextInt(salsa.length);//random generator for salsa
                String s = (salsa[randSalsa]);
                completeBurr.add(s);

                int randVeg = rand.nextInt(veggies.length);//random generator for veggies
                String v = (veggies[randVeg]);
                completeBurr.add(v);

                cont = false;
            System.out.println("After add ingredients: " + completeBurr);
            //}//end for
        }//end while



            //check if the complete burritor contains none or no
        // get index of no-rice value and dont calculate it

    }

public static String myBurr()
{

}


    public static double getPrice(double p)
    {
        double sum = 0;
        int numIngr = 0;
        sum = 3.00 + (0.50*numIngr);
        return sum;

    }




}
