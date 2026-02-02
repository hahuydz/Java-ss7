public class PTIT_CNTT3_IT203_SS7_Bai1 {
    public class Student {

        private String studentId;
        private String studentName;

        public static int totalStudent = 0;

        public Student(String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;


            totalStudent++;
        }


        public void displayInfo() {
            System.out.println("MSV: " + studentId + " | Họ tên: " + studentName);
        }

        public static void displayTotal() {
            System.out.println("===> Tổng số sinh viên hiện có: " + totalStudent);
        }

        public void main(String[] args) {

            Student s1 = new Student("S001", "Lê Đức Anh");
            s1.displayInfo();


            Student s2 = new Student("S002", "Nguyễn Văn A");
            s2.displayInfo();

            Student s3 = new Student("S003", "Trần Thị B");
            s3.displayInfo();

            Student.displayTotal();
        }
    }


}

