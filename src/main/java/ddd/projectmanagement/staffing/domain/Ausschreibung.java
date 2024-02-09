package ddd.projectmanagement.staffing.domain;

import java.util.List;

public class Ausschreibung {

  private String ersuchen;
  private String beschreibung;
  private String vertragstext;
  private Stundensatz stundensatz;
  private Dauer dauerDesVorgesehenenEinsatzes;
  private Dauer dauerDerBewerbungssuche;
  private Ausschreibungszustand zustand;
  private List<Angebot> angebote;

  public Ausschreibungszustand getZustand() {
    return zustand;
  }
}
