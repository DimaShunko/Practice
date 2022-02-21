package TaskOne;

public class Nine {
    public static void main(String[] args) {
        int[][] arr = new int[6][7];

        for (int i=0; i<6; i++)
            for (int j=0; j<7; j++)
                arr[i][j] = (int) (Math.random()*9);

        for (int i=0; i<6; i++) {
            for (int j = 0; j < 7; j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }

        System.out.println();
        int tmp;
        for (int i = 0; i <6; i++)
            for (int j = 0; j <7; j++)
                for (int k = j+1; k <7; k++)
                    if (arr[i][j] < arr[i][k]) {
                        tmp = arr[i][k];
                        arr[i][k] = arr[i][j];
                        arr[i][j] = tmp;
                    }

        for (int i=0; i<6; i++) {
            for (int j = 0; j < 7; j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
