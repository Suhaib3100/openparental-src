package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.c1;
import androidx.core.view.i2;
import androidx.core.view.j2;
import androidx.core.view.k2;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f1118c;

    /* renamed from: d, reason: collision with root package name */
    j2 f1119d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1120e;

    /* renamed from: b, reason: collision with root package name */
    private long f1117b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final k2 f1121f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<i2> f1116a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    class a extends k2 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1122a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f1123b = 0;

        a() {
        }

        @Override // androidx.core.view.k2, androidx.core.view.j2
        public void b(View view) {
            int i4 = this.f1123b + 1;
            this.f1123b = i4;
            if (i4 == i.this.f1116a.size()) {
                j2 j2Var = i.this.f1119d;
                if (j2Var != null) {
                    j2Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.k2, androidx.core.view.j2
        public void c(View view) {
            if (this.f1122a) {
                return;
            }
            this.f1122a = true;
            j2 j2Var = i.this.f1119d;
            if (j2Var != null) {
                j2Var.c(null);
            }
        }

        void d() {
            this.f1123b = 0;
            this.f1122a = false;
            i.this.b();
        }
    }

    public void a() {
        if (this.f1120e) {
            Iterator<i2> it = this.f1116a.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            this.f1120e = false;
        }
    }

    void b() {
        this.f1120e = false;
    }

    public i c(i2 i2Var) {
        if (!this.f1120e) {
            this.f1116a.add(i2Var);
        }
        return this;
    }

    public i d(i2 i2Var, i2 i2Var2) {
        this.f1116a.add(i2Var);
        i2Var2.w(i2Var.e());
        this.f1116a.add(i2Var2);
        return this;
    }

    public i e(long j4) {
        if (!this.f1120e) {
            this.f1117b = j4;
        }
        return this;
    }

    public i f(Interpolator interpolator) {
        if (!this.f1120e) {
            this.f1118c = interpolator;
        }
        return this;
    }

    public i g(j2 j2Var) {
        if (!this.f1120e) {
            this.f1119d = j2Var;
        }
        return this;
    }

    public void h() {
        if (this.f1120e) {
            return;
        }
        Iterator<i2> it = this.f1116a.iterator();
        while (it.hasNext()) {
            i2 next = it.next();
            long j4 = this.f1117b;
            if (j4 >= 0) {
                next.s(j4);
            }
            Interpolator interpolator = this.f1118c;
            if (interpolator != null) {
                next.t(interpolator);
            }
            if (this.f1119d != null) {
                next.u(this.f1121f);
            }
            next.y();
        }
        this.f1120e = true;
    }
}
