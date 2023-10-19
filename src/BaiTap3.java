public class BaiTap3 {
    public static long x = 20;
    public static long y = 20;
    public static long z = 5;
    public static long t = 12;
    public static long c = 4;
    public static void main(String[] args){
        System.out.println("Phép cộng: "+x+y+z);
        System.out.println("Phép chia lấy phần dư: "+z%y);
        String s = (y%x ==0) ? "y chia het cho x" : "y khong chia het cho x";
        String q = ((t%c==0)&&(t==4))? "t chia het cho c va t bang 12" : "t khong thoa dieu kien";
        String d = ((y%3==0)||(y%4==0))? "y chia het cho 3 hoac 4 " : "y khong chia het cho 3 va 4";
        System.out.println(s);
        System.out.println(q);
        System.out.println(d);
        System.out.println(x>y);
        System.out.println(x<y);
    }
}
