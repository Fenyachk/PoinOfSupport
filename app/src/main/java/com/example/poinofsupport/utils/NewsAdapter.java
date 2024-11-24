package com.example.poinofsupport.utils;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.poinofsupport.databinding.NewsItemBinding;
import com.example.poinofsupport.model.News;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private static final String DATE_FORMAT = "%02d";
    private List<News> newsList;
    private INews actions;

    public void setNews(List<News> news) {
        this.newsList = news;
    }

    public void addListeners(INews actions) {
        this.actions = actions;
    }

    public void clearListeners() {
        actions = null;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NewsViewHolder(
                NewsItemBinding.inflate(
                        LayoutInflater.from(parent.getContext()),
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        News news = newsList.get(position);
        holder.bind(news);

        if (actions != null) {
            Log.d("CheckCheck", holder.binding.getRoot() + " ");
            holder.binding.getRoot().setOnClickListener(view -> actions.onClick(news.getId()));
        }
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {
        private final NewsItemBinding binding;

        public NewsViewHolder(@NonNull NewsItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(News news) {
            binding.newsDate.setText(Utils.formattedDate(news.getDate(), DATE_FORMAT));
            binding.newsAuthor.setText(news.getAuthor());
            binding.newsTitle.setText(news.getTitle());
            binding.newsContent.setText(news.getDescriptionContent());
        }
    }
}