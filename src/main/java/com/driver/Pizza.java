package com.driver;

public class Pizza {

    private int price;  //final price
    private int basePrice;
    private boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int extraToppingPrice;
    private int takeAwayPrice;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;

//    private int cheesePrice = 80;
//
//    private int vegBasePrice = 300;
//    private int nonVegBasePrice = 400;
//    private int vegToppingPrice = 70;
//    private int nonVegToppingPrice = 120;
//    private int takeAwayPrice = 20;
//    private int toppingPrice;

    public Pizza(boolean isVeg) {

        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeAwayAdded = false;
        this.extraCheesePrice = 80;
        this.isVeg = isVeg;

        this.takeAwayPrice = 20;
        if (isVeg == true) {
            this.price = 300;
            this.extraToppingPrice = 70;
        } else {
            this.price = 400;
            this.extraToppingPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";

//        this.isVeg = isVeg;
//        this.bill=bill;
//        basePrice = getBasePrice();
//        price = basePrice;
//        isCheeseAdded = false;
//        isExtraTopping=false;
//        isTakeAway=false;

    }

//    private int getBasePrice() {
//        return this.price;
////        return price = isVeg ? vegBasePrice : nonVegBasePrice;
//    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (isCheeseAdded == false) {
            this.price = this.price + this.extraCheesePrice;
            isCheeseAdded = true; //i don't want it to added repeatedly
        }
//        if (isCheeseAdded) {
//            isCheeseAdded = true;
//            price += cheesePrice;
//        }
    }

    public void addExtraToppings() {
        // your code goes here

        if (isToppingAdded == false) {
            this.price = this.price + this.extraToppingPrice;
            isToppingAdded = true;
        }
//        if (!isExtraTopping) {
//            this.isExtraTopping = true;
//            if (isVeg) {
//                toppingPrice = vegToppingPrice;
//                price += vegToppingPrice;
//            } else
//                toppingPrice = nonVegToppingPrice;
//            price += nonVegToppingPrice;
//        }
    }

    public void addTakeaway() {
        // your code goes here

        if (isTakeAwayAdded == false) {
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
//        if (!isTakeAway) {
//            isTakeAway = true;
//            price += takeAwayPrice;
//        }
    }

    public String getBill() {
        // your code goes here

        if (isBillGenerated == false) {
            isBillGenerated = true;

            if (isCheeseAdded == true) {
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if (isToppingAdded == true) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingPrice + "\n";
            }
            if (isTakeAwayAdded == true) {
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}
//      String var=" ";
//
//        var += "Base Price Of The Pizza: " + basePrice + "\n";
//        if (isCheeseAdded) {
//            var += "ExtraCheeseAdded: " + cheesePrice + "\n";
//        }
//        if (isExtraTopping) {
//            var += "ExtraToppingAdded: " + toppingPrice + "\n";
//        }
//        if (isTakeAway) {
//            var += "Extra paperbag price: " + takeAwayPrice + "\n";
//        }
//        var += "Total Price: " + price + "\n";
//        this.bill=var;
//        return this.bill;
//    }

