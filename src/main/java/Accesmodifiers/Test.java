package Accesmodifiers;

public class Test {
    public String public_variable = "Public Degisken";
    protected String protected_variable = "Protected Degisken";
    String constant = "Default Degisken";
    private String secret = "Private Degisken";


    public String getGizli() {
        return this.secret;
    }

    public static void main(String[] args) {

        Test testObjesi = new Test();

        System.out.println("Erisilebilen Degiskenler : " + testObjesi.secret +
                testObjesi.constant + " " + testObjesi.public_variable  + testObjesi.protected_variable);

    }

    public int getSecret() {
        return 0;
    }
}