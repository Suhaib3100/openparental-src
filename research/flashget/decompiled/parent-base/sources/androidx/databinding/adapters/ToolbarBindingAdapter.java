package androidx.databinding.adapters;

import android.widget.Toolbar;
import androidx.annotation.c1;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:onMenuItemClick", method = "setOnMenuItemClickListener", type = Toolbar.class), @BindingMethod(attribute = "android:onNavigationClick", method = "setNavigationOnClickListener", type = Toolbar.class)})
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class ToolbarBindingAdapter {
}
