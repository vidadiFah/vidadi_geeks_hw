package hw_6.templates;

public class Skeleton extends Boss{
    private int arrowAmount;

    public int getArrowAmount() {
        return arrowAmount;
    }

    public void setArrowAmount(int arrowAmount) {
        this.arrowAmount = arrowAmount;
    }

    public String printInfo(){
        return super.printInfo() + " ARROWS_AMOUNT: " + this.getArrowAmount();
    }
}
