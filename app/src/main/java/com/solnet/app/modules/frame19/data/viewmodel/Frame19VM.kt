package com.solnet.app.modules.frame19.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame19.`data`.model.Frame19Model

public class Frame19VM : ViewModel() {
  public val frame19Model: MutableLiveData<Frame19Model> = MutableLiveData(Frame19Model())
}
