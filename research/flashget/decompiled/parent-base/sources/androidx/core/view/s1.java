package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: TintableBackgroundView.java */
/* loaded from: classes3.dex */
public interface s1 {
    @androidx.annotation.q0
    ColorStateList getSupportBackgroundTintList();

    @androidx.annotation.q0
    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(@androidx.annotation.q0 ColorStateList colorStateList);

    void setSupportBackgroundTintMode(@androidx.annotation.q0 PorterDuff.Mode mode);
}
