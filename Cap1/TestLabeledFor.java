public class TestLabeledFor {
   private int a;
   public void test(){
      TestLabeledFor.this.a = 10;
   }
   public static void main(String... argd) {
      int i=0, j =0;
      X1:for(i=0;i<3;i++) {
        X2:for(j=3;j>0;j--) {
         if(i<j) continue X1;
         else break X2;
        }
      }
      System.out.println(i+""+j); // print 33
   }
}