package com.rich.shape

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.shape.ShapeImpl
import com.android.shape.ShapeStyle
import com.rich.shape.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTest.background =
            ShapeImpl(this).setStyle(ShapeStyle.RECTANGLE).shapeSolid().color(Color.GREEN)
                .then().shapeCorners().radius(24)
                .getShape()
    }
}