package entities;

public class Triangle {
    //Successfully created project 'curso_programacao' on GitHub, but initial commit failed:
    // Author identity unknown *** Please tell me who you are. Run git config --global user.email "you@example.com" git config --global user.name "Your Name" to set your account's default identity.
    // Omit --global to set the identity only in this repository. unable to auto-detect email address (got 'cazoo@ARCUGODOY.(none
    public double a;
    public double b;
    public double c;

    public double area(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void large(double value) {
        System.out.printf("Large area: %.4f", value);
    }

    public static double max(double a, double b) {
        double aux;
        if (a > b) {
            aux = a;
        } else {
            aux = b;
        }
        return aux;
    }
}

