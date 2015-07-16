package uk.co.jasonstorey.synthasaservice;

public class Main{

    private static SynthServer synthServer;

    public static void main(String[] args) {
        System.out.println("Hiya");

        synthServer = new SynthServer();

        try {
            synthServer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
