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
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.m0;
import androidx.core.view.y1;
import d.a;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes3.dex */
final class r extends l implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, n, View.OnKeyListener {
    private static final int J = a.k.f21963t;
    private View A;
    View B;
    private n.a C;
    ViewTreeObserver D;
    private boolean E;
    private boolean F;
    private int G;
    private boolean I;

    /* renamed from: p, reason: collision with root package name */
    private final Context f758p;

    /* renamed from: q, reason: collision with root package name */
    private final g f759q;

    /* renamed from: r, reason: collision with root package name */
    private final f f760r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f761s;

    /* renamed from: t, reason: collision with root package name */
    private final int f762t;

    /* renamed from: u, reason: collision with root package name */
    private final int f763u;

    /* renamed from: v, reason: collision with root package name */
    private final int f764v;

    /* renamed from: w, reason: collision with root package name */
    final m0 f765w;

    /* renamed from: z, reason: collision with root package name */
    private PopupWindow.OnDismissListener f768z;

    /* renamed from: x, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f766x = new a();

    /* renamed from: y, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f767y = new b();
    private int H = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!r.this.c() || r.this.f765w.L()) {
                return;
            }
            View view = r.this.B;
            if (view == null || !view.isShown()) {
                r.this.dismiss();
            } else {
                r.this.f765w.a();
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = r.this.D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    r.this.D = view.getViewTreeObserver();
                }
                r rVar = r.this;
                rVar.D.removeGlobalOnLayoutListener(rVar.f766x);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public r(Context context, g gVar, View view, int i5, int i6, boolean z5) {
        this.f758p = context;
        this.f759q = gVar;
        this.f761s = z5;
        this.f760r = new f(gVar, LayoutInflater.from(context), z5, J);
        this.f763u = i5;
        this.f764v = i6;
        Resources resources = context.getResources();
        this.f762t = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.f.f21796x));
        this.A = view;
        this.f765w = new m0(context, null, i5, i6);
        gVar.c(this, context);
    }

    private boolean C() {
        View view;
        if (c()) {
            return true;
        }
        if (this.E || (view = this.A) == null) {
            return false;
        }
        this.B = view;
        this.f765w.e0(this);
        this.f765w.f0(this);
        this.f765w.d0(true);
        View view2 = this.B;
        boolean z5 = this.D == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.D = viewTreeObserver;
        if (z5) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f766x);
        }
        view2.addOnAttachStateChangeListener(this.f767y);
        this.f765w.S(view2);
        this.f765w.W(this.H);
        if (!this.F) {
            this.G = l.r(this.f760r, null, this.f758p, this.f762t);
            this.F = true;
        }
        this.f765w.U(this.G);
        this.f765w.a0(2);
        this.f765w.X(q());
        this.f765w.a();
        ListView k5 = this.f765w.k();
        k5.setOnKeyListener(this);
        if (this.I && this.f759q.A() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f758p).inflate(a.k.f21962s, (ViewGroup) k5, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f759q.A());
            }
            frameLayout.setEnabled(false);
            k5.addHeaderView(frameLayout, null, false);
        }
        this.f765w.q(this.f760r);
        this.f765w.a();
        return true;
    }

    @Override // androidx.appcompat.view.menu.q
    public void a() {
        if (!C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z5) {
        if (gVar != this.f759q) {
            return;
        }
        dismiss();
        n.a aVar = this.C;
        if (aVar != null) {
            aVar.b(gVar, z5);
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean c() {
        return !this.E && this.f765w.c();
    }

    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z5) {
        this.F = false;
        f fVar = this.f760r;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        if (c()) {
            this.f765w.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(n.a aVar) {
        this.C = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView k() {
        return this.f765w.k();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean l(t tVar) {
        if (tVar.hasVisibleItems()) {
            m mVar = new m(this.f758p, tVar, this.B, this.f761s, this.f763u, this.f764v);
            mVar.a(this.C);
            mVar.i(l.A(tVar));
            mVar.k(this.f768z);
            this.f768z = null;
            this.f759q.f(false);
            int d6 = this.f765w.d();
            int o5 = this.f765w.o();
            if ((Gravity.getAbsoluteGravity(this.H, y1.Z(this.A)) & 7) == 5) {
                d6 += this.A.getWidth();
            }
            if (mVar.p(d6, o5)) {
                n.a aVar = this.C;
                if (aVar == null) {
                    return true;
                }
                aVar.c(tVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable n() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.l
    public void o(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.E = true;
        this.f759q.close();
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.D = this.B.getViewTreeObserver();
            }
            this.D.removeGlobalOnLayoutListener(this.f766x);
            this.D = null;
        }
        this.B.removeOnAttachStateChangeListener(this.f767y);
        PopupWindow.OnDismissListener onDismissListener = this.f768z;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i5, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i5 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.l
    public void s(View view) {
        this.A = view;
    }

    @Override // androidx.appcompat.view.menu.l
    public void u(boolean z5) {
        this.f760r.e(z5);
    }

    @Override // androidx.appcompat.view.menu.l
    public void v(int i5) {
        this.H = i5;
    }

    @Override // androidx.appcompat.view.menu.l
    public void w(int i5) {
        this.f765w.f(i5);
    }

    @Override // androidx.appcompat.view.menu.l
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.f768z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void y(boolean z5) {
        this.I = z5;
    }

    @Override // androidx.appcompat.view.menu.l
    public void z(int i5) {
        this.f765w.l(i5);
    }
}
