package androidx.recyclerview.widget;

import androidx.annotation.o0;

/* compiled from: BatchingListUpdateCallback.java */
/* loaded from: classes3.dex */
public class f implements v {

    /* renamed from: t, reason: collision with root package name */
    private static final int f9222t = 0;

    /* renamed from: u, reason: collision with root package name */
    private static final int f9223u = 1;

    /* renamed from: v, reason: collision with root package name */
    private static final int f9224v = 2;

    /* renamed from: w, reason: collision with root package name */
    private static final int f9225w = 3;

    /* renamed from: o, reason: collision with root package name */
    final v f9226o;

    /* renamed from: p, reason: collision with root package name */
    int f9227p = 0;

    /* renamed from: q, reason: collision with root package name */
    int f9228q = -1;

    /* renamed from: r, reason: collision with root package name */
    int f9229r = -1;

    /* renamed from: s, reason: collision with root package name */
    Object f9230s = null;

    public f(@o0 v vVar) {
        this.f9226o = vVar;
    }

    @Override // androidx.recyclerview.widget.v
    public void a(int i5, int i6) {
        e();
        this.f9226o.a(i5, i6);
    }

    @Override // androidx.recyclerview.widget.v
    public void b(int i5, int i6) {
        int i7;
        if (this.f9227p == 1 && i5 >= (i7 = this.f9228q)) {
            int i8 = this.f9229r;
            if (i5 <= i7 + i8) {
                this.f9229r = i8 + i6;
                this.f9228q = Math.min(i5, i7);
                return;
            }
        }
        e();
        this.f9228q = i5;
        this.f9229r = i6;
        this.f9227p = 1;
    }

    @Override // androidx.recyclerview.widget.v
    public void c(int i5, int i6) {
        int i7;
        if (this.f9227p == 2 && (i7 = this.f9228q) >= i5 && i7 <= i5 + i6) {
            this.f9229r += i6;
            this.f9228q = i5;
        } else {
            e();
            this.f9228q = i5;
            this.f9229r = i6;
            this.f9227p = 2;
        }
    }

    @Override // androidx.recyclerview.widget.v
    public void d(int i5, int i6, Object obj) {
        int i7;
        if (this.f9227p == 3) {
            int i8 = this.f9228q;
            int i9 = this.f9229r;
            if (i5 <= i8 + i9 && (i7 = i5 + i6) >= i8 && this.f9230s == obj) {
                this.f9228q = Math.min(i5, i8);
                this.f9229r = Math.max(i9 + i8, i7) - this.f9228q;
                return;
            }
        }
        e();
        this.f9228q = i5;
        this.f9229r = i6;
        this.f9230s = obj;
        this.f9227p = 3;
    }

    public void e() {
        int i5 = this.f9227p;
        if (i5 == 0) {
            return;
        }
        if (i5 == 1) {
            this.f9226o.b(this.f9228q, this.f9229r);
        } else if (i5 == 2) {
            this.f9226o.c(this.f9228q, this.f9229r);
        } else if (i5 == 3) {
            this.f9226o.d(this.f9228q, this.f9229r, this.f9230s);
        }
        this.f9230s = null;
        this.f9227p = 0;
    }
}
