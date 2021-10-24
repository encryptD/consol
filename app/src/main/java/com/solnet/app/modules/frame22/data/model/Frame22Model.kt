package com.solnet.app.modules.frame22.`data`.model

import com.solnet.app.R
import com.solnet.app.appcomponents.di.MyApp
import kotlin.String

public data class Frame22Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtType: String? = MyApp.getInstance().resources.getString(R.string.lbl_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtQuantity: String? = MyApp.getInstance().resources.getString(R.string.lbl_quantity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNetwork: String? = MyApp.getInstance().resources.getString(R.string.lbl_network)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtListOnMarketp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_list_on_marketp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYes: String? = MyApp.getInstance().resources.getString(R.string.lbl_yes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAmountOfNfts: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_amount_of_nfts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etDescriptionValue: String? = null
)
