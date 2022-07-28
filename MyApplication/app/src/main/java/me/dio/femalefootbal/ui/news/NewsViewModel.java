package me.dio.femalefootbal.ui.news;

import android.nfc.Tag;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.femalefootbal.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO remover Mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária tem desfalque importante", "", "Ferroviária"));
        news.add(new News("Ferroviária joga sábado", "","Brasileirão, Ferroviária"));
        news.add(new News("Copa do Mundo Feminina está termimando","", "Copa do Mundo, Feminina"));

        this.news.setValue(news);

    }

    public LiveData<List<News>> getNews() {

        return news;
    }
}