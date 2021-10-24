package com.solnet.app.modules.frame27.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame27.`data`.model.Frame27Model

public class Frame27VM : ViewModel() {
  public val frame27Model: MutableLiveData<Frame27Model> = MutableLiveData(Frame27Model())
}
