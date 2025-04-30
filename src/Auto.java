
public class Auto extends Kulkuneuvo {

    private int matkustajat;

    public Auto(boolean paperitKunnossa, boolean kiellettyaMukana, double saapumisaika) {
        super(paperitKunnossa, kiellettyaMukana, saapumisaika);
        this.matkustajat = (int)(Math.random() * 5) + 1; // 1–5 пассажиров
    }

    public int getMatkustajat() {
        return matkustajat;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "matkustajat=" + matkustajat + ", " +
                super.toString() +
                '}';
    }
}

