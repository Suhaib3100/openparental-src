package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
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
import androidx.annotation.c1;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import d.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: g0, reason: collision with root package name */
    private static final String f1055g0 = "Toolbar";
    private int A;
    int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private q0 H;
    private int I;
    private int J;
    private int K;
    private CharSequence L;
    private CharSequence M;
    private ColorStateList N;
    private ColorStateList O;
    private boolean P;
    private boolean Q;
    private final ArrayList<View> R;
    private final ArrayList<View> S;
    private final int[] T;
    e U;
    private final ActionMenuView.d V;
    private a1 W;

    /* renamed from: a0, reason: collision with root package name */
    private ActionMenuPresenter f1056a0;

    /* renamed from: b0, reason: collision with root package name */
    private d f1057b0;

    /* renamed from: c0, reason: collision with root package name */
    private n.a f1058c0;

    /* renamed from: d0, reason: collision with root package name */
    private g.a f1059d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f1060e0;

    /* renamed from: f0, reason: collision with root package name */
    private final Runnable f1061f0;

    /* renamed from: o, reason: collision with root package name */
    private ActionMenuView f1062o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f1063p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f1064q;

    /* renamed from: r, reason: collision with root package name */
    private ImageButton f1065r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f1066s;

    /* renamed from: t, reason: collision with root package name */
    private Drawable f1067t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f1068u;

    /* renamed from: v, reason: collision with root package name */
    ImageButton f1069v;

    /* renamed from: w, reason: collision with root package name */
    View f1070w;

    /* renamed from: x, reason: collision with root package name */
    private Context f1071x;

    /* renamed from: y, reason: collision with root package name */
    private int f1072y;

    /* renamed from: z, reason: collision with root package name */
    private int f1073z;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        int f1078q;

        /* renamed from: r, reason: collision with root package name */
        boolean f1079r;

        /* loaded from: classes.dex */
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
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f1078q);
            parcel.writeInt(this.f1079r ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1078q = parcel.readInt();
            this.f1079r = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes2.dex */
    class a implements ActionMenuView.d {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            e eVar = Toolbar.this.U;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.c1();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* loaded from: classes2.dex */
    private class d implements androidx.appcompat.view.menu.n {

        /* renamed from: o, reason: collision with root package name */
        androidx.appcompat.view.menu.g f1083o;

        /* renamed from: p, reason: collision with root package name */
        androidx.appcompat.view.menu.j f1084p;

        d() {
        }

        @Override // androidx.appcompat.view.menu.n
        public void b(androidx.appcompat.view.menu.g gVar, boolean z5) {
        }

        @Override // androidx.appcompat.view.menu.n
        public void d(boolean z5) {
            if (this.f1084p != null) {
                androidx.appcompat.view.menu.g gVar = this.f1083o;
                boolean z6 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        if (this.f1083o.getItem(i5) == this.f1084p) {
                            z6 = true;
                            break;
                        }
                        i5++;
                    }
                }
                if (z6) {
                    return;
                }
                f(this.f1083o, this.f1084p);
            }
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            KeyEvent.Callback callback = Toolbar.this.f1070w;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1070w);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1069v);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1070w = null;
            toolbar3.a();
            this.f1084p = null;
            Toolbar.this.requestLayout();
            jVar.t(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1069v.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1069v);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1069v);
            }
            Toolbar.this.f1070w = jVar.getActionView();
            this.f1084p = jVar;
            ViewParent parent2 = Toolbar.this.f1070w.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1070w);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f165a = (toolbar4.B & 112) | androidx.core.view.d0.f5464b;
                generateDefaultLayoutParams.f1077b = 2;
                toolbar4.f1070w.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1070w);
            }
            Toolbar.this.n0();
            Toolbar.this.requestLayout();
            jVar.t(true);
            KeyEvent.Callback callback = Toolbar.this.f1070w;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.n
        public void h(n.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.n
        public void i(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.j jVar;
            androidx.appcompat.view.menu.g gVar2 = this.f1083o;
            if (gVar2 != null && (jVar = this.f1084p) != null) {
                gVar2.g(jVar);
            }
            this.f1083o = gVar;
        }

        @Override // androidx.appcompat.view.menu.n
        public void j(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean l(androidx.appcompat.view.menu.t tVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public androidx.appcompat.view.menu.o m(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.n
        public Parcelable n() {
            return null;
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private int F(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.i0.b(marginLayoutParams) + androidx.core.view.i0.c(marginLayoutParams);
    }

    private MenuInflater J() {
        return new androidx.appcompat.view.h(getContext());
    }

    private int Y(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int Z(List<View> list, int[] iArr) {
        int i5 = iArr[0];
        int i6 = iArr[1];
        int size = list.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            View view = list.get(i7);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i5;
            int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i6;
            int max = Math.max(0, i9);
            int max2 = Math.max(0, i10);
            int max3 = Math.max(0, -i9);
            int max4 = Math.max(0, -i10);
            i8 += view.getMeasuredWidth() + max + max2;
            i7++;
            i6 = max4;
            i5 = max3;
        }
        return i8;
    }

    private boolean a1() {
        if (!this.f1060e0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (b1(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private void b(List<View> list, int i5) {
        boolean z5 = y1.Z(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, y1.Z(this));
        list.clear();
        if (!z5) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1077b == 0 && b1(childAt) && q(layoutParams.f165a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt2 = getChildAt(i7);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1077b == 0 && b1(childAt2) && q(layoutParams2.f165a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private boolean b1(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void c(View view, boolean z5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        generateDefaultLayoutParams.f1077b = 1;
        if (!z5 || this.f1070w == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.S.add(view);
        }
    }

    private boolean e0(View view) {
        return view.getParent() == this || this.S.contains(view);
    }

    private void h() {
        if (this.H == null) {
            this.H = new q0();
        }
    }

    private void i() {
        if (this.f1066s == null) {
            this.f1066s = new AppCompatImageView(getContext(), null);
        }
    }

    private int i0(View view, int i5, int[] iArr, int i6) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = Math.max(0, i7) + i5;
        iArr[0] = Math.max(0, -i7);
        int r5 = r(view, i6);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, r5, max + measuredWidth, view.getMeasuredHeight() + r5);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + max;
    }

    private void j() {
        l();
        if (this.f1062o.o0() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f1062o.e0();
            if (this.f1057b0 == null) {
                this.f1057b0 = new d();
            }
            this.f1062o.p0(true);
            gVar.c(this.f1057b0, this.f1071x);
        }
    }

    private int j0(View view, int i5, int[] iArr, int i6) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i5 - Math.max(0, i7);
        iArr[1] = Math.max(0, -i7);
        int r5 = r(view, i6);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, r5, max, view.getMeasuredHeight() + r5);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    private int k0(View view, int i5, int i6, int i7, int i8, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i9 = marginLayoutParams.leftMargin - iArr[0];
        int i10 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i10) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        iArr[1] = Math.max(0, -i10);
        view.measure(ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + max + i6, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i8, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void l() {
        if (this.f1062o == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1062o = actionMenuView;
            actionMenuView.u0(this.f1072y);
            this.f1062o.r0(this.V);
            this.f1062o.q0(this.f1058c0, this.f1059d0);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f165a = (this.B & 112) | androidx.core.view.d0.f5465c;
            this.f1062o.setLayoutParams(generateDefaultLayoutParams);
            c(this.f1062o, false);
        }
    }

    private void l0(View view, int i5, int i6, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i8, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i9 >= 0) {
            if (mode != 0) {
                i9 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i9);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void m() {
        if (this.f1065r == null) {
            this.f1065r = new AppCompatImageButton(getContext(), null, a.c.f21534a4);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f165a = (this.B & 112) | androidx.core.view.d0.f5464b;
            this.f1065r.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private void m0() {
        removeCallbacks(this.f1061f0);
        post(this.f1061f0);
    }

    private int q(int i5) {
        int Z = y1.Z(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, Z) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : Z == 1 ? 5 : 3;
    }

    private int r(View view, int i5) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = i5 > 0 ? (measuredHeight - i5) / 2 : 0;
        int s5 = s(layoutParams.f165a);
        if (s5 == 48) {
            return getPaddingTop() - i6;
        }
        if (s5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i6;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i7 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (i7 < i8) {
            i7 = i8;
        } else {
            int i9 = (((height - paddingBottom) - measuredHeight) - i7) - paddingTop;
            int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i9 < i10) {
                i7 = Math.max(0, i7 - (i10 - i9));
            }
        }
        return paddingTop + i7;
    }

    private int s(int i5) {
        int i6 = i5 & 112;
        return (i6 == 16 || i6 == 48 || i6 == 80) ? i6 : this.K & 112;
    }

    public int A() {
        int i5 = this.I;
        return i5 != Integer.MIN_VALUE ? i5 : z();
    }

    public void A0(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1066s;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public int B() {
        androidx.appcompat.view.menu.g o02;
        ActionMenuView actionMenuView = this.f1062o;
        return actionMenuView != null && (o02 = actionMenuView.o0()) != null && o02.hasVisibleItems() ? Math.max(v(), Math.max(this.J, 0)) : v();
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public void B0(androidx.appcompat.view.menu.g gVar, ActionMenuPresenter actionMenuPresenter) {
        if (gVar == null && this.f1062o == null) {
            return;
        }
        l();
        androidx.appcompat.view.menu.g o02 = this.f1062o.o0();
        if (o02 == gVar) {
            return;
        }
        if (o02 != null) {
            o02.S(this.f1056a0);
            o02.S(this.f1057b0);
        }
        if (this.f1057b0 == null) {
            this.f1057b0 = new d();
        }
        actionMenuPresenter.K(true);
        if (gVar != null) {
            gVar.c(actionMenuPresenter, this.f1071x);
            gVar.c(this.f1057b0, this.f1071x);
        } else {
            actionMenuPresenter.i(this.f1071x, null);
            this.f1057b0.i(this.f1071x, null);
            actionMenuPresenter.d(true);
            this.f1057b0.d(true);
        }
        this.f1062o.u0(this.f1072y);
        this.f1062o.v0(actionMenuPresenter);
        this.f1056a0 = actionMenuPresenter;
    }

    public int C() {
        return y1.Z(this) == 1 ? B() : E();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void C0(n.a aVar, g.a aVar2) {
        this.f1058c0 = aVar;
        this.f1059d0 = aVar2;
        ActionMenuView actionMenuView = this.f1062o;
        if (actionMenuView != null) {
            actionMenuView.q0(aVar, aVar2);
        }
    }

    public int D() {
        return y1.Z(this) == 1 ? E() : B();
    }

    public void D0(@androidx.annotation.g1 int i5) {
        E0(i5 != 0 ? getContext().getText(i5) : null);
    }

    public int E() {
        return L() != null ? Math.max(z(), Math.max(this.I, 0)) : z();
    }

    public void E0(@androidx.annotation.q0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageButton imageButton = this.f1065r;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void F0(@androidx.annotation.v int i5) {
        G0(androidx.appcompat.content.res.a.d(getContext(), i5));
    }

    public Drawable G() {
        ImageView imageView = this.f1066s;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void G0(@androidx.annotation.q0 Drawable drawable) {
        if (drawable != null) {
            m();
            if (!e0(this.f1065r)) {
                c(this.f1065r, true);
            }
        } else {
            ImageButton imageButton = this.f1065r;
            if (imageButton != null && e0(imageButton)) {
                removeView(this.f1065r);
                this.S.remove(this.f1065r);
            }
        }
        ImageButton imageButton2 = this.f1065r;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public CharSequence H() {
        ImageView imageView = this.f1066s;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public void H0(View.OnClickListener onClickListener) {
        m();
        this.f1065r.setOnClickListener(onClickListener);
    }

    public Menu I() {
        j();
        return this.f1062o.e0();
    }

    public void I0(e eVar) {
        this.U = eVar;
    }

    public void J0(@androidx.annotation.q0 Drawable drawable) {
        j();
        this.f1062o.s0(drawable);
    }

    @androidx.annotation.q0
    public CharSequence K() {
        ImageButton imageButton = this.f1065r;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void K0(@androidx.annotation.h1 int i5) {
        if (this.f1072y != i5) {
            this.f1072y = i5;
            if (i5 == 0) {
                this.f1071x = getContext();
            } else {
                this.f1071x = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    @androidx.annotation.q0
    public Drawable L() {
        ImageButton imageButton = this.f1065r;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void L0(@androidx.annotation.g1 int i5) {
        M0(getContext().getText(i5));
    }

    ActionMenuPresenter M() {
        return this.f1056a0;
    }

    public void M0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1064q;
            if (textView != null && e0(textView)) {
                removeView(this.f1064q);
                this.S.remove(this.f1064q);
            }
        } else {
            if (this.f1064q == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f1064q = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1064q.setEllipsize(TextUtils.TruncateAt.END);
                int i5 = this.A;
                if (i5 != 0) {
                    this.f1064q.setTextAppearance(context, i5);
                }
                ColorStateList colorStateList = this.O;
                if (colorStateList != null) {
                    this.f1064q.setTextColor(colorStateList);
                }
            }
            if (!e0(this.f1064q)) {
                c(this.f1064q, true);
            }
        }
        TextView textView2 = this.f1064q;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.M = charSequence;
    }

    @androidx.annotation.q0
    public Drawable N() {
        j();
        return this.f1062o.f0();
    }

    public void N0(Context context, @androidx.annotation.h1 int i5) {
        this.A = i5;
        TextView textView = this.f1064q;
        if (textView != null) {
            textView.setTextAppearance(context, i5);
        }
    }

    Context O() {
        return this.f1071x;
    }

    public void O0(@androidx.annotation.l int i5) {
        P0(ColorStateList.valueOf(i5));
    }

    public int P() {
        return this.f1072y;
    }

    public void P0(@androidx.annotation.o0 ColorStateList colorStateList) {
        this.O = colorStateList;
        TextView textView = this.f1064q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public CharSequence Q() {
        return this.M;
    }

    public void Q0(@androidx.annotation.g1 int i5) {
        R0(getContext().getText(i5));
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.TESTS})
    final TextView R() {
        return this.f1064q;
    }

    public void R0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1063p;
            if (textView != null && e0(textView)) {
                removeView(this.f1063p);
                this.S.remove(this.f1063p);
            }
        } else {
            if (this.f1063p == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f1063p = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1063p.setEllipsize(TextUtils.TruncateAt.END);
                int i5 = this.f1073z;
                if (i5 != 0) {
                    this.f1063p.setTextAppearance(context, i5);
                }
                ColorStateList colorStateList = this.N;
                if (colorStateList != null) {
                    this.f1063p.setTextColor(colorStateList);
                }
            }
            if (!e0(this.f1063p)) {
                c(this.f1063p, true);
            }
        }
        TextView textView2 = this.f1063p;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.L = charSequence;
    }

    public CharSequence S() {
        return this.L;
    }

    public void S0(int i5, int i6, int i7, int i8) {
        this.D = i5;
        this.F = i6;
        this.E = i7;
        this.G = i8;
        requestLayout();
    }

    public int T() {
        return this.G;
    }

    public void T0(int i5) {
        this.G = i5;
        requestLayout();
    }

    public int U() {
        return this.E;
    }

    public void U0(int i5) {
        this.E = i5;
        requestLayout();
    }

    public int V() {
        return this.D;
    }

    public void V0(int i5) {
        this.D = i5;
        requestLayout();
    }

    public int W() {
        return this.F;
    }

    public void W0(int i5) {
        this.F = i5;
        requestLayout();
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.TESTS})
    final TextView X() {
        return this.f1063p;
    }

    public void X0(Context context, @androidx.annotation.h1 int i5) {
        this.f1073z = i5;
        TextView textView = this.f1063p;
        if (textView != null) {
            textView.setTextAppearance(context, i5);
        }
    }

    public void Y0(@androidx.annotation.l int i5) {
        Z0(ColorStateList.valueOf(i5));
    }

    public void Z0(@androidx.annotation.o0 ColorStateList colorStateList) {
        this.N = colorStateList;
        TextView textView = this.f1063p;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    void a() {
        for (int size = this.S.size() - 1; size >= 0; size--) {
            addView(this.S.get(size));
        }
        this.S.clear();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public y a0() {
        if (this.W == null) {
            this.W = new a1(this, true);
        }
        return this.W;
    }

    public boolean b0() {
        d dVar = this.f1057b0;
        return (dVar == null || dVar.f1084p == null) ? false : true;
    }

    public boolean c0() {
        ActionMenuView actionMenuView = this.f1062o;
        return actionMenuView != null && actionMenuView.i0();
    }

    public boolean c1() {
        ActionMenuView actionMenuView = this.f1062o;
        return actionMenuView != null && actionMenuView.w0();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1062o) != null && actionMenuView.l0();
    }

    public void d0(@androidx.annotation.m0 int i5) {
        J().inflate(i5, I());
    }

    public void e() {
        d dVar = this.f1057b0;
        androidx.appcompat.view.menu.j jVar = dVar == null ? null : dVar.f1084p;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1062o;
        if (actionMenuView != null) {
            actionMenuView.Z();
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean f0() {
        ActionMenuView actionMenuView = this.f1062o;
        return actionMenuView != null && actionMenuView.j0();
    }

    void g() {
        if (this.f1069v == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, a.c.f21534a4);
            this.f1069v = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1067t);
            this.f1069v.setContentDescription(this.f1068u);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f165a = (this.B & 112) | androidx.core.view.d0.f5464b;
            generateDefaultLayoutParams.f1077b = 2;
            this.f1069v.setLayoutParams(generateDefaultLayoutParams);
            this.f1069v.setOnClickListener(new c());
        }
    }

    public boolean g0() {
        ActionMenuView actionMenuView = this.f1062o;
        return actionMenuView != null && actionMenuView.k0();
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean h0() {
        Layout layout;
        TextView textView = this.f1063p;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i5 = 0; i5 < lineCount; i5++) {
            if (layout.getEllipsisCount(i5) > 0) {
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

    void n0() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f1077b != 2 && childAt != this.f1062o) {
                removeViewAt(childCount);
                this.S.add(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void o0(@androidx.annotation.g1 int i5) {
        p0(i5 != 0 ? getContext().getText(i5) : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1061f0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.Q = false;
        }
        if (!this.Q) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.Q = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.Q = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a0 A[LOOP:0: B:41:0x029e->B:42:0x02a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c2 A[LOOP:1: B:45:0x02c0->B:46:0x02c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fb A[LOOP:2: B:54:0x02f9->B:55:0x02fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.T;
        boolean b6 = g1.b(this);
        int i14 = !b6 ? 1 : 0;
        if (b1(this.f1065r)) {
            l0(this.f1065r, i5, 0, i6, 0, this.C);
            i7 = this.f1065r.getMeasuredWidth() + F(this.f1065r);
            i8 = Math.max(0, this.f1065r.getMeasuredHeight() + Y(this.f1065r));
            i9 = View.combineMeasuredStates(0, this.f1065r.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (b1(this.f1069v)) {
            l0(this.f1069v, i5, 0, i6, 0, this.C);
            i7 = this.f1069v.getMeasuredWidth() + F(this.f1069v);
            i8 = Math.max(i8, this.f1069v.getMeasuredHeight() + Y(this.f1069v));
            i9 = View.combineMeasuredStates(i9, this.f1069v.getMeasuredState());
        }
        int E = E();
        int max = Math.max(E, i7) + 0;
        iArr[b6 ? 1 : 0] = Math.max(0, E - i7);
        if (b1(this.f1062o)) {
            l0(this.f1062o, i5, max, i6, 0, this.C);
            i10 = this.f1062o.getMeasuredWidth() + F(this.f1062o);
            i8 = Math.max(i8, this.f1062o.getMeasuredHeight() + Y(this.f1062o));
            i9 = View.combineMeasuredStates(i9, this.f1062o.getMeasuredState());
        } else {
            i10 = 0;
        }
        int B = B();
        int max2 = Math.max(B, i10) + max;
        iArr[i14] = Math.max(0, B - i10);
        if (b1(this.f1070w)) {
            max2 += k0(this.f1070w, i5, max2, i6, 0, iArr);
            i8 = Math.max(i8, this.f1070w.getMeasuredHeight() + Y(this.f1070w));
            i9 = View.combineMeasuredStates(i9, this.f1070w.getMeasuredState());
        }
        if (b1(this.f1066s)) {
            max2 += k0(this.f1066s, i5, max2, i6, 0, iArr);
            i8 = Math.max(i8, this.f1066s.getMeasuredHeight() + Y(this.f1066s));
            i9 = View.combineMeasuredStates(i9, this.f1066s.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (((LayoutParams) childAt.getLayoutParams()).f1077b == 0 && b1(childAt)) {
                max2 += k0(childAt, i5, max2, i6, 0, iArr);
                i8 = Math.max(i8, childAt.getMeasuredHeight() + Y(childAt));
                i9 = View.combineMeasuredStates(i9, childAt.getMeasuredState());
            }
        }
        int i16 = this.F + this.G;
        int i17 = this.D + this.E;
        if (b1(this.f1063p)) {
            k0(this.f1063p, i5, max2 + i17, i6, i16, iArr);
            int measuredWidth = this.f1063p.getMeasuredWidth() + F(this.f1063p);
            i11 = this.f1063p.getMeasuredHeight() + Y(this.f1063p);
            i12 = View.combineMeasuredStates(i9, this.f1063p.getMeasuredState());
            i13 = measuredWidth;
        } else {
            i11 = 0;
            i12 = i9;
            i13 = 0;
        }
        if (b1(this.f1064q)) {
            i13 = Math.max(i13, k0(this.f1064q, i5, max2 + i17, i6, i11 + i16, iArr));
            i11 += this.f1064q.getMeasuredHeight() + Y(this.f1064q);
            i12 = View.combineMeasuredStates(i12, this.f1064q.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max2 + i13, getSuggestedMinimumWidth()), i5, (-16777216) & i12), a1() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + Math.max(i8, i11), getSuggestedMinimumHeight()), i6, i12 << 16));
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
        ActionMenuView actionMenuView = this.f1062o;
        androidx.appcompat.view.menu.g o02 = actionMenuView != null ? actionMenuView.o0() : null;
        int i5 = savedState.f1078q;
        if (i5 != 0 && this.f1057b0 != null && o02 != null && (findItem = o02.findItem(i5)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f1079r) {
            m0();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i5) {
        super.onRtlPropertiesChanged(i5);
        h();
        this.H.f(i5 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.j jVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.f1057b0;
        if (dVar != null && (jVar = dVar.f1084p) != null) {
            savedState.f1078q = jVar.getItemId();
        }
        savedState.f1079r = g0();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.P = false;
        }
        if (!this.P) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.P = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.P = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void p0(@androidx.annotation.q0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1069v;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void q0(@androidx.annotation.v int i5) {
        r0(androidx.appcompat.content.res.a.d(getContext(), i5));
    }

    public void r0(@androidx.annotation.q0 Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1069v.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1069v;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1067t);
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void s0(boolean z5) {
        this.f1060e0 = z5;
        requestLayout();
    }

    @androidx.annotation.q0
    public CharSequence t() {
        ImageButton imageButton = this.f1069v;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void t0(int i5) {
        if (i5 < 0) {
            i5 = Integer.MIN_VALUE;
        }
        if (i5 != this.J) {
            this.J = i5;
            if (L() != null) {
                requestLayout();
            }
        }
    }

    @androidx.annotation.q0
    public Drawable u() {
        ImageButton imageButton = this.f1069v;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void u0(int i5) {
        if (i5 < 0) {
            i5 = Integer.MIN_VALUE;
        }
        if (i5 != this.I) {
            this.I = i5;
            if (L() != null) {
                requestLayout();
            }
        }
    }

    public int v() {
        q0 q0Var = this.H;
        if (q0Var != null) {
            return q0Var.a();
        }
        return 0;
    }

    public void v0(int i5, int i6) {
        h();
        this.H.e(i5, i6);
    }

    public int w() {
        int i5 = this.J;
        return i5 != Integer.MIN_VALUE ? i5 : v();
    }

    public void w0(int i5, int i6) {
        h();
        this.H.g(i5, i6);
    }

    public int x() {
        q0 q0Var = this.H;
        if (q0Var != null) {
            return q0Var.b();
        }
        return 0;
    }

    public void x0(@androidx.annotation.v int i5) {
        y0(androidx.appcompat.content.res.a.d(getContext(), i5));
    }

    public int y() {
        q0 q0Var = this.H;
        if (q0Var != null) {
            return q0Var.c();
        }
        return 0;
    }

    public void y0(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!e0(this.f1066s)) {
                c(this.f1066s, true);
            }
        } else {
            ImageView imageView = this.f1066s;
            if (imageView != null && e0(imageView)) {
                removeView(this.f1066s);
                this.S.remove(this.f1066s);
            }
        }
        ImageView imageView2 = this.f1066s;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public int z() {
        q0 q0Var = this.H;
        if (q0Var != null) {
            return q0Var.d();
        }
        return 0;
    }

    public void z0(@androidx.annotation.g1 int i5) {
        A0(getContext().getText(i5));
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: c, reason: collision with root package name */
        static final int f1074c = 0;

        /* renamed from: d, reason: collision with root package name */
        static final int f1075d = 1;

        /* renamed from: e, reason: collision with root package name */
        static final int f1076e = 2;

        /* renamed from: b, reason: collision with root package name */
        int f1077b;

        public LayoutParams(@androidx.annotation.o0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1077b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.f1077b = 0;
            this.f165a = 8388627;
        }

        public LayoutParams(int i5, int i6, int i7) {
            super(i5, i6);
            this.f1077b = 0;
            this.f165a = i7;
        }

        public LayoutParams(int i5) {
            this(-2, -1, i5);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1077b = 0;
            this.f1077b = layoutParams.f1077b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1077b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1077b = 0;
            a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1077b = 0;
        }
    }

    public Toolbar(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f21540b4);
    }

    public Toolbar(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.K = 8388627;
        this.R = new ArrayList<>();
        this.S = new ArrayList<>();
        this.T = new int[2];
        this.V = new a();
        this.f1061f0 = new b();
        Context context2 = getContext();
        int[] iArr = a.n.s7;
        z0 G = z0.G(context2, attributeSet, iArr, i5, 0);
        y1.z1(this, context, iArr, attributeSet, G.B(), i5, 0);
        this.f1073z = G.u(a.n.V7, 0);
        this.A = G.u(a.n.M7, 0);
        this.K = G.p(a.n.t7, this.K);
        this.B = G.p(a.n.v7, 48);
        int f6 = G.f(a.n.P7, 0);
        int i6 = a.n.U7;
        f6 = G.C(i6) ? G.f(i6, f6) : f6;
        this.G = f6;
        this.F = f6;
        this.E = f6;
        this.D = f6;
        int f7 = G.f(a.n.S7, -1);
        if (f7 >= 0) {
            this.D = f7;
        }
        int f8 = G.f(a.n.R7, -1);
        if (f8 >= 0) {
            this.E = f8;
        }
        int f9 = G.f(a.n.T7, -1);
        if (f9 >= 0) {
            this.F = f9;
        }
        int f10 = G.f(a.n.Q7, -1);
        if (f10 >= 0) {
            this.G = f10;
        }
        this.C = G.g(a.n.G7, -1);
        int f11 = G.f(a.n.C7, Integer.MIN_VALUE);
        int f12 = G.f(a.n.y7, Integer.MIN_VALUE);
        int g5 = G.g(a.n.A7, 0);
        int g6 = G.g(a.n.B7, 0);
        h();
        this.H.e(g5, g6);
        if (f11 != Integer.MIN_VALUE || f12 != Integer.MIN_VALUE) {
            this.H.g(f11, f12);
        }
        this.I = G.f(a.n.D7, Integer.MIN_VALUE);
        this.J = G.f(a.n.z7, Integer.MIN_VALUE);
        this.f1067t = G.h(a.n.x7);
        this.f1068u = G.x(a.n.w7);
        CharSequence x5 = G.x(a.n.O7);
        if (!TextUtils.isEmpty(x5)) {
            R0(x5);
        }
        CharSequence x6 = G.x(a.n.L7);
        if (!TextUtils.isEmpty(x6)) {
            M0(x6);
        }
        this.f1071x = getContext();
        K0(G.u(a.n.K7, 0));
        Drawable h5 = G.h(a.n.J7);
        if (h5 != null) {
            G0(h5);
        }
        CharSequence x7 = G.x(a.n.I7);
        if (!TextUtils.isEmpty(x7)) {
            E0(x7);
        }
        Drawable h6 = G.h(a.n.E7);
        if (h6 != null) {
            y0(h6);
        }
        CharSequence x8 = G.x(a.n.F7);
        if (!TextUtils.isEmpty(x8)) {
            A0(x8);
        }
        int i7 = a.n.W7;
        if (G.C(i7)) {
            Z0(G.d(i7));
        }
        int i8 = a.n.N7;
        if (G.C(i8)) {
            P0(G.d(i8));
        }
        int i9 = a.n.H7;
        if (G.C(i9)) {
            d0(G.u(i9, 0));
        }
        G.I();
    }
}
