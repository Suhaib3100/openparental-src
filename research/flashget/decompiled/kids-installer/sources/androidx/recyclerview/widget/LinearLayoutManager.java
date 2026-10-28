package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import java.util.List;

/* loaded from: classes3.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements o.j, RecyclerView.z.b {
    private static final String I = "LinearLayoutManager";
    static final boolean J = false;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = Integer.MIN_VALUE;
    private static final float N = 0.33333334f;
    int A;
    int B;
    private boolean C;
    SavedState D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* renamed from: s, reason: collision with root package name */
    int f8833s;

    /* renamed from: t, reason: collision with root package name */
    private c f8834t;

    /* renamed from: u, reason: collision with root package name */
    z f8835u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f8836v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f8837w;

    /* renamed from: x, reason: collision with root package name */
    boolean f8838x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f8839y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f8840z;

    @c1({c1.a.LIBRARY})
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        int f8841o;

        /* renamed from: p, reason: collision with root package name */
        int f8842p;

        /* renamed from: q, reason: collision with root package name */
        boolean f8843q;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        public SavedState() {
        }

        boolean a() {
            return this.f8841o >= 0;
        }

        void b() {
            this.f8841o = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.f8841o);
            parcel.writeInt(this.f8842p);
            parcel.writeInt(this.f8843q ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f8841o = parcel.readInt();
            this.f8842p = parcel.readInt();
            this.f8843q = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f8841o = savedState.f8841o;
            this.f8842p = savedState.f8842p;
            this.f8843q = savedState.f8843q;
        }
    }

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        z f8844a;

        /* renamed from: b, reason: collision with root package name */
        int f8845b;

        /* renamed from: c, reason: collision with root package name */
        int f8846c;

        /* renamed from: d, reason: collision with root package name */
        boolean f8847d;

        /* renamed from: e, reason: collision with root package name */
        boolean f8848e;

        a() {
            e();
        }

        void a() {
            this.f8846c = this.f8847d ? this.f8844a.i() : this.f8844a.n();
        }

        public void b(View view, int i5) {
            if (this.f8847d) {
                this.f8846c = this.f8844a.p() + this.f8844a.d(view);
            } else {
                this.f8846c = this.f8844a.g(view);
            }
            this.f8845b = i5;
        }

        public void c(View view, int i5) {
            int p5 = this.f8844a.p();
            if (p5 >= 0) {
                b(view, i5);
                return;
            }
            this.f8845b = i5;
            if (!this.f8847d) {
                int g5 = this.f8844a.g(view);
                int n5 = g5 - this.f8844a.n();
                this.f8846c = g5;
                if (n5 > 0) {
                    int i6 = (this.f8844a.i() - Math.min(0, (this.f8844a.i() - p5) - this.f8844a.d(view))) - (this.f8844a.e(view) + g5);
                    if (i6 < 0) {
                        this.f8846c -= Math.min(n5, -i6);
                        return;
                    }
                    return;
                }
                return;
            }
            int i7 = (this.f8844a.i() - p5) - this.f8844a.d(view);
            this.f8846c = this.f8844a.i() - i7;
            if (i7 > 0) {
                int e6 = this.f8846c - this.f8844a.e(view);
                int n6 = this.f8844a.n();
                int min = e6 - (Math.min(this.f8844a.g(view) - n6, 0) + n6);
                if (min < 0) {
                    this.f8846c = Math.min(i7, -min) + this.f8846c;
                }
            }
        }

        boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return !layoutParams.g() && layoutParams.d() >= 0 && layoutParams.d() < a0Var.d();
        }

        void e() {
            this.f8845b = -1;
            this.f8846c = Integer.MIN_VALUE;
            this.f8847d = false;
            this.f8848e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f8845b + ", mCoordinate=" + this.f8846c + ", mLayoutFromEnd=" + this.f8847d + ", mValid=" + this.f8848e + '}';
        }
    }

    /* loaded from: classes.dex */
    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f8849a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f8850b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f8851c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f8852d;

        protected b() {
        }

        void a() {
            this.f8849a = 0;
            this.f8850b = false;
            this.f8851c = false;
            this.f8852d = false;
        }
    }

    /* loaded from: classes.dex */
    static class c {

        /* renamed from: n, reason: collision with root package name */
        static final String f8853n = "LLM#LayoutState";

        /* renamed from: o, reason: collision with root package name */
        static final int f8854o = -1;

        /* renamed from: p, reason: collision with root package name */
        static final int f8855p = 1;

        /* renamed from: q, reason: collision with root package name */
        static final int f8856q = Integer.MIN_VALUE;

        /* renamed from: r, reason: collision with root package name */
        static final int f8857r = -1;

        /* renamed from: s, reason: collision with root package name */
        static final int f8858s = 1;

        /* renamed from: t, reason: collision with root package name */
        static final int f8859t = Integer.MIN_VALUE;

        /* renamed from: b, reason: collision with root package name */
        int f8861b;

        /* renamed from: c, reason: collision with root package name */
        int f8862c;

        /* renamed from: d, reason: collision with root package name */
        int f8863d;

        /* renamed from: e, reason: collision with root package name */
        int f8864e;

        /* renamed from: f, reason: collision with root package name */
        int f8865f;

        /* renamed from: g, reason: collision with root package name */
        int f8866g;

        /* renamed from: k, reason: collision with root package name */
        int f8870k;

        /* renamed from: m, reason: collision with root package name */
        boolean f8872m;

        /* renamed from: a, reason: collision with root package name */
        boolean f8860a = true;

        /* renamed from: h, reason: collision with root package name */
        int f8867h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f8868i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f8869j = false;

        /* renamed from: l, reason: collision with root package name */
        List<RecyclerView.d0> f8871l = null;

        c() {
        }

        private View f() {
            int size = this.f8871l.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = this.f8871l.get(i5).f9003a;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.g() && this.f8863d == layoutParams.d()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View g5 = g(view);
            if (g5 == null) {
                this.f8863d = -1;
            } else {
                this.f8863d = ((RecyclerView.LayoutParams) g5.getLayoutParams()).d();
            }
        }

        boolean c(RecyclerView.a0 a0Var) {
            int i5 = this.f8863d;
            return i5 >= 0 && i5 < a0Var.d();
        }

        void d() {
        }

        View e(RecyclerView.v vVar) {
            if (this.f8871l != null) {
                return f();
            }
            View q5 = vVar.q(this.f8863d, false);
            this.f8863d += this.f8864e;
            return q5;
        }

        public View g(View view) {
            int d6;
            int size = this.f8871l.size();
            View view2 = null;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < size; i6++) {
                View view3 = this.f8871l.get(i6).f9003a;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.g() && (d6 = (layoutParams.d() - this.f8863d) * this.f8864e) >= 0 && d6 < i5) {
                    view2 = view3;
                    if (d6 == 0) {
                        break;
                    }
                    i5 = d6;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private View D2() {
        return this.f8838x ? u2() : z2();
    }

    private View E2() {
        return this.f8838x ? z2() : u2();
    }

    private int G2(int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z5) {
        int i6;
        int i7 = this.f8835u.i() - i5;
        if (i7 <= 0) {
            return 0;
        }
        int i8 = -c3(-i7, vVar, a0Var);
        int i9 = i5 + i8;
        if (!z5 || (i6 = this.f8835u.i() - i9) <= 0) {
            return i8;
        }
        this.f8835u.t(i6);
        return i6 + i8;
    }

    private int H2(int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z5) {
        int n5;
        int n6 = i5 - this.f8835u.n();
        if (n6 <= 0) {
            return 0;
        }
        int i6 = -c3(n6, vVar, a0Var);
        int i7 = i5 + i6;
        if (!z5 || (n5 = i7 - this.f8835u.n()) <= 0) {
            return i6;
        }
        this.f8835u.t(-n5);
        return i6 - n5;
    }

    private View I2() {
        return P(this.f8838x ? 0 : Q() - 1);
    }

    private View J2() {
        return P(this.f8838x ? Q() - 1 : 0);
    }

    private void T2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i5, int i6) {
        if (!a0Var.n() || Q() == 0 || a0Var.j() || !j2()) {
            return;
        }
        List<RecyclerView.d0> l5 = vVar.l();
        int size = l5.size();
        int s02 = s0(P(0));
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView.d0 d0Var = l5.get(i9);
            if (!d0Var.z()) {
                if (((d0Var.p() < s02) != this.f8838x ? (char) 65535 : (char) 1) == 65535) {
                    i7 += this.f8835u.e(d0Var.f9003a);
                } else {
                    i8 += this.f8835u.e(d0Var.f9003a);
                }
            }
        }
        this.f8834t.f8871l = l5;
        if (i7 > 0) {
            q3(s0(J2()), i5);
            c cVar = this.f8834t;
            cVar.f8867h = i7;
            cVar.f8862c = 0;
            cVar.a();
            s2(vVar, this.f8834t, a0Var, false);
        }
        if (i8 > 0) {
            o3(s0(I2()), i6);
            c cVar2 = this.f8834t;
            cVar2.f8867h = i8;
            cVar2.f8862c = 0;
            cVar2.a();
            s2(vVar, this.f8834t, a0Var, false);
        }
        this.f8834t.f8871l = null;
    }

    private void U2() {
        for (int i5 = 0; i5 < Q(); i5++) {
            View P = P(i5);
            s0(P);
            this.f8835u.g(P);
        }
    }

    private void W2(RecyclerView.v vVar, c cVar) {
        if (!cVar.f8860a || cVar.f8872m) {
            return;
        }
        int i5 = cVar.f8866g;
        int i6 = cVar.f8868i;
        if (cVar.f8865f == -1) {
            Y2(vVar, i5, i6);
        } else {
            Z2(vVar, i5, i6);
        }
    }

    private void X2(RecyclerView.v vVar, int i5, int i6) {
        if (i5 == i6) {
            return;
        }
        if (i6 <= i5) {
            while (i5 > i6) {
                G1(i5, vVar);
                i5--;
            }
        } else {
            for (int i7 = i6 - 1; i7 >= i5; i7--) {
                G1(i7, vVar);
            }
        }
    }

    private void Y2(RecyclerView.v vVar, int i5, int i6) {
        int Q = Q();
        if (i5 < 0) {
            return;
        }
        int h5 = (this.f8835u.h() - i5) + i6;
        if (this.f8838x) {
            for (int i7 = 0; i7 < Q; i7++) {
                View P = P(i7);
                if (this.f8835u.g(P) < h5 || this.f8835u.r(P) < h5) {
                    X2(vVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = Q - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View P2 = P(i9);
            if (this.f8835u.g(P2) < h5 || this.f8835u.r(P2) < h5) {
                X2(vVar, i8, i9);
                return;
            }
        }
    }

    private void Z2(RecyclerView.v vVar, int i5, int i6) {
        if (i5 < 0) {
            return;
        }
        int i7 = i5 - i6;
        int Q = Q();
        if (!this.f8838x) {
            for (int i8 = 0; i8 < Q; i8++) {
                View P = P(i8);
                if (this.f8835u.d(P) > i7 || this.f8835u.q(P) > i7) {
                    X2(vVar, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = Q - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View P2 = P(i10);
            if (this.f8835u.d(P2) > i7 || this.f8835u.q(P2) > i7) {
                X2(vVar, i9, i10);
                return;
            }
        }
    }

    private void b3() {
        if (this.f8833s == 1 || !Q2()) {
            this.f8838x = this.f8837w;
        } else {
            this.f8838x = !this.f8837w;
        }
    }

    private boolean k3(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        View F2;
        boolean z5 = false;
        if (Q() == 0) {
            return false;
        }
        View d02 = d0();
        if (d02 != null && aVar.d(d02, a0Var)) {
            aVar.c(d02, s0(d02));
            return true;
        }
        boolean z6 = this.f8836v;
        boolean z7 = this.f8839y;
        if (z6 != z7 || (F2 = F2(vVar, a0Var, aVar.f8847d, z7)) == null) {
            return false;
        }
        aVar.b(F2, s0(F2));
        if (!a0Var.j() && j2()) {
            int g5 = this.f8835u.g(F2);
            int d6 = this.f8835u.d(F2);
            int n5 = this.f8835u.n();
            int i5 = this.f8835u.i();
            boolean z8 = d6 <= n5 && g5 < n5;
            if (g5 >= i5 && d6 > i5) {
                z5 = true;
            }
            if (z8 || z5) {
                if (aVar.f8847d) {
                    n5 = i5;
                }
                aVar.f8846c = n5;
            }
        }
        return true;
    }

    private boolean l3(RecyclerView.a0 a0Var, a aVar) {
        int i5;
        if (!a0Var.j() && (i5 = this.A) != -1) {
            if (i5 >= 0 && i5 < a0Var.d()) {
                aVar.f8845b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z5 = this.D.f8843q;
                    aVar.f8847d = z5;
                    if (z5) {
                        aVar.f8846c = this.f8835u.i() - this.D.f8842p;
                    } else {
                        aVar.f8846c = this.f8835u.n() + this.D.f8842p;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z6 = this.f8838x;
                    aVar.f8847d = z6;
                    if (z6) {
                        aVar.f8846c = this.f8835u.i() - this.B;
                    } else {
                        aVar.f8846c = this.f8835u.n() + this.B;
                    }
                    return true;
                }
                View J2 = J(this.A);
                if (J2 == null) {
                    if (Q() > 0) {
                        aVar.f8847d = (this.A < s0(P(0))) == this.f8838x;
                    }
                    aVar.a();
                } else {
                    if (this.f8835u.e(J2) > this.f8835u.o()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f8835u.g(J2) - this.f8835u.n() < 0) {
                        aVar.f8846c = this.f8835u.n();
                        aVar.f8847d = false;
                        return true;
                    }
                    if (this.f8835u.i() - this.f8835u.d(J2) < 0) {
                        aVar.f8846c = this.f8835u.i();
                        aVar.f8847d = true;
                        return true;
                    }
                    aVar.f8846c = aVar.f8847d ? this.f8835u.p() + this.f8835u.d(J2) : this.f8835u.g(J2);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private int m2(RecyclerView.a0 a0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return c0.a(a0Var, this.f8835u, w2(!this.f8840z, true), v2(!this.f8840z, true), this, this.f8840z);
    }

    private void m3(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (l3(a0Var, aVar) || k3(vVar, a0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f8845b = this.f8839y ? a0Var.d() - 1 : 0;
    }

    private int n2(RecyclerView.a0 a0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return c0.b(a0Var, this.f8835u, w2(!this.f8840z, true), v2(!this.f8840z, true), this, this.f8840z, this.f8838x);
    }

    private void n3(int i5, int i6, boolean z5, RecyclerView.a0 a0Var) {
        int n5;
        this.f8834t.f8872m = a3();
        this.f8834t.f8865f = i5;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        k2(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        boolean z6 = i5 == 1;
        c cVar = this.f8834t;
        int i7 = z6 ? max2 : max;
        cVar.f8867h = i7;
        if (!z6) {
            max = max2;
        }
        cVar.f8868i = max;
        if (z6) {
            cVar.f8867h = this.f8835u.j() + i7;
            View I2 = I2();
            c cVar2 = this.f8834t;
            cVar2.f8864e = this.f8838x ? -1 : 1;
            int s02 = s0(I2);
            c cVar3 = this.f8834t;
            cVar2.f8863d = s02 + cVar3.f8864e;
            cVar3.f8861b = this.f8835u.d(I2);
            n5 = this.f8835u.d(I2) - this.f8835u.i();
        } else {
            View J2 = J2();
            c cVar4 = this.f8834t;
            cVar4.f8867h = this.f8835u.n() + cVar4.f8867h;
            c cVar5 = this.f8834t;
            cVar5.f8864e = this.f8838x ? 1 : -1;
            int s03 = s0(J2);
            c cVar6 = this.f8834t;
            cVar5.f8863d = s03 + cVar6.f8864e;
            cVar6.f8861b = this.f8835u.g(J2);
            n5 = (-this.f8835u.g(J2)) + this.f8835u.n();
        }
        c cVar7 = this.f8834t;
        cVar7.f8862c = i6;
        if (z5) {
            cVar7.f8862c = i6 - n5;
        }
        cVar7.f8866g = n5;
    }

    private int o2(RecyclerView.a0 a0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return c0.c(a0Var, this.f8835u, w2(!this.f8840z, true), v2(!this.f8840z, true), this, this.f8840z);
    }

    private void o3(int i5, int i6) {
        this.f8834t.f8862c = this.f8835u.i() - i6;
        c cVar = this.f8834t;
        cVar.f8864e = this.f8838x ? -1 : 1;
        cVar.f8863d = i5;
        cVar.f8865f = 1;
        cVar.f8861b = i6;
        cVar.f8866g = Integer.MIN_VALUE;
    }

    private void p3(a aVar) {
        o3(aVar.f8845b, aVar.f8846c);
    }

    private void q3(int i5, int i6) {
        this.f8834t.f8862c = i6 - this.f8835u.n();
        c cVar = this.f8834t;
        cVar.f8863d = i5;
        cVar.f8864e = this.f8838x ? 1 : -1;
        cVar.f8865f = -1;
        cVar.f8861b = i6;
        cVar.f8866g = Integer.MIN_VALUE;
    }

    private void r3(a aVar) {
        q3(aVar.f8845b, aVar.f8846c);
    }

    private View u2() {
        return B2(0, Q());
    }

    private View z2() {
        return B2(Q() - 1, -1);
    }

    public int A2() {
        View C2 = C2(Q() - 1, -1, false, true);
        if (C2 == null) {
            return -1;
        }
        return s0(C2);
    }

    View B2(int i5, int i6) {
        int i7;
        int i8;
        r2();
        if ((i6 > i5 ? (char) 1 : i6 < i5 ? (char) 65535 : (char) 0) == 0) {
            return P(i5);
        }
        if (this.f8835u.g(P(i5)) < this.f8835u.n()) {
            i7 = 16644;
            i8 = 16388;
        } else {
            i7 = 4161;
            i8 = androidx.fragment.app.f0.I;
        }
        return this.f8833s == 0 ? this.f8941e.a(i5, i6, i7, i8) : this.f8942f.a(i5, i6, i7, i8);
    }

    View C2(int i5, int i6, boolean z5, boolean z6) {
        r2();
        int i7 = z5 ? 24579 : 320;
        int i8 = z6 ? 320 : 0;
        return this.f8833s == 0 ? this.f8941e.a(i5, i6, i7, i8) : this.f8942f.a(i5, i6, i7, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean F0() {
        return true;
    }

    View F2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z5, boolean z6) {
        int i5;
        int i6;
        int i7;
        r2();
        int Q = Q();
        if (z6) {
            i6 = Q() - 1;
            i5 = -1;
            i7 = -1;
        } else {
            i5 = Q;
            i6 = 0;
            i7 = 1;
        }
        int d6 = a0Var.d();
        int n5 = this.f8835u.n();
        int i8 = this.f8835u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i6 != i5) {
            View P = P(i6);
            int s02 = s0(P);
            int g5 = this.f8835u.g(P);
            int d7 = this.f8835u.d(P);
            if (s02 >= 0 && s02 < d6) {
                if (!((RecyclerView.LayoutParams) P.getLayoutParams()).g()) {
                    boolean z7 = d7 <= n5 && g5 < n5;
                    boolean z8 = g5 >= i8 && d7 > i8;
                    if (!z7 && !z8) {
                        return P;
                    }
                    if (z5) {
                        if (!z8) {
                            if (view != null) {
                            }
                            view = P;
                        }
                        view2 = P;
                    } else {
                        if (!z7) {
                            if (view != null) {
                            }
                            view = P;
                        }
                        view2 = P;
                    }
                } else if (view3 == null) {
                    view3 = P;
                }
            }
            i6 += i7;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View J(int i5) {
        int Q = Q();
        if (Q == 0) {
            return null;
        }
        int s02 = i5 - s0(P(0));
        if (s02 >= 0 && s02 < Q) {
            View P = P(s02);
            if (s0(P) == i5) {
                return P;
            }
        }
        return super.J(i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams K() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Deprecated
    protected int K2(RecyclerView.a0 a0Var) {
        if (a0Var.h()) {
            return this.f8835u.o();
        }
        return 0;
    }

    public int L2() {
        return this.G;
    }

    public int M2() {
        return this.f8833s;
    }

    public boolean N2() {
        return this.C;
    }

    public boolean O2() {
        return this.f8837w;
    }

    public boolean P2() {
        return this.f8839y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int Q1(int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f8833s == 1) {
            return 0;
        }
        return c3(i5, vVar, a0Var);
    }

    protected boolean Q2() {
        return i0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void R1(int i5) {
        this.A = i5;
        this.B = Integer.MIN_VALUE;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        N1();
    }

    public boolean R2() {
        return this.f8840z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int S1(int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f8833s == 0) {
            return 0;
        }
        return c3(i5, vVar, a0Var);
    }

    void S2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        int f6;
        View e6 = cVar.e(vVar);
        if (e6 == null) {
            bVar.f8850b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) e6.getLayoutParams();
        if (cVar.f8871l == null) {
            if (this.f8838x == (cVar.f8865f == -1)) {
                e(e6);
            } else {
                f(e6, 0);
            }
        } else {
            if (this.f8838x == (cVar.f8865f == -1)) {
                c(e6);
            } else {
                d(e6, 0);
            }
        }
        R0(e6, 0, 0);
        bVar.f8849a = this.f8835u.e(e6);
        if (this.f8833s == 1) {
            if (Q2()) {
                f6 = z0() - p0();
                i8 = f6 - this.f8835u.f(e6);
            } else {
                i8 = o0();
                f6 = this.f8835u.f(e6) + i8;
            }
            if (cVar.f8865f == -1) {
                int i9 = cVar.f8861b;
                i7 = i9;
                i6 = f6;
                i5 = i9 - bVar.f8849a;
            } else {
                int i10 = cVar.f8861b;
                i5 = i10;
                i6 = f6;
                i7 = bVar.f8849a + i10;
            }
        } else {
            int r02 = r0();
            int f7 = this.f8835u.f(e6) + r02;
            if (cVar.f8865f == -1) {
                int i11 = cVar.f8861b;
                i6 = i11;
                i5 = r02;
                i7 = f7;
                i8 = i11 - bVar.f8849a;
            } else {
                int i12 = cVar.f8861b;
                i5 = r02;
                i6 = bVar.f8849a + i12;
                i7 = f7;
                i8 = i12;
            }
        }
        P0(e6, i8, i5, i6, i7);
        if (layoutParams.g() || layoutParams.f()) {
            bVar.f8851c = true;
        }
        bVar.f8852d = e6.hasFocusable();
    }

    void V2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i5) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Z0(RecyclerView recyclerView, RecyclerView.v vVar) {
        Y0(recyclerView);
        if (this.C) {
            D1(vVar);
            vVar.d();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i5) {
        if (Q() == 0) {
            return null;
        }
        int i6 = (i5 < s0(P(0))) != this.f8838x ? -1 : 1;
        return this.f8833s == 0 ? new PointF(i6, 0.0f) : new PointF(0.0f, i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View a1(View view, int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int p22;
        b3();
        if (Q() == 0 || (p22 = p2(i5)) == Integer.MIN_VALUE) {
            return null;
        }
        r2();
        n3(p22, (int) (this.f8835u.o() * N), false, a0Var);
        c cVar = this.f8834t;
        cVar.f8866g = Integer.MIN_VALUE;
        cVar.f8860a = false;
        s2(vVar, cVar, a0Var, true);
        View E2 = p22 == -1 ? E2() : D2();
        View J2 = p22 == -1 ? J2() : I2();
        if (!J2.hasFocusable()) {
            return E2;
        }
        if (E2 == null) {
            return null;
        }
        return J2;
    }

    boolean a3() {
        return this.f8835u.l() == 0 && this.f8835u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.o.j
    public void b(@o0 View view, @o0 View view2, int i5, int i6) {
        i("Cannot drop a view during a scroll or layout calculation");
        r2();
        b3();
        int s02 = s0(view);
        int s03 = s0(view2);
        char c6 = s02 < s03 ? (char) 1 : (char) 65535;
        if (this.f8838x) {
            if (c6 == 1) {
                d3(s03, this.f8835u.i() - (this.f8835u.e(view) + this.f8835u.g(view2)));
                return;
            } else {
                d3(s03, this.f8835u.i() - this.f8835u.d(view2));
                return;
            }
        }
        if (c6 == 65535) {
            d3(s03, this.f8835u.g(view2));
        } else {
            d3(s03, this.f8835u.d(view2) - this.f8835u.e(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void b1(AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (Q() > 0) {
            accessibilityEvent.setFromIndex(x2());
            accessibilityEvent.setToIndex(A2());
        }
    }

    int c3(int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (Q() == 0 || i5 == 0) {
            return 0;
        }
        r2();
        this.f8834t.f8860a = true;
        int i6 = i5 > 0 ? 1 : -1;
        int abs = Math.abs(i5);
        n3(i6, abs, true, a0Var);
        c cVar = this.f8834t;
        int s22 = cVar.f8866g + s2(vVar, cVar, a0Var, false);
        if (s22 < 0) {
            return 0;
        }
        if (abs > s22) {
            i5 = i6 * s22;
        }
        this.f8835u.t(-i5);
        this.f8834t.f8870k = i5;
        return i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    boolean d2() {
        return (f0() == 1073741824 || A0() == 1073741824 || !B0()) ? false : true;
    }

    public void d3(int i5, int i6) {
        this.A = i5;
        this.B = i6;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        N1();
    }

    public void e3(int i5) {
        this.G = i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void f2(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i5) {
        s sVar = new s(recyclerView.getContext());
        sVar.q(i5);
        g2(sVar);
    }

    public void f3(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("invalid orientation:", i5));
        }
        i(null);
        if (i5 != this.f8833s || this.f8835u == null) {
            z b6 = z.b(this, i5);
            this.f8835u = b6;
            this.E.f8844a = b6;
            this.f8833s = i5;
            N1();
        }
    }

    public void g3(boolean z5) {
        this.C = z5;
    }

    public void h3(boolean z5) {
        i(null);
        if (z5 == this.f8837w) {
            return;
        }
        this.f8837w = z5;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void i(String str) {
        if (this.D == null) {
            super.i(str);
        }
    }

    public void i3(boolean z5) {
        this.f8840z = z5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean j2() {
        return this.D == null && this.f8836v == this.f8839y;
    }

    public void j3(boolean z5) {
        i(null);
        if (this.f8839y == z5) {
            return;
        }
        this.f8839y = z5;
        N1();
    }

    protected void k2(@o0 RecyclerView.a0 a0Var, @o0 int[] iArr) {
        int i5;
        int K2 = K2(a0Var);
        if (this.f8834t.f8865f == -1) {
            i5 = 0;
        } else {
            i5 = K2;
            K2 = 0;
        }
        iArr[0] = K2;
        iArr[1] = i5;
    }

    void l2(RecyclerView.a0 a0Var, c cVar, RecyclerView.LayoutManager.c cVar2) {
        int i5 = cVar.f8863d;
        if (i5 < 0 || i5 >= a0Var.d()) {
            return;
        }
        cVar2.a(i5, Math.max(0, cVar.f8866g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean n() {
        return this.f8833s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean o() {
        return this.f8833s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void o1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i5;
        int i6;
        int i7;
        int i8;
        int G2;
        int i9;
        View J2;
        int g5;
        int i10;
        int i11 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.d() == 0) {
            D1(vVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.f8841o;
        }
        r2();
        this.f8834t.f8860a = false;
        b3();
        View d02 = d0();
        a aVar = this.E;
        if (!aVar.f8848e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f8847d = this.f8838x ^ this.f8839y;
            m3(vVar, a0Var, aVar2);
            this.E.f8848e = true;
        } else if (d02 != null && (this.f8835u.g(d02) >= this.f8835u.i() || this.f8835u.d(d02) <= this.f8835u.n())) {
            this.E.c(d02, s0(d02));
        }
        c cVar = this.f8834t;
        cVar.f8865f = cVar.f8870k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        k2(a0Var, iArr);
        int n5 = this.f8835u.n() + Math.max(0, this.H[0]);
        int j5 = this.f8835u.j() + Math.max(0, this.H[1]);
        if (a0Var.j() && (i9 = this.A) != -1 && this.B != Integer.MIN_VALUE && (J2 = J(i9)) != null) {
            if (this.f8838x) {
                i10 = this.f8835u.i() - this.f8835u.d(J2);
                g5 = this.B;
            } else {
                g5 = this.f8835u.g(J2) - this.f8835u.n();
                i10 = this.B;
            }
            int i12 = i10 - g5;
            if (i12 > 0) {
                n5 += i12;
            } else {
                j5 -= i12;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f8847d ? !this.f8838x : this.f8838x) {
            i11 = 1;
        }
        V2(vVar, a0Var, aVar3, i11);
        z(vVar);
        this.f8834t.f8872m = a3();
        this.f8834t.f8869j = a0Var.j();
        this.f8834t.f8868i = 0;
        a aVar4 = this.E;
        if (aVar4.f8847d) {
            r3(aVar4);
            c cVar2 = this.f8834t;
            cVar2.f8867h = n5;
            s2(vVar, cVar2, a0Var, false);
            c cVar3 = this.f8834t;
            i6 = cVar3.f8861b;
            int i13 = cVar3.f8863d;
            int i14 = cVar3.f8862c;
            if (i14 > 0) {
                j5 += i14;
            }
            p3(this.E);
            c cVar4 = this.f8834t;
            cVar4.f8867h = j5;
            cVar4.f8863d += cVar4.f8864e;
            s2(vVar, cVar4, a0Var, false);
            c cVar5 = this.f8834t;
            i5 = cVar5.f8861b;
            int i15 = cVar5.f8862c;
            if (i15 > 0) {
                q3(i13, i6);
                c cVar6 = this.f8834t;
                cVar6.f8867h = i15;
                s2(vVar, cVar6, a0Var, false);
                i6 = this.f8834t.f8861b;
            }
        } else {
            p3(aVar4);
            c cVar7 = this.f8834t;
            cVar7.f8867h = j5;
            s2(vVar, cVar7, a0Var, false);
            c cVar8 = this.f8834t;
            i5 = cVar8.f8861b;
            int i16 = cVar8.f8863d;
            int i17 = cVar8.f8862c;
            if (i17 > 0) {
                n5 += i17;
            }
            r3(this.E);
            c cVar9 = this.f8834t;
            cVar9.f8867h = n5;
            cVar9.f8863d += cVar9.f8864e;
            s2(vVar, cVar9, a0Var, false);
            c cVar10 = this.f8834t;
            int i18 = cVar10.f8861b;
            int i19 = cVar10.f8862c;
            if (i19 > 0) {
                o3(i16, i5);
                c cVar11 = this.f8834t;
                cVar11.f8867h = i19;
                s2(vVar, cVar11, a0Var, false);
                i5 = this.f8834t.f8861b;
            }
            i6 = i18;
        }
        if (Q() > 0) {
            if (this.f8838x ^ this.f8839y) {
                int G22 = G2(i5, vVar, a0Var, true);
                i7 = i6 + G22;
                i8 = i5 + G22;
                G2 = H2(i7, vVar, a0Var, false);
            } else {
                int H2 = H2(i6, vVar, a0Var, true);
                i7 = i6 + H2;
                i8 = i5 + H2;
                G2 = G2(i8, vVar, a0Var, false);
            }
            i6 = i7 + G2;
            i5 = i8 + G2;
        }
        T2(vVar, a0Var, i6, i5);
        if (a0Var.j()) {
            this.E.e();
        } else {
            this.f8835u.u();
        }
        this.f8836v = this.f8839y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void p1(RecyclerView.a0 a0Var) {
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    int p2(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 17 ? i5 != 33 ? i5 != 66 ? (i5 == 130 && this.f8833s == 1) ? 1 : Integer.MIN_VALUE : this.f8833s == 0 ? 1 : Integer.MIN_VALUE : this.f8833s == 1 ? -1 : Integer.MIN_VALUE : this.f8833s == 0 ? -1 : Integer.MIN_VALUE : (this.f8833s != 1 && Q2()) ? -1 : 1 : (this.f8833s != 1 && Q2()) ? 1 : -1;
    }

    c q2() {
        return new c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void r(int i5, int i6, RecyclerView.a0 a0Var, RecyclerView.LayoutManager.c cVar) {
        if (this.f8833s != 0) {
            i5 = i6;
        }
        if (Q() == 0 || i5 == 0) {
            return;
        }
        r2();
        n3(i5 > 0 ? 1 : -1, Math.abs(i5), true, a0Var);
        l2(a0Var, this.f8834t, cVar);
    }

    void r2() {
        if (this.f8834t == null) {
            this.f8834t = q2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void s(int i5, RecyclerView.LayoutManager.c cVar) {
        boolean z5;
        int i6;
        SavedState savedState = this.D;
        if (savedState == null || !savedState.a()) {
            b3();
            z5 = this.f8838x;
            i6 = this.A;
            if (i6 == -1) {
                i6 = z5 ? i5 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.D;
            z5 = savedState2.f8843q;
            i6 = savedState2.f8841o;
        }
        int i7 = z5 ? -1 : 1;
        for (int i8 = 0; i8 < this.G && i6 >= 0 && i6 < i5; i8++) {
            cVar.a(i6, 0);
            i6 += i7;
        }
    }

    int s2(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z5) {
        int i5 = cVar.f8862c;
        int i6 = cVar.f8866g;
        if (i6 != Integer.MIN_VALUE) {
            if (i5 < 0) {
                cVar.f8866g = i6 + i5;
            }
            W2(vVar, cVar);
        }
        int i7 = cVar.f8862c + cVar.f8867h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f8872m && i7 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            S2(vVar, a0Var, cVar, bVar);
            if (!bVar.f8850b) {
                cVar.f8861b = (bVar.f8849a * cVar.f8865f) + cVar.f8861b;
                if (!bVar.f8851c || cVar.f8871l != null || !a0Var.j()) {
                    int i8 = cVar.f8862c;
                    int i9 = bVar.f8849a;
                    cVar.f8862c = i8 - i9;
                    i7 -= i9;
                }
                int i10 = cVar.f8866g;
                if (i10 != Integer.MIN_VALUE) {
                    int i11 = i10 + bVar.f8849a;
                    cVar.f8866g = i11;
                    int i12 = cVar.f8862c;
                    if (i12 < 0) {
                        cVar.f8866g = i11 + i12;
                    }
                    W2(vVar, cVar);
                }
                if (z5 && bVar.f8852d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i5 - cVar.f8862c;
    }

    void s3() {
        Q();
        if (Q() < 1) {
            return;
        }
        int s02 = s0(P(0));
        int g5 = this.f8835u.g(P(0));
        if (this.f8838x) {
            for (int i5 = 1; i5 < Q(); i5++) {
                View P = P(i5);
                int s03 = s0(P);
                int g6 = this.f8835u.g(P);
                if (s03 < s02) {
                    U2();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(g6 < g5);
                    throw new RuntimeException(sb.toString());
                }
                if (g6 > g5) {
                    U2();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i6 = 1; i6 < Q(); i6++) {
            View P2 = P(i6);
            int s04 = s0(P2);
            int g7 = this.f8835u.g(P2);
            if (s04 < s02) {
                U2();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(g7 < g5);
                throw new RuntimeException(sb2.toString());
            }
            if (g7 < g5) {
                U2();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int t(RecyclerView.a0 a0Var) {
        return m2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void t1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.D = savedState;
            if (this.A != -1) {
                savedState.b();
            }
            N1();
        }
    }

    public int t2() {
        View C2 = C2(0, Q(), true, false);
        if (C2 == null) {
            return -1;
        }
        return s0(C2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int u(RecyclerView.a0 a0Var) {
        return n2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable u1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (Q() > 0) {
            r2();
            boolean z5 = this.f8836v ^ this.f8838x;
            savedState.f8843q = z5;
            if (z5) {
                View I2 = I2();
                savedState.f8842p = this.f8835u.i() - this.f8835u.d(I2);
                savedState.f8841o = s0(I2);
            } else {
                View J2 = J2();
                savedState.f8841o = s0(J2);
                savedState.f8842p = this.f8835u.g(J2) - this.f8835u.n();
            }
        } else {
            savedState.f8841o = -1;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int v(RecyclerView.a0 a0Var) {
        return o2(a0Var);
    }

    View v2(boolean z5, boolean z6) {
        return this.f8838x ? C2(0, Q(), z5, z6) : C2(Q() - 1, -1, z5, z6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int w(RecyclerView.a0 a0Var) {
        return m2(a0Var);
    }

    View w2(boolean z5, boolean z6) {
        return this.f8838x ? C2(Q() - 1, -1, z5, z6) : C2(0, Q(), z5, z6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int x(RecyclerView.a0 a0Var) {
        return n2(a0Var);
    }

    public int x2() {
        View C2 = C2(0, Q(), false, true);
        if (C2 == null) {
            return -1;
        }
        return s0(C2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int y(RecyclerView.a0 a0Var) {
        return o2(a0Var);
    }

    public int y2() {
        View C2 = C2(Q() - 1, -1, true, false);
        if (C2 == null) {
            return -1;
        }
        return s0(C2);
    }

    public LinearLayoutManager(Context context, int i5, boolean z5) {
        this.f8833s = 1;
        this.f8837w = false;
        this.f8838x = false;
        this.f8839y = false;
        this.f8840z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        f3(i5);
        h3(z5);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        this.f8833s = 1;
        this.f8837w = false;
        this.f8838x = false;
        this.f8839y = false;
        this.f8840z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.LayoutManager.Properties t02 = RecyclerView.LayoutManager.t0(context, attributeSet, i5, i6);
        f3(t02.f8955a);
        h3(t02.f8957c);
        j3(t02.f8958d);
    }
}
