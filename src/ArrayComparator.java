public class ArrayComparator {

    boolean compare(double[][] table1, double[][] table2) {

        boolean identic = false;
        for (int i = 0; i < table1.length; i++) {
            for (int j = 0; j < table1.length; j++) {
                if (table1[i][j] == table2[i][j]) {
                    identic = true;
                } else {
                    identic = false;
                    break;
                }
            }
            if (!identic) break;
        }
        return identic;
    }

}
