package ddd.projectmanagement.staffing.domain;

import java.util.List;
import java.util.UUID;

public class Projekt {

  private UUID id;
  private UUID kundenReferenz;
  private List<Ausschreibung> ausschreibungen;

  public UUID getId() {
    return id;
  }

  public List<Ausschreibung> getAusschreibungen() {
    return ausschreibungen;
  }

  public ProjektAbgeschlossenEvent projektAbschliessen() {
    System.out.println("Domainlogik hier!");
    return new ProjektAbgeschlossenEvent(id.toString());
  }
}
