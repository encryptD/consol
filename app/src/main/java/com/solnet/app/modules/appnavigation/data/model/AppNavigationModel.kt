package com.solnet.app.modules.appnavigation.`data`.model

import com.solnet.app.R
import com.solnet.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFrame15: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_15)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFrame18: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_18)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFrame17: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_17)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFrame16: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFrame20: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFrame14: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_14)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFrame26: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_26)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFrame2: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFrame19: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFrame21: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_21)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFrame22: String? = MyApp.getInstance().resources.getString(R.string.lbl_frame_22)

)
