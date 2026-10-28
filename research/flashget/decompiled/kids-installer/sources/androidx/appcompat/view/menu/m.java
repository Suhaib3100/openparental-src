package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.n;
import androidx.core.view.d0;
import androidx.core.view.y1;
import d.a;

/* compiled from: MenuPopupHelper.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class m implements i {

    /* renamed from: m, reason: collision with root package name */
    private static final int f743m = 48;

    /* renamed from: a, reason: collision with root package name */
    private final Context f744a;

    /* renamed from: b, reason: collision with root package name */
    private final g f745b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f746c;

    /* renamed from: d, reason: collision with root package name */
    private final int f747d;

    /* renamed from: e, reason: collision with root package name */
    private final int f748e;

    /* renamed from: f, reason: collision with root package name */
    private View f749f;

    /* renamed from: g, reason: collision with root package name */
    private int f750g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f751h;

    /* renamed from: i, reason: collision with root package name */
    private n.a f752i;

    /* renamed from: j, reason: collision with root package name */
    private l f753j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f754k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f755l;

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m.this.g();
        }
    }

    public m(@o0 Context context, @o0 g gVar) {
        this(context, gVar, null, false, a.c.G2, 0);
    }

    @o0
    private l b() {
        Display defaultDisplay = ((WindowManager) this.f744a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        l dVar = Math.min(point.x, point.y) >= this.f744a.getResources().getDimensionPixelSize(a.f.f21794w) ? new d(this.f744a, this.f749f, this.f747d, this.f748e, this.f746c) : new r(this.f744a, this.f745b, this.f749f, this.f747d, this.f748e, this.f746c);
        dVar.o(this.f745b);
        dVar.x(this.f755l);
        dVar.s(this.f749f);
        dVar.h(this.f752i);
        dVar.u(this.f751h);
        dVar.v(this.f750g);
        return dVar;
    }

    private void n(int i5, int i6, boolean z5, boolean z6) {
        l e6 = e();
        e6.y(z6);
        if (z5) {
            if ((Gravity.getAbsoluteGravity(this.f750g, y1.Z(this.f749f)) & 7) == 5) {
                i5 -= this.f749f.getWidth();
            }
            e6.w(i5);
            e6.z(i6);
            int i7 = (int) ((this.f744a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            e6.t(new Rect(i5 - i7, i6 - i7, i5 + i7, i6 + i7));
        }
        e6.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(@q0 n.a aVar) {
        this.f752i = aVar;
        l lVar = this.f753j;
        if (lVar != null) {
            lVar.h(aVar);
        }
    }

    public int c() {
        return this.f750g;
    }

    public ListView d() {
        return e().k();
    }

    @Override // androidx.appcompat.view.menu.i
    public void dismiss() {
        if (f()) {
            this.f753j.dismiss();
        }
    }

    @c1({c1.a.LIBRARY})
    @o0
    public l e() {
        if (this.f753j == null) {
            this.f753j = b();
        }
        return this.f753j;
    }

    public boolean f() {
        l lVar = this.f753j;
        return lVar != null && lVar.c();
    }

    protected void g() {
        this.f753j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f754k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(@o0 View view) {
        this.f749f = view;
    }

    public void i(boolean z5) {
        this.f751h = z5;
        l lVar = this.f753j;
        if (lVar != null) {
            lVar.u(z5);
        }
    }

    public void j(int i5) {
        this.f750g = i5;
    }

    public void k(@q0 PopupWindow.OnDismissListener onDismissListener) {
        this.f754k = onDismissListener;
    }

    public void l() {
        if (!o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m(int i5, int i6) {
        if (!p(i5, i6)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f749f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int i5, int i6) {
        if (f()) {
            return true;
        }
        if (this.f749f == null) {
            return false;
        }
        n(i5, i6, true, true);
        return true;
    }

    public m(@o0 Context context, @o0 g gVar, @o0 View view) {
        this(context, gVar, view, false, a.c.G2, 0);
    }

    public m(@o0 Context context, @o0 g gVar, @o0 View view, boolean z5, @androidx.annotation.f int i5) {
        this(context, gVar, view, z5, i5, 0);
    }

    public m(@o0 Context context, @o0 g gVar, @o0 View view, boolean z5, @androidx.annotation.f int i5, @h1 int i6) {
        this.f750g = d0.f5464b;
        this.f755l = new a();
        this.f744a = context;
        this.f745b = gVar;
        this.f749f = view;
        this.f746c = z5;
        this.f747d = i5;
        this.f748e = i6;
    }
}
