public class strBuilder {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str); // hello

        //char at index
        System.out.println(str.charAt(0)); //h
        
        //replace char at index
        str.setCharAt(0,'m');
        System.out.println(str); // mello

        //insert char at index
        str.insert(0,"marsh");
        System.out.println(str); //marshmello

        //delete char at index
        str.delete(5,10);
        System.out.println(str); // marsh

        //append char at index
        str.append("mello");
        System.out.println(str); //marshmello
         
    }
}
