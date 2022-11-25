public class Autonomous implements Client {
    private String name;
    private String surname;
    private String dni;
    private Integer codClient;
    private String poblation;
    private Integer  postalCode;
    private String province;
    private String email;
    private Integer telephone;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setCodClient(Integer codClient) {
        this.codClient = codClient;
    }
    @Override
    public Integer getCodClient() {
        return codClient;
    }
    public void setPoblation(String poblation) {
        this.poblation = poblation;
    }
    @Override
    public String getPoblation() {
        return poblation;
    }
    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }
    @Override
    public Integer getPostalCode() {
        return postalCode;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    @Override
    public String getProvince() {
        return province;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getEmail() {
        return email;
    }
    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
    @Override
    public Integer getTelephone() {
        return telephone;
    }
}
