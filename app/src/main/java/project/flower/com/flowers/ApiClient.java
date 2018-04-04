package project.flower.com.flowers;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Bagdat Eshmuratov on 18.01.2018.
 * email: eshmuratovbagdat@gmail.com.
 */

public class ApiClient {
    private static final String BASE_URL="http://services.hanselandpetal.com/";
    private static ApiInterface service;
    private static Retrofit retrofit;

    public static ApiInterface getApiInterface() {
        if (service == null) {
            service = getClient().create(ApiInterface.class);
        }
        return service;
    }

    private static Retrofit getClient() {
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
