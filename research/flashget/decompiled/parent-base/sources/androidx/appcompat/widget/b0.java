package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.os.b;
import androidx.core.view.i2;
import d.a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DropDownListView.java */
/* loaded from: classes.dex */
class b0 extends ListView {

    /* renamed from: o, reason: collision with root package name */
    public static final int f1731o = -1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f1732p = -1;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f1733b;

    /* renamed from: c, reason: collision with root package name */
    private int f1734c;

    /* renamed from: d, reason: collision with root package name */
    private int f1735d;

    /* renamed from: e, reason: collision with root package name */
    private int f1736e;

    /* renamed from: f, reason: collision with root package name */
    private int f1737f;

    /* renamed from: g, reason: collision with root package name */
    private int f1738g;

    /* renamed from: h, reason: collision with root package name */
    private d f1739h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1740i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1741j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1742k;

    /* renamed from: l, reason: collision with root package name */
    private i2 f1743l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.core.widget.l f1744m;

    /* renamed from: n, reason: collision with root package name */
    f f1745n;

    /* compiled from: DropDownListView.java */
    @androidx.annotation.x0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(View view, float f4, float f5) {
            view.drawableHotspotChanged(f4, f5);
        }
    }

    /* compiled from: DropDownListView.java */
    @androidx.annotation.x0(30)
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static Method f1746a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f1747b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f1748c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f1749d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f1746a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1747b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1748c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1749d = true;
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            }
        }

        private b() {
        }

        static boolean a() {
            return f1749d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        static void b(b0 b0Var, int i4, View view) {
            try {
                f1746a.invoke(b0Var, Integer.valueOf(i4), view, Boolean.FALSE, -1, -1);
                f1747b.invoke(b0Var, Integer.valueOf(i4));
                f1748c.invoke(b0Var, Integer.valueOf(i4));
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: DropDownListView.java */
    @androidx.annotation.x0(33)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @androidx.annotation.u
        static void b(AbsListView absListView, boolean z4) {
            absListView.setSelectedChildViewEnabled(z4);
        }
    }

    /* compiled from: DropDownListView.java */
    private static class d extends androidx.appcompat.graphics.drawable.c {

        /* renamed from: c, reason: collision with root package name */
        private boolean f1750c;

        d(Drawable drawable) {
            super(drawable);
            this.f1750c = true;
        }

        void c(boolean z4) {
            this.f1750c = z4;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1750c) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspot(float f4, float f5) {
            if (this.f1750c) {
                super.setHotspot(f4, f5);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i4, int i5, int i6, int i7) {
            if (this.f1750c) {
                super.setHotspotBounds(i4, i5, i6, i7);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1750c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z4, boolean z5) {
            if (this.f1750c) {
                return super.setVisible(z4, z5);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView.java */
    static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Field f1751a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                e4.printStackTrace();
            }
            f1751a = field;
        }

        private e() {
        }

        static boolean a(AbsListView absListView) {
            Field field = f1751a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e4) {
                e4.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z4) {
            Field field = f1751a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z4));
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* compiled from: DropDownListView.java */
    private class f implements Runnable {
        f() {
        }

        public void a() {
            b0 b0Var = b0.this;
            b0Var.f1745n = null;
            b0Var.removeCallbacks(this);
        }

        public void b() {
            b0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            b0 b0Var = b0.this;
            b0Var.f1745n = null;
            b0Var.drawableStateChanged();
        }
    }

    b0(@androidx.annotation.o0 Context context, boolean z4) {
        super(context, null, a.b.f73025p1);
        this.f1733b = new Rect();
        this.f1734c = 0;
        this.f1735d = 0;
        this.f1736e = 0;
        this.f1737f = 0;
        this.f1741j = z4;
        setCacheColorHint(0);
    }

    private void a() {
        this.f1742k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1738g - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        i2 i2Var = this.f1743l;
        if (i2Var != null) {
            i2Var.d();
            this.f1743l = null;
        }
    }

    private void b(View view, int i4) {
        performItemClick(view, i4, getItemIdAtPosition(i4));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f1733b.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1733b);
        selector.draw(canvas);
    }

    private void g(int i4, View view) {
        Rect rect = this.f1733b;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1734c;
        rect.top -= this.f1735d;
        rect.right += this.f1736e;
        rect.bottom += this.f1737f;
        boolean m4 = m();
        if (view.isEnabled() != m4) {
            n(!m4);
            if (i4 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void h(int i4, View view) {
        Drawable selector = getSelector();
        boolean z4 = (selector == null || i4 == -1) ? false : true;
        if (z4) {
            selector.setVisible(false, false);
        }
        g(i4, view);
        if (z4) {
            Rect rect = this.f1733b;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            selector.setHotspot(exactCenterX, exactCenterY);
        }
    }

    private void i(int i4, View view, float f4, float f5) {
        h(i4, view);
        Drawable selector = getSelector();
        if (selector == null || i4 == -1) {
            return;
        }
        selector.setHotspot(f4, f5);
    }

    private void k(View view, int i4, float f4, float f5) {
        View childAt;
        this.f1742k = true;
        a.a(this, f4, f5);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i5 = this.f1738g;
        if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1738g = i4;
        a.a(view, f4 - view.getLeft(), f5 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i4, view, f4, f5);
        l(false);
        refreshDrawableState();
    }

    private void l(boolean z4) {
        d dVar = this.f1739h;
        if (dVar != null) {
            dVar.c(z4);
        }
    }

    @androidx.annotation.s0(markerClass = {b.InterfaceC0422b.class})
    private boolean m() {
        return androidx.core.os.b.k() ? c.a(this) : e.a(this);
    }

    @androidx.annotation.s0(markerClass = {b.InterfaceC0422b.class})
    private void n(boolean z4) {
        if (androidx.core.os.b.k()) {
            c.b(this, z4);
        } else {
            e.b(this, z4);
        }
    }

    private boolean o() {
        return this.f1742k;
    }

    private void p() {
        Drawable selector = getSelector();
        if (selector != null && this.f1742k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i4, boolean z4) {
        int min;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z4) {
                    min = Math.max(0, i4);
                    while (min < count && !adapter.isEnabled(min)) {
                        min++;
                    }
                } else {
                    min = Math.min(i4, count - 1);
                    while (min >= 0 && !adapter.isEnabled(min)) {
                        min--;
                    }
                }
                if (min < 0 || min >= count) {
                    return -1;
                }
                return min;
            }
            if (i4 >= 0 && i4 < count) {
                return i4;
            }
        }
        return -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1745n != null) {
            return;
        }
        super.drawableStateChanged();
        l(true);
        p();
    }

    public int e(int i4, int i5, int i6, int i7, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i11 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        View view = null;
        while (i12 < count) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i4, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i7) {
                return (i10 < 0 || i12 <= i10 || i14 <= 0 || i11 == i7) ? i7 : i14;
            }
            if (i10 >= 0 && i12 >= i10) {
                i14 = i11;
            }
            i12++;
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.k(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.l r9 = r7.f1744m
            if (r9 != 0) goto L5a
            androidx.core.widget.l r9 = new androidx.core.widget.l
            r9.<init>(r7)
            r7.f1744m = r9
        L5a:
            androidx.core.widget.l r9 = r7.f1744m
            r9.o(r1)
            androidx.core.widget.l r9 = r7.f1744m
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.l r8 = r7.f1744m
            if (r8 == 0) goto L6c
            r8.o(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.f(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1741j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1741j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1741j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1741j && this.f1740i) || super.isInTouchMode();
    }

    void j(boolean z4) {
        this.f1740i = z4;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1745n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@androidx.annotation.o0 MotionEvent motionEvent) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1745n == null) {
            f fVar = new f();
            this.f1745n = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i4 < 30 || !b.a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, pointToPosition, childAt);
                    }
                }
                p();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1738g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f1745n;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f1739h = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1734c = rect.left;
        this.f1735d = rect.top;
        this.f1736e = rect.right;
        this.f1737f = rect.bottom;
    }
}
