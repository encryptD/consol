package com.solnet.app.modules.frame23.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame23.`data`.model.Frame23Model

public class Frame23VM : ViewModel() {
  public val frame23Model: MutableLiveData<Frame23Model> = MutableLiveData(Frame23Model())
}
