package com.pragma.powerup.foodcourtmicroservice.domain.model;

public class Restaurant {
    private Long id;
    private Long idOwner;
    private String name;
    private String address;
    private String phone;
    private String nit;
    private String urlLogo;

    public Restaurant(Long id, Long idOwner, String name, String address, String phone, String nit, String urlLogo) {
        this.id = id;
        this.idOwner = idOwner;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.nit = nit;
        this.urlLogo = urlLogo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Long idOwner) {
        this.idOwner = idOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }
}
