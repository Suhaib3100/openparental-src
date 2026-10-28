package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.c1;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes3.dex */
public final class a extends ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static final String f26921d = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* renamed from: a, reason: collision with root package name */
    private final int f26922a;

    /* renamed from: b, reason: collision with root package name */
    private final h0 f26923b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26924c;

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public a(int i4, @androidx.annotation.o0 h0 h0Var, int i5) {
        this.f26922a = i4;
        this.f26923b = h0Var;
        this.f26924c = i5;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@androidx.annotation.o0 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f26922a);
        this.f26923b.S0(this.f26924c, bundle);
    }
}
