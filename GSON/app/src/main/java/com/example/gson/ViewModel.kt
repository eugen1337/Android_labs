package com.example.gson

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.Request
import timber.log.Timber

class PhotosViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(State())
    val uiState: StateFlow<State> = _uiState.asStateFlow()

    init {
        getPhotos()
    }

    private fun getPhotos() {
        viewModelScope.launch(Dispatchers.IO) {
            val url =
                "https://api.flickr.com/services/rest/?method=flickr.photos.search&api_key=ff49fcd4d4a08aa6aafb6ea3de826464&tags=cat&format=json&nojsoncallback=1"
            val client = OkHttpClient.Builder().build()
            val request = Request.Builder()
                .url(url)
                .build()
            val response = client.newCall(request).execute()

            if (response.isSuccessful) {
                val gson = Gson()
//                Timber.tag("timber").i(gson.toJson(response.body?.toString()))
                val data = gson.fromJson(response.body?.string(), Wrapper::class.java)
                data.photos.photo.forEachIndexed { index, photo ->
                    if (index % 5 == 0) {
                        Timber.tag("timber").i(gson.toJson(photo))
                    }
                }
                _uiState.update { currentState ->
                    currentState.copy(
                        links = data.photos.photo.map {
                            "https://farm${it.farm}.staticflickr.com/${it.server}/${it.id}_${it.secret}_z.jpg"
                        }
                    )
                }
            }

        }
    }
}
