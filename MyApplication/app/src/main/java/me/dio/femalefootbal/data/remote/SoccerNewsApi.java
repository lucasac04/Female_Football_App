package me.dio.femalefootbal.data.remote;

import java.util.List;

import me.dio.femalefootbal.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SoccerNewsApi {

    @GET("news.json")
    Call<List<News>> getNews();

}
