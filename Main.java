
public class Main {

    public static void main(String[] args) {

        int passwordsToGenerate = 10;

        for (int i = 0; i < passwordsToGenerate; i++) {
            
            Password password = new Password();
            System.out.println("Password Number " + (i+1) + ":\t " + password.getPassword());
            

        }

    }

}
