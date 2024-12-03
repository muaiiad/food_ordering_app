package app_system.restaurants;

public class Restaurant {
    private String nameRes;
    private String addressRes;
    private String contactInfo;
    private Menu menu;
    public  int[] rest_reviews;


    public Restaurant(String name_res, String addressRes, String contactInfo) {
        this.nameRes = name_res;
        this.addressRes = addressRes;
        this.contactInfo = contactInfo;
    }

}
