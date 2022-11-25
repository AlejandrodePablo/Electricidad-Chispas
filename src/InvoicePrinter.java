public class InvoicePrinter {
    private String invoiceCode;
    private Client cifNif;
    private Client name;
    private Client adress;
    private Client poblation;
    private Client province;
    private Marketable code;
    private Marketable iva;
    private Marketable price;
    private String ivaType;
    private String total;

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public Client getCifNif() {
        return cifNif;
    }

    public void setCifNif(Client cifNif) {
        this.cifNif = cifNif;
    }

    public Client getName() {
        return name;
    }

    public void setName(Client name) {
        this.name = name;
    }

    public Client getAdress() {
        return adress;
    }

    public void setAdress(Client adress) {
        this.adress = adress;
    }

    public Client getPoblation() {
        return poblation;
    }

    public void setPoblation(Client poblation) {
        this.poblation = poblation;
    }

    public Client getProvince() {
        return province;
    }

    public void setProvince(Client province) {
        this.province = province;
    }

    public Marketable getCode() {
        return code;
    }

    public void setCode(Marketable code) {
        this.code = code;
    }

    public Marketable getIva() {
        return iva;
    }

    public void setIva(Marketable iva) {
        this.iva = iva;
    }

    public Marketable getPrice() {
        return price;
    }

    public void setPrice(Marketable price) {
        this.price = price;
    }

    public String getIvaType() {
        return ivaType;
    }

    public void setIvaType(String ivaType) {
        this.ivaType = ivaType;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
