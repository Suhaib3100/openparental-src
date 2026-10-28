package com.scwang.smart.refresh.layout.constant;

/* compiled from: DimensionStatus.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f70670c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f70671d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f70672e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f70673f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f70674g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f70675h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f70676i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f70677j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f70678k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f70679l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f70680m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f70681n;

    /* renamed from: o, reason: collision with root package name */
    public static final a[] f70682o;

    /* renamed from: a, reason: collision with root package name */
    public final int f70683a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f70684b;

    static {
        a aVar = new a(0, false);
        f70670c = aVar;
        a aVar2 = new a(1, true);
        f70671d = aVar2;
        a aVar3 = new a(2, false);
        f70672e = aVar3;
        a aVar4 = new a(3, true);
        f70673f = aVar4;
        a aVar5 = new a(4, false);
        f70674g = aVar5;
        a aVar6 = new a(5, true);
        f70675h = aVar6;
        a aVar7 = new a(6, false);
        f70676i = aVar7;
        a aVar8 = new a(7, true);
        f70677j = aVar8;
        a aVar9 = new a(8, false);
        f70678k = aVar9;
        a aVar10 = new a(9, true);
        f70679l = aVar10;
        a aVar11 = new a(10, false);
        f70680m = aVar11;
        a aVar12 = new a(10, true);
        f70681n = aVar12;
        f70682o = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
    }

    private a(int i4, boolean z4) {
        this.f70683a = i4;
        this.f70684b = z4;
    }

    public boolean a(a aVar) {
        int i4 = this.f70683a;
        int i5 = aVar.f70683a;
        return i4 < i5 || ((!this.f70684b || f70679l == this) && i4 == i5);
    }

    public a b() {
        return !this.f70684b ? f70682o[this.f70683a + 1] : this;
    }

    public a c() {
        if (!this.f70684b) {
            return this;
        }
        a aVar = f70682o[this.f70683a - 1];
        return !aVar.f70684b ? aVar : f70670c;
    }
}
