package OOP;

import com.sun.tools.javac.Main;

class NhanVien {
    private String name;
    private int age;
    private String address;
    private String country;

    void setinfor(String name,int age,String address,String country) {
        this.address = address;
        this.age = age;
        this.name = name;
        this.country = country;
    }

    void getinfor() {
        System.out.println(name + " " + age + " " + address + " " + country);
    }

}

 class ThongTin {
    public static void main(String[] args) {
        NhanVien obj = new NhanVien();
        obj.setinfor("Dat",26,"ChauDoc","VietNam");
        obj.getinfor();
    }
}