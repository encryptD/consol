package com.solnet.app.modules.appnavigation.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.solnet.app.modules.appnavigation.`data`.model.AppNavigationModel

public class AppNavigationVM : ViewModel() {
  public val appNavigationModel: MutableLiveData<AppNavigationModel> =
      MutableLiveData(AppNavigationModel())
}
