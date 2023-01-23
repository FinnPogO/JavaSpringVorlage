package gymhum.de.model;

public class Film {
    String titel;
    int fsk;
    int leange;



    public Film(String titel, int fsk, int leange){
        setFsk(fsk);
        setLeange(leange);
        setTitel(titel);
    }


    public void setFsk(int fsk) {
        this.fsk = fsk;
    }
    public int getFsk() {
        return fsk;
    }
    public void setLeange(int leange) {
        this.leange = leange;
    }
    public int getLeange() {
        return leange;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public String getTitel() {
        return titel;
    }
    
}
