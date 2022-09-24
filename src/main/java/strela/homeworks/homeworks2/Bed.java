package strela.homeworks.homeworks2;

public class Bed {
    private String name;
    private int height;
    private int width;
    private int length;

    public Bed(String name, int height, int width, int length) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Bed " +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ' ';
    }
}
