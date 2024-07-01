package org.joao.headhunter.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProfessionalAbilityEntity")
public class ProfessionalAbilityEntity extends BaseEntity {

    @Column(name = "yearsOfExperience")
    private int yearsOfExperience;

    @Column(name = "abilityLevel")
    private String abilityLevel;

    @Column(name = "certification")
    private String certification;

//    @OneToMany AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

    public ProfessionalAbilityEntity() {}

    public ProfessionalAbilityEntity(int yearsOfExperience, String abilityLevel, String certification) {
        super();
        this.yearsOfExperience = yearsOfExperience;
        this.abilityLevel = abilityLevel;
        this.certification = certification;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getAbilityLevel() {
        return abilityLevel;
    }

    public void setAbilityLevel(String abilityLevel) {
        this.abilityLevel = abilityLevel;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }
}