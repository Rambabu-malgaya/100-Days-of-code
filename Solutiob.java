public class Solutiob {
    static int secretCode(int n, int[] a) {
        // Write your code here.
        if (a.length < 3) {
            return 0;
        }
        for (int i = 0; i < a.length - 3; i++) {
            int n1 = a[i];
            int n2 = a[i + 1];
            int n3 = a[i + 2];
            int sum = n1 + n2 + n3;
            // String s = String.valueOf(sum);
            if ((n1 + n2 + n3) % 10 == 0) {
                // System.out.println(sum);
                return 1;
            }
            // if(s.charAt(s.length-1)=='0'){
            // return 1;
            // }
        }
        return 0;
    }

    public static void main(String[] args) {
        secretCode()
    }
}