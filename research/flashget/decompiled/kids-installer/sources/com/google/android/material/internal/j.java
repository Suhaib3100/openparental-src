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
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Constructor;

/* compiled from: StaticLayoutBuilderCompat.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
final class j {

    /* renamed from: o, reason: collision with root package name */
    static final float f13692o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    static final float f13693p = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f13698u;

    /* renamed from: v, reason: collision with root package name */
    @q0
    private static Constructor<StaticLayout> f13699v;

    /* renamed from: w, reason: collision with root package name */
    @q0
    private static Object f13700w;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f13701a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f13702b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13703c;

    /* renamed from: e, reason: collision with root package name */
    private int f13705e;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13712l;

    /* renamed from: q, reason: collision with root package name */
    private static final String f13694q = ProtectedSandApp.s("ሺ");

    /* renamed from: r, reason: collision with root package name */
    private static final String f13695r = ProtectedSandApp.s("ሻ");

    /* renamed from: s, reason: collision with root package name */
    private static final String f13696s = ProtectedSandApp.s("ሼ");

    /* renamed from: t, reason: collision with root package name */
    private static final String f13697t = ProtectedSandApp.s("ሽ");

    /* renamed from: n, reason: collision with root package name */
    static final int f13691n = 1;

    /* renamed from: d, reason: collision with root package name */
    private int f13704d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f13706f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f13707g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    private float f13708h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f13709i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f13710j = f13691n;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13711k = true;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private TextUtils.TruncateAt f13713m = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    static class a extends Exception {
        a(Throwable th) {
            super(ProtectedSandApp.s("ሹ") + th.getMessage(), th);
        }
    }

    private j(CharSequence charSequence, TextPaint textPaint, int i5) {
        this.f13701a = charSequence;
        this.f13702b = textPaint;
        this.f13703c = i5;
        this.f13705e = charSequence.length();
    }

    private void b() throws a {
        if (f13698u) {
            return;
        }
        try {
            f13700w = this.f13712l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f13699v = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f13698u = true;
        } catch (Exception e6) {
            throw new a(e6);
        }
    }

    @o0
    public static j c(@o0 CharSequence charSequence, @o0 TextPaint textPaint, @g0(from = 0) int i5) {
        return new j(charSequence, textPaint, i5);
    }

    public StaticLayout a() throws a {
        if (this.f13701a == null) {
            this.f13701a = "";
        }
        int max = Math.max(0, this.f13703c);
        CharSequence charSequence = this.f13701a;
        if (this.f13707g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f13702b, max, this.f13713m);
        }
        int min = Math.min(charSequence.length(), this.f13705e);
        this.f13705e = min;
        if (this.f13712l && this.f13707g == 1) {
            this.f13706f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f13704d, min, this.f13702b, max);
        obtain.setAlignment(this.f13706f);
        obtain.setIncludePad(this.f13711k);
        obtain.setTextDirection(this.f13712l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f13713m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f13707g);
        float f6 = this.f13708h;
        if (f6 != 0.0f || this.f13709i != 1.0f) {
            obtain.setLineSpacing(f6, this.f13709i);
        }
        if (this.f13707g > 1) {
            obtain.setHyphenationFrequency(this.f13710j);
        }
        return obtain.build();
    }

    @o0
    public j d(@o0 Layout.Alignment alignment) {
        this.f13706f = alignment;
        return this;
    }

    @o0
    public j e(@q0 TextUtils.TruncateAt truncateAt) {
        this.f13713m = truncateAt;
        return this;
    }

    @o0
    public j f(@g0(from = 0) int i5) {
        this.f13705e = i5;
        return this;
    }

    @o0
    public j g(int i5) {
        this.f13710j = i5;
        return this;
    }

    @o0
    public j h(boolean z5) {
        this.f13711k = z5;
        return this;
    }

    public j i(boolean z5) {
        this.f13712l = z5;
        return this;
    }

    @o0
    public j j(float f6, float f7) {
        this.f13708h = f6;
        this.f13709i = f7;
        return this;
    }

    @o0
    public j k(@g0(from = 0) int i5) {
        this.f13707g = i5;
        return this;
    }

    @o0
    public j l(@g0(from = 0) int i5) {
        this.f13704d = i5;
        return this;
    }
}
