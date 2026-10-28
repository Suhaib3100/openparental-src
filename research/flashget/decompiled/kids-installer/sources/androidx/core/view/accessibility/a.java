package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: r, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static final String f5306r = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* renamed from: o, reason: collision with root package name */
    private final int f5307o;

    /* renamed from: p, reason: collision with root package name */
    private final g0 f5308p;

    /* renamed from: q, reason: collision with root package name */
    private final int f5309q;

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public a(int i5, @o0 g0 g0Var, int i6) {
        this.f5307o = i5;
        this.f5308p = g0Var;
        this.f5309q = i6;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@o0 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5307o);
        this.f5308p.H0(this.f5309q, bundle);
    }
}
