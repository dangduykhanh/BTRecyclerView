package khanhdang.ueh.edu.vn.btrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PaperListAdapter extends RecyclerView.Adapter<PaperViewHolder>{

    private List<Newspaper> mPaperList;
    private Context context;

    public List<Newspaper> getmPaperList() {
        return mPaperList;
    }

    public PaperListAdapter(Context context,List<Newspaper> mPaperList) {
        this.mPaperList = mPaperList;
        this.context = context;
    }

    @NonNull
    @Override
    public PaperViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new PaperViewHolder(itemview,this,context) ;
    }

    @Override
    public void onBindViewHolder(@NonNull PaperViewHolder holder, int position) {
        Newspaper newspaper = mPaperList.get(position);

        holder.getTitle().setText(newspaper.getTitle());
        holder.getContent().setText(newspaper.getContent1());


    }

    @Override
    public int getItemCount() {
        if (mPaperList != null)
        {
            return mPaperList.size();
        }
        return 0;
    }
}
