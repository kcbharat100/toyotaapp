package com.bharat.toyotaapp.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bharat.toyotaapp.domain.PlanetRepository
import com.bharat.toyotaapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import okhttp3.Dispatcher
import javax.inject.Inject

@HiltViewModel
class PlanetViewModel @Inject constructor(
    private val repository: PlanetRepository
): ViewModel() {

   // private val _planetUIState = MutableStateFlow(PlanetUIState())

    init {

        viewModelScope.launch {


            repository.getPlanets().collect(){result ->

                when(result){
                    is Resource.Loading -> {

                    }
                    is Resource.Data -> {

                        Log.d("DATA", result.data.name)
                    }

                    is Resource.Error<*> -> TODO()
                }


            }

        }



    }

}