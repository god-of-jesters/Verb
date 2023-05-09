package com.example.verb.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.verb.R;
import com.example.verb.RecycleView.Adapter;
import com.example.verb.RecycleView.Item;
import com.example.verb.databinding.FragmentFriendsBinding;

import java.util.ArrayList;
import java.util.List;

public class FriendsFragment extends Fragment {

    private FragmentFriendsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFriendsBinding.inflate(inflater, container, false);
        RecyclerView recyclerView = binding.recycleView;
        List<Item> items = new ArrayList<Item>();

        items.add(new Item("John wick",12,R.drawable.a));
        items.add(new Item("Robert j",12,R.drawable.b));
        items.add(new Item("James Gunn",12,R.drawable.c));
        items.add(new Item("Ricky tales",12,R.drawable.d));
        items.add(new Item("Micky mose",12,R.drawable.e));
        items.add(new Item("John wick",12,R.drawable.a));
        items.add(new Item("Robert j",12,R.drawable.b));
        items.add(new Item("James Gunn",12,R.drawable.c));
        items.add(new Item("Ricky tales",12,R.drawable.d));
        items.add(new Item("Micky mose",12,R.drawable.e));
        items.add(new Item("John wick",12,R.drawable.a));
        items.add(new Item("Robert j",12,R.drawable.b));
        items.add(new Item("James Gunn",12,R.drawable.c));
        items.add(new Item("Ricky tales",12,R.drawable.d));
        items.add(new Item("Micky mose",12,R.drawable.e));

        Adapter adapter = new Adapter(getContext(),items);
        System.out.println(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return inflater.inflate(R.layout.fragment_friends, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}