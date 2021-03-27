package com.epam.elearn.aggregationAndСomposition.fifth;

public enum TourPackageType {
    SCIENTIFIC,
    FITNESS,
    SHOPPING,
    EXCURSION,
    CRUISE;

    public String toString() {
        return super.toString().toLowerCase();
    }
}
