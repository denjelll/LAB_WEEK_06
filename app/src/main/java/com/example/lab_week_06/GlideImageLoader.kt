package com.example.lab_week_06

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

class GlideImageLoader(private val context: Context) : ImageLoader {

    override fun loadImage(imageUrl: String, imageView: ImageView) { // Ensure these names match the interface
        Glide.with(context)
            .load(imageUrl) // Use 'imageUrl'
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_foreground)
            .into(imageView) // Use 'imageView'
    }
}