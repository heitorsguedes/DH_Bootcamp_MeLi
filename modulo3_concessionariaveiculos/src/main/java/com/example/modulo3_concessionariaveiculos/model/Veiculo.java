package com.example.modulo3_concessionariaveiculos.model;

import java.time.LocalDate;
import java.util.List;

public class Veiculo {
    private int id;
    private String brand;
    private String model;
    private LocalDate manufacturingDate;
    private double numberOfKilometers;
    private int portas;
    private double price;
    private String currency;
    private List<Services> listServices;
    private int countOfOwners;

    public Veiculo(int id, String brand, String model, LocalDate manufacturingDate, double numberOfKilometers, int portas, double price, String currency, int countOfOwners) {
        this(brand, model, manufacturingDate, numberOfKilometers, portas, price, currency, countOfOwners);
        this.id = id;
    }

    public Veiculo(String brand, String model, LocalDate manufacturingDate, double numberOfKilometers, int portas, double price, String currency, int countOfOwners) {
        this.brand = brand;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
        this.numberOfKilometers = numberOfKilometers;
        this.portas = portas;
        this.price = price;
        this.currency = currency;
        this.countOfOwners = countOfOwners;
    }

    public Veiculo() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public double getNumberOfKilometers() {
        return numberOfKilometers;
    }

    public void setNumberOfKilometers(double numberOfKilometers) {
        this.numberOfKilometers = numberOfKilometers;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Services> getListServices() {
        return listServices;
    }

    public void setListServices(List<Services> listServices) {
        this.listServices = listServices;
    }

    public int getCountOfOwners() {
        return countOfOwners;
    }

    public void setCountOfOwners(int countOfOwners) {
        this.countOfOwners = countOfOwners;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
