package com.solnet.app.modules.frame29.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame29.`data`.model.Frame29Model

public class Frame29VM : ViewModel() {
  public val frame29Model: MutableLiveData<Frame29Model> = MutableLiveData(Frame29Model())
}
