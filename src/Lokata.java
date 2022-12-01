public class Lokata {
    private int nrLokaty;
    private double kwota;
    boolean isBrokenUp;

    public Lokata() {
        nrLokaty = 0;
        kwota = 0;
        isBrokenUp = false;
    }

    public Lokata(int nrLokaty, double kwota, boolean isBrokenUp) {
        this.nrLokaty = nrLokaty;
        this.kwota = kwota;
        this.isBrokenUp = isBrokenUp;
    }

    public int getNrLokaty() {
        return nrLokaty;
    }

    public void setNrLokaty(int nrLokaty) {
        this.nrLokaty = nrLokaty;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public boolean isBrokenUp() {
        return isBrokenUp;
    }

    public void setBrokenUp(boolean brokenUp) {
        isBrokenUp = brokenUp;
    }

    @Override
    public String toString() {
        return "Lokata{" +
                "nrLokaty=" + nrLokaty +
                ", kwota=" + kwota +
                ", isBrokenUp=" + isBrokenUp +
                '}';
    }
}
