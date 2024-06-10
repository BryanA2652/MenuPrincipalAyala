/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package menuprincipalayala;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author ROCIO
 */
public class MenuPrincipalAyala extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Creando la barra de menú principal
        MenuBar menuBar = new MenuBar();

        // Añadir menús principales
        Menu archivoMenu = new Menu("Archivo");
        Menu editarMenu = new Menu("Editar");
        Menu ayudaMenu = new Menu("Ayuda");

        // Añadir elementos de menú (opciones) en cada menu principal
        MenuItem nuevomenu = new MenuItem("Nuevo");
        MenuItem abrirmenu = new MenuItem("Abrir");
        MenuItem guardarmenu = new MenuItem("Guardar");
        MenuItem guardarComo = new MenuItem("Guardar como");
        MenuItem salir = new MenuItem("Salir");

        MenuItem opcioncortar = new MenuItem("Cortar");
        MenuItem opcioncopiar = new MenuItem("Copiar");
        MenuItem opcionpegar = new MenuItem("Pegar");
        MenuItem seleccionartodo = new MenuItem("Seleccionar todo");

        MenuItem AcercaDe = new MenuItem("Acerca de");
        MenuItem Ayuda = new MenuItem("Ayuda en línea");

        // Utilizando separadores
        archivoMenu.getItems().addAll(nuevomenu, abrirmenu, guardarmenu, guardarComo,
                new SeparatorMenuItem(), salir);
        editarMenu.getItems().addAll(opcioncortar, opcioncopiar, opcionpegar, seleccionartodo);
        ayudaMenu.getItems().addAll(AcercaDe, Ayuda);

        menuBar.getMenus().addAll(archivoMenu, editarMenu, ayudaMenu);
        
        // Definiendo acciones para cada elemento del menu
        nuevomenu.setOnAction(ActionEvent -> System.out.println("Nuevo archivo"));
        abrirmenu.setOnAction(ActionEvent -> System.out.println("Abrir archivo"));
        guardarmenu.setOnAction(ActionEvent -> System.out.println("Guardar archivo"));
        guardarComo.setOnAction(ActionEvent -> System.out.println("Guardar archivo como"));
        salir.setOnAction(ActionEvent -> primaryStage.close());

        opcioncortar.setOnAction(ActionEvent -> System.out.println("Cortando hoja"));
        opcioncopiar.setOnAction(ActionEvent -> System.out.println("Copiando texto"));
        opcionpegar.setOnAction(ActionEvent -> System.out.println("Pegando imagen"));
        seleccionartodo.setOnAction(ActionEvent -> System.out.println("Seleccionar todo el texto"));

        AcercaDe.setOnAction(ActionEvent -> System.out.println("Acerca de"));
        Ayuda.setOnAction(ActionEvent -> System.out.println("Ayuda en línea"));


        //Layout (BorderPane)
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane, 500, 450);
        
        primaryStage.setTitle("Barra de menu - Bryan Ayala");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
