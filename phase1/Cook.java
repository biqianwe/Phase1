public class Cook extends Person {
    private int cookId;


    public Cook(int cookId){
        this.cookId = cookId;
    }

    public int getCookId() {
        return cookId;
    }

    public void setCookId(int cookId) {
        this.cookId = cookId;
    }
    //cook will have a method that will subtract the value of each key(ingredient) of the hashmap in the Inventory Class when an order has to be prepared and cooked
}
