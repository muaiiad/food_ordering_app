package app_system.accounts;

import java.util.ArrayList;

public class AccountsManager
{
    //this includes all the accounts imported from the users and admins file.

    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<Admin> admins = new ArrayList<Admin>();

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        AccountsManager.users = users;
    }

    public static ArrayList<Admin> getAdmins() {
        return admins;
    }

    public static void setAdmins(ArrayList<Admin> admins) {
        AccountsManager.admins = admins;
    }
}
