package org.example;

import java.util.List;
import java.io.File;

public class MainFakeStore {
    public static void main(String[] args) {
        PlatziFakeStoreAPI fakeStoreAPI = new PlatziFakeStoreAPI();

        List<Products> products = fakeStoreAPI.getProducts();
        List<Categories> categories = fakeStoreAPI.getCategories();
        List<Users> users = fakeStoreAPI.getUsers();

        String tablesFolderPath = "src/main/java/FakeStore";
        File tablesFolder = new File(tablesFolderPath);
        if (!tablesFolder.exists()) {
            boolean created = tablesFolder.mkdirs();
            if (!created) {
                System.err.println("Failed to create folder");
                return;
            }
        }

        String productsFilePath = tablesFolderPath + "/Products.xlsx";
        ExcelWriter.exportProducts(products, productsFilePath);
        System.out.println("Products file created: " + productsFilePath);

        String categoriesFilePath = tablesFolderPath + "/Categories.xlsx";
        ExcelWriter.exportCategories(categories, categoriesFilePath);
        System.out.println("Categories file created: " + categoriesFilePath);

        String usersFilePath = tablesFolderPath + "/Users.xlsx";
        ExcelWriter.exportUsers(users, usersFilePath);
        System.out.println("Users file created: " + usersFilePath);
    }
}