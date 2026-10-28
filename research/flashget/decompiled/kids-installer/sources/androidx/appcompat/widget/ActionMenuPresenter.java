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
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import d.a;
import java.util.ArrayList;

/* loaded from: classes3.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.b implements b.a {
    private static final String S = "ActionMenuPresenter";
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    private final SparseBooleanArray L;
    e M;
    a N;
    c O;
    private b P;
    final f Q;
    int R;

    /* renamed from: y, reason: collision with root package name */
    d f802y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f803z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        public int f804o;

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
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.f804o);
        }

        SavedState(Parcel parcel) {
            this.f804o = parcel.readInt();
        }
    }

    private class a extends androidx.appcompat.view.menu.m {
        public a(Context context, androidx.appcompat.view.menu.t tVar, View view) {
            super(context, tVar, view, false, a.c.G);
            if (!((androidx.appcompat.view.menu.j) tVar.getItem()).o()) {
                View view2 = ActionMenuPresenter.this.f802y;
                h(view2 == null ? (View) ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f649w : view2);
            }
            a(ActionMenuPresenter.this.Q);
        }

        @Override // androidx.appcompat.view.menu.m
        protected void g() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.N = null;
            actionMenuPresenter.R = 0;
            super.g();
        }
    }

    /* loaded from: classes2.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.q a() {
            a aVar = ActionMenuPresenter.this.N;
            if (aVar != null) {
                return aVar.e();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    private class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private e f807o;

        public c(e eVar) {
            this.f807o = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f643q != null) {
                ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f643q.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f649w;
            if (view != null && view.getWindowToken() != null && this.f807o.o()) {
                ActionMenuPresenter.this.M = this.f807o;
            }
            ActionMenuPresenter.this.O = null;
        }
    }

    private class d extends AppCompatImageView implements ActionMenuView.a {

        /* loaded from: classes2.dex */
        class a extends h0 {

            /* renamed from: x, reason: collision with root package name */
            final /* synthetic */ ActionMenuPresenter f810x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f810x = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.h0
            public androidx.appcompat.view.menu.q b() {
                e eVar = ActionMenuPresenter.this.M;
                if (eVar == null) {
                    return null;
                }
                return eVar.e();
            }

            @Override // androidx.appcompat.widget.h0
            public boolean c() {
                ActionMenuPresenter.this.Q();
                return true;
            }

            @Override // androidx.appcompat.widget.h0
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.O != null) {
                    return false;
                }
                actionMenuPresenter.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, a.c.F);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            c1.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean f() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.Q();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i5, int i6, int i7, int i8) {
            boolean frame = super.setFrame(i5, i6, i7, i8);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.d.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends androidx.appcompat.view.menu.m {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z5) {
            super(context, gVar, view, z5, a.c.G);
            j(androidx.core.view.d0.f5465c);
            a(ActionMenuPresenter.this.Q);
        }

        @Override // androidx.appcompat.view.menu.m
        protected void g() {
            if (((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f643q != null) {
                ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f643q.close();
            }
            ActionMenuPresenter.this.M = null;
            super.g();
        }
    }

    /* loaded from: classes2.dex */
    private class f implements n.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@androidx.annotation.o0 androidx.appcompat.view.menu.g gVar, boolean z5) {
            if (gVar instanceof androidx.appcompat.view.menu.t) {
                gVar.G().f(false);
            }
            n.a q5 = ActionMenuPresenter.this.q();
            if (q5 != null) {
                q5.b(gVar, z5);
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@androidx.annotation.o0 androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) ActionMenuPresenter.this).f643q) {
                return false;
            }
            ActionMenuPresenter.this.R = ((androidx.appcompat.view.menu.t) gVar).getItem().getItemId();
            n.a q5 = ActionMenuPresenter.this.q();
            if (q5 != null) {
                return q5.c(gVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, a.k.f21947d, a.k.f21946c);
        this.L = new SparseBooleanArray();
        this.Q = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f649w;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if ((childAt instanceof o.a) && ((o.a) childAt).d() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean B() {
        return E() | F();
    }

    public Drawable D() {
        d dVar = this.f802y;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.A) {
            return this.f803z;
        }
        return null;
    }

    public boolean E() {
        Object obj;
        c cVar = this.O;
        if (cVar != null && (obj = this.f649w) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.O = null;
            return true;
        }
        e eVar = this.M;
        if (eVar == null) {
            return false;
        }
        eVar.dismiss();
        return true;
    }

    public boolean F() {
        a aVar = this.N;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        return true;
    }

    public boolean G() {
        return this.O != null || H();
    }

    public boolean H() {
        e eVar = this.M;
        return eVar != null && eVar.f();
    }

    public boolean I() {
        return this.B;
    }

    public void J(Configuration configuration) {
        if (!this.G) {
            this.F = androidx.appcompat.view.a.b(this.f642p).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f643q;
        if (gVar != null) {
            gVar.N(true);
        }
    }

    public void K(boolean z5) {
        this.J = z5;
    }

    public void L(int i5) {
        this.F = i5;
        this.G = true;
    }

    public void M(ActionMenuView actionMenuView) {
        this.f649w = actionMenuView;
        actionMenuView.e(this.f643q);
    }

    public void N(Drawable drawable) {
        d dVar = this.f802y;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.A = true;
            this.f803z = drawable;
        }
    }

    public void O(boolean z5) {
        this.B = z5;
        this.C = true;
    }

    public void P(int i5, boolean z5) {
        this.D = i5;
        this.H = z5;
        this.I = true;
    }

    public boolean Q() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.B || H() || (gVar = this.f643q) == null || this.f649w == null || this.O != null || gVar.C().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f642p, this.f643q, this.f802y, true));
        this.O = cVar;
        ((View) this.f649w).post(cVar);
        return true;
    }

    @Override // androidx.core.view.b.a
    public void a(boolean z5) {
        if (z5) {
            super.l(null);
            return;
        }
        androidx.appcompat.view.menu.g gVar = this.f643q;
        if (gVar != null) {
            gVar.f(false);
        }
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar, boolean z5) {
        B();
        super.b(gVar, z5);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void d(boolean z5) {
        super.d(z5);
        ((View) this.f649w).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f643q;
        boolean z6 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.j> v5 = gVar.v();
            int size = v5.size();
            for (int i5 = 0; i5 < size; i5++) {
                androidx.core.view.b b6 = v5.get(i5).b();
                if (b6 != null) {
                    b6.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f643q;
        ArrayList<androidx.appcompat.view.menu.j> C = gVar2 != null ? gVar2.C() : null;
        if (this.B && C != null) {
            int size2 = C.size();
            if (size2 == 1) {
                z6 = !C.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z6 = true;
            }
        }
        if (z6) {
            if (this.f802y == null) {
                this.f802y = new d(this.f641o);
            }
            ViewGroup viewGroup = (ViewGroup) this.f802y.getParent();
            if (viewGroup != this.f649w) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f802y);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f649w;
                actionMenuView.addView(this.f802y, actionMenuView.d0());
            }
        } else {
            d dVar = this.f802y;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f649w;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f802y);
                }
            }
        }
        ((ActionMenuView) this.f649w).t0(this.B);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public boolean e() {
        ArrayList<androidx.appcompat.view.menu.j> arrayList;
        int i5;
        int i6;
        int i7;
        boolean z5;
        int i8;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.g gVar = actionMenuPresenter.f643q;
        View view = null;
        ?? r32 = 0;
        if (gVar != null) {
            arrayList = gVar.H();
            i5 = arrayList.size();
        } else {
            arrayList = null;
            i5 = 0;
        }
        int i9 = actionMenuPresenter.F;
        int i10 = actionMenuPresenter.E;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f649w;
        boolean z6 = false;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i5; i13++) {
            androidx.appcompat.view.menu.j jVar = arrayList.get(i13);
            if (jVar.d()) {
                i11++;
            } else if (jVar.q()) {
                i12++;
            } else {
                z6 = true;
            }
            if (actionMenuPresenter.J && jVar.isActionViewExpanded()) {
                i9 = 0;
            }
        }
        if (actionMenuPresenter.B && (z6 || i12 + i11 > i9)) {
            i9--;
        }
        int i14 = i9 - i11;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.L;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.H) {
            int i15 = actionMenuPresenter.K;
            i6 = i10 / i15;
            i7 = ((i10 % i15) / i6) + i15;
        } else {
            i6 = 0;
            i7 = 0;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < i5) {
            androidx.appcompat.view.menu.j jVar2 = arrayList.get(i16);
            if (jVar2.d()) {
                View r5 = actionMenuPresenter.r(jVar2, view, viewGroup);
                if (actionMenuPresenter.H) {
                    i6 -= ActionMenuView.m0(r5, i7, i6, makeMeasureSpec, r32);
                } else {
                    r5.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = r5.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.x(true);
                z5 = r32;
                i8 = i5;
            } else if (jVar2.q()) {
                int groupId2 = jVar2.getGroupId();
                boolean z7 = sparseBooleanArray.get(groupId2);
                boolean z8 = (i14 > 0 || z7) && i10 > 0 && (!actionMenuPresenter.H || i6 > 0);
                boolean z9 = z8;
                i8 = i5;
                if (z8) {
                    View r6 = actionMenuPresenter.r(jVar2, null, viewGroup);
                    if (actionMenuPresenter.H) {
                        int m02 = ActionMenuView.m0(r6, i7, i6, makeMeasureSpec, 0);
                        i6 -= m02;
                        if (m02 == 0) {
                            z9 = false;
                        }
                    } else {
                        r6.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z10 = z9;
                    int measuredWidth2 = r6.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z8 = z10 & (!actionMenuPresenter.H ? i10 + i17 <= 0 : i10 < 0);
                }
                if (z8 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z7) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i18 = 0; i18 < i16; i18++) {
                        androidx.appcompat.view.menu.j jVar3 = arrayList.get(i18);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.o()) {
                                i14++;
                            }
                            jVar3.x(false);
                        }
                    }
                }
                if (z8) {
                    i14--;
                }
                jVar2.x(z8);
                z5 = false;
            } else {
                z5 = r32;
                i8 = i5;
                jVar2.x(z5);
            }
            i16++;
            r32 = z5;
            i5 = i8;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void i(@androidx.annotation.o0 Context context, @androidx.annotation.q0 androidx.appcompat.view.menu.g gVar) {
        super.i(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b6 = androidx.appcompat.view.a.b(context);
        if (!this.C) {
            this.B = b6.h();
        }
        if (!this.I) {
            this.D = b6.c();
        }
        if (!this.G) {
            this.F = b6.d();
        }
        int i5 = this.D;
        if (this.B) {
            if (this.f802y == null) {
                d dVar = new d(this.f641o);
                this.f802y = dVar;
                if (this.A) {
                    dVar.setImageDrawable(this.f803z);
                    this.f803z = null;
                    this.A = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f802y.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f802y.getMeasuredWidth();
        } else {
            this.f802y = null;
        }
        this.E = i5;
        this.K = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(Parcelable parcelable) {
        int i5;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i5 = ((SavedState) parcelable).f804o) > 0 && (findItem = this.f643q.findItem(i5)) != null) {
            l((androidx.appcompat.view.menu.t) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.b
    public void k(androidx.appcompat.view.menu.j jVar, o.a aVar) {
        aVar.l(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.w((ActionMenuView) this.f649w);
        if (this.P == null) {
            this.P = new b();
        }
        actionMenuItemView.x(this.P);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public boolean l(androidx.appcompat.view.menu.t tVar) {
        boolean z5 = false;
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.t tVar2 = tVar;
        while (tVar2.n0() != this.f643q) {
            tVar2 = (androidx.appcompat.view.menu.t) tVar2.n0();
        }
        View C = C(tVar2.getItem());
        if (C == null) {
            return false;
        }
        this.R = tVar.getItem().getItemId();
        int size = tVar.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            MenuItem item = tVar.getItem(i5);
            if (item.isVisible() && item.getIcon() != null) {
                z5 = true;
                break;
            }
            i5++;
        }
        a aVar = new a(this.f642p, tVar, C);
        this.N = aVar;
        aVar.i(z5);
        this.N.l();
        super.l(tVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public androidx.appcompat.view.menu.o m(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.o oVar = this.f649w;
        androidx.appcompat.view.menu.o m5 = super.m(viewGroup);
        if (oVar != m5) {
            ((ActionMenuView) m5).v0(this);
        }
        return m5;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable n() {
        SavedState savedState = new SavedState();
        savedState.f804o = this.R;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean p(ViewGroup viewGroup, int i5) {
        if (viewGroup.getChildAt(i5) == this.f802y) {
            return false;
        }
        viewGroup.removeViewAt(i5);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public View r(androidx.appcompat.view.menu.j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.m()) {
            actionView = super.r(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean t(int i5, androidx.appcompat.view.menu.j jVar) {
        return jVar.o();
    }
}
