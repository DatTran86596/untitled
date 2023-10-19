import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaiTap6 {
    public static void main(String[] args) {
        int j = 0;
        int[] a = new int[26];
        for (int i = 0; i <= 50; i += 2) {
            a[j++] = i;
        }
        for(int c:a){
            System.out.println(c);
        }
    }}