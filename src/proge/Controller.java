package proge;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {


    private Stage lava;
    private Scene stseen;
    private Parent root;
    @FXML
    private Button Välju;
    @FXML
    private AnchorPane stseen1;

    //Väljumine
    public void exit(ActionEvent event){
        lava = (Stage) stseen1.getScene().getWindow();
        System.out.println("programm on lõpetanud töö.");
        lava.close();
    }



    //Vahetus esimesse stseeni (Peamenüü)
    public void vahetus1(javafx.event.ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        lava = (Stage)((Node)event.getSource()).getScene().getWindow();
        stseen = new Scene(root, 420, 500);
        lava.setScene(stseen);
        lava.show();
    }
    //Vahetus teise stseeni (Poodide valik)
    public void vahetus2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Pood.fxml"));
        lava = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stseen = new Scene(root, 420, 500);
        lava.setScene(stseen);
        lava.show();
    }


    //Kliendikaartid
    public void kliendikaarti1(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("kliendikaart1.fxml"));
        lava = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stseen = new Scene(root, 420, 500);
        lava.setScene(stseen);
        lava.show();
    }
    public void kliendikaarti2(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("kliendikaart2.fxml"));
        lava = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stseen = new Scene(root, 420, 500);
        lava.setScene(stseen);
        lava.show();
    }
    public void kliendikaarti3(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("kliendikaart3.fxml"));
        lava = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stseen = new Scene(root, 420, 500);
        lava.setScene(stseen);
        lava.show();
    }


    //POED
    //Rimi
    public void Rimisse_tava(ActionEvent event) throws Exception {
        Kood.ostukorv(Kood.tooted_failist("rimi.txt"));
        Lopp(event);
    }
    public void Rimisse_soodus(ActionEvent event) throws Exception {
        Kood.ostukorv(Kood.soodukatega(Kood.tooted_failist("rimi.txt"), 50, 5));
        Lopp(event);
    }

    //Coop
    public void Coopi_tava(ActionEvent event) throws Exception {
        Kood.ostukorv(Kood.tooted_failist("coop.txt"));
        Lopp(event);
    }
    public void Coopi_soodus(ActionEvent event) throws Exception {
        Kood.ostukorv(Kood.soodukatega(Kood.tooted_failist("rimi.txt"), 60, 5));
        Lopp(event);
    }

    //Selver
    public void Selverisse_tava(ActionEvent event) throws Exception {
        Kood.ostukorv(Kood.tooted_failist("selver.txt"));
        Lopp(event);
    }
    public void Selverisse_soodus(ActionEvent event) throws Exception {
        Kood.ostukorv(Kood.soodukatega(Kood.tooted_failist("rimi.txt"), 50, 10));
        Lopp(event);
    }

    //Lõetuseks
    public void Lopp(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("LoPP.fxml"));
        lava = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stseen = new Scene(root, 420, 500);
        lava.setScene(stseen);
        lava.show();
    }

    public void kas_soovite_tsekki(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("tsekk.fxml"));
        lava = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stseen = new Scene(root, 420, 500);
        lava.setScene(stseen);
        lava.show();
    }
}
