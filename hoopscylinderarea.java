class Area {
    int r, h, x;

    void get(int radius, int height) {
        r = radius;
        h = height;
    }

    void cal() {
         x = (int) (2 * 3.14 * r * (h + r));
    }

    void display() {
        System.out.println("area of cylinder: " + x);
    }

    public static void main(String[] args) {
        Area cylinder = new Area();
        cylinder.get(2, 5);
        cylinder.cal();
        cylinder.display();
    }
}