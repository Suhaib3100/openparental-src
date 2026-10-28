package androidx.databinding.adapters;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import androidx.databinding.BindingConversion;

/* loaded from: classes3.dex */
public class Converters {
    @BindingConversion
    public static ColorStateList convertColorToColorStateList(int i4) {
        return ColorStateList.valueOf(i4);
    }

    @BindingConversion
    public static ColorDrawable convertColorToDrawable(int i4) {
        return new ColorDrawable(i4);
    }
}
