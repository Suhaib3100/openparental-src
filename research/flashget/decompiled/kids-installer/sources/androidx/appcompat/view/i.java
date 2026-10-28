package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.c1;
import androidx.core.view.r3;
import androidx.core.view.s3;
import androidx.core.view.t3;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f595c;

    /* renamed from: d, reason: collision with root package name */
    s3 f596d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f597e;

    /* renamed from: b, reason: collision with root package name */
    private long f594b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final t3 f598f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<r3> f593a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* loaded from: classes3.dex */
    class a extends t3 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f599a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f600b = 0;

        a() {
        }

        @Override // androidx.core.view.t3, androidx.core.view.s3
        public void b(View view) {
            int i5 = this.f600b + 1;
            this.f600b = i5;
            if (i5 == i.this.f593a.size()) {
                s3 s3Var = i.this.f596d;
                if (s3Var != null) {
                    s3Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.t3, androidx.core.view.s3
        public void c(View view) {
            if (this.f599a) {
                return;
            }
            this.f599a = true;
            s3 s3Var = i.this.f596d;
            if (s3Var != null) {
                s3Var.c(null);
            }
        }

        void d() {
            this.f600b = 0;
            this.f599a = false;
            i.this.b();
        }
    }

    public void a() {
        if (this.f597e) {
            Iterator<r3> it = this.f593a.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            this.f597e = false;
        }
    }

    void b() {
        this.f597e = false;
    }

    public i c(r3 r3Var) {
        if (!this.f597e) {
            this.f593a.add(r3Var);
        }
        return this;
    }

    public i d(r3 r3Var, r3 r3Var2) {
        this.f593a.add(r3Var);
        r3Var2.w(r3Var.e());
        this.f593a.add(r3Var2);
        return this;
    }

    public i e(long j5) {
        if (!this.f597e) {
            this.f594b = j5;
        }
        return this;
    }

    public i f(Interpolator interpolator) {
        if (!this.f597e) {
            this.f595c = interpolator;
        }
        return this;
    }

    public i g(s3 s3Var) {
        if (!this.f597e) {
            this.f596d = s3Var;
        }
        return this;
    }

    public void h() {
        if (this.f597e) {
            return;
        }
        Iterator<r3> it = this.f593a.iterator();
        while (it.hasNext()) {
            r3 next = it.next();
            long j5 = this.f594b;
            if (j5 >= 0) {
                next.s(j5);
            }
            Interpolator interpolator = this.f595c;
            if (interpolator != null) {
                next.t(interpolator);
            }
            if (this.f596d != null) {
                next.u(this.f598f);
            }
            next.y();
        }
        this.f597e = true;
    }
}
