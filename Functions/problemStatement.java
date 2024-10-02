package basics.Functions;


    public class problemStatement {
        public static int solve(int A, int B, int C) {

            int day = 1;
            while (A > 0) {

                int totalCases = B + C;
                int remainingCases = totalCases - A;

                if (remainingCases > 0) {

                    day++;
                    C=remainingCases;

                } else {
                    break;
                }
            }
            return day;

        }


        public static void main(String[] args) {
            System.out.println(solve(4,3,2));
        }


    }