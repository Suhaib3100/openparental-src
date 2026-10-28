package com.airbnb.lottie.model.content;

import com.airbnb.lottie.n0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* loaded from: classes3.dex */
public class p implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f39055a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f39056b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f39057c;

    public p(String str, List<c> list, boolean z4) {
        this.f39055a = str;
        this.f39056b = list;
        this.f39057c = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.d(n0Var, bVar, this);
    }

    public List<c> b() {
        return this.f39056b;
    }

    public String c() {
        return this.f39055a;
    }

    public boolean d() {
        return this.f39057c;
    }

    public String toString() {
        return ProtectedSandApp.s("Ł") + this.f39055a + ProtectedSandApp.s("ł") + Arrays.toString(this.f39056b.toArray()) + '}';
    }
}
