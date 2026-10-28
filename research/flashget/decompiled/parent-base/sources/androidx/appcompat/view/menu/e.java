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
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.g0;
import androidx.core.view.x1;
import d.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
final class e extends m implements o, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int C = a.j.f73310l;
    static final int D = 0;
    static final int E = 1;
    static final int F = 200;
    private PopupWindow.OnDismissListener A;
    boolean B;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1189c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1190d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1191e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1192f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f1193g;

    /* renamed from: h, reason: collision with root package name */
    final Handler f1194h;

    /* renamed from: p, reason: collision with root package name */
    private View f1202p;

    /* renamed from: q, reason: collision with root package name */
    View f1203q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1205s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1206t;

    /* renamed from: u, reason: collision with root package name */
    private int f1207u;

    /* renamed from: v, reason: collision with root package name */
    private int f1208v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f1210x;

    /* renamed from: y, reason: collision with root package name */
    private o.a f1211y;

    /* renamed from: z, reason: collision with root package name */
    ViewTreeObserver f1212z;

    /* renamed from: i, reason: collision with root package name */
    private final List<h> f1195i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    final List<d> f1196j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1197k = new a();

    /* renamed from: l, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1198l = new b();

    /* renamed from: m, reason: collision with root package name */
    private final f0 f1199m = new c();

    /* renamed from: n, reason: collision with root package name */
    private int f1200n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f1201o = 0;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1209w = false;

    /* renamed from: r, reason: collision with root package name */
    private int f1204r = H();

    /* compiled from: CascadingMenuPopup.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!e.this.c() || e.this.f1196j.size() <= 0 || e.this.f1196j.get(0).f1220a.L()) {
                return;
            }
            View view = e.this.f1203q;
            if (view == null || !view.isShown()) {
                e.this.dismiss();
                return;
            }
            Iterator<d> it = e.this.f1196j.iterator();
            while (it.hasNext()) {
                it.next().f1220a.b();
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = e.this.f1212z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    e.this.f1212z = view.getViewTreeObserver();
                }
                e eVar = e.this;
                eVar.f1212z.removeGlobalOnLayoutListener(eVar.f1197k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    class c implements f0 {

        /* compiled from: CascadingMenuPopup.java */
        class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f1216b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ MenuItem f1217c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ h f1218d;

            a(d dVar, MenuItem menuItem, h hVar) {
                this.f1216b = dVar;
                this.f1217c = menuItem;
                this.f1218d = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1216b;
                if (dVar != null) {
                    e.this.B = true;
                    dVar.f1221b.f(false);
                    e.this.B = false;
                }
                if (this.f1217c.isEnabled() && this.f1217c.hasSubMenu()) {
                    this.f1218d.O(this.f1217c, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.f0
        public void f(@o0 h hVar, @o0 MenuItem menuItem) {
            e.this.f1194h.removeCallbacksAndMessages(null);
            int size = e.this.f1196j.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                } else if (hVar == e.this.f1196j.get(i4).f1221b) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 == -1) {
                return;
            }
            int i5 = i4 + 1;
            e.this.f1194h.postAtTime(new a(i5 < e.this.f1196j.size() ? e.this.f1196j.get(i5) : null, menuItem, hVar), hVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.f0
        public void p(@o0 h hVar, @o0 MenuItem menuItem) {
            e.this.f1194h.removeCallbacksAndMessages(hVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final g0 f1220a;

        /* renamed from: b, reason: collision with root package name */
        public final h f1221b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1222c;

        public d(@o0 g0 g0Var, @o0 h hVar, int i4) {
            this.f1220a = g0Var;
            this.f1221b = hVar;
            this.f1222c = i4;
        }

        public ListView a() {
            return this.f1220a.q();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.view.menu.e$e, reason: collision with other inner class name */
    public @interface InterfaceC0018e {
    }

    public e(@o0 Context context, @o0 View view, @androidx.annotation.f int i4, @h1 int i5, boolean z4) {
        this.f1189c = context;
        this.f1202p = view;
        this.f1191e = i4;
        this.f1192f = i5;
        this.f1193g = z4;
        Resources resources = context.getResources();
        this.f1190d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.e.f73178x));
        this.f1194h = new Handler();
    }

    private g0 D() {
        g0 g0Var = new g0(this.f1189c, null, this.f1191e, this.f1192f);
        g0Var.r0(this.f1199m);
        g0Var.f0(this);
        g0Var.e0(this);
        g0Var.S(this.f1202p);
        g0Var.W(this.f1201o);
        g0Var.d0(true);
        g0Var.a0(2);
        return g0Var;
    }

    private int E(@o0 h hVar) {
        int size = this.f1196j.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (hVar == this.f1196j.get(i4).f1221b) {
                return i4;
            }
        }
        return -1;
    }

    private MenuItem F(@o0 h hVar, @o0 h hVar2) {
        int size = hVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = hVar.getItem(i4);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @q0
    private View G(@o0 d dVar, @o0 h hVar) {
        g gVar;
        int i4;
        int firstVisiblePosition;
        MenuItem F2 = F(dVar.f1221b, hVar);
        if (F2 == null) {
            return null;
        }
        ListView a5 = dVar.a();
        ListAdapter adapter = a5.getAdapter();
        int i5 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i4 = headerViewListAdapter.getHeadersCount();
            gVar = (g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (g) adapter;
            i4 = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i5 >= count) {
                i5 = -1;
                break;
            }
            if (F2 == gVar.getItem(i5)) {
                break;
            }
            i5++;
        }
        if (i5 != -1 && (firstVisiblePosition = (i5 + i4) - a5.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a5.getChildCount()) {
            return a5.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int H() {
        return x1.c0(this.f1202p) == 1 ? 0 : 1;
    }

    private int I(int i4) {
        ListView a5 = ((d) androidx.appcompat.view.menu.d.a(this.f1196j, 1)).a();
        int[] iArr = new int[2];
        a5.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1203q.getWindowVisibleDisplayFrame(rect);
        if (this.f1204r == 1) {
            return (a5.getWidth() + iArr[0]) + i4 > rect.right ? 0 : 1;
        }
        return iArr[0] - i4 < 0 ? 1 : 0;
    }

    private void J(@o0 h hVar) {
        d dVar;
        View view;
        int i4;
        int i5;
        int width;
        LayoutInflater from = LayoutInflater.from(this.f1189c);
        g gVar = new g(hVar, from, this.f1193g, C);
        if (!c() && this.f1209w) {
            gVar.e(true);
        } else if (c()) {
            gVar.e(m.B(hVar));
        }
        int s4 = m.s(gVar, null, this.f1189c, this.f1190d);
        g0 D2 = D();
        D2.o(gVar);
        D2.U(s4);
        D2.W(this.f1201o);
        if (this.f1196j.size() > 0) {
            dVar = (d) androidx.appcompat.view.menu.d.a(this.f1196j, 1);
            view = G(dVar, hVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            D2.s0(false);
            D2.p0(null);
            int I = I(s4);
            boolean z4 = I == 1;
            this.f1204r = I;
            if (Build.VERSION.SDK_INT >= 26) {
                D2.S(view);
                i5 = 0;
                i4 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1202p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1201o & 7) == 5) {
                    iArr[0] = this.f1202p.getWidth() + iArr[0];
                    iArr2[0] = view.getWidth() + iArr2[0];
                }
                i4 = iArr2[0] - iArr[0];
                i5 = iArr2[1] - iArr[1];
            }
            if ((this.f1201o & 5) != 5) {
                if (z4) {
                    width = i4 + view.getWidth();
                    D2.g(width);
                    D2.h0(true);
                    D2.k(i5);
                }
                width = i4 - s4;
                D2.g(width);
                D2.h0(true);
                D2.k(i5);
            } else if (z4) {
                width = i4 + s4;
                D2.g(width);
                D2.h0(true);
                D2.k(i5);
            } else {
                s4 = view.getWidth();
                width = i4 - s4;
                D2.g(width);
                D2.h0(true);
                D2.k(i5);
            }
        } else {
            if (this.f1205s) {
                D2.g(this.f1207u);
            }
            if (this.f1206t) {
                D2.k(this.f1208v);
            }
            D2.X(r());
        }
        this.f1196j.add(new d(D2, hVar, this.f1204r));
        D2.b();
        ListView q4 = D2.q();
        q4.setOnKeyListener(this);
        if (dVar == null && this.f1210x && hVar.A() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(a.j.f73317s, (ViewGroup) q4, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(hVar.A());
            q4.addHeaderView(frameLayout, null, false);
            D2.b();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void A(int i4) {
        this.f1206t = true;
        this.f1208v = i4;
    }

    @Override // androidx.appcompat.view.menu.r
    public void b() {
        if (c()) {
            return;
        }
        Iterator<h> it = this.f1195i.iterator();
        while (it.hasNext()) {
            J(it.next());
        }
        this.f1195i.clear();
        View view = this.f1202p;
        this.f1203q = view;
        if (view != null) {
            boolean z4 = this.f1212z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1212z = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1197k);
            }
            this.f1203q.addOnAttachStateChangeListener(this.f1198l);
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public boolean c() {
        return this.f1196j.size() > 0 && this.f1196j.get(0).f1220a.c();
    }

    @Override // androidx.appcompat.view.menu.o
    public void d(h hVar, boolean z4) {
        int E2 = E(hVar);
        if (E2 < 0) {
            return;
        }
        int i4 = E2 + 1;
        if (i4 < this.f1196j.size()) {
            this.f1196j.get(i4).f1221b.f(false);
        }
        d remove = this.f1196j.remove(E2);
        remove.f1221b.S(this);
        if (this.B) {
            remove.f1220a.q0(null);
            remove.f1220a.T(0);
        }
        remove.f1220a.dismiss();
        int size = this.f1196j.size();
        if (size > 0) {
            this.f1204r = this.f1196j.get(size - 1).f1222c;
        } else {
            this.f1204r = H();
        }
        if (size != 0) {
            if (z4) {
                this.f1196j.get(0).f1221b.f(false);
                return;
            }
            return;
        }
        dismiss();
        o.a aVar = this.f1211y;
        if (aVar != null) {
            aVar.d(hVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1212z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1212z.removeGlobalOnLayoutListener(this.f1197k);
            }
            this.f1212z = null;
        }
        this.f1203q.removeOnAttachStateChangeListener(this.f1198l);
        this.A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.r
    public void dismiss() {
        int size = this.f1196j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1196j.toArray(new d[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                d dVar = dVarArr[i4];
                if (dVar.f1220a.c()) {
                    dVar.f1220a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public void f(o.a aVar) {
        this.f1211y = aVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public void g(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean h(t tVar) {
        for (d dVar : this.f1196j) {
            if (tVar == dVar.f1221b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        o(tVar);
        o.a aVar = this.f1211y;
        if (aVar != null) {
            aVar.e(tVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.o
    public Parcelable j() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.o
    public void k(boolean z4) {
        Iterator<d> it = this.f1196j.iterator();
        while (it.hasNext()) {
            m.C(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean l() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void o(h hVar) {
        hVar.c(this, this.f1189c);
        if (c()) {
            J(hVar);
        } else {
            this.f1195i.add(hVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1196j.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1196j.get(i4);
            if (!dVar.f1220a.c()) {
                break;
            } else {
                i4++;
            }
        }
        if (dVar != null) {
            dVar.f1221b.f(false);
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

    @Override // androidx.appcompat.view.menu.m
    protected boolean p() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.r
    public ListView q() {
        if (this.f1196j.isEmpty()) {
            return null;
        }
        return ((d) androidx.appcompat.view.menu.d.a(this.f1196j, 1)).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public void t(@o0 View view) {
        if (this.f1202p != view) {
            this.f1202p = view;
            this.f1201o = Gravity.getAbsoluteGravity(this.f1200n, x1.c0(view));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void v(boolean z4) {
        this.f1209w = z4;
    }

    @Override // androidx.appcompat.view.menu.m
    public void w(int i4) {
        if (this.f1200n != i4) {
            this.f1200n = i4;
            this.f1201o = Gravity.getAbsoluteGravity(i4, x1.c0(this.f1202p));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void x(int i4) {
        this.f1205s = true;
        this.f1207u = i4;
    }

    @Override // androidx.appcompat.view.menu.m
    public void y(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.m
    public void z(boolean z4) {
        this.f1210x = z4;
    }
}
