package alterfest.alterindonesia.com.alterfest_2.Adapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import alterfest.alterindonesia.com.alterfest_2.Data.InstaStoryData;
import alterfest.alterindonesia.com.alterfest_2.Data.TimeLine;
import alterfest.alterindonesia.com.alterfest_2.R;
import de.hdodenhof.circleimageview.CircleImageView;

public class TimeLineAdapter extends RecyclerView.Adapter<TimeLineAdapter.ViewHolder> {
    private List<TimeLine> listData;
    private Context context;

    public TimeLineAdapter(Context context, List<TimeLine> listData){
        this.listData = listData;
        this.context = context;
    }

    @NonNull
    @Override
    public TimeLineAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_timeline, parent,false);
        TimeLineAdapter.ViewHolder vh = new TimeLineAdapter.ViewHolder(v);
        return vh;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull TimeLineAdapter.ViewHolder holder, int position) {
        holder.tvUsernameTop.setText(listData.get(position).getUsername());
        holder.tvUsernameBottom.setText(listData.get(position).getUsername());
        holder.tvLocation.setText("Kemenpora");
        holder.tvLike.setText(listData.get(position).getLikeLabel());
        holder.tvCaption.setText(listData.get(position).getCaption());
        holder.tvTime.setText(listData.get(position).getTime());
        holder.mainImage.setImageDrawable(context.getDrawable(listData.get(position).getGambar()));
        holder.userFoto.setImageDrawable(context.getDrawable(listData.get(position).getFoto()));
    }

    @Override
    public int getItemCount() {
        if(listData == null) {
            return 0;
        }
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView userFoto;
        ImageView mainImage;
        TextView tvUsernameTop, tvUsernameBottom, tvLocation, tvLike, tvCaption, tvTime;
        public ViewHolder(View itemView) {
            super(itemView);
            tvUsernameTop   = (TextView) itemView.findViewById(R.id.tvUsernameTop);
            tvUsernameBottom   = (TextView) itemView.findViewById(R.id.tvUsernameBottom);
            tvLocation   = (TextView) itemView.findViewById(R.id.tvLocation);
            tvLike   = (TextView) itemView.findViewById(R.id.tvLike);
            tvCaption   = (TextView) itemView.findViewById(R.id.tvCaption);
            tvTime   = (TextView) itemView.findViewById(R.id.tvTime);
            userFoto   = (CircleImageView) itemView.findViewById(R.id.userFoto);
            mainImage   = (ImageView) itemView.findViewById(R.id.mainImage);

        }
    }
}
