package com.airbnb.lottie.model.layer;

import androidx.annotation.q0;
import androidx.compose.material3.j4;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.animatable.l;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Locale;

/* compiled from: Layer.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.c> f39127a;

    /* renamed from: b, reason: collision with root package name */
    private final k f39128b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39129c;

    /* renamed from: d, reason: collision with root package name */
    private final long f39130d;

    /* renamed from: e, reason: collision with root package name */
    private final a f39131e;

    /* renamed from: f, reason: collision with root package name */
    private final long f39132f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private final String f39133g;

    /* renamed from: h, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.h> f39134h;

    /* renamed from: i, reason: collision with root package name */
    private final l f39135i;

    /* renamed from: j, reason: collision with root package name */
    private final int f39136j;

    /* renamed from: k, reason: collision with root package name */
    private final int f39137k;

    /* renamed from: l, reason: collision with root package name */
    private final int f39138l;

    /* renamed from: m, reason: collision with root package name */
    private final float f39139m;

    /* renamed from: n, reason: collision with root package name */
    private final float f39140n;

    /* renamed from: o, reason: collision with root package name */
    private final int f39141o;

    /* renamed from: p, reason: collision with root package name */
    private final int f39142p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.model.animatable.j f39143q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.model.animatable.k f39144r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.model.animatable.b f39145s;

    /* renamed from: t, reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<Float>> f39146t;

    /* renamed from: u, reason: collision with root package name */
    private final b f39147u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f39148v;

    /* renamed from: w, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.model.content.a f39149w;

    /* renamed from: x, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.parser.j f39150x;

    /* compiled from: Layer.java */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<com.airbnb.lottie.model.content.c> list, k kVar, String str, long j4, a aVar, long j5, @q0 String str2, List<com.airbnb.lottie.model.content.h> list2, l lVar, int i4, int i5, int i6, float f4, float f5, int i7, int i10, @q0 com.airbnb.lottie.model.animatable.j jVar, @q0 com.airbnb.lottie.model.animatable.k kVar2, List<com.airbnb.lottie.value.a<Float>> list3, b bVar, @q0 com.airbnb.lottie.model.animatable.b bVar2, boolean z4, @q0 com.airbnb.lottie.model.content.a aVar2, @q0 com.airbnb.lottie.parser.j jVar2) {
        this.f39127a = list;
        this.f39128b = kVar;
        this.f39129c = str;
        this.f39130d = j4;
        this.f39131e = aVar;
        this.f39132f = j5;
        this.f39133g = str2;
        this.f39134h = list2;
        this.f39135i = lVar;
        this.f39136j = i4;
        this.f39137k = i5;
        this.f39138l = i6;
        this.f39139m = f4;
        this.f39140n = f5;
        this.f39141o = i7;
        this.f39142p = i10;
        this.f39143q = jVar;
        this.f39144r = kVar2;
        this.f39146t = list3;
        this.f39147u = bVar;
        this.f39145s = bVar2;
        this.f39148v = z4;
        this.f39149w = aVar2;
        this.f39150x = jVar2;
    }

    @q0
    public com.airbnb.lottie.model.content.a a() {
        return this.f39149w;
    }

    k b() {
        return this.f39128b;
    }

    @q0
    public com.airbnb.lottie.parser.j c() {
        return this.f39150x;
    }

    public long d() {
        return this.f39130d;
    }

    List<com.airbnb.lottie.value.a<Float>> e() {
        return this.f39146t;
    }

    public a f() {
        return this.f39131e;
    }

    List<com.airbnb.lottie.model.content.h> g() {
        return this.f39134h;
    }

    b h() {
        return this.f39147u;
    }

    String i() {
        return this.f39129c;
    }

    long j() {
        return this.f39132f;
    }

    int k() {
        return this.f39142p;
    }

    int l() {
        return this.f39141o;
    }

    @q0
    String m() {
        return this.f39133g;
    }

    List<com.airbnb.lottie.model.content.c> n() {
        return this.f39127a;
    }

    int o() {
        return this.f39138l;
    }

    int p() {
        return this.f39137k;
    }

    int q() {
        return this.f39136j;
    }

    float r() {
        return this.f39140n / this.f39128b.e();
    }

    @q0
    com.airbnb.lottie.model.animatable.j s() {
        return this.f39143q;
    }

    @q0
    com.airbnb.lottie.model.animatable.k t() {
        return this.f39144r;
    }

    public String toString() {
        return y("");
    }

    @q0
    com.airbnb.lottie.model.animatable.b u() {
        return this.f39145s;
    }

    float v() {
        return this.f39139m;
    }

    l w() {
        return this.f39135i;
    }

    public boolean x() {
        return this.f39148v;
    }

    public String y(String str) {
        StringBuilder a5 = j4.a(str);
        a5.append(i());
        String s4 = ProtectedSandApp.s("ŵ");
        a5.append(s4);
        e x4 = this.f39128b.x(j());
        if (x4 != null) {
            a5.append(ProtectedSandApp.s("Ŷ"));
            a5.append(x4.i());
            e x5 = this.f39128b.x(x4.j());
            while (x5 != null) {
                a5.append(ProtectedSandApp.s("ŷ"));
                a5.append(x5.i());
                x5 = this.f39128b.x(x5.j());
            }
            a5.append(str);
            a5.append(s4);
        }
        if (!g().isEmpty()) {
            a5.append(str);
            a5.append(ProtectedSandApp.s("Ÿ"));
            a5.append(g().size());
            a5.append(s4);
        }
        if (q() != 0 && p() != 0) {
            a5.append(str);
            a5.append(ProtectedSandApp.s("Ź"));
            a5.append(String.format(Locale.US, ProtectedSandApp.s("ź"), Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.f39127a.isEmpty()) {
            a5.append(str);
            a5.append(ProtectedSandApp.s("Ż"));
            for (com.airbnb.lottie.model.content.c cVar : this.f39127a) {
                a5.append(str);
                a5.append(ProtectedSandApp.s("ż"));
                a5.append(cVar);
                a5.append(s4);
            }
        }
        return a5.toString();
    }
}
