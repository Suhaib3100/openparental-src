package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.k0;
import androidx.appcompat.widget.m0;
import androidx.core.view.y1;
import d.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes3.dex */
final class d extends l implements n, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int P = a.k.f21955l;
    static final int Q = 0;
    static final int R = 1;
    static final int S = 200;
    private View C;
    View D;
    private boolean F;
    private boolean G;
    private int H;
    private int I;
    private boolean K;
    private n.a L;
    ViewTreeObserver M;
    private PopupWindow.OnDismissListener N;
    boolean O;

    /* renamed from: p, reason: collision with root package name */
    private final Context f654p;

    /* renamed from: q, reason: collision with root package name */
    private final int f655q;

    /* renamed from: r, reason: collision with root package name */
    private final int f656r;

    /* renamed from: s, reason: collision with root package name */
    private final int f657s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f658t;

    /* renamed from: u, reason: collision with root package name */
    final Handler f659u;

    /* renamed from: v, reason: collision with root package name */
    private final List<g> f660v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    final List<C0009d> f661w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f662x = new a();

    /* renamed from: y, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f663y = new b();

    /* renamed from: z, reason: collision with root package name */
    private final k0 f664z = new c();
    private int A = 0;
    private int B = 0;
    private boolean J = false;
    private int E = G();

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.c() || d.this.f661w.size() <= 0 || d.this.f661w.get(0).f672a.L()) {
                return;
            }
            View view = d.this.D;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0009d> it = d.this.f661w.iterator();
            while (it.hasNext()) {
                it.next().f672a.a();
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.M;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.M = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.M.removeGlobalOnLayoutListener(dVar.f662x);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes2.dex */
    class c implements k0 {

        /* compiled from: CascadingMenuPopup.java */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ C0009d f668o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ MenuItem f669p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ g f670q;

            a(C0009d c0009d, MenuItem menuItem, g gVar) {
                this.f668o = c0009d;
                this.f669p = menuItem;
                this.f670q = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0009d c0009d = this.f668o;
                if (c0009d != null) {
                    d.this.O = true;
                    c0009d.f673b.f(false);
                    d.this.O = false;
                }
                if (this.f669p.isEnabled() && this.f669p.hasSubMenu()) {
                    this.f670q.O(this.f669p, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.k0
        public void e(@o0 g gVar, @o0 MenuItem menuItem) {
            d.this.f659u.removeCallbacksAndMessages(null);
            int size = d.this.f661w.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    i5 = -1;
                    break;
                } else if (gVar == d.this.f661w.get(i5).f673b) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 == -1) {
                return;
            }
            int i6 = i5 + 1;
            d.this.f659u.postAtTime(new a(i6 < d.this.f661w.size() ? d.this.f661w.get(i6) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.k0
        public void h(@o0 g gVar, @o0 MenuItem menuItem) {
            d.this.f659u.removeCallbacksAndMessages(gVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0009d {

        /* renamed from: a, reason: collision with root package name */
        public final m0 f672a;

        /* renamed from: b, reason: collision with root package name */
        public final g f673b;

        /* renamed from: c, reason: collision with root package name */
        public final int f674c;

        public C0009d(@o0 m0 m0Var, @o0 g gVar, int i5) {
            this.f672a = m0Var;
            this.f673b = gVar;
            this.f674c = i5;
        }

        public ListView a() {
            return this.f672a.k();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    public d(@o0 Context context, @o0 View view, @androidx.annotation.f int i5, @h1 int i6, boolean z5) {
        this.f654p = context;
        this.C = view;
        this.f656r = i5;
        this.f657s = i6;
        this.f658t = z5;
        Resources resources = context.getResources();
        this.f655q = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.f.f21796x));
        this.f659u = new Handler();
    }

    private m0 C() {
        m0 m0Var = new m0(this.f654p, null, this.f656r, this.f657s);
        m0Var.r0(this.f664z);
        m0Var.f0(this);
        m0Var.e0(this);
        m0Var.S(this.C);
        m0Var.W(this.B);
        m0Var.d0(true);
        m0Var.a0(2);
        return m0Var;
    }

    private int D(@o0 g gVar) {
        int size = this.f661w.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (gVar == this.f661w.get(i5).f673b) {
                return i5;
            }
        }
        return -1;
    }

    private MenuItem E(@o0 g gVar, @o0 g gVar2) {
        int size = gVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = gVar.getItem(i5);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @q0
    private View F(@o0 C0009d c0009d, @o0 g gVar) {
        f fVar;
        int i5;
        int firstVisiblePosition;
        MenuItem E = E(c0009d.f673b, gVar);
        if (E == null) {
            return null;
        }
        ListView a6 = c0009d.a();
        ListAdapter adapter = a6.getAdapter();
        int i6 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i5 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i5 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i6 >= count) {
                i6 = -1;
                break;
            }
            if (E == fVar.getItem(i6)) {
                break;
            }
            i6++;
        }
        if (i6 != -1 && (firstVisiblePosition = (i6 + i5) - a6.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a6.getChildCount()) {
            return a6.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int G() {
        return y1.Z(this.C) == 1 ? 0 : 1;
    }

    private int H(int i5) {
        List<C0009d> list = this.f661w;
        ListView a6 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a6.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.D.getWindowVisibleDisplayFrame(rect);
        if (this.E == 1) {
            return (a6.getWidth() + iArr[0]) + i5 > rect.right ? 0 : 1;
        }
        return iArr[0] - i5 < 0 ? 1 : 0;
    }

    private void I(@o0 g gVar) {
        C0009d c0009d;
        View view;
        int i5;
        int i6;
        int width;
        LayoutInflater from = LayoutInflater.from(this.f654p);
        f fVar = new f(gVar, from, this.f658t, P);
        if (!c() && this.J) {
            fVar.e(true);
        } else if (c()) {
            fVar.e(l.A(gVar));
        }
        int r5 = l.r(fVar, null, this.f654p, this.f655q);
        m0 C = C();
        C.q(fVar);
        C.U(r5);
        C.W(this.B);
        if (this.f661w.size() > 0) {
            List<C0009d> list = this.f661w;
            c0009d = list.get(list.size() - 1);
            view = F(c0009d, gVar);
        } else {
            c0009d = null;
            view = null;
        }
        if (view != null) {
            C.s0(false);
            C.p0(null);
            int H = H(r5);
            boolean z5 = H == 1;
            this.E = H;
            if (Build.VERSION.SDK_INT >= 26) {
                C.S(view);
                i6 = 0;
                i5 = 0;
            } else {
                int[] iArr = new int[2];
                this.C.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.B & 7) == 5) {
                    iArr[0] = this.C.getWidth() + iArr[0];
                    iArr2[0] = view.getWidth() + iArr2[0];
                }
                i5 = iArr2[0] - iArr[0];
                i6 = iArr2[1] - iArr[1];
            }
            if ((this.B & 5) != 5) {
                if (z5) {
                    width = i5 + view.getWidth();
                    C.f(width);
                    C.h0(true);
                    C.l(i6);
                }
                width = i5 - r5;
                C.f(width);
                C.h0(true);
                C.l(i6);
            } else if (z5) {
                width = i5 + r5;
                C.f(width);
                C.h0(true);
                C.l(i6);
            } else {
                r5 = view.getWidth();
                width = i5 - r5;
                C.f(width);
                C.h0(true);
                C.l(i6);
            }
        } else {
            if (this.F) {
                C.f(this.H);
            }
            if (this.G) {
                C.l(this.I);
            }
            C.X(q());
        }
        this.f661w.add(new C0009d(C, gVar, this.E));
        C.a();
        ListView k5 = C.k();
        k5.setOnKeyListener(this);
        if (c0009d == null && this.K && gVar.A() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(a.k.f21962s, (ViewGroup) k5, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.A());
            k5.addHeaderView(frameLayout, null, false);
            C.a();
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public void a() {
        if (c()) {
            return;
        }
        Iterator<g> it = this.f660v.iterator();
        while (it.hasNext()) {
            I(it.next());
        }
        this.f660v.clear();
        View view = this.C;
        this.D = view;
        if (view != null) {
            boolean z5 = this.M == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.M = viewTreeObserver;
            if (z5) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f662x);
            }
            this.D.addOnAttachStateChangeListener(this.f663y);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z5) {
        int D = D(gVar);
        if (D < 0) {
            return;
        }
        int i5 = D + 1;
        if (i5 < this.f661w.size()) {
            this.f661w.get(i5).f673b.f(false);
        }
        C0009d remove = this.f661w.remove(D);
        remove.f673b.S(this);
        if (this.O) {
            remove.f672a.q0(null);
            remove.f672a.T(0);
        }
        remove.f672a.dismiss();
        int size = this.f661w.size();
        if (size > 0) {
            this.E = this.f661w.get(size - 1).f674c;
        } else {
            this.E = G();
        }
        if (size != 0) {
            if (z5) {
                this.f661w.get(0).f673b.f(false);
                return;
            }
            return;
        }
        dismiss();
        n.a aVar = this.L;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.M;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.M.removeGlobalOnLayoutListener(this.f662x);
            }
            this.M = null;
        }
        this.D.removeOnAttachStateChangeListener(this.f663y);
        this.N.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean c() {
        return this.f661w.size() > 0 && this.f661w.get(0).f672a.c();
    }

    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z5) {
        Iterator<C0009d> it = this.f661w.iterator();
        while (it.hasNext()) {
            l.B(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        int size = this.f661w.size();
        if (size > 0) {
            C0009d[] c0009dArr = (C0009d[]) this.f661w.toArray(new C0009d[size]);
            for (int i5 = size - 1; i5 >= 0; i5--) {
                C0009d c0009d = c0009dArr[i5];
                if (c0009d.f672a.c()) {
                    c0009d.f672a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(n.a aVar) {
        this.L = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.q
    public ListView k() {
        if (this.f661w.isEmpty()) {
            return null;
        }
        return this.f661w.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean l(t tVar) {
        for (C0009d c0009d : this.f661w) {
            if (tVar == c0009d.f673b) {
                c0009d.a().requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        o(tVar);
        n.a aVar = this.L;
        if (aVar != null) {
            aVar.c(tVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable n() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.l
    public void o(g gVar) {
        gVar.c(this, this.f654p);
        if (c()) {
            I(gVar);
        } else {
            this.f660v.add(gVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0009d c0009d;
        int size = this.f661w.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                c0009d = null;
                break;
            }
            c0009d = this.f661w.get(i5);
            if (!c0009d.f672a.c()) {
                break;
            } else {
                i5++;
            }
        }
        if (c0009d != null) {
            c0009d.f673b.f(false);
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
    protected boolean p() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public void s(@o0 View view) {
        if (this.C != view) {
            this.C = view;
            this.B = Gravity.getAbsoluteGravity(this.A, y1.Z(view));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void u(boolean z5) {
        this.J = z5;
    }

    @Override // androidx.appcompat.view.menu.l
    public void v(int i5) {
        if (this.A != i5) {
            this.A = i5;
            this.B = Gravity.getAbsoluteGravity(i5, y1.Z(this.C));
        }
    }

    @Override // androidx.appcompat.view.menu.l
    public void w(int i5) {
        this.F = true;
        this.H = i5;
    }

    @Override // androidx.appcompat.view.menu.l
    public void x(PopupWindow.OnDismissListener onDismissListener) {
        this.N = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.l
    public void y(boolean z5) {
        this.K = z5;
    }

    @Override // androidx.appcompat.view.menu.l
    public void z(int i5) {
        this.G = true;
        this.I = i5;
    }
}
