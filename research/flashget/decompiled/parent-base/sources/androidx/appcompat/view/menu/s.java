package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.g0;
import androidx.core.view.x1;
import d.a;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
final class s extends m implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, o, View.OnKeyListener {

    /* renamed from: w, reason: collision with root package name */
    private static final int f1306w = a.j.f73318t;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1307c;

    /* renamed from: d, reason: collision with root package name */
    private final h f1308d;

    /* renamed from: e, reason: collision with root package name */
    private final g f1309e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1310f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1311g;

    /* renamed from: h, reason: collision with root package name */
    private final int f1312h;

    /* renamed from: i, reason: collision with root package name */
    private final int f1313i;

    /* renamed from: j, reason: collision with root package name */
    final g0 f1314j;

    /* renamed from: m, reason: collision with root package name */
    private PopupWindow.OnDismissListener f1317m;

    /* renamed from: n, reason: collision with root package name */
    private View f1318n;

    /* renamed from: o, reason: collision with root package name */
    View f1319o;

    /* renamed from: p, reason: collision with root package name */
    private o.a f1320p;

    /* renamed from: q, reason: collision with root package name */
    ViewTreeObserver f1321q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1322r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1323s;

    /* renamed from: t, reason: collision with root package name */
    private int f1324t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1326v;

    /* renamed from: k, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1315k = new a();

    /* renamed from: l, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1316l = new b();

    /* renamed from: u, reason: collision with root package name */
    private int f1325u = 0;

    /* compiled from: StandardMenuPopup.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!s.this.c() || s.this.f1314j.L()) {
                return;
            }
            View view = s.this.f1319o;
            if (view == null || !view.isShown()) {
                s.this.dismiss();
            } else {
                s.this.f1314j.b();
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = s.this.f1321q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    s.this.f1321q = view.getViewTreeObserver();
                }
                s sVar = s.this;
                sVar.f1321q.removeGlobalOnLayoutListener(sVar.f1315k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public s(Context context, h hVar, View view, int i4, int i5, boolean z4) {
        this.f1307c = context;
        this.f1308d = hVar;
        this.f1310f = z4;
        this.f1309e = new g(hVar, LayoutInflater.from(context), z4, f1306w);
        this.f1312h = i4;
        this.f1313i = i5;
        Resources resources = context.getResources();
        this.f1311g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.e.f73178x));
        this.f1318n = view;
        this.f1314j = new g0(context, null, i4, i5);
        hVar.c(this, context);
    }

    private boolean D() {
        View view;
        if (c()) {
            return true;
        }
        if (this.f1322r || (view = this.f1318n) == null) {
            return false;
        }
        this.f1319o = view;
        this.f1314j.e0(this);
        this.f1314j.f0(this);
        this.f1314j.d0(true);
        View view2 = this.f1319o;
        boolean z4 = this.f1321q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1321q = viewTreeObserver;
        if (z4) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1315k);
        }
        view2.addOnAttachStateChangeListener(this.f1316l);
        this.f1314j.S(view2);
        this.f1314j.W(this.f1325u);
        if (!this.f1323s) {
            this.f1324t = m.s(this.f1309e, null, this.f1307c, this.f1311g);
            this.f1323s = true;
        }
        this.f1314j.U(this.f1324t);
        this.f1314j.a0(2);
        this.f1314j.X(r());
        this.f1314j.b();
        ListView q4 = this.f1314j.q();
        q4.setOnKeyListener(this);
        if (this.f1326v && this.f1308d.A() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1307c).inflate(a.j.f73317s, (ViewGroup) q4, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f1308d.A());
            }
            frameLayout.setEnabled(false);
            q4.addHeaderView(frameLayout, null, false);
        }
        this.f1314j.o(this.f1309e);
        this.f1314j.b();
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void A(int i4) {
        this.f1314j.k(i4);
    }

    @Override // androidx.appcompat.view.menu.r
    public void b() {
        if (!D()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public boolean c() {
        return !this.f1322r && this.f1314j.c();
    }

    @Override // androidx.appcompat.view.menu.o
    public void d(h hVar, boolean z4) {
        if (hVar != this.f1308d) {
            return;
        }
        dismiss();
        o.a aVar = this.f1320p;
        if (aVar != null) {
            aVar.d(hVar, z4);
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public void dismiss() {
        if (c()) {
            this.f1314j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public void f(o.a aVar) {
        this.f1320p = aVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public void g(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean h(t tVar) {
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f1307c, tVar, this.f1319o, this.f1310f, this.f1312h, this.f1313i);
            nVar.a(this.f1320p);
            nVar.i(m.B(tVar));
            nVar.k(this.f1317m);
            this.f1317m = null;
            this.f1308d.f(false);
            int e4 = this.f1314j.e();
            int d5 = this.f1314j.d();
            if ((Gravity.getAbsoluteGravity(this.f1325u, x1.c0(this.f1318n)) & 7) == 5) {
                e4 += this.f1318n.getWidth();
            }
            if (nVar.p(e4, d5)) {
                o.a aVar = this.f1320p;
                if (aVar == null) {
                    return true;
                }
                aVar.e(tVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public Parcelable j() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.o
    public void k(boolean z4) {
        this.f1323s = false;
        g gVar = this.f1309e;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean l() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void o(h hVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1322r = true;
        this.f1308d.close();
        ViewTreeObserver viewTreeObserver = this.f1321q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1321q = this.f1319o.getViewTreeObserver();
            }
            this.f1321q.removeGlobalOnLayoutListener(this.f1315k);
            this.f1321q = null;
        }
        this.f1319o.removeOnAttachStateChangeListener(this.f1316l);
        PopupWindow.OnDismissListener onDismissListener = this.f1317m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.r
    public ListView q() {
        return this.f1314j.q();
    }

    @Override // androidx.appcompat.view.menu.m
    public void t(View view) {
        this.f1318n = view;
    }

    @Override // androidx.appcompat.view.menu.m
    public void v(boolean z4) {
        this.f1309e.e(z4);
    }

    @Override // androidx.appcompat.view.menu.m
    public void w(int i4) {
        this.f1325u = i4;
    }

    @Override // androidx.appcompat.view.menu.m
    public void x(int i4) {
        this.f1314j.g(i4);
    }

    @Override // androidx.appcompat.view.menu.m
    public void y(PopupWindow.OnDismissListener onDismissListener) {
        this.f1317m = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.m
    public void z(boolean z4) {
        this.f1326v = z4;
    }
}
