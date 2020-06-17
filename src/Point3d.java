import java.math.RoundingMode;

public class Point3d extends Point2d {
    private double zCoord;

    public Point3d( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3d() {
        this(0, 0, 0);
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public double distanceTo(Point3d point) {
        int scale = 100;
        double distX = point.getX() - this.xCoord;
        double distY = point.getY() - this.yCoord;
        double distZ = point.getZ() - this.zCoord;
        double distance = Math.sqrt(distX*distX + distY*distY + distZ*distZ);

        return Math.round(distance*scale) / (double) scale;
    }
}
