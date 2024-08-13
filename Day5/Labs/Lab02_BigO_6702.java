package Day5.Labs;

public class Lab02_BigO_6702 {
    public static void main(String[] args) {
        System.out.println(homework2(5));
    }

    public static int homework2(int n) {
        if (n <= 1)
            return n;
        return homework2(n - 1) + homework2(n - 2);
    }
}

// แบบเก่าเป็น Big-O (2^n)