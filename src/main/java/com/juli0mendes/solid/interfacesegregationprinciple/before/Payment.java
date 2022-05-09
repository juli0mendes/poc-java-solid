package com.juli0mendes.solid.interfacesegregationprinciple.before;

import java.util.List;

public interface Payment {

    void init();

    Object status();

    List<Object> getPayments();
}
