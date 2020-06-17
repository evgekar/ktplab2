import java.util.Scanner;
public class Lab2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите координаты первой точки");
        Point3d point1 = new Point3d(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.println("Введите координаты второй точки");
        Point3d point2 = new Point3d(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.println("Введите координаты третьей точки");
        Point3d point3 = new Point3d(input.nextDouble(), input.nextDouble(), input.nextDouble());

        System.out.println(computeArea(point1, point2, point3));
    }

    public static double computeArea(Point3d point1, Point3d point2, Point3d point3 ) {
        double dist12 = point1.distanceTo(point2);
        double dist23 = point2.distanceTo(point3);
        double dist13 = point1.distanceTo(point3);

        if (dist12 == 0 || dist23 == 0 || dist13 == 0) {
            System.out.println("координаты точек совпадают");
            return 0;
        }

        double halfPerimeter = (dist12 + dist23 + dist13) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - dist12) * (halfPerimeter - dist23) *
                (halfPerimeter - dist13));

    }
}
