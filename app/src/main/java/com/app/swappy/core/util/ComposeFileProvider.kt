package com.app.swappy.core.util

import android.content.Context
import android.net.Uri
import androidx.core.content.FileProvider
import com.app.swappy.R
import java.io.File

class ComposeFileProvider : FileProvider(
    R.xml.file_paths
) {
    companion object {
        fun getImageUri(context: Context): Uri {
            val directory = File(context.cacheDir, "images")
            directory.mkdirs()
            val file = File.createTempFile(
                "selected_image_",
                ".jpg",
                directory,
            )
            val authority = context.packageName + ".file_provider"
            return getUriForFile(
                context,
                authority,
                file,
            )
        }
    }
}