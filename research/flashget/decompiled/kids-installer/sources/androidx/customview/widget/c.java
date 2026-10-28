package androidx.customview.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.core.view.y1;
import java.util.Arrays;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public class c {
    public static final int A = 2;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 15;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    private static final int J = 20;
    private static final int K = 256;
    private static final int L = 600;

    /* renamed from: x, reason: collision with root package name */
    public static final int f5962x = -1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f5963y = 0;

    /* renamed from: z, reason: collision with root package name */
    public static final int f5964z = 1;

    /* renamed from: a, reason: collision with root package name */
    private int f5965a;

    /* renamed from: b, reason: collision with root package name */
    private int f5966b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f5968d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f5969e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f5970f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f5971g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f5972h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f5973i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f5974j;

    /* renamed from: k, reason: collision with root package name */
    private int f5975k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f5976l;

    /* renamed from: m, reason: collision with root package name */
    private float f5977m;

    /* renamed from: n, reason: collision with root package name */
    private float f5978n;

    /* renamed from: o, reason: collision with root package name */
    private int f5979o;

    /* renamed from: p, reason: collision with root package name */
    private int f5980p;

    /* renamed from: q, reason: collision with root package name */
    private OverScroller f5981q;

    /* renamed from: r, reason: collision with root package name */
    private final AbstractC0065c f5982r;

    /* renamed from: s, reason: collision with root package name */
    private View f5983s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f5984t;

    /* renamed from: u, reason: collision with root package name */
    private final ViewGroup f5985u;

    /* renamed from: w, reason: collision with root package name */
    private static final String f5961w = "ViewDragHelper";
    private static final Interpolator M = new a();

    /* renamed from: c, reason: collision with root package name */
    private int f5967c = -1;

    /* renamed from: v, reason: collision with root package name */
    private final Runnable f5986v = new b();

    /* compiled from: ViewDragHelper.java */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            float f7 = f6 - 1.0f;
            return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.Q(0);
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: androidx.customview.widget.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0065c {
        public int a(@o0 View view, int i5, int i6) {
            return 0;
        }

        public int b(@o0 View view, int i5, int i6) {
            return 0;
        }

        public int c(int i5) {
            return i5;
        }

        public int d(@o0 View view) {
            return 0;
        }

        public int e(@o0 View view) {
            return 0;
        }

        public void f(int i5, int i6) {
        }

        public boolean g(int i5) {
            return false;
        }

        public void h(int i5, int i6) {
        }

        public void i(@o0 View view, int i5) {
        }

        public void j(int i5) {
        }

        public void k(@o0 View view, int i5, int i6, @u0 int i7, @u0 int i8) {
        }

        public void l(@o0 View view, float f6, float f7) {
        }

        public abstract boolean m(@o0 View view, int i5);
    }

    private c(@o0 Context context, @o0 ViewGroup viewGroup, @o0 AbstractC0065c abstractC0065c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0065c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f5985u = viewGroup;
        this.f5982r = abstractC0065c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5979o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f5966b = viewConfiguration.getScaledTouchSlop();
        this.f5977m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5978n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5981q = new OverScroller(context, M);
    }

    private int B(int i5, int i6) {
        int i7 = i5 < this.f5985u.getLeft() + this.f5979o ? 1 : 0;
        if (i6 < this.f5985u.getTop() + this.f5979o) {
            i7 |= 4;
        }
        if (i5 > this.f5985u.getRight() - this.f5979o) {
            i7 |= 2;
        }
        return i6 > this.f5985u.getBottom() - this.f5979o ? i7 | 8 : i7;
    }

    private boolean J(int i5) {
        return I(i5);
    }

    private void M() {
        this.f5976l.computeCurrentVelocity(1000, this.f5977m);
        r(i(this.f5976l.getXVelocity(this.f5967c), this.f5978n, this.f5977m), i(this.f5976l.getYVelocity(this.f5967c), this.f5978n, this.f5977m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.c$c] */
    private void N(float f6, float f7, int i5) {
        boolean e6 = e(f6, f7, i5, 1);
        boolean z5 = e6;
        if (e(f7, f6, i5, 4)) {
            z5 = (e6 ? 1 : 0) | 4;
        }
        boolean z6 = z5;
        if (e(f6, f7, i5, 2)) {
            z6 = (z5 ? 1 : 0) | 2;
        }
        ?? r02 = z6;
        if (e(f7, f6, i5, 8)) {
            r02 = (z6 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f5973i;
            iArr[i5] = iArr[i5] | r02;
            this.f5982r.f(r02, i5);
        }
    }

    private void O(float f6, float f7, int i5) {
        u(i5);
        float[] fArr = this.f5968d;
        this.f5970f[i5] = f6;
        fArr[i5] = f6;
        float[] fArr2 = this.f5969e;
        this.f5971g[i5] = f7;
        fArr2[i5] = f7;
        this.f5972h[i5] = B((int) f6, (int) f7);
        this.f5975k |= 1 << i5;
    }

    private void P(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i5 = 0; i5 < pointerCount; i5++) {
            int pointerId = motionEvent.getPointerId(i5);
            if (J(pointerId)) {
                float x5 = motionEvent.getX(i5);
                float y5 = motionEvent.getY(i5);
                this.f5970f[pointerId] = x5;
                this.f5971g[pointerId] = y5;
            }
        }
    }

    private boolean e(float f6, float f7, int i5, int i6) {
        float abs = Math.abs(f6);
        float abs2 = Math.abs(f7);
        if ((this.f5972h[i5] & i6) != i6 || (this.f5980p & i6) == 0 || (this.f5974j[i5] & i6) == i6 || (this.f5973i[i5] & i6) == i6) {
            return false;
        }
        int i7 = this.f5966b;
        if (abs <= i7 && abs2 <= i7) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f5982r.g(i6)) {
            return (this.f5973i[i5] & i6) == 0 && abs > ((float) this.f5966b);
        }
        int[] iArr = this.f5974j;
        iArr[i5] = iArr[i5] | i6;
        return false;
    }

    private boolean h(View view, float f6, float f7) {
        if (view == null) {
            return false;
        }
        boolean z5 = this.f5982r.d(view) > 0;
        boolean z6 = this.f5982r.e(view) > 0;
        if (!z5 || !z6) {
            return z5 ? Math.abs(f6) > ((float) this.f5966b) : z6 && Math.abs(f7) > ((float) this.f5966b);
        }
        float f8 = (f7 * f7) + (f6 * f6);
        int i5 = this.f5966b;
        return f8 > ((float) (i5 * i5));
    }

    private float i(float f6, float f7, float f8) {
        float abs = Math.abs(f6);
        if (abs < f7) {
            return 0.0f;
        }
        return abs > f8 ? f6 > 0.0f ? f8 : -f8 : f6;
    }

    private int j(int i5, int i6, int i7) {
        int abs = Math.abs(i5);
        if (abs < i6) {
            return 0;
        }
        return abs > i7 ? i5 > 0 ? i7 : -i7 : i5;
    }

    private void k() {
        float[] fArr = this.f5968d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f5969e, 0.0f);
        Arrays.fill(this.f5970f, 0.0f);
        Arrays.fill(this.f5971g, 0.0f);
        Arrays.fill(this.f5972h, 0);
        Arrays.fill(this.f5973i, 0);
        Arrays.fill(this.f5974j, 0);
        this.f5975k = 0;
    }

    private void l(int i5) {
        if (this.f5968d == null || !I(i5)) {
            return;
        }
        this.f5968d[i5] = 0.0f;
        this.f5969e[i5] = 0.0f;
        this.f5970f[i5] = 0.0f;
        this.f5971g[i5] = 0.0f;
        this.f5972h[i5] = 0;
        this.f5973i[i5] = 0;
        this.f5974j[i5] = 0;
        this.f5975k = (~(1 << i5)) & this.f5975k;
    }

    private int m(int i5, int i6, int i7) {
        if (i5 == 0) {
            return 0;
        }
        int width = this.f5985u.getWidth();
        float f6 = width / 2;
        float s5 = (s(Math.min(1.0f, Math.abs(i5) / width)) * f6) + f6;
        int abs = Math.abs(i6);
        return Math.min(abs > 0 ? Math.round(Math.abs(s5 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / i7) + 1.0f) * 256.0f), L);
    }

    private int n(View view, int i5, int i6, int i7, int i8) {
        float f6;
        float f7;
        float f8;
        float f9;
        int j5 = j(i7, (int) this.f5978n, (int) this.f5977m);
        int j6 = j(i8, (int) this.f5978n, (int) this.f5977m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(j5);
        int abs4 = Math.abs(j6);
        int i9 = abs3 + abs4;
        int i10 = abs + abs2;
        if (j5 != 0) {
            f6 = abs3;
            f7 = i9;
        } else {
            f6 = abs;
            f7 = i10;
        }
        float f10 = f6 / f7;
        if (j6 != 0) {
            f8 = abs4;
            f9 = i9;
        } else {
            f8 = abs2;
            f9 = i10;
        }
        return (int) ((m(i6, j6, this.f5982r.e(view)) * (f8 / f9)) + (m(i5, j5, this.f5982r.d(view)) * f10));
    }

    public static c p(@o0 ViewGroup viewGroup, float f6, @o0 AbstractC0065c abstractC0065c) {
        c q5 = q(viewGroup, abstractC0065c);
        q5.f5966b = (int) ((1.0f / f6) * q5.f5966b);
        return q5;
    }

    public static c q(@o0 ViewGroup viewGroup, @o0 AbstractC0065c abstractC0065c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0065c);
    }

    private void r(float f6, float f7) {
        this.f5984t = true;
        this.f5982r.l(this.f5983s, f6, f7);
        this.f5984t = false;
        if (this.f5965a == 1) {
            Q(0);
        }
    }

    private float s(float f6) {
        return (float) Math.sin((f6 - 0.5f) * 0.47123894f);
    }

    private void t(int i5, int i6, int i7, int i8) {
        int left = this.f5983s.getLeft();
        int top = this.f5983s.getTop();
        if (i7 != 0) {
            i5 = this.f5982r.a(this.f5983s, i5, i7);
            y1.e1(this.f5983s, i5 - left);
        }
        int i9 = i5;
        if (i8 != 0) {
            i6 = this.f5982r.b(this.f5983s, i6, i8);
            y1.f1(this.f5983s, i6 - top);
        }
        int i10 = i6;
        if (i7 == 0 && i8 == 0) {
            return;
        }
        this.f5982r.k(this.f5983s, i9, i10, i9 - left, i10 - top);
    }

    private void u(int i5) {
        float[] fArr = this.f5968d;
        if (fArr == null || fArr.length <= i5) {
            int i6 = i5 + 1;
            float[] fArr2 = new float[i6];
            float[] fArr3 = new float[i6];
            float[] fArr4 = new float[i6];
            float[] fArr5 = new float[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f5969e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f5970f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f5971g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f5972h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f5973i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f5974j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f5968d = fArr2;
            this.f5969e = fArr3;
            this.f5970f = fArr4;
            this.f5971g = fArr5;
            this.f5972h = iArr;
            this.f5973i = iArr2;
            this.f5974j = iArr3;
        }
    }

    private boolean x(int i5, int i6, int i7, int i8) {
        int left = this.f5983s.getLeft();
        int top = this.f5983s.getTop();
        int i9 = i5 - left;
        int i10 = i6 - top;
        if (i9 == 0 && i10 == 0) {
            this.f5981q.abortAnimation();
            Q(0);
            return false;
        }
        this.f5981q.startScroll(left, top, i9, i10, n(this.f5983s, i9, i10, i7, i8));
        Q(2);
        return true;
    }

    @u0
    public int A() {
        return this.f5979o;
    }

    public float C() {
        return this.f5978n;
    }

    @u0
    public int D() {
        return this.f5966b;
    }

    public int E() {
        return this.f5965a;
    }

    public boolean F(int i5, int i6) {
        return K(this.f5983s, i5, i6);
    }

    public boolean G(int i5) {
        int length = this.f5972h.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (H(i5, i6)) {
                return true;
            }
        }
        return false;
    }

    public boolean H(int i5, int i6) {
        return I(i6) && (i5 & this.f5972h[i6]) != 0;
    }

    public boolean I(int i5) {
        return ((1 << i5) & this.f5975k) != 0;
    }

    public boolean K(@q0 View view, int i5, int i6) {
        return view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom();
    }

    public void L(@o0 MotionEvent motionEvent) {
        int i5;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.f5976l == null) {
            this.f5976l = VelocityTracker.obtain();
        }
        this.f5976l.addMovement(motionEvent);
        int i6 = 0;
        if (actionMasked == 0) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View v5 = v((int) x5, (int) y5);
            O(x5, y5, pointerId);
            W(v5, pointerId);
            int i7 = this.f5972h[pointerId];
            int i8 = this.f5980p;
            if ((i7 & i8) != 0) {
                this.f5982r.h(i7 & i8, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f5965a == 1) {
                M();
            }
            c();
            return;
        }
        if (actionMasked == 2) {
            if (this.f5965a == 1) {
                if (J(this.f5967c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5967c);
                    float x6 = motionEvent.getX(findPointerIndex);
                    float y6 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f5970f;
                    int i9 = this.f5967c;
                    int i10 = (int) (x6 - fArr[i9]);
                    int i11 = (int) (y6 - this.f5971g[i9]);
                    t(this.f5983s.getLeft() + i10, this.f5983s.getTop() + i11, i10, i11);
                    P(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i6 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i6);
                if (J(pointerId2)) {
                    float x7 = motionEvent.getX(i6);
                    float y7 = motionEvent.getY(i6);
                    float f6 = x7 - this.f5968d[pointerId2];
                    float f7 = y7 - this.f5969e[pointerId2];
                    N(f6, f7, pointerId2);
                    if (this.f5965a != 1) {
                        View v6 = v((int) x7, (int) y7);
                        if (h(v6, f6, f7) && W(v6, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i6++;
            }
            P(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f5965a == 1) {
                r(0.0f, 0.0f);
            }
            c();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x8 = motionEvent.getX(actionIndex);
            float y8 = motionEvent.getY(actionIndex);
            O(x8, y8, pointerId3);
            if (this.f5965a != 0) {
                if (F((int) x8, (int) y8)) {
                    W(this.f5983s, pointerId3);
                    return;
                }
                return;
            } else {
                W(v((int) x8, (int) y8), pointerId3);
                int i12 = this.f5972h[pointerId3];
                int i13 = this.f5980p;
                if ((i12 & i13) != 0) {
                    this.f5982r.h(i12 & i13, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f5965a == 1 && pointerId4 == this.f5967c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i6 >= pointerCount2) {
                    i5 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i6);
                if (pointerId5 != this.f5967c) {
                    View v7 = v((int) motionEvent.getX(i6), (int) motionEvent.getY(i6));
                    View view = this.f5983s;
                    if (v7 == view && W(view, pointerId5)) {
                        i5 = this.f5967c;
                        break;
                    }
                }
                i6++;
            }
            if (i5 == -1) {
                M();
            }
        }
        l(pointerId4);
    }

    void Q(int i5) {
        this.f5985u.removeCallbacks(this.f5986v);
        if (this.f5965a != i5) {
            this.f5965a = i5;
            this.f5982r.j(i5);
            if (this.f5965a == 0) {
                this.f5983s = null;
            }
        }
    }

    public void R(int i5) {
        this.f5980p = i5;
    }

    public void S(float f6) {
        this.f5978n = f6;
    }

    public boolean T(int i5, int i6) {
        if (this.f5984t) {
            return x(i5, i6, (int) this.f5976l.getXVelocity(this.f5967c), (int) this.f5976l.getYVelocity(this.f5967c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dd, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(@androidx.annotation.o0 android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.c.U(android.view.MotionEvent):boolean");
    }

    public boolean V(@o0 View view, int i5, int i6) {
        this.f5983s = view;
        this.f5967c = -1;
        boolean x5 = x(i5, i6, 0, 0);
        if (!x5 && this.f5965a == 0 && this.f5983s != null) {
            this.f5983s = null;
        }
        return x5;
    }

    boolean W(View view, int i5) {
        if (view == this.f5983s && this.f5967c == i5) {
            return true;
        }
        if (view == null || !this.f5982r.m(view, i5)) {
            return false;
        }
        this.f5967c = i5;
        d(view, i5);
        return true;
    }

    public void a() {
        c();
        if (this.f5965a == 2) {
            int currX = this.f5981q.getCurrX();
            int currY = this.f5981q.getCurrY();
            this.f5981q.abortAnimation();
            int currX2 = this.f5981q.getCurrX();
            int currY2 = this.f5981q.getCurrY();
            this.f5982r.k(this.f5983s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        Q(0);
    }

    protected boolean b(@o0 View view, boolean z5, int i5, int i6, int i7, int i8) {
        int i9;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i10 = i7 + scrollX;
                if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && (i9 = i8 + scrollY) >= childAt.getTop() && i9 < childAt.getBottom() && b(childAt, true, i5, i6, i10 - childAt.getLeft(), i9 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z5 && (view.canScrollHorizontally(-i5) || view.canScrollVertically(-i6));
    }

    public void c() {
        this.f5967c = -1;
        k();
        VelocityTracker velocityTracker = this.f5976l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5976l = null;
        }
    }

    public void d(@o0 View view, int i5) {
        if (view.getParent() != this.f5985u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f5985u + ")");
        }
        this.f5983s = view;
        this.f5967c = i5;
        this.f5982r.i(view, i5);
        Q(1);
    }

    public boolean f(int i5) {
        int length = this.f5968d.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (g(i5, i6)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i5, int i6) {
        if (!I(i6)) {
            return false;
        }
        boolean z5 = (i5 & 1) == 1;
        boolean z6 = (i5 & 2) == 2;
        float f6 = this.f5970f[i6] - this.f5968d[i6];
        float f7 = this.f5971g[i6] - this.f5969e[i6];
        if (!z5 || !z6) {
            return z5 ? Math.abs(f6) > ((float) this.f5966b) : z6 && Math.abs(f7) > ((float) this.f5966b);
        }
        float f8 = (f7 * f7) + (f6 * f6);
        int i7 = this.f5966b;
        return f8 > ((float) (i7 * i7));
    }

    public boolean o(boolean z5) {
        if (this.f5965a == 2) {
            boolean computeScrollOffset = this.f5981q.computeScrollOffset();
            int currX = this.f5981q.getCurrX();
            int currY = this.f5981q.getCurrY();
            int left = currX - this.f5983s.getLeft();
            int top = currY - this.f5983s.getTop();
            if (left != 0) {
                y1.e1(this.f5983s, left);
            }
            if (top != 0) {
                y1.f1(this.f5983s, top);
            }
            if (left != 0 || top != 0) {
                this.f5982r.k(this.f5983s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f5981q.getFinalX() && currY == this.f5981q.getFinalY()) {
                this.f5981q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z5) {
                    this.f5985u.post(this.f5986v);
                } else {
                    Q(0);
                }
            }
        }
        return this.f5965a == 2;
    }

    @q0
    public View v(int i5, int i6) {
        for (int childCount = this.f5985u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f5985u.getChildAt(this.f5982r.c(childCount));
            if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && i6 >= childAt.getTop() && i6 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void w(int i5, int i6, int i7, int i8) {
        if (!this.f5984t) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f5981q.fling(this.f5983s.getLeft(), this.f5983s.getTop(), (int) this.f5976l.getXVelocity(this.f5967c), (int) this.f5976l.getYVelocity(this.f5967c), i5, i7, i6, i8);
        Q(2);
    }

    public int y() {
        return this.f5967c;
    }

    @q0
    public View z() {
        return this.f5983s;
    }
}
