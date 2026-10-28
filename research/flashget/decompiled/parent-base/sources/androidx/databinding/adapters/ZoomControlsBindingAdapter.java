package androidx.databinding.adapters;

import android.widget.ZoomControls;
import androidx.annotation.c1;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:onZoomIn", method = "setOnZoomInClickListener", type = ZoomControls.class), @BindingMethod(attribute = "android:onZoomOut", method = "setOnZoomOutClickListener", type = ZoomControls.class)})
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class ZoomControlsBindingAdapter {
}
