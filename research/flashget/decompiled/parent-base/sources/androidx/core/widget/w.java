package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.c1;
import androidx.annotation.q0;

/* compiled from: TintableImageSourceView.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public interface w {
    @q0
    ColorStateList getSupportImageTintList();

    @q0
    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@q0 ColorStateList colorStateList);

    void setSupportImageTintMode(@q0 PorterDuff.Mode mode);
}
