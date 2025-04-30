public class Pyora extends Kulkuneuvo {

    private int matkustajat;

    public Pyora(boolean paperitKunnossa, boolean kiellettyaMukana, double saapumisaika) {
        super(paperitKunnossa, kiellettyaMukana, saapumisaika);
        this.matkustajat = (int)(Math.random() * 2) + 1; // 1–2 matkustajaa
    }

    // Пустой конструктор, если нужен
    public Pyora() {
        this(true, false, 0.0);
    }

    public int getMatkustajat() {
        return matkustajat;
    }

    @Override
    public String toString() {
        return "Pyora{" +
                "matkustajat=" + matkustajat +
                ", " + super.toString() +
                '}';
    }
}
