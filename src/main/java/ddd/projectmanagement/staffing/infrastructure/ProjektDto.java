package ddd.projectmanagement.staffing.infrastructure;

import ddd.projectmanagement.staffing.domain.Ausschreibungszustand;
import ddd.projectmanagement.staffing.domain.Projekt;

public record ProjektDto(String id, long offeneAusschreibungen) {

  public ProjektDto(Projekt projekt) {
    this(projekt.getId().toString(), projekt.getAusschreibungen().stream()
        .filter(ausschreibung -> ausschreibung.getZustand().equals(
            Ausschreibungszustand.OFFEN)).count());
  }
}
