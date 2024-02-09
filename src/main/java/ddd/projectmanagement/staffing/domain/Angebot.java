package ddd.projectmanagement.staffing.domain;

import java.util.UUID;

public class Angebot {

  private Angebotszustand zustand;
  private UUID mitarbeiterReferenz;
  private String notiz;

  public Angebot(Angebotszustand zustand, UUID mitarbeiterReferenz) {
    if(zustand == null) throw new IllegalArgumentException("zustand cannot be null");
    if(mitarbeiterReferenz == null) throw new IllegalArgumentException("mitarbeiterReferenz cannot be null");

    this.zustand = zustand;
    this.mitarbeiterReferenz = mitarbeiterReferenz;
    notiz = "";
  }

  public void dokumentiereAblehnung(String notiz) {
    this.notiz = notiz;
    zustand = Angebotszustand.ABGELEHNT;
  }
}
