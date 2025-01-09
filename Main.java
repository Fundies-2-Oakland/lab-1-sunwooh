public class Main {
    public static void main(String[] args) {
        Vector3D hiThere = new Vector3D(3, -3, 1);
        Vector3D bye = new Vector3D(4, 9, 2);
        System.out.println(hiThere);
        System.out.println(hiThere.getMagnitude());
        System.out.println(hiThere.normalize());
        System.out.println(hiThere.add(bye));
        System.out.println(hiThere.multiply(4));
        System.out.println(hiThere.dotProduct(bye));
        System.out.println(hiThere.angleBetween(bye));
        System.out.println(hiThere.crossVector(bye));
        System.out.println(hiThere);
        System.out.println(bye);
    }
}
