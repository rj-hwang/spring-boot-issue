package com.github.rj.springboot.datajpa

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int>
