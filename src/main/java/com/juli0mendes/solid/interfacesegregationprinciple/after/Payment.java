package com.juli0mendes.solid.interfacesegregationprinciple.after;

import java.util.List;

public interface Payment {

    void init();

    Object status();

    List<Object> getPayments();

    int getTimePeriod();
}
