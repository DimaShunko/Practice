package TaskOne;

public class Six {
    public static void main(String[] args) {

        boolean[] b = new boolean[101];
        int k, a, j;

        a = 100;
        for (int i=2; i<=a; i++)
            b[i] = true;

        j = 2;
        while (j*j <= 100){
            if (b[j]){
                k = j*j;
                while (k<=a){
                    b[k] = false;
                    k = k + j;
                }
            }
            j = j+1;
        }

        for (int i=2; i<=a; i++)
            if (b[i])
                System.out.println(i);
    }
}
