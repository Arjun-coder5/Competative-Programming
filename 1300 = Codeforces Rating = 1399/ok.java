public class ok{
  public static void main(String[] args) {
      int n =2;
      toss(n,"");
  }
  static void toss(int n,String a){
    if(n==0){
      System.out.println(a);
      return;
    }
    
    toss(n-1,a+"H");
    toss(n-1,a+"T");


  }
}