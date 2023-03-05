package com.sprcode.companyservice.controller

import com.sprcode.companyservice.model.Company
import com.sprcode.companyservice.repository.CompanyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class CompanyController {
    @Autowired
    lateinit var companyRepository: CompanyRepository;

    @PostMapping("/saveCompany")
    fun save(@RequestBody company: Company): String {
        companyRepository.save(company);
        return "company details saved..";
    }

    @GetMapping("/getAll")
    fun getAllCompany(): List<Company>{
        return companyRepository.findAll();
    }

    @GetMapping("/getCompany/{name}")
    fun getCompany(@PathVariable name: String): Company {
        return companyRepository.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    fun deleteCompany(@PathVariable id: Int): String{
        companyRepository.deleteById(id);
        return "deleted..";
    }
}