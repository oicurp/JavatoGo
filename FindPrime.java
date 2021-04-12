import java.util.ArrayList;

public class FindPrime {
    public static void main(String[] args){

        int upper_range = 1_000_000;
        ArrayList<String> arrayList = new ArrayList<String>();
        
        int counter = 0;

        for (int j = 2; j <= upper_range; j++) {
            if (validatePrimality(j)) {
                
                arrayList.add(counter,Integer.toString(j)); 
                counter ++;
            }
            //else {System.out.println(j + "  is not prime");} 
        }

        //System.out.println(arrayList);
        System.out.println("Total numbers of prime numbers from 1 to " + upper_range + " are: " + arrayList.size());
        
    }
/*
    public static int findPrimenumber(int upper_range) {
        for (int j = 2; j<=upper_range; j++) {
            if (validatePrimality(j)) {
                prime_number[j] = j;
            }
        }
    }
*/
    public static boolean validatePrimality(int number) {
        double square_root = Math.sqrt(number);
        long square_root_2 = Math.round((square_root));

        for (long i = 2; i <= square_root_2; i++) {
            if (number%i == 0) {return false;}
        }

        return true;

    }

}
