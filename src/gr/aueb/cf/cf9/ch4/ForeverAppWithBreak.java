package gr.aueb.cf.cf9.ch4;

public class ForeverAppWithBreak {

    public static void main(String[] args) {
        int count = 0;

        for(;;) {
            System.out.print("Forever");
            count++;

            if (count % 20 ==0) System.out.println();
            if(count == 100) break;
        }
    }
}
