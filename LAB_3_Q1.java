class LAB_3_Q1 {
    public static void oneByone(String s) {
        // ArrayList<Integer> arr = new ArrayList<>();
        int L=0, R=1;
        while (L<R && R<=s.length()) {
            String x = "";
            if (L - 1 >= 0 ) {
                x = s.substring(0, L);
            }
            System.out.println(x + s.substring(L, R).toUpperCase() + s.substring(R));
            if (R == s.length()) {
                L++;
                R = L;
            }
            R++;
        }
    }
    public static void main(String[] args) {
        oneByone("abc");
    }
}
