package e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.appcompat.widget.i0;
import androidx.core.content.d;

/* compiled from: AppCompatResources.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {
    private a() {
    }

    public static ColorStateList a(@o0 Context context, @n int i4) {
        return d.getColorStateList(context, i4);
    }

    @q0
    public static Drawable b(@o0 Context context, @v int i4) {
        return i0.h().j(context, i4);
    }
}
