package com.solnet.app.modules.frame14.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame14.`data`.model.Frame14Model

public class Frame14VM : ViewModel() {
  public val frame14Model: MutableLiveData<Frame14Model> = MutableLiveData(Frame14Model())
}
