package com.mosnanaja.dialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.View
import android.view.Window
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget
import kotlinx.android.synthetic.main.dialog_custom.*

import android.R.attr.start
import android.content.DialogInterface
import android.content.DialogInterface.OnShowListener
import android.app.Activity
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.R.id.edit
import java.nio.file.Files.size
import android.content.SharedPreferences










class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frameAnimation: AnimationDrawable = main_progress.background as AnimationDrawable
        frameAnimation.start()
//        val imageViewTarget = GlideDrawableImageViewTarget(ggwp)
//           Glide.with(this).load(R.drawable.gif_tt).into(imageViewTarget)



//       main_progress.setBackgroundResource(R.drawable.run_animation)
//        animationDrawable = main_progress.background
//        animationDrawable.

    }


}
