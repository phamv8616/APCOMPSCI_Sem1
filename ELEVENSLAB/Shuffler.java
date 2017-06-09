import java.lang.Math;

public class Shuffler {


    private static final int SHUFFLE_COUNT = 5;
    private static final int VALUE_COUNT = 10;


    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                                 " consecutive efficient selection shuffles:");
        int[] values2 = {0,1,2,3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void perfectShuffle(int[] values) {
		int[] shuffled = new int[values.length];
		
		int mid = (values.length)/2;
		
		int shuffledPos = 0;
		for(int k = 0; k < mid; k++){
			shuffled[shuffledPos] = values[k];
			shuffledPos +=2;
		}
		
		shuffledPos = 1;
		for(int k = mid; k<values.length;k++){
			shuffled[shuffledPos] = values[k];
			shuffledPos +=2;
		}
		
		for (int k = 0; k<values.length;k++){
			values[k] = shuffled[k];
		}
		
    }


    public static void selectionShuffle(int[] values) {
        for( int k = values.length - 1; k > 0; k-- ) {
            int r = (int)(Math.random() * k);
            int t = values[r];
            values[r] = values[k];
            values[k] = t;
        }
    }
}
