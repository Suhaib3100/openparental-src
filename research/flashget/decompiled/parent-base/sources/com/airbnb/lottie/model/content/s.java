package com.airbnb.lottie.model.content;

import com.airbnb.lottie.animation.content.v;
import com.airbnb.lottie.n0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ShapeTrimPath.java */
/* loaded from: classes3.dex */
public class s implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f39074a;

    /* renamed from: b, reason: collision with root package name */
    private final a f39075b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39076c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39077d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39078e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f39079f;

    /* compiled from: ShapeTrimPath.java */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a forId(int i4) {
            if (i4 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i4 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ō"), i4));
        }
    }

    public s(String str, a aVar, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, boolean z4) {
        this.f39074a = str;
        this.f39075b = aVar;
        this.f39076c = bVar;
        this.f39077d = bVar2;
        this.f39078e = bVar3;
        this.f39079f = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new v(bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f39077d;
    }

    public String c() {
        return this.f39074a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f39078e;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f39076c;
    }

    public a f() {
        return this.f39075b;
    }

    public boolean g() {
        return this.f39079f;
    }

    public String toString() {
        return ProtectedSandApp.s("Ŏ") + this.f39076c + ProtectedSandApp.s("ŏ") + this.f39077d + ProtectedSandApp.s("Ő") + this.f39078e + ProtectedSandApp.s("ő");
    }
}
