package com.example.supot.spk;


import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;




/**
 * A simple {@link Fragment} subclass.
 */
public class fmDelay extends Fragment {


    public fmDelay() {
        // Required empty public constructor
    }

    private SeekBar delayBar1,delayBar2,delayBar3,delayBar4;
    private TextView msView1,msView2,msView3,msView4,mView1,mView2,mView3,mView4;
    private Switch swG1,swG2,swG3,swG4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fm_delay, container, false);
        initDelayBar(view);
        initswLockdelayBar(view);
        return view;
    }
    private void initDelayBar(View view){
        delayBar1 = (SeekBar) view.findViewById(R.id.delayBar1);
        delayBar2 = (SeekBar) view.findViewById(R.id.delayBar2);
        delayBar3 = (SeekBar) view.findViewById(R.id.delayBar3);
        delayBar4 = (SeekBar) view.findViewById(R.id.delayBar4);

        msView1 = (TextView) view.findViewById(R.id.msView1);
        msView2 = (TextView) view.findViewById(R.id.msView2);
        msView3 = (TextView) view.findViewById(R.id.msView3);
        msView4 = (TextView) view.findViewById(R.id.msView4);

        mView1 = (TextView) view.findViewById(R.id.mView1);
        mView2 = (TextView) view.findViewById(R.id.mView2);
        mView3 = (TextView) view.findViewById(R.id.mView3);
        mView4 = (TextView) view.findViewById(R.id.mView4);

        delayBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                DecimalFormat df = new DecimalFormat("0.00");
                msView1.setText(progress+" ms");
                mView1.setText(df.format(progress*0.343)+" m");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        delayBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                DecimalFormat df = new DecimalFormat("0.00");
                msView2.setText(progress+" ms");
                mView2.setText(df.format(progress*0.343)+" m");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        delayBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                DecimalFormat df = new DecimalFormat("0.00");
                msView3.setText(progress+" ms");
                mView3.setText(df.format(progress*0.343)+" m");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        delayBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                DecimalFormat df = new DecimalFormat("0.00");
                msView4.setText(progress+" ms");
                mView4.setText(df.format(progress*0.343)+" m");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    private void initswLockdelayBar(View view){
        swG1 = (Switch) view.findViewById(R.id.swG1);
        swG2 = (Switch) view.findViewById(R.id.swG2);
        swG3 = (Switch) view.findViewById(R.id.swG3);
        swG4 = (Switch) view.findViewById(R.id.swG4);

        swG1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    delayBar1.setEnabled(false);
                }else{
                    delayBar1.setEnabled(true);
                }
            }
        });

        swG2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    delayBar2.setEnabled(false);
                }else{
                    delayBar2.setEnabled(true);
                }
            }
        });

        swG3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    delayBar3.setEnabled(false);
                }else{
                    delayBar3.setEnabled(true);
                }
            }
        });

        swG4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    delayBar4.setEnabled(false);
                }else{
                    delayBar4.setEnabled(true);
                }
            }
        });
    }

}
