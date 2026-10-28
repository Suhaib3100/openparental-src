package net.minidev.json;

import net.minidev.json.l;

/* compiled from: JSONStyle.java */
/* loaded from: classes7.dex */
public class h {

    /* renamed from: g, reason: collision with root package name */
    public static final int f81709g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f81710h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f81711i = 4;

    /* renamed from: j, reason: collision with root package name */
    public static final int f81712j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final h f81713k = new h(0);

    /* renamed from: l, reason: collision with root package name */
    public static final h f81714l = new h(-1);

    /* renamed from: m, reason: collision with root package name */
    public static final h f81715m = new h(2);

    /* renamed from: a, reason: collision with root package name */
    private boolean f81716a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f81717b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f81718c;

    /* renamed from: d, reason: collision with root package name */
    private l.g f81719d;

    /* renamed from: e, reason: collision with root package name */
    private l.g f81720e;

    /* renamed from: f, reason: collision with root package name */
    private l.h f81721f;

    public h(int i4) {
        boolean z4 = (i4 & 1) == 0;
        this.f81716a = z4;
        boolean z5 = (i4 & 4) == 0;
        this.f81718c = z5;
        boolean z6 = (i4 & 2) == 0;
        this.f81717b = z6;
        l.g gVar = (i4 & 8) > 0 ? l.f81729c : l.f81727a;
        if (z5) {
            this.f81720e = l.f81728b;
        } else {
            this.f81720e = gVar;
        }
        if (z4) {
            this.f81719d = l.f81728b;
        } else {
            this.f81719d = gVar;
        }
        if (z6) {
            this.f81721f = l.f81731e;
        } else {
            this.f81721f = l.f81730d;
        }
    }

    public void j(String str, Appendable appendable) {
        this.f81721f.a(str, appendable);
    }

    public boolean k() {
        return false;
    }

    public boolean l(String str) {
        return this.f81719d.a(str);
    }

    public boolean m(String str) {
        return this.f81720e.a(str);
    }

    public boolean n() {
        return this.f81717b;
    }

    public boolean o() {
        return this.f81716a;
    }

    public boolean p() {
        return this.f81718c;
    }

    public h() {
        this(0);
    }
}
