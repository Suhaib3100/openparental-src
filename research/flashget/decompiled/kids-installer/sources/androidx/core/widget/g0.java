package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.c1;
import androidx.annotation.q0;

/* compiled from: TintableImageSourceView.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface g0 {
    @q0
    ColorStateList a();

    @q0
    PorterDuff.Mode c();

    void d(@q0 ColorStateList colorStateList);

    void i(@q0 PorterDuff.Mode mode);
}
