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
import androidx.annotation.x0;
import androidx.appcompat.view.menu.o;
import androidx.core.view.f0;
import androidx.core.view.x1;
import d.a;

/* compiled from: MenuPopupHelper.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class n implements j {

    /* renamed from: m, reason: collision with root package name */
    private static final int f1291m = 48;

    /* renamed from: a, reason: collision with root package name */
    private final Context f1292a;

    /* renamed from: b, reason: collision with root package name */
    private final h f1293b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1294c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1295d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1296e;

    /* renamed from: f, reason: collision with root package name */
    private View f1297f;

    /* renamed from: g, reason: collision with root package name */
    private int f1298g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1299h;

    /* renamed from: i, reason: collision with root package name */
    private o.a f1300i;

    /* renamed from: j, reason: collision with root package name */
    private m f1301j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1302k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f1303l;

    /* compiled from: MenuPopupHelper.java */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            n.this.g();
        }
    }

    /* compiled from: MenuPopupHelper.java */
    @x0(17)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public n(@o0 Context context, @o0 h hVar) {
        this(context, hVar, null, false, a.b.f73076z2, 0);
    }

    @o0
    private m b() {
        Display defaultDisplay = ((WindowManager) this.f1292a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        m eVar = Math.min(point.x, point.y) >= this.f1292a.getResources().getDimensionPixelSize(a.e.f73176w) ? new e(this.f1292a, this.f1297f, this.f1295d, this.f1296e, this.f1294c) : new s(this.f1292a, this.f1293b, this.f1297f, this.f1295d, this.f1296e, this.f1294c);
        eVar.o(this.f1293b);
        eVar.y(this.f1303l);
        eVar.t(this.f1297f);
        eVar.f(this.f1300i);
        eVar.v(this.f1299h);
        eVar.w(this.f1298g);
        return eVar;
    }

    private void n(int i4, int i5, boolean z4, boolean z5) {
        m e4 = e();
        e4.z(z5);
        if (z4) {
            if ((Gravity.getAbsoluteGravity(this.f1298g, x1.c0(this.f1297f)) & 7) == 5) {
                i4 -= this.f1297f.getWidth();
            }
            e4.x(i4);
            e4.A(i5);
            int i6 = (int) ((this.f1292a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            e4.u(new Rect(i4 - i6, i5 - i6, i4 + i6, i5 + i6));
        }
        e4.b();
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(@q0 o.a aVar) {
        this.f1300i = aVar;
        m mVar = this.f1301j;
        if (mVar != null) {
            mVar.f(aVar);
        }
    }

    public int c() {
        return this.f1298g;
    }

    public ListView d() {
        return e().q();
    }

    @Override // androidx.appcompat.view.menu.j
    public void dismiss() {
        if (f()) {
            this.f1301j.dismiss();
        }
    }

    @c1({c1.a.LIBRARY})
    @o0
    public m e() {
        if (this.f1301j == null) {
            this.f1301j = b();
        }
        return this.f1301j;
    }

    public boolean f() {
        m mVar = this.f1301j;
        return mVar != null && mVar.c();
    }

    protected void g() {
        this.f1301j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1302k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(@o0 View view) {
        this.f1297f = view;
    }

    public void i(boolean z4) {
        this.f1299h = z4;
        m mVar = this.f1301j;
        if (mVar != null) {
            mVar.v(z4);
        }
    }

    public void j(int i4) {
        this.f1298g = i4;
    }

    public void k(@q0 PopupWindow.OnDismissListener onDismissListener) {
        this.f1302k = onDismissListener;
    }

    public void l() {
        if (!o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m(int i4, int i5) {
        if (!p(i4, i5)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f1297f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int i4, int i5) {
        if (f()) {
            return true;
        }
        if (this.f1297f == null) {
            return false;
        }
        n(i4, i5, true, true);
        return true;
    }

    public n(@o0 Context context, @o0 h hVar, @o0 View view) {
        this(context, hVar, view, false, a.b.f73076z2, 0);
    }

    public n(@o0 Context context, @o0 h hVar, @o0 View view, boolean z4, @androidx.annotation.f int i4) {
        this(context, hVar, view, z4, i4, 0);
    }

    public n(@o0 Context context, @o0 h hVar, @o0 View view, boolean z4, @androidx.annotation.f int i4, @h1 int i5) {
        this.f1298g = f0.f27129b;
        this.f1303l = new a();
        this.f1292a = context;
        this.f1293b = hVar;
        this.f1297f = view;
        this.f1294c = z4;
        this.f1295d = i4;
        this.f1296e = i5;
    }
}
