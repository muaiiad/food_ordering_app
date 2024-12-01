package app_system.restaurants;

public class Restaurant {
    private String name_res;
    private String address_res;
    private String contctinfo;
    private Menu menu;
    public  int[] rest_reviews;


    public Restaurant(String name_res, String address_res, String contctinfo) {
        this.name_res = name_res;
        this.address_res = address_res;
        this.contctinfo = contctinfo;
    }

}
