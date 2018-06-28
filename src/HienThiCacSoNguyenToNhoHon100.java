public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n=2;
        boolean check=true;
        for(int i = 2; i < 100;i++ ){
            while(i<Math.sqrt(i)){
                if(i%n==0){
                  check=false;
                  break;
                }
                if (check){
                    System.out.println(i+"la so nguyen to");
                }else
                    System.out.println(i+"khong la so nguyen to");
            }

        }

    }
}
