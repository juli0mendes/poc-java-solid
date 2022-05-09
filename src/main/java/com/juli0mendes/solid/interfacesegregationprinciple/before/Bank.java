package com.juli0mendes.solid.interfacesegregationprinciple.before;

public interface Bank extends Payment {
    int getOutstandingBalance();
}
