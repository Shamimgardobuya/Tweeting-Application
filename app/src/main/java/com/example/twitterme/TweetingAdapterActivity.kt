package com.example.twitterme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetingAdapterActivity(var tweeting1:List<Tweets>):
        RecyclerView.Adapter<TweetingViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetingViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item,parent,false)
//       var  TweetingViewHolder(itemView)  //instance o f
        return TweetingViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TweetingViewHolder, position: Int) {
        var currentTweet=tweeting1.get(position)
        holder.tvName.text=currentTweet.name1
        holder.tvTweet.text=currentTweet.tweet

        holder.tvLike.text=currentTweet.like.toString()//calls again for second item  //for one object
        holder.tvReply.text= currentTweet.reply.toString()
        holder.tvRet.text=currentTweet.ret.toString()
        holder.tvHandle.text=currentTweet.handle


    }

    override fun getItemCount(): Int {
        return tweeting1.size
    }
}


class TweetingViewHolder(itemView:View): RecyclerView.ViewHolder(itemView)
{
  var imgLike:ImageView=itemView.findViewById<ImageView>(R.id.imgLike)
  var imgReply:ImageView=itemView.findViewById<ImageView>(R.id.imgReply)
  var imgRet:ImageView=itemView.findViewById<ImageView>(R.id.imgRet)
  var imgStart: ImageView =itemView.findViewById<ImageView>(R.id.imgStart)
    var tvHandle:TextView=itemView.findViewById<TextView>(R.id.tvHandle)
    var tvLike:TextView=itemView.findViewById<TextView>(R.id.tvLike)
    var tvName:TextView=itemView.findViewById<TextView>(R.id.tvName)
    var tvReply:TextView=itemView.findViewById<TextView>(R.id.tvReply)
    var tvRet:TextView=itemView.findViewById<TextView>(R.id.tvRet)
    var tvTweet:TextView=itemView.findViewById<TextView>(R.id.tvTweet)


}
