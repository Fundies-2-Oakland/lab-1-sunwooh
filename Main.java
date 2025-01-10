public class Main {
    public static void main(String[] args) {
        Vector3D hiThere = new Vector3D(1, 2, 3);
        Vector3D bye = new Vector3D(3, -2, 1);
        System.out.print("First Vector: ");
        System.out.println(hiThere);
        System.out.print("Second Vector: ");
        System.out.println(bye);
        System.out.print("Magnitude of the First Vector: ");
        System.out.println(hiThere.getMagnitude());
        System.out.print("Normalized version of the First Vector: ");
        System.out.println(hiThere.normalize());
        System.out.print("First Vector + Second Vector: ");
        System.out.println(hiThere.add(bye));
        System.out.print("First Vector * 4: ");
        System.out.println(hiThere.multiply(4));
        System.out.print("Dot Product of the First and Second Vectors: ");
        System.out.println(hiThere.dotProduct(bye));
        System.out.print("Angle between the First and Second Vectors: ");
        System.out.println(hiThere.angleBetween(bye));
        System.out.print("Cross Product of the First and Second Vectors: ");
        System.out.println(hiThere.crossVector(bye));
    }
}
