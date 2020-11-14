package Window;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

    Line makeLine(double x, double y, double x2, double y2){
        Line line = new Line();
        line.setStartX(x);
        line.setStartY(y);
        line.setEndX(x2);
        line.setEndY(y2);
        return line;
    }

    Text makeText(String message,int x, int y){
        Text text = new Text();
        text.setFont(new Font(24));
        text.setX(x);
        text.setY(y);
        text.setText(message);
        System.out.println(message);
        return text;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        int[] dimensions = {1000,600};
        Line line = makeLine(0,100,dimensions[0],100);
        Text text = makeText("This is my new Java Application!", dimensions[0]/2, 70);

        Group root = new Group();
        //FXMLLoader.load(getClass().getResource("sample.fxml"));

        ObservableList groups = root.getChildren();

        //groups.add(text); //Text not working
        groups.add(line);


        Scene primaryScene = new Scene(root, dimensions[0],dimensions[1]);
        primaryScene.setFill(Color.ALICEBLUE);
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
