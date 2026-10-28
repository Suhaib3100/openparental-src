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
import androidx.annotation.h1;
import androidx.core.view.x1;
import d.a;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ListPopupWindow implements androidx.appcompat.view.menu.r {
    private static final String H = "ListPopupWindow";
    private static final boolean I = false;
    static final int J = 250;
    private static Method K = null;
    private static Method L = null;
    private static Method M = null;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = -1;
    public static final int Q = -2;
    public static final int R = 0;
    public static final int X = 1;
    public static final int Y = 2;
    private final f A;
    private Runnable B;
    final Handler C;
    private final Rect D;
    private Rect E;
    private boolean F;
    PopupWindow G;

    /* renamed from: b, reason: collision with root package name */
    private Context f1560b;

    /* renamed from: c, reason: collision with root package name */
    private ListAdapter f1561c;

    /* renamed from: d, reason: collision with root package name */
    b0 f1562d;

    /* renamed from: e, reason: collision with root package name */
    private int f1563e;

    /* renamed from: f, reason: collision with root package name */
    private int f1564f;

    /* renamed from: g, reason: collision with root package name */
    private int f1565g;

    /* renamed from: h, reason: collision with root package name */
    private int f1566h;

    /* renamed from: i, reason: collision with root package name */
    private int f1567i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1568j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1569k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1570l;

    /* renamed from: m, reason: collision with root package name */
    private int f1571m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1572n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1573o;

    /* renamed from: p, reason: collision with root package name */
    int f1574p;

    /* renamed from: q, reason: collision with root package name */
    private View f1575q;

    /* renamed from: r, reason: collision with root package name */
    private int f1576r;

    /* renamed from: s, reason: collision with root package name */
    private DataSetObserver f1577s;

    /* renamed from: t, reason: collision with root package name */
    private View f1578t;

    /* renamed from: u, reason: collision with root package name */
    private Drawable f1579u;

    /* renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemClickListener f1580v;

    /* renamed from: w, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1581w;

    /* renamed from: x, reason: collision with root package name */
    final j f1582x;

    /* renamed from: y, reason: collision with root package name */
    private final i f1583y;

    /* renamed from: z, reason: collision with root package name */
    private final h f1584z;

    class a extends e0 {
        a(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public ListPopupWindow b() {
            return ListPopupWindow.this;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View v4 = ListPopupWindow.this.v();
            if (v4 == null || v4.getWindowToken() == null) {
                return;
            }
            ListPopupWindow.this.b();
        }
    }

    class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            b0 b0Var;
            if (i4 == -1 || (b0Var = ListPopupWindow.this.f1562d) == null) {
                return;
            }
            b0Var.j(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @androidx.annotation.x0(24)
    static class d {
        private d() {
        }

        @androidx.annotation.u
        static int a(PopupWindow popupWindow, View view, int i4, boolean z4) {
            return popupWindow.getMaxAvailableHeight(view, i4, z4);
        }
    }

    @androidx.annotation.x0(29)
    static class e {
        private e() {
        }

        @androidx.annotation.u
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @androidx.annotation.u
        static void b(PopupWindow popupWindow, boolean z4) {
            popupWindow.setIsClippedToScreen(z4);
        }
    }

    private class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.s();
        }
    }

    private class g extends DataSetObserver {
        g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.c()) {
                ListPopupWindow.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    private class h implements AbsListView.OnScrollListener {
        h() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
            if (i4 != 1 || ListPopupWindow.this.K() || ListPopupWindow.this.G.getContentView() == null) {
                return;
            }
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            listPopupWindow.C.removeCallbacks(listPopupWindow.f1582x);
            ListPopupWindow.this.f1582x.run();
        }
    }

    private class i implements View.OnTouchListener {
        i() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x4 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.G) != null && popupWindow.isShowing() && x4 >= 0 && x4 < ListPopupWindow.this.G.getWidth() && y4 >= 0 && y4 < ListPopupWindow.this.G.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.C.postDelayed(listPopupWindow.f1582x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
            listPopupWindow2.C.removeCallbacks(listPopupWindow2.f1582x);
            return false;
        }
    }

    private class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0 b0Var = ListPopupWindow.this.f1562d;
            if (b0Var == null || !x1.R0(b0Var) || ListPopupWindow.this.f1562d.getCount() <= ListPopupWindow.this.f1562d.getChildCount()) {
                return;
            }
            int childCount = ListPopupWindow.this.f1562d.getChildCount();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (childCount <= listPopupWindow.f1574p) {
                listPopupWindow.G.setInputMethodMode(2);
                ListPopupWindow.this.b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                K = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                M = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public ListPopupWindow(@androidx.annotation.o0 Context context) {
        this(context, null, a.b.Z1);
    }

    private int A(View view, int i4, boolean z4) {
        return d.a(this.G, view, i4, z4);
    }

    private static boolean I(int i4) {
        return i4 == 66 || i4 == 23;
    }

    private void R() {
        View view = this.f1575q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1575q);
            }
        }
    }

    private void i0(boolean z4) {
        if (Build.VERSION.SDK_INT > 28) {
            e.b(this.G, z4);
            return;
        }
        Method method = K;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(z4));
            } catch (Exception unused) {
            }
        }
    }

    private int r() {
        int i4;
        int i5;
        int makeMeasureSpec;
        int i6;
        if (this.f1562d == null) {
            Context context = this.f1560b;
            this.B = new b();
            b0 u4 = u(context, !this.F);
            this.f1562d = u4;
            Drawable drawable = this.f1579u;
            if (drawable != null) {
                u4.setSelector(drawable);
            }
            this.f1562d.setAdapter(this.f1561c);
            this.f1562d.setOnItemClickListener(this.f1580v);
            this.f1562d.setFocusable(true);
            this.f1562d.setFocusableInTouchMode(true);
            this.f1562d.setOnItemSelectedListener(new c());
            this.f1562d.setOnScrollListener(this.f1584z);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1581w;
            if (onItemSelectedListener != null) {
                this.f1562d.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f1562d;
            View view2 = this.f1575q;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i7 = this.f1576r;
                if (i7 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i7 == 1) {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i10 = this.f1564f;
                if (i10 >= 0) {
                    i6 = Integer.MIN_VALUE;
                } else {
                    i10 = 0;
                    i6 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i10, i6), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i4 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i4 = 0;
            }
            this.G.setContentView(view);
        } else {
            View view3 = this.f1575q;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i4 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i4 = 0;
            }
        }
        Drawable background = this.G.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            Rect rect = this.D;
            int i11 = rect.top;
            i5 = rect.bottom + i11;
            if (!this.f1568j) {
                this.f1566h = -i11;
            }
        } else {
            this.D.setEmpty();
            i5 = 0;
        }
        int a5 = d.a(this.G, v(), this.f1566h, this.G.getInputMethodMode() == 2);
        if (this.f1572n || this.f1563e == -1) {
            return a5 + i5;
        }
        int i12 = this.f1564f;
        if (i12 == -2) {
            int i13 = this.f1560b.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.D;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i12 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else {
            int i14 = this.f1560b.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.D;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - (rect3.left + rect3.right), 1073741824);
        }
        int e4 = this.f1562d.e(makeMeasureSpec, 0, -1, a5 - i4, -1);
        if (e4 > 0) {
            i4 += this.f1562d.getPaddingBottom() + this.f1562d.getPaddingTop() + i5;
        }
        return e4 + i4;
    }

    public int B() {
        return this.f1576r;
    }

    @androidx.annotation.q0
    public Object C() {
        if (c()) {
            return this.f1562d.getSelectedItem();
        }
        return null;
    }

    public long D() {
        if (c()) {
            return this.f1562d.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int E() {
        if (c()) {
            return this.f1562d.getSelectedItemPosition();
        }
        return -1;
    }

    @androidx.annotation.q0
    public View F() {
        if (c()) {
            return this.f1562d.getSelectedView();
        }
        return null;
    }

    public int G() {
        return this.G.getSoftInputMode();
    }

    public int H() {
        return this.f1564f;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public boolean J() {
        return this.f1572n;
    }

    public boolean K() {
        return this.G.getInputMethodMode() == 2;
    }

    public boolean L() {
        return this.F;
    }

    public boolean M(int i4, @androidx.annotation.o0 KeyEvent keyEvent) {
        int i5;
        int i6;
        if (c() && i4 != 62 && (this.f1562d.getSelectedItemPosition() >= 0 || !I(i4))) {
            int selectedItemPosition = this.f1562d.getSelectedItemPosition();
            boolean isAboveAnchor = this.G.isAboveAnchor();
            ListAdapter listAdapter = this.f1561c;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                i5 = areAllItemsEnabled ? 0 : this.f1562d.d(0, true);
                i6 = areAllItemsEnabled ? listAdapter.getCount() - 1 : this.f1562d.d(listAdapter.getCount() - 1, false);
            } else {
                i5 = Integer.MAX_VALUE;
                i6 = Integer.MIN_VALUE;
            }
            if ((!isAboveAnchor && i4 == 19 && selectedItemPosition <= i5) || (isAboveAnchor && i4 == 20 && selectedItemPosition >= i6)) {
                s();
                this.G.setInputMethodMode(1);
                b();
                return true;
            }
            this.f1562d.j(false);
            if (this.f1562d.onKeyDown(i4, keyEvent)) {
                this.G.setInputMethodMode(2);
                this.f1562d.requestFocusFromTouch();
                b();
                if (i4 == 19 || i4 == 20 || i4 == 23 || i4 == 66) {
                    return true;
                }
            } else if (isAboveAnchor || i4 != 20) {
                if (isAboveAnchor && i4 == 19 && selectedItemPosition == i5) {
                    return true;
                }
            } else if (selectedItemPosition == i6) {
                return true;
            }
        }
        return false;
    }

    public boolean N(int i4, @androidx.annotation.o0 KeyEvent keyEvent) {
        if (i4 != 4 || !c()) {
            return false;
        }
        View view = this.f1578t;
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

    public boolean O(int i4, @androidx.annotation.o0 KeyEvent keyEvent) {
        if (!c() || this.f1562d.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.f1562d.onKeyUp(i4, keyEvent);
        if (onKeyUp && I(i4)) {
            dismiss();
        }
        return onKeyUp;
    }

    public boolean P(int i4) {
        if (!c()) {
            return false;
        }
        if (this.f1580v == null) {
            return true;
        }
        b0 b0Var = this.f1562d;
        this.f1580v.onItemClick(b0Var, b0Var.getChildAt(i4 - b0Var.getFirstVisiblePosition()), i4, b0Var.getAdapter().getItemId(i4));
        return true;
    }

    public void Q() {
        this.C.post(this.B);
    }

    public void S(@androidx.annotation.q0 View view) {
        this.f1578t = view;
    }

    public void T(@h1 int i4) {
        this.G.setAnimationStyle(i4);
    }

    public void U(int i4) {
        Drawable background = this.G.getBackground();
        if (background == null) {
            n0(i4);
            return;
        }
        background.getPadding(this.D);
        Rect rect = this.D;
        this.f1564f = rect.left + rect.right + i4;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void V(boolean z4) {
        this.f1572n = z4;
    }

    public void W(int i4) {
        this.f1571m = i4;
    }

    public void X(@androidx.annotation.q0 Rect rect) {
        this.E = rect != null ? new Rect(rect) : null;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void Y(boolean z4) {
        this.f1573o = z4;
    }

    public void Z(int i4) {
        if (i4 < 0 && -2 != i4 && -1 != i4) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f1563e = i4;
    }

    public void a(@androidx.annotation.q0 Drawable drawable) {
        this.G.setBackgroundDrawable(drawable);
    }

    public void a0(int i4) {
        this.G.setInputMethodMode(i4);
    }

    @Override // androidx.appcompat.view.menu.r
    public void b() {
        int r4 = r();
        boolean K2 = K();
        this.G.setWindowLayoutType(this.f1567i);
        if (this.G.isShowing()) {
            if (x1.R0(v())) {
                int i4 = this.f1564f;
                if (i4 == -1) {
                    i4 = -1;
                } else if (i4 == -2) {
                    i4 = v().getWidth();
                }
                int i5 = this.f1563e;
                if (i5 == -1) {
                    if (!K2) {
                        r4 = -1;
                    }
                    if (K2) {
                        this.G.setWidth(this.f1564f == -1 ? -1 : 0);
                        this.G.setHeight(0);
                    } else {
                        this.G.setWidth(this.f1564f == -1 ? -1 : 0);
                        this.G.setHeight(-1);
                    }
                } else if (i5 != -2) {
                    r4 = i5;
                }
                this.G.setOutsideTouchable((this.f1573o || this.f1572n) ? false : true);
                this.G.update(v(), this.f1565g, this.f1566h, i4 < 0 ? -1 : i4, r4 < 0 ? -1 : r4);
                return;
            }
            return;
        }
        int i6 = this.f1564f;
        if (i6 == -1) {
            i6 = -1;
        } else if (i6 == -2) {
            i6 = v().getWidth();
        }
        int i7 = this.f1563e;
        if (i7 == -1) {
            r4 = -1;
        } else if (i7 != -2) {
            r4 = i7;
        }
        this.G.setWidth(i6);
        this.G.setHeight(r4);
        i0(true);
        this.G.setOutsideTouchable((this.f1573o || this.f1572n) ? false : true);
        this.G.setTouchInterceptor(this.f1583y);
        if (this.f1570l) {
            this.G.setOverlapAnchor(this.f1569k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = M;
            if (method != null) {
                try {
                    method.invoke(this.G, this.E);
                } catch (Exception unused) {
                }
            }
        } else {
            e.a(this.G, this.E);
        }
        this.G.showAsDropDown(v(), this.f1565g, this.f1566h, this.f1571m);
        this.f1562d.setSelection(-1);
        if (!this.F || this.f1562d.isInTouchMode()) {
            s();
        }
        if (this.F) {
            return;
        }
        this.C.post(this.A);
    }

    void b0(int i4) {
        this.f1574p = i4;
    }

    @Override // androidx.appcompat.view.menu.r
    public boolean c() {
        return this.G.isShowing();
    }

    public void c0(Drawable drawable) {
        this.f1579u = drawable;
    }

    public int d() {
        if (this.f1568j) {
            return this.f1566h;
        }
        return 0;
    }

    public void d0(boolean z4) {
        this.F = z4;
        this.G.setFocusable(z4);
    }

    @Override // androidx.appcompat.view.menu.r
    public void dismiss() {
        this.G.dismiss();
        R();
        this.G.setContentView(null);
        this.f1562d = null;
        this.C.removeCallbacks(this.f1582x);
    }

    public int e() {
        return this.f1565g;
    }

    public void e0(@androidx.annotation.q0 PopupWindow.OnDismissListener onDismissListener) {
        this.G.setOnDismissListener(onDismissListener);
    }

    public void f0(@androidx.annotation.q0 AdapterView.OnItemClickListener onItemClickListener) {
        this.f1580v = onItemClickListener;
    }

    public void g(int i4) {
        this.f1565g = i4;
    }

    public void g0(@androidx.annotation.q0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1581w = onItemSelectedListener;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void h0(boolean z4) {
        this.f1570l = true;
        this.f1569k = z4;
    }

    @androidx.annotation.q0
    public Drawable i() {
        return this.G.getBackground();
    }

    public void j0(int i4) {
        this.f1576r = i4;
    }

    public void k(int i4) {
        this.f1566h = i4;
        this.f1568j = true;
    }

    public void k0(@androidx.annotation.q0 View view) {
        boolean c5 = c();
        if (c5) {
            R();
        }
        this.f1575q = view;
        if (c5) {
            b();
        }
    }

    public void l0(int i4) {
        b0 b0Var = this.f1562d;
        if (!c() || b0Var == null) {
            return;
        }
        b0Var.j(false);
        b0Var.setSelection(i4);
        if (b0Var.getChoiceMode() != 0) {
            b0Var.setItemChecked(i4, true);
        }
    }

    public void m0(int i4) {
        this.G.setSoftInputMode(i4);
    }

    public void n0(int i4) {
        this.f1564f = i4;
    }

    public void o(@androidx.annotation.q0 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1577s;
        if (dataSetObserver == null) {
            this.f1577s = new g();
        } else {
            ListAdapter listAdapter2 = this.f1561c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1561c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1577s);
        }
        b0 b0Var = this.f1562d;
        if (b0Var != null) {
            b0Var.setAdapter(this.f1561c);
        }
    }

    public void o0(int i4) {
        this.f1567i = i4;
    }

    @Override // androidx.appcompat.view.menu.r
    @androidx.annotation.q0
    public ListView q() {
        return this.f1562d;
    }

    public void s() {
        b0 b0Var = this.f1562d;
        if (b0Var != null) {
            b0Var.j(true);
            b0Var.requestLayout();
        }
    }

    public View.OnTouchListener t(View view) {
        return new a(view);
    }

    @androidx.annotation.o0
    b0 u(Context context, boolean z4) {
        return new b0(context, z4);
    }

    @androidx.annotation.q0
    public View v() {
        return this.f1578t;
    }

    @h1
    public int w() {
        return this.G.getAnimationStyle();
    }

    @androidx.annotation.q0
    public Rect x() {
        if (this.E != null) {
            return new Rect(this.E);
        }
        return null;
    }

    public int y() {
        return this.f1563e;
    }

    public int z() {
        return this.G.getInputMethodMode();
    }

    public ListPopupWindow(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.Z1);
    }

    public ListPopupWindow(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.f int i4) {
        this(context, attributeSet, i4, 0);
    }

    public ListPopupWindow(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, @androidx.annotation.f int i4, @h1 int i5) {
        this.f1563e = -2;
        this.f1564f = -2;
        this.f1567i = 1002;
        this.f1571m = 0;
        this.f1572n = false;
        this.f1573o = false;
        this.f1574p = Integer.MAX_VALUE;
        this.f1576r = 0;
        this.f1582x = new j();
        this.f1583y = new i();
        this.f1584z = new h();
        this.A = new f();
        this.D = new Rect();
        this.f1560b = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.f73490a4, i4, i5);
        this.f1565g = obtainStyledAttributes.getDimensionPixelOffset(a.m.f73496b4, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(a.m.f73502c4, 0);
        this.f1566h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1568j = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i4, i5);
        this.G = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
