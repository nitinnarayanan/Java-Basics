class myLoop {
    public void forLoop() {
        System.out.println("FOR LOOP OUTPUT:");
        for (int j = 0; j <=6; j++) {
            System.out.println(j);
        }
    }

    public void whileLoop() {
        int k = 0;
        System.out.println("\nWHILE LOOP OUTPUT:");
        while (k <= 5) {
            System.out.println(k);
            k++;
        }
    }

    public void doWhileLoop() {
        int l = 0;
        System.out.println("\nDO WHILE LOOP OUTPUT:");
        do {
            System.out.println(l);
            l++;
        } while (l < 3);
    }
}
public class loops extends myLoop{
    public static void main (String[] args)
    {
        loops obj = new loops();
        obj.forLoop();
        obj.whileLoop();
        obj.doWhileLoop();

    }
}

