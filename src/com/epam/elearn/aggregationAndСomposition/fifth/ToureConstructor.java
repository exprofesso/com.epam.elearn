package com.epam.elearn.aggregationAndСomposition.fifth;

import java.util.ArrayList;

public class ToureConstructor {
    private ArrayList<Client> clients;
    private ArrayList<TourePackage> tourePackages;
    private String nameToureOperator;


    public ToureConstructor(String nameToureOperator) {
        this.nameToureOperator = nameToureOperator;
        clients = new ArrayList<>();
        tourePackages = new ArrayList<>();
    }

    void addTourePackade(TourePackage tourePackage){
        tourePackages.add(tourePackage);
    }

    void addClients(Client client, TourePackage tourePackage){
        clients.add(client);
        tourePackages.add(tourePackage);
    }
    ArrayList<TourePackage> selectByTourePackege(TourePackage tourePackage){
        ArrayList<TourePackage> tourePackages = new ArrayList<>();
        for (int i = 0; i < tourePackages.size(); i++){
            if(tourePackages.get(i).getTourPackageType().equals(tourePackage)){
                tourePackages.add(tourePackage);
            }
        }
        return tourePackages;
    }
}
