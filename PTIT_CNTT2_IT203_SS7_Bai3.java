public class PTIT_CNTT2_IT203_SS7_Bai3 {
    public class ScoreUtils {

        // Phương thức static: Kiểm tra điểm đạt hay không (Giả sử đạt là từ 5.0 trở lên)
        public static boolean isPassed(double score) {
            // Không thể dùng this.score ở đây vì score được truyền vào như một tham số
            return score >= 5.0;
        }

        // Phương thức static: Tính điểm trung bình của một mảng điểm
        public static double calculateAverage(double[] scores) {
            if (scores == null || scores.length == 0) return 0.0;

            double sum = 0;
            for (double s : scores) {
                sum += s;
            }
            return sum / scores.length;
        }

        // Phương thức static: Xếp loại học lực
        public static String getRank(double average) {
            if (average >= 8.0) return "Giỏi";
            if (average >= 6.5) return "Khá";
            if (average >= 5.0) return "Trung bình";
            return "Yếu";
        }

        public static void main(String[] args) {
            double myScore = 7.5;
            double[] classScores = {8.0, 5.5, 9.0, 4.0, 7.5};

            System.out.println("--- Kiểm tra điểm cá nhân ---");
            // Gọi trực tiếp qua tên lớp, không dùng 'new ScoreUtils()'
            if (ScoreUtils.isPassed(myScore)) {
                System.out.println("Kết quả: ĐẠT (" + myScore + ")");
            }

            System.out.println("\n--- Thống kê lớp học ---");
            double avg = ScoreUtils.calculateAverage(classScores);
            System.out.println("Điểm trung bình lớp: " + avg);
            System.out.println("Xếp loại chung: " + ScoreUtils.getRank(avg));
        }
    }
}
