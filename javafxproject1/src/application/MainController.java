package application;

import java.io.InputStream;

import com.abstractfactory.factory.*;
import com.abstractfactory.furniture.*;
import com.abstractfactory.manager.*;
import com.abstractfactory.patterns.singleton.LastProducedFurniture;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
	@FXML 
	public Button uretButon;
	@FXML
	public ComboBox<String> stilBox;
	@FXML
	public ComboBox<String> turBox;
	@FXML
	public ImageView mobilyaView;
	@FXML
	public Button kopyaButon;
	@FXML
	public Button sonUretimBilgiButon;
	@FXML
	public Label mobilyaLabel;
	
	  private Furniture sonUretilen = null;

	    @FXML
	    public void initialize() {
	        stilBox.getItems().addAll("Modern", "ArtDeco", "Victorian");
	        turBox.getItems().addAll("Chair", "Sofa", "CoffeeTable");

	        uretButon.setOnAction(e -> uret());
	        kopyaButon.setOnAction(e -> kopyala());
	        sonUretimBilgiButon.setOnAction(e -> sonBilgiyiGoster());
	        
	        
	        
	        
	        //testttttttt
	        InputStream test = getClass().getResourceAsStream("/images/modern_chair.png");
	        System.out.println("modern_chair.png bulundu mu? " + (test != null));
	        
	        
	        
	        
	        
	    }

	    @FXML
	    private void uret() {
	        String stil = stilBox.getValue();
	        String tur = turBox.getValue();

	        if (stil == null || tur == null) {
	            mobilyaLabel.setText("Lütfen stil ve tür seçiniz.");
	            return;
	        }

	        AbstractFurnitureFactory factory = getFactory(stil);
	        Furniture mobilya = switch (tur) {
	            case "Chair" -> factory.createChair();
	            case "Sofa" -> factory.createSofa();
	            case "CoffeeTable" -> factory.createCoffeeTable();
	            default -> null;
	        };

	        if (mobilya != null) {
	            mobilya.render();
	            sonUretilen = mobilya;

	            // Görsel gösterme
	            String imagePath = "/images/" + stil.toLowerCase() + "_" + tur.toLowerCase() + ".png";
	            InputStream imageStream = getClass().getResourceAsStream(imagePath);
	            System.out.println("Image path: " + imagePath);


	            if (imageStream != null) {
	                Image img = new Image(imageStream);
	                mobilyaView.setImage(img);
	            } else {
	                mobilyaLabel.setText("Görsel bulunamadı: " + imagePath);
	                mobilyaView.setImage(null); // varsa önceki resmi temizle
	            }
	            mobilyaLabel.setText(stil + " tarzı " + tur + " üretildi.");
	        }
	        LastProducedFurniture.getInstance().setFurniture(mobilya);//doğru yere mi yazdım
	    }

	    @FXML
	    private void kopyala() {
	        if (sonUretilen != null) {
	            Furniture kopya = sonUretilen.clone();
	            kopya.render();
	            mobilyaLabel.setText("Kopya üretildi: " + kopya.getClass().getSimpleName());
	        } else {
	            mobilyaLabel.setText("Önce bir mobilya üretmelisiniz.");
	        }
	    }

	    @FXML
	    private void sonBilgiyiGoster() {
	    	Furniture son = LastProducedFurniture.getInstance().getFurniture();
	    	if (son != null) {
	    	    mobilyaLabel.setText("Son üretilen (singleton): " + son.getClass().getSimpleName());
	    	} else {
	    	    mobilyaLabel.setText("Henüz mobilya üretilmedi.");
	    	}
	    }

	    private AbstractFurnitureFactory getFactory(String stil) {
	        return switch (stil) {
	            case "Modern" -> new ModernFurnitureFactory();
	            case "ArtDeco" -> new ArtDecoFurnitureFactory();
	            case "Victorian" -> new VictorianFurnitureFactory();
	            default -> null;
	        };
	    }
	}
