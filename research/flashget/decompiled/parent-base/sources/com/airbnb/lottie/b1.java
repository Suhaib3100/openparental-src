package com.airbnb.lottie;

import androidx.annotation.c1;
import androidx.annotation.m1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TextDelegate.java */
/* loaded from: classes3.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f38867a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private final LottieAnimationView f38868b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.q0
    private final n0 f38869c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f38870d;

    @m1
    b1() {
        this.f38867a = new HashMap();
        this.f38870d = true;
        this.f38868b = null;
        this.f38869c = null;
    }

    private void d() {
        LottieAnimationView lottieAnimationView = this.f38868b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        n0 n0Var = this.f38869c;
        if (n0Var != null) {
            n0Var.invalidateSelf();
        }
    }

    public String a(String str) {
        return str;
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    @c1({c1.a.LIBRARY})
    public final String c(String str, String str2) {
        if (this.f38870d && this.f38867a.containsKey(str2)) {
            return this.f38867a.get(str2);
        }
        String b5 = b(str, str2);
        if (this.f38870d) {
            this.f38867a.put(str2, b5);
        }
        return b5;
    }

    public void e() {
        this.f38867a.clear();
        d();
    }

    public void f(String str) {
        this.f38867a.remove(str);
        d();
    }

    public void g(boolean z4) {
        this.f38870d = z4;
    }

    public void h(String str, String str2) {
        this.f38867a.put(str, str2);
        d();
    }

    public b1(LottieAnimationView lottieAnimationView) {
        this.f38867a = new HashMap();
        this.f38870d = true;
        this.f38868b = lottieAnimationView;
        this.f38869c = null;
    }

    public b1(n0 n0Var) {
        this.f38867a = new HashMap();
        this.f38870d = true;
        this.f38869c = n0Var;
        this.f38868b = null;
    }
}
