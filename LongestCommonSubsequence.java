public class LongestCommonSubsequence{
   int subseq(char[] a, char[] b, int a_len, int b_len){
      int my_arr[][] = new int[a_len + 1][b_len + 1];
      for (int i = 0; i <= a_len; i++){
         for (int j = 0; j <= b_len; j++){
            if (i == 0 || j == 0)
            my_arr[i][j] = 0;
            else if (a[i - 1] == b[j - 1])
            my_arr[i][j] = my_arr[i - 1][j - 1] + 1;
            else
            my_arr[i][j] = max_val(my_arr[i - 1][j], my_arr[i][j - 1]);
         }
      }
      return my_arr[a_len][b_len];
   }
   int max_val(int val_1, int val_2){
      return (val_1 > val_2) ? val_1 : val_2;
   }
   public static void main(String[] args){
      LongestCommonSubsequence my_inst = new LongestCommonSubsequence();
      String my_str_1 = "MNSQR";
      String my_str_2 = "PSQR";
      char[] a = my_str_1.toCharArray();
      char[] b = my_str_2.toCharArray();
      int a_len = a.length;
      int b_len = b.length;
      System.out.println("The length of the longest common subsequence is"+ " " + my_inst.subseq(a, b, a_len,       b_len));
   }
}