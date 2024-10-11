package com.example;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.first.R;
import com.example.first.Student;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Student> {
    private Activity context;
    private List<Student> studentList;

    public CustomAdapter(Activity context, List<Student> studentList) {
        super(context, R.layout.sample_layout, studentList);
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {


        LayoutInflater layoutInflater = context.getLayoutInflater();
       View view =  layoutInflater.inflate(R.layout.sample_layout,null,true);

       Student student = studentList.get(position);

       TextView t1 = view.findViewById(R.id.nametextviewid);
       TextView t2 = view.findViewById(R.id.agetextviewid);
       TextView t3 = view.findViewById(R.id.sectionid);
       TextView t4 = view.findViewById(R.id.lmid);
       TextView t5 = view.findViewById(R.id.faultid);
       TextView t6 = view.findViewById(R.id.dateid);

       t1.setText(student.getName());
       t2.setText(student.getAge());
       t3.setText(student.getSection());
       t4.setText(student.getLm());
       t5.setText(student.getFault());
       t6.setText(student.getDate());




        return view;
    }
}
