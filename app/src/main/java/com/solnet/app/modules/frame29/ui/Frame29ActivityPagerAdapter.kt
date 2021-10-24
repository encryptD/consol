package com.solnet.app.modules.frame29.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.solnet.app.modules.frame22.ui.Frame22Fragment
import com.solnet.app.modules.frame23.ui.Frame23Fragment
import com.solnet.app.modules.frame24.ui.Frame24Fragment
import com.solnet.app.modules.frame25.ui.Frame25Fragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class Frame29ActivityPagerAdapter(
    public val fragmentManager: FragmentManager,
    public val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    public override fun getItemCount(): Int = viewPages.size

    public override fun createFragment(position: Int): Fragment = viewPages[position]

    public companion object AdapterConstant {
        public val title: List<String> =
                listOf(com.solnet.app.appcomponents.di.MyApp.getInstance().resources.getString(com.solnet.app.R.string.lbl_nft),com.solnet.app.appcomponents.di.MyApp.getInstance().resources.getString(com.solnet.app.R.string.lbl_farms),com.solnet.app.appcomponents.di.MyApp.getInstance().resources.getString(com.solnet.app.R.string.lbl_lp_pools),com.solnet.app.appcomponents.di.MyApp.getInstance().resources.getString(com.solnet.app.R.string.lbl_marketplace))

        public val viewPages: List<Fragment> =
                listOf(Frame22Fragment(),Frame23Fragment(),Frame24Fragment(),Frame25Fragment())

    }
}
