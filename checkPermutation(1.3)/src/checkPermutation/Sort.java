package checkPermutation;

public class Sort {

public static String sort(String s){
  char[]content=s.toCharArray();
  java.util.Arrays.sort(content);
  return new String(content);
  }
  
public static boolean permutation(String s, String t){
  if(s.length()!=t.length()){
    return false;
  }
  return sort(s).equals(sort(t));
}

public static void main(String[] args){
  System.out.println(permutation("ab", "ba"));
}

}
