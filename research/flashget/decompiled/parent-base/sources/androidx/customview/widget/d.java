package androidx.customview.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import androidx.core.view.x1;
import java.util.Arrays;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes3.dex */
public class d {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 4;
    public static final int F = 8;
    public static final int G = 15;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    private static final int K = 20;
    private static final int L = 256;
    private static final int M = 600;

    /* renamed from: y, reason: collision with root package name */
    public static final int f28355y = -1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f28356z = 0;

    /* renamed from: a, reason: collision with root package name */
    private int f28357a;

    /* renamed from: b, reason: collision with root package name */
    private int f28358b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f28360d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f28361e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f28362f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f28363g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f28364h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f28365i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f28366j;

    /* renamed from: k, reason: collision with root package name */
    private int f28367k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f28368l;

    /* renamed from: m, reason: collision with root package name */
    private float f28369m;

    /* renamed from: n, reason: collision with root package name */
    private float f28370n;

    /* renamed from: o, reason: collision with root package name */
    private int f28371o;

    /* renamed from: p, reason: collision with root package name */
    private final int f28372p;

    /* renamed from: q, reason: collision with root package name */
    private int f28373q;

    /* renamed from: r, reason: collision with root package name */
    private OverScroller f28374r;

    /* renamed from: s, reason: collision with root package name */
    private final c f28375s;

    /* renamed from: t, reason: collision with root package name */
    private View f28376t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f28377u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f28378v;

    /* renamed from: x, reason: collision with root package name */
    private static final String f28354x = "ViewDragHelper";
    private static final Interpolator N = new a();

    /* renamed from: c, reason: collision with root package name */
    private int f28359c = -1;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f28379w = new b();

