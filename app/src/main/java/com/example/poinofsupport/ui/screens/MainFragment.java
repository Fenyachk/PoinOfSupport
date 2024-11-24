package com.example.poinofsupport.ui.screens;

import static com.example.poinofsupport.ui.screens.DetailNewFragment.DETAIL_NEWS_ID;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.poinofsupport.R;
import com.example.poinofsupport.base.ui.BaseFragment;
import com.example.poinofsupport.databinding.MainFragmentBinding;
import com.example.poinofsupport.model.News;
import com.example.poinofsupport.model.NewsViewModel;
import com.example.poinofsupport.utils.INews;
import com.example.poinofsupport.utils.NewsAdapter;

import java.util.List;

public class MainFragment extends BaseFragment<MainFragmentBinding> implements INews {

    public static final String TAG = "MainFragment";

    private final NewsAdapter adapter = new NewsAdapter();
    private NewsViewModel viewModel;

    public MainFragment() {
        super(R.layout.main_fragment);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(NewsViewModel.class);
    }

    @Override
    public MainFragmentBinding getBinding(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        return MainFragmentBinding.inflate(inflater, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter.addListeners(this);
        setViews(view.getContext());
        viewModel.getNews();
    }

    private void setViews(Context context) {
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new LinearLayoutManager(context));

        collectNews(adapter::setNews);
    }

    private void collectNews(Observer<? super List<News>> observer) {
        viewModel.getUiState().observe(getViewLifecycleOwner(), observer);
    }

    @Override
    public void onPause() {
        super.onPause();
        adapter.clearListeners();
    }

    @Override
    public void onClick(int id) {
        FragmentManager manager = requireActivity().getSupportFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putInt(DETAIL_NEWS_ID, id);
        manager.beginTransaction()
                .replace(R.id.container, DetailNewFragment.class, bundle)
                .addToBackStack(null)
                .commit();

        Log.d("CheckCheck", id + " " + this + " " + manager.getFragments());
    }
}