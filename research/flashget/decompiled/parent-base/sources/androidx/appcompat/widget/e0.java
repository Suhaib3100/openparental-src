package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.c1;

/* compiled from: ForwardingListener.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class e0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    private final float f1821b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1822c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1823d;

    /* renamed from: e, reason: collision with root package name */
    final View f1824e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f1825f;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f1826g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1827h;

    /* renamed from: i, reason: collision with root package name */
    private int f1828i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f1829j = new int[2];

    /* compiled from: ForwardingListener.java */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = e0.this.f1824e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.e();
        }
    }

    public e0(View view) {
        this.f1824e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1821b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1822c = tapTimeout;
        this.f1823d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    private void a() {
        Runnable runnable = this.f1826g;
        if (runnable != null) {
            this.f1824e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1825f;
        if (runnable2 != null) {
            this.f1824e.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        b0 b0Var;
        View view = this.f1824e;
        androidx.appcompat.view.menu.r b5 = b();
        if (b5 == null || !b5.c() || (b0Var = (b0) b5.q()) == null || !b0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(b0Var, obtainNoHistory);
        boolean f4 = b0Var.f(obtainNoHistory, this.f1828i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return f4 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1824e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1828i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1821b
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1828i = r6
            java.lang.Runnable r6 = r5.f1825f
            if (r6 != 0) goto L52
            androidx.appcompat.widget.e0$a r6 = new androidx.appcompat.widget.e0$a
            r6.<init>()
            r5.f1825f = r6
        L52:
            java.lang.Runnable r6 = r5.f1825f
            int r1 = r5.f1822c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1826g
            if (r6 != 0) goto L65
            androidx.appcompat.widget.e0$b r6 = new androidx.appcompat.widget.e0$b
            r6.<init>()
            r5.f1826g = r6
        L65:
            java.lang.Runnable r6 = r5.f1826g
            int r1 = r5.f1823d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f4, float f5, float f6) {
        float f7 = -f6;
        return f4 >= f7 && f5 >= f7 && f4 < ((float) (view.getRight() - view.getLeft())) + f6 && f5 < ((float) (view.getBottom() - view.getTop())) + f6;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1829j);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1829j);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.r b();

    protected boolean c() {
        androidx.appcompat.view.menu.r b5 = b();
        if (b5 == null || b5.c()) {
            return true;
        }
        b5.b();
        return true;
    }

    protected boolean d() {
        androidx.appcompat.view.menu.r b5 = b();
        if (b5 == null || !b5.c()) {
            return true;
        }
        b5.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f1824e;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1827h = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z4;
        boolean z5 = this.f1827h;
        if (z5) {
            z4 = f(motionEvent) || !d();
        } else {
            z4 = g(motionEvent) && c();
            if (z4) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1824e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1827h = z4;
        return z4 || z5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1827h = false;
        this.f1828i = -1;
        Runnable runnable = this.f1825f;
        if (runnable != null) {
            this.f1824e.removeCallbacks(runnable);
        }
    }
}
