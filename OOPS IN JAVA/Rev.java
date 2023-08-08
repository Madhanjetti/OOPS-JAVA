class Rev {
    // sequence order of numbers
    public void Seq(int n) {

        if (n == 0)
            return;
        Seq(n - 1);
        System.out.print(n + " ");
    }

    // reverse order of numbers
    public void reverse(int n) {
        if (n <= 0)
            return;
        System.out.print(n + " ");
        reverse(n - 1);

    }

    public static void main(String[] args) {
        Rev r = new Rev();
        r.reverse(10);
        System.out.println();
        r.Seq(10);
    }
}