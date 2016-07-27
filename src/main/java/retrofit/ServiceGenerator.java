package retrofit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class ServiceGenerator {
    private ServiceGenerator() {
    }

    public static <S> S createService(Class<S> serviceClass, String baseUrl) {

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
          /*  @Override*/
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                request.newBuilder().addHeader("Content-Type", "application/json");

                // Do anything with response here

                return chain.proceed(request);
            }
        }).build();
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create()).client(client);
        Retrofit adapter = builder.build();
        return adapter.create(serviceClass);
    }
}
