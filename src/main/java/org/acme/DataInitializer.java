package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.transaction.Transactional;

import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
@Transactional
public class DataInitializer {
  void onStart(@Observes StartupEvent ev){
    Person.persist(new Person("Ryan", 18, "Beijing", 780));
    Person.persist(new Person("Xue", 16, "Shanghai", 781));
  }
  
}