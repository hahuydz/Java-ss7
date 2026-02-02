public class PTIT_CNTT3_IT203_SS7_Bai4 {
    public static class ClassRoom {

        private String studentName;


        public static double classFund = 0;

        public ClassRoom(String studentName) {
            this.studentName = studentName;
        }


        public void contributeFund(double amount) {
            classFund += amount;
            System.out.println(studentName + " đã đóng góp: " + amount + " VND");
        }


        public static void displayGlobalFund() {
            System.out.println("------------------------------------");
            System.out.println("TỔNG QUỸ LỚP HIỆN TẠI: " + classFund + " VND");
            System.out.println("------------------------------------");
        }

        public static void main(String[] args) {

            ClassRoom sv1 = new ClassRoom("Lê Đức Anh");
            ClassRoom sv2 = new ClassRoom("Nguyễn Văn A");
            ClassRoom sv3 = new ClassRoom("Trần Thị B");


            sv1.contributeFund(50000);
            sv2.contributeFund(100000);
            sv3.contributeFund(20000);

            ClassRoom.displayGlobalFund();


            System.out.println("Lớp dùng quỹ mua nước uống hết 30.000 VND...");
            ClassRoom.classFund -= 30000;

            ClassRoom.displayGlobalFund();
        }
    }
}

