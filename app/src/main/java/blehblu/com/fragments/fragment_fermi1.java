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

public class fragment_fermi1 extends Fragment {
    public static fragment_fermi1 newInstance(){
        return new fragment_fermi1();
    }
    private ImageView imgviewFermi1;
    private ProgressBar progressBarFermi1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fermi1,container,false);
        imgviewFermi1=view.findViewById(R.id.alien1);
        progressBarFermi1=view.findViewById(R.id.progressBarAlien1);
        Picasso.get().load("https://images6.alphacoders.com/375/375798.jpg").into(imgviewFermi1, new Callback() {
            @Override
            public void onSuccess() {
                progressBarFermi1.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                progressBarFermi1.setVisibility(View.INVISIBLE);

            }
        });

        return view;

    }
}
