package com.solnet.app.modules.frame20.`data`.model

import com.solnet.app.R
import com.solnet.app.appcomponents.di.MyApp
import kotlin.String

public data class Frame20Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1012Pm: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_12_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSearchValue: String? = null
)
