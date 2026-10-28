package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes3.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.z.b {
    private static final String Q = "StaggeredGridLManager";
    static final boolean R = false;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 0;

    @Deprecated
    public static final int V = 1;
    public static final int W = 2;
    static final int X = Integer.MIN_VALUE;
    private static final float Y = 0.33333334f;
    private BitSet B;
    private boolean G;
    private boolean H;
    private SavedState I;
    private int J;
    private int[] O;

    /* renamed from: t, reason: collision with root package name */
    c[] f9084t;

    /* renamed from: u, reason: collision with root package name */
    @o0
    z f9085u;

    /* renamed from: v, reason: collision with root package name */
    @o0
    z f9086v;

    /* renamed from: w, reason: collision with root package name */
    private int f9087w;

    /* renamed from: x, reason: collision with root package name */
    private int f9088x;

    /* renamed from: y, reason: collision with root package name */
    @o0
    private final r f9089y;

    /* renamed from: s, reason: collision with root package name */
    private int f9083s = -1;

    /* renamed from: z, reason: collision with root package name */
    boolean f9090z = false;
    boolean A = false;
    int C = -1;
    int D = Integer.MIN_VALUE;
    LazySpanLookup E = new LazySpanLookup();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: g, reason: collision with root package name */
        public static final int f9091g = -1;

        /* renamed from: e, reason: collision with root package name */
        c f9092e;

        /* renamed from: f, reason: collision with root package name */
        boolean f9093f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int j() {
            c cVar = this.f9092e;
            if (cVar == null) {
                return -1;
            }
            return cVar.f9124e;
        }

        public boolean k() {
            return this.f9093f;
        }

        public void l(boolean z5) {
            this.f9093f = z5;
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @c1({c1.a.LIBRARY})
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        int f9101o;

        /* renamed from: p, reason: collision with root package name */
        int f9102p;

        /* renamed from: q, reason: collision with root package name */
        int f9103q;

        /* renamed from: r, reason: collision with root package name */
        int[] f9104r;

        /* renamed from: s, reason: collision with root package name */
        int f9105s;

        /* renamed from: t, reason: collision with root package name */
        int[] f9106t;

        /* renamed from: u, reason: collision with root package name */
        List<LazySpanLookup.FullSpanItem> f9107u;

        /* renamed from: v, reason: collision with root package name */
        boolean f9108v;

        /* renamed from: w, reason: collision with root package name */
        boolean f9109w;

        /* renamed from: x, reason: collision with root package name */
        boolean f9110x;

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

        void a() {
            this.f9104r = null;
            this.f9103q = 0;
            this.f9101o = -1;
            this.f9102p = -1;
        }

        void b() {
            this.f9104r = null;
            this.f9103q = 0;
            this.f9105s = 0;
            this.f9106t = null;
            this.f9107u = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.f9101o);
            parcel.writeInt(this.f9102p);
            parcel.writeInt(this.f9103q);
            if (this.f9103q > 0) {
                parcel.writeIntArray(this.f9104r);
            }
            parcel.writeInt(this.f9105s);
            if (this.f9105s > 0) {
                parcel.writeIntArray(this.f9106t);
            }
            parcel.writeInt(this.f9108v ? 1 : 0);
            parcel.writeInt(this.f9109w ? 1 : 0);
            parcel.writeInt(this.f9110x ? 1 : 0);
            parcel.writeList(this.f9107u);
        }

        SavedState(Parcel parcel) {
            this.f9101o = parcel.readInt();
            this.f9102p = parcel.readInt();
            int readInt = parcel.readInt();
            this.f9103q = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f9104r = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f9105s = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f9106t = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f9108v = parcel.readInt() == 1;
            this.f9109w = parcel.readInt() == 1;
            this.f9110x = parcel.readInt() == 1;
            this.f9107u = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f9103q = savedState.f9103q;
            this.f9101o = savedState.f9101o;
            this.f9102p = savedState.f9102p;
            this.f9104r = savedState.f9104r;
            this.f9105s = savedState.f9105s;
            this.f9106t = savedState.f9106t;
            this.f9108v = savedState.f9108v;
            this.f9109w = savedState.f9109w;
            this.f9110x = savedState.f9110x;
            this.f9107u = savedState.f9107u;
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.q2();
        }
    }

    /* loaded from: classes.dex */
    class b {

        /* renamed from: a, reason: collision with root package name */
        int f9112a;

        /* renamed from: b, reason: collision with root package name */
        int f9113b;

        /* renamed from: c, reason: collision with root package name */
        boolean f9114c;

        /* renamed from: d, reason: collision with root package name */
        boolean f9115d;

        /* renamed from: e, reason: collision with root package name */
        boolean f9116e;

        /* renamed from: f, reason: collision with root package name */
        int[] f9117f;

        b() {
            c();
        }

        void a() {
            this.f9113b = this.f9114c ? StaggeredGridLayoutManager.this.f9085u.i() : StaggeredGridLayoutManager.this.f9085u.n();
        }

        void b(int i5) {
            if (this.f9114c) {
                this.f9113b = StaggeredGridLayoutManager.this.f9085u.i() - i5;
            } else {
                this.f9113b = StaggeredGridLayoutManager.this.f9085u.n() + i5;
            }
        }

        void c() {
            this.f9112a = -1;
            this.f9113b = Integer.MIN_VALUE;
            this.f9114c = false;
            this.f9115d = false;
            this.f9116e = false;
            int[] iArr = this.f9117f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(c[] cVarArr) {
            int length = cVarArr.length;
            int[] iArr = this.f9117f;
            if (iArr == null || iArr.length < length) {
                this.f9117f = new int[StaggeredGridLayoutManager.this.f9084t.length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                this.f9117f[i5] = cVarArr[i5].u(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    class c {

        /* renamed from: g, reason: collision with root package name */
        static final int f9119g = Integer.MIN_VALUE;

        /* renamed from: a, reason: collision with root package name */
        ArrayList<View> f9120a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        int f9121b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f9122c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f9123d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f9124e;

        c(int i5) {
            this.f9124e = i5;
        }

        void A(int i5) {
            this.f9121b = i5;
            this.f9122c = i5;
        }

        void a(View view) {
            LayoutParams s5 = s(view);
            s5.f9092e = this;
            this.f9120a.add(view);
            this.f9122c = Integer.MIN_VALUE;
            if (this.f9120a.size() == 1) {
                this.f9121b = Integer.MIN_VALUE;
            }
            if (s5.g() || s5.f()) {
                this.f9123d = StaggeredGridLayoutManager.this.f9085u.e(view) + this.f9123d;
            }
        }

        void b(boolean z5, int i5) {
            int q5 = z5 ? q(Integer.MIN_VALUE) : u(Integer.MIN_VALUE);
            e();
            if (q5 == Integer.MIN_VALUE) {
                return;
            }
            if (!z5 || q5 >= StaggeredGridLayoutManager.this.f9085u.i()) {
                if (z5 || q5 <= StaggeredGridLayoutManager.this.f9085u.n()) {
                    if (i5 != Integer.MIN_VALUE) {
                        q5 += i5;
                    }
                    this.f9122c = q5;
                    this.f9121b = q5;
                }
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem f6;
            ArrayList<View> arrayList = this.f9120a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams s5 = s(view);
            this.f9122c = StaggeredGridLayoutManager.this.f9085u.d(view);
            if (s5.f9093f && (f6 = StaggeredGridLayoutManager.this.E.f(s5.d())) != null && f6.f9098p == 1) {
                this.f9122c += f6.a(this.f9124e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem f6;
            View view = this.f9120a.get(0);
            LayoutParams s5 = s(view);
            this.f9121b = StaggeredGridLayoutManager.this.f9085u.g(view);
            if (s5.f9093f && (f6 = StaggeredGridLayoutManager.this.E.f(s5.d())) != null && f6.f9098p == -1) {
                this.f9121b -= f6.a(this.f9124e);
            }
        }

        void e() {
            this.f9120a.clear();
            v();
            this.f9123d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f9090z ? n(this.f9120a.size() - 1, -1, true) : n(0, this.f9120a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f9090z ? m(this.f9120a.size() - 1, -1, true) : m(0, this.f9120a.size(), true);
        }

        public int h() {
            return StaggeredGridLayoutManager.this.f9090z ? n(this.f9120a.size() - 1, -1, false) : n(0, this.f9120a.size(), false);
        }

        public int i() {
            return StaggeredGridLayoutManager.this.f9090z ? n(0, this.f9120a.size(), true) : n(this.f9120a.size() - 1, -1, true);
        }

        public int j() {
            return StaggeredGridLayoutManager.this.f9090z ? m(0, this.f9120a.size(), true) : m(this.f9120a.size() - 1, -1, true);
        }

        public int k() {
            return StaggeredGridLayoutManager.this.f9090z ? n(0, this.f9120a.size(), false) : n(this.f9120a.size() - 1, -1, false);
        }

        int l(int i5, int i6, boolean z5, boolean z6, boolean z7) {
            int n5 = StaggeredGridLayoutManager.this.f9085u.n();
            int i7 = StaggeredGridLayoutManager.this.f9085u.i();
            int i8 = i6 > i5 ? 1 : -1;
            while (i5 != i6) {
                View view = this.f9120a.get(i5);
                int g5 = StaggeredGridLayoutManager.this.f9085u.g(view);
                int d6 = StaggeredGridLayoutManager.this.f9085u.d(view);
                boolean z8 = false;
                boolean z9 = !z7 ? g5 >= i7 : g5 > i7;
                if (!z7 ? d6 > n5 : d6 >= n5) {
                    z8 = true;
                }
                if (z9 && z8) {
                    if (z5 && z6) {
                        if (g5 >= n5 && d6 <= i7) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                    } else {
                        if (z6) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                        if (g5 < n5 || d6 > i7) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                    }
                }
                i5 += i8;
            }
            return -1;
        }

        int m(int i5, int i6, boolean z5) {
            return l(i5, i6, false, false, z5);
        }

        int n(int i5, int i6, boolean z5) {
            return l(i5, i6, z5, true, false);
        }

        public int o() {
            return this.f9123d;
        }

        int p() {
            int i5 = this.f9122c;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            c();
            return this.f9122c;
        }

        int q(int i5) {
            int i6 = this.f9122c;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            if (this.f9120a.size() == 0) {
                return i5;
            }
            c();
            return this.f9122c;
        }

        public View r(int i5, int i6) {
            View view = null;
            if (i6 != -1) {
                int size = this.f9120a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f9120a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f9090z && staggeredGridLayoutManager.s0(view2) >= i5) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f9090z && staggeredGridLayoutManager2.s0(view2) <= i5) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f9120a.size();
                int i7 = 0;
                while (i7 < size2) {
                    View view3 = this.f9120a.get(i7);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f9090z && staggeredGridLayoutManager3.s0(view3) <= i5) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f9090z && staggeredGridLayoutManager4.s0(view3) >= i5) || !view3.hasFocusable()) {
                        break;
                    }
                    i7++;
                    view = view3;
                }
            }
            return view;
        }

        LayoutParams s(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        int t() {
            int i5 = this.f9121b;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            d();
            return this.f9121b;
        }

        int u(int i5) {
            int i6 = this.f9121b;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            if (this.f9120a.size() == 0) {
                return i5;
            }
            d();
            return this.f9121b;
        }

        void v() {
            this.f9121b = Integer.MIN_VALUE;
            this.f9122c = Integer.MIN_VALUE;
        }

        void w(int i5) {
            int i6 = this.f9121b;
            if (i6 != Integer.MIN_VALUE) {
                this.f9121b = i6 + i5;
            }
            int i7 = this.f9122c;
            if (i7 != Integer.MIN_VALUE) {
                this.f9122c = i7 + i5;
            }
        }

        void x() {
            int size = this.f9120a.size();
            View remove = this.f9120a.remove(size - 1);
            LayoutParams s5 = s(remove);
            s5.f9092e = null;
            if (s5.g() || s5.f()) {
                this.f9123d -= StaggeredGridLayoutManager.this.f9085u.e(remove);
            }
            if (size == 1) {
                this.f9121b = Integer.MIN_VALUE;
            }
            this.f9122c = Integer.MIN_VALUE;
        }

        void y() {
            View remove = this.f9120a.remove(0);
            LayoutParams s5 = s(remove);
            s5.f9092e = null;
            if (this.f9120a.size() == 0) {
                this.f9122c = Integer.MIN_VALUE;
            }
            if (s5.g() || s5.f()) {
                this.f9123d -= StaggeredGridLayoutManager.this.f9085u.e(remove);
            }
            this.f9121b = Integer.MIN_VALUE;
        }

        void z(View view) {
            LayoutParams s5 = s(view);
            s5.f9092e = this;
            this.f9120a.add(0, view);
            this.f9121b = Integer.MIN_VALUE;
            if (this.f9120a.size() == 1) {
                this.f9122c = Integer.MIN_VALUE;
            }
            if (s5.g() || s5.f()) {
                this.f9123d = StaggeredGridLayoutManager.this.f9085u.e(view) + this.f9123d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        RecyclerView.LayoutManager.Properties t02 = RecyclerView.LayoutManager.t0(context, attributeSet, i5, i6);
        p3(t02.f8955a);
        r3(t02.f8956b);
        q3(t02.f8957c);
        this.f9089y = new r();
        y2();
    }

    private int B2(int i5) {
        int Q2 = Q();
        for (int i6 = 0; i6 < Q2; i6++) {
            int s02 = s0(P(i6));
            if (s02 >= 0 && s02 < i5) {
                return s02;
            }
        }
        return 0;
    }

    private int H2(int i5) {
        for (int Q2 = Q() - 1; Q2 >= 0; Q2--) {
            int s02 = s0(P(Q2));
            if (s02 >= 0 && s02 < i5) {
                return s02;
            }
        }
        return 0;
    }

    private void J2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z5) {
        int i5;
        int O2 = O2(Integer.MIN_VALUE);
        if (O2 != Integer.MIN_VALUE && (i5 = this.f9085u.i() - O2) > 0) {
            int i6 = i5 - (-l3(-i5, vVar, a0Var));
            if (!z5 || i6 <= 0) {
                return;
            }
            this.f9085u.t(i6);
        }
    }

    private void K2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z5) {
        int n5;
        int R2 = R2(Integer.MAX_VALUE);
        if (R2 != Integer.MAX_VALUE && (n5 = R2 - this.f9085u.n()) > 0) {
            int l32 = n5 - l3(n5, vVar, a0Var);
            if (!z5 || l32 <= 0) {
                return;
            }
            this.f9085u.t(-l32);
        }
    }

    private int O2(int i5) {
        int q5 = this.f9084t[0].q(i5);
        for (int i6 = 1; i6 < this.f9083s; i6++) {
            int q6 = this.f9084t[i6].q(i5);
            if (q6 > q5) {
                q5 = q6;
            }
        }
        return q5;
    }

    private int P2(int i5) {
        int u5 = this.f9084t[0].u(i5);
        for (int i6 = 1; i6 < this.f9083s; i6++) {
            int u6 = this.f9084t[i6].u(i5);
            if (u6 > u5) {
                u5 = u6;
            }
        }
        return u5;
    }

    private int Q2(int i5) {
        int q5 = this.f9084t[0].q(i5);
        for (int i6 = 1; i6 < this.f9083s; i6++) {
            int q6 = this.f9084t[i6].q(i5);
            if (q6 < q5) {
                q5 = q6;
            }
        }
        return q5;
    }

    private int R2(int i5) {
        int u5 = this.f9084t[0].u(i5);
        for (int i6 = 1; i6 < this.f9083s; i6++) {
            int u6 = this.f9084t[i6].u(i5);
            if (u6 < u5) {
                u5 = u6;
            }
        }
        return u5;
    }

    private c S2(r rVar) {
        int i5;
        int i6;
        int i7;
        if (d3(rVar.f9549e)) {
            i6 = this.f9083s - 1;
            i5 = -1;
            i7 = -1;
        } else {
            i5 = this.f9083s;
            i6 = 0;
            i7 = 1;
        }
        c cVar = null;
        if (rVar.f9549e == 1) {
            int n5 = this.f9085u.n();
            int i8 = Integer.MAX_VALUE;
            while (i6 != i5) {
                c cVar2 = this.f9084t[i6];
                int q5 = cVar2.q(n5);
                if (q5 < i8) {
                    cVar = cVar2;
                    i8 = q5;
                }
                i6 += i7;
            }
            return cVar;
        }
        int i9 = this.f9085u.i();
        int i10 = Integer.MIN_VALUE;
        while (i6 != i5) {
            c cVar3 = this.f9084t[i6];
            int u5 = cVar3.u(i9);
            if (u5 > i10) {
                cVar = cVar3;
                i10 = u5;
            }
            i6 += i7;
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void W2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.N2()
            goto Ld
        L9:
            int r0 = r6.L2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.E
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.L2()
            goto L51
        L4d:
            int r7 = r6.N2()
        L51:
            if (r3 > r7) goto L56
            r6.N1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.W2(int, int, int):void");
    }

    private void a3(View view, int i5, int i6, boolean z5) {
        m(view, this.K);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.K;
        int z32 = z3(i5, i7 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.K;
        int z33 = z3(i6, i8 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z5 ? e2(view, z32, z33, layoutParams) : c2(view, z32, z33, layoutParams)) {
            view.measure(z32, z33);
        }
    }

    private void b3(View view, LayoutParams layoutParams, boolean z5) {
        if (layoutParams.f9093f) {
            if (this.f9087w != 1) {
                a3(view, RecyclerView.LayoutManager.R(z0(), A0(), p0() + o0(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.J, z5);
                return;
            }
            a3(view, this.J, RecyclerView.LayoutManager.R(e0(), f0(), m0() + r0(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z5);
            return;
        }
        if (this.f9087w != 1) {
            a3(view, RecyclerView.LayoutManager.R(z0(), A0(), p0() + o0(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.LayoutManager.R(this.f9088x, f0(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z5);
            return;
        }
        a3(view, RecyclerView.LayoutManager.R(this.f9088x, A0(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.LayoutManager.R(e0(), f0(), m0() + r0(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
    
        if (q2() != false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c3(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c3(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean d3(int i5) {
        if (this.f9087w == 0) {
            return (i5 == -1) != this.A;
        }
        return ((i5 == -1) == this.A) == Z2();
    }

    private void f3(View view) {
        for (int i5 = this.f9083s - 1; i5 >= 0; i5--) {
            this.f9084t[i5].z(view);
        }
    }

    private void g3(RecyclerView.v vVar, r rVar) {
        if (!rVar.f9545a || rVar.f9553i) {
            return;
        }
        if (rVar.f9546b == 0) {
            if (rVar.f9549e == -1) {
                h3(vVar, rVar.f9551g);
                return;
            } else {
                i3(vVar, rVar.f9550f);
                return;
            }
        }
        if (rVar.f9549e != -1) {
            int Q2 = Q2(rVar.f9551g) - rVar.f9551g;
            i3(vVar, Q2 < 0 ? rVar.f9550f : Math.min(Q2, rVar.f9546b) + rVar.f9550f);
        } else {
            int i5 = rVar.f9550f;
            int P2 = i5 - P2(i5);
            h3(vVar, P2 < 0 ? rVar.f9551g : rVar.f9551g - Math.min(P2, rVar.f9546b));
        }
    }

    private void h3(RecyclerView.v vVar, int i5) {
        for (int Q2 = Q() - 1; Q2 >= 0; Q2--) {
            View P = P(Q2);
            if (this.f9085u.g(P) < i5 || this.f9085u.r(P) < i5) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) P.getLayoutParams();
            if (layoutParams.f9093f) {
                for (int i6 = 0; i6 < this.f9083s; i6++) {
                    if (this.f9084t[i6].f9120a.size() == 1) {
                        return;
                    }
                }
                for (int i7 = 0; i7 < this.f9083s; i7++) {
                    this.f9084t[i7].x();
                }
            } else if (layoutParams.f9092e.f9120a.size() == 1) {
                return;
            } else {
                layoutParams.f9092e.x();
            }
            F1(P, vVar);
        }
    }

    private void i3(RecyclerView.v vVar, int i5) {
        while (Q() > 0) {
            View P = P(0);
            if (this.f9085u.d(P) > i5 || this.f9085u.q(P) > i5) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) P.getLayoutParams();
            if (layoutParams.f9093f) {
                for (int i6 = 0; i6 < this.f9083s; i6++) {
                    if (this.f9084t[i6].f9120a.size() == 1) {
                        return;
                    }
                }
                for (int i7 = 0; i7 < this.f9083s; i7++) {
                    this.f9084t[i7].y();
                }
            } else if (layoutParams.f9092e.f9120a.size() == 1) {
                return;
            } else {
                layoutParams.f9092e.y();
            }
            F1(P, vVar);
        }
    }

    private void j3() {
        if (this.f9086v.l() == 1073741824) {
            return;
        }
        int Q2 = Q();
        float f6 = 0.0f;
        for (int i5 = 0; i5 < Q2; i5++) {
            View P = P(i5);
            float e6 = this.f9086v.e(P);
            if (e6 >= f6) {
                if (((LayoutParams) P.getLayoutParams()).k()) {
                    e6 = (e6 * 1.0f) / this.f9083s;
                }
                f6 = Math.max(f6, e6);
            }
        }
        int i6 = this.f9088x;
        int round = Math.round(f6 * this.f9083s);
        if (this.f9086v.l() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f9086v.o());
        }
        x3(round);
        if (this.f9088x == i6) {
            return;
        }
        for (int i7 = 0; i7 < Q2; i7++) {
            View P2 = P(i7);
            LayoutParams layoutParams = (LayoutParams) P2.getLayoutParams();
            if (!layoutParams.f9093f) {
                if (Z2() && this.f9087w == 1) {
                    int i8 = this.f9083s;
                    int i9 = layoutParams.f9092e.f9124e;
                    P2.offsetLeftAndRight(((-((i8 - 1) - i9)) * this.f9088x) - ((-((i8 - 1) - i9)) * i6));
                } else {
                    int i10 = layoutParams.f9092e.f9124e;
                    int i11 = this.f9088x * i10;
                    int i12 = i10 * i6;
                    if (this.f9087w == 1) {
                        P2.offsetLeftAndRight(i11 - i12);
                    } else {
                        P2.offsetTopAndBottom(i11 - i12);
                    }
                }
            }
        }
    }

    private void k2(View view) {
        for (int i5 = this.f9083s - 1; i5 >= 0; i5--) {
            this.f9084t[i5].a(view);
        }
    }

    private void k3() {
        if (this.f9087w == 1 || !Z2()) {
            this.A = this.f9090z;
        } else {
            this.A = !this.f9090z;
        }
    }

    private void l2(b bVar) {
        SavedState savedState = this.I;
        int i5 = savedState.f9103q;
        if (i5 > 0) {
            if (i5 == this.f9083s) {
                for (int i6 = 0; i6 < this.f9083s; i6++) {
                    this.f9084t[i6].e();
                    SavedState savedState2 = this.I;
                    int i7 = savedState2.f9104r[i6];
                    if (i7 != Integer.MIN_VALUE) {
                        i7 += savedState2.f9109w ? this.f9085u.i() : this.f9085u.n();
                    }
                    this.f9084t[i6].A(i7);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.I;
                savedState3.f9101o = savedState3.f9102p;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.f9110x;
        q3(savedState4.f9108v);
        k3();
        SavedState savedState5 = this.I;
        int i8 = savedState5.f9101o;
        if (i8 != -1) {
            this.C = i8;
            bVar.f9114c = savedState5.f9109w;
        } else {
            bVar.f9114c = this.A;
        }
        if (savedState5.f9105s > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.f9095a = savedState5.f9106t;
            lazySpanLookup.f9096b = savedState5.f9107u;
        }
    }

    private void o2(View view, LayoutParams layoutParams, r rVar) {
        if (rVar.f9549e == 1) {
            if (layoutParams.f9093f) {
                k2(view);
                return;
            } else {
                layoutParams.f9092e.a(view);
                return;
            }
        }
        if (layoutParams.f9093f) {
            f3(view);
        } else {
            layoutParams.f9092e.z(view);
        }
    }

    private void o3(int i5) {
        r rVar = this.f9089y;
        rVar.f9549e = i5;
        rVar.f9548d = this.A != (i5 == -1) ? -1 : 1;
    }

    private int p2(int i5) {
        if (Q() == 0) {
            return this.A ? 1 : -1;
        }
        return (i5 < L2()) != this.A ? -1 : 1;
    }

    private boolean r2(c cVar) {
        if (this.A) {
            if (cVar.p() < this.f9085u.i()) {
                ArrayList<View> arrayList = cVar.f9120a;
                return !cVar.s(arrayList.get(arrayList.size() - 1)).f9093f;
            }
        } else if (cVar.t() > this.f9085u.n()) {
            return !cVar.s(cVar.f9120a.get(0)).f9093f;
        }
        return false;
    }

    private int s2(RecyclerView.a0 a0Var) {
        if (Q() == 0) {
            return 0;
        }
        return c0.a(a0Var, this.f9085u, D2(!this.N), C2(!this.N), this, this.N);
    }

    private void s3(int i5, int i6) {
        for (int i7 = 0; i7 < this.f9083s; i7++) {
            if (!this.f9084t[i7].f9120a.isEmpty()) {
                y3(this.f9084t[i7], i5, i6);
            }
        }
    }

    private int t2(RecyclerView.a0 a0Var) {
        if (Q() == 0) {
            return 0;
        }
        return c0.b(a0Var, this.f9085u, D2(!this.N), C2(!this.N), this, this.N, this.A);
    }

    private boolean t3(RecyclerView.a0 a0Var, b bVar) {
        bVar.f9112a = this.G ? H2(a0Var.d()) : B2(a0Var.d());
        bVar.f9113b = Integer.MIN_VALUE;
        return true;
    }

    private int u2(RecyclerView.a0 a0Var) {
        if (Q() == 0) {
            return 0;
        }
        return c0.c(a0Var, this.f9085u, D2(!this.N), C2(!this.N), this, this.N);
    }

    private int v2(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 17 ? i5 != 33 ? i5 != 66 ? (i5 == 130 && this.f9087w == 1) ? 1 : Integer.MIN_VALUE : this.f9087w == 0 ? 1 : Integer.MIN_VALUE : this.f9087w == 1 ? -1 : Integer.MIN_VALUE : this.f9087w == 0 ? -1 : Integer.MIN_VALUE : (this.f9087w != 1 && Z2()) ? -1 : 1 : (this.f9087w != 1 && Z2()) ? 1 : -1;
    }

    private LazySpanLookup.FullSpanItem w2(int i5) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f9099q = new int[this.f9083s];
        for (int i6 = 0; i6 < this.f9083s; i6++) {
            fullSpanItem.f9099q[i6] = i5 - this.f9084t[i6].q(i5);
        }
        return fullSpanItem;
    }

    private void w3(int i5, RecyclerView.a0 a0Var) {
        int i6;
        int i7;
        int g5;
        r rVar = this.f9089y;
        boolean z5 = false;
        rVar.f9546b = 0;
        rVar.f9547c = i5;
        if (!M0() || (g5 = a0Var.g()) == -1) {
            i6 = 0;
            i7 = 0;
        } else {
            if (this.A == (g5 < i5)) {
                i6 = this.f9085u.o();
                i7 = 0;
            } else {
                i7 = this.f9085u.o();
                i6 = 0;
            }
        }
        if (U()) {
            this.f9089y.f9550f = this.f9085u.n() - i7;
            this.f9089y.f9551g = this.f9085u.i() + i6;
        } else {
            this.f9089y.f9551g = this.f9085u.h() + i6;
            this.f9089y.f9550f = -i7;
        }
        r rVar2 = this.f9089y;
        rVar2.f9552h = false;
        rVar2.f9545a = true;
        if (this.f9085u.l() == 0 && this.f9085u.h() == 0) {
            z5 = true;
        }
        rVar2.f9553i = z5;
    }

    private LazySpanLookup.FullSpanItem x2(int i5) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f9099q = new int[this.f9083s];
        for (int i6 = 0; i6 < this.f9083s; i6++) {
            fullSpanItem.f9099q[i6] = this.f9084t[i6].u(i5) - i5;
        }
        return fullSpanItem;
    }

    private void y2() {
        this.f9085u = z.b(this, this.f9087w);
        this.f9086v = z.b(this, 1 - this.f9087w);
    }

    private void y3(c cVar, int i5, int i6) {
        int o5 = cVar.o();
        if (i5 == -1) {
            if (cVar.t() + o5 <= i6) {
                this.B.set(cVar.f9124e, false);
            }
        } else if (cVar.p() - o5 >= i6) {
            this.B.set(cVar.f9124e, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int z2(RecyclerView.v vVar, r rVar, RecyclerView.a0 a0Var) {
        c cVar;
        int e6;
        int i5;
        int i6;
        int e7;
        boolean z5;
        ?? r9 = 0;
        this.B.set(0, this.f9083s, true);
        int i7 = this.f9089y.f9553i ? rVar.f9549e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : rVar.f9549e == 1 ? rVar.f9551g + rVar.f9546b : rVar.f9550f - rVar.f9546b;
        s3(rVar.f9549e, i7);
        int i8 = this.A ? this.f9085u.i() : this.f9085u.n();
        boolean z6 = false;
        while (rVar.a(a0Var) && (this.f9089y.f9553i || !this.B.isEmpty())) {
            View b6 = rVar.b(vVar);
            LayoutParams layoutParams = (LayoutParams) b6.getLayoutParams();
            int d6 = layoutParams.d();
            int g5 = this.E.g(d6);
            boolean z7 = g5 == -1 ? true : r9;
            if (z7) {
                cVar = layoutParams.f9093f ? this.f9084t[r9] : S2(rVar);
                this.E.n(d6, cVar);
            } else {
                cVar = this.f9084t[g5];
            }
            c cVar2 = cVar;
            layoutParams.f9092e = cVar2;
            if (rVar.f9549e == 1) {
                e(b6);
            } else {
                f(b6, r9);
            }
            b3(b6, layoutParams, r9);
            if (rVar.f9549e == 1) {
                int O2 = layoutParams.f9093f ? O2(i8) : cVar2.q(i8);
                int e8 = this.f9085u.e(b6) + O2;
                if (z7 && layoutParams.f9093f) {
                    LazySpanLookup.FullSpanItem w22 = w2(O2);
                    w22.f9098p = -1;
                    w22.f9097o = d6;
                    this.E.a(w22);
                }
                i5 = e8;
                e6 = O2;
            } else {
                int R2 = layoutParams.f9093f ? R2(i8) : cVar2.u(i8);
                e6 = R2 - this.f9085u.e(b6);
                if (z7 && layoutParams.f9093f) {
                    LazySpanLookup.FullSpanItem x22 = x2(R2);
                    x22.f9098p = 1;
                    x22.f9097o = d6;
                    this.E.a(x22);
                }
                i5 = R2;
            }
            if (layoutParams.f9093f && rVar.f9548d == -1) {
                if (z7) {
                    this.M = true;
                } else {
                    if (!(rVar.f9549e == 1 ? m2() : n2())) {
                        LazySpanLookup.FullSpanItem f6 = this.E.f(d6);
                        if (f6 != null) {
                            f6.f9100r = true;
                        }
                        this.M = true;
                    }
                }
            }
            o2(b6, layoutParams, rVar);
            if (Z2() && this.f9087w == 1) {
                int i9 = layoutParams.f9093f ? this.f9086v.i() : this.f9086v.i() - (((this.f9083s - 1) - cVar2.f9124e) * this.f9088x);
                e7 = i9;
                i6 = i9 - this.f9086v.e(b6);
            } else {
                int n5 = layoutParams.f9093f ? this.f9086v.n() : (cVar2.f9124e * this.f9088x) + this.f9086v.n();
                i6 = n5;
                e7 = this.f9086v.e(b6) + n5;
            }
            if (this.f9087w == 1) {
                P0(b6, i6, e6, e7, i5);
            } else {
                P0(b6, e6, i6, i5, e7);
            }
            if (layoutParams.f9093f) {
                s3(this.f9089y.f9549e, i7);
            } else {
                y3(cVar2, this.f9089y.f9549e, i7);
            }
            g3(vVar, this.f9089y);
            if (this.f9089y.f9552h && b6.hasFocusable()) {
                if (layoutParams.f9093f) {
                    this.B.clear();
                } else {
                    z5 = false;
                    this.B.set(cVar2.f9124e, false);
                    r9 = z5;
                    z6 = true;
                }
            }
            z5 = false;
            r9 = z5;
            z6 = true;
        }
        int i10 = r9;
        if (!z6) {
            g3(vVar, this.f9089y);
        }
        int n6 = this.f9089y.f9549e == -1 ? this.f9085u.n() - R2(this.f9085u.n()) : O2(this.f9085u.i()) - this.f9085u.i();
        return n6 > 0 ? Math.min(rVar.f9546b, n6) : i10;
    }

    private int z3(int i5, int i6, int i7) {
        if (i6 == 0 && i7 == 0) {
            return i5;
        }
        int mode = View.MeasureSpec.getMode(i5);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i5) - i6) - i7), mode) : i5;
    }

    public int[] A2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f9083s];
        } else if (iArr.length < this.f9083s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f9083s + ", array size:" + iArr.length);
        }
        for (int i5 = 0; i5 < this.f9083s; i5++) {
            iArr[i5] = this.f9084t[i5].f();
        }
        return iArr;
    }

    View C2(boolean z5) {
        int n5 = this.f9085u.n();
        int i5 = this.f9085u.i();
        View view = null;
        for (int Q2 = Q() - 1; Q2 >= 0; Q2--) {
            View P = P(Q2);
            int g5 = this.f9085u.g(P);
            int d6 = this.f9085u.d(P);
            if (d6 > n5 && g5 < i5) {
                if (d6 <= i5 || !z5) {
                    return P;
                }
                if (view == null) {
                    view = P;
                }
            }
        }
        return view;
    }

    View D2(boolean z5) {
        int n5 = this.f9085u.n();
        int i5 = this.f9085u.i();
        int Q2 = Q();
        View view = null;
        for (int i6 = 0; i6 < Q2; i6++) {
            View P = P(i6);
            int g5 = this.f9085u.g(P);
            if (this.f9085u.d(P) > n5 && g5 < i5) {
                if (g5 >= n5 || !z5) {
                    return P;
                }
                if (view == null) {
                    view = P;
                }
            }
        }
        return view;
    }

    int E2() {
        View C2 = this.A ? C2(true) : D2(true);
        if (C2 == null) {
            return -1;
        }
        return s0(C2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean F0() {
        return this.F != 0;
    }

    public int[] F2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f9083s];
        } else if (iArr.length < this.f9083s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f9083s + ", array size:" + iArr.length);
        }
        for (int i5 = 0; i5 < this.f9083s; i5++) {
            iArr[i5] = this.f9084t[i5].h();
        }
        return iArr;
    }

    public int[] G2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f9083s];
        } else if (iArr.length < this.f9083s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f9083s + ", array size:" + iArr.length);
        }
        for (int i5 = 0; i5 < this.f9083s; i5++) {
            iArr[i5] = this.f9084t[i5].i();
        }
        return iArr;
    }

    public int[] I2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f9083s];
        } else if (iArr.length < this.f9083s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f9083s + ", array size:" + iArr.length);
        }
        for (int i5 = 0; i5 < this.f9083s; i5++) {
            iArr[i5] = this.f9084t[i5].k();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams K() {
        return this.f9087w == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams L(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    int L2() {
        if (Q() == 0) {
            return 0;
        }
        return s0(P(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams M(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int M2() {
        return this.F;
    }

    int N2() {
        int Q2 = Q();
        if (Q2 == 0) {
            return 0;
        }
        return s0(P(Q2 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int Q1(int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return l3(i5, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void R1(int i5) {
        SavedState savedState = this.I;
        if (savedState != null && savedState.f9101o != i5) {
            savedState.a();
        }
        this.C = i5;
        this.D = Integer.MIN_VALUE;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int S1(int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return l3(i5, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void T0(int i5) {
        super.T0(i5);
        for (int i6 = 0; i6 < this.f9083s; i6++) {
            this.f9084t[i6].w(i5);
        }
    }

    public int T2() {
        return this.f9087w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void U0(int i5) {
        super.U0(i5);
        for (int i6 = 0; i6 < this.f9083s; i6++) {
            this.f9084t[i6].w(i5);
        }
    }

    public boolean U2() {
        return this.f9090z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void V0(@q0 RecyclerView.h hVar, @q0 RecyclerView.h hVar2) {
        this.E.b();
        for (int i5 = 0; i5 < this.f9083s; i5++) {
            this.f9084t[i5].e();
        }
    }

    public int V2() {
        return this.f9083s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r10 == r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
    
        if (r10 == r11) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View X2() {
        /*
            r12 = this;
            int r0 = r12.Q()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f9083s
            r2.<init>(r3)
            int r3 = r12.f9083s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f9087w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.Z2()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.P(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f9092e
            int r9 = r9.f9124e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f9092e
            boolean r9 = r12.r2(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f9092e
            int r9 = r9.f9124e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f9093f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.P(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.z r10 = r12.f9085u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.z r11 = r12.f9085u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.z r10 = r12.f9085u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.z r11 = r12.f9085u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = r8.f9092e
            int r8 = r8.f9124e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.f9092e
            int r9 = r9.f9124e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Y1(Rect rect, int i5, int i6) {
        int q5;
        int q6;
        int p02 = p0() + o0();
        int m02 = m0() + r0();
        if (this.f9087w == 1) {
            q6 = RecyclerView.LayoutManager.q(i6, rect.height() + m02, k0());
            q5 = RecyclerView.LayoutManager.q(i5, (this.f9088x * this.f9083s) + p02, l0());
        } else {
            q5 = RecyclerView.LayoutManager.q(i5, rect.width() + p02, l0());
            q6 = RecyclerView.LayoutManager.q(i6, (this.f9088x * this.f9083s) + m02, k0());
        }
        X1(q5, q6);
    }

    public void Y2() {
        this.E.b();
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void Z0(RecyclerView recyclerView, RecyclerView.v vVar) {
        Y0(recyclerView);
        H1(this.P);
        for (int i5 = 0; i5 < this.f9083s; i5++) {
            this.f9084t[i5].e();
        }
        recyclerView.requestLayout();
    }

    boolean Z2() {
        return i0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i5) {
        int p22 = p2(i5);
        PointF pointF = new PointF();
        if (p22 == 0) {
            return null;
        }
        if (this.f9087w == 0) {
            pointF.x = p22;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = p22;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @q0
    public View a1(View view, int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View I;
        View r5;
        if (Q() == 0 || (I = I(view)) == null) {
            return null;
        }
        k3();
        int v22 = v2(i5);
        if (v22 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) I.getLayoutParams();
        boolean z5 = layoutParams.f9093f;
        c cVar = layoutParams.f9092e;
        int N2 = v22 == 1 ? N2() : L2();
        w3(N2, a0Var);
        o3(v22);
        r rVar = this.f9089y;
        rVar.f9547c = rVar.f9548d + N2;
        rVar.f9546b = (int) (this.f9085u.o() * Y);
        r rVar2 = this.f9089y;
        rVar2.f9552h = true;
        rVar2.f9545a = false;
        z2(vVar, rVar2, a0Var);
        this.G = this.A;
        if (!z5 && (r5 = cVar.r(N2, v22)) != null && r5 != I) {
            return r5;
        }
        if (d3(v22)) {
            for (int i6 = this.f9083s - 1; i6 >= 0; i6--) {
                View r6 = this.f9084t[i6].r(N2, v22);
                if (r6 != null && r6 != I) {
                    return r6;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f9083s; i7++) {
                View r7 = this.f9084t[i7].r(N2, v22);
                if (r7 != null && r7 != I) {
                    return r7;
                }
            }
        }
        boolean z6 = (this.f9090z ^ true) == (v22 == -1);
        if (!z5) {
            View J = J(z6 ? cVar.g() : cVar.j());
            if (J != null && J != I) {
                return J;
            }
        }
        if (d3(v22)) {
            for (int i8 = this.f9083s - 1; i8 >= 0; i8--) {
                if (i8 != cVar.f9124e) {
                    View J2 = J(z6 ? this.f9084t[i8].g() : this.f9084t[i8].j());
                    if (J2 != null && J2 != I) {
                        return J2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f9083s; i9++) {
                View J3 = J(z6 ? this.f9084t[i9].g() : this.f9084t[i9].j());
                if (J3 != null && J3 != I) {
                    return J3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void b1(AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (Q() > 0) {
            View D2 = D2(false);
            View C2 = C2(false);
            if (D2 == null || C2 == null) {
                return;
            }
            int s02 = s0(D2);
            int s03 = s0(C2);
            if (s02 < s03) {
                accessibilityEvent.setFromIndex(s02);
                accessibilityEvent.setToIndex(s03);
            } else {
                accessibilityEvent.setFromIndex(s03);
                accessibilityEvent.setToIndex(s02);
            }
        }
    }

    void e3(int i5, RecyclerView.a0 a0Var) {
        int L2;
        int i6;
        if (i5 > 0) {
            L2 = N2();
            i6 = 1;
        } else {
            L2 = L2();
            i6 = -1;
        }
        this.f9089y.f9545a = true;
        w3(L2, a0Var);
        o3(i6);
        r rVar = this.f9089y;
        rVar.f9547c = L2 + rVar.f9548d;
        rVar.f9546b = Math.abs(i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void f2(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i5) {
        s sVar = new s(recyclerView.getContext());
        sVar.q(i5);
        g2(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void i(String str) {
        if (this.I == null) {
            super.i(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void i1(RecyclerView recyclerView, int i5, int i6) {
        W2(i5, i6, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void j1(RecyclerView recyclerView) {
        this.E.b();
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean j2() {
        return this.I == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void k1(RecyclerView recyclerView, int i5, int i6, int i7) {
        W2(i5, i6, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void l1(RecyclerView recyclerView, int i5, int i6) {
        W2(i5, i6, 2);
    }

    int l3(int i5, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (Q() == 0 || i5 == 0) {
            return 0;
        }
        e3(i5, a0Var);
        int z22 = z2(vVar, this.f9089y, a0Var);
        if (this.f9089y.f9546b >= z22) {
            i5 = i5 < 0 ? -z22 : z22;
        }
        this.f9085u.t(-i5);
        this.G = this.A;
        r rVar = this.f9089y;
        rVar.f9546b = 0;
        g3(vVar, rVar);
        return i5;
    }

    boolean m2() {
        int q5 = this.f9084t[0].q(Integer.MIN_VALUE);
        for (int i5 = 1; i5 < this.f9083s; i5++) {
            if (this.f9084t[i5].q(Integer.MIN_VALUE) != q5) {
                return false;
            }
        }
        return true;
    }

    public void m3(int i5, int i6) {
        SavedState savedState = this.I;
        if (savedState != null) {
            savedState.a();
        }
        this.C = i5;
        this.D = i6;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean n() {
        return this.f9087w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void n1(RecyclerView recyclerView, int i5, int i6, Object obj) {
        W2(i5, i6, 4);
    }

    boolean n2() {
        int u5 = this.f9084t[0].u(Integer.MIN_VALUE);
        for (int i5 = 1; i5 < this.f9083s; i5++) {
            if (this.f9084t[i5].u(Integer.MIN_VALUE) != u5) {
                return false;
            }
        }
        return true;
    }

    public void n3(int i5) {
        i(null);
        if (i5 == this.F) {
            return;
        }
        if (i5 != 0 && i5 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.F = i5;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean o() {
        return this.f9087w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void o1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        c3(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean p(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void p1(RecyclerView.a0 a0Var) {
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public void p3(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        i(null);
        if (i5 == this.f9087w) {
            return;
        }
        this.f9087w = i5;
        z zVar = this.f9085u;
        this.f9085u = this.f9086v;
        this.f9086v = zVar;
        N1();
    }

    boolean q2() {
        int L2;
        int N2;
        if (Q() == 0 || this.F == 0 || !E0()) {
            return false;
        }
        if (this.A) {
            L2 = N2();
            N2 = L2();
        } else {
            L2 = L2();
            N2 = N2();
        }
        if (L2 == 0 && X2() != null) {
            this.E.b();
            O1();
            N1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i5 = this.A ? -1 : 1;
        int i6 = N2 + 1;
        LazySpanLookup.FullSpanItem e6 = this.E.e(L2, i6, i5, true);
        if (e6 == null) {
            this.M = false;
            this.E.d(i6);
            return false;
        }
        LazySpanLookup.FullSpanItem e7 = this.E.e(L2, e6.f9097o, i5 * (-1), true);
        if (e7 == null) {
            this.E.d(e6.f9097o);
        } else {
            this.E.d(e7.f9097o + 1);
        }
        O1();
        N1();
        return true;
    }

    public void q3(boolean z5) {
        i(null);
        SavedState savedState = this.I;
        if (savedState != null && savedState.f9108v != z5) {
            savedState.f9108v = z5;
        }
        this.f9090z = z5;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @c1({c1.a.LIBRARY})
    public void r(int i5, int i6, RecyclerView.a0 a0Var, RecyclerView.LayoutManager.c cVar) {
        int q5;
        int i7;
        if (this.f9087w != 0) {
            i5 = i6;
        }
        if (Q() == 0 || i5 == 0) {
            return;
        }
        e3(i5, a0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f9083s) {
            this.O = new int[this.f9083s];
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9083s; i9++) {
            r rVar = this.f9089y;
            if (rVar.f9548d == -1) {
                q5 = rVar.f9550f;
                i7 = this.f9084t[i9].u(q5);
            } else {
                q5 = this.f9084t[i9].q(rVar.f9551g);
                i7 = this.f9089y.f9551g;
            }
            int i10 = q5 - i7;
            if (i10 >= 0) {
                this.O[i8] = i10;
                i8++;
            }
        }
        Arrays.sort(this.O, 0, i8);
        for (int i11 = 0; i11 < i8 && this.f9089y.a(a0Var); i11++) {
            cVar.a(this.f9089y.f9547c, this.O[i11]);
            r rVar2 = this.f9089y;
            rVar2.f9547c += rVar2.f9548d;
        }
    }

    public void r3(int i5) {
        i(null);
        if (i5 != this.f9083s) {
            Y2();
            this.f9083s = i5;
            this.B = new BitSet(this.f9083s);
            this.f9084t = new c[this.f9083s];
            for (int i6 = 0; i6 < this.f9083s; i6++) {
                this.f9084t[i6] = new c(i6);
            }
            N1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int t(RecyclerView.a0 a0Var) {
        return s2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void t1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.I = savedState;
            if (this.C != -1) {
                savedState.a();
                this.I.b();
            }
            N1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int u(RecyclerView.a0 a0Var) {
        return t2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable u1() {
        int u5;
        int n5;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.f9108v = this.f9090z;
        savedState.f9109w = this.G;
        savedState.f9110x = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f9095a) == null) {
            savedState.f9105s = 0;
        } else {
            savedState.f9106t = iArr;
            savedState.f9105s = iArr.length;
            savedState.f9107u = lazySpanLookup.f9096b;
        }
        if (Q() > 0) {
            savedState.f9101o = this.G ? N2() : L2();
            savedState.f9102p = E2();
            int i5 = this.f9083s;
            savedState.f9103q = i5;
            savedState.f9104r = new int[i5];
            for (int i6 = 0; i6 < this.f9083s; i6++) {
                if (this.G) {
                    u5 = this.f9084t[i6].q(Integer.MIN_VALUE);
                    if (u5 != Integer.MIN_VALUE) {
                        n5 = this.f9085u.i();
                        u5 -= n5;
                        savedState.f9104r[i6] = u5;
                    } else {
                        savedState.f9104r[i6] = u5;
                    }
                } else {
                    u5 = this.f9084t[i6].u(Integer.MIN_VALUE);
                    if (u5 != Integer.MIN_VALUE) {
                        n5 = this.f9085u.n();
                        u5 -= n5;
                        savedState.f9104r[i6] = u5;
                    } else {
                        savedState.f9104r[i6] = u5;
                    }
                }
            }
        } else {
            savedState.f9101o = -1;
            savedState.f9102p = -1;
            savedState.f9103q = 0;
        }
        return savedState;
    }

    boolean u3(RecyclerView.a0 a0Var, b bVar) {
        int i5;
        if (!a0Var.j() && (i5 = this.C) != -1) {
            if (i5 >= 0 && i5 < a0Var.d()) {
                SavedState savedState = this.I;
                if (savedState == null || savedState.f9101o == -1 || savedState.f9103q < 1) {
                    View J = J(this.C);
                    if (J != null) {
                        bVar.f9112a = this.A ? N2() : L2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f9114c) {
                                bVar.f9113b = (this.f9085u.i() - this.D) - this.f9085u.d(J);
                            } else {
                                bVar.f9113b = (this.f9085u.n() + this.D) - this.f9085u.g(J);
                            }
                            return true;
                        }
                        if (this.f9085u.e(J) > this.f9085u.o()) {
                            bVar.f9113b = bVar.f9114c ? this.f9085u.i() : this.f9085u.n();
                            return true;
                        }
                        int g5 = this.f9085u.g(J) - this.f9085u.n();
                        if (g5 < 0) {
                            bVar.f9113b = -g5;
                            return true;
                        }
                        int i6 = this.f9085u.i() - this.f9085u.d(J);
                        if (i6 < 0) {
                            bVar.f9113b = i6;
                            return true;
                        }
                        bVar.f9113b = Integer.MIN_VALUE;
                    } else {
                        int i7 = this.C;
                        bVar.f9112a = i7;
                        int i8 = this.D;
                        if (i8 == Integer.MIN_VALUE) {
                            bVar.f9114c = p2(i7) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i8);
                        }
                        bVar.f9115d = true;
                    }
                } else {
                    bVar.f9113b = Integer.MIN_VALUE;
                    bVar.f9112a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int v(RecyclerView.a0 a0Var) {
        return u2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void v1(int i5) {
        if (i5 == 0) {
            q2();
        }
    }

    void v3(RecyclerView.a0 a0Var, b bVar) {
        if (u3(a0Var, bVar) || t3(a0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f9112a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int w(RecyclerView.a0 a0Var) {
        return s2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int x(RecyclerView.a0 a0Var) {
        return t2(a0Var);
    }

    void x3(int i5) {
        this.f9088x = i5 / this.f9083s;
        this.J = View.MeasureSpec.makeMeasureSpec(i5, this.f9086v.l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int y(RecyclerView.a0 a0Var) {
        return u2(a0Var);
    }

    /* loaded from: classes.dex */
    static class LazySpanLookup {

        /* renamed from: c, reason: collision with root package name */
        private static final int f9094c = 10;

        /* renamed from: a, reason: collision with root package name */
        int[] f9095a;

        /* renamed from: b, reason: collision with root package name */
        List<FullSpanItem> f9096b;

        LazySpanLookup() {
        }

        private int i(int i5) {
            if (this.f9096b == null) {
                return -1;
            }
            FullSpanItem f6 = f(i5);
            if (f6 != null) {
                this.f9096b.remove(f6);
            }
            int size = this.f9096b.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    i6 = -1;
                    break;
                }
                if (this.f9096b.get(i6).f9097o >= i5) {
                    break;
                }
                i6++;
            }
            if (i6 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f9096b.get(i6);
            this.f9096b.remove(i6);
            return fullSpanItem.f9097o;
        }

        private void l(int i5, int i6) {
            List<FullSpanItem> list = this.f9096b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f9096b.get(size);
                int i7 = fullSpanItem.f9097o;
                if (i7 >= i5) {
                    fullSpanItem.f9097o = i7 + i6;
                }
            }
        }

        private void m(int i5, int i6) {
            List<FullSpanItem> list = this.f9096b;
            if (list == null) {
                return;
            }
            int i7 = i5 + i6;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f9096b.get(size);
                int i8 = fullSpanItem.f9097o;
                if (i8 >= i5) {
                    if (i8 < i7) {
                        this.f9096b.remove(size);
                    } else {
                        fullSpanItem.f9097o = i8 - i6;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f9096b == null) {
                this.f9096b = new ArrayList();
            }
            int size = this.f9096b.size();
            for (int i5 = 0; i5 < size; i5++) {
                FullSpanItem fullSpanItem2 = this.f9096b.get(i5);
                if (fullSpanItem2.f9097o == fullSpanItem.f9097o) {
                    this.f9096b.remove(i5);
                }
                if (fullSpanItem2.f9097o >= fullSpanItem.f9097o) {
                    this.f9096b.add(i5, fullSpanItem);
                    return;
                }
            }
            this.f9096b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.f9095a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f9096b = null;
        }

        void c(int i5) {
            int[] iArr = this.f9095a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i5, 10) + 1];
                this.f9095a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i5 >= iArr.length) {
                int[] iArr3 = new int[o(i5)];
                this.f9095a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f9095a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i5) {
            List<FullSpanItem> list = this.f9096b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f9096b.get(size).f9097o >= i5) {
                        this.f9096b.remove(size);
                    }
                }
            }
            return h(i5);
        }

        public FullSpanItem e(int i5, int i6, int i7, boolean z5) {
            List<FullSpanItem> list = this.f9096b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                FullSpanItem fullSpanItem = this.f9096b.get(i8);
                int i9 = fullSpanItem.f9097o;
                if (i9 >= i6) {
                    return null;
                }
                if (i9 >= i5 && (i7 == 0 || fullSpanItem.f9098p == i7 || (z5 && fullSpanItem.f9100r))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i5) {
            List<FullSpanItem> list = this.f9096b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f9096b.get(size);
                if (fullSpanItem.f9097o == i5) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i5) {
            int[] iArr = this.f9095a;
            if (iArr == null || i5 >= iArr.length) {
                return -1;
            }
            return iArr[i5];
        }

        int h(int i5) {
            int[] iArr = this.f9095a;
            if (iArr == null || i5 >= iArr.length) {
                return -1;
            }
            int i6 = i(i5);
            if (i6 == -1) {
                int[] iArr2 = this.f9095a;
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                return this.f9095a.length;
            }
            int min = Math.min(i6 + 1, this.f9095a.length);
            Arrays.fill(this.f9095a, i5, min, -1);
            return min;
        }

        void j(int i5, int i6) {
            int[] iArr = this.f9095a;
            if (iArr == null || i5 >= iArr.length) {
                return;
            }
            int i7 = i5 + i6;
            c(i7);
            int[] iArr2 = this.f9095a;
            System.arraycopy(iArr2, i5, iArr2, i7, (iArr2.length - i5) - i6);
            Arrays.fill(this.f9095a, i5, i7, -1);
            l(i5, i6);
        }

        void k(int i5, int i6) {
            int[] iArr = this.f9095a;
            if (iArr == null || i5 >= iArr.length) {
                return;
            }
            int i7 = i5 + i6;
            c(i7);
            int[] iArr2 = this.f9095a;
            System.arraycopy(iArr2, i7, iArr2, i5, (iArr2.length - i5) - i6);
            int[] iArr3 = this.f9095a;
            Arrays.fill(iArr3, iArr3.length - i6, iArr3.length, -1);
            m(i5, i6);
        }

        void n(int i5, c cVar) {
            c(i5);
            this.f9095a[i5] = cVar.f9124e;
        }

        int o(int i5) {
            int length = this.f9095a.length;
            while (length <= i5) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: o, reason: collision with root package name */
            int f9097o;

            /* renamed from: p, reason: collision with root package name */
            int f9098p;

            /* renamed from: q, reason: collision with root package name */
            int[] f9099q;

            /* renamed from: r, reason: collision with root package name */
            boolean f9100r;

            class a implements Parcelable.Creator<FullSpanItem> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i5) {
                    return new FullSpanItem[i5];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f9097o = parcel.readInt();
                this.f9098p = parcel.readInt();
                this.f9100r = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f9099q = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i5) {
                int[] iArr = this.f9099q;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i5];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f9097o + ", mGapDir=" + this.f9098p + ", mHasUnwantedGapAfter=" + this.f9100r + ", mGapPerSpan=" + Arrays.toString(this.f9099q) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i5) {
                parcel.writeInt(this.f9097o);
                parcel.writeInt(this.f9098p);
                parcel.writeInt(this.f9100r ? 1 : 0);
                int[] iArr = this.f9099q;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f9099q);
                }
            }

            FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i5, int i6) {
        this.f9087w = i6;
        r3(i5);
        this.f9089y = new r();
        y2();
    }
}
