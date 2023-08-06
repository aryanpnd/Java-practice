public class AnagramCheck {
    public static boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        char[] temp = new char[sa.length];
        for(int i = 0;i<sa.length-1;i++){
            for(int j = 0;j<sa.length;j++){
                if(ta[i]==sa[i]){
                    temp[i]=ta[i];
                }
            }
        }
        if(temp.length==sa.length){
            return true;
        }else{return false;}
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
// wrong solution