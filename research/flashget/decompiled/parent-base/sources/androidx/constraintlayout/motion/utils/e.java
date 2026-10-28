package androidx.constraintlayout.motion.utils;

import android.view.View;

/* compiled from: ViewState.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public float f23150a;

    /* renamed from: b, reason: collision with root package name */
    public int f23151b;

    /* renamed from: c, reason: collision with root package name */
    public int f23152c;

    /* renamed from: d, reason: collision with root package name */
    public int f23153d;

    /* renamed from: e, reason: collision with root package name */
    public int f23154e;

    public void a(View v4) {
        this.f23151b = v4.getLeft();
        this.f23152c = v4.getTop();
        this.f23153d = v4.getRight();
        this.f23154e = v4.getBottom();
        this.f23150a = v4.getRotation();
    }

    public int b() {
        return this.f23154e - this.f23152c;
    }

    public int c() {
        return this.f23153d - this.f23151b;
    }
}
