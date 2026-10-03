

public class Main {
    public static void main(String[] args) {

        GeneratoreAutoIncrementale c = new GeneratoreAutoIncrementale( "ABC", 4);

        System.out.println(c.toString());
        String s = c.genera();
        System.out.println(s);
        for(int i = 0; i< 10000; i++){
            c.genera();
        }
        s = c.genera();
        System.out.println(s);

    }
}