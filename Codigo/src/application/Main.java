package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crear la barra de menú
        MenuBar menuBar = new MenuBar();

        // Crear los menús principales
        Menu fileMenu = new Menu("Archivo");
        Menu editMenu = new Menu("Editar");
        Menu helpMenu = new Menu("Ayuda");

        // Crear los elementos de menú
        MenuItem newMenuItem = new MenuItem("Nuevo");
        MenuItem openMenuItem = new MenuItem("Abrir");
        SeparatorMenuItem separator1 = new SeparatorMenuItem();
        MenuItem saveMenuItem = new MenuItem("Guardar");
        MenuItem exitMenuItem = new MenuItem("Salir");

        MenuItem cutMenuItem = new MenuItem("Cortar");
        MenuItem copyMenuItem = new MenuItem("Copiar");
        MenuItem pasteMenuItem = new MenuItem("Pegar");
        SeparatorMenuItem separator2 = new SeparatorMenuItem();
        MenuItem preferencesMenuItem = new MenuItem("Preferencias");

        MenuItem aboutMenuItem = new MenuItem("Acerca de");

        // Agregar los elementos al menú correspondiente
        fileMenu.getItems().addAll(newMenuItem, openMenuItem, separator1, saveMenuItem, exitMenuItem);
        editMenu.getItems().addAll(cutMenuItem, copyMenuItem, pasteMenuItem, separator2, preferencesMenuItem);
        helpMenu.getItems().addAll(aboutMenuItem);

        // Agregar los menús a la barra de menú
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        // Definir las acciones para los elementos de menú
        newMenuItem.setOnAction(event -> System.out.println("Se seleccionó 'Nuevo'"));
        openMenuItem.setOnAction(event -> System.out.println("Se seleccionó 'Abrir'"));
        saveMenuItem.setOnAction(event -> System.out.println("Se seleccionó 'Guardar'"));
        exitMenuItem.setOnAction(event -> primaryStage.close());
        cutMenuItem.setOnAction(event -> System.out.println("Se seleccionó 'Cortar'"));
        copyMenuItem.setOnAction(event -> System.out.println("Se seleccionó 'Copiar'"));
        pasteMenuItem.setOnAction(event -> System.out.println("Se seleccionó 'Pegar'"));
        preferencesMenuItem.setOnAction(event -> System.out.println("Se seleccionó 'Preferencias'"));
        aboutMenuItem.setOnAction(event -> System.out.println("Se seleccionó 'Acerca de'"));

        // Crear el layout principal
        BorderPane root = new BorderPane();

        // Agregar la etiqueta "BIENVENIDOS HUMANOS" en la parte superior
        Label welcomeLabel = new Label("BIENVENIDOS HUMANOS");
        welcomeLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        welcomeLabel.setAlignment(Pos.CENTER);
        HBox topBox = new HBox(welcomeLabel);
        topBox.setAlignment(Pos.CENTER);
        root.setTop(topBox);

        // Agregar la imagen de fondo
        Image backgroundImage = new Image("file:///C:/Users/david/OneDrive/Fotos/Colsul.jpeg");
        BackgroundImage background = new BackgroundImage(
            backgroundImage,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.DEFAULT,
            new BackgroundSize(100, 100, true, true, true, false)
        );
        root.setBackground(new javafx.scene.layout.Background(background));

        welcomeLabel = new Label("                            BIENVENIDOS HUMANOS");
        welcomeLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        VBox centerBox = new VBox(welcomeLabel);
        root.setCenter(centerBox);

        Button nextButton = new Button("Continuar");
        HBox bottomBox = new HBox(nextButton);
        bottomBox.setAlignment(Pos.BOTTOM_RIGHT);
        root.setBottom(bottomBox);

        root.setTop(menuBar);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Consultorio Online");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
