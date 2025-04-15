package com.example.hostellog
package com.example.hostellog

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class InActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private val CAMERA_REQUEST = 1888

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_in)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val photoButton = findViewById<Button>(R.id.photoButton)
        imageView = findViewById(R.id.imageView)

        photoButton.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, CAMERA_REQUEST)
        }

        saveButton.setOnClickListener {
            val name = nameInput.text.toString()
            Toast.makeText(this, "Saved $name", Toast.LENGTH_SHORT).show()
            // Add SQLite saving logic here
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            val photo = data?.extras?.get("data") as Bitmap
            imageView.setImageBitmap(photo)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}
