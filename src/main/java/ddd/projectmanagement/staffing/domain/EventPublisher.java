package ddd.projectmanagement.staffing.domain;

public interface EventPublisher {

  void publish(DomainEvent event);
}
