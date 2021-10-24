package com.solnet.app.modules.frame28.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.solnet.app.modules.frame21.ui.Frame21Fragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class Frame28ActivityPagerAdapter(
    public val fragmentManager: FragmentManager,
    public val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    public override fun getItemCount(): Int = viewPages.size

    public override fun createFragment(position: Int): Fragment = viewPages[position]

    public companion object AdapterConstant {
        public val title: List<String> =
                listOf(com.solnet.app.appcomponents.di.MyApp.getInstance().resources.getString(com.solnet.app.R.string.lbl_notifications),com.solnet.app.appcomponents.di.MyApp.getInstance().resources.getString(com.solnet.app.R.string.lbl_dapps))

        public val viewPages: List<Fragment> = listOf(Frame21Fragment(),Frame21Fragment())

    }
}
