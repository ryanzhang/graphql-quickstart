package org.acme;

import java.util.List;

import javax.transaction.Transactional;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
@Transactional
public class PersonGraphQLApi {

  @Query("person")
  @Description("输入personId 得到Person")
  public Person getPerson(Long personId) {
    return Person.findById(personId);
  }

  @Query
  public List<Person> getAllPerson(){
    return Person.listAll();
  }
  
}