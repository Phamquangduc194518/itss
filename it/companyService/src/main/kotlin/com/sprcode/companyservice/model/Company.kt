package com.sprcode.companyservice.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table
public data class Company(
        @Id
        @GeneratedValue
        val id: Int = 0,
        val name: String = "",
        val address: String = "",
        val quantity: Int=0, // có bao nhiêu chi nhánh
        val nEmployees: Int=0
)
