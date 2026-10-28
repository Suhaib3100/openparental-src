package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.c1;
import androidx.annotation.q0;

/* compiled from: TintableCheckedTextView.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public interface t {
    void a(@q0 PorterDuff.Mode mode);

    @q0
    PorterDuff.Mode b();

    @q0
    ColorStateList c();

    void d(@q0 ColorStateList colorStateList);
}
