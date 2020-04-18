package com.github.rj.springboot.datajpa

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Repository
class UserDao @Autowired constructor(
  @PersistenceContext
  private val em: EntityManager,
  private val repository: UserRepository
) {
  fun method() {
    println("entityManager=$em")
    println("userRepository=$repository")
  }
}