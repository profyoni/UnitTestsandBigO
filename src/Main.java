public class Main {
    public static  int foo()
    {
        return 0;
    }

    public static int summation(int n)
    {
        int total = 0;
        for (int i=1;i<=n;i++)
            total += i;
        return total;
    }

    public static int summationGauss(int n)
    {
        return (n+1)*n/2; // 3 ops
    }
}
