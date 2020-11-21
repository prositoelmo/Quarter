package com.example.quarter.Vista.MusicaFragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.quarter.R;


public class BotonesMusicaFragment extends Fragment implements View.OnClickListener {
    ImageButton play_pause;
    MediaPlayer mediaPlayer;
    public BotonesMusicaFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_lista_musica, container, false);

        mediaPlayer=MediaPlayer.create(getContext(), R.raw.arte_sano);
        // Inflate the layout for this fragment
        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.botonGigante:
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    play_pause.setImageResource(R.drawable.ic_play_button);
                    Toast.makeText(getContext()," pausa", Toast.LENGTH_SHORT).show();
                }
                else {
                    mediaPlayer.start();
                    play_pause.setImageResource(R.drawable.ic_pause_button);
                    Toast.makeText(getContext(), "play",Toast.LENGTH_SHORT).show();
                }
                break;


        }
    }
}