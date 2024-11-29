package hu.tinder.music_shop_application.entity;

import hu.tinder.music_shop_application.entity.enums.InstrumentType;
import jakarta.persistence.*;

/**
 * https://www.baeldung.com/jpa-entities
 * @author Gergely Jakab
 */
//TODO create new table for company info
@Entity(name = "INSTRUMENT")
public class InstrumentEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private InstrumentType type;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String companyEmail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }
}
