import java.lang.reflect.Array;
import java.util.ArrayList;

public class BaiTap7 {

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0;i<=50;i+=2){
         arr.add(i);
    }
        System.out.println(arr);
        NhanVien1 obj = new NhanVien1();
        obj.NhanVien();
    }
}
class NhanVien1 {
    void NhanVien(){
        ArrayList<String> NhanVien = new ArrayList<String>();
        NhanVien.add("Số BD");
        NhanVien.add("Tên nhân viên");
        NhanVien.add("Số CCCD");
        NhanVien.add("Mã BHXH");
        NhanVien.add("aa");
        System.out.println(NhanVien);

}}