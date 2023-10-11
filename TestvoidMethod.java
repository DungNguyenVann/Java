public class TestvoidMethod {
    public static void main(String[] args) {
        int[] a = {1, 9, 3, 2};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


//        public static void printGrade ( double score){
//            if (score >= 90.0) {
//                System.out.println('A');
//            } else if (score >= 80.0) {
//                System.out.println('B');
//            } else if (score >= 70.0) {
//                System.out.println('C');
//            } else if (score >= 60.0) {
//                System.out.println('D');
//            } else
//                System.out.println('F');
//        }
    }}