package androidx.databinding;

import androidx.annotation.c1;
import androidx.annotation.q0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: WeakListener.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
class h0<T> extends WeakReference<ViewDataBinding> {

    /* renamed from: a, reason: collision with root package name */
    private final a0<T> f6118a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f6119b;

    /* renamed from: c, reason: collision with root package name */
    private T f6120c;

    public h0(ViewDataBinding viewDataBinding, int i5, a0<T> a0Var, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.f6119b = i5;
        this.f6118a = a0Var;
    }

    @q0
    protected ViewDataBinding a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            e();
        }
        return viewDataBinding;
    }

    public T b() {
        return this.f6120c;
    }

    public void c(android.view.a0 a0Var) {
        this.f6118a.b(a0Var);
    }

    public void d(T t5) {
        e();
        this.f6120c = t5;
        if (t5 != null) {
            this.f6118a.e(t5);
        }
    }

    public boolean e() {
        boolean z5;
        T t5 = this.f6120c;
        if (t5 != null) {
            this.f6118a.d(t5);
            z5 = true;
        } else {
            z5 = false;
        }
        this.f6120c = null;
        return z5;
    }
}
