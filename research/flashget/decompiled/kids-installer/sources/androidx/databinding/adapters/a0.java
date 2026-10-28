package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.widget.Switch;
import androidx.annotation.c1;

/* compiled from: SwitchBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:thumb", method = "setThumbDrawable", type = Switch.class), @androidx.databinding.g(attribute = "android:track", method = "setTrackDrawable", type = Switch.class)})
@TargetApi(14)
/* loaded from: classes.dex */
public class a0 {
    @androidx.databinding.d({"android:switchTextAppearance"})
    public static void a(Switch r12, int i5) {
        r12.setSwitchTextAppearance(null, i5);
    }
}
