import java.util.ArrayList;

/**
* Luokka mallintaa yksinkertaista muistivihkoa, jolla on nimi, omistaja ja lista muistiinpanoista merkkijonomuodossa.
*/
public class Muistivihko {
    private String nimi;
    private String omistaja;
    private ArrayList<String> muistiinpanot;

    /**
    * Luo uuden muistivihkon annetulla nimellä ja omistajalla.
    * @param nimi muistivihkon nimi
    * @param omistaja muistivihkon omistajan nimi
    */
    public Muistivihko(String nimi, String omistaja) {
        this.nimi = nimi;
        this.omistaja = omistaja;
        muistiinpanot = new ArrayList<>();
    }

    /**
    * Palauttaa muistivihkon nimen.
    * @return muistivihkon nimi
    */
    public String getNimi() {
        return nimi;
    }

    /**
    * Asettaa muistivihkon nimen.
    * @param nimi uusi nimi
    */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /**
    * Palauttaa muistivihkon omistajan nimen.
    * @return muistivihkon omistajan nimi
    */
    public String getOmistaja() {
        return omistaja;
    }

    /**
    * Asettaa muistivihkon omistajan nimen.
    * @param omistaja uusi omistaja
    */
    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }

    /**
    * Lisää uuden muistiinpanon vihkoon.
    * @param viesti uuden muistiinpanon teksti
    */
    public void lisaaMuistiinpano(String viesti) {
        this.muistiinpanot.add(viesti);
    }

    /**
    * Palauttaa muistiinpanojen lukumäärän.
    * @return muistiinpanojen määrä
    */
    public int muistiinpanoja() {
        return muistiinpanot.size();
    }

    /**
    * Tulostaa kaikki muistiinpanot omille riveilleen.
    */
    public void tulostaMuistiinpanot() {
        for(String viesti : muistiinpanot) {
            System.out.println(viesti);
        }
    }
}
