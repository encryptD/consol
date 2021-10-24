package com.solnet.app.modules.frame17.`data`.model

import com.solnet.app.R
import com.solnet.app.appcomponents.di.MyApp
import kotlin.String

public data class Frame17Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1012Pm: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_12_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJanefoster2: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_janefoster2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJaneFoster: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jane_foster)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJune29: String? = MyApp.getInstance().resources.getString(R.string.lbl_june_29)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJanefosterSent: String? =
      MyApp.getInstance().resources.getString(R.string.msg_janefoster_sent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtThereYouGoT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_there_you_go_t)

)
