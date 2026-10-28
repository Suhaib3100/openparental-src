package androidx.databinding.adapters;

import android.widget.TabWidget;
import androidx.annotation.c1;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:divider", method = "setDividerDrawable", type = TabWidget.class), @BindingMethod(attribute = "android:tabStripEnabled", method = "setStripEnabled", type = TabWidget.class), @BindingMethod(attribute = "android:tabStripLeft", method = "setLeftStripDrawable", type = TabWidget.class), @BindingMethod(attribute = "android:tabStripRight", method = "setRightStripDrawable", type = TabWidget.class)})
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class TabWidgetBindingAdapter {
}
