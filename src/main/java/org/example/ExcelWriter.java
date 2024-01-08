package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
public class ExcelWriter {

    public static void exportProducts(List<Products> products, String filePath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Products");

            Row headRow = sheet.createRow(0);
            headRow.createCell(0).setCellValue("ID");
            headRow.createCell(1).setCellValue("Title");
            headRow.createCell(2).setCellValue("Price");
            headRow.createCell(3).setCellValue("Description");
            headRow.createCell(4).setCellValue("Category ID");
            headRow.createCell(5).setCellValue("Category Name");
            headRow.createCell(6).setCellValue("Category Image");
            headRow.createCell(7).setCellValue("Images");

            int rowNum = 1;
            for (Products product : products) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(product.getId());
                row.createCell(1).setCellValue(product.getTitle());
                row.createCell(2).setCellValue(product.getPrice());
                row.createCell(3).setCellValue(product.getDescription());
                Categories category = product.getCategory();
                row.createCell(4).setCellValue(category.getId());
                row.createCell(5).setCellValue(category.getName());
                row.createCell(6).setCellValue(category.getImage());
                row.createCell(7).setCellValue(String.join(", ", product.getImages()));
            }

            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exportCategories(List<Categories> categories, String filePath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Categories");

            Row headRow = sheet.createRow(0);
            headRow.createCell(0).setCellValue("ID");
            headRow.createCell(1).setCellValue("Name");
            headRow.createCell(2).setCellValue("Image");

            int rowNum = 1;
            for (Categories category : categories) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(category.getId());
                row.createCell(1).setCellValue(category.getName());
                row.createCell(2).setCellValue(category.getImage());
            }

            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exportUsers(List<Users> users, String filePath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Users");

            Row headRow = sheet.createRow(0);
            headRow.createCell(0).setCellValue("ID");
            headRow.createCell(1).setCellValue("Email");
            headRow.createCell(2).setCellValue("Password");
            headRow.createCell(3).setCellValue("Name");
            headRow.createCell(4).setCellValue("Role");
            headRow.createCell(5).setCellValue("Avatar");

            int rowNum = 1;
            for (Users user : users) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(user.getId());
                row.createCell(1).setCellValue(user.getEmail());
                row.createCell(2).setCellValue(user.getPassword());
                row.createCell(3).setCellValue(user.getName());
                row.createCell(4).setCellValue(user.getRole());
                row.createCell(5).setCellValue(user.getAvatar());
            }

            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}