package vezbi;

public class Main {

    public static void main(String[] args) {
        Restoran rest = new Restoran();
        rest.setIme("Korzo");
        rest.setLokacija("Bitola");
        rest.setTelefon("047-222-274");
        rest.setBrSedishta(70);

        System.out.println("Kontakt telefonot na restoranot " + rest.getIme() + " koj se naogja vo " + rest.getLokacija() + " e: " + rest.getTelefon());
        System.out.println("Restoranot ima kapacitet od: " + rest.getBrSedishta() + " sedista.");
    }}
