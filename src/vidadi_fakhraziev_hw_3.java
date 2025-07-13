public class vidadi_fakhraziev_hw_3 {
    public static void main(String[] args) {
        double[] nums = {2.2, 6.6, -7.6, 3.8, 60.0, -24.4, -10.5, 16.3, -4.8, 8.9, 5.7, -6.8, -8.1, -25.3, 24.9};

        double sum = 0;
        boolean foundNegNum = false;
        int positiveCount = 0;
        System.out.print("(");
        int i = 0;
        for (Double element : nums) {
            if (i != nums.length - 1) {
                System.out.print(element + ", ");
                i++;
            } else {
                System.out.print(element);
            }

            if (!foundNegNum && element < 0) {
                foundNegNum = true;
                continue;
            }
            if (foundNegNum && element > 0) {
                sum += element;
                positiveCount++;
            }
        }
            System.out.print(") = " + sum + "/" + positiveCount);
    }
}