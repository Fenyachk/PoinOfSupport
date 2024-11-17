package com.example.poinofsupport.utils;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.poinofsupport.R;
import com.example.poinofsupport.model.News;
import com.example.poinofsupport.ui.screens.DetailNewFragment;
import com.example.poinofsupport.ui.screens.MainFragment;

import java.time.LocalDateTime;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private static final String DATE_FORMAT = "%02d";
    private List<News> newsList;


    public void setNews(List<News> news) {
        this.newsList = news;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        News news = newsList.get(position);
        bind(news, holder);

        holder.title.setOnClickListener(v -> {

        });
    }

    private void bind(News news, NewsViewHolder holder) {
        holder.date.setText(formattedDate(news.getDate()));
        holder.author.setText(news.getAuthor());
        holder.title.setText(news.getTitle());
        holder.content.setText(news.getDescriptionContent());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {
        TextView date, author, title, content;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.news_date);
            author = itemView.findViewById(R.id.news_author);
            title = itemView.findViewById(R.id.news_title);
            content = itemView.findViewById(R.id.news_content);
        }
    }

    private String formattedDate(LocalDateTime date) {
        int day = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            day = date.getDayOfMonth();
        }
        String dayWithLeadingZero = String.format(DATE_FORMAT, day);
        int month = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            month = date.getMonthValue();
        }
        String monthWithLeadingZero = String.format(DATE_FORMAT, month);
        int year = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            year = date.getYear();
        }
        int hour = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            hour = date.getHour();
        }
        String hourWithLeadingZero = String.format(DATE_FORMAT, hour);
        int minute = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            minute = date.getMinute();
        }
        String minuteWithLeadingZero = String.format(DATE_FORMAT, minute);
        return dayWithLeadingZero + "." + monthWithLeadingZero + "." + year + " " + hourWithLeadingZero + ":" + minuteWithLeadingZero;
    }
}