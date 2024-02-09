package ddd.projectmanagement.staffing.domain;

import java.math.BigDecimal;

public record Stundensatz(Geld menge) {

  public Geld berechneAufwaende(Stunde dauer) {
    return menge.multiplizieren(dauer);
  }


}
