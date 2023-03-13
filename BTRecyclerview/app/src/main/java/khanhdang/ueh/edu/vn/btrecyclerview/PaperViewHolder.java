package khanhdang.ueh.edu.vn.btrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class PaperViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView title;
    private TextView content;
    private LinearLayout linearLayout;
    private Context context;
    private final PaperListAdapter madapter;

    public TextView getTitle() {
        return title;
    }

    public TextView getContent() {
        return content;
    }

    public PaperViewHolder(@NonNull View itemView, PaperListAdapter paperListAdapter,Context context) {
        super(itemView);
        title=itemView.findViewById(R.id.title);
        content=itemView.findViewById(R.id.content);
        linearLayout = itemView.findViewById(R.id.recyclerview);
        this.context=context;
        this.madapter = paperListAdapter;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context,NewspaperActivity.class);
       int position= getLayoutPosition();
       Newspaper newspaper= madapter.getmPaperList().get(position);
        intent.putExtra("newspaper",newspaper);
        context.startActivity(intent);
    }
}
