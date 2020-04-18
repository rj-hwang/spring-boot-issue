package com.github.rj.springboot.datajpa

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User(
  @Id
  val id: Int,
  val name: String
)