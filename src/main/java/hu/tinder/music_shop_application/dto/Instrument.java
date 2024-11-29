package hu.tinder.music_shop_application.dto;

import hu.tinder.music_shop_application.entity.enums.InstrumentType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * DTO
 * https://www.baeldung.com/spring-boot-bean-validation
 * @author Gergely Jakab
 */
public class Instrument {

    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotNull(message = "Type is mandatory")
    private InstrumentType type;

    @NotBlank(message = "Company name is mandatory")
    private String companyName;

    @NotBlank(message = "Company email is mandatory")
    @Email(message = "Invalid email format")
    private String companyEmail;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
