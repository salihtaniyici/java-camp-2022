public class Main {
    public static void main(String[] args) {
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.id=1;
        individualCustomer.customerNumber="23";
        individualCustomer.customerPassword="1351961test";
        individualCustomer.firstName="Salih";
        individualCustomer.lastName="TANIYICI";
        individualCustomer.email="salih.taniyici@outlook.com";
        individualCustomer.address="Paris - FRANCE";

        System.out.println(individualCustomer.firstName);

        CorporationCustomer corporationCustomer = new CorporationCustomer();
        corporationCustomer.id=2;
        corporationCustomer.customerNumber="24";
        corporationCustomer.customerPassword="648946516test";
        corporationCustomer.companyName="S Co";
        corporationCustomer.email="mail@s.co";
        corporationCustomer.address="İstanbul - Türkiye";

        System.out.println(corporationCustomer.companyName);

        IndividualManager individualManager = new IndividualManager();
        individualManager.add();
        individualManager.remove();
        individualManager.update();

        CorporationManager corporationManager = new CorporationManager();
        corporationManager.add();
        corporationManager.remove();
        corporationManager.update();


    }
}