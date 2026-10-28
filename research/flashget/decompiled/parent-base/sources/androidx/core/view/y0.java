package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes3.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f27499a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f27500b;

    /* renamed from: c, reason: collision with root package name */
    private final View f27501c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27502d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f27503e;

    public y0(@androidx.annotation.o0 View view) {
        this.f27501c = view;
    }

    private boolean h(int i4, int i5, int i6, int i7, @androidx.annotation.q0 int[] iArr, int i10, @androidx.annotation.q0 int[] iArr2) {
        ViewParent i11;
        int i12;
        int i13;
        int[] iArr3;
        if (!m() || (i11 = i(i10)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f27501c.getLocationInWindow(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr2 == null) {
            int[] j4 = j();
            j4[0] = 0;
            j4[1] = 0;
            iArr3 = j4;
        } else {
            iArr3 = iArr2;
        }
        g2.i(i11, this.f27501c, i4, i5, i6, i7, i10, iArr3);
        if (iArr != null) {
            this.f27501c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i12;
            iArr[1] = iArr[1] - i13;
        }
        return true;
    }

    private ViewParent i(int i4) {
        if (i4 == 0) {
            return this.f27499a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f27500b;
    }

    private int[] j() {
        if (this.f27503e == null) {
            this.f27503e = new int[2];
        }
        return this.f27503e;
    }

    private void q(int i4, ViewParent viewParent) {
        if (i4 == 0) {
            this.f27499a = viewParent;
        } else {
            if (i4 != 1) {
                return;
            }
            this.f27500b = viewParent;
        }
    }

    public boolean a(float f4, float f5, boolean z4) {
        ViewParent i4;
        if (!m() || (i4 = i(0)) == null) {
            return false;
        }
        return g2.c(i4, this.f27501c, f4, f5, z4);
    }

    public boolean b(float f4, float f5) {
        ViewParent i4;
        if (!m() || (i4 = i(0)) == null) {
            return false;
        }
        return g2.d(i4, this.f27501c, f4, f5);
    }

    public boolean c(int i4, int i5, @androidx.annotation.q0 int[] iArr, @androidx.annotation.q0 int[] iArr2) {
        return d(i4, i5, iArr, iArr2, 0);
    }

    public boolean d(int i4, int i5, @androidx.annotation.q0 int[] iArr, @androidx.annotation.q0 int[] iArr2, int i6) {
        ViewParent i7;
        int i10;
        int i11;
        if (!m() || (i7 = i(i6)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f27501c.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        g2.f(i7, this.f27501c, i4, i5, iArr, i6);
        if (iArr2 != null) {
            this.f27501c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i4, int i5, int i6, int i7, @androidx.annotation.q0 int[] iArr, int i10, @androidx.annotation.q0 int[] iArr2) {
        h(i4, i5, i6, i7, iArr, i10, iArr2);
    }

    public boolean f(int i4, int i5, int i6, int i7, @androidx.annotation.q0 int[] iArr) {
        return h(i4, i5, i6, i7, iArr, 0, null);
    }

    public boolean g(int i4, int i5, int i6, int i7, @androidx.annotation.q0 int[] iArr, int i10) {
        return h(i4, i5, i6, i7, iArr, i10, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i4) {
        return i(i4) != null;
    }

    public boolean m() {
        return this.f27502d;
    }

    public void n() {
        x1.P2(this.f27501c);
    }

    public void o(@androidx.annotation.o0 View view) {
        x1.P2(this.f27501c);
    }

    public void p(boolean z4) {
        if (this.f27502d) {
            x1.P2(this.f27501c);
        }
        this.f27502d = z4;
    }

    public boolean r(int i4) {
        return s(i4, 0);
    }

    public boolean s(int i4, int i5) {
        if (l(i5)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.f27501c;
        for (ViewParent parent = this.f27501c.getParent(); parent != null; parent = parent.getParent()) {
            if (g2.m(parent, view, this.f27501c, i4, i5)) {
                q(i5, parent);
                g2.k(parent, view, this.f27501c, i4, i5);
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

    public void u(int i4) {
        ViewParent i5 = i(i4);
        if (i5 != null) {
            g2.o(i5, this.f27501c, i4);
            q(i4, null);
        }
    }
}
