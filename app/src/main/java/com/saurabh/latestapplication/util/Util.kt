package com.saurabh.latestapplication.util

import android.content.Context
import android.support.v4.widget.CircularProgressDrawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.saurabh.latestapplication.R

fun getProgressDrawable(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 10f
        centerRadius = 15f
        start()
    }
}

fun ImageView.loadImage(url: String?, circularProgressDrawable: CircularProgressDrawable) {
    val options = RequestOptions()
        .placeholder(circularProgressDrawable)
        .error(R.mipmap.ic_launcher_round)
    Glide.with(context).setDefaultRequestOptions(options)
        .load(url).into(this)
}