import java.util.Random;

abstract class Kulkuneuvo {

    private final String rekkari;
    private boolean paperitKunnossa;
    private boolean kiellettyaMukana;
    private TarkastusTila tarkastusTila;
    private double saapumisaika;
    private double poistumisaika;

    // Enum ELI JOKU VAIHTOEHDOIST
    public enum TarkastusTila {
        EI_ALKANUT, MENOSSA, VALMIS
    }

    public Kulkuneuvo(boolean paperitKunnossa,
                      boolean kiellettyaMukana,
                      double saapumisaika) {
        this.rekkari = generoiRekkari();
        this.paperitKunnossa = paperitKunnossa;
        this.kiellettyaMukana = kiellettyaMukana;
        this.saapumisaika = saapumisaika;
        this.poistumisaika = -1;  // EI OO VIEL ASETETTU
        this.tarkastusTila = TarkastusTila.EI_ALKANUT;
    }

    private String generoiRekkari() {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            sb.append((char) ('A' + rand.nextInt(26)));
        }
        sb.append("-");
        for (int i = 0; i < 3; i++) {
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }

    public String getRekkari() {
        return rekkari;
    }

    public boolean isPaperitKunnossa() {
        return paperitKunnossa;
    }

    public boolean isKiellettyaMukana() {
        return kiellettyaMukana;
    }

    public TarkastusTila getTarkastusTila() {
        return tarkastusTila;
    }

    public void setTarkastusTila(TarkastusTila tila) {
        this.tarkastusTila = tila;
    }

    public double getSaapumisaika() {
        return saapumisaika;
    }

    public double getPoistumisaika() {
        return poistumisaika;
    }

    public void setPoistumisaika(double aika) {
        this.poistumisaika = aika;
    }

    @Override
    public String toString() {
        return "Kulkuneuvo{" +
                "rekkari='" + rekkari + '\'' +
                ", paperitKunnossa=" + paperitKunnossa +
                ", kiellettyaMukana=" + kiellettyaMukana +
                ", tarkastusTila=" + tarkastusTila +
                ", saapumisaika=" + saapumisaika +
                ", poistumisaika=" + poistumisaika +
                '}';
    }
}







