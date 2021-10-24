package com.solnet.app.modules.frame28.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame28.`data`.model.Frame28Model

public class Frame28VM : ViewModel() {
  public val frame28Model: MutableLiveData<Frame28Model> = MutableLiveData(Frame28Model())
}
