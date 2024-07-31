package com.example.datatransfer.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _inputText = MutableLiveData<String>()
    val inputText: LiveData<String> = _inputText

    fun onInputChange(title: String){
        _inputText.value = title
    }
}
