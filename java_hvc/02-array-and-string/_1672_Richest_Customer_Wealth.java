public class _1672_Richest_Customer_Wealth {
  public int maximumWealth(int[][] a) {
      int customers = a.length;
      int banks = a[0].length;
      int max = 0;

      for (int i = 0; i < customers; i++) {
        int currentCustomerAsset=0;
        for (int j = 0; j < banks; j++) {
          currentCustomerAsset += a[i][j];
        }
        if(currentCustomerAsset>max) max = currentCustomerAsset;
      }      
    return max;
  }

  public static void main(String[] args) {
    int[][] a = {{1,2,3},{3,2,1}};
    int[][] b = new int[2][3];

    int rows = a.length;
    int cols = a[0].length;

    for (int i=0;i<rows;i++) {
      for (int j = 0; j < cols; j++) {
        System.out.println(a[i][j] +" ");
      }
      System.out.println();
    }
  }
}
