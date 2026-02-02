public class PTIT_CNTT3_IT203_SS7_Bai2 {
    public static void main(String[] args) {
        // --- PHẦN 1: BIẾN NGUYÊN THỦY (PRIMITIVE) ---
        int a = 10;
        int b = a; // Sao chép giá trị từ a sang b
        b = 20;    // Thay đổi b không ảnh hưởng đến a

        System.out.println("--- Biến nguyên thủy (int) ---");
        System.out.println("Giá trị của a: " + a); // Vẫn là 10
        System.out.println("Giá trị của b: " + b); // Là 20

        // --- PHẦN 2: BIẾN THAM CHIẾU (REFERENCE) ---
        Student sv1 = new Student("S01", "Đức Anh");
        Student sv2 = sv1; // Sao chép "địa chỉ" từ sv1 sang sv2

        // Thay đổi tên qua biến sv2
        sv2.setName("Văn Nam");

        System.out.println("\n--- Biến tham chiếu (Object) ---");
        System.out.println("Tên của sv1: " + sv1.getName()); // Bị đổi thành Văn Nam
        System.out.println("Tên của sv2: " + sv2.getName()); // Là Văn Nam
    }
    class Student {
        private String name;
        public Student(String id, String name) { this.name = name; }
        public void setName(String name) { this.name = name; }
        public String getName() { return name; }
    }
}

