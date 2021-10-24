package com.solnet.app.modules.splash.`data`.model

import com.solnet.app.R
import com.solnet.app.appcomponents.di.MyApp
import kotlin.String

public data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSolaireNetwork: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_solaire_network)

)
