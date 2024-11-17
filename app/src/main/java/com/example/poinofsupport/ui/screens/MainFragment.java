package com.example.poinofsupport.ui.screens;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.poinofsupport.R;
import com.example.poinofsupport.databinding.MainFragmentBinding;
import com.example.poinofsupport.model.NewsViewModel;
import com.example.poinofsupport.utils.NewsAdapter;

public class MainFragment extends Fragment {

    private MainFragmentBinding binding;
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

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = MainFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        collectNews();
        setViews(view.getContext());
        viewModel.getNews();
    }

    private void collectNews() {
        viewModel.getUiState().observe(getViewLifecycleOwner(), adapter::setNews);
    }

    private void setViews(Context context) {
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new LinearLayoutManager(context));
    }
}
