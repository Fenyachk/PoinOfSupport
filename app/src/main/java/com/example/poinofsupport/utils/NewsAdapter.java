package com.example.poinofsupport.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.poinofsupport.R;
import com.example.poinofsupport.model.News;

import java.util.List;

public
class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

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
    }

    private void bind(News news, NewsViewHolder holder) {
        holder.date.setText(news.getDate());
        holder.author.setText(news.getAuthor());
        holder.title.setText(news.getTitle());
        holder.content.setText(news.getContent());
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
}