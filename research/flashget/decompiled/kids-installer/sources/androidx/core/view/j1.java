package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f5585a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f5586b;

    /* renamed from: c, reason: collision with root package name */
    private final View f5587c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5588d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f5589e;

    public j1(@androidx.annotation.o0 View view) {
        this.f5587c = view;
    }

    private boolean h(int i5, int i6, int i7, int i8, @androidx.annotation.q0 int[] iArr, int i9, @androidx.annotation.q0 int[] iArr2) {
        ViewParent i10;
        int i11;
        int i12;
        int[] iArr3;
        if (!m() || (i10 = i(i9)) == null) {
            return false;
        }
        if (i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f5587c.getLocationInWindow(iArr);
            i11 = iArr[0];
            i12 = iArr[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr2 == null) {
            int[] j5 = j();
            j5[0] = 0;
            j5[1] = 0;
            iArr3 = j5;
        } else {
            iArr3 = iArr2;
        }
        p3.i(i10, this.f5587c, i5, i6, i7, i8, i9, iArr3);
        if (iArr != null) {
            this.f5587c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i11;
            iArr[1] = iArr[1] - i12;
        }
        return true;
    }

    private ViewParent i(int i5) {
        if (i5 == 0) {
            return this.f5585a;
        }
        if (i5 != 1) {
            return null;
        }
        return this.f5586b;
    }

    private int[] j() {
        if (this.f5589e == null) {
            this.f5589e = new int[2];
        }
        return this.f5589e;
    }

    private void q(int i5, ViewParent viewParent) {
        if (i5 == 0) {
            this.f5585a = viewParent;
        } else {
            if (i5 != 1) {
                return;
            }
            this.f5586b = viewParent;
        }
    }

    public boolean a(float f6, float f7, boolean z5) {
        ViewParent i5;
        if (!m() || (i5 = i(0)) == null) {
            return false;
        }
        return p3.c(i5, this.f5587c, f6, f7, z5);
    }

    public boolean b(float f6, float f7) {
        ViewParent i5;
        if (!m() || (i5 = i(0)) == null) {
            return false;
        }
        return p3.d(i5, this.f5587c, f6, f7);
    }

    public boolean c(int i5, int i6, @androidx.annotation.q0 int[] iArr, @androidx.annotation.q0 int[] iArr2) {
        return d(i5, i6, iArr, iArr2, 0);
    }

    public boolean d(int i5, int i6, @androidx.annotation.q0 int[] iArr, @androidx.annotation.q0 int[] iArr2, int i7) {
        ViewParent i8;
        int i9;
        int i10;
        if (!m() || (i8 = i(i7)) == null) {
            return false;
        }
        if (i5 == 0 && i6 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f5587c.getLocationInWindow(iArr2);
            i9 = iArr2[0];
            i10 = iArr2[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        p3.f(i8, this.f5587c, i5, i6, iArr, i7);
        if (iArr2 != null) {
            this.f5587c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i9;
            iArr2[1] = iArr2[1] - i10;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i5, int i6, int i7, int i8, @androidx.annotation.q0 int[] iArr, int i9, @androidx.annotation.q0 int[] iArr2) {
        h(i5, i6, i7, i8, iArr, i9, iArr2);
    }

    public boolean f(int i5, int i6, int i7, int i8, @androidx.annotation.q0 int[] iArr) {
        return h(i5, i6, i7, i8, iArr, 0, null);
    }

    public boolean g(int i5, int i6, int i7, int i8, @androidx.annotation.q0 int[] iArr, int i9) {
        return h(i5, i6, i7, i8, iArr, i9, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i5) {
        return i(i5) != null;
    }

    public boolean m() {
        return this.f5588d;
    }

    public void n() {
        y1.G2(this.f5587c);
    }

    public void o(@androidx.annotation.o0 View view) {
        y1.G2(this.f5587c);
    }

    public void p(boolean z5) {
        if (this.f5588d) {
            y1.G2(this.f5587c);
        }
        this.f5588d = z5;
    }

    public boolean r(int i5) {
        return s(i5, 0);
    }

    public boolean s(int i5, int i6) {
        if (l(i6)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.f5587c;
        for (ViewParent parent = this.f5587c.getParent(); parent != null; parent = parent.getParent()) {
            if (p3.m(parent, view, this.f5587c, i5, i6)) {
                q(i6, parent);
                p3.k(parent, view, this.f5587c, i5, i6);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void t() {
        u(0);
    }

    public void u(int i5) {
        ViewParent i6 = i(i5);
        if (i6 != null) {
            p3.o(i6, this.f5587c, i5);
            q(i5, null);
        }
    }
}
