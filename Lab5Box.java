class Lab5Box {
    double length;
    double width;
    double height;

    public Lab5Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lab5Box(double length, double width) {
        this.length = length;
        this.width = width;
        this.height = 1;
    }

    public Lab5Box(double length) {
        this.length = length;
        this.width = 1;
        this.height = 1;
    }

    public double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Lab5Box box1 = new Lab5Box(5, 3, 2);
        System.out.println("Volume of Box 1: " + box1.volume());

        Lab5Box box2 = new Lab5Box(4, 2);
        System.out.println("Volume of Box 2: " + box2.volume());

        Lab5Box box3 = new Lab5Box(3);
        System.out.println("Volume of Box 3: " + box3.volume());
    }
}
