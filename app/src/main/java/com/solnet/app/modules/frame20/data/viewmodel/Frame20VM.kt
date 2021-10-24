package com.solnet.app.modules.frame20.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame20.`data`.model.Frame20Model

public class Frame20VM : ViewModel() {
  public val frame20Model: MutableLiveData<Frame20Model> = MutableLiveData(Frame20Model())
}
