package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.r3;
import d.a;
import java.lang.reflect.Field;

/* compiled from: DropDownListView.java */
/* loaded from: classes.dex */
class f0 extends ListView {
    public static final int C = -1;
    public static final int D = -1;
    private androidx.core.widget.n A;
    b B;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f1216o;

    /* renamed from: p, reason: collision with root package name */
    private int f1217p;

    /* renamed from: q, reason: collision with root package name */
    private int f1218q;

    /* renamed from: r, reason: collision with root package name */
    private int f1219r;

    /* renamed from: s, reason: collision with root package name */
    private int f1220s;

    /* renamed from: t, reason: collision with root package name */
    private int f1221t;

    /* renamed from: u, reason: collision with root package name */
    private Field f1222u;

    /* renamed from: v, reason: collision with root package name */
    private a f1223v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1224w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f1225x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1226y;

    /* renamed from: z, reason: collision with root package name */
    private r3 f1227z;

    /* compiled from: DropDownListView.java */
    /* loaded from: classes2.dex */
    private static class a extends androidx.appcompat.graphics.drawable.c {

        /* renamed from: p, reason: collision with root package name */
        private boolean f1228p;

        a(Drawable drawable) {
            super(drawable);
            this.f1228p = true;
        }

        void c(boolean z5) {
            this.f1228p = z5;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1228p) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspot(float f6, float f7) {
            if (this.f1228p) {
                super.setHotspot(f6, f7);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i5, int i6, int i7, int i8) {
            if (this.f1228p) {
                super.setHotspotBounds(i5, i6, i7, i8);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1228p) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z5, boolean z6) {
            if (this.f1228p) {
                return super.setVisible(z5, z6);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView.java */
    private class b implements Runnable {
        b() {
        }

        public void a() {
            f0 f0Var = f0.this;
            f0Var.B = null;
            f0Var.removeCallbacks(this);
        }

        public void b() {
            f0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = f0.this;
            f0Var.B = null;
            f0Var.drawableStateChanged();
        }
    }

    f0(@androidx.annotation.o0 Context context, boolean z5) {
        super(context, null, a.c.f21609n1);
        this.f1216o = new Rect();
        this.f1217p = 0;
        this.f1218q = 0;
        this.f1219r = 0;
        this.f1220s = 0;
        this.f1225x = z5;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1222u = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
    }

    private void a() {
        this.f1226y = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1221t - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        r3 r3Var = this.f1227z;
        if (r3Var != null) {
            r3Var.d();
            this.f1227z = null;
        }
    }

    private void b(View view, int i5) {
        performItemClick(view, i5, getItemIdAtPosition(i5));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f1216o.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1216o);
        selector.draw(canvas);
    }

    private void g(int i5, View view) {
        Rect rect = this.f1216o;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1217p;
        rect.top -= this.f1218q;
        rect.right += this.f1219r;
        rect.bottom += this.f1220s;
        try {
            boolean z5 = this.f1222u.getBoolean(this);
            if (view.isEnabled() != z5) {
                this.f1222u.set(this, Boolean.valueOf(!z5));
                if (i5 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e6) {
            e6.printStackTrace();
        }
    }

    private void h(int i5, View view) {
        Drawable selector = getSelector();
        boolean z5 = (selector == null || i5 == -1) ? false : true;
        if (z5) {
            selector.setVisible(false, false);
        }
        g(i5, view);
        if (z5) {
            Rect rect = this.f1216o;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.d.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void i(int i5, View view, float f6, float f7) {
        h(i5, view);
        Drawable selector = getSelector();
        if (selector == null || i5 == -1) {
            return;
        }
        androidx.core.graphics.drawable.d.k(selector, f6, f7);
    }

    private void k(View view, int i5, float f6, float f7) {
        View childAt;
        this.f1226y = true;
        drawableHotspotChanged(f6, f7);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i6 = this.f1221t;
        if (i6 != -1 && (childAt = getChildAt(i6 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1221t = i5;
        view.drawableHotspotChanged(f6 - view.getLeft(), f7 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i5, view, f6, f7);
        l(false);
        refreshDrawableState();
    }

    private void l(boolean z5) {
        a aVar = this.f1223v;
        if (aVar != null) {
            aVar.c(z5);
        }
    }

    private boolean m() {
        return this.f1226y;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && this.f1226y && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i5, boolean z5) {
        int min;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z5) {
                    min = Math.max(0, i5);
                    while (min < count && !adapter.isEnabled(min)) {
                        min++;
                    }
                } else {
                    min = Math.min(i5, count - 1);
                    while (min >= 0 && !adapter.isEnabled(min)) {
                        min--;
                    }
                }
                if (min < 0 || min >= count) {
                    return -1;
                }
                return min;
            }
            if (i5 >= 0 && i5 < count) {
                return i5;
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
        if (this.B != null) {
            return;
        }
        super.drawableStateChanged();
        l(true);
        n();
    }

    public int e(int i5, int i6, int i7, int i8, int i9) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i10 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        View view = null;
        while (i11 < count) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i5, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i11 > 0) {
                i10 += dividerHeight;
            }
            i10 += view.getMeasuredHeight();
            if (i10 >= i8) {
                return (i9 < 0 || i11 <= i9 || i13 <= 0 || i10 == i8) ? i8 : i13;
            }
            if (i9 >= 0 && i11 >= i9) {
                i13 = i10;
            }
            i11++;
        }
        return i10;
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
            androidx.core.widget.n r9 = r7.A
            if (r9 != 0) goto L5a
            androidx.core.widget.n r9 = new androidx.core.widget.n
            r9.<init>(r7)
            r7.A = r9
        L5a:
            androidx.core.widget.n r9 = r7.A
            r9.o(r1)
            androidx.core.widget.n r9 = r7.A
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.n r8 = r7.A
            if (r8 == 0) goto L6c
            r8.o(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.f(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1225x || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1225x || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1225x || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1225x && this.f1224w) || super.isInTouchMode();
    }

    void j(boolean z5) {
        this.f1224w = z5;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.B = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@androidx.annotation.o0 MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.B == null) {
            b bVar = new b();
            this.B = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                n();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1221t = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.B;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1223v = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1217p = rect.left;
        this.f1218q = rect.top;
        this.f1219r = rect.right;
        this.f1220s = rect.bottom;
    }
}
