package com.example.InstitutionManagement.repository

import com.example.InstitutionManagement.model.Institution
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface InstitutionRepository: JpaRepository<Institution, Long>