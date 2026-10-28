package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.x0;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.t;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.g;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Carousel extends MotionHelper {
    private static final boolean I = false;
    private static final String J = "Carousel";
    public static final int K = 1;
    public static final int L = 2;
    private int A;
    private int B;
    private int C;
    private float D;
    private int E;
    private int F;
    int G;
    Runnable H;

    /* renamed from: o, reason: collision with root package name */
    private b f23063o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList<View> f23064p;

    /* renamed from: q, reason: collision with root package name */
    private int f23065q;

    /* renamed from: r, reason: collision with root package name */
    private int f23066r;

    /* renamed from: s, reason: collision with root package name */
    private MotionLayout f23067s;

    /* renamed from: t, reason: collision with root package name */
    private int f23068t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f23069u;

    /* renamed from: v, reason: collision with root package name */
    private int f23070v;

    /* renamed from: w, reason: collision with root package name */
    private int f23071w;

    /* renamed from: x, reason: collision with root package name */
    private int f23072x;

    /* renamed from: y, reason: collision with root package name */
    private int f23073y;

    /* renamed from: z, reason: collision with root package name */
    private float f23074z;

    class a implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a, reason: collision with other inner class name */
        class RunnableC0390a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f23076b;

            RunnableC0390a(final float val$v) {
                this.f23076b = val$v;
            }

            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.f23067s.S1(5, 1.0f, this.f23076b);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.f23067s.F1(0.0f);
            Carousel.this.j0();
            Carousel.this.f23063o.a(Carousel.this.f23066r);
            float h12 = Carousel.this.f23067s.h1();
            if (Carousel.this.C != 2 || h12 <= Carousel.this.D || Carousel.this.f23066r >= Carousel.this.f23063o.count() - 1) {
                return;
            }
            float f4 = h12 * Carousel.this.f23074z;
            if (Carousel.this.f23066r != 0 || Carousel.this.f23065q <= Carousel.this.f23066r) {
                if (Carousel.this.f23066r != Carousel.this.f23063o.count() - 1 || Carousel.this.f23065q >= Carousel.this.f23066r) {
                    Carousel.this.f23067s.post(new RunnableC0390a(f4));
                }
            }
        }
    }

    public interface b {
        void a(int index);

        void b(View view, int index);

        int count();
    }

    public Carousel(Context context) {
        super(context);
        this.f23063o = null;
        this.f23064p = new ArrayList<>();
        this.f23065q = 0;
        this.f23066r = 0;
        this.f23068t = -1;
        this.f23069u = false;
        this.f23070v = -1;
        this.f23071w = -1;
        this.f23072x = -1;
        this.f23073y = -1;
        this.f23074z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new a();
    }

    private void Z(boolean enable) {
        Iterator<t.b> it = this.f23067s.V0().iterator();
        while (it.hasNext()) {
            it.next().Q(enable);
        }
    }

    private boolean a0(int transitionID, boolean enable) {
        MotionLayout motionLayout;
        t.b e12;
        if (transitionID == -1 || (motionLayout = this.f23067s) == null || (e12 = motionLayout.e1(transitionID)) == null || enable == e12.K()) {
            return false;
        }
        e12.Q(enable);
        return true;
    }

    private void d0(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.G3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == g.m.J3) {
                    this.f23068t = obtainStyledAttributes.getResourceId(index, this.f23068t);
                } else if (index == g.m.H3) {
                    this.f23070v = obtainStyledAttributes.getResourceId(index, this.f23070v);
                } else if (index == g.m.K3) {
                    this.f23071w = obtainStyledAttributes.getResourceId(index, this.f23071w);
                } else if (index == g.m.I3) {
                    this.B = obtainStyledAttributes.getInt(index, this.B);
                } else if (index == g.m.N3) {
                    this.f23072x = obtainStyledAttributes.getResourceId(index, this.f23072x);
                } else if (index == g.m.M3) {
                    this.f23073y = obtainStyledAttributes.getResourceId(index, this.f23073y);
                } else if (index == g.m.P3) {
                    this.f23074z = obtainStyledAttributes.getFloat(index, this.f23074z);
                } else if (index == g.m.O3) {
                    this.C = obtainStyledAttributes.getInt(index, this.C);
                } else if (index == g.m.Q3) {
                    this.D = obtainStyledAttributes.getFloat(index, this.D);
                } else if (index == g.m.L3) {
                    this.f23069u = obtainStyledAttributes.getBoolean(index, this.f23069u);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0() {
        this.f23067s.N1(this.F);
        if (this.E < this.f23066r) {
            this.f23067s.Y1(this.f23072x, this.F);
        } else {
            this.f23067s.Y1(this.f23073y, this.F);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        b bVar = this.f23063o;
        if (bVar == null || this.f23067s == null || bVar.count() == 0) {
            return;
        }
        int size = this.f23064p.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = this.f23064p.get(i4);
            int i5 = (this.f23066r + i4) - this.A;
            if (this.f23069u) {
                if (i5 < 0) {
                    int i6 = this.B;
                    if (i6 != 4) {
                        l0(view, i6);
                    } else {
                        l0(view, 0);
                    }
                    if (i5 % this.f23063o.count() == 0) {
                        this.f23063o.b(view, 0);
                    } else {
                        b bVar2 = this.f23063o;
                        bVar2.b(view, (i5 % this.f23063o.count()) + bVar2.count());
                    }
                } else if (i5 >= this.f23063o.count()) {
                    if (i5 == this.f23063o.count()) {
                        i5 = 0;
                    } else if (i5 > this.f23063o.count()) {
                        i5 %= this.f23063o.count();
                    }
                    int i7 = this.B;
                    if (i7 != 4) {
                        l0(view, i7);
                    } else {
                        l0(view, 0);
                    }
                    this.f23063o.b(view, i5);
                } else {
                    l0(view, 0);
                    this.f23063o.b(view, i5);
                }
            } else if (i5 < 0) {
                l0(view, this.B);
            } else if (i5 >= this.f23063o.count()) {
                l0(view, this.B);
            } else {
                l0(view, 0);
                this.f23063o.b(view, i5);
            }
        }
        int i10 = this.E;
        if (i10 != -1 && i10 != this.f23066r) {
            this.f23067s.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.a
                @Override // java.lang.Runnable
                public final void run() {
                    Carousel.this.f0();
                }
            });
        } else if (i10 == this.f23066r) {
            this.E = -1;
        }
        if (this.f23070v == -1 || this.f23071w == -1 || this.f23069u) {
            return;
        }
        int count = this.f23063o.count();
        if (this.f23066r == 0) {
            a0(this.f23070v, false);
        } else {
            a0(this.f23070v, true);
            this.f23067s.K1(this.f23070v);
        }
        if (this.f23066r == count - 1) {
            a0(this.f23071w, false);
        } else {
            a0(this.f23071w, true);
            this.f23067s.K1(this.f23071w);
        }
    }

    private boolean k0(int constraintSetId, View view, int visibility) {
        d.a k02;
        d Q0 = this.f23067s.Q0(constraintSetId);
        if (Q0 == null || (k02 = Q0.k0(view.getId())) == null) {
            return false;
        }
        k02.f24046c.f24174c = 1;
        view.setVisibility(visibility);
        return true;
    }

    private boolean l0(View view, int visibility) {
        MotionLayout motionLayout = this.f23067s;
        if (motionLayout == null) {
            return false;
        }
        boolean z4 = false;
        for (int i4 : motionLayout.R0()) {
            z4 |= k0(i4, view, visibility);
        }
        return z4;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.l
    public void a(MotionLayout motionLayout, int startId, int endId, float progress) {
        this.G = startId;
    }

    public int b0() {
        b bVar = this.f23063o;
        if (bVar != null) {
            return bVar.count();
        }
        return 0;
    }

    public int c0() {
        return this.f23066r;
    }

    public void e0(int index) {
        this.f23066r = Math.max(0, Math.min(b0() - 1, index));
        g0();
    }

    public void g0() {
        int size = this.f23064p.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = this.f23064p.get(i4);
            if (this.f23063o.count() == 0) {
                l0(view, this.B);
            } else {
                l0(view, 0);
            }
        }
        this.f23067s.v1();
        j0();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.l
    public void h(MotionLayout motionLayout, int currentId) {
        int i4 = this.f23066r;
        this.f23065q = i4;
        if (currentId == this.f23073y) {
            this.f23066r = i4 + 1;
        } else if (currentId == this.f23072x) {
            this.f23066r = i4 - 1;
        }
        if (this.f23069u) {
            if (this.f23066r >= this.f23063o.count()) {
                this.f23066r = 0;
            }
            if (this.f23066r < 0) {
                this.f23066r = this.f23063o.count() - 1;
            }
        } else {
            if (this.f23066r >= this.f23063o.count()) {
                this.f23066r = this.f23063o.count() - 1;
            }
            if (this.f23066r < 0) {
                this.f23066r = 0;
            }
        }
        if (this.f23065q != this.f23066r) {
            this.f23067s.post(this.H);
        }
    }

    public void h0(b adapter) {
        this.f23063o = adapter;
    }

    public void i0(int index, int delay) {
        this.E = Math.max(0, Math.min(b0() - 1, index));
        int max = Math.max(0, delay);
        this.F = max;
        this.f23067s.N1(max);
        if (index < this.f23066r) {
            this.f23067s.Y1(this.f23072x, this.F);
        } else {
            this.f23067s.Y1(this.f23073y, this.F);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @x0(api = 17)
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i4 = 0; i4 < this.f23781c; i4++) {
                int i5 = this.f23780b[i4];
                View w4 = motionLayout.w(i5);
                if (this.f23068t == i5) {
                    this.A = i4;
                }
                this.f23064p.add(w4);
            }
            this.f23067s = motionLayout;
            if (this.C == 2) {
                t.b e12 = motionLayout.e1(this.f23071w);
                if (e12 != null) {
                    e12.U(5);
                }
                t.b e13 = this.f23067s.e1(this.f23070v);
                if (e13 != null) {
                    e13.U(5);
                }
            }
            j0();
        }
    }

    public Carousel(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23063o = null;
        this.f23064p = new ArrayList<>();
        this.f23065q = 0;
        this.f23066r = 0;
        this.f23068t = -1;
        this.f23069u = false;
        this.f23070v = -1;
        this.f23071w = -1;
        this.f23072x = -1;
        this.f23073y = -1;
        this.f23074z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new a();
        d0(context, attrs);
    }

    public Carousel(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23063o = null;
        this.f23064p = new ArrayList<>();
        this.f23065q = 0;
        this.f23066r = 0;
        this.f23068t = -1;
        this.f23069u = false;
        this.f23070v = -1;
        this.f23071w = -1;
        this.f23072x = -1;
        this.f23073y = -1;
        this.f23074z = 0.9f;
        this.A = 0;
        this.B = 4;
        this.C = 1;
        this.D = 2.0f;
        this.E = -1;
        this.F = 200;
        this.G = -1;
        this.H = new a();
        d0(context, attrs);
    }
}
