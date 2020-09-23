package kr.teamcadi.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

// 커스텀 어댑터 클래스
class CustomAdapter extends BaseAdapter
{
    ArrayList<CustomItem> items;
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(Context context, ArrayList<CustomItem> items)
    {
        this.items = new ArrayList<CustomItem>();
        this.items.addAll(items);
        this.context = context;
        this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    // LayoutInflater : 기존 레이아웃 위에 우리가 만든 껍데기를 깔아주는 역할을 담당함


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}