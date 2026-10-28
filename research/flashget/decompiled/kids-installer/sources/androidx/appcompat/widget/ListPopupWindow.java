package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.c1;
import androidx.core.view.s1;
import androidx.core.view.y1;
import d.a;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class ListPopupWindow implements androidx.appcompat.view.menu.q {
    private static final String U = "ListPopupWindow";
    private static final boolean V = false;
    static final int W = 250;
    private static Method X = null;
    private static Method Y = null;
    private static Method Z = null;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f951a0 = 0;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f952b0 = 1;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f953c0 = -1;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f954d0 = -2;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f955e0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f956f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f957g0 = 2;
    private boolean A;
    private boolean B;
    int C;
    private View D;
    private int E;
    private DataSetObserver F;
    private View G;
    private Drawable H;
    private AdapterView.OnItemClickListener I;
    private AdapterView.OnItemSelectedListener J;
    final h K;
    private final g L;
    private final f M;
    private final d N;
    private Runnable O;
    final Handler P;
    private final Rect Q;
    private Rect R;
    private boolean S;
    PopupWindow T;

    /* renamed from: o, reason: collision with root package name */
    private Context f958o;

    /* renamed from: p, reason: collision with root package name */
    private ListAdapter f959p;

    /* renamed from: q, reason: collision with root package name */
    f0 f960q;

    /* renamed from: r, reason: collision with root package name */
    private int f961r;

    /* renamed from: s, reason: collision with root package name */
    private int f962s;

    /* renamed from: t, reason: collision with root package name */
    private int f963t;

    /* renamed from: u, reason: collision with root package name */
    private int f964u;

    /* renamed from: v, reason: collision with root package name */
    private int f965v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f966w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f967x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f968y;

    /* renamed from: z, reason: collision with root package name */
    private int f969z;

    class a extends h0 {
        a(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.h0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public ListPopupWindow b() {
            return ListPopupWindow.this;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View v5 = ListPopupWindow.this.v();
            if (v5 == null || v5.getWindowToken() == null) {
                return;
            }
            ListPopupWindow.this.a();
        }
    }

    /* loaded from: classes.dex */
    class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i5, long j5) {
            f0 f0Var;
            if (i5 == -1 || (f0Var = ListPopupWindow.this.f960q) == null) {
                return;
            }
            f0Var.j(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    private class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.s();
        }
    }

    /* loaded from: classes.dex */
    private class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.c()) {
                ListPopupWindow.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    private class f implements AbsListView.OnScrollListener {
        f() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i5, int i6, int i7) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i5) {
            if (i5 != 1 || ListPopupWindow.this.K() || ListPopupWindow.this.T.getContentView() == null) {
                return;
            }
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            listPopupWindow.P.removeCallbacks(listPopupWindow.K);
            ListPopupWindow.this.K.run();
        }
    }

    /* loaded from: classes.dex */
    private class g implements View.OnTouchListener {
        g() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.T) != null && popupWindow.isShowing() && x5 >= 0 && x5 < ListPopupWindow.this.T.getWidth() && y5 >= 0 && y5 < ListPopupWindow.this.T.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.P.postDelayed(listPopupWindow.K, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.P.removeCallbacks(listPopupWindow2.K);
            return false;
        }
    }

    /* loaded from: classes.dex */
    private class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = ListPopupWindow.this.f960q;
            if (f0Var == null || !y1.O0(f0Var) || ListPopupWindow.this.f960q.getCount() <= ListPopupWindow.this.f960q.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.f960q.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.C) {
                listPopupWindow.T.setInputMethodMode(2);
                ListPopupWindow.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                X = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Z = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public ListPopupWindow(@androidx.annotation.o0 Context context) {
        this(context, null, a.c.f21568g2);
    }

    private int A(View view, int i5, boolean z5) {
        return this.T.getMaxAvailableHeight(view, i5, z5);
    }

    private static boolean I(int i5) {
        return i5 == 66 || i5 == 23;
    }

    private void R() {
        View view = this.D;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.D);
            }
        }
    }

    private void i0(boolean z5) {
        if (Build.VERSION.SDK_INT > 28) {
            this.T.setIsClippedToScreen(z5);
            return;
        }
        Method method = X;
        if (method != null) {
            try {
                method.invoke(this.T, Boolean.valueOf(z5));
            } catch (Exception unused) {
            }
        }
    }

    private int r() {
        int i5;
        int i6;
        int makeMeasureSpec;
        int i7;
        if (this.f960q == null) {
            Context context = this.f958o;
            this.O = new b();
            f0 u5 = u(context, !this.S);
            this.f960q = u5;
            Drawable drawable = this.H;
            if (drawable != null) {
                u5.setSelector(drawable);
            }
            this.f960q.setAdapter(this.f959p);
            this.f960q.setOnItemClickListener(this.I);
            this.f960q.setFocusable(true);
            this.f960q.setFocusableInTouchMode(true);
            this.f960q.setOnItemSelectedListener(new c());
            this.f960q.setOnScrollListener(this.M);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.J;
            if (onItemSelectedListener != null) {
                this.f960q.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f960q;
            View view2 = this.D;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i8 = this.E;
                if (i8 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i8 == 1) {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i9 = this.f962s;
                if (i9 >= 0) {
                    i7 = Integer.MIN_VALUE;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i9, i7), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i5 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i5 = 0;
            }
            this.T.setContentView(view);
        } else {
            View view3 = this.D;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i5 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i5 = 0;
            }
        }
        Drawable background = this.T.getBackground();
        if (background != null) {
            background.getPadding(this.Q);
            Rect rect = this.Q;
            int i10 = rect.top;
            i6 = rect.bottom + i10;
            if (!this.f966w) {
                this.f964u = -i10;
            }
        } else {
            this.Q.setEmpty();
            i6 = 0;
        }
        int A = A(v(), this.f964u, this.T.getInputMethodMode() == 2);
        if (this.A || this.f961r == -1) {
            return A + i6;
        }
        int i11 = this.f962s;
        if (i11 == -2) {
            int i12 = this.f958o.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.Q;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i11 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        } else {
            int i13 = this.f958o.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.Q;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13 - (rect3.left + rect3.right), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        }
        int e6 = this.f960q.e(makeMeasureSpec, 0, -1, A - i5, -1);
        if (e6 > 0) {
            i5 += this.f960q.getPaddingBottom() + this.f960q.getPaddingTop() + i6;
        }
        return e6 + i5;
    }

    public int B() {
        return this.E;
    }

    @androidx.annotation.q0
    public Object C() {
        if (c()) {
            return this.f960q.getSelectedItem();
        }
        return null;
    }

    public long D() {
        if (c()) {
            return this.f960q.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int E() {
        if (c()) {
            return this.f960q.getSelectedItemPosition();
        }
        return -1;
    }

    @androidx.annotation.q0
    public View F() {
        if (c()) {
            return this.f960q.getSelectedView();
        }
        return null;
    }

    public int G() {
        return this.T.getSoftInputMode();
    }

    public int H() {
        return this.f962s;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean J() {
        return this.A;
    }

    public boolean K() {
        return this.T.getInputMethodMode() == 2;
    }

    public boolean L() {
        return this.S;
    }

    public boolean M(int i5, @androidx.annotation.o0 KeyEvent keyEvent) {
        int i6;
        int i7;
        if (c() && i5 != 62 && (this.f960q.getSelectedItemPosition() >= 0 || !I(i5))) {
            int selectedItemPosition = this.f960q.getSelectedItemPosition();
            boolean z5 = !this.T.isAboveAnchor();
            ListAdapter listAdapter = this.f959p;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                i6 = areAllItemsEnabled ? 0 : this.f960q.d(0, true);
                i7 = areAllItemsEnabled ? listAdapter.getCount() - 1 : this.f960q.d(listAdapter.getCount() - 1, false);
            } else {
                i6 = Integer.MAX_VALUE;
                i7 = Integer.MIN_VALUE;
            }
            if ((z5 && i5 == 19 && selectedItemPosition <= i6) || (!z5 && i5 == 20 && selectedItemPosition >= i7)) {
                s();
                this.T.setInputMethodMode(1);
                a();
                return true;
            }
            this.f960q.j(false);
            if (this.f960q.onKeyDown(i5, keyEvent)) {
                this.T.setInputMethodMode(2);
                this.f960q.requestFocusFromTouch();
                a();
                if (i5 == 19 || i5 == 20 || i5 == 23 || i5 == 66) {
                    return true;
                }
            } else if (z5 && i5 == 20) {
                if (selectedItemPosition == i7) {
                    return true;
                }
            } else if (!z5 && i5 == 19 && selectedItemPosition == i6) {
                return true;
            }
        }
        return false;
    }

    public boolean N(int i5, @androidx.annotation.o0 KeyEvent keyEvent) {
        if (i5 != 4 || !c()) {
            return false;
        }
        View view = this.G;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean O(int i5, @androidx.annotation.o0 KeyEvent keyEvent) {
        if (!c() || this.f960q.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.f960q.onKeyUp(i5, keyEvent);
        if (onKeyUp && I(i5)) {
            dismiss();
        }
        return onKeyUp;
    }

    public boolean P(int i5) {
        if (!c()) {
            return false;
        }
        if (this.I == null) {
            return true;
        }
        f0 f0Var = this.f960q;
        this.I.onItemClick(f0Var, f0Var.getChildAt(i5 - f0Var.getFirstVisiblePosition()), i5, f0Var.getAdapter().getItemId(i5));
        return true;
    }

    public void Q() {
        this.P.post(this.O);
    }

    public void S(@androidx.annotation.q0 View view) {
        this.G = view;
    }

    public void T(@androidx.annotation.h1 int i5) {
        this.T.setAnimationStyle(i5);
    }

    public void U(int i5) {
        Drawable background = this.T.getBackground();
        if (background == null) {
            n0(i5);
            return;
        }
        background.getPadding(this.Q);
        Rect rect = this.Q;
        this.f962s = rect.left + rect.right + i5;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void V(boolean z5) {
        this.A = z5;
    }

    public void W(int i5) {
        this.f969z = i5;
    }

    public void X(@androidx.annotation.q0 Rect rect) {
        this.R = rect != null ? new Rect(rect) : null;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void Y(boolean z5) {
        this.B = z5;
    }

    public void Z(int i5) {
        if (i5 < 0 && -2 != i5 && -1 != i5) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f961r = i5;
    }

    @Override // androidx.appcompat.view.menu.q
    public void a() {
        int r5 = r();
        boolean K = K();
        androidx.core.widget.q.d(this.T, this.f965v);
        if (this.T.isShowing()) {
            if (y1.O0(v())) {
                int i5 = this.f962s;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = v().getWidth();
                }
                int i6 = this.f961r;
                if (i6 == -1) {
                    if (!K) {
                        r5 = -1;
                    }
                    if (K) {
                        this.T.setWidth(this.f962s == -1 ? -1 : 0);
                        this.T.setHeight(0);
                    } else {
                        this.T.setWidth(this.f962s == -1 ? -1 : 0);
                        this.T.setHeight(-1);
                    }
                } else if (i6 != -2) {
                    r5 = i6;
                }
                this.T.setOutsideTouchable((this.B || this.A) ? false : true);
                this.T.update(v(), this.f963t, this.f964u, i5 < 0 ? -1 : i5, r5 < 0 ? -1 : r5);
                return;
            }
            return;
        }
        int i7 = this.f962s;
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = v().getWidth();
        }
        int i8 = this.f961r;
        if (i8 == -1) {
            r5 = -1;
        } else if (i8 != -2) {
            r5 = i8;
        }
        this.T.setWidth(i7);
        this.T.setHeight(r5);
        i0(true);
        this.T.setOutsideTouchable((this.B || this.A) ? false : true);
        this.T.setTouchInterceptor(this.L);
        if (this.f968y) {
            androidx.core.widget.q.c(this.T, this.f967x);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = Z;
            if (method != null) {
                try {
                    method.invoke(this.T, this.R);
                } catch (Exception unused) {
                }
            }
        } else {
            this.T.setEpicenterBounds(this.R);
        }
        androidx.core.widget.q.e(this.T, v(), this.f963t, this.f964u, this.f969z);
        this.f960q.setSelection(-1);
        if (!this.S || this.f960q.isInTouchMode()) {
            s();
        }
        if (this.S) {
            return;
        }
        this.P.post(this.N);
    }

    public void a0(int i5) {
        this.T.setInputMethodMode(i5);
    }

    public void b(@androidx.annotation.q0 Drawable drawable) {
        this.T.setBackgroundDrawable(drawable);
    }

    void b0(int i5) {
        this.C = i5;
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean c() {
        return this.T.isShowing();
    }

    public void c0(Drawable drawable) {
        this.H = drawable;
    }

    public int d() {
        return this.f963t;
    }

    public void d0(boolean z5) {
        this.S = z5;
        this.T.setFocusable(z5);
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        this.T.dismiss();
        R();
        this.T.setContentView(null);
        this.f960q = null;
        this.P.removeCallbacks(this.K);
    }

    public void e0(@androidx.annotation.q0 PopupWindow.OnDismissListener onDismissListener) {
        this.T.setOnDismissListener(onDismissListener);
    }

    public void f(int i5) {
        this.f963t = i5;
    }

    public void f0(@androidx.annotation.q0 AdapterView.OnItemClickListener onItemClickListener) {
        this.I = onItemClickListener;
    }

    public void g0(@androidx.annotation.q0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.J = onItemSelectedListener;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void h0(boolean z5) {
        this.f968y = true;
        this.f967x = z5;
    }

    @androidx.annotation.q0
    public Drawable i() {
        return this.T.getBackground();
    }

    public void j0(int i5) {
        this.E = i5;
    }

    @Override // androidx.appcompat.view.menu.q
    @androidx.annotation.q0
    public ListView k() {
        return this.f960q;
    }

    public void k0(@androidx.annotation.q0 View view) {
        boolean c6 = c();
        if (c6) {
            R();
        }
        this.D = view;
        if (c6) {
            a();
        }
    }

    public void l(int i5) {
        this.f964u = i5;
        this.f966w = true;
    }

    public void l0(int i5) {
        f0 f0Var = this.f960q;
        if (!c() || f0Var == null) {
            return;
        }
        f0Var.j(false);
        f0Var.setSelection(i5);
        if (f0Var.getChoiceMode() != 0) {
            f0Var.setItemChecked(i5, true);
        }
    }

    public void m0(int i5) {
        this.T.setSoftInputMode(i5);
    }

    public void n0(int i5) {
        this.f962s = i5;
    }

    public int o() {
        if (this.f966w) {
            return this.f964u;
        }
        return 0;
    }

    public void o0(int i5) {
        this.f965v = i5;
    }

    public void q(@androidx.annotation.q0 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.F;
        if (dataSetObserver == null) {
            this.F = new e();
        } else {
            ListAdapter listAdapter2 = this.f959p;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f959p = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.F);
        }
        f0 f0Var = this.f960q;
        if (f0Var != null) {
            f0Var.setAdapter(this.f959p);
        }
    }

    public void s() {
        f0 f0Var = this.f960q;
        if (f0Var != null) {
            f0Var.j(true);
            f0Var.requestLayout();
        }
    }

    public View.OnTouchListener t(View view) {
        return new a(view);
    }

    @androidx.annotation.o0
    f0 u(Context context, boolean z5) {
        return new f0(context, z5);
    }

    @androidx.annotation.q0
    public View v() {
        return this.G;
    }

    @androidx.annotation.h1
    public int w() {
        return this.T.getAnimationStyle();
    }

    @androidx.annotation.q0
    public Rect x() {
        if (this.R != null) {
            return new Rect(this.R);
        }
        return null;
    }

    public int y() {
        return this.f961r;
    }

    public int z() {
        return this.T.getInputMethodMode();
    }

    public ListPopupWindow(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f21568g2);
    }

    public ListPopupWindow(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.f int i5) {
        this(context, attributeSet, i5, 0);
    }

    public ListPopupWindow(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.f int i5, @androidx.annotation.h1 int i6) {
        this.f961r = -2;
        this.f962s = -2;
        this.f965v = s1.f5664e;
        this.f969z = 0;
        this.A = false;
        this.B = false;
        this.C = Integer.MAX_VALUE;
        this.E = 0;
        this.K = new h();
        this.L = new g();
        this.M = new f();
        this.N = new d();
        this.Q = new Rect();
        this.f958o = context;
        this.P = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.f22192e5, i5, i6);
        this.f963t = obtainStyledAttributes.getDimensionPixelOffset(a.n.f22199f5, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(a.n.g5, 0);
        this.f964u = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f966w = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i5, i6);
        this.T = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
