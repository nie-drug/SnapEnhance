package me.rhunk.snapenhance.core.eventbus.events.impl

import android.view.View
import android.view.ViewGroup
import me.rhunk.snapenhance.core.eventbus.events.AbstractHookEvent

class AddViewEvent(
    val parent: ViewGroup,
    var view: View,
    var index: Int,
    var layoutParams: ViewGroup.LayoutParams
) : AbstractHookEvent()