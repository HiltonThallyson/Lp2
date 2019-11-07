package testejavafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    Button button1;
    Button button2;
    Button button3;
    Label label;
    VBox menuVertical;
    HBox telaHorizontal;
    Image foto0 = new Image("https://abrilveja.files.wordpress.com/2016/06/quico-original.jpeg?quality=70&strip=info&resize=680,453");
    Image foto1 = new Image("https://2.bp.blogspot.com/-7Am8SSGgxoI/Tbs7t-8uoGI/AAAAAAAAOO0/NhAmU2C0lTo/s320/seu+madruga+belisca+quico.jpeg");
    Image foto2 = new Image("https://i.ytimg.com/vi/BBLBju39ewM/maxresdefault.jpg");
    Image foto3 = new Image("https://www.opovo.com.br/esportesimages/app/noticia_14970375377/2018/07/02/29193/hqdefault.jpg");
    ImageView image = new ImageView(foto0);

    int screenWidth = 900;
    int screenHeight = 800;
    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the windows");
        image.setFitHeight(screenHeight);
        image.setFitWidth(screenWidth/2);
        image.setSmooth(true);
        label = new Label();
        label.setText("Kiko");
        label.setTextFill(Color.WHITE);
        button1  = new Button();
        button1.setText("Hit");
        button1.setOnAction(e -> {label.setText("Aaah! Mamãeeeee"); label.setTextFill(Color.WHITE); image.setImage(foto1);});

        button2 = new Button();
        button2.setText("Ugly");
        button2.setOnAction(e -> {label.setText("Você não vai com a minha cara?"); label.setTextFill(Color.WHITE); image.setImage(foto2);});

        button3 = new Button();
        button3.setText("Cry");
        button3.setOnAction(e -> {label.setText("Bruuuuuu"); label.setTextFill(Color.WHITE);image.setImage(foto3);});

        menuVertical = new VBox(20);
        menuVertical.getChildren().addAll(label, button1, button2, button3);
        menuVertical.setAlignment(Pos.CENTER);
        menuVertical.setPrefWidth(screenWidth/2);

        telaHorizontal = new HBox();
        telaHorizontal.getChildren().addAll(menuVertical, image);
        telaHorizontal.setAlignment(Pos.BOTTOM_LEFT);
        StackPane layout = new StackPane();
        layout.getChildren().add(telaHorizontal);
        layout.setStyle("-fx-background-color: black");

        Scene scene1 = new Scene(layout, screenWidth, screenHeight);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

}
