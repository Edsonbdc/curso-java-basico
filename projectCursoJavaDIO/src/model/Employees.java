package model;

public class Employees {
    private String name, dataOfBirth, cpf, rg, address, city, state, contact1, contact2;

    public Employees(String name, String dataOfBirth, String cpf, String rg, String address, String city, String state,
            String contact1, String contact2) {
        this.name = name;
        this.dataOfBirth = dataOfBirth;
        this.cpf = cpf;
        this.rg = rg;
        this.address = address;
        this.city = city;
        this.state = state;
        this.contact1 = contact1;
        this.contact2 = contact2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setdataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getdataOfBirth() {
        return this.dataOfBirth;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return this.rg;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
    public void setContacte1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContacte1() {
        return this.contact1;
    }

        public void setContacte2(String contact2) {
        this.contact2 = contact2;
    }

    public String getContacte2() {
        return this.contact2;
    }
}
