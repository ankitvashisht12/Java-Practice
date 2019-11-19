class StringMethods{
    public static void main(String[] args) {
        String s = "Movies are Awesome !";
        StringMethods obj = new StringMethods();
        int stringLength = obj.findLength(s);
        System.out.println("length of String : "+ stringLength);
        System.out.println("All Upper Case : " + obj.convertUpperCase(s));
        System.out.println("All Lower Case : " + obj.convertLowerCase(s));
        System.out.println("'Awe' Position :" + obj.findTextPosition(s));
        System.out.println(" Concatenating first with second: " + obj.concatenateString("first", "second") );
        System.out.println(" Adding int value to String: " + obj.addIntToString(10, "20"));
    }

    int findLength(String s){
        int length = s.length();
        return length;
    }

    String convertUpperCase(String s){
        return s.toUpperCase();
    }

    String convertLowerCase(String s){
        return s.toLowerCase();
    }

    int findTextPosition(String s){
        return s.indexOf("Awe");
    }

    String concatenateString(String first, String second){
        return first.concat(second);
    }

    String addIntToString(int i , String s){
        return i+s;
    }
}