package khanhdang.ueh.edu.vn.btrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class NewspaperActivity extends AppCompatActivity {

    TextView tv_title;
    TextView tv_content;
    ImageView im_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newspaper);

        onconnect();

        Intent intent=getIntent();
        Newspaper newspaper=(Newspaper) intent.getSerializableExtra("newspaper");

        setvalueNP(newspaper);
    }

    private void setvalueNP(Newspaper newspaper) {
        tv_title.setText(newspaper.getTitle());
        tv_content.setText(newspaper.getContent2());
        Picasso.get().load(newspaper.getImage()).into(im_image);
    }

    private void onconnect() {
        tv_title=findViewById(R.id.tVtitle);
        tv_content=findViewById(R.id.tVcontent);
        im_image=findViewById(R.id.iView);
    }
}