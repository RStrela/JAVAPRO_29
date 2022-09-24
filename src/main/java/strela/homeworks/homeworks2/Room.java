package strela.homeworks.homeworks2;

public class Room {
    public static void main(String[] args) {
        Bed bed = new Bed("Лакшери", 50, 180, 200);
        Locker locker = new Locker("Икеа мейд", 190, 200, 60);
        Table table = new Table("Письменный", 75, 85, 170);

        System.out.println(bed);
        System.out.println(locker);
        System.out.println(table);
    }
}
