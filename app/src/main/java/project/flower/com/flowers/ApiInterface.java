package project.flower.com.flowers;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Bagdat Eshmuratov on 18.01.2018.
 * email: eshmuratovbagdat@gmail.com.
 */

public interface ApiInterface {
    @GET("feeds/flowers.json")
    Call<List<Flowers>> getFlowers();


}
