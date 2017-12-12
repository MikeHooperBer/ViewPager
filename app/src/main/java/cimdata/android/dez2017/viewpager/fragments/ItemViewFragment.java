package cimdata.android.dez2017.viewpager.fragments;


import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cimdata.android.dez2017.viewpager.R;

public class ItemViewFragment extends Fragment {
    private static final String ARG_STRING_TITLE = "arg.string.title";
    TextView titleText;
    String title;


    public ItemViewFragment() {
        // Required empty public constructor
    }

    public static ItemViewFragment newInstance(String title) {

        Bundle args = new Bundle();
        args.putString(ARG_STRING_TITLE, title);
        ItemViewFragment fragment = new ItemViewFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(ARG_STRING_TITLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_item_view, container, false);

        titleText = v.findViewById(R.id.txt_fritem_title);
titleText.setText(title);
        return v;
    }

}
