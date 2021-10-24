package com.solnet.app.modules.frame17.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame17.`data`.model.Frame17Model

public class Frame17VM : ViewModel() {
  public val frame17Model: MutableLiveData<Frame17Model> = MutableLiveData(Frame17Model())
}
