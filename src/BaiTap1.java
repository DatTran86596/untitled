class SinhVien {
    String name = "Tran Tien Dat";
    static String phone = "0394653393";

    public static void main(String args[]) {
        String Gender = "Male";
        SinhVien obj = new SinhVien();
        System.out.println(obj.name);
        System.out.println(phone);
        System.out.println(Gender);
        System.out.println(ThongTin.address);
        System.out.println(ThongTin.position);
    }
}
class ThongTin {
    static String address = "HCM";
    static String position = "Tester";
}