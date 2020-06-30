package br.unaerp.core;

import br.unaerp.dto.CategoriesDTO;
import br.unaerp.entity.Categories;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public void OpenMenu() {
        System.out.println("****************");
        System.out.println("1. Inserir nova categoria");
        System.out.println("2. Inserir novo produto");
        System.out.println("3. Inserir novo Fornecedor");
        System.out.println("4. Exibir todas categorias");
        System.out.println("5. Exibir todos produtos");
        System.out.println("6. Exibir todos fornecedores");
        System.out.println("7. Excluir Categoria");
        System.out.println("8. Excluir Produto");
        System.out.println("9. Excluir Fornecedor");
        System.out.println("10. Exibir categoria detalahada");
        System.out.println("11. Exibir produto detalahado");
        System.out.println("11. Exibir fornecedor detalahado");
        System.out.println("****************");

        switch (new Scanner(System.in).nextInt()) {
            case 1:
                insertCategorie();
                break;
            case 2:
                insertProduct();
                break;
            case 3:
                insertSupplier();
                break;
        }
    }

    private void insertCategorie() {
        System.out.println("Category name: ");
        String name = new Scanner(System.in).next();
        System.out.println("Descricao: ");
        String desc = new Scanner(System.in).next();
        System.out.println("Picture: ");
        String pic = new Scanner(System.in).next();

        Categories obj = new Categories(name, desc, pic);
        CategoriesDTO dtoObj = new CategoriesDTO(obj.getCategoryName(), obj.getDescription(), obj.getPicture());

        CategoryBO bo = new CategoryBO(selectDB());

        try {
            bo.insert(dtoObj);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private void insertProduct() {

    }

    private void insertSupplier() {

    }

    private void showCategories() {
    }

    private void showProducts() {
    }

    private void showSuppliers() {

    }

    private void deleteCategorie() {

    }

    private void deleteProduct() {

    }

    private void deleteSupplier() {
    }

    private void updateCategorie() {

    }

    private void updateProduct() {

    }

    private void updateSuppier() {

    }

    private void showCategorie() {

    }

    private void showProduct() {
    }

    private void showSupplier() {

    }

    private int selectDB() {
        System.out.println("****************");
        System.out.println("Informe qual bando de dados deseja usar");
        System.out.println("1. MYSQL");
        System.out.println("2. SQLITE");

        return new Scanner(System.in).nextInt();
    }

}
