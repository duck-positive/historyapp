package com.umc.history

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.umc.history.databinding.ItemMypageStoryBinding
import com.umc.history.databinding.ItemStoryBinding

class MyPageStoryRVAdapter (private val myPageStoryList:ArrayList<Body>) : RecyclerView.Adapter<MyPageStoryRVAdapter.ViewHolder>(){

    lateinit var context:Context
    private lateinit var mItemClickListener: StoryItemClickListener
    interface StoryItemClickListener{
        fun onItemClick(story : Body)
    }
    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
    }
    fun storyItemClickListener(storyItemClickListener: StoryItemClickListener ){
        mItemClickListener = storyItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemMypageStoryBinding = ItemMypageStoryBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(myPageStoryList[position])
        holder.binding.storyLo.setOnClickListener {
            mItemClickListener.onItemClick(myPageStoryList[position])
        }
    }

    override fun getItemCount(): Int = myPageStoryList.size

//    @SuppressLint("NotifyDataSetChanged")
//    fun addStories()
    //뷰홀더

    inner class ViewHolder(val binding: ItemMypageStoryBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(myPageStory:Body){
            binding.itemMyPageStoryTitleTv.text=myPageStory.title
            binding.itemMyPageStoryDetailTv.text=myPageStory.contents
            binding.itemMyPageStoryNickNameTv.text=myPageStory.user!!.nickName
            binding.itemMyPageStoryLikeTv.text= myPageStory.totalLike.toString()
            binding.itemMyPageStoryCommentTv.text=myPageStory.totalComment.toString()
//            Glide.with(context)
//                .load(myPageStory.user.profileImgUrl)
//                .into(binding.itemMyPageStoryProfileImgIv)
        }
    }

}