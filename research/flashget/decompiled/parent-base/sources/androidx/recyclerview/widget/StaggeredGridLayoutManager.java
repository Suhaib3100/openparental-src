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
import androidx.compose.runtime.z4;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes3.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.z.b {
    static final boolean A = false;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 0;

    @Deprecated
    public static final int E = 1;
    public static final int F = 2;
    static final int G = Integer.MIN_VALUE;
    private static final float H = 0.33333334f;

    /* renamed from: z, reason: collision with root package name */
    private static final String f32967z = "StaggeredGridLManager";

    /* renamed from: c, reason: collision with root package name */
    c[] f32969c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    z f32970d;

    /* renamed from: e, reason: collision with root package name */
    @o0
    z f32971e;

    /* renamed from: f, reason: collision with root package name */
    private int f32972f;

    /* renamed from: g, reason: collision with root package name */
    private int f32973g;

    /* renamed from: h, reason: collision with root package name */
    @o0
    private final r f32974h;

    /* renamed from: k, reason: collision with root package name */
    private BitSet f32977k;

    /* renamed from: p, reason: collision with root package name */
    private boolean f32982p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f32983q;

    /* renamed from: r, reason: collision with root package name */
    private SavedState f32984r;

    /* renamed from: s, reason: collision with root package name */
    private int f32985s;

    /* renamed from: x, reason: collision with root package name */
    private int[] f32990x;

    /* renamed from: b, reason: collision with root package name */
    private int f32968b = -1;

    /* renamed from: i, reason: collision with root package name */
    boolean f32975i = false;

    /* renamed from: j, reason: collision with root package name */
    boolean f32976j = false;

    /* renamed from: l, reason: collision with root package name */
    int f32978l = -1;

    /* renamed from: m, reason: collision with root package name */
    int f32979m = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    LazySpanLookup f32980n = new LazySpanLookup();

    /* renamed from: o, reason: collision with root package name */
    private int f32981o = 2;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f32986t = new Rect();

    /* renamed from: u, reason: collision with root package name */
    private final b f32987u = new b();

    /* renamed from: v, reason: collision with root package name */
    private boolean f32988v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f32989w = true;

    /* renamed from: y, reason: collision with root package name */
    private final Runnable f32991y = new a();

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: h, reason: collision with root package name */
        public static final int f32992h = -1;

        /* renamed from: f, reason: collision with root package name */
        c f32993f;

        /* renamed from: g, reason: collision with root package name */
        boolean f32994g;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int k() {
            c cVar = this.f32993f;
            if (cVar == null) {
                return -1;
            }
            return cVar.f33025e;
        }

        public boolean n() {
            return this.f32994g;
        }

        public void o(boolean z4) {
            this.f32994g = z4;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
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
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        int f33002b;

        /* renamed from: c, reason: collision with root package name */
        int f33003c;

        /* renamed from: d, reason: collision with root package name */
        int f33004d;

        /* renamed from: e, reason: collision with root package name */
        int[] f33005e;

        /* renamed from: f, reason: collision with root package name */
        int f33006f;

        /* renamed from: g, reason: collision with root package name */
        int[] f33007g;

        /* renamed from: h, reason: collision with root package name */
        List<LazySpanLookup.FullSpanItem> f33008h;

        /* renamed from: i, reason: collision with root package name */
        boolean f33009i;

        /* renamed from: j, reason: collision with root package name */
        boolean f33010j;

        /* renamed from: k, reason: collision with root package name */
        boolean f33011k;

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
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public SavedState() {
        }

        void a() {
            this.f33005e = null;
            this.f33004d = 0;
            this.f33002b = -1;
            this.f33003c = -1;
        }

        void b() {
            this.f33005e = null;
            this.f33004d = 0;
            this.f33006f = 0;
            this.f33007g = null;
            this.f33008h = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f33002b);
            parcel.writeInt(this.f33003c);
            parcel.writeInt(this.f33004d);
            if (this.f33004d > 0) {
                parcel.writeIntArray(this.f33005e);
            }
            parcel.writeInt(this.f33006f);
            if (this.f33006f > 0) {
                parcel.writeIntArray(this.f33007g);
            }
            parcel.writeInt(this.f33009i ? 1 : 0);
            parcel.writeInt(this.f33010j ? 1 : 0);
            parcel.writeInt(this.f33011k ? 1 : 0);
            parcel.writeList(this.f33008h);
        }

        SavedState(Parcel parcel) {
            this.f33002b = parcel.readInt();
            this.f33003c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f33004d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f33005e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f33006f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f33007g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f33009i = parcel.readInt() == 1;
            this.f33010j = parcel.readInt() == 1;
            this.f33011k = parcel.readInt() == 1;
            this.f33008h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f33004d = savedState.f33004d;
            this.f33002b = savedState.f33002b;
            this.f33003c = savedState.f33003c;
            this.f33005e = savedState.f33005e;
            this.f33006f = savedState.f33006f;
            this.f33007g = savedState.f33007g;
            this.f33009i = savedState.f33009i;
            this.f33010j = savedState.f33010j;
            this.f33011k = savedState.f33011k;
            this.f33008h = savedState.f33008h;
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.I();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f33013a;

        /* renamed from: b, reason: collision with root package name */
        int f33014b;

        /* renamed from: c, reason: collision with root package name */
        boolean f33015c;

        /* renamed from: d, reason: collision with root package name */
        boolean f33016d;

        /* renamed from: e, reason: collision with root package name */
        boolean f33017e;

        /* renamed from: f, reason: collision with root package name */
        int[] f33018f;

        b() {
            c();
        }

        void a() {
            this.f33014b = this.f33015c ? StaggeredGridLayoutManager.this.f32970d.i() : StaggeredGridLayoutManager.this.f32970d.n();
        }

        void b(int i4) {
            if (this.f33015c) {
                this.f33014b = StaggeredGridLayoutManager.this.f32970d.i() - i4;
            } else {
                this.f33014b = StaggeredGridLayoutManager.this.f32970d.n() + i4;
            }
        }

        void c() {
            this.f33013a = -1;
            this.f33014b = Integer.MIN_VALUE;
            this.f33015c = false;
            this.f33016d = false;
            this.f33017e = false;
            int[] iArr = this.f33018f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(c[] cVarArr) {
            int length = cVarArr.length;
            int[] iArr = this.f33018f;
            if (iArr == null || iArr.length < length) {
                this.f33018f = new int[StaggeredGridLayoutManager.this.f32969c.length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                this.f33018f[i4] = cVarArr[i4].u(Integer.MIN_VALUE);
            }
        }
    }

    class c {

        /* renamed from: g, reason: collision with root package name */
        static final int f33020g = Integer.MIN_VALUE;

        /* renamed from: a, reason: collision with root package name */
        ArrayList<View> f33021a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        int f33022b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f33023c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f33024d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f33025e;

        c(int i4) {
            this.f33025e = i4;
        }

        void A(int i4) {
            this.f33022b = i4;
            this.f33023c = i4;
        }

        void a(View view) {
            LayoutParams s4 = s(view);
            s4.f32993f = this;
            this.f33021a.add(view);
            this.f33023c = Integer.MIN_VALUE;
            if (this.f33021a.size() == 1) {
                this.f33022b = Integer.MIN_VALUE;
            }
            if (s4.g() || s4.f()) {
                this.f33024d = StaggeredGridLayoutManager.this.f32970d.e(view) + this.f33024d;
            }
        }

        void b(boolean z4, int i4) {
            int q4 = z4 ? q(Integer.MIN_VALUE) : u(Integer.MIN_VALUE);
            e();
            if (q4 == Integer.MIN_VALUE) {
                return;
            }
            if (!z4 || q4 >= StaggeredGridLayoutManager.this.f32970d.i()) {
                if (z4 || q4 <= StaggeredGridLayoutManager.this.f32970d.n()) {
                    if (i4 != Integer.MIN_VALUE) {
                        q4 += i4;
                    }
                    this.f33023c = q4;
                    this.f33022b = q4;
                }
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem f4;
            View view = (View) z4.a(this.f33021a, 1);
            LayoutParams s4 = s(view);
            this.f33023c = StaggeredGridLayoutManager.this.f32970d.d(view);
            if (s4.f32994g && (f4 = StaggeredGridLayoutManager.this.f32980n.f(s4.d())) != null && f4.f32999c == 1) {
                this.f33023c += f4.a(this.f33025e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem f4;
            View view = this.f33021a.get(0);
            LayoutParams s4 = s(view);
            this.f33022b = StaggeredGridLayoutManager.this.f32970d.g(view);
            if (s4.f32994g && (f4 = StaggeredGridLayoutManager.this.f32980n.f(s4.d())) != null && f4.f32999c == -1) {
                this.f33022b -= f4.a(this.f33025e);
            }
        }

        void e() {
            this.f33021a.clear();
            v();
            this.f33024d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f32975i ? n(this.f33021a.size() - 1, -1, true) : n(0, this.f33021a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f32975i ? m(this.f33021a.size() - 1, -1, true) : m(0, this.f33021a.size(), true);
        }

        public int h() {
            return StaggeredGridLayoutManager.this.f32975i ? n(this.f33021a.size() - 1, -1, false) : n(0, this.f33021a.size(), false);
        }

        public int i() {
            return StaggeredGridLayoutManager.this.f32975i ? n(0, this.f33021a.size(), true) : n(this.f33021a.size() - 1, -1, true);
        }

        public int j() {
            return StaggeredGridLayoutManager.this.f32975i ? m(0, this.f33021a.size(), true) : m(this.f33021a.size() - 1, -1, true);
        }

        public int k() {
            return StaggeredGridLayoutManager.this.f32975i ? n(0, this.f33021a.size(), false) : n(this.f33021a.size() - 1, -1, false);
        }

        int l(int i4, int i5, boolean z4, boolean z5, boolean z6) {
            int n4 = StaggeredGridLayoutManager.this.f32970d.n();
            int i6 = StaggeredGridLayoutManager.this.f32970d.i();
            int i7 = i5 > i4 ? 1 : -1;
            while (i4 != i5) {
                View view = this.f33021a.get(i4);
                int g4 = StaggeredGridLayoutManager.this.f32970d.g(view);
                int d5 = StaggeredGridLayoutManager.this.f32970d.d(view);
                boolean z7 = false;
                boolean z10 = !z6 ? g4 >= i6 : g4 > i6;
                if (!z6 ? d5 > n4 : d5 >= n4) {
                    z7 = true;
                }
                if (z10 && z7) {
                    if (z4 && z5) {
                        if (g4 >= n4 && d5 <= i6) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z5) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (g4 < n4 || d5 > i6) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i4 += i7;
            }
            return -1;
        }

        int m(int i4, int i5, boolean z4) {
            return l(i4, i5, false, false, z4);
        }

        int n(int i4, int i5, boolean z4) {
            return l(i4, i5, z4, true, false);
        }

        public int o() {
            return this.f33024d;
        }

        int p() {
            int i4 = this.f33023c;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            c();
            return this.f33023c;
        }

        int q(int i4) {
            int i5 = this.f33023c;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f33021a.size() == 0) {
                return i4;
            }
            c();
            return this.f33023c;
        }

        public View r(int i4, int i5) {
            View view = null;
            if (i5 != -1) {
                int size = this.f33021a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f33021a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f32975i && staggeredGridLayoutManager.getPosition(view2) >= i4) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f32975i && staggeredGridLayoutManager2.getPosition(view2) <= i4) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f33021a.size();
                int i6 = 0;
                while (i6 < size2) {
                    View view3 = this.f33021a.get(i6);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f32975i && staggeredGridLayoutManager3.getPosition(view3) <= i4) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f32975i && staggeredGridLayoutManager4.getPosition(view3) >= i4) || !view3.hasFocusable()) {
                        break;
                    }
                    i6++;
                    view = view3;
                }
            }
            return view;
        }

        LayoutParams s(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        int t() {
            int i4 = this.f33022b;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            d();
            return this.f33022b;
        }

        int u(int i4) {
            int i5 = this.f33022b;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f33021a.size() == 0) {
                return i4;
            }
            d();
            return this.f33022b;
        }

        void v() {
            this.f33022b = Integer.MIN_VALUE;
            this.f33023c = Integer.MIN_VALUE;
        }

        void w(int i4) {
            int i5 = this.f33022b;
            if (i5 != Integer.MIN_VALUE) {
                this.f33022b = i5 + i4;
            }
            int i6 = this.f33023c;
            if (i6 != Integer.MIN_VALUE) {
                this.f33023c = i6 + i4;
            }
        }

        void x() {
            int size = this.f33021a.size();
            View remove = this.f33021a.remove(size - 1);
            LayoutParams s4 = s(remove);
            s4.f32993f = null;
            if (s4.g() || s4.f()) {
                this.f33024d -= StaggeredGridLayoutManager.this.f32970d.e(remove);
            }
            if (size == 1) {
                this.f33022b = Integer.MIN_VALUE;
            }
            this.f33023c = Integer.MIN_VALUE;
        }

        void y() {
            View remove = this.f33021a.remove(0);
            LayoutParams s4 = s(remove);
            s4.f32993f = null;
            if (this.f33021a.size() == 0) {
                this.f33023c = Integer.MIN_VALUE;
            }
            if (s4.g() || s4.f()) {
                this.f33024d -= StaggeredGridLayoutManager.this.f32970d.e(remove);
            }
            this.f33022b = Integer.MIN_VALUE;
        }

        void z(View view) {
            LayoutParams s4 = s(view);
            s4.f32993f = this;
            this.f33021a.add(0, view);
            this.f33022b = Integer.MIN_VALUE;
            if (this.f33021a.size() == 1) {
                this.f33023c = Integer.MIN_VALUE;
            }
            if (s4.g() || s4.f()) {
                this.f33024d = StaggeredGridLayoutManager.this.f32970d.e(view) + this.f33024d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i4, i5);
        setOrientation(properties.f32886a);
        x0(properties.f32887b);
        setReverseLayout(properties.f32888c);
        this.f32974h = new r();
        M();
    }

    private void C(View view) {
        for (int i4 = this.f32968b - 1; i4 >= 0; i4--) {
            this.f32969c[i4].a(view);
        }
    }

    private void C0(int i4, RecyclerView.a0 a0Var) {
        int i5;
        int i6;
        int g4;
        r rVar = this.f32974h;
        boolean z4 = false;
        rVar.f33429b = 0;
        rVar.f33430c = i4;
        if (!isSmoothScrolling() || (g4 = a0Var.g()) == -1) {
            i5 = 0;
            i6 = 0;
        } else {
            if (this.f32976j == (g4 < i4)) {
                i5 = this.f32970d.o();
                i6 = 0;
            } else {
                i6 = this.f32970d.o();
                i5 = 0;
            }
        }
        if (getClipToPadding()) {
            this.f32974h.f33433f = this.f32970d.n() - i6;
            this.f32974h.f33434g = this.f32970d.i() + i5;
        } else {
            this.f32974h.f33434g = this.f32970d.h() + i5;
            this.f32974h.f33433f = -i6;
        }
        r rVar2 = this.f32974h;
        rVar2.f33435h = false;
        rVar2.f33428a = true;
        if (this.f32970d.l() == 0 && this.f32970d.h() == 0) {
            z4 = true;
        }
        rVar2.f33436i = z4;
    }

    private void D(b bVar) {
        SavedState savedState = this.f32984r;
        int i4 = savedState.f33004d;
        if (i4 > 0) {
            if (i4 == this.f32968b) {
                for (int i5 = 0; i5 < this.f32968b; i5++) {
                    this.f32969c[i5].e();
                    SavedState savedState2 = this.f32984r;
                    int i6 = savedState2.f33005e[i5];
                    if (i6 != Integer.MIN_VALUE) {
                        i6 += savedState2.f33010j ? this.f32970d.i() : this.f32970d.n();
                    }
                    this.f32969c[i5].A(i6);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.f32984r;
                savedState3.f33002b = savedState3.f33003c;
            }
        }
        SavedState savedState4 = this.f32984r;
        this.f32983q = savedState4.f33011k;
        setReverseLayout(savedState4.f33009i);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.f32984r;
        int i7 = savedState5.f33002b;
        if (i7 != -1) {
            this.f32978l = i7;
            bVar.f33015c = savedState5.f33010j;
        } else {
            bVar.f33015c = this.f32976j;
        }
        if (savedState5.f33006f > 1) {
            LazySpanLookup lazySpanLookup = this.f32980n;
            lazySpanLookup.f32996a = savedState5.f33007g;
            lazySpanLookup.f32997b = savedState5.f33008h;
        }
    }

    private void E0(c cVar, int i4, int i5) {
        int o4 = cVar.o();
        if (i4 == -1) {
            if (cVar.t() + o4 <= i5) {
                this.f32977k.set(cVar.f33025e, false);
            }
        } else if (cVar.p() - o4 >= i5) {
            this.f32977k.set(cVar.f33025e, false);
        }
    }

    private int F0(int i4, int i5, int i6) {
        if (i5 == 0 && i6 == 0) {
            return i4;
        }
        int mode = View.MeasureSpec.getMode(i4);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i5) - i6), mode) : i4;
    }

    private void G(View view, LayoutParams layoutParams, r rVar) {
        if (rVar.f33432e == 1) {
            if (layoutParams.f32994g) {
                C(view);
                return;
            } else {
                layoutParams.f32993f.a(view);
                return;
            }
        }
        if (layoutParams.f32994g) {
            q0(view);
        } else {
            layoutParams.f32993f.z(view);
        }
    }

    private int H(int i4) {
        if (getChildCount() == 0) {
            return this.f32976j ? 1 : -1;
        }
        return (i4 < Z()) != this.f32976j ? -1 : 1;
    }

    private boolean J(c cVar) {
        if (this.f32976j) {
            if (cVar.p() < this.f32970d.i()) {
                return !cVar.s((View) z4.a(cVar.f33021a, 1)).f32994g;
            }
        } else if (cVar.t() > this.f32970d.n()) {
            return !cVar.s(cVar.f33021a.get(0)).f32994g;
        }
        return false;
    }

    private LazySpanLookup.FullSpanItem K(int i4) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f33000d = new int[this.f32968b];
        for (int i5 = 0; i5 < this.f32968b; i5++) {
            fullSpanItem.f33000d[i5] = i4 - this.f32969c[i5].q(i4);
        }
        return fullSpanItem;
    }

    private LazySpanLookup.FullSpanItem L(int i4) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f33000d = new int[this.f32968b];
        for (int i5 = 0; i5 < this.f32968b; i5++) {
            fullSpanItem.f33000d[i5] = this.f32969c[i5].u(i4) - i4;
        }
        return fullSpanItem;
    }

    private void M() {
        this.f32970d = z.b(this, this.f32972f);
        this.f32971e = z.b(this, 1 - this.f32972f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int N(RecyclerView.v vVar, r rVar, RecyclerView.a0 a0Var) {
        c cVar;
        int e4;
        int i4;
        int i5;
        int e5;
        boolean z4;
        ?? r92 = 0;
        this.f32977k.set(0, this.f32968b, true);
        int i6 = this.f32974h.f33436i ? rVar.f33432e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : rVar.f33432e == 1 ? rVar.f33434g + rVar.f33429b : rVar.f33433f - rVar.f33429b;
        y0(rVar.f33432e, i6);
        int i7 = this.f32976j ? this.f32970d.i() : this.f32970d.n();
        boolean z5 = false;
        while (rVar.a(a0Var) && (this.f32974h.f33436i || !this.f32977k.isEmpty())) {
            View b5 = rVar.b(vVar);
            LayoutParams layoutParams = (LayoutParams) b5.getLayoutParams();
            int d5 = layoutParams.d();
            int g4 = this.f32980n.g(d5);
            boolean z6 = g4 == -1 ? true : r92;
            if (z6) {
                cVar = layoutParams.f32994g ? this.f32969c[r92] : g0(rVar);
                this.f32980n.n(d5, cVar);
            } else {
                cVar = this.f32969c[g4];
            }
            c cVar2 = cVar;
            layoutParams.f32993f = cVar2;
            if (rVar.f33432e == 1) {
                addView(b5);
            } else {
                addView(b5, r92);
            }
            m0(b5, layoutParams, r92);
            if (rVar.f33432e == 1) {
                int c02 = layoutParams.f32994g ? c0(i7) : cVar2.q(i7);
                int e6 = this.f32970d.e(b5) + c02;
                if (z6 && layoutParams.f32994g) {
                    LazySpanLookup.FullSpanItem K = K(c02);
                    K.f32999c = -1;
                    K.f32998b = d5;
                    this.f32980n.a(K);
                }
                i4 = e6;
                e4 = c02;
            } else {
                int f02 = layoutParams.f32994g ? f0(i7) : cVar2.u(i7);
                e4 = f02 - this.f32970d.e(b5);
                if (z6 && layoutParams.f32994g) {
                    LazySpanLookup.FullSpanItem L = L(f02);
                    L.f32999c = 1;
                    L.f32998b = d5;
                    this.f32980n.a(L);
                }
                i4 = f02;
            }
            if (layoutParams.f32994g && rVar.f33431d == -1) {
                if (z6) {
                    this.f32988v = true;
                } else {
                    if (!(rVar.f33432e == 1 ? E() : F())) {
                        LazySpanLookup.FullSpanItem f4 = this.f32980n.f(d5);
                        if (f4 != null) {
                            f4.f33001e = true;
                        }
                        this.f32988v = true;
                    }
                }
            }
            G(b5, layoutParams, rVar);
            if (isLayoutRTL() && this.f32972f == 1) {
                int i10 = layoutParams.f32994g ? this.f32971e.i() : this.f32971e.i() - (((this.f32968b - 1) - cVar2.f33025e) * this.f32973g);
                e5 = i10;
                i5 = i10 - this.f32971e.e(b5);
            } else {
                int n4 = layoutParams.f32994g ? this.f32971e.n() : (cVar2.f33025e * this.f32973g) + this.f32971e.n();
                i5 = n4;
                e5 = this.f32971e.e(b5) + n4;
            }
            if (this.f32972f == 1) {
                layoutDecoratedWithMargins(b5, i5, e4, e5, i4);
            } else {
                layoutDecoratedWithMargins(b5, e4, i5, i4, e5);
            }
            if (layoutParams.f32994g) {
                y0(this.f32974h.f33432e, i6);
            } else {
                E0(cVar2, this.f32974h.f33432e, i6);
            }
            r0(vVar, this.f32974h);
            if (this.f32974h.f33435h && b5.hasFocusable()) {
                if (layoutParams.f32994g) {
                    this.f32977k.clear();
                } else {
                    z4 = false;
                    this.f32977k.set(cVar2.f33025e, false);
                    r92 = z4;
                    z5 = true;
                }
            }
            z4 = false;
            r92 = z4;
            z5 = true;
        }
        int i11 = r92;
        if (!z5) {
            r0(vVar, this.f32974h);
        }
        int n5 = this.f32974h.f33432e == -1 ? this.f32970d.n() - f0(this.f32970d.n()) : c0(this.f32970d.i()) - this.f32970d.i();
        return n5 > 0 ? Math.min(rVar.f33429b, n5) : i11;
    }

    private int P(int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            int position = getPosition(getChildAt(i5));
            if (position >= 0 && position < i4) {
                return position;
            }
        }
        return 0;
    }

    private int V(int i4) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i4) {
                return position;
            }
        }
        return 0;
    }

    private void X(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z4) {
        int i4;
        int c02 = c0(Integer.MIN_VALUE);
        if (c02 != Integer.MIN_VALUE && (i4 = this.f32970d.i() - c02) > 0) {
            int i5 = i4 - (-scrollBy(-i4, vVar, a0Var));
            if (!z4 || i5 <= 0) {
                return;
            }
            this.f32970d.t(i5);
        }
    }

    private void Y(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z4) {
        int n4;
        int f02 = f0(Integer.MAX_VALUE);
        if (f02 != Integer.MAX_VALUE && (n4 = f02 - this.f32970d.n()) > 0) {
            int scrollBy = n4 - scrollBy(n4, vVar, a0Var);
            if (!z4 || scrollBy <= 0) {
                return;
            }
            this.f32970d.t(-scrollBy);
        }
    }

    private int c0(int i4) {
        int q4 = this.f32969c[0].q(i4);
        for (int i5 = 1; i5 < this.f32968b; i5++) {
            int q5 = this.f32969c[i5].q(i4);
            if (q5 > q4) {
                q4 = q5;
            }
        }
        return q4;
    }

    private int computeScrollExtent(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return c0.a(a0Var, this.f32970d, R(!this.f32989w), Q(!this.f32989w), this, this.f32989w);
    }

    private int computeScrollOffset(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return c0.b(a0Var, this.f32970d, R(!this.f32989w), Q(!this.f32989w), this, this.f32989w, this.f32976j);
    }

    private int computeScrollRange(RecyclerView.a0 a0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return c0.c(a0Var, this.f32970d, R(!this.f32989w), Q(!this.f32989w), this, this.f32989w);
    }

    private int convertFocusDirectionToLayoutDirection(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 17 ? i4 != 33 ? i4 != 66 ? (i4 == 130 && this.f32972f == 1) ? 1 : Integer.MIN_VALUE : this.f32972f == 0 ? 1 : Integer.MIN_VALUE : this.f32972f == 1 ? -1 : Integer.MIN_VALUE : this.f32972f == 0 ? -1 : Integer.MIN_VALUE : (this.f32972f != 1 && isLayoutRTL()) ? -1 : 1 : (this.f32972f != 1 && isLayoutRTL()) ? 1 : -1;
    }

    private int d0(int i4) {
        int u4 = this.f32969c[0].u(i4);
        for (int i5 = 1; i5 < this.f32968b; i5++) {
            int u5 = this.f32969c[i5].u(i4);
            if (u5 > u4) {
                u4 = u5;
            }
        }
        return u4;
    }

    private int e0(int i4) {
        int q4 = this.f32969c[0].q(i4);
        for (int i5 = 1; i5 < this.f32968b; i5++) {
            int q5 = this.f32969c[i5].q(i4);
            if (q5 < q4) {
                q4 = q5;
            }
        }
        return q4;
    }

    private int f0(int i4) {
        int u4 = this.f32969c[0].u(i4);
        for (int i5 = 1; i5 < this.f32968b; i5++) {
            int u5 = this.f32969c[i5].u(i4);
            if (u5 < u4) {
                u4 = u5;
            }
        }
        return u4;
    }

    private c g0(r rVar) {
        int i4;
        int i5;
        int i6;
        if (o0(rVar.f33432e)) {
            i5 = this.f32968b - 1;
            i4 = -1;
            i6 = -1;
        } else {
            i4 = this.f32968b;
            i5 = 0;
            i6 = 1;
        }
        c cVar = null;
        if (rVar.f33432e == 1) {
            int n4 = this.f32970d.n();
            int i7 = Integer.MAX_VALUE;
            while (i5 != i4) {
                c cVar2 = this.f32969c[i5];
                int q4 = cVar2.q(n4);
                if (q4 < i7) {
                    cVar = cVar2;
                    i7 = q4;
                }
                i5 += i6;
            }
            return cVar;
        }
        int i10 = this.f32970d.i();
        int i11 = Integer.MIN_VALUE;
        while (i5 != i4) {
            c cVar3 = this.f32969c[i5];
            int u4 = cVar3.u(i10);
            if (u4 > i11) {
                cVar = cVar3;
                i11 = u4;
            }
            i5 += i6;
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f32976j
            if (r0 == 0) goto L9
            int r0 = r6.b0()
            goto Ld
        L9:
            int r0 = r6.Z()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f32980n
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f32980n
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f32980n
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f32980n
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f32980n
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.f32976j
            if (r7 == 0) goto L4e
            int r7 = r6.Z()
            goto L52
        L4e:
            int r7 = r6.b0()
        L52:
            if (r3 > r7) goto L57
            r6.requestLayout()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.i0(int, int, int):void");
    }

    private void l0(View view, int i4, int i5, boolean z4) {
        calculateItemDecorationsForChild(view, this.f32986t);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.f32986t;
        int F0 = F0(i4, i6 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.f32986t;
        int F02 = F0(i5, i7 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z4 ? shouldReMeasureChild(view, F0, F02, layoutParams) : shouldMeasureChild(view, F0, F02, layoutParams)) {
            view.measure(F0, F02);
        }
    }

    private void m0(View view, LayoutParams layoutParams, boolean z4) {
        if (layoutParams.f32994g) {
            if (this.f32972f != 1) {
                l0(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.f32985s, z4);
                return;
            }
            l0(view, this.f32985s, RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z4);
            return;
        }
        if (this.f32972f != 1) {
            l0(view, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.LayoutManager.getChildMeasureSpec(this.f32973g, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z4);
            return;
        }
        l0(view, RecyclerView.LayoutManager.getChildMeasureSpec(this.f32973g, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        if (I() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n0(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.n0(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean o0(int i4) {
        if (this.f32972f == 0) {
            return (i4 == -1) != this.f32976j;
        }
        return ((i4 == -1) == this.f32976j) == isLayoutRTL();
    }

    private void q0(View view) {
        for (int i4 = this.f32968b - 1; i4 >= 0; i4--) {
            this.f32969c[i4].z(view);
        }
    }

    private void r0(RecyclerView.v vVar, r rVar) {
        if (!rVar.f33428a || rVar.f33436i) {
            return;
        }
        if (rVar.f33429b == 0) {
            if (rVar.f33432e == -1) {
                s0(vVar, rVar.f33434g);
                return;
            } else {
                t0(vVar, rVar.f33433f);
                return;
            }
        }
        if (rVar.f33432e != -1) {
            int e02 = e0(rVar.f33434g) - rVar.f33434g;
            t0(vVar, e02 < 0 ? rVar.f33433f : Math.min(e02, rVar.f33429b) + rVar.f33433f);
        } else {
            int i4 = rVar.f33433f;
            int d02 = i4 - d0(i4);
            s0(vVar, d02 < 0 ? rVar.f33434g : rVar.f33434g - Math.min(d02, rVar.f33429b));
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.f32972f == 1 || !isLayoutRTL()) {
            this.f32976j = this.f32975i;
        } else {
            this.f32976j = !this.f32975i;
        }
    }

    private void s0(RecyclerView.v vVar, int i4) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f32970d.g(childAt) < i4 || this.f32970d.r(childAt) < i4) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f32994g) {
                for (int i5 = 0; i5 < this.f32968b; i5++) {
                    if (this.f32969c[i5].f33021a.size() == 1) {
                        return;
                    }
                }
                for (int i6 = 0; i6 < this.f32968b; i6++) {
                    this.f32969c[i6].x();
                }
            } else if (layoutParams.f32993f.f33021a.size() == 1) {
                return;
            } else {
                layoutParams.f32993f.x();
            }
            removeAndRecycleView(childAt, vVar);
        }
    }

    private void t0(RecyclerView.v vVar, int i4) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f32970d.d(childAt) > i4 || this.f32970d.q(childAt) > i4) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.f32994g) {
                for (int i5 = 0; i5 < this.f32968b; i5++) {
                    if (this.f32969c[i5].f33021a.size() == 1) {
                        return;
                    }
                }
                for (int i6 = 0; i6 < this.f32968b; i6++) {
                    this.f32969c[i6].y();
                }
            } else if (layoutParams.f32993f.f33021a.size() == 1) {
                return;
            } else {
                layoutParams.f32993f.y();
            }
            removeAndRecycleView(childAt, vVar);
        }
    }

    private void u0() {
        if (this.f32971e.l() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f4 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            float e4 = this.f32971e.e(childAt);
            if (e4 >= f4) {
                if (((LayoutParams) childAt.getLayoutParams()).n()) {
                    e4 = (e4 * 1.0f) / this.f32968b;
                }
                f4 = Math.max(f4, e4);
            }
        }
        int i5 = this.f32973g;
        int round = Math.round(f4 * this.f32968b);
        if (this.f32971e.l() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f32971e.o());
        }
        D0(round);
        if (this.f32973g == i5) {
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
            if (!layoutParams.f32994g) {
                if (isLayoutRTL() && this.f32972f == 1) {
                    int i7 = this.f32968b;
                    int i10 = layoutParams.f32993f.f33025e;
                    childAt2.offsetLeftAndRight(((-((i7 - 1) - i10)) * this.f32973g) - ((-((i7 - 1) - i10)) * i5));
                } else {
                    int i11 = layoutParams.f32993f.f33025e;
                    int i12 = this.f32973g * i11;
                    int i13 = i11 * i5;
                    if (this.f32972f == 1) {
                        childAt2.offsetLeftAndRight(i12 - i13);
                    } else {
                        childAt2.offsetTopAndBottom(i12 - i13);
                    }
                }
            }
        }
    }

    private void w0(int i4) {
        r rVar = this.f32974h;
        rVar.f33432e = i4;
        rVar.f33431d = this.f32976j != (i4 == -1) ? -1 : 1;
    }

    private void y0(int i4, int i5) {
        for (int i6 = 0; i6 < this.f32968b; i6++) {
            if (!this.f32969c[i6].f33021a.isEmpty()) {
                E0(this.f32969c[i6], i4, i5);
            }
        }
    }

    private boolean z0(RecyclerView.a0 a0Var, b bVar) {
        bVar.f33013a = this.f32982p ? V(a0Var.d()) : P(a0Var.d());
        bVar.f33014b = Integer.MIN_VALUE;
        return true;
    }

    boolean A0(RecyclerView.a0 a0Var, b bVar) {
        int i4;
        if (!a0Var.j() && (i4 = this.f32978l) != -1) {
            if (i4 >= 0 && i4 < a0Var.d()) {
                SavedState savedState = this.f32984r;
                if (savedState == null || savedState.f33002b == -1 || savedState.f33004d < 1) {
                    View findViewByPosition = findViewByPosition(this.f32978l);
                    if (findViewByPosition != null) {
                        bVar.f33013a = this.f32976j ? b0() : Z();
                        if (this.f32979m != Integer.MIN_VALUE) {
                            if (bVar.f33015c) {
                                bVar.f33014b = (this.f32970d.i() - this.f32979m) - this.f32970d.d(findViewByPosition);
                            } else {
                                bVar.f33014b = (this.f32970d.n() + this.f32979m) - this.f32970d.g(findViewByPosition);
                            }
                            return true;
                        }
                        if (this.f32970d.e(findViewByPosition) > this.f32970d.o()) {
                            bVar.f33014b = bVar.f33015c ? this.f32970d.i() : this.f32970d.n();
                            return true;
                        }
                        int g4 = this.f32970d.g(findViewByPosition) - this.f32970d.n();
                        if (g4 < 0) {
                            bVar.f33014b = -g4;
                            return true;
                        }
                        int i5 = this.f32970d.i() - this.f32970d.d(findViewByPosition);
                        if (i5 < 0) {
                            bVar.f33014b = i5;
                            return true;
                        }
                        bVar.f33014b = Integer.MIN_VALUE;
                    } else {
                        int i6 = this.f32978l;
                        bVar.f33013a = i6;
                        int i7 = this.f32979m;
                        if (i7 == Integer.MIN_VALUE) {
                            bVar.f33015c = H(i6) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i7);
                        }
                        bVar.f33016d = true;
                    }
                } else {
                    bVar.f33014b = Integer.MIN_VALUE;
                    bVar.f33013a = this.f32978l;
                }
                return true;
            }
            this.f32978l = -1;
            this.f32979m = Integer.MIN_VALUE;
        }
        return false;
    }

    void B0(RecyclerView.a0 a0Var, b bVar) {
        if (A0(a0Var, bVar) || z0(a0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f33013a = 0;
    }

    void D0(int i4) {
        this.f32973g = i4 / this.f32968b;
        this.f32985s = View.MeasureSpec.makeMeasureSpec(i4, this.f32971e.l());
    }

    boolean E() {
        int q4 = this.f32969c[0].q(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.f32968b; i4++) {
            if (this.f32969c[i4].q(Integer.MIN_VALUE) != q4) {
                return false;
            }
        }
        return true;
    }

    boolean F() {
        int u4 = this.f32969c[0].u(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.f32968b; i4++) {
            if (this.f32969c[i4].u(Integer.MIN_VALUE) != u4) {
                return false;
            }
        }
        return true;
    }

    boolean I() {
        int Z;
        int b02;
        if (getChildCount() == 0 || this.f32981o == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f32976j) {
            Z = b0();
            b02 = Z();
        } else {
            Z = Z();
            b02 = b0();
        }
        if (Z == 0 && j0() != null) {
            this.f32980n.b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f32988v) {
            return false;
        }
        int i4 = this.f32976j ? -1 : 1;
        int i5 = b02 + 1;
        LazySpanLookup.FullSpanItem e4 = this.f32980n.e(Z, i5, i4, true);
        if (e4 == null) {
            this.f32988v = false;
            this.f32980n.d(i5);
            return false;
        }
        LazySpanLookup.FullSpanItem e5 = this.f32980n.e(Z, e4.f32998b, i4 * (-1), true);
        if (e5 == null) {
            this.f32980n.d(e4.f32998b);
        } else {
            this.f32980n.d(e5.f32998b + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    public int[] O(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f32968b];
        } else if (iArr.length < this.f32968b) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f32968b + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.f32968b; i4++) {
            iArr[i4] = this.f32969c[i4].f();
        }
        return iArr;
    }

    View Q(boolean z4) {
        int n4 = this.f32970d.n();
        int i4 = this.f32970d.i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int g4 = this.f32970d.g(childAt);
            int d5 = this.f32970d.d(childAt);
            if (d5 > n4 && g4 < i4) {
                if (d5 <= i4 || !z4) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    View R(boolean z4) {
        int n4 = this.f32970d.n();
        int i4 = this.f32970d.i();
        int childCount = getChildCount();
        View view = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int g4 = this.f32970d.g(childAt);
            if (this.f32970d.d(childAt) > n4 && g4 < i4) {
                if (g4 >= n4 || !z4) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    int S() {
        View Q = this.f32976j ? Q(true) : R(true);
        if (Q == null) {
            return -1;
        }
        return getPosition(Q);
    }

    public int[] T(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f32968b];
        } else if (iArr.length < this.f32968b) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f32968b + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.f32968b; i4++) {
            iArr[i4] = this.f32969c[i4].h();
        }
        return iArr;
    }

    public int[] U(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f32968b];
        } else if (iArr.length < this.f32968b) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f32968b + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.f32968b; i4++) {
            iArr[i4] = this.f32969c[i4].i();
        }
        return iArr;
    }

    public int[] W(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f32968b];
        } else if (iArr.length < this.f32968b) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f32968b + ", array size:" + iArr.length);
        }
        for (int i4 = 0; i4 < this.f32968b; i4++) {
            iArr[i4] = this.f32969c[i4].k();
        }
        return iArr;
    }

    int Z() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int a0() {
        return this.f32981o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f32984r == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    int b0() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f32972f == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f32972f == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @c1({c1.a.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i4, int i5, RecyclerView.a0 a0Var, RecyclerView.LayoutManager.c cVar) {
        int q4;
        int i6;
        if (this.f32972f != 0) {
            i4 = i5;
        }
        if (getChildCount() == 0 || i4 == 0) {
            return;
        }
        p0(i4, a0Var);
        int[] iArr = this.f32990x;
        if (iArr == null || iArr.length < this.f32968b) {
            this.f32990x = new int[this.f32968b];
        }
        int i7 = 0;
        for (int i10 = 0; i10 < this.f32968b; i10++) {
            r rVar = this.f32974h;
            if (rVar.f33431d == -1) {
                q4 = rVar.f33433f;
                i6 = this.f32969c[i10].u(q4);
            } else {
                q4 = this.f32969c[i10].q(rVar.f33434g);
                i6 = this.f32974h.f33434g;
            }
            int i11 = q4 - i6;
            if (i11 >= 0) {
                this.f32990x[i7] = i11;
                i7++;
            }
        }
        Arrays.sort(this.f32990x, 0, i7);
        for (int i12 = 0; i12 < i7 && this.f32974h.a(a0Var); i12++) {
            cVar.a(this.f32974h.f33430c, this.f32990x[i12]);
            r rVar2 = this.f32974h;
            rVar2.f33430c += rVar2.f33431d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.a0 a0Var) {
        return computeScrollExtent(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.a0 a0Var) {
        return computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.a0 a0Var) {
        return computeScrollRange(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF computeScrollVectorForPosition(int i4) {
        int H2 = H(i4);
        PointF pointF = new PointF();
        if (H2 == 0) {
            return null;
        }
        if (this.f32972f == 0) {
            pointF.x = H2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = H2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.a0 a0Var) {
        return computeScrollExtent(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.a0 a0Var) {
        return computeScrollOffset(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.a0 a0Var) {
        return computeScrollRange(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.f32972f == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public int getOrientation() {
        return this.f32972f;
    }

    public boolean getReverseLayout() {
        return this.f32975i;
    }

    public int h0() {
        return this.f32968b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return this.f32981o != 0;
    }

    boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View j0() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f32968b
            r2.<init>(r3)
            int r3 = r12.f32968b
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f32972f
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f32976j
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f32993f
            int r9 = r9.f33025e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f32993f
            boolean r9 = r12.J(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f32993f
            int r9 = r9.f33025e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f32994g
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f32976j
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.z r10 = r12.f32970d
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.z r11 = r12.f32970d
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.z r10 = r12.f32970d
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.z r11 = r12.f32970d
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = r8.f32993f
            int r8 = r8.f33025e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.f32993f
            int r9 = r9.f33025e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.j0():android.view.View");
    }

    public void k0() {
        this.f32980n.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i4) {
        super.offsetChildrenHorizontal(i4);
        for (int i5 = 0; i5 < this.f32968b; i5++) {
            this.f32969c[i5].w(i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i4) {
        super.offsetChildrenVertical(i4);
        for (int i5 = 0; i5 < this.f32968b; i5++) {
            this.f32969c[i5].w(i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(@q0 RecyclerView.h hVar, @q0 RecyclerView.h hVar2) {
        this.f32980n.b();
        for (int i4 = 0; i4 < this.f32968b; i4++) {
            this.f32969c[i4].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        removeCallbacks(this.f32991y);
        for (int i4 = 0; i4 < this.f32968b; i4++) {
            this.f32969c[i4].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @q0
    public View onFocusSearchFailed(View view, int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View findContainingItemView;
        View r4;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i4);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) findContainingItemView.getLayoutParams();
        boolean z4 = layoutParams.f32994g;
        c cVar = layoutParams.f32993f;
        int b02 = convertFocusDirectionToLayoutDirection == 1 ? b0() : Z();
        C0(b02, a0Var);
        w0(convertFocusDirectionToLayoutDirection);
        r rVar = this.f32974h;
        rVar.f33430c = rVar.f33431d + b02;
        rVar.f33429b = (int) (this.f32970d.o() * H);
        r rVar2 = this.f32974h;
        rVar2.f33435h = true;
        rVar2.f33428a = false;
        N(vVar, rVar2, a0Var);
        this.f32982p = this.f32976j;
        if (!z4 && (r4 = cVar.r(b02, convertFocusDirectionToLayoutDirection)) != null && r4 != findContainingItemView) {
            return r4;
        }
        if (o0(convertFocusDirectionToLayoutDirection)) {
            for (int i5 = this.f32968b - 1; i5 >= 0; i5--) {
                View r5 = this.f32969c[i5].r(b02, convertFocusDirectionToLayoutDirection);
                if (r5 != null && r5 != findContainingItemView) {
                    return r5;
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f32968b; i6++) {
                View r6 = this.f32969c[i6].r(b02, convertFocusDirectionToLayoutDirection);
                if (r6 != null && r6 != findContainingItemView) {
                    return r6;
                }
            }
        }
        boolean z5 = (this.f32975i ^ true) == (convertFocusDirectionToLayoutDirection == -1);
        if (!z4) {
            View findViewByPosition = findViewByPosition(z5 ? cVar.g() : cVar.j());
            if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                return findViewByPosition;
            }
        }
        if (o0(convertFocusDirectionToLayoutDirection)) {
            for (int i7 = this.f32968b - 1; i7 >= 0; i7--) {
                if (i7 != cVar.f33025e) {
                    View findViewByPosition2 = findViewByPosition(z5 ? this.f32969c[i7].g() : this.f32969c[i7].j());
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i10 = 0; i10 < this.f32968b; i10++) {
                View findViewByPosition3 = findViewByPosition(z5 ? this.f32969c[i10].g() : this.f32969c[i10].j());
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View R = R(false);
            View Q = Q(false);
            if (R == null || Q == null) {
                return;
            }
            int position = getPosition(R);
            int position2 = getPosition(Q);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i4, int i5) {
        i0(i4, i5, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f32980n.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i4, int i5, int i6) {
        i0(i4, i5, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i4, int i5) {
        i0(i4, i5, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i4, int i5, Object obj) {
        i0(i4, i5, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        n0(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        this.f32978l = -1;
        this.f32979m = Integer.MIN_VALUE;
        this.f32984r = null;
        this.f32987u.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f32984r = savedState;
            if (this.f32978l != -1) {
                savedState.a();
                this.f32984r.b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        int u4;
        int n4;
        int[] iArr;
        if (this.f32984r != null) {
            return new SavedState(this.f32984r);
        }
        SavedState savedState = new SavedState();
        savedState.f33009i = this.f32975i;
        savedState.f33010j = this.f32982p;
        savedState.f33011k = this.f32983q;
        LazySpanLookup lazySpanLookup = this.f32980n;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f32996a) == null) {
            savedState.f33006f = 0;
        } else {
            savedState.f33007g = iArr;
            savedState.f33006f = iArr.length;
            savedState.f33008h = lazySpanLookup.f32997b;
        }
        if (getChildCount() > 0) {
            savedState.f33002b = this.f32982p ? b0() : Z();
            savedState.f33003c = S();
            int i4 = this.f32968b;
            savedState.f33004d = i4;
            savedState.f33005e = new int[i4];
            for (int i5 = 0; i5 < this.f32968b; i5++) {
                if (this.f32982p) {
                    u4 = this.f32969c[i5].q(Integer.MIN_VALUE);
                    if (u4 != Integer.MIN_VALUE) {
                        n4 = this.f32970d.i();
                        u4 -= n4;
                        savedState.f33005e[i5] = u4;
                    } else {
                        savedState.f33005e[i5] = u4;
                    }
                } else {
                    u4 = this.f32969c[i5].u(Integer.MIN_VALUE);
                    if (u4 != Integer.MIN_VALUE) {
                        n4 = this.f32970d.n();
                        u4 -= n4;
                        savedState.f33005e[i5] = u4;
                    } else {
                        savedState.f33005e[i5] = u4;
                    }
                }
            }
        } else {
            savedState.f33002b = -1;
            savedState.f33003c = -1;
            savedState.f33004d = 0;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i4) {
        if (i4 == 0) {
            I();
        }
    }

    void p0(int i4, RecyclerView.a0 a0Var) {
        int Z;
        int i5;
        if (i4 > 0) {
            Z = b0();
            i5 = 1;
        } else {
            Z = Z();
            i5 = -1;
        }
        this.f32974h.f33428a = true;
        C0(Z, a0Var);
        w0(i5);
        r rVar = this.f32974h;
        rVar.f33430c = Z + rVar.f33431d;
        rVar.f33429b = Math.abs(i4);
    }

    int scrollBy(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (getChildCount() == 0 || i4 == 0) {
            return 0;
        }
        p0(i4, a0Var);
        int N = N(vVar, this.f32974h, a0Var);
        if (this.f32974h.f33429b >= N) {
            i4 = i4 < 0 ? -N : N;
        }
        this.f32970d.t(-i4);
        this.f32982p = this.f32976j;
        r rVar = this.f32974h;
        rVar.f33429b = 0;
        r0(vVar, rVar);
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return scrollBy(i4, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i4) {
        SavedState savedState = this.f32984r;
        if (savedState != null && savedState.f33002b != i4) {
            savedState.a();
        }
        this.f32978l = i4;
        this.f32979m = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i4, int i5) {
        SavedState savedState = this.f32984r;
        if (savedState != null) {
            savedState.a();
        }
        this.f32978l = i4;
        this.f32979m = i5;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i4, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return scrollBy(i4, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i4, int i5) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f32972f == 1) {
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i5, rect.height() + paddingBottom, getMinimumHeight());
            chooseSize = RecyclerView.LayoutManager.chooseSize(i4, (this.f32973g * this.f32968b) + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.LayoutManager.chooseSize(i4, rect.width() + paddingRight, getMinimumWidth());
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i5, (this.f32973g * this.f32968b) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i4 == this.f32972f) {
            return;
        }
        this.f32972f = i4;
        z zVar = this.f32970d;
        this.f32970d = this.f32971e;
        this.f32971e = zVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z4) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f32984r;
        if (savedState != null && savedState.f33009i != z4) {
            savedState.f33009i = z4;
        }
        this.f32975i = z4;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i4) {
        s sVar = new s(recyclerView.getContext());
        sVar.setTargetPosition(i4);
        startSmoothScroll(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.f32984r == null;
    }

    public void v0(int i4) {
        assertNotInLayoutOrScroll(null);
        if (i4 == this.f32981o) {
            return;
        }
        if (i4 != 0 && i4 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.f32981o = i4;
        requestLayout();
    }

    public void x0(int i4) {
        assertNotInLayoutOrScroll(null);
        if (i4 != this.f32968b) {
            k0();
            this.f32968b = i4;
            this.f32977k = new BitSet(this.f32968b);
            this.f32969c = new c[this.f32968b];
            for (int i5 = 0; i5 < this.f32968b; i5++) {
                this.f32969c[i5] = new c(i5);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    static class LazySpanLookup {

        /* renamed from: c, reason: collision with root package name */
        private static final int f32995c = 10;

        /* renamed from: a, reason: collision with root package name */
        int[] f32996a;

        /* renamed from: b, reason: collision with root package name */
        List<FullSpanItem> f32997b;

        LazySpanLookup() {
        }

        private int i(int i4) {
            if (this.f32997b == null) {
                return -1;
            }
            FullSpanItem f4 = f(i4);
            if (f4 != null) {
                this.f32997b.remove(f4);
            }
            int size = this.f32997b.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    i5 = -1;
                    break;
                }
                if (this.f32997b.get(i5).f32998b >= i4) {
                    break;
                }
                i5++;
            }
            if (i5 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f32997b.get(i5);
            this.f32997b.remove(i5);
            return fullSpanItem.f32998b;
        }

        private void l(int i4, int i5) {
            List<FullSpanItem> list = this.f32997b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f32997b.get(size);
                int i6 = fullSpanItem.f32998b;
                if (i6 >= i4) {
                    fullSpanItem.f32998b = i6 + i5;
                }
            }
        }

        private void m(int i4, int i5) {
            List<FullSpanItem> list = this.f32997b;
            if (list == null) {
                return;
            }
            int i6 = i4 + i5;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f32997b.get(size);
                int i7 = fullSpanItem.f32998b;
                if (i7 >= i4) {
                    if (i7 < i6) {
                        this.f32997b.remove(size);
                    } else {
                        fullSpanItem.f32998b = i7 - i5;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f32997b == null) {
                this.f32997b = new ArrayList();
            }
            int size = this.f32997b.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem2 = this.f32997b.get(i4);
                if (fullSpanItem2.f32998b == fullSpanItem.f32998b) {
                    this.f32997b.remove(i4);
                }
                if (fullSpanItem2.f32998b >= fullSpanItem.f32998b) {
                    this.f32997b.add(i4, fullSpanItem);
                    return;
                }
            }
            this.f32997b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.f32996a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f32997b = null;
        }

        void c(int i4) {
            int[] iArr = this.f32996a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i4, 10) + 1];
                this.f32996a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[o(i4)];
                this.f32996a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f32996a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i4) {
            List<FullSpanItem> list = this.f32997b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f32997b.get(size).f32998b >= i4) {
                        this.f32997b.remove(size);
                    }
                }
            }
            return h(i4);
        }

        public FullSpanItem e(int i4, int i5, int i6, boolean z4) {
            List<FullSpanItem> list = this.f32997b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                FullSpanItem fullSpanItem = this.f32997b.get(i7);
                int i10 = fullSpanItem.f32998b;
                if (i10 >= i5) {
                    return null;
                }
                if (i10 >= i4 && (i6 == 0 || fullSpanItem.f32999c == i6 || (z4 && fullSpanItem.f33001e))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i4) {
            List<FullSpanItem> list = this.f32997b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f32997b.get(size);
                if (fullSpanItem.f32998b == i4) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i4) {
            int[] iArr = this.f32996a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            return iArr[i4];
        }

        int h(int i4) {
            int[] iArr = this.f32996a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            int i5 = i(i4);
            if (i5 == -1) {
                int[] iArr2 = this.f32996a;
                Arrays.fill(iArr2, i4, iArr2.length, -1);
                return this.f32996a.length;
            }
            int min = Math.min(i5 + 1, this.f32996a.length);
            Arrays.fill(this.f32996a, i4, min, -1);
            return min;
        }

        void j(int i4, int i5) {
            int[] iArr = this.f32996a;
            if (iArr == null || i4 >= iArr.length) {
                return;
            }
            int i6 = i4 + i5;
            c(i6);
            int[] iArr2 = this.f32996a;
            System.arraycopy(iArr2, i4, iArr2, i6, (iArr2.length - i4) - i5);
            Arrays.fill(this.f32996a, i4, i6, -1);
            l(i4, i5);
        }

        void k(int i4, int i5) {
            int[] iArr = this.f32996a;
            if (iArr == null || i4 >= iArr.length) {
                return;
            }
            int i6 = i4 + i5;
            c(i6);
            int[] iArr2 = this.f32996a;
            System.arraycopy(iArr2, i6, iArr2, i4, (iArr2.length - i4) - i5);
            int[] iArr3 = this.f32996a;
            Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
            m(i4, i5);
        }

        void n(int i4, c cVar) {
            c(i4);
            this.f32996a[i4] = cVar.f33025e;
        }

        int o(int i4) {
            int length = this.f32996a.length;
            while (length <= i4) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            int f32998b;

            /* renamed from: c, reason: collision with root package name */
            int f32999c;

            /* renamed from: d, reason: collision with root package name */
            int[] f33000d;

            /* renamed from: e, reason: collision with root package name */
            boolean f33001e;

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
                public FullSpanItem[] newArray(int i4) {
                    return new FullSpanItem[i4];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f32998b = parcel.readInt();
                this.f32999c = parcel.readInt();
                this.f33001e = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f33000d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i4) {
                int[] iArr = this.f33000d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i4];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f32998b + ", mGapDir=" + this.f32999c + ", mHasUnwantedGapAfter=" + this.f33001e + ", mGapPerSpan=" + Arrays.toString(this.f33000d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i4) {
                parcel.writeInt(this.f32998b);
                parcel.writeInt(this.f32999c);
                parcel.writeInt(this.f33001e ? 1 : 0);
                int[] iArr = this.f33000d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f33000d);
                }
            }

            FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i4, int i5) {
        this.f32972f = i5;
        x0(i4);
        this.f32974h = new r();
        M();
    }
}
