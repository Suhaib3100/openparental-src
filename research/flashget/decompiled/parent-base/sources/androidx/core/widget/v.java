package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.q0;

/* compiled from: TintableCompoundDrawablesView.java */
/* loaded from: classes3.dex */
public interface v {
    @q0
    ColorStateList getSupportCompoundDrawablesTintList();

    @q0
    PorterDuff.Mode getSupportCompoundDrawablesTintMode();

    void setSupportCompoundDrawablesTintList(@q0 ColorStateList colorStateList);

    void setSupportCompoundDrawablesTintMode(@q0 PorterDuff.Mode mode);
}
