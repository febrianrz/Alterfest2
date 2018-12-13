package alterfest.alterindonesia.com.alterfest_2.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import alterfest.alterindonesia.com.alterfest_2.Adapter.InstaStoryAdapter;
import alterfest.alterindonesia.com.alterfest_2.Adapter.TimeLineAdapter;
import alterfest.alterindonesia.com.alterfest_2.Data.InstaStoryData;
import alterfest.alterindonesia.com.alterfest_2.Data.TimeLine;
import alterfest.alterindonesia.com.alterfest_2.MainActivity;
import alterfest.alterindonesia.com.alterfest_2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {


    View rootView;
    RecyclerView rvInstaStory;
    RecyclerView rvTimeline;
    private LinearLayoutManager recylerLayoutManager;
    private LinearLayoutManager recylerLayoutManagerTimeline;
    private InstaStoryAdapter recylerAdapter;
    private TimeLineAdapter timeLineAdapter;


    public BerandaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_beranda, container, false);
        rvInstaStory = (RecyclerView) rootView.findViewById(R.id.rvInstaStory);
        rvTimeline = (RecyclerView) rootView.findViewById(R.id.rvTimeLine);
        initToolbar();
        initLayout();
        return rootView;
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
    }

    private void initLayout(){
        recylerLayoutManager    = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false);
        rvInstaStory.setLayoutManager(recylerLayoutManager);
        rvInstaStory.setHasFixedSize(true);
        recylerAdapter = new InstaStoryAdapter(getContext(),getDataInstaStory());
        rvInstaStory.setAdapter(recylerAdapter);

        //timeline
        recylerLayoutManagerTimeline    = new LinearLayoutManager(getContext());
        rvTimeline.setLayoutManager(recylerLayoutManagerTimeline);
        rvTimeline.setHasFixedSize(true);
        timeLineAdapter = new TimeLineAdapter(getContext(),getDataTimeline());
        rvTimeline.setAdapter(timeLineAdapter);
    }


    private List<InstaStoryData> getDataInstaStory(){
        List<InstaStoryData> list = new ArrayList<>();
        list.add(new InstaStoryData("Umar",R.drawable.img1));
        list.add(new InstaStoryData("Zaskia",R.drawable.img2));
        list.add(new InstaStoryData("Aisyah",R.drawable.img3));
        list.add(new InstaStoryData("Umar",R.drawable.img1));
        list.add(new InstaStoryData("Zaskia",R.drawable.img2));
        list.add(new InstaStoryData("Aisyah",R.drawable.img3));
        list.add(new InstaStoryData("Umar",R.drawable.img1));
        list.add(new InstaStoryData("Zaskia",R.drawable.img2));
        list.add(new InstaStoryData("Aisyah",R.drawable.img3));
        return list;
    }

    private List<TimeLine> getDataTimeline(){
        List<TimeLine> list = new ArrayList<>();
        list.add(new TimeLine(R.drawable.img1,
                R.drawable.timeline1,
                "100 suka",
                "umar",
                "Alterfest 2018 #CODEYOURDESTINY",
                "2 JAM YANG LALU"
        ));
        list.add(new TimeLine(R.drawable.img2,
                R.drawable.timeline2,
                "2.000 suka",
                "zaskia",
                "Alterfest 2018 #CODEYOURDESTINY",
                "2 JAM YANG LALU"
        ));
        list.add(new TimeLine(R.drawable.img3,
                R.drawable.timeline3,
                "880.000 suka",
                "aisyah",
                "Alterfest 2018 #CODEYOURDESTINY",
                "2 JAM YANG LALU"
        ));
        list.add(new TimeLine(R.drawable.img1,
                R.drawable.timeline4,
                "100 suka",
                "umar",
                "Alterfest 2018 #CODEYOURDESTINY",
                "BARU SAJA"
        ));
        list.add(new TimeLine(R.drawable.img1,
                R.drawable.timeline1,
                "700 suka",
                "febrianrz",
                "Alterfest 2018 #CODEYOURDESTINY",
                "2 JAM YANG LALU"
        ));
        list.add(new TimeLine(R.drawable.img1,
                R.drawable.timeline2,
                "85 suka",
                "febrianrz",
                "Alterfest 2018 #CODEYOURDESTINY",
                "2 JAM YANG LALU"
        ));
        list.add(new TimeLine(R.drawable.img1,
                R.drawable.timeline3,
                "900 suka",
                "febrianrz",
                "Alterfest 2018 #CODEYOURDESTINY",
                "2 JAM YANG LALU"
        ));

        return list;
    }
}
