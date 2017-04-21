package com.paulraven.imggallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.ImgGallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<ImgList> imgLists = prepareData();
        imgAdapter adapter = new imgAdapter (getApplicationContext(), imgLists);
        recyclerView.setAdapter(adapter);



    }
    private final String my_image_titles[] = {
            "MyImageID1",
            "MyImageID2",
            "MyImageID3",
            "MyImageID4",
            "MyImageID5",
            "MyImageID6",
            "MyImageID7",
            "MyImageID8",
            "MyImageID9",
            "MyImageID10",
            "MyImageID11",
            "MyImageID12",
            "MyImageID13",
    };

    private final Integer my_image_ids[] = {
            R.drawable.my_image_id1,
            R.drawable.my_image_id2,
            R.drawable.my_image_id3,
            R.drawable.my_image_id4,
            R.drawable.my_image_id5,
            R.drawable.my_image_id6,
            R.drawable.my_image_id7,
            R.drawable.my_image_id8,
            R.drawable.my_image_id9,
            R.drawable.my_image_id10,
            R.drawable.my_image_id11,
            R.drawable.my_image_id12,
            R.drawable.my_image_id13,
    };
    private ArrayList<ImgList> prepareData() {
        ArrayList<ImgList> image = new ArrayList<>();
        for (int i = 0; i < my_image_titles.length; i++) {
            ImgList imgList = new ImgList();
            imgList.setImage_title(my_image_titles[i]);
            imgList.setImage_id(my_image_ids[i]);
            image.add(imgList);
        }
        return image;
    }
}
