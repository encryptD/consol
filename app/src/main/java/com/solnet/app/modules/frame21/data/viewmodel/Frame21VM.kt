package com.solnet.app.modules.frame21.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame21.`data`.model.Frame21Model

public class Frame21VM : ViewModel() {
  public val frame21Model: MutableLiveData<Frame21Model> = MutableLiveData(Frame21Model())
}
