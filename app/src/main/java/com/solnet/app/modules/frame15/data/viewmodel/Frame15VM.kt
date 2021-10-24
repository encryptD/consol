package com.solnet.app.modules.frame15.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame15.`data`.model.Frame15Model
import com.solnet.app.modules.frame15.`data`.model.Frame16RowModel
import kotlin.collections.MutableList

public class Frame15VM : ViewModel() {
  public val frame15Model: MutableLiveData<Frame15Model> = MutableLiveData(Frame15Model())

  public val recyclerViewList: MutableLiveData<MutableList<Frame16RowModel>> =
      MutableLiveData(mutableListOf())
}
