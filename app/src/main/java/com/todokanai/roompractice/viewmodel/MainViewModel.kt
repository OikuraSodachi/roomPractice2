package com.todokanai.roompractice.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.todokanai.roompractice.repository.UserRepository
import com.todokanai.roompractice.room.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel() {

    fun getAll() = userRepository.getUsers()


    fun insert(user: Long) {
        viewModelScope.launch {
            val userValue = User(user.toString().toLong(),1)
            userRepository.insert(userValue)
        }
    }
}

/*


trackRepository.getAll().observeForever(){
    playListInfo = it
}                   //       -->       playListInfo = helper.roomTrackDao().getAll()


 */