package com.solnet.app.modules.frame25.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.frame25.`data`.model.Frame25Model
import com.solnet.app.modules.frame25.`data`.model.Frame26RowModel
import kotlin.collections.MutableList

public class Frame25VM : ViewModel() {
  public val frame25Model: MutableLiveData<Frame25Model> = MutableLiveData(Frame25Model())

  public val recyclerViewList: MutableLiveData<MutableList<Frame26RowModel>> =
      MutableLiveData(mutableListOf())
}
