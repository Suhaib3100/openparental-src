package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Constructor;

/* compiled from: StaticLayoutBuilderCompat.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
final class j {

    /* renamed from: o, reason: collision with root package name */
    static final float f53487o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    static final float f53488p = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f53493u;

    /* renamed from: v, reason: collision with root package name */
    @q0
    private static Constructor<StaticLayout> f53494v;

    /* renamed from: w, reason: collision with root package name */
    @q0
    private static Object f53495w;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f53496a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f53497b;

    /* renamed from: c, reason: collision with root package name */
    private final int f53498c;

    /* renamed from: e, reason: collision with root package name */
    private int f53500e;

    /* renamed from: l, reason: collision with root package name */
    private boolean f53507l;

    /* renamed from: q, reason: collision with root package name */
    private static final String f53489q = ProtectedSandApp.s("\uf1e6");

    /* renamed from: r, reason: collision with root package name */
    private static final String f53490r = ProtectedSandApp.s("\uf1e7");

    /* renamed from: s, reason: collision with root package name */
    private static final String f53491s = ProtectedSandApp.s("\uf1e8");

    /* renamed from: t, reason: collision with root package name */
    private static final String f53492t = ProtectedSandApp.s("\uf1e9");

    /* renamed from: n, reason: collision with root package name */
    static final int f53486n = 1;

    /* renamed from: d, reason: collision with root package name */
    private int f53499d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f53501f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f53502g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    private float f53503h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f53504i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f53505j = f53486n;

    /* renamed from: k, reason: collision with root package name */
    private boolean f53506k = true;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private TextUtils.TruncateAt f53508m = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    static class a extends Exception {
        a(Throwable th) {
            super(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.b.a(th, new StringBuilder(ProtectedSandApp.s("\uf1e5"))), th);
        }
    }

    private j(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.f53496a = charSequence;
        this.f53497b = textPaint;
        this.f53498c = i4;
        this.f53500e = charSequence.length();
    }

    private void b() throws a {
        if (f53493u) {
            return;
        }
        try {
            f53495w = this.f53507l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f53494v = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f53493u = true;
        } catch (Exception e4) {
            throw new a(e4);
        }
    }

    @o0
    public static j c(@o0 CharSequence charSequence, @o0 TextPaint textPaint, @g0(from = 0) int i4) {
        return new j(charSequence, textPaint, i4);
    }

    public StaticLayout a() throws a {
        if (this.f53496a == null) {
            this.f53496a = "";
        }
        int max = Math.max(0, this.f53498c);
        CharSequence charSequence = this.f53496a;
        if (this.f53502g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f53497b, max, this.f53508m);
        }
        int min = Math.min(charSequence.length(), this.f53500e);
        this.f53500e = min;
        if (this.f53507l && this.f53502g == 1) {
            this.f53501f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f53499d, min, this.f53497b, max);
        obtain.setAlignment(this.f53501f);
        obtain.setIncludePad(this.f53506k);
        obtain.setTextDirection(this.f53507l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f53508m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f53502g);
        float f4 = this.f53503h;
        if (f4 != 0.0f || this.f53504i != 1.0f) {
            obtain.setLineSpacing(f4, this.f53504i);
        }
        if (this.f53502g > 1) {
            obtain.setHyphenationFrequency(this.f53505j);
        }
        return obtain.build();
    }

    @o0
    public j d(@o0 Layout.Alignment alignment) {
        this.f53501f = alignment;
        return this;
    }

    @o0
    public j e(@q0 TextUtils.TruncateAt truncateAt) {
        this.f53508m = truncateAt;
        return this;
    }

    @o0
    public j f(@g0(from = 0) int i4) {
        this.f53500e = i4;
        return this;
    }

    @o0
    public j g(int i4) {
        this.f53505j = i4;
        return this;
    }

    @o0
    public j h(boolean z4) {
        this.f53506k = z4;
        return this;
    }

    public j i(boolean z4) {
        this.f53507l = z4;
        return this;
    }

    @o0
    public j j(float f4, float f5) {
        this.f53503h = f4;
        this.f53504i = f5;
        return this;
    }

    @o0
    public j k(@g0(from = 0) int i4) {
        this.f53502g = i4;
        return this;
    }

    @o0
    public j l(@g0(from = 0) int i4) {
        this.f53499d = i4;
        return this;
    }
}
