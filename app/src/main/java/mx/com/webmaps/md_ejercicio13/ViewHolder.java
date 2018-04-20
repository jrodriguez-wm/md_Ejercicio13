package mx.com.webmaps.md_ejercicio13;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by jorge on 19/4/2018.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView name;
    public TextView desc;
    public LinearLayout linearLayout;

    public ViewHolder(View itemView) {
        super(itemView);

        image = (ImageView) itemView.findViewById(R.id.imageView_id);
        name= (TextView) itemView.findViewById(R.id.name_TextView_id);
        desc= (TextView) itemView.findViewById(R.id.desc_TextView_id);
        linearLayout= (LinearLayout) itemView.findViewById(R.id.recyclerItem_id);
    }
}
