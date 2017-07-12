package com.werb.library.link

import com.werb.library.MoreViewType
import kotlin.reflect.KClass



/**
 * [MoreLink] link model and view
 * Created by wanbo on 2017/7/2.
 */
interface MoreLink {

    /** [register]  register viewType when we use */
    fun register(viewType: MoreViewType<*>): MoreLink

    fun multiRegister(clazz: KClass<*> ,link: MultiLink<*>) : MoreLink

    fun attachViewType(any: Any) : MoreViewType<Any>

    fun attachViewTypeLayout(any: Any) : Int

    fun buildViewType(type: Int) : MoreViewType<Any>?

    fun userSoleRegister(): MoreLink

}