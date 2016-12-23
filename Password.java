
import java.util.Random;

public class Password {

    Random r = new Random();
    private String alphaUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String alphaLowercase = "abcdefghijklmnopqrstuvwxyz";
    private String alphaNumbers = "1234567890";
    private String alphaSpecial = "`!\"?$?%^&*()_-+={[}]:;@'~#|\\<,>.?/";
    private String alphaTotal = "";
    private String pass = "";
    private int length = 100;
    private boolean allowUppercase = true;
    private boolean allowLowercase = false;
    private boolean allowNumbers = true;
    private boolean allowSpecial = false;
    private boolean allowSimilar = false;

    public Password() {
        if (allowUppercase) {
            alphaTotal = alphaTotal + alphaUppercase;
        }
        if (allowLowercase) {
            alphaTotal = alphaTotal + alphaLowercase;
        }
        if (allowNumbers) {
            alphaTotal = alphaTotal + alphaNumbers;
        }
        if (allowSpecial) {
            alphaTotal = alphaTotal + alphaSpecial;
        }
        if (!allowUppercase & !allowLowercase & !allowNumbers & !allowSpecial) {
            pass = "";
            length = 0;
            System.err.println("ERROR NO CHARECTERS ENABLED");
        }
        for (int i = 0; i < length; i++) {
            pass = pass
                    + alphaTotal.charAt(r.nextInt(alphaTotal.length()));
            if (!allowSimilar) {
                char c = alphaTotal.charAt(r.nextInt(alphaTotal.length()));
                String s = Character.toString(c);
                pass = pass.replaceAll("(1|i|I|l|L|0|o|O)", s);
            }
        }

    }

    public String getPassword() {
        pass = this.pass;

        return pass;
    }
}
