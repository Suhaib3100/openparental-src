package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import d.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.b implements b.a {
    private static final String F = "ActionMenuPresenter";
    a A;
    c B;
    private b C;
    final f D;
    int E;

    /* renamed from: l, reason: collision with root package name */
    d f1382l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f1383m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1384n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1385o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1386p;

    /* renamed from: q, reason: collision with root package name */
    private int f1387q;

    /* renamed from: r, reason: collision with root package name */
    private int f1388r;

    /* renamed from: s, reason: collision with root package name */
    private int f1389s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1390t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1391u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1392v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1393w;

    /* renamed from: x, reason: collision with root package name */
    private int f1394x;

    /* renamed from: y, reason: collision with root package name */
    private final SparseBooleanArray f1395y;

    /* renamed from: z, reason: collision with root package name */
    e f1396z;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f1397b;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f1397b);
        }

        SavedState(Parcel parcel) {
            this.f1397b = parcel.readInt();
        }
    }

    private class a extends androidx.appcompat.view.menu.n {
        public a(Context context, androidx.appcompat.view.menu.t tVar, View view) {
            super(context, tVar, view, false, a.b.G, 0);
            if (!((androidx.appcompat.view.menu.k) tVar.getItem()).o()) {
                View view2 = ActionMenuPresenter.this.f1382l;
                h(view2 == null ? (View) ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f1184j : view2);
            }
            a(ActionMenuPresenter.this.D);
        }

        @Override // androidx.appcompat.view.menu.n
        protected void g() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.A = null;
            actionMenuPresenter.E = 0;
            super.g();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.r a() {
            a aVar = ActionMenuPresenter.this.A;
            if (aVar != null) {
                return aVar.e();
            }
            return null;
        }
    }

    private class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private e f1400b;

        public c(e eVar) {
            this.f1400b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f1178d != null) {
                ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f1178d.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f1184j;
            if (view != null && view.getWindowToken() != null && this.f1400b.o()) {
                ActionMenuPresenter.this.f1396z = this.f1400b;
            }
            ActionMenuPresenter.this.B = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        class a extends e0 {

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ ActionMenuPresenter f1403k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f1403k = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.e0
            public androidx.appcompat.view.menu.r b() {
                e eVar = ActionMenuPresenter.this.f1396z;
                if (eVar == null) {
                    return null;
                }
                return eVar.e();
            }

            @Override // androidx.appcompat.widget.e0
            public boolean c() {
                ActionMenuPresenter.this.R();
                return true;
            }

            @Override // androidx.appcompat.widget.e0
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.B != null) {
                    return false;
                }
                actionMenuPresenter.F();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, a.b.F);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            y0.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.R();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i4, int i5, int i6, int i7) {
            boolean frame = super.setFrame(i4, i5, i6, i7);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.n {
        public e(Context context, androidx.appcompat.view.menu.h hVar, View view, boolean z4) {
            super(context, hVar, view, z4, a.b.G, 0);
            j(androidx.core.view.f0.f27130c);
            a(ActionMenuPresenter.this.D);
        }

        @Override // androidx.appcompat.view.menu.n
        protected void g() {
            if (((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f1178d != null) {
                ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f1178d.close();
            }
            ActionMenuPresenter.this.f1396z = null;
            super.g();
        }
    }

    private class f implements o.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.o.a
        public void d(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar, boolean z4) {
            if (hVar instanceof androidx.appcompat.view.menu.t) {
                hVar.G().f(false);
            }
            o.a r4 = ActionMenuPresenter.this.r();
            if (r4 != null) {
                r4.d(hVar, z4);
            }
        }

        @Override // androidx.appcompat.view.menu.o.a
        public boolean e(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar) {
            if (hVar == ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f1178d) {
                return false;
            }
            ActionMenuPresenter.this.E = ((androidx.appcompat.view.menu.t) hVar).getItem().getItemId();
            o.a r4 = ActionMenuPresenter.this.r();
            if (r4 != null) {
                return r4.e(hVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, a.j.f73302d, a.j.f73301c);
        this.f1395y = new SparseBooleanArray();
        this.D = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View D(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1184j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof p.a) && ((p.a) childAt).g() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean C() {
        return F() | G();
    }

    public Drawable E() {
        d dVar = this.f1382l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1384n) {
            return this.f1383m;
        }
        return null;
    }

    public boolean F() {
        Object obj;
        c cVar = this.B;
        if (cVar != null && (obj = this.f1184j) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.B = null;
            return true;
        }
        e eVar = this.f1396z;
        if (eVar == null) {
            return false;
        }
        eVar.dismiss();
        return true;
    }

    public boolean G() {
        a aVar = this.A;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        return true;
    }

    public boolean H() {
        return this.B != null || I();
    }

    public boolean I() {
        e eVar = this.f1396z;
        return eVar != null && eVar.f();
    }

    public boolean J() {
        return this.f1385o;
    }

    public void K(Configuration configuration) {
        if (!this.f1390t) {
            this.f1389s = androidx.appcompat.view.a.b(this.f1177c).d();
        }
        androidx.appcompat.view.menu.h hVar = this.f1178d;
        if (hVar != null) {
            hVar.N(true);
        }
    }

    public void L(boolean z4) {
        this.f1393w = z4;
    }

    public void M(int i4) {
        this.f1389s = i4;
        this.f1390t = true;
    }

    public void N(ActionMenuView actionMenuView) {
        this.f1184j = actionMenuView;
        actionMenuView.a(this.f1178d);
    }

    public void O(Drawable drawable) {
        d dVar = this.f1382l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1384n = true;
            this.f1383m = drawable;
        }
    }

    public void P(boolean z4) {
        this.f1385o = z4;
        this.f1386p = true;
    }

    public void Q(int i4, boolean z4) {
        this.f1387q = i4;
        this.f1391u = z4;
        this.f1392v = true;
    }

    public boolean R() {
        androidx.appcompat.view.menu.h hVar;
        if (!this.f1385o || I() || (hVar = this.f1178d) == null || this.f1184j == null || this.B != null || hVar.C().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f1177c, this.f1178d, this.f1382l, true));
        this.B = cVar;
        ((View) this.f1184j).post(cVar);
        return true;
    }

    @Override // androidx.core.view.b.a
    public void b(boolean z4) {
        if (z4) {
            super.h(null);
            return;
        }
        androidx.appcompat.view.menu.h hVar = this.f1178d;
        if (hVar != null) {
            hVar.f(false);
        }
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.o
    public void d(androidx.appcompat.view.menu.h hVar, boolean z4) {
        C();
        super.d(hVar, z4);
    }

    @Override // androidx.appcompat.view.menu.o
    public void g(Parcelable parcelable) {
        int i4;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i4 = ((SavedState) parcelable).f1397b) > 0 && (findItem = this.f1178d.findItem(i4)) != null) {
            h((androidx.appcompat.view.menu.t) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.o
    public boolean h(androidx.appcompat.view.menu.t tVar) {
        boolean z4 = false;
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.t tVar2 = tVar;
        while (tVar2.n0() != this.f1178d) {
            tVar2 = (androidx.appcompat.view.menu.t) tVar2.n0();
        }
        View D = D(tVar2.getItem());
        if (D == null) {
            return false;
        }
        this.E = tVar.getItem().getItemId();
        int size = tVar.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            MenuItem item = tVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z4 = true;
                break;
            }
            i4++;
        }
        a aVar = new a(this.f1177c, tVar, D);
        this.A = aVar;
        aVar.i(z4);
        this.A.l();
        super.h(tVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.o
    public androidx.appcompat.view.menu.p i(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.p pVar = this.f1184j;
        androidx.appcompat.view.menu.p i4 = super.i(viewGroup);
        if (pVar != i4) {
            ((ActionMenuView) i4).x0(this);
        }
        return i4;
    }

    @Override // androidx.appcompat.view.menu.o
    public Parcelable j() {
        SavedState savedState = new SavedState();
        savedState.f1397b = this.E;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.o
    public void k(boolean z4) {
        super.k(z4);
        ((View) this.f1184j).requestLayout();
        androidx.appcompat.view.menu.h hVar = this.f1178d;
        boolean z5 = false;
        if (hVar != null) {
            ArrayList<androidx.appcompat.view.menu.k> v4 = hVar.v();
            int size = v4.size();
            for (int i4 = 0; i4 < size; i4++) {
                androidx.core.view.b a5 = v4.get(i4).a();
                if (a5 != null) {
                    a5.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.h hVar2 = this.f1178d;
        ArrayList<androidx.appcompat.view.menu.k> C = hVar2 != null ? hVar2.C() : null;
        if (this.f1385o && C != null) {
            int size2 = C.size();
            if (size2 == 1) {
                z5 = !C.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z5 = true;
            }
        }
        if (z5) {
            if (this.f1382l == null) {
                this.f1382l = new d(this.f1176b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1382l.getParent();
            if (viewGroup != this.f1184j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1382l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1184j;
                actionMenuView.addView(this.f1382l, actionMenuView.f0());
            }
        } else {
            d dVar = this.f1382l;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f1184j;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1382l);
                }
            }
        }
        ((ActionMenuView) this.f1184j).v0(this.f1385o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.o
    public boolean l() {
        ArrayList<androidx.appcompat.view.menu.k> arrayList;
        int i4;
        int i5;
        int i6;
        boolean z4;
        int i7;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.h hVar = actionMenuPresenter.f1178d;
        View view = null;
        ?? r32 = 0;
        if (hVar != null) {
            arrayList = hVar.H();
            i4 = arrayList.size();
        } else {
            arrayList = null;
            i4 = 0;
        }
        int i10 = actionMenuPresenter.f1389s;
        int i11 = actionMenuPresenter.f1388r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f1184j;
        boolean z5 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i4; i14++) {
            androidx.appcompat.view.menu.k kVar = arrayList.get(i14);
            if (kVar.b()) {
                i12++;
            } else if (kVar.q()) {
                i13++;
            } else {
                z5 = true;
            }
            if (actionMenuPresenter.f1393w && kVar.isActionViewExpanded()) {
                i10 = 0;
            }
        }
        if (actionMenuPresenter.f1385o && (z5 || i13 + i12 > i10)) {
            i10--;
        }
        int i15 = i10 - i12;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f1395y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f1391u) {
            int i16 = actionMenuPresenter.f1394x;
            i5 = i11 / i16;
            i6 = ((i11 % i16) / i5) + i16;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < i4) {
            androidx.appcompat.view.menu.k kVar2 = arrayList.get(i17);
            if (kVar2.b()) {
                View s4 = actionMenuPresenter.s(kVar2, view, viewGroup);
                if (actionMenuPresenter.f1391u) {
                    i5 -= ActionMenuView.o0(s4, i6, i5, makeMeasureSpec, r32);
                } else {
                    s4.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = s4.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                int groupId = kVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                kVar2.x(true);
                z4 = r32;
                i7 = i4;
            } else if (kVar2.q()) {
                int groupId2 = kVar2.getGroupId();
                boolean z6 = sparseBooleanArray.get(groupId2);
                boolean z7 = (i15 > 0 || z6) && i11 > 0 && (!actionMenuPresenter.f1391u || i5 > 0);
                boolean z10 = z7;
                i7 = i4;
                if (z7) {
                    View s5 = actionMenuPresenter.s(kVar2, null, viewGroup);
                    if (actionMenuPresenter.f1391u) {
                        int o02 = ActionMenuView.o0(s5, i6, i5, makeMeasureSpec, 0);
                        i5 -= o02;
                        if (o02 == 0) {
                            z10 = false;
                        }
                    } else {
                        s5.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z11 = z10;
                    int measuredWidth2 = s5.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    z7 = z11 & (!actionMenuPresenter.f1391u ? i11 + i18 <= 0 : i11 < 0);
                }
                if (z7 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z6) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i19 = 0; i19 < i17; i19++) {
                        androidx.appcompat.view.menu.k kVar3 = arrayList.get(i19);
                        if (kVar3.getGroupId() == groupId2) {
                            if (kVar3.o()) {
                                i15++;
                            }
                            kVar3.x(false);
                        }
                    }
                }
                if (z7) {
                    i15--;
                }
                kVar2.x(z7);
                z4 = false;
            } else {
                z4 = r32;
                i7 = i4;
                kVar2.x(z4);
            }
            i17++;
            r32 = z4;
            i4 = i7;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.o
    public void n(@androidx.annotation.o0 Context context, @androidx.annotation.q0 androidx.appcompat.view.menu.h hVar) {
        super.n(context, hVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b5 = androidx.appcompat.view.a.b(context);
        if (!this.f1386p) {
            this.f1385o = b5.h();
        }
        if (!this.f1392v) {
            this.f1387q = b5.c();
        }
        if (!this.f1390t) {
            this.f1389s = b5.d();
        }
        int i4 = this.f1387q;
        if (this.f1385o) {
            if (this.f1382l == null) {
                d dVar = new d(this.f1176b);
                this.f1382l = dVar;
                if (this.f1384n) {
                    dVar.setImageDrawable(this.f1383m);
                    this.f1383m = null;
                    this.f1384n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1382l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f1382l.getMeasuredWidth();
        } else {
            this.f1382l = null;
        }
        this.f1388r = i4;
        this.f1394x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b
    public void o(androidx.appcompat.view.menu.k kVar, p.a aVar) {
        aVar.e(kVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.j((ActionMenuView) this.f1184j);
        if (this.C == null) {
            this.C = new b();
        }
        actionMenuItemView.k(this.C);
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(ViewGroup viewGroup, int i4) {
        if (viewGroup.getChildAt(i4) == this.f1382l) {
            return false;
        }
        viewGroup.removeViewAt(i4);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public View s(androidx.appcompat.view.menu.k kVar, View view, ViewGroup viewGroup) {
        View actionView = kVar.getActionView();
        if (actionView == null || kVar.m()) {
            actionView = super.s(kVar, view, viewGroup);
        }
        actionView.setVisibility(kVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean u(int i4, androidx.appcompat.view.menu.k kVar) {
        return kVar.o();
    }
}
