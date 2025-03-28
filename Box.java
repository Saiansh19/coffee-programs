class Box {
    double length;
    double width;
    double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double length, double width) {
        this.length = length;
        this.width = width;
        this.height = 1;
    }

    public Box(double length) {
        this.length = length;
        this.width = 1;
        this.height = 1;
    }

    public double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box box1 = new Box(5, 3, 2);
        System.out.println("Volume of Box 1: " + box1.volume());

        Box box2 = new Box(4, 2);
        System.out.println("Volume of Box 2: " + box2.volume());

        Box box3 = new Box(3);
        System.out.println("Volume of Box 3: " + box3.volume());
    }
}