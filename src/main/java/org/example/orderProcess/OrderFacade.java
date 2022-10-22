package org.example.orderProcess;

public class OrderFacade {
    private BankAcount bankAcount=new BankAcount();
    private DataBase dataBase=new DataBase();
    private Warehause warehause=new Warehause();
    private  ParcelService parcelService=new ParcelService();


    public void buy(){

        bankAcount.moneyTransfer();
        dataBase.changedItemStatus();
        warehause.packItem();
        parcelService.orderDelivery();

    }
}
