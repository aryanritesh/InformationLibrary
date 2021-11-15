package blehblu.com.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import blehblu.com.R;

public class fragment_fermi2 extends Fragment {
    public static fragment_fermi2 newInstance(){
        return new fragment_fermi2();
    }
    private ImageView imgviewFermi2;
    private ProgressBar progressBarFermi2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fermi2,container,false);
        imgviewFermi2=view.findViewById(R.id.alien2);
        progressBarFermi2=view.findViewById(R.id.progressBarfermi2);
        Picasso.get().load("https://i.pinimg.com/originals/f5/f7/29/f5f729edca86d5b013e2443496e04968.jpg").into(imgviewFermi2, new Callback() {
            @Override
            public void onSuccess() {
                progressBarFermi2.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarFermi2.setVisibility(View.INVISIBLE);

            }
        });

        return view;

    }
}
