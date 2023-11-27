public class _1295_Find_Numbers {
  public static int findNumbers(int[] nums) {
        
    int bienDem = 0;
    
    for (int a : nums) {
      // kiem tra so chu so cua a
      // neu so chu so la chan => tang bien dem len 1
      int soLuongChuSo = tinhSoChuSo(a);
      if(soLuongChuSo % 2 == 0) bienDem ++;
    }

    return bienDem;
  }

  private static int tinhSoChuSo(int a) {
    int bienDem = 0;
    int kq = a;

    while(kq !=0){
      kq = a / 10;
      a = kq;
      bienDem++;
    }
    
    return bienDem;
  }

  public static void main(String[] args) {

    int[] nums = {1,22,3333,4444};
    // int[] n2 = new int[4];

    System.out.println(findNumbers(nums));

  }
}
