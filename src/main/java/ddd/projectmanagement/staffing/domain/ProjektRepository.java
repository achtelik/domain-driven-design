package ddd.projectmanagement.staffing.domain;

import java.util.List;
import java.util.UUID;

public interface ProjektRepository {

  Projekt projektNachId(UUID projektId);

  void projektSpeichern(Projekt projekt);

  List<Projekt> alleProjekte();

  List<Projekt> projekteMitOffenerAusschreibung();
}
