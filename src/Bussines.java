public class Bussines implements Client{
    private String name;
    private String cif;
    private String codClient;
    private String poblation;
    private String postalCode;
    private String province;
    private String email;
    private String telephone;

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
    public void setCodClient(String codClient) {
        this.codClient = codClient;
    }
    @Override
    public String getCodClient() {
        return codClient;
    }
    public void setPoblation(String poblation) {
        this.poblation = poblation;
    }
    @Override
    public String getPoblation() {
        return poblation;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    @Override
    public String getPostalCode() {
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
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    @Override
    public String getTelephone() {
        return telephone;
    }
}
