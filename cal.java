public class cal {
    int fare;
    double cash;
    double discount;
    double ownmoney;
    cal(int fare,double discount,double cash,double ownmoney){
        
        this.fare = fare;
        this.discount = discount;
        this.cash = cash;
    }
    public int getfare(){
        return fare;
    }
    public double getdiscount(){
        return discount;
    }   
}
