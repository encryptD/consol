package com.solnet.app.modules.frame24.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame24.`data`.model.Frame24Model

public class Frame24VM : ViewModel() {
  public val frame24Model: MutableLiveData<Frame24Model> = MutableLiveData(Frame24Model())
}
