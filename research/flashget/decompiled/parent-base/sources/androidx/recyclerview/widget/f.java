package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.o0;

/* compiled from: BatchingListUpdateCallback.java */
/* loaded from: classes3.dex */
public class f implements v {

    /* renamed from: g, reason: collision with root package name */
    private static final int f33120g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static final int f33121h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f33122i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final int f33123j = 3;

    /* renamed from: b, reason: collision with root package name */
    final v f33124b;

    /* renamed from: c, reason: collision with root package name */
    int f33125c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f33126d = -1;

    /* renamed from: e, reason: collision with root package name */
    int f33127e = -1;

    /* renamed from: f, reason: collision with root package name */
    Object f33128f = null;

    public f(@o0 v vVar) {
        this.f33124b = vVar;
    }

    public void a() {
        int i4 = this.f33125c;
        if (i4 == 0) {
            return;
        }
        if (i4 == 1) {
            this.f33124b.onInserted(this.f33126d, this.f33127e);
        } else if (i4 == 2) {
            this.f33124b.onRemoved(this.f33126d, this.f33127e);
        } else if (i4 == 3) {
            this.f33124b.onChanged(this.f33126d, this.f33127e, this.f33128f);
        }
        this.f33128f = null;
        this.f33125c = 0;
    }

    @Override // androidx.recyclerview.widget.v
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i4, int i5, Object obj) {
        int i6;
        if (this.f33125c == 3) {
            int i7 = this.f33126d;
            int i10 = this.f33127e;
            if (i4 <= i7 + i10 && (i6 = i4 + i5) >= i7 && this.f33128f == obj) {
                this.f33126d = Math.min(i4, i7);
                this.f33127e = Math.max(i10 + i7, i6) - this.f33126d;
                return;
            }
        }
        a();
        this.f33126d = i4;
        this.f33127e = i5;
        this.f33128f = obj;
        this.f33125c = 3;
    }

    @Override // androidx.recyclerview.widget.v
    public void onInserted(int i4, int i5) {
        int i6;
        if (this.f33125c == 1 && i4 >= (i6 = this.f33126d)) {
            int i7 = this.f33127e;
            if (i4 <= i6 + i7) {
                this.f33127e = i7 + i5;
                this.f33126d = Math.min(i4, i6);
                return;
            }
        }
        a();
        this.f33126d = i4;
        this.f33127e = i5;
        this.f33125c = 1;
    }

    @Override // androidx.recyclerview.widget.v
    public void onMoved(int i4, int i5) {
        a();
        this.f33124b.onMoved(i4, i5);
    }

    @Override // androidx.recyclerview.widget.v
    public void onRemoved(int i4, int i5) {
        int i6;
        if (this.f33125c == 2 && (i6 = this.f33126d) >= i4 && i6 <= i4 + i5) {
            this.f33127e += i5;
            this.f33126d = i4;
        } else {
            a();
            this.f33126d = i4;
            this.f33127e = i5;
            this.f33125c = 2;
        }
    }
}
