package com.juli0mendes.solid.singlereponsabilityprinciple.before;

public class LoanService {
    public String getLoanInfo(String loanType) {
        if (loanType.equals("professional")) {
            return "Professional Loan";
        } else if (loanType.equals("home")) {
            return "Home Loan";
        } else {
            return "Personal Loan";
        }
    }
}
