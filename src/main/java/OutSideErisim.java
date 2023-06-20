public class OutSideErisim extends Test {
    private String Protected_Variable;
    private String Public_variable;

    public static void main(String[] args) {
        OutSideErisim outsideErisim = new OutSideErisim();

        System.out.println("Erisilebilen Degiskenler : " +
                outsideErisim.Protected_Variable + outsideErisim.Public_variable);


    }
}
