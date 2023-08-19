package marketX;

enum Gender{
    MALE,
    FEMALE,
    OTHER
}

public class Customer {

    private String name;
    private int age;
    private String city;
    private Gender gender;
    private double purchaseAmount;

    Customer(String name, int age, String city, Gender gender, double purchaseAmount){

        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
        this.purchaseAmount = purchaseAmount;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    public String getCity(){
        return this.city;
    }

    public Gender getGender(){
        return this.gender;
    }

    public double getPurchaseAmount(){
        return this.purchaseAmount;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    public void setPurchaseAmount(double purchaseAmount)
    {
        this.purchaseAmount=purchaseAmount;
    }

}
