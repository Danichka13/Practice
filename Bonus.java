public class Bonus {

    public static void main(String[] args) {

        twoOfFour();
    }

    public static void twoOfFour(){
        boolean b_one, b_two, b_three, b_four;
        boolean[] bln = {b_one = true, b_two = false, b_three = false, b_four = true};
        int count = 0;
        for (int i = 0; i < bln.length; i++){
            if(bln[i]){
                count++;
            }
        }
        if(count == 2){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
