package Accesmodifiers;

public class TestErisim {
    public static void main(String[] args) {
        Test testObjesi = new Test();

        System.out.println("Erisilebilen Degiskenler : " +
                testObjesi.constant + " " + testObjesi.public_variable + " " + testObjesi.protected_variable);

        System.out.println("Secret :" + testObjesi.getSecret());
    }

}
