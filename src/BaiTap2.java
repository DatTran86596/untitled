 class NhanVien {
     int ID;
     String name;
     String Birthday;
     String Address;
     float IDnumber;
     String Phonenumber;
     NhanVien(int i, String dat, String s, String hcm, int i1, String number){
         this.ID = i;
         this.name = dat;
         this.Birthday = s;
         this.Address = hcm;
         this.IDnumber = i1;
         this.Phonenumber = number;
     }
     void display(){
         System.out.println(ID);
         System.out.println(name);
         System.out.println(Birthday);
         System.out.println(Address);
         System.out.println(IDnumber);
         System.out.println(Phonenumber);
     }
     public static void main(String args[]){
         NhanVien obj = new NhanVien(001,"Dat","26/12/1996","HCM",753159852,"0987445585");
         obj.display();
     }
}
