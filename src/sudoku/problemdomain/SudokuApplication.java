package sudoku.problemdomain;
import javafx.application.Application;
import java.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SudokuApplication extends Application {
    private IUserInterfaceContract.View uiImpl;
    @Override
    public void start(Stage primarystage) throws Exception{
      uiImpl = new UserInterfaceImpl(primaryStage);
      try {
          SudokuBuildLogic.build(uiImpl);
      } catch (IOException e) {
          e.printStackTrace();
          throw e;

      }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
