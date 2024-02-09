package ddd.projectmanagement.staffing.domain;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProjektService {

  private final ProjektRepository projektRepository;
  private final EventPublisher eventPublisher;

  public ProjektService(ProjektRepository projektRepository, EventPublisher eventPublisher) {
    this.projektRepository = projektRepository;
    this.eventPublisher = eventPublisher;
  }

  public List<Projekt> rufeProjekteAb() {
    return projektRepository.alleProjekte();
  }
}
