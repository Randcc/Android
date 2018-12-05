package gaodemap.rand.com.testlocation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static gaodemap.rand.com.testlocation.ActivityCollector.finishAll;

public class MapDetailActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapdetail);
        Button bt_map = (Button)findViewById(R.id.bt_mapdetail);
        Button bt_mapexit = (Button)findViewById(R.id.bt_mapdetailexit);


        String classRoom = getIntent().getStringExtra("class");
        TextView tv_class = (TextView)findViewById(R.id.tv_class);
        tv_class.setText(classRoom);


        bt_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //Toast.makeText(this,"back", Toast.LENGTH_SHORT).show();

        bt_mapexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAll();
            }
        });

    }
}
