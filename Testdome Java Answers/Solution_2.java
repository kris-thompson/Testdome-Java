public class UserInput {
    static String r = "";
    public static class TextInput {
        
        public void add(char a){
            r = r + a;
        }
        
        public static String getValue(){
            return r;
        }
            
    }

    public static class NumericInput extends TextInput {
        public void add(char a){
            if (a >= '0' && a <= '9' ){
                r = r + a;
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}