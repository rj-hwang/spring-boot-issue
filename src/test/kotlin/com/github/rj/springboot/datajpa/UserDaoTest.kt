package com.github.rj.springboot.datajpa

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig

@SpringJUnitConfig(UnitTestConfiguration::class)
@DataJpaTest
class UserDaoTest @Autowired constructor(
  val userDao: UserDao
) {
  @Test
  fun test() {
    println("test userDao.method()")
    userDao.method()
  }
}