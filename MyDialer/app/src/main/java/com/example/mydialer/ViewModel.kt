package com.example.mydialer

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.Request
import timber.log.Timber

class ContactsViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(State())
    val uiState: StateFlow<State> = _uiState.asStateFlow()

    init {
        getContacts()
    }

    private fun getContacts() {
        viewModelScope.launch(Dispatchers.IO) {
            val url =
                "https://drive.google.com/u/0/uc?id=1-KO-9GA3NzSgIc1dkAsNm8Dqw0fuPxcR&export=download"
            val client = OkHttpClient.Builder().build()
            val request = Request.Builder()
                .url(url)
                .build()
            val response = client.newCall(request).execute()

            if (response.isSuccessful) {
                val gson = Gson()
                val typeToken = object : TypeToken<List<Contact>>() {}.type
                val data: List<Contact> = gson.fromJson(response.body?.string(), typeToken)

                _uiState.update { currentState ->
                    currentState.copy(
                        contacts = data
                    )
                }
            }

        }
    }

    fun filterContacts(text: String) {
        var contacts = _uiState.value.contacts
        if (text == "") {
            _uiState.update { currentState ->
                currentState.copy(
                    filteredContacts = contacts
                )
            }
            return
        }

        _uiState.update { currentState ->
            currentState.copy(
                filteredContacts = contacts.filter {
                    it.phone.contains(text) || it.type.contains(text) || it.name.contains(text)
                }
            )
        }
    }
}
