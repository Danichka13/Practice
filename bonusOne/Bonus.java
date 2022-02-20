public class Bonus {

    public static void main(String[] args) {

        boolean b_one = true, b_two = false, b_three = false, b_four = true;
        System.out.println(twoOfFour(b_one, b_two, b_three, b_four));

        System.out.println(logicCheck(b_one, b_two, b_three, b_four));
    }

    public static boolean twoOfFour(boolean b_one, boolean b_two, boolean b_three, boolean b_four){
        boolean[] bln = {b_one, b_two, b_three, b_four};
        int count = 0;
        for (int i = 0; i < bln.length; i++){
            if(bln[i]){
                count++;
            }
        }
        if(count == 2){
            return true;
        } else{
            return false;
        }
    }

    public static boolean logicCheck(boolean b_one, boolean b_two, boolean b_three, boolean b_four){

        return (b_one | b_two | b_three | b_four) && !(b_one ^ b_two ^ b_three ^ b_four) && !(b_one & b_two & b_three & b_four);
    }
}