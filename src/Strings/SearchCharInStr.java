package Strings;

public class SearchCharInStr {
    public static void main(String[] args) {
         String str="asim";
         char character='a';

        System.out.println(search(str,character));

    }

    static boolean search(String str,int key){
        if (str.length()==0){
            System.out.println("String is Empty");
             return false;
        }

//        for (int i = 0; i < str.length(); i++) {
//            if (key == str.charAt(i)) {
//                return true;
//            }
//        }

            //OR We use FOREACH
            for(char c:str.toCharArray()){
                if(key==c){
                    return true;
                }
            }


        return false;
    }

}
