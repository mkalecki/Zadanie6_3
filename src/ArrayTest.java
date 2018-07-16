public class ArrayTest {

    public static void main(String[] args) {

        double[][] tab1 = new double[3][];
        double[] line10 = {1.1, 1.5, 2.0};
        double[] line11 = {1.5, 2.0, 2.5};
        double[] line12 = {2.0, 2.5, 3.0};

        tab1[0] = line10;
        tab1[1] = line11;
        tab1[2] = line12;

        double[][] tab2 = new double[3][];
        double[] line20 = {1.1, 1.5, 2.0};
        double[] line21 = {1.5, 2.0, 2.5};
        double[] line22 = {2.0, 2.5, 3.0};

        tab2[0] = line20;
        tab2[1] = line21;
        tab2[2] = line22;

        ArrayComparator ac = new ArrayComparator();

        if (ac.compare(tab1, tab2)) System.out.println("Tablice są identyczne");
        else System.out.println("Tablice NIE są identyczne");



    }
}
