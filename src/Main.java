import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String name;
        String surname;
        String codClient;
        String dni;
        String poblation;
        String province;
        String postalCode;
        String email;
        String telephone;
        String productCode;
        String brand;
        String model;
        String price;
        String iva;
        String cif;
        String serviceCode;


        System.out.println("Introduce los datos del nuevo Cliente Autónomo: ");


        Scanner entry = new Scanner(System.in);
        Autonomous autonomous = new Autonomous();

        System.out.println("Nombre: ");
        autonomous.setName( name = entry.nextLine());

        System.out.println("Apellido: ");
        autonomous.setSurname( surname = entry.nextLine());

        System.out.println("Codigo de cliente: ");
        autonomous.setCodClient( codClient = entry.nextLine());

        System.out.println("Dni: ");
        autonomous.setDni( dni = entry.nextLine());

        System.out.println("Poblacion: ");
        autonomous.setPoblation( poblation = entry.nextLine());

        System.out.println("Codigo postal: ");
        autonomous.setPostalCode( postalCode = entry.nextLine());

        System.out.println("Provincia: ");
        autonomous.setProvince( province = entry.nextLine());

        System.out.println("Email: ");
        autonomous.setEmail( email = entry.nextLine());

        System.out.println("Telefono: ");
        autonomous.setTelephone( telephone = entry.nextLine());


        Bussines bussines = new Bussines();

        System.out.println("Nombre de la empresa: ");
        bussines.setName( name = entry.nextLine());

        System.out.println("Codigo de cliente: ");
        bussines.setCodClient( codClient = entry.nextLine());

        System.out.println("Cif: ");
        bussines.setCif( cif = entry.nextLine());

        System.out.println("Poblacion: ");
        bussines.setPoblation( poblation = entry.nextLine());

        System.out.println("Codigo postal: ");
        bussines.setPostalCode( postalCode = entry.nextLine());

        System.out.println("Provincia: ");
        bussines.setProvince( province = entry.nextLine());

        System.out.println("Email: ");
        bussines.setEmail( email = entry.nextLine());

        System.out.println("Telefono: ");
        bussines.setTelephone( telephone = entry.nextLine());


        Product product = new Product();

        System.out.println("Nombre del producto: ");
        product.setName( name = entry.nextLine());

        System.out.println("Codigo de producto: ");
        product.setProductCode( productCode = entry.nextLine());

        System.out.println("Modelo: ");
        product.setModel( model = entry.nextLine());

        System.out.println("Marca: ");
        product.setBrand( brand = entry.nextLine());

        System.out.println("Precio: ");
        product.setPrice( price = entry.nextLine());

        System.out.println("Iva: ");
        product.setIva( iva = entry.nextLine());


        System.out.println("Nombre del segundo producto: ");
        product.setName( name = entry.nextLine());

        System.out.println("Codigo del segundo producto: ");
        product.setProductCode( productCode = entry.nextLine());

        System.out.println("Modelo 2: ");
        product.setModel( model = entry.nextLine());

        System.out.println("Marca 2: ");
        product.setBrand( brand = entry.nextLine());

        System.out.println("Precio 2: ");
        product.setPrice( price = entry.nextLine());

        System.out.println("Iva 2: ");
        product.setIva( iva = entry.nextLine());


        Services services = new Services();

        System.out.println("Nombre del servicio: ");
        services.setName( name = entry.nextLine());

        System.out.println("Codigo del servicio: ");
        services.setServiceCode( serviceCode = entry.nextLine());

        System.out.println("Precio: ");
        services.setPrice( price = entry.nextLine());

        System.out.println("Iva: ");
        services.setIva( iva = entry.nextLine());


        System.out.println("Nombre del segundo servicio: ");
        services.setName( name = entry.nextLine());

        System.out.println("Codigo del segundo servicio: ");
        services.setServiceCode( serviceCode = entry.nextLine());

        System.out.println("Precio: ");
        services.setPrice( price = entry.nextLine());

        System.out.println("Iva: ");
        services.setIva( iva = entry.nextLine());



        InvoicePrinter invoicePrinter = new InvoicePrinter();

        System.out.println("FACTURA:");

        System.out.println("CLIENTE AUTÓNOMO:");

        System.out.println("Codigo de cliente: " +autonomous.getCodClient());
        System.out.println("Dni: " +autonomous.getDni());
        System.out.println("Nombre: " +autonomous.getName());
        System.out.println("Apellido"+autonomous.getSurname());
        System.out.println("Poblacion: " +autonomous.getPoblation());
        System.out.println("Province: " +autonomous.getProvince());
        System.out.println("Codigo postal: " +autonomous.getPostalCode());
        System.out.println("Email: " +autonomous.getEmail());
        System.out.println("Telefono: " +autonomous.getTelephone());

        System.out.println("CLIENTE EMRPRESA:");

        System.out.println("Codigo de cliente: " +bussines.getCodClient());
        System.out.println("Cif: " +bussines.getCif());
        System.out.println("Email: " +bussines.getEmail());
        System.out.println("Nombre de la empresa: " +bussines.getName());
        System.out.println("Poblacion: " +bussines.getPoblation());
        System.out.println("Codigo Postal: " +bussines.getPostalCode());
        System.out.println("Provincia: " +bussines.getProvince());
        System.out.println("Telefono: " +bussines.getTelephone());

        System.out.println("PRIMER PRODUCTO:");

        System.out.println("Codigo de producto: " +product.getProductCode());
        System.out.println("Nombre: " +product.getName());
        System.out.println("Marca: " +product.getBrand());
        System.out.println("Modelo: " +product.getModel());
        System.out.println("Precio: " +product.getPrice());
        System.out.println("Iva: " +product.getIva());

        System.out.println("SEGUNDO PRODUCTO:");

        System.out.println("Codigo de producto: " +product.getProductCode());
        System.out.println("Nombre: " +product.getName());
        System.out.println("Marca: " +product.getBrand());
        System.out.println("Modelo: " +product.getModel());
        System.out.println("Precio: " +product.getPrice());
        System.out.println("Iva: " +product.getIva());

        System.out.println("PRIMER SERVICIO:");

        System.out.println("Nombre: " +services.getName());
        System.out.println("Codigo: " +services.getServiceCode());
        System.out.println("Precio: " +services.getPrice());
        System.out.println("Iva: " +services.getIva());

        System.out.println("SEGUNDO SERVICIO:");

        System.out.println("Nombre 2: " +services.getName());
        System.out.println("Codigo 2: " +services.getServiceCode());
        System.out.println("Precio 2: " +services.getPrice());
        System.out.println("Iva 2: " +services.getIva());
    }



}