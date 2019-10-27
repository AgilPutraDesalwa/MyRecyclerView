package id.ac.poliban.dts.agilputradesalwa.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class HeroDetail extends AppCompatActivity {
    private TextView tvNameDetail;
    private TextView tvDetailDetail;
    private ImageView imgPhotoDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_detail);

        tvNameDetail = findViewById(R.id.tv_detail_name);
        tvDetailDetail = findViewById(R.id.tv_detail_detail);
        imgPhotoDetail = findViewById(R.id.img_item_photo);

        if (getIntent().getExtras()!=null)
            showHeroDetail();
    }

    private void showHeroDetail(){
        Hero hero = (Hero) getIntent().getSerializableExtra("hero");

        Glide.with(this)
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(220, 220))
                .into(imgPhotoDetail);

        tvNameDetail.setText(hero.getName());
        tvDetailDetail.setText(hero.getDetail());
    }
}
