package com.solnet.app.modules.frame14.`data`.model

import com.solnet.app.R
import com.solnet.app.appcomponents.di.MyApp
import kotlin.String

public data class Frame14Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSolaireNetwork: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_solaire_network)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgot: String? = MyApp.getInstance().resources.getString(R.string.lbl_forgot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAboutContact: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_about_contact)

)
