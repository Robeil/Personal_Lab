package Experiment.Personal_Lab.Exam_Paper;

public class Address1 {

    private String street1;
    private String city1;
    private String state1;
    private int zipcode1;

    public Address1() {

    }

    public Address1(String street1, String city1, String state1, int zipcode1) {

        this.street1 = street1;
        this.city1 = city1;
        this.state1 = state1;
        this.zipcode1 = zipcode1;
    }
    public void setStreet1(String street1){
        this.street1 = street1;
    }
    public String getStreet1(){
        return this.street1;
    }

    public void setCity1(String city1){
        this.city1 = city1;
    }
    public String getCity1(){
        return this.city1;
    }

    public void setState1(String state1){
        this.state1 = state1;
    }
    public String getState1(){
        return this.state1;
    }
    public void setZipcode1(int zipcode1){
        this.zipcode1 = zipcode1;
    }
    public int getZipcode1(){
        return this.zipcode1;
    }
}
