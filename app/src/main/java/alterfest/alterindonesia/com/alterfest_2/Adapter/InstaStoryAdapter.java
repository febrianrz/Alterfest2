package alterfest.alterindonesia.com.alterfest_2.Adapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import alterfest.alterindonesia.com.alterfest_2.Data.InstaStoryData;
import alterfest.alterindonesia.com.alterfest_2.R;
import de.hdodenhof.circleimageview.CircleImageView;

public class InstaStoryAdapter extends RecyclerView.Adapter<InstaStoryAdapter.ViewHolder> {

    private List<InstaStoryData> listData;
    private Context context;

    public InstaStoryAdapter(Context context, List<InstaStoryData> listData){
        this.listData = listData;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_instastory, parent,false);
        InstaStoryAdapter.ViewHolder vh = new InstaStoryAdapter.ViewHolder(v);
        return vh;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvNama.setText(listData.get(position).getNama());
        holder.imageView.setImageDrawable(context.getDrawable(listData.get(position).getGambar()));
    }

    @Override
    public int getItemCount() {
        if(listData == null) {
            return 0;
        }
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imageView;
        TextView tvNama;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (CircleImageView) itemView.findViewById(R.id.picture);
            tvNama  = (TextView) itemView.findViewById(R.id.tvNama);
        }
    }
}
