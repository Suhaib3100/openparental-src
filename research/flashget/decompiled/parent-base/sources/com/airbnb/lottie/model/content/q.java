package com.airbnb.lottie.model.content;

import com.airbnb.lottie.n0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ShapePath.java */
/* loaded from: classes3.dex */
public class q implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f39058a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39059b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f39060c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39061d;

    public q(String str, int i4, com.airbnb.lottie.model.animatable.h hVar, boolean z4) {
        this.f39058a = str;
        this.f39059b = i4;
        this.f39060c = hVar;
        this.f39061d = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.s(n0Var, bVar, this);
    }

    public String b() {
        return this.f39058a;
    }

    public com.airbnb.lottie.model.animatable.h c() {
        return this.f39060c;
    }

    public boolean d() {
        return this.f39061d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ń"));
        sb.append(this.f39058a);
        sb.append(ProtectedSandApp.s("ń"));
        return androidx.view.e.a(sb, this.f39059b, '}');
    }
}
