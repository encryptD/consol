package com.solnet.app.modules.frame22.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame22.`data`.model.Frame22Model

public class Frame22VM : ViewModel() {
  public val frame22Model: MutableLiveData<Frame22Model> = MutableLiveData(Frame22Model())
}
