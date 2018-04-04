package project.flower.com.flowers;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Bagdat Eshmuratov on 18.01.2018.
 * email: eshmuratovbagdat@gmail.com.
 */

public class Flowers {
    @SerializedName("category")
    private String category;
    @SerializedName("price")
    private double price;
    @SerializedName("instructions")
    private String instructions;
    @SerializedName("photo")
    private String photo;
    @SerializedName("name")
    private String name;
    @SerializedName("productId")
    private int id;

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getPhoto() {
        return "http://services.hanselandpetal.com/photos/" + photo;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
