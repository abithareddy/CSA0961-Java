
class lcmgcd {
    public static void main(String[] args) {
        int n1 = 16;
        int n2 = 20;
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                if (i > gcd) {
                    gcd = i;
                }
            }
        }
        System.out.println("Gcd of two numbers:" + gcd);
        int lcm = (n1 * n2) / gcd;
        System.out.println("Lcm of two numbers:" + lcm);
    }
}