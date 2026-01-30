import java.util.*;
public class Ques_13{
 public static void main(String[]args){
 Scanner sc = new Scanner(System.in);
  int r = sc.nextInt();
  int c = sc.nextInt();
  char[][] mat = new char[r][c];
  for (int i = 0; i < r; i++) {
    mat[i] = sc.next().toCharArray();
}
  boolean[] goodRow = new boolean[r];
  boolean[] goodCol = new boolean[c];
  for(int i = 0;i<r;i++){
   goodRow[i] = true;
  for(int j = 0;j<c;j++){
    if(mat[i][j]=='S'){
      goodRow[i] = false;
      break;
}
}
}
   for(int j = 0;j<c;j++){
   goodCol[j] = true;
  for(int i = 0;i<r;i++){
    if(mat[i][j]=='S'){
      goodCol[j] = false;
      break;
}
}
}
  int eaten = 0;
   for(int i = 0;i<r;i++){
     if(goodRow[i])eaten+=c;
}

 for (int j = 0; j < c; j++) {
            if (goodCol[j]) {
                for (int i = 0; i < r; i++) {
                    if (!goodRow[i]) {
                        eaten++;
                    }
                }
            }
}
System.out.print(eaten);
}
}