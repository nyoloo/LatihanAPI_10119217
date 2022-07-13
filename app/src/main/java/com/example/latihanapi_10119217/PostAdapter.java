package com.example.latihanapi_10119217;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;
// Nama     : Tiyo Haryo Subaktiono
// Kelas    : IF 6
// Tanggal pengerjaan : 8 Juli 2022
public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    List<Post> postList;
    Context context;

    public PostAdapter(Context context, List<Post> posts){
        this.context = context;
        postList = posts;
    }
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.title.setText("Judul = " + post.getTitle());
        holder.author.setText("Author = " + post.getAuthor());
        holder.tag.setText("Tag = " + post.getTag());
        holder.time.setText("Time = " + post.getTime());
        holder.desc.setText("Desc = " + post.getDesc());

        String url = this.postList.get(position).getThumb();
        Glide.with(context).load(url).fitCenter().centerCrop().into(holder.thumb);

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{
        TextView title, author, tag, time, desc;
        ImageView thumb;
        public PostViewHolder(@NonNull View itemView)  {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            author = itemView.findViewById(R.id.author);
            tag = itemView.findViewById(R.id.tag);
            time = itemView.findViewById(R.id.time);
            desc = itemView.findViewById(R.id.desc);
            thumb = itemView.findViewById(R.id.thumb);
        }
    }
}
