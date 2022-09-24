package strela.homeworks.homeworks2;

public class Locker {
    private String name;
    private int height;
    private int width;
    private int length;

    public Locker(String name, int height, int width, int length) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Locker " +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ' ';
    }
}
