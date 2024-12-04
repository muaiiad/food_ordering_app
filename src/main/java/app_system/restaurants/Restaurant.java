package app_system.restaurants;

public class Restaurant {
    private String nameRes;
    private String addressRes;
    private String contactInfo;
    private Menu menu;
    private float rating;
    public  int[] rest_reviews;


    public Restaurant(String name_res, String addressRes, String contactInfo) {
        this.nameRes = name_res;
        this.addressRes = addressRes;
        this.contactInfo = contactInfo;
    }

    public String getNameRes() {
        return nameRes;
    }

    public void setNameRes(String nameRes) {
        this.nameRes = nameRes;
    }

    public String getAddressRes() {
        return addressRes;
    }

    public void setAddressRes(String addressRes) {
        this.addressRes = addressRes;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
