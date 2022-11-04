package org.campus02.thenewsocialmedia;

public class MayBeCreditCardNumber {
    private String creditCardNumber;
    private AccessRoles neededAccessRole;

    public MayBeCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
        this.neededAccessRole = AccessRoles.ExternalUser;
    }

    public void deliverValue(AccessRoles acessor) {
        switch (acessor){
            case Platform:
            case Self:
                System.out.println(creditCardNumber);
                break;
            case ExternalUser:
            case RegisteredCustomer:
            case BestFriend:
                System.out.println("forbidden");
                break;
            default:
                System.out.println("not allowed");
        }
    }
}
