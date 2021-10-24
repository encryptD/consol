package com.solnet.app.modules.frame18.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame18.`data`.model.Frame18Model

public class Frame18VM : ViewModel() {
  public val frame18Model: MutableLiveData<Frame18Model> = MutableLiveData(Frame18Model())
}
