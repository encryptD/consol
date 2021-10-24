package com.solnet.app.modules.frame15.`data`.model

import com.solnet.app.R
import com.solnet.app.appcomponents.di.MyApp
import kotlin.String

public data class Frame15Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1012Pm: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_12_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSolaireNetwork: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_solaire_network)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtKRocha: String? = MyApp.getInstance().resources.getString(R.string.lbl_k_rocha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJanefoster: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_janefoster)

)
