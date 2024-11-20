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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.poinofsupport.R;
import com.example.poinofsupport.databinding.MainFragmentBinding;
import com.example.poinofsupport.model.NewsViewModel;
import com.example.poinofsupport.utils.INews;
import com.example.poinofsupport.utils.NewsAdapter;

public class MainFragment extends Fragment implements INews {

    private MainFragmentBinding binding;
    private final NewsAdapter adapter = new NewsAdapter(this);

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

    @Override
    public void onClick(int id) {
        Log.d("CheckCheck", "Check " + id);
        FragmentManager manager = requireActivity().getSupportFragmentManager();

        Bundle bundle = new Bundle();
        bundle.putInt(DETAIL_NEWS_ID, id);

        manager.beginTransaction()
                .replace(R.id.container, DetailNewFragment.class, bundle)
                .addToBackStack(DetailNewFragment.class.getName())
                .commit();
    }

}
