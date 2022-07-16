package com.example.youtubeapp.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.youtubeapp.R;
import com.example.youtubeapp.item.ItemComment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterListComment extends
        RecyclerView.Adapter<AdapterListComment.ListCommentViewHolder> {

    ArrayList<ItemComment> listComment;

    public AdapterListComment(ArrayList<ItemComment> listComment) {
        this.listComment = listComment;
    }

    @NonNull
    @Override
    public ListCommentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_comment_video,parent, false);
        return new ListCommentViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ListCommentViewHolder holder, int position) {
        ItemComment itemComment = listComment.get(position);
        if (itemComment == null){
            return;
        }
        Picasso.get().load(itemComment.getUrlAvtChannelComment()).into(holder.ivAvtItemComment);
        holder.tvItemNameChannel.setText(itemComment.getNameChannelComment());
        holder.tvTimeAgoComment.setText(itemComment.getTimeComment());
        holder.tvContentComment.setText(itemComment.getContentComment());
        holder.tvNumberLikeComment.setText(itemComment.getNumberLikeComment());
        if (itemComment.getReplyComment().equals("0")){
            holder.tvReplyComment.setText("");
        }
        else{
            holder.tvReplyComment.setText(itemComment.getReplyComment() + " REPLIES");
        }
    }

    @Override
    public int getItemCount() {
        if (listComment != null){
            return listComment.size();
        }
        return 0;
    }

    public class ListCommentViewHolder extends RecyclerView.ViewHolder{

        private CircleImageView ivAvtItemComment;
        private TextView tvItemNameChannel, tvTimeAgoComment,
                tvContentComment, tvNumberLikeComment, tvReplyComment;

        public ListCommentViewHolder(@NonNull View itemView) {
            super(itemView);
            mapping(itemView);
        }

        public void mapping(@NonNull View view){
            ivAvtItemComment = view.findViewById(R.id.iv_item_avt_comment);
            tvItemNameChannel = view.findViewById(R.id.tv_item_name_channel);
            tvTimeAgoComment = view.findViewById(R.id.tv_item_time_ago_comment);
            tvNumberLikeComment = view.findViewById(R.id.tv_item_number_like_comment);
            tvReplyComment = view.findViewById(R.id.tv_item_reply_comment);
            tvContentComment = view.findViewById(R.id.tv_item_content_comment);
        }
    }
}