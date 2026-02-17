public class Tut07_ControlStatements_JumpingStatements {
    public static void main(String[] args) {

        // break (exits the loop)
        System.out.println("break");
        for (int i=1; i<=10; i++){
            System.out.println(i);
            if (i==5){
                break;
            }
        }

        //continue (restart the loop)
        System.out.println("continue");
        for (int k =1; k<=10; k++){
            if (k==5){
                continue;
            }
            System.out.println(k);
        }


        // print 1 to 10 skipping 3, 5 and 9
        System.out.println("print 1 to 10 skipping 3, 5 and 9");
        for (int p = 1; p<=10; p++){
            if (p==3 || p == 5||p==9){
                continue;
            }
            System.out.println(p);
        }

    }
}
