package com.example.supot.spk;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class fmEQ extends Fragment {


    public fmEQ() {
        // Required empty public constructor
    }
    private boolean isOnEQ = true;
    private SeekBar eqBar_20,eqBar_40,eqBar_63,eqBar_100,eqBar_160,eqBar_300,eqBar_500,eqBar_800,eqBar_1k,eqBar_1_2k,eqBar_2_2k,eqBar_5k,eqBar_10k,eqBar_12k,eqBar_16k,eqBar_20k,eqBar_Master;
    private Button butStopEq,butReEq;
    private TextView tvEq,textV1;
    SharedPreferences sp;
    SharedPreferences.Editor editor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fm_eq, container, false);
        sp = this.getActivity().getSharedPreferences(Const.sp_channel, Context.MODE_PRIVATE);
        editor = sp.edit();
        initEq(view);
        butStopEq.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        return view;
    }

    private void  initEq(View view){
        eqBar_20 = (SeekBar) view.findViewById(R.id.eqBar_20);
        eqBar_40 = (SeekBar) view.findViewById(R.id.eqBar_40);
        eqBar_63 = (SeekBar) view.findViewById(R.id.eqBar_63);
        eqBar_100 = (SeekBar) view.findViewById(R.id.eqBar_100);
        eqBar_160 = (SeekBar) view.findViewById(R.id.eqBar_160);
        eqBar_300 = (SeekBar) view.findViewById(R.id.eqBar_300);
        eqBar_500 = (SeekBar) view.findViewById(R.id.eqBar_500);
        eqBar_800 = (SeekBar) view.findViewById(R.id.eqBar_800);
        eqBar_1k = (SeekBar) view.findViewById(R.id.eqBar_1k);
        eqBar_1_2k = (SeekBar) view.findViewById(R.id.eqBar_1_2k);
        eqBar_2_2k = (SeekBar) view.findViewById(R.id.eqBar_2_2k);
        eqBar_5k = (SeekBar) view.findViewById(R.id.eqBar_5k);
        eqBar_10k = (SeekBar) view.findViewById(R.id.eqBar_10k);
        eqBar_12k = (SeekBar) view.findViewById(R.id.eqBar_12k);
        eqBar_16k = (SeekBar) view.findViewById(R.id.eqBar_16k);
        eqBar_20k = (SeekBar) view.findViewById(R.id.eqBar_20k);
        eqBar_Master = (SeekBar) view.findViewById(R.id.eqBar_Master);
        butReEq = (Button) view.findViewById(R.id.butReEq);
        butStopEq = (Button) view.findViewById(R.id.butStopEq);
        tvEq = (TextView) view.findViewById(R.id.tvEq);
        textV1 = (TextView) view.findViewById(R.id.textV1);

        initEqBar();

        eqBar_20.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            float progressChanged;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("20Hz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                editor.putFloat(Const.master_eq_value_1,progressChanged);
                editor.commit();
                Toast.makeText(getContext(), "20Hz : " + sp.getFloat(Const.master_eq_value_1, 150),Toast.LENGTH_SHORT).show();
            }
        });
        textV1.setText(Float.toString(sp.getFloat(Const.master_eq_value_1, 150)));
        eqBar_40.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("40Hz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "40Hz :" + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_63.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("63Hz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "63Hz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_100.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("100Hz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "100Hz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_160.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("160Hz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "160Hz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_300.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("300Hz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "300Hz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_500.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("500Hz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "500Hz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_800.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("800Hz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "800Hz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_1k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("1KHz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "1KHz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_1_2k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("1.2KHz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "1.2KHz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_2_2k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("2.2KHz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "2.2KHz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_5k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("5KHz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "5KHz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_10k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("10KHz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "10KHz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_12k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("12KHz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "12KHz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_16k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("16KHz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "16KHz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_20k.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = (progress-150)*0.1f;
                tvEq.setText(String.format("20KHz : %.2f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(getContext(), "20KHz : " + Math.abs(progressChanged),Toast.LENGTH_SHORT).show();

            }
        });
        eqBar_Master.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float progressChanged = progress-80;
                tvEq.setText(String.format("MASTER : %.0f dB",progressChanged));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        butStopEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isOnEQ) {
                    offSeekBar();
                    butStopEq.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    isOnEQ = false;
                } else {
                    onSeekBar();
                    butStopEq.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    isOnEQ = true;
                }
            }
        });

        butReEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isOnEQ) {
                    eqBar_20.setProgress(150);
                    eqBar_40.setProgress(150);
                    eqBar_63.setProgress(150);
                    eqBar_100.setProgress(150);
                    eqBar_160.setProgress(150);
                    eqBar_300.setProgress(150);
                    eqBar_500.setProgress(150);
                    eqBar_800.setProgress(150);
                    eqBar_1k.setProgress(150);
                    eqBar_1_2k.setProgress(150);
                    eqBar_2_2k.setProgress(150);
                    eqBar_5k.setProgress(150);
                    eqBar_10k.setProgress(150);
                    eqBar_12k.setProgress(150);
                    eqBar_16k.setProgress(150);
                    eqBar_20k.setProgress(150);

                  /*  editor.putInt(Const.master_eq_slide_value_1,150);
                    editor.putInt(Const.master_eq_slide_value_2,150);
                    editor.putInt(Const.master_eq_slide_value_3,150);
                    editor.putInt(Const.master_eq_slide_value_4,150);
                    editor.putInt(Const.master_eq_slide_value_5,150);
                    editor.putInt(Const.master_eq_slide_value_6,150);
                    editor.putInt(Const.master_eq_slide_value_7,150);
                    editor.putInt(Const.master_eq_slide_value_8,150);
                    editor.putInt(Const.master_eq_slide_value_9,150);
                    editor.putInt(Const.master_eq_slide_value_10,150);
                    editor.putInt(Const.master_eq_slide_value_11,150);
                    editor.putInt(Const.master_eq_slide_value_12,150);
                    editor.putInt(Const.master_eq_slide_value_13,150);
                    editor.putInt(Const.master_eq_slide_value_14,150);
                    editor.putInt(Const.master_eq_slide_value_15,150);
                    editor.putInt(Const.master_eq_slide_value_16,150);
                    editor.commit();*/
                }
            }
        });
    }
    private void offSeekBar() {
        eqBar_20.setEnabled(false);
        eqBar_40.setEnabled(false);
        eqBar_63.setEnabled(false);
        eqBar_100.setEnabled(false);
        eqBar_160.setEnabled(false);
        eqBar_300.setEnabled(false);
        eqBar_500.setEnabled(false);
        eqBar_800.setEnabled(false);
        eqBar_1k.setEnabled(false);
        eqBar_1_2k.setEnabled(false);
        eqBar_2_2k.setEnabled(false);
        eqBar_5k.setEnabled(false);
        eqBar_10k.setEnabled(false);
        eqBar_12k.setEnabled(false);
        eqBar_16k.setEnabled(false);
        eqBar_20k.setEnabled(false);
    }

    private void onSeekBar() {
        eqBar_20.setEnabled(true);
        eqBar_40.setEnabled(true);
        eqBar_63.setEnabled(true);
        eqBar_100.setEnabled(true);
        eqBar_160.setEnabled(true);
        eqBar_300.setEnabled(true);
        eqBar_500.setEnabled(true);
        eqBar_800.setEnabled(true);
        eqBar_1k.setEnabled(true);
        eqBar_1_2k.setEnabled(true);
        eqBar_2_2k.setEnabled(true);
        eqBar_5k.setEnabled(true);
        eqBar_10k.setEnabled(true);
        eqBar_12k.setEnabled(true);
        eqBar_16k.setEnabled(true);
        eqBar_20k.setEnabled(true);
    }
    private void initEqBar() {
        eqBar_20.setMax(300);
        eqBar_40.setMax(300);
        eqBar_63.setMax(300);
        eqBar_100.setMax(300);
        eqBar_160.setMax(300);
        eqBar_300.setMax(300);
        eqBar_500.setMax(300);
        eqBar_800.setMax(300);
        eqBar_1k.setMax(300);
        eqBar_1_2k.setMax(300);
        eqBar_2_2k.setMax(300);
        eqBar_5k.setMax(300);
        eqBar_10k.setMax(300);
        eqBar_12k.setMax(300);
        eqBar_16k.setMax(300);
        eqBar_20k.setMax(300);
        eqBar_Master.setMax(80);

        //eqBar_20.setProgress(150);
        //eqBar_20.setProgress((int)sp.getFloat(Const.master_eq_value_1,150));
        /*eqBar_40.setProgress(sp.getInt(Const.master_eq_slide_value_2,150));
        eqBar_63.setProgress(sp.getInt(Const.master_eq_slide_value_3,150));
        eqBar_100.setProgress(sp.getInt(Const.master_eq_slide_value_4,150));
        eqBar_160.setProgress(sp.getInt(Const.master_eq_slide_value_5,150));
        eqBar_300.setProgress(sp.getInt(Const.master_eq_slide_value_6,150));
        eqBar_500.setProgress(sp.getInt(Const.master_eq_slide_value_7,150));
        eqBar_800.setProgress(sp.getInt(Const.master_eq_slide_value_8,150));
        eqBar_1k.setProgress(sp.getInt(Const.master_eq_slide_value_9,150));
        eqBar_1_2k.setProgress(sp.getInt(Const.master_eq_slide_value_10,150));
        eqBar_2_2k.setProgress(sp.getInt(Const.master_eq_slide_value_11,150));
        eqBar_5k.setProgress(sp.getInt(Const.master_eq_slide_value_12,150));
        eqBar_10k.setProgress(sp.getInt(Const.master_eq_slide_value_13,150));
        eqBar_12k.setProgress(sp.getInt(Const.master_eq_slide_value_14,150));
        eqBar_16k.setProgress(sp.getInt(Const.master_eq_slide_value_15,150));
        eqBar_20k.setProgress(sp.getInt(Const.master_eq_slide_value_16,150));
        eqBar_Master.setProgress(sp.getInt(Const.master_eq_slide,40));*/
    }

}
