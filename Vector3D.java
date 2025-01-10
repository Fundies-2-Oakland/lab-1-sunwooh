public class Vector3D {
    double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString() {
        return "(" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ", " + String.format("%.2f", z) + ")";
    }

    public double getMagnitude() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public Vector3D normalize() {
        if (this.getMagnitude() == 0) {
            throw new IllegalStateException("IllegalStateException (Cannot normalize if magnitude is 0)");
        }
        double mag = this.getMagnitude();
        return new Vector3D(x / mag, y / mag, z / mag);
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(x + other.getX(), y + other.getY(), z + other.getZ());
    }

    public Vector3D multiply(double constant) {
        return new Vector3D(x * constant, y * constant, z * constant);
    }

    public double dotProduct(Vector3D other) {
        return (x * other.getX()) + (y * other.getY()) + (z * other.getZ());
    }

    public double angleBetween(Vector3D other) {
        if (getMagnitude() * other.getMagnitude() == 0) {
            throw new IllegalStateException("IllegalStateException (Cannot find an angle if there is a magnitude value of 0)");
        }
        return Math.acos(dotProduct(other) / (getMagnitude() * other.getMagnitude())) * (180 / Math.PI);
    }

    public Vector3D crossVector(Vector3D other) {
        return new Vector3D((y * other.getZ() - z * other.getY()), (z * other.getX() - x * other.getZ()), (x * other.getY() - y * other.getX()));
    }
}


