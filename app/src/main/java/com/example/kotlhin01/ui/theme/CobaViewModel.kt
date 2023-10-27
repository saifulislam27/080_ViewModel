package com.example.kotlhin01.ui.theme


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr: String by mutableStateOf("")
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var emailUsr: String by mutableStateOf("")
        private set

    var jenisKl: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()
    var statusM: String by mutableStateOf("")
        private set
    var alamatUsr: String by mutableStateOf("")
        private set


    fun insertData(nm: String, tlp: String, eml: String, jk: String, sm: String) {
        namaUsr = nm;
        noTlp = tlp;
        emailUsr = eml;
        jenisKl = jk;
        statusM = sm;
        alamatUsr= al;
    }

    fun setJenisK(pilihJK: String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }

    fun setStatusM(pilihSM: String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihSM) }
    }
}