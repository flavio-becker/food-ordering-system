package com.food.ordering.system.order.service.domain.events.publisher;

import com.food.ordering.system.order.service.domain.events.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
