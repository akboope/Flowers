package project.flower.com.flowers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bagdat Eshmuratov on 18.01.2018.
 * email: eshmuratovbagdat@gmail.com.
 */

public class FlowersAdapter extends RecyclerView.Adapter<FlowersAdapter.FlowerHolder>{
    private List<Flowers> flowers = new ArrayList<>();
    private Context context;

    public FlowersAdapter(List<Flowers> flowers, Context context) {
        this.flowers = flowers;
        this.context = context;
    }

    @Override
    public FlowerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flowers, parent, false);
        return new FlowerHolder(view);
    }

    @Override public void onBindViewHolder(FlowerHolder holder, int position) {
        Flowers flower = flowers.get(position);
        holder.name.setText(flower.getName());
        holder.description.setText(flower.getInstructions());
        holder.price.setText(String.valueOf(flower.getPrice()));

        Picasso.with(context)
                .load(flower.getPhoto())
                .into(holder.imageView);
    }

    @Override public int getItemCount() {
        return flowers.size();
    }

    static class FlowerHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView name;
        private TextView price;
        private TextView description;

        FlowerHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            description = itemView.findViewById(R.id.description);
        }
    }
}
