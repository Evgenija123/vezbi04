package vezbi;

public class Main {

    public static void main(String[] args) {
        Covek c = new Covek ();
        c.setIme("Elena");
        c.setPrezime("Todorovska");
        c.setEmbg("5510773411003");

        System.out.println("Ime: " + c.getIme());
        System.out.println("Prezime: " + c.getPrezime());
        System.out.println("EMBG: " + c.getEmbg());
    }
}