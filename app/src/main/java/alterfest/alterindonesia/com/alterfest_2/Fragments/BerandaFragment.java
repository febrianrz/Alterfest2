package alterfest.alterindonesia.com.alterfest_2.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alterfest.alterindonesia.com.alterfest_2.MainActivity;
import alterfest.alterindonesia.com.alterfest_2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {


    View rootView;

    public BerandaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_beranda, container, false);
        initToolbar();
        return rootView;
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
//        toolbar.setNavigationIcon(R.drawable.ic_menu);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
//        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Toolbar");
//        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



}
