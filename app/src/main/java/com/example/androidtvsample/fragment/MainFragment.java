package com.example.androidtvsample.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.leanback.app.BrowseSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.BaseCardView;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.Presenter;

import com.example.androidtvsample.R;
import com.example.androidtvsample.SingleRowView;

public class MainFragment extends BrowseSupportFragment {
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

     //   setUI();
        loadRows();
    }

    private void loadRows() {
        HeaderItem category1=new HeaderItem(0,"Movies");
        HeaderItem category2=new HeaderItem(1,"Shows");
        ArrayObjectAdapter arrayObjectAdapter= new ArrayObjectAdapter(new MyPresenter());
        arrayObjectAdapter.add(new SingleRowView("IronMan"," 2008 American superhero film",getContext().getResources().getDrawable(R.drawable.ironman)));
        arrayObjectAdapter.add(new SingleRowView("The Matrix","The Matrix is a 1999 science fiction action film",getContext().getResources().getDrawable(R.drawable.matrix)));
        arrayObjectAdapter.add(new SingleRowView("Avengers","Marvel's The Avengers or simply The Avengers",getContext().getResources().getDrawable(R.drawable.avengers)));


        ArrayObjectAdapter windowAdapter=new ArrayObjectAdapter(new ListRowPresenter());
        windowAdapter.add(new ListRow(category1,arrayObjectAdapter));
        setAdapter(windowAdapter);

    }

    private void setUI() {
        setTitle("Neeraj TV");
        setHeadersState(HEADERS_ENABLED);
        setBrandColor(Color.GREEN);
    }

    private class MyPresenter extends Presenter{

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent) {
            ImageCardView imageCardView=new ImageCardView(parent.getContext());
            imageCardView.setCardType(BaseCardView.CARD_TYPE_INFO_UNDER_WITH_EXTRA);
            imageCardView.setInfoVisibility(BaseCardView.CARD_REGION_VISIBLE_ACTIVATED);
            return new ViewHolder(imageCardView);
        }


        @Override
        public void onBindViewHolder(ViewHolder viewHolder, Object item) {
            SingleRowView singleRowView=(SingleRowView) item;
            ImageCardView imageCardView=((ImageCardView) viewHolder.view);
            imageCardView.setMainImage(singleRowView.getImage());
            imageCardView.setMainImageDimensions(313,176);
            imageCardView.setTitleText(singleRowView.getName());
            imageCardView.setContentText(singleRowView.getDescription());

            imageCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
                }
            });

        }

        @Override
        public void onUnbindViewHolder(ViewHolder viewHolder) {

        }
    }
}