    /* compiled from: ViewDragHelper.java */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.R(0);
        }
    }

    /* compiled from: ViewDragHelper.java */
    public static abstract class c {
        public int a(@o0 View view, int i4, int i5) {
            return 0;
        }

        public int b(@o0 View view, int i4, int i5) {
            return 0;
        }

        public int c(int i4) {
            return i4;
        }

        public int d(@o0 View view) {
            return 0;
        }

        public int e(@o0 View view) {
            return 0;
        }

        public void f(int i4, int i5) {
        }

        public boolean g(int i4) {
            return false;
        }

        public void h(int i4, int i5) {
        }

        public void i(@o0 View view, int i4) {
        }

        public void j(int i4) {
        }

        public void k(@o0 View view, int i4, int i5, @u0 int i6, @u0 int i7) {
        }

        public void l(@o0 View view, float f4, float f5) {
        }

        public abstract boolean m(@o0 View view, int i4);
    }

    private d(@o0 Context context, @o0 ViewGroup viewGroup, @o0 c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f28378v = viewGroup;
        this.f28375s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i4 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f28372p = i4;
        this.f28371o = i4;
        this.f28358b = viewConfiguration.getScaledTouchSlop();
        this.f28369m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f28370n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f28374r = new OverScroller(context, N);
    }

    private int C(int i4, int i5) {
        int i6 = i4 < this.f28378v.getLeft() + this.f28371o ? 1 : 0;
        if (i5 < this.f28378v.getTop() + this.f28371o) {
            i6 |= 4;
        }
        if (i4 > this.f28378v.getRight() - this.f28371o) {
            i6 |= 2;
        }
        return i5 > this.f28378v.getBottom() - this.f28371o ? i6 | 8 : i6;
    }

    private boolean K(int i4) {
        return J(i4);
    }

    private void N() {
        this.f28368l.computeCurrentVelocity(1000, this.f28369m);
        r(i(this.f28368l.getXVelocity(this.f28359c), this.f28370n, this.f28369m), i(this.f28368l.getYVelocity(this.f28359c), this.f28370n, this.f28369m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.d$c] */
    private void O(float f4, float f5, int i4) {
        boolean e4 = e(f4, f5, i4, 1);
        boolean z4 = e4;
        if (e(f5, f4, i4, 4)) {
            z4 = (e4 ? 1 : 0) | 4;
        }
        boolean z5 = z4;
        if (e(f4, f5, i4, 2)) {
            z5 = (z4 ? 1 : 0) | 2;
        }
        ?? r02 = z5;
        if (e(f5, f4, i4, 8)) {
            r02 = (z5 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f28365i;
            iArr[i4] = iArr[i4] | r02;
            this.f28375s.f(r02, i4);
        }
    }

    private void P(float f4, float f5, int i4) {
        u(i4);
        float[] fArr = this.f28360d;
        this.f28362f[i4] = f4;
        fArr[i4] = f4;
        float[] fArr2 = this.f28361e;
        this.f28363g[i4] = f5;
        fArr2[i4] = f5;
        this.f28364h[i4] = C((int) f4, (int) f5);
        this.f28367k |= 1 << i4;
    }

    private void Q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if (K(pointerId)) {
                float x4 = motionEvent.getX(i4);
                float y4 = motionEvent.getY(i4);
                this.f28362f[pointerId] = x4;
                this.f28363g[pointerId] = y4;
            }
        }
    }

    private boolean e(float f4, float f5, int i4, int i5) {
        float abs = Math.abs(f4);
        float abs2 = Math.abs(f5);
        if ((this.f28364h[i4] & i5) != i5 || (this.f28373q & i5) == 0 || (this.f28366j[i4] & i5) == i5 || (this.f28365i[i4] & i5) == i5) {
            return false;
        }
        int i6 = this.f28358b;
        if (abs <= i6 && abs2 <= i6) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f28375s.g(i5)) {
            return (this.f28365i[i4] & i5) == 0 && abs > ((float) this.f28358b);
        }
        int[] iArr = this.f28366j;
        iArr[i4] = iArr[i4] | i5;
        return false;
    }

    private boolean h(View view, float f4, float f5) {
        if (view == null) {
            return false;
        }
        boolean z4 = this.f28375s.d(view) > 0;
        boolean z5 = this.f28375s.e(view) > 0;
        if (!z4 || !z5) {
            return z4 ? Math.abs(f4) > ((float) this.f28358b) : z5 && Math.abs(f5) > ((float) this.f28358b);
        }
        float f6 = (f5 * f5) + (f4 * f4);
        int i4 = this.f28358b;
        return f6 > ((float) (i4 * i4));
    }

    private float i(float f4, float f5, float f6) {
        float abs = Math.abs(f4);
        if (abs < f5) {
            return 0.0f;
        }
        return abs > f6 ? f4 > 0.0f ? f6 : -f6 : f4;
    }

    private int j(int i4, int i5, int i6) {
        int abs = Math.abs(i4);
        if (abs < i5) {
            return 0;
        }
        return abs > i6 ? i4 > 0 ? i6 : -i6 : i4;
    }

    private void k() {
        float[] fArr = this.f28360d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f28361e, 0.0f);
        Arrays.fill(this.f28362f, 0.0f);
        Arrays.fill(this.f28363g, 0.0f);
        Arrays.fill(this.f28364h, 0);
        Arrays.fill(this.f28365i, 0);
        Arrays.fill(this.f28366j, 0);
        this.f28367k = 0;
    }

    private void l(int i4) {
        if (this.f28360d == null || !J(i4)) {
            return;
        }
        this.f28360d[i4] = 0.0f;
        this.f28361e[i4] = 0.0f;
        this.f28362f[i4] = 0.0f;
        this.f28363g[i4] = 0.0f;
        this.f28364h[i4] = 0;
        this.f28365i[i4] = 0;
        this.f28366j[i4] = 0;
        this.f28367k = (~(1 << i4)) & this.f28367k;
    }

    private int m(int i4, int i5, int i6) {
        if (i4 == 0) {
            return 0;
        }
        int width = this.f28378v.getWidth();
        float f4 = width / 2;
        float s4 = (s(Math.min(1.0f, Math.abs(i4) / width)) * f4) + f4;
        int abs = Math.abs(i5);
        return Math.min(abs > 0 ? Math.round(Math.abs(s4 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i4) / i6) + 1.0f) * 256.0f), 600);
    }

    private int n(View view, int i4, int i5, int i6, int i7) {
        float f4;
        float f5;
        float f6;
        float f7;
        int j4 = j(i6, (int) this.f28370n, (int) this.f28369m);
        int j5 = j(i7, (int) this.f28370n, (int) this.f28369m);
        int abs = Math.abs(i4);
        int abs2 = Math.abs(i5);
        int abs3 = Math.abs(j4);
        int abs4 = Math.abs(j5);
        int i10 = abs3 + abs4;
        int i11 = abs + abs2;
        if (j4 != 0) {
            f4 = abs3;
            f5 = i10;
        } else {
            f4 = abs;
            f5 = i11;
        }
        float f10 = f4 / f5;
        if (j5 != 0) {
            f6 = abs4;
            f7 = i10;
        } else {
            f6 = abs2;
            f7 = i11;
        }
        return (int) ((m(i5, j5, this.f28375s.e(view)) * (f6 / f7)) + (m(i4, j4, this.f28375s.d(view)) * f10));
    }

    public static d p(@o0 ViewGroup viewGroup, float f4, @o0 c cVar) {
        d q4 = q(viewGroup, cVar);
        q4.f28358b = (int) ((1.0f / f4) * q4.f28358b);
        return q4;
    }

    public static d q(@o0 ViewGroup viewGroup, @o0 c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    private void r(float f4, float f5) {
        this.f28377u = true;
        this.f28375s.l(this.f28376t, f4, f5);
        this.f28377u = false;
        if (this.f28357a == 1) {
            R(0);
        }
    }

    private float s(float f4) {
        return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
    }

    private void t(int i4, int i5, int i6, int i7) {
        int left = this.f28376t.getLeft();
        int top2 = this.f28376t.getTop();
        if (i6 != 0) {
            i4 = this.f28375s.a(this.f28376t, i4, i6);
            x1.i1(this.f28376t, i4 - left);
        }
        int i10 = i4;
        if (i7 != 0) {
            i5 = this.f28375s.b(this.f28376t, i5, i7);
            x1.j1(this.f28376t, i5 - top2);
        }
        int i11 = i5;
        if (i6 == 0 && i7 == 0) {
            return;
        }
        this.f28375s.k(this.f28376t, i10, i11, i10 - left, i11 - top2);
    }

    private void u(int i4) {
        float[] fArr = this.f28360d;
        if (fArr == null || fArr.length <= i4) {
            int i5 = i4 + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f28361e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f28362f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f28363g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f28364h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f28365i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f28366j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f28360d = fArr2;
            this.f28361e = fArr3;
            this.f28362f = fArr4;
            this.f28363g = fArr5;
            this.f28364h = iArr;
            this.f28365i = iArr2;
            this.f28366j = iArr3;
        }
    }

    private boolean x(int i4, int i5, int i6, int i7) {
        int left = this.f28376t.getLeft();
        int top2 = this.f28376t.getTop();
        int i10 = i4 - left;
        int i11 = i5 - top2;
        if (i10 == 0 && i11 == 0) {
            this.f28374r.abortAnimation();
            R(0);
            return false;
        }
        this.f28374r.startScroll(left, top2, i10, i11, n(this.f28376t, i10, i11, i6, i7));
        R(2);
        return true;
    }

    @u0
    public int A() {
        return this.f28372p;
    }

    @u0
    public int B() {
        return this.f28371o;
    }

    public float D() {
        return this.f28370n;
    }

    @u0
    public int E() {
        return this.f28358b;
    }

    public int F() {
        return this.f28357a;
    }

    public boolean G(int i4, int i5) {
        return L(this.f28376t, i4, i5);
    }

    public boolean H(int i4) {
        int length = this.f28364h.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (I(i4, i5)) {
                return true;
            }
        }
        return false;
    }

    public boolean I(int i4, int i5) {
        return J(i5) && (i4 & this.f28364h[i5]) != 0;
    }

    public boolean J(int i4) {
        return ((1 << i4) & this.f28367k) != 0;
    }

    public boolean L(@q0 View view, int i4, int i5) {
        return view != null && i4 >= view.getLeft() && i4 < view.getRight() && i5 >= view.getTop() && i5 < view.getBottom();
    }

    public void M(@o0 MotionEvent motionEvent) {
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.f28368l == null) {
            this.f28368l = VelocityTracker.obtain();
        }
        this.f28368l.addMovement(motionEvent);
        int i5 = 0;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View v4 = v((int) x4, (int) y4);
            P(x4, y4, pointerId);
            Y(v4, pointerId);
            int i6 = this.f28364h[pointerId];
            int i7 = this.f28373q;
            if ((i6 & i7) != 0) {
                this.f28375s.h(i6 & i7, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f28357a == 1) {
                N();
            }
            c();
            return;
        }
        if (actionMasked == 2) {
            if (this.f28357a == 1) {
                if (K(this.f28359c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f28359c);
                    float x5 = motionEvent.getX(findPointerIndex);
                    float y5 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f28362f;
                    int i10 = this.f28359c;
                    int i11 = (int) (x5 - fArr[i10]);
                    int i12 = (int) (y5 - this.f28363g[i10]);
                    t(this.f28376t.getLeft() + i11, this.f28376t.getTop() + i12, i11, i12);
                    Q(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i5 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i5);
                if (K(pointerId2)) {
                    float x6 = motionEvent.getX(i5);
                    float y6 = motionEvent.getY(i5);
                    float f4 = x6 - this.f28360d[pointerId2];
                    float f5 = y6 - this.f28361e[pointerId2];
                    O(f4, f5, pointerId2);
                    if (this.f28357a != 1) {
                        View v5 = v((int) x6, (int) y6);
                        if (h(v5, f4, f5) && Y(v5, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i5++;
            }
            Q(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f28357a == 1) {
                r(0.0f, 0.0f);
            }
            c();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x7 = motionEvent.getX(actionIndex);
            float y7 = motionEvent.getY(actionIndex);
            P(x7, y7, pointerId3);
            if (this.f28357a != 0) {
                if (G((int) x7, (int) y7)) {
                    Y(this.f28376t, pointerId3);
                    return;
                }
                return;
            } else {
                Y(v((int) x7, (int) y7), pointerId3);
                int i13 = this.f28364h[pointerId3];
                int i14 = this.f28373q;
                if ((i13 & i14) != 0) {
                    this.f28375s.h(i13 & i14, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f28357a == 1 && pointerId4 == this.f28359c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i5 >= pointerCount2) {
                    i4 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i5);
                if (pointerId5 != this.f28359c) {
                    View v6 = v((int) motionEvent.getX(i5), (int) motionEvent.getY(i5));
                    View view = this.f28376t;
                    if (v6 == view && Y(view, pointerId5)) {
                        i4 = this.f28359c;
                        break;
                    }
                }
                i5++;
            }
            if (i4 == -1) {
                N();
            }
        }
        l(pointerId4);
    }

    void R(int i4) {
        this.f28378v.removeCallbacks(this.f28379w);
        if (this.f28357a != i4) {
            this.f28357a = i4;
            this.f28375s.j(i4);
            if (this.f28357a == 0) {
                this.f28376t = null;
            }
        }
    }

    public void S(@u0 @g0(from = 0) int i4) {
        this.f28371o = i4;
    }

    public void T(int i4) {
        this.f28373q = i4;
    }

    public void U(float f4) {
        this.f28370n = f4;
    }

    public boolean V(int i4, int i5) {
        if (this.f28377u) {
            return x(i4, i5, (int) this.f28368l.getXVelocity(this.f28359c), (int) this.f28368l.getYVelocity(this.f28359c));
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
    public boolean W(@androidx.annotation.o0 android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.d.W(android.view.MotionEvent):boolean");
    }

    public boolean X(@o0 View view, int i4, int i5) {
        this.f28376t = view;
        this.f28359c = -1;
        boolean x4 = x(i4, i5, 0, 0);
        if (!x4 && this.f28357a == 0 && this.f28376t != null) {
            this.f28376t = null;
        }
        return x4;
    }

    boolean Y(View view, int i4) {
        if (view == this.f28376t && this.f28359c == i4) {
            return true;
        }
        if (view == null || !this.f28375s.m(view, i4)) {
            return false;
        }
        this.f28359c = i4;
        d(view, i4);
        return true;
    }

    public void a() {
        c();
        if (this.f28357a == 2) {
            int currX = this.f28374r.getCurrX();
            int currY = this.f28374r.getCurrY();
            this.f28374r.abortAnimation();
            int currX2 = this.f28374r.getCurrX();
            int currY2 = this.f28374r.getCurrY();
            this.f28375s.k(this.f28376t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        R(0);
    }

    protected boolean b(@o0 View view, boolean z4, int i4, int i5, int i6, int i7) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i11 = i6 + scrollX;
                if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && (i10 = i7 + scrollY) >= childAt.getTop() && i10 < childAt.getBottom() && b(childAt, true, i4, i5, i11 - childAt.getLeft(), i10 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z4 && (view.canScrollHorizontally(-i4) || view.canScrollVertically(-i5));
    }

    public void c() {
        this.f28359c = -1;
        k();
        VelocityTracker velocityTracker = this.f28368l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f28368l = null;
        }
    }

    public void d(@o0 View view, int i4) {
        if (view.getParent() != this.f28378v) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f28378v + ")");
        }
        this.f28376t = view;
        this.f28359c = i4;
        this.f28375s.i(view, i4);
        R(1);
    }

    public boolean f(int i4) {
        int length = this.f28360d.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (g(i4, i5)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i4, int i5) {
        if (!J(i5)) {
            return false;
        }
        boolean z4 = (i4 & 1) == 1;
        boolean z5 = (i4 & 2) == 2;
        float f4 = this.f28362f[i5] - this.f28360d[i5];
        float f5 = this.f28363g[i5] - this.f28361e[i5];
        if (!z4 || !z5) {
            return z4 ? Math.abs(f4) > ((float) this.f28358b) : z5 && Math.abs(f5) > ((float) this.f28358b);
        }
        float f6 = (f5 * f5) + (f4 * f4);
        int i6 = this.f28358b;
        return f6 > ((float) (i6 * i6));
    }

    public boolean o(boolean z4) {
        if (this.f28357a == 2) {
            boolean computeScrollOffset = this.f28374r.computeScrollOffset();
            int currX = this.f28374r.getCurrX();
            int currY = this.f28374r.getCurrY();
            int left = currX - this.f28376t.getLeft();
            int top2 = currY - this.f28376t.getTop();
            if (left != 0) {
                x1.i1(this.f28376t, left);
            }
            if (top2 != 0) {
                x1.j1(this.f28376t, top2);
            }
            if (left != 0 || top2 != 0) {
                this.f28375s.k(this.f28376t, currX, currY, left, top2);
            }
            if (computeScrollOffset && currX == this.f28374r.getFinalX() && currY == this.f28374r.getFinalY()) {
                this.f28374r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z4) {
                    this.f28378v.post(this.f28379w);
                } else {
                    R(0);
                }
            }
        }
        return this.f28357a == 2;
    }

    @q0
    public View v(int i4, int i5) {
        for (int childCount = this.f28378v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f28378v.getChildAt(this.f28375s.c(childCount));
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void w(int i4, int i5, int i6, int i7) {
        if (!this.f28377u) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f28374r.fling(this.f28376t.getLeft(), this.f28376t.getTop(), (int) this.f28368l.getXVelocity(this.f28359c), (int) this.f28368l.getYVelocity(this.f28359c), i4, i6, i5, i7);
        R(2);
    }

    public int y() {
        return this.f28359c;
    }

    @q0
    public View z() {
        return this.f28376t;
    }
}
