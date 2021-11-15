package blehblu.com.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import blehblu.com.Activities.FermiActivity;
import blehblu.com.Activities.WondersActivity;
import blehblu.com.ModelClassWonder;
import blehblu.com.R;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder>{
    private ArrayList<ModelClassWonder> modelList;
    private Context context;

    public AdapterClass(ArrayList<ModelClassWonder> modelList, Context context){
        this.modelList= modelList;
        this.context=context;

    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        return  new CardViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
    ModelClassWonder model=modelList.get(position);
    holder.textViewSplash.setText(model.getCategoryName());
    holder.imgViewSplash.setImageResource(context.getResources()
            .getIdentifier(model.getImgName(),"drawable",context.getPackageName()));

    holder.cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(position==0){
            Intent intent= new Intent(context, WondersActivity.class);
            context.startActivity(intent);
            }
            else if(position==1){
                Intent intent= new Intent(context, FermiActivity.class);
                context.startActivity(intent);
            }

        }
    });

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgViewSplash;
        private TextView textViewSplash;
        private CardView cardView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgViewSplash=itemView.findViewById(R.id.splashWonder);
            textViewSplash=itemView.findViewById(R.id.textViewSplash);
            cardView=itemView.findViewById(R.id.cardView);


        }
    }
}
