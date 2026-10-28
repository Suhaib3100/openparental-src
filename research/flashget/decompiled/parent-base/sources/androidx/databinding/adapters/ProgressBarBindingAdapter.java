package androidx.databinding.adapters;

import android.widget.ProgressBar;
import androidx.annotation.c1;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:indeterminateTint", method = "setIndeterminateTintList", type = ProgressBar.class), @BindingMethod(attribute = "android:progressTint", method = "setProgressTintList", type = ProgressBar.class), @BindingMethod(attribute = "android:secondaryProgressTint", method = "setSecondaryProgressTintList", type = ProgressBar.class)})
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class ProgressBarBindingAdapter {
}
