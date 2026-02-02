public class PTIT_CNTT2_IT203_SS7_Bai5 {
    public class Config {

        public static final double MAX_SCORE = 10.0;
        public static final double MIN_SCORE = 0.0;
        public static final double PASS_SCORE = 5.0;
        public static final String SCHOOL_NAME = "Học viện Công nghệ Bưu chính Viễn thông (PTIT)";


        public static boolean isValid(double score) {
            return score >= MIN_SCORE && score <= MAX_SCORE;
        }

        public class Main {
            public static void main(String[] args) {
                System.out.println("Chào mừng bạn đến với: " + Config.SCHOOL_NAME);

                double studentScore = 11.5;

                if (!Config.isValid(studentScore)) {
                    System.out.println("Lỗi: Điểm phải nằm trong khoảng từ "
                            + Config.MIN_SCORE + " đến " + Config.MAX_SCORE);
                }


            }
        }
    }
}
