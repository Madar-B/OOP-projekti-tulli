public class Rekka extends Kulkuneuvo {

    private int matkustajat;
    private String lastinStatus;

    public Rekka(boolean paperitKunnossa, boolean kiellettyaMukana, double saapumisaika) {
        super(paperitKunnossa, kiellettyaMukana, saapumisaika);
        this.matkustajat = (int)(Math.random() * 3) + 1; // 1–3 matkustajaa
        luoLasti();
    }

    // Пустой конструктор, если нужен
    public Rekka() {
        this(true, false, 0.0);
    }

    private void luoLasti() {
        double arpa = Math.random();
        if (arpa <= 0.5) {
            lastinStatus = "normaali";
        } else if (arpa <= 0.75) {
            lastinStatus = "kiireinen";
        } else {
            lastinStatus = "laiton";
        }
    }

    public int getMatkustajat() {
        return matkustajat;
    }

    public String getLastinStatus() {
        return lastinStatus;
    }

    @Override
    public String toString() {
        return "Rekka{" +
                "matkustajat=" + matkustajat +
                ", lastinStatus='" + lastinStatus + '\'' +
                ", " + super.toString() +
                '}';
    }
}



