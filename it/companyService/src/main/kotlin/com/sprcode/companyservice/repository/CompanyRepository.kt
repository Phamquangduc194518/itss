package com.sprcode.companyservice.repository

import com.sprcode.companyservice.model.Company
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository  : JpaRepository<Company, Int> {

    fun findByName(name: String): Company

}