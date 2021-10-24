package com.solnet.app.modules.frame2.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame2.`data`.model.Frame2Model

public class Frame2VM : ViewModel() {
  public val frame2Model: MutableLiveData<Frame2Model> = MutableLiveData(Frame2Model())
}
