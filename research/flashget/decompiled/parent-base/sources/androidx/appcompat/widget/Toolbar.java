package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.c1;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.x1;
import androidx.customview.view.AbsSavedState;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1423e0;
import d.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.n0 {
    private static final String M2 = "Toolbar";
    private ColorStateList A;
    private ColorStateList B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    final androidx.core.view.q0 H;
    private ArrayList<MenuItem> I;
    g J;
    private final ActionMenuView.d K;
    private x0 L;
    private final Runnable L2;
    private ActionMenuPresenter M;
    private f N;
    private o.a O;
    h.a P;
    private boolean Q;
    private OnBackInvokedDispatcher Q1;
    private OnBackInvokedCallback R;
    private boolean V1;

    /* renamed from: b, reason: collision with root package name */
    ActionMenuView f1665b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f1666c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f1667d;

    /* renamed from: e, reason: collision with root package name */
    private ImageButton f1668e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f1669f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f1670g;

    /* renamed from: h, reason: collision with root package name */
    private CharSequence f1671h;

    /* renamed from: i, reason: collision with root package name */
    ImageButton f1672i;

    /* renamed from: j, reason: collision with root package name */
    View f1673j;

    /* renamed from: k, reason: collision with root package name */
    private Context f1674k;

    /* renamed from: l, reason: collision with root package name */
    private int f1675l;

    /* renamed from: m, reason: collision with root package name */
    private int f1676m;

    /* renamed from: n, reason: collision with root package name */
    private int f1677n;

    /* renamed from: o, reason: collision with root package name */
    int f1678o;

    /* renamed from: p, reason: collision with root package name */
    private int f1679p;

    /* renamed from: q, reason: collision with root package name */
    private int f1680q;

    /* renamed from: r, reason: collision with root package name */
    private int f1681r;

    /* renamed from: s, reason: collision with root package name */
    private int f1682s;

    /* renamed from: t, reason: collision with root package name */
    private int f1683t;

    /* renamed from: u, reason: collision with root package name */
    private k0 f1684u;

    /* renamed from: v, reason: collision with root package name */
    private int f1685v;

    /* renamed from: w, reason: collision with root package name */
    private int f1686w;

    /* renamed from: x, reason: collision with root package name */
    private int f1687x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f1688y;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f1689z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        int f1694d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1695e;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f1694d);
            parcel.writeInt(this.f1695e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1694d = parcel.readInt();
            this.f1695e = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    class a implements ActionMenuView.d {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.H.j(menuItem)) {
                return true;
            }
            g gVar = Toolbar.this.J;
            if (gVar != null) {
                return gVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.h1();
        }
    }

    class c implements h.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean a(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar, @androidx.annotation.o0 MenuItem menuItem) {
            h.a aVar = Toolbar.this.P;
            return aVar != null && aVar.a(hVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void b(@androidx.annotation.o0 androidx.appcompat.view.menu.h hVar) {
            if (!Toolbar.this.f1665b.m0()) {
                Toolbar.this.H.k(hVar);
            }
            h.a aVar = Toolbar.this.P;
            if (aVar != null) {
                aVar.b(hVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.f();
        }
    }

    @androidx.annotation.x0(33)
    static class e {
        private e() {
        }

        @androidx.annotation.q0
        @androidx.annotation.u
        static OnBackInvokedDispatcher a(@androidx.annotation.o0 View view) {
            return view.findOnBackInvokedDispatcher();
        }

        @androidx.annotation.u
        @androidx.annotation.o0
        static OnBackInvokedCallback b(@androidx.annotation.o0 final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.w0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.o0 Object obj, @androidx.annotation.o0 Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        @androidx.annotation.u
        static void d(@androidx.annotation.o0 Object obj, @androidx.annotation.o0 Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.o {

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.h f1700b;

        /* renamed from: c, reason: collision with root package name */
        androidx.appcompat.view.menu.k f1701c;

        f() {
        }

        @Override // androidx.appcompat.view.menu.o
        public int a() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.o
        public void d(androidx.appcompat.view.menu.h hVar, boolean z4) {
        }

        @Override // androidx.appcompat.view.menu.o
        public boolean e(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.k kVar) {
            Toolbar.this.h();
            ViewParent parent = Toolbar.this.f1672i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1672i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1672i);
            }
            Toolbar.this.f1673j = kVar.getActionView();
            this.f1701c = kVar;
            ViewParent parent2 = Toolbar.this.f1673j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1673j);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f658a = (toolbar4.f1678o & 112) | androidx.core.view.f0.f27129b;
                generateDefaultLayoutParams.f1693b = 2;
                toolbar4.f1673j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1673j);
            }
            Toolbar.this.r0();
            Toolbar.this.requestLayout();
            kVar.t(true);
            KeyEvent.Callback callback = Toolbar.this.f1673j;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            Toolbar.this.i1();
            return true;
        }

        @Override // androidx.appcompat.view.menu.o
        public void f(o.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.o
        public void g(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.o
        public boolean h(androidx.appcompat.view.menu.t tVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.o
        public androidx.appcompat.view.menu.p i(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.o
        public Parcelable j() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.o
        public void k(boolean z4) {
            if (this.f1701c != null) {
                androidx.appcompat.view.menu.h hVar = this.f1700b;
                if (hVar != null) {
                    int size = hVar.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (this.f1700b.getItem(i4) == this.f1701c) {
                            return;
                        }
                    }
                }
                m(this.f1700b, this.f1701c);
            }
        }

        @Override // androidx.appcompat.view.menu.o
        public boolean l() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.o
        public boolean m(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.k kVar) {
            KeyEvent.Callback callback = Toolbar.this.f1673j;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).j();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1673j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1672i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1673j = null;
            toolbar3.a();
            this.f1701c = null;
            Toolbar.this.requestLayout();
            kVar.t(false);
            Toolbar.this.i1();
            return true;
        }

        @Override // androidx.appcompat.view.menu.o
        public void n(Context context, androidx.appcompat.view.menu.h hVar) {
            androidx.appcompat.view.menu.k kVar;
            androidx.appcompat.view.menu.h hVar2 = this.f1700b;
            if (hVar2 != null && (kVar = this.f1701c) != null) {
                hVar2.g(kVar);
            }
            this.f1700b = hVar;
        }
    }

    public interface g {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> F() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu J = J();
        for (int i4 = 0; i4 < J.size(); i4++) {
            arrayList.add(J.getItem(i4));
        }
        return arrayList;
    }

    private int G(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    private MenuInflater K() {
        return new androidx.appcompat.view.h(getContext());
    }

    private int a0(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int b0(List<View> list, int[] iArr) {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            View view = list.get(i6);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i4;
            int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i5;
            int max = Math.max(0, i10);
            int max2 = Math.max(0, i11);
            int max3 = Math.max(0, -i10);
            int max4 = Math.max(0, -i11);
            i7 += view.getMeasuredWidth() + max + max2;
            i6++;
            i5 = max4;
            i4 = max3;
        }
        return i7;
    }

    private void c(List<View> list, int i4) {
        boolean z4 = x1.c0(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        list.clear();
        if (!z4) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1693b == 0 && g1(childAt) && q(layoutParams.f658a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1693b == 0 && g1(childAt2) && q(layoutParams2.f658a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private void d(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        generateDefaultLayoutParams.f1693b = 1;
        if (!z4 || this.f1673j == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.F.add(view);
        }
    }

    private boolean f1() {
        if (!this.Q) {
            return false;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (g1(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean g1(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private boolean h0(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    private void i() {
        if (this.f1684u == null) {
            this.f1684u = new k0();
        }
    }

    private void j() {
        if (this.f1669f == null) {
            this.f1669f = new AppCompatImageView(getContext());
        }
    }

    private void k() {
        l();
        if (this.f1665b.q0() == null) {
            androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) this.f1665b.g0();
            if (this.N == null) {
                this.N = new f();
            }
            this.f1665b.r0(true);
            hVar.c(this.N, this.f1674k);
            i1();
        }
    }

    private void l() {
        if (this.f1665b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1665b = actionMenuView;
            actionMenuView.w0(this.f1675l);
            this.f1665b.t0(this.K);
            this.f1665b.s0(this.O, new c());
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f658a = (this.f1678o & 112) | androidx.core.view.f0.f27130c;
            this.f1665b.setLayoutParams(generateDefaultLayoutParams);
            d(this.f1665b, false);
        }
    }

    private int l0(View view, int i4, int[] iArr, int i5) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = Math.max(0, i6) + i4;
        iArr[0] = Math.max(0, -i6);
        int r4 = r(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, r4, max + measuredWidth, view.getMeasuredHeight() + r4);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + max;
    }

    private void m() {
        if (this.f1668e == null) {
            this.f1668e = new AppCompatImageButton(getContext(), null, a.b.T3);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f658a = (this.f1678o & 112) | androidx.core.view.f0.f27129b;
            this.f1668e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int m0(View view, int i4, int[] iArr, int i5) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int r4 = r(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, r4, max, view.getMeasuredHeight() + r4);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    private int n0(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = marginLayoutParams.leftMargin - iArr[0];
        int i11 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i11) + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        iArr[1] = Math.max(0, -i11);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void o0(View view, int i4, int i5, int i6, int i7, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void p0() {
        Menu J = J();
        ArrayList<MenuItem> F = F();
        this.H.h(J, K());
        ArrayList<MenuItem> F2 = F();
        F2.removeAll(F);
        this.I = F2;
    }

    private int q(int i4) {
        int c02 = x1.c0(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, c02) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : c02 == 1 ? 5 : 3;
    }

    private void q0() {
        removeCallbacks(this.L2);
        post(this.L2);
    }

    private int r(View view, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int s4 = s(layoutParams.f658a);
        if (s4 == 48) {
            return getPaddingTop() - i5;
        }
        if (s4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i10 < i11) {
                i6 = Math.max(0, i6 - (i11 - i10));
            }
        }
        return paddingTop + i6;
    }

    private int s(int i4) {
        int i5 = i4 & 112;
        return (i5 == 16 || i5 == 48 || i5 == 80) ? i5 : this.f1687x & 112;
    }

    public int A() {
        int i4 = this.f1685v;
        return i4 != Integer.MIN_VALUE ? i4 : z();
    }

    public void A0(int i4, int i5) {
        i();
        this.f1684u.e(i4, i5);
    }

    public int B() {
        androidx.appcompat.view.menu.h q02;
        ActionMenuView actionMenuView = this.f1665b;
        return (actionMenuView == null || (q02 = actionMenuView.q0()) == null || !q02.hasVisibleItems()) ? v() : Math.max(v(), Math.max(this.f1686w, 0));
    }

    public void B0(int i4, int i5) {
        i();
        this.f1684u.g(i4, i5);
    }

    public int C() {
        return x1.c0(this) == 1 ? B() : E();
    }

    public void C0(@androidx.annotation.v int i4) {
        D0(e.a.b(getContext(), i4));
    }

    public int D() {
        return x1.c0(this) == 1 ? E() : B();
    }

    public void D0(Drawable drawable) {
        if (drawable != null) {
            j();
            if (!h0(this.f1669f)) {
                d(this.f1669f, true);
            }
        } else {
            ImageView imageView = this.f1669f;
            if (imageView != null && h0(imageView)) {
                removeView(this.f1669f);
                this.F.remove(this.f1669f);
            }
        }
        ImageView imageView2 = this.f1669f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public int E() {
        return N() != null ? Math.max(z(), Math.max(this.f1685v, 0)) : z();
    }

    public void E0(@g1 int i4) {
        F0(getContext().getText(i4));
    }

    public void F0(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            j();
        }
        ImageView imageView = this.f1669f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public void G0(androidx.appcompat.view.menu.h hVar, ActionMenuPresenter actionMenuPresenter) {
        if (hVar == null && this.f1665b == null) {
            return;
        }
        l();
        androidx.appcompat.view.menu.h q02 = this.f1665b.q0();
        if (q02 == hVar) {
            return;
        }
        if (q02 != null) {
            q02.S(this.M);
            q02.S(this.N);
        }
        if (this.N == null) {
            this.N = new f();
        }
        actionMenuPresenter.L(true);
        if (hVar != null) {
            hVar.c(actionMenuPresenter, this.f1674k);
            hVar.c(this.N, this.f1674k);
        } else {
            actionMenuPresenter.n(this.f1674k, null);
            this.N.n(this.f1674k, null);
            actionMenuPresenter.k(true);
            this.N.k(true);
        }
        this.f1665b.w0(this.f1675l);
        this.f1665b.x0(actionMenuPresenter);
        this.M = actionMenuPresenter;
        i1();
    }

    public Drawable H() {
        ImageView imageView = this.f1669f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void H0(o.a aVar, h.a aVar2) {
        this.O = aVar;
        this.P = aVar2;
        ActionMenuView actionMenuView = this.f1665b;
        if (actionMenuView != null) {
            actionMenuView.s0(aVar, aVar2);
        }
    }

    public CharSequence I() {
        ImageView imageView = this.f1669f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public void I0(@g1 int i4) {
        J0(i4 != 0 ? getContext().getText(i4) : null);
    }

    public Menu J() {
        k();
        return this.f1665b.g0();
    }

    public void J0(@androidx.annotation.q0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageButton imageButton = this.f1668e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            y0.a(this.f1668e, charSequence);
        }
    }

    public void K0(@androidx.annotation.v int i4) {
        L0(e.a.b(getContext(), i4));
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.TESTS})
    View L() {
        return this.f1668e;
    }

    public void L0(@androidx.annotation.q0 Drawable drawable) {
        if (drawable != null) {
            m();
            if (!h0(this.f1668e)) {
                d(this.f1668e, true);
            }
        } else {
            ImageButton imageButton = this.f1668e;
            if (imageButton != null && h0(imageButton)) {
                removeView(this.f1668e);
                this.F.remove(this.f1668e);
            }
        }
        ImageButton imageButton2 = this.f1668e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    @androidx.annotation.q0
    public CharSequence M() {
        ImageButton imageButton = this.f1668e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void M0(View.OnClickListener onClickListener) {
        m();
        this.f1668e.setOnClickListener(onClickListener);
    }

    @androidx.annotation.q0
    public Drawable N() {
        ImageButton imageButton = this.f1668e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void N0(g gVar) {
        this.J = gVar;
    }

    ActionMenuPresenter O() {
        return this.M;
    }

    public void O0(@androidx.annotation.q0 Drawable drawable) {
        k();
        this.f1665b.u0(drawable);
    }

    @androidx.annotation.q0
    public Drawable P() {
        k();
        return this.f1665b.h0();
    }

    public void P0(@h1 int i4) {
        if (this.f1675l != i4) {
            this.f1675l = i4;
            if (i4 == 0) {
                this.f1674k = getContext();
            } else {
                this.f1674k = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    Context Q() {
        return this.f1674k;
    }

    public void Q0(@g1 int i4) {
        R0(getContext().getText(i4));
    }

    @h1
    public int R() {
        return this.f1675l;
    }

    public void R0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1667d;
            if (textView != null && h0(textView)) {
                removeView(this.f1667d);
                this.F.remove(this.f1667d);
            }
        } else {
            if (this.f1667d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1667d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1667d.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f1677n;
                if (i4 != 0) {
                    this.f1667d.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f1667d.setTextColor(colorStateList);
                }
            }
            if (!h0(this.f1667d)) {
                d(this.f1667d, true);
            }
        }
        TextView textView2 = this.f1667d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1689z = charSequence;
    }

    public CharSequence S() {
        return this.f1689z;
    }

    public void S0(Context context, @h1 int i4) {
        this.f1677n = i4;
        TextView textView = this.f1667d;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.TESTS})
    final TextView T() {
        return this.f1667d;
    }

    public void T0(@androidx.annotation.l int i4) {
        U0(ColorStateList.valueOf(i4));
    }

    public CharSequence U() {
        return this.f1688y;
    }

    public void U0(@androidx.annotation.o0 ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f1667d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public int V() {
        return this.f1683t;
    }

    public void V0(@g1 int i4) {
        W0(getContext().getText(i4));
    }

    public int W() {
        return this.f1681r;
    }

    public void W0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1666c;
            if (textView != null && h0(textView)) {
                removeView(this.f1666c);
                this.F.remove(this.f1666c);
            }
        } else {
            if (this.f1666c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1666c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1666c.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f1676m;
                if (i4 != 0) {
                    this.f1666c.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1666c.setTextColor(colorStateList);
                }
            }
            if (!h0(this.f1666c)) {
                d(this.f1666c, true);
            }
        }
        TextView textView2 = this.f1666c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1688y = charSequence;
    }

    public int X() {
        return this.f1680q;
    }

    public void X0(int i4, int i5, int i6, int i7) {
        this.f1680q = i4;
        this.f1682s = i5;
        this.f1681r = i6;
        this.f1683t = i7;
        requestLayout();
    }

    public int Y() {
        return this.f1682s;
    }

    public void Y0(int i4) {
        this.f1683t = i4;
        requestLayout();
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.TESTS})
    final TextView Z() {
        return this.f1666c;
    }

    public void Z0(int i4) {
        this.f1681r = i4;
        requestLayout();
    }

    void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    public void a1(int i4) {
        this.f1680q = i4;
        requestLayout();
    }

    @Override // androidx.core.view.n0
    @androidx.annotation.l0
    public void addMenuProvider(@androidx.annotation.o0 androidx.core.view.t0 t0Var) {
        this.H.c(t0Var);
    }

    public void b1(int i4) {
        this.f1682s = i4;
        requestLayout();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public v c0() {
        if (this.L == null) {
            this.L = new x0(this, true);
        }
        return this.L;
    }

    public void c1(Context context, @h1 int i4) {
        this.f1676m = i4;
        TextView textView = this.f1666c;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public boolean d0() {
        f fVar = this.N;
        return (fVar == null || fVar.f1701c == null) ? false : true;
    }

    public void d1(@androidx.annotation.l int i4) {
        e1(ColorStateList.valueOf(i4));
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean e() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1665b) != null && actionMenuView.n0();
    }

    public boolean e0() {
        ActionMenuView actionMenuView = this.f1665b;
        return actionMenuView != null && actionMenuView.k0();
    }

    public void e1(@androidx.annotation.o0 ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1666c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void f() {
        f fVar = this.N;
        androidx.appcompat.view.menu.k kVar = fVar == null ? null : fVar.f1701c;
        if (kVar != null) {
            kVar.collapseActionView();
        }
    }

    public void f0(@androidx.annotation.m0 int i4) {
        K().inflate(i4, J());
    }

    public void g() {
        ActionMenuView actionMenuView = this.f1665b;
        if (actionMenuView != null) {
            actionMenuView.b0();
        }
    }

    public boolean g0() {
        return this.V1;
    }

    void h() {
        if (this.f1672i == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, a.b.T3);
            this.f1672i = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1670g);
            this.f1672i.setContentDescription(this.f1671h);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f658a = (this.f1678o & 112) | androidx.core.view.f0.f27129b;
            generateDefaultLayoutParams.f1693b = 2;
            this.f1672i.setLayoutParams(generateDefaultLayoutParams);
            this.f1672i.setOnClickListener(new d());
        }
    }

    public boolean h1() {
        ActionMenuView actionMenuView = this.f1665b;
        return actionMenuView != null && actionMenuView.y0();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean i0() {
        ActionMenuView actionMenuView = this.f1665b;
        return actionMenuView != null && actionMenuView.l0();
    }

    void i1() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a5 = e.a(this);
            boolean z4 = d0() && a5 != null && x1.R0(this) && this.V1;
            if (z4 && this.Q1 == null) {
                if (this.R == null) {
                    this.R = e.b(new Runnable() { // from class: androidx.appcompat.widget.u0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.f();
                        }
                    });
                }
                e.c(a5, this.R);
                this.Q1 = a5;
                return;
            }
            if (z4 || (onBackInvokedDispatcher = this.Q1) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.R);
            this.Q1 = null;
        }
    }

    @Override // androidx.core.view.n0
    @androidx.annotation.l0
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.I.iterator();
        while (it.hasNext()) {
            J().removeItem(it.next().getItemId());
        }
        p0();
    }

    public boolean j0() {
        ActionMenuView actionMenuView = this.f1665b;
        return actionMenuView != null && actionMenuView.m0();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean k0() {
        Layout layout;
        TextView textView = this.f1666c;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i4 = 0; i4 < lineCount; i4++) {
            if (layout.getEllipsisCount(i4) > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i1();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.L2);
        i1();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a1 A[LOOP:0: B:41:0x029f->B:42:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c3 A[LOOP:1: B:45:0x02c1->B:46:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fc A[LOOP:2: B:54:0x02fa->B:55:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = this.G;
        boolean b5 = e1.b(this);
        int i15 = !b5 ? 1 : 0;
        if (g1(this.f1668e)) {
            o0(this.f1668e, i4, 0, i5, 0, this.f1679p);
            i6 = this.f1668e.getMeasuredWidth() + G(this.f1668e);
            i7 = Math.max(0, this.f1668e.getMeasuredHeight() + a0(this.f1668e));
            i10 = View.combineMeasuredStates(0, this.f1668e.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
            i10 = 0;
        }
        if (g1(this.f1672i)) {
            o0(this.f1672i, i4, 0, i5, 0, this.f1679p);
            i6 = this.f1672i.getMeasuredWidth() + G(this.f1672i);
            i7 = Math.max(i7, this.f1672i.getMeasuredHeight() + a0(this.f1672i));
            i10 = View.combineMeasuredStates(i10, this.f1672i.getMeasuredState());
        }
        int E = E();
        int max = Math.max(E, i6);
        iArr[b5 ? 1 : 0] = Math.max(0, E - i6);
        if (g1(this.f1665b)) {
            o0(this.f1665b, i4, max, i5, 0, this.f1679p);
            i11 = this.f1665b.getMeasuredWidth() + G(this.f1665b);
            i7 = Math.max(i7, this.f1665b.getMeasuredHeight() + a0(this.f1665b));
            i10 = View.combineMeasuredStates(i10, this.f1665b.getMeasuredState());
        } else {
            i11 = 0;
        }
        int B = B();
        int max2 = Math.max(B, i11) + max;
        iArr[i15] = Math.max(0, B - i11);
        if (g1(this.f1673j)) {
            max2 += n0(this.f1673j, i4, max2, i5, 0, iArr);
            i7 = Math.max(i7, this.f1673j.getMeasuredHeight() + a0(this.f1673j));
            i10 = View.combineMeasuredStates(i10, this.f1673j.getMeasuredState());
        }
        if (g1(this.f1669f)) {
            max2 += n0(this.f1669f, i4, max2, i5, 0, iArr);
            i7 = Math.max(i7, this.f1669f.getMeasuredHeight() + a0(this.f1669f));
            i10 = View.combineMeasuredStates(i10, this.f1669f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (((LayoutParams) childAt.getLayoutParams()).f1693b == 0 && g1(childAt)) {
                max2 += n0(childAt, i4, max2, i5, 0, iArr);
                i7 = Math.max(i7, childAt.getMeasuredHeight() + a0(childAt));
                i10 = View.combineMeasuredStates(i10, childAt.getMeasuredState());
            }
        }
        int i17 = this.f1682s + this.f1683t;
        int i18 = this.f1680q + this.f1681r;
        if (g1(this.f1666c)) {
            n0(this.f1666c, i4, max2 + i18, i5, i17, iArr);
            int measuredWidth = this.f1666c.getMeasuredWidth() + G(this.f1666c);
            i12 = this.f1666c.getMeasuredHeight() + a0(this.f1666c);
            i13 = View.combineMeasuredStates(i10, this.f1666c.getMeasuredState());
            i14 = measuredWidth;
        } else {
            i12 = 0;
            i13 = i10;
            i14 = 0;
        }
        if (g1(this.f1667d)) {
            i14 = Math.max(i14, n0(this.f1667d, i4, max2 + i18, i5, i12 + i17, iArr));
            i12 += this.f1667d.getMeasuredHeight() + a0(this.f1667d);
            i13 = View.combineMeasuredStates(i13, this.f1667d.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max2 + i14, getSuggestedMinimumWidth()), i4, (-16777216) & i13), f1() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + Math.max(i7, i12), getSuggestedMinimumHeight()), i5, i13 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f1665b;
        androidx.appcompat.view.menu.h q02 = actionMenuView != null ? actionMenuView.q0() : null;
        int i4 = savedState.f1694d;
        if (i4 != 0 && this.N != null && q02 != null && (findItem = q02.findItem(i4)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f1695e) {
            q0();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        i();
        this.f1684u.f(i4 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.k kVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.N;
        if (fVar != null && (kVar = fVar.f1701c) != null) {
            savedState.f1694d = kVar.getItemId();
        }
        savedState.f1695e = j0();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    void r0() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f1693b != 2 && childAt != this.f1665b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    @Override // androidx.core.view.n0
    @androidx.annotation.l0
    public void removeMenuProvider(@androidx.annotation.o0 androidx.core.view.t0 t0Var) {
        this.H.l(t0Var);
    }

    public void s0(boolean z4) {
        if (this.V1 != z4) {
            this.V1 = z4;
            i1();
        }
    }

    @androidx.annotation.q0
    public CharSequence t() {
        ImageButton imageButton = this.f1672i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void t0(@g1 int i4) {
        u0(i4 != 0 ? getContext().getText(i4) : null);
    }

    @androidx.annotation.q0
    public Drawable u() {
        ImageButton imageButton = this.f1672i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void u0(@androidx.annotation.q0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        ImageButton imageButton = this.f1672i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public int v() {
        k0 k0Var = this.f1684u;
        if (k0Var != null) {
            return k0Var.a();
        }
        return 0;
    }

    public void v0(@androidx.annotation.v int i4) {
        w0(e.a.b(getContext(), i4));
    }

    public int w() {
        int i4 = this.f1686w;
        return i4 != Integer.MIN_VALUE ? i4 : v();
    }

    public void w0(@androidx.annotation.q0 Drawable drawable) {
        if (drawable != null) {
            h();
            this.f1672i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1672i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1670g);
            }
        }
    }

    public int x() {
        k0 k0Var = this.f1684u;
        if (k0Var != null) {
            return k0Var.b();
        }
        return 0;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void x0(boolean z4) {
        this.Q = z4;
        requestLayout();
    }

    public int y() {
        k0 k0Var = this.f1684u;
        if (k0Var != null) {
            return k0Var.c();
        }
        return 0;
    }

    public void y0(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f1686w) {
            this.f1686w = i4;
            if (N() != null) {
                requestLayout();
            }
        }
    }

    public int z() {
        k0 k0Var = this.f1684u;
        if (k0Var != null) {
            return k0Var.d();
        }
        return 0;
    }

    public void z0(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f1685v) {
            this.f1685v = i4;
            if (N() != null) {
                requestLayout();
            }
        }
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: c, reason: collision with root package name */
        static final int f1690c = 0;

        /* renamed from: d, reason: collision with root package name */
        static final int f1691d = 1;

        /* renamed from: e, reason: collision with root package name */
        static final int f1692e = 2;

        /* renamed from: b, reason: collision with root package name */
        int f1693b;

        public LayoutParams(@androidx.annotation.o0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1693b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f1693b = 0;
            this.f658a = 8388627;
        }

        public LayoutParams(int i4, int i5, int i6) {
            super(i4, i5);
            this.f1693b = 0;
            this.f658a = i6;
        }

        public LayoutParams(int i4) {
            this(-2, -1, i4);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1693b = 0;
            this.f1693b = layoutParams.f1693b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1693b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1693b = 0;
            a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1693b = 0;
        }
    }

    public Toolbar(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.U3);
    }

    @Override // androidx.core.view.n0
    @androidx.annotation.l0
    public void addMenuProvider(@androidx.annotation.o0 androidx.core.view.t0 t0Var, @androidx.annotation.o0 InterfaceC1423e0 interfaceC1423e0) {
        this.H.d(t0Var, interfaceC1423e0);
    }

    public Toolbar(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1687x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.H = new androidx.core.view.q0(new Runnable() { // from class: androidx.appcompat.widget.v0
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.invalidateMenu();
            }
        });
        this.I = new ArrayList<>();
        this.K = new a();
        this.L2 = new b();
        Context context2 = getContext();
        int[] iArr = a.m.f6;
        t0 G = t0.G(context2, attributeSet, iArr, i4, 0);
        x1.F1(this, context, iArr, attributeSet, G.B(), i4, 0);
        this.f1676m = G.u(a.m.I6, 0);
        this.f1677n = G.u(a.m.z6, 0);
        this.f1687x = G.p(a.m.g6, this.f1687x);
        this.f1678o = G.p(a.m.i6, 48);
        int f4 = G.f(a.m.C6, 0);
        int i5 = a.m.H6;
        f4 = G.C(i5) ? G.f(i5, f4) : f4;
        this.f1683t = f4;
        this.f1682s = f4;
        this.f1681r = f4;
        this.f1680q = f4;
        int f5 = G.f(a.m.F6, -1);
        if (f5 >= 0) {
            this.f1680q = f5;
        }
        int f6 = G.f(a.m.E6, -1);
        if (f6 >= 0) {
            this.f1681r = f6;
        }
        int f7 = G.f(a.m.G6, -1);
        if (f7 >= 0) {
            this.f1682s = f7;
        }
        int f10 = G.f(a.m.D6, -1);
        if (f10 >= 0) {
            this.f1683t = f10;
        }
        this.f1679p = G.g(a.m.t6, -1);
        int f11 = G.f(a.m.p6, Integer.MIN_VALUE);
        int f12 = G.f(a.m.l6, Integer.MIN_VALUE);
        int g4 = G.g(a.m.n6, 0);
        int g5 = G.g(a.m.o6, 0);
        i();
        this.f1684u.e(g4, g5);
        if (f11 != Integer.MIN_VALUE || f12 != Integer.MIN_VALUE) {
            this.f1684u.g(f11, f12);
        }
        this.f1685v = G.f(a.m.q6, Integer.MIN_VALUE);
        this.f1686w = G.f(a.m.m6, Integer.MIN_VALUE);
        this.f1670g = G.h(a.m.k6);
        this.f1671h = G.x(a.m.j6);
        CharSequence x4 = G.x(a.m.B6);
        if (!TextUtils.isEmpty(x4)) {
            W0(x4);
        }
        CharSequence x5 = G.x(a.m.y6);
        if (!TextUtils.isEmpty(x5)) {
            R0(x5);
        }
        this.f1674k = getContext();
        P0(G.u(a.m.x6, 0));
        Drawable h4 = G.h(a.m.w6);
        if (h4 != null) {
            L0(h4);
        }
        CharSequence x6 = G.x(a.m.v6);
        if (!TextUtils.isEmpty(x6)) {
            J0(x6);
        }
        Drawable h5 = G.h(a.m.r6);
        if (h5 != null) {
            D0(h5);
        }
        CharSequence x7 = G.x(a.m.s6);
        if (!TextUtils.isEmpty(x7)) {
            F0(x7);
        }
        int i6 = a.m.J6;
        if (G.C(i6)) {
            e1(G.d(i6));
        }
        int i7 = a.m.A6;
        if (G.C(i7)) {
            U0(G.d(i7));
        }
        int i10 = a.m.u6;
        if (G.C(i10)) {
            f0(G.u(i10, 0));
        }
        G.I();
    }

    @Override // androidx.core.view.n0
    @SuppressLint({"LambdaLast"})
    @androidx.annotation.l0
    public void addMenuProvider(@androidx.annotation.o0 androidx.core.view.t0 t0Var, @androidx.annotation.o0 InterfaceC1423e0 interfaceC1423e0, @androidx.annotation.o0 AbstractC1450w.b bVar) {
        this.H.e(t0Var, interfaceC1423e0, bVar);
    }
}
