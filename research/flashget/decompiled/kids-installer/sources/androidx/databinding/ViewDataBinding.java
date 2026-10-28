package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.LiveData;
import android.view.View;
import android.view.ViewGroup;
import android.view.k0;
import android.view.l0;
import android.view.t;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.databinding.i;
import androidx.databinding.u;
import androidx.databinding.y;
import androidx.databinding.z;
import androidx.fragment.app.Fragment;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import s.b;

/* loaded from: classes3.dex */
public abstract class ViewDataBinding extends androidx.databinding.a implements t0.c {
    private static final int G = 1;
    private static final int H = 2;
    private static final int I = 3;
    private static final int K = 8;
    private ViewDataBinding A;
    private android.view.a0 B;
    private OnStartListener C;
    private boolean D;

    @c1({c1.a.LIBRARY_GROUP})
    protected boolean E;

    /* renamed from: p, reason: collision with root package name */
    private final Runnable f6009p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6010q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6011r;

    /* renamed from: s, reason: collision with root package name */
    private h0[] f6012s;

    /* renamed from: t, reason: collision with root package name */
    private final View f6013t;

    /* renamed from: u, reason: collision with root package name */
    private androidx.databinding.i<b0, ViewDataBinding, Void> f6014u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6015v;

    /* renamed from: w, reason: collision with root package name */
    private Choreographer f6016w;

    /* renamed from: x, reason: collision with root package name */
    private final Choreographer.FrameCallback f6017x;

    /* renamed from: y, reason: collision with root package name */
    private Handler f6018y;

    /* renamed from: z, reason: collision with root package name */
    protected final androidx.databinding.l f6019z;
    public static final String J = "binding_";
    static int F = Build.VERSION.SDK_INT;
    private static final boolean L = true;
    private static final androidx.databinding.j M = new a();
    private static final androidx.databinding.j N = new b();
    private static final androidx.databinding.j O = new c();
    private static final androidx.databinding.j P = new d();
    private static final i.a<b0, ViewDataBinding, Void> Q = new e();
    private static final ReferenceQueue<ViewDataBinding> R = new ReferenceQueue<>();
    private static final View.OnAttachStateChangeListener S = new f();

    static class OnStartListener implements android.view.z {

        /* renamed from: o, reason: collision with root package name */
        final WeakReference<ViewDataBinding> f6020o;

        /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, a aVar) {
            this(viewDataBinding);
        }

        @l0(t.b.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f6020o.get();
            if (viewDataBinding != null) {
                viewDataBinding.s();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.f6020o = new WeakReference<>(viewDataBinding);
        }
    }

    class a implements androidx.databinding.j {
        a() {
        }

        @Override // androidx.databinding.j
        public h0 a(ViewDataBinding viewDataBinding, int i5, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new n(viewDataBinding, i5, referenceQueue).f6031a;
        }
    }

    class b implements androidx.databinding.j {
        b() {
        }

        @Override // androidx.databinding.j
        public h0 a(ViewDataBinding viewDataBinding, int i5, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new l(viewDataBinding, i5, referenceQueue).f6029a;
        }
    }

    class c implements androidx.databinding.j {
        c() {
        }

        @Override // androidx.databinding.j
        public h0 a(ViewDataBinding viewDataBinding, int i5, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new m(viewDataBinding, i5, referenceQueue).f6030a;
        }
    }

    class d implements androidx.databinding.j {
        d() {
        }

        @Override // androidx.databinding.j
        public h0 a(ViewDataBinding viewDataBinding, int i5, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new j(viewDataBinding, i5, referenceQueue).f6026a;
        }
    }

    class e extends i.a<b0, ViewDataBinding, Void> {
        e() {
        }

        @Override // androidx.databinding.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b0 b0Var, ViewDataBinding viewDataBinding, int i5, Void r42) {
            if (i5 == 1) {
                if (b0Var.c(viewDataBinding)) {
                    return;
                }
                viewDataBinding.f6011r = true;
            } else if (i5 == 2) {
                b0Var.b(viewDataBinding);
            } else {
                if (i5 != 3) {
                    return;
                }
                b0Var.a(viewDataBinding);
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnAttachStateChangeListener {
        f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.w(view).f6009p.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f6010q = false;
            }
            ViewDataBinding.q0();
            if (ViewDataBinding.this.f6013t.isAttachedToWindow()) {
                ViewDataBinding.this.s();
            } else {
                ViewDataBinding.this.f6013t.removeOnAttachStateChangeListener(ViewDataBinding.S);
                ViewDataBinding.this.f6013t.addOnAttachStateChangeListener(ViewDataBinding.S);
            }
        }
    }

    /* loaded from: classes.dex */
    class h implements Choreographer.FrameCallback {
        h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j5) {
            ViewDataBinding.this.f6009p.run();
        }
    }

    /* loaded from: classes.dex */
    protected static class i {

        /* renamed from: a, reason: collision with root package name */
        public final String[][] f6023a;

        /* renamed from: b, reason: collision with root package name */
        public final int[][] f6024b;

        /* renamed from: c, reason: collision with root package name */
        public final int[][] f6025c;

        public i(int i5) {
            this.f6023a = new String[i5][];
            this.f6024b = new int[i5][];
            this.f6025c = new int[i5][];
        }

        public void a(int i5, String[] strArr, int[] iArr, int[] iArr2) {
            this.f6023a[i5] = strArr;
            this.f6024b[i5] = iArr;
            this.f6025c[i5] = iArr2;
        }
    }

    private static class j implements k0, a0<LiveData<?>> {

        /* renamed from: a, reason: collision with root package name */
        final h0<LiveData<?>> f6026a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        WeakReference<android.view.a0> f6027b = null;

        public j(ViewDataBinding viewDataBinding, int i5, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f6026a = new h0<>(viewDataBinding, i5, this, referenceQueue);
        }

        @q0
        private android.view.a0 g() {
            WeakReference<android.view.a0> weakReference = this.f6027b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // android.view.k0
        public void a(@q0 Object obj) {
            ViewDataBinding a6 = this.f6026a.a();
            if (a6 != null) {
                h0<LiveData<?>> h0Var = this.f6026a;
                a6.W(h0Var.f6119b, h0Var.b(), 0);
            }
        }

        @Override // androidx.databinding.a0
        public void b(@q0 android.view.a0 a0Var) {
            android.view.a0 g5 = g();
            LiveData<?> b6 = this.f6026a.b();
            if (b6 != null) {
                if (g5 != null) {
                    b6.o(this);
                }
                if (a0Var != null) {
                    b6.j(a0Var, this);
                }
            }
            if (a0Var != null) {
                this.f6027b = new WeakReference<>(a0Var);
            }
        }

        @Override // androidx.databinding.a0
        public h0<LiveData<?>> c() {
            return this.f6026a;
        }

        @Override // androidx.databinding.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(LiveData<?> liveData) {
            android.view.a0 g5 = g();
            if (g5 != null) {
                liveData.j(g5, this);
            }
        }

        @Override // androidx.databinding.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(LiveData<?> liveData) {
            liveData.o(this);
        }
    }

    protected static abstract class k extends u.a implements o {

        /* renamed from: a, reason: collision with root package name */
        final int f6028a;

        public k(int i5) {
            this.f6028a = i5;
        }

        @Override // androidx.databinding.u.a
        public void f(u uVar, int i5) {
            if (i5 == this.f6028a || i5 == 0) {
                a();
            }
        }
    }

    private static class l extends y.a implements a0<y> {

        /* renamed from: a, reason: collision with root package name */
        final h0<y> f6029a;

        public l(ViewDataBinding viewDataBinding, int i5, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f6029a = new h0<>(viewDataBinding, i5, this, referenceQueue);
        }

        @Override // androidx.databinding.y.a
        public void a(y yVar) {
            y b6;
            ViewDataBinding a6 = this.f6029a.a();
            if (a6 != null && (b6 = this.f6029a.b()) == yVar) {
                a6.W(this.f6029a.f6119b, b6, 0);
            }
        }

        @Override // androidx.databinding.a0
        public void b(android.view.a0 a0Var) {
        }

        @Override // androidx.databinding.a0
        public h0<y> c() {
            return this.f6029a;
        }

        @Override // androidx.databinding.y.a
        public void f(y yVar, int i5, int i6) {
            a(yVar);
        }

        @Override // androidx.databinding.y.a
        public void g(y yVar, int i5, int i6) {
            a(yVar);
        }

        @Override // androidx.databinding.y.a
        public void h(y yVar, int i5, int i6, int i7) {
            a(yVar);
        }

        @Override // androidx.databinding.y.a
        public void i(y yVar, int i5, int i6) {
            a(yVar);
        }

        @Override // androidx.databinding.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(y yVar) {
            yVar.J0(this);
        }

        @Override // androidx.databinding.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void d(y yVar) {
            yVar.n(this);
        }
    }

    private static class m extends z.a implements a0<z> {

        /* renamed from: a, reason: collision with root package name */
        final h0<z> f6030a;

        public m(ViewDataBinding viewDataBinding, int i5, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f6030a = new h0<>(viewDataBinding, i5, this, referenceQueue);
        }

        @Override // androidx.databinding.z.a
        public void a(z zVar, Object obj) {
            ViewDataBinding a6 = this.f6030a.a();
            if (a6 == null || zVar != this.f6030a.b()) {
                return;
            }
            a6.W(this.f6030a.f6119b, zVar, 0);
        }

        @Override // androidx.databinding.a0
        public void b(android.view.a0 a0Var) {
        }

        @Override // androidx.databinding.a0
        public h0<z> c() {
            return this.f6030a;
        }

        @Override // androidx.databinding.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(z zVar) {
            zVar.a(this);
        }

        @Override // androidx.databinding.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z zVar) {
            zVar.b(this);
        }
    }

    private static class n extends u.a implements a0<u> {

        /* renamed from: a, reason: collision with root package name */
        final h0<u> f6031a;

        public n(ViewDataBinding viewDataBinding, int i5, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f6031a = new h0<>(viewDataBinding, i5, this, referenceQueue);
        }

        @Override // androidx.databinding.a0
        public void b(android.view.a0 a0Var) {
        }

        @Override // androidx.databinding.a0
        public h0<u> c() {
            return this.f6031a;
        }

        @Override // androidx.databinding.u.a
        public void f(u uVar, int i5) {
            ViewDataBinding a6 = this.f6031a.a();
            if (a6 != null && this.f6031a.b() == uVar) {
                a6.W(this.f6031a.f6119b, uVar, i5);
            }
        }

        @Override // androidx.databinding.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(u uVar) {
            uVar.a(this);
        }

        @Override // androidx.databinding.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(u uVar) {
            uVar.b(this);
        }
    }

    protected ViewDataBinding(androidx.databinding.l lVar, View view, int i5) {
        this.f6009p = new g();
        this.f6010q = false;
        this.f6011r = false;
        this.f6019z = lVar;
        this.f6012s = new h0[i5];
        this.f6013t = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (L) {
            this.f6016w = Choreographer.getInstance();
            this.f6017x = new h();
        } else {
            this.f6017x = null;
            this.f6018y = new Handler(Looper.myLooper());
        }
    }

    protected static ColorStateList A(View view, int i5) {
        return view.getContext().getColorStateList(i5);
    }

    protected static short B0(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    protected static Drawable C(View view, int i5) {
        return view.getContext().getDrawable(i5);
    }

    protected static boolean C0(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected static <K, T> T D(Map<K, T> map, K k5) {
        if (map == null) {
            return null;
        }
        return map.get(k5);
    }

    protected static void D0(ViewDataBinding viewDataBinding, o oVar, k kVar) {
        if (oVar != kVar) {
            if (oVar != null) {
                viewDataBinding.b((k) oVar);
            }
            if (kVar != null) {
                viewDataBinding.a(kVar);
            }
        }
    }

    protected static byte E(byte[] bArr, int i5) {
        if (bArr == null || i5 < 0 || i5 >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i5];
    }

    protected static char F(char[] cArr, int i5) {
        if (cArr == null || i5 < 0 || i5 >= cArr.length) {
            return (char) 0;
        }
        return cArr[i5];
    }

    protected static double G(double[] dArr, int i5) {
        return (dArr == null || i5 < 0 || i5 >= dArr.length) ? com.google.firebase.remoteconfig.p.f18289o : dArr[i5];
    }

    protected static float H(float[] fArr, int i5) {
        if (fArr == null || i5 < 0 || i5 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i5];
    }

    protected static int I(int[] iArr, int i5) {
        if (iArr == null || i5 < 0 || i5 >= iArr.length) {
            return 0;
        }
        return iArr[i5];
    }

    protected static long J(long[] jArr, int i5) {
        if (jArr == null || i5 < 0 || i5 >= jArr.length) {
            return 0L;
        }
        return jArr[i5];
    }

    protected static <T> T K(T[] tArr, int i5) {
        if (tArr == null || i5 < 0 || i5 >= tArr.length) {
            return null;
        }
        return tArr[i5];
    }

    @TargetApi(16)
    protected static <T> void K0(LongSparseArray<T> longSparseArray, int i5, T t5) {
        if (longSparseArray == null || i5 < 0 || i5 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i5, t5);
    }

    protected static short L(short[] sArr, int i5) {
        if (sArr == null || i5 < 0 || i5 >= sArr.length) {
            return (short) 0;
        }
        return sArr[i5];
    }

    protected static <T> void L0(SparseArray<T> sparseArray, int i5, T t5) {
        if (sparseArray == null || i5 < 0 || i5 >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i5, t5);
    }

    protected static boolean M(boolean[] zArr, int i5) {
        if (zArr == null || i5 < 0 || i5 >= zArr.length) {
            return false;
        }
        return zArr[i5];
    }

    protected static int N(SparseIntArray sparseIntArray, int i5) {
        if (sparseIntArray == null || i5 < 0) {
            return 0;
        }
        return sparseIntArray.get(i5);
    }

    protected static void N0(SparseBooleanArray sparseBooleanArray, int i5, boolean z5) {
        if (sparseBooleanArray == null || i5 < 0 || i5 >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i5, z5);
    }

    @TargetApi(18)
    protected static long O(SparseLongArray sparseLongArray, int i5) {
        if (sparseLongArray == null || i5 < 0) {
            return 0L;
        }
        return sparseLongArray.get(i5);
    }

    protected static void O0(SparseIntArray sparseIntArray, int i5, int i6) {
        if (sparseIntArray == null || i5 < 0 || i5 >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i5, i6);
    }

    @TargetApi(16)
    protected static <T> T P(LongSparseArray<T> longSparseArray, int i5) {
        if (longSparseArray == null || i5 < 0) {
            return null;
        }
        return longSparseArray.get(i5);
    }

    @TargetApi(18)
    protected static void P0(SparseLongArray sparseLongArray, int i5, long j5) {
        if (sparseLongArray == null || i5 < 0 || i5 >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i5, j5);
    }

    protected static <T> T Q(SparseArray<T> sparseArray, int i5) {
        if (sparseArray == null || i5 < 0) {
            return null;
        }
        return sparseArray.get(i5);
    }

    protected static <T> void Q0(androidx.collection.f<T> fVar, int i5, T t5) {
        if (fVar == null || i5 < 0 || i5 >= fVar.A()) {
            return;
        }
        fVar.p(i5, t5);
    }

    protected static <T> T R(androidx.collection.f<T> fVar, int i5) {
        if (fVar == null || i5 < 0) {
            return null;
        }
        return fVar.j(i5);
    }

    protected static <T> void R0(List<T> list, int i5, T t5) {
        if (list == null || i5 < 0 || i5 >= list.size()) {
            return;
        }
        list.set(i5, t5);
    }

    protected static <T> T S(List<T> list, int i5) {
        if (list == null || i5 < 0 || i5 >= list.size()) {
            return null;
        }
        return list.get(i5);
    }

    protected static <K, T> void S0(Map<K, T> map, K k5, T t5) {
        if (map == null) {
            return;
        }
        map.put(k5, t5);
    }

    protected static boolean T(SparseBooleanArray sparseBooleanArray, int i5) {
        if (sparseBooleanArray == null || i5 < 0) {
            return false;
        }
        return sparseBooleanArray.get(i5);
    }

    protected static void T0(byte[] bArr, int i5, byte b6) {
        if (bArr == null || i5 < 0 || i5 >= bArr.length) {
            return;
        }
        bArr[i5] = b6;
    }

    protected static void V0(char[] cArr, int i5, char c6) {
        if (cArr == null || i5 < 0 || i5 >= cArr.length) {
            return;
        }
        cArr[i5] = c6;
    }

    protected static void W0(double[] dArr, int i5, double d6) {
        if (dArr == null || i5 < 0 || i5 >= dArr.length) {
            return;
        }
        dArr[i5] = d6;
    }

    protected static void X0(float[] fArr, int i5, float f6) {
        if (fArr == null || i5 < 0 || i5 >= fArr.length) {
            return;
        }
        fArr[i5] = f6;
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected static <T extends ViewDataBinding> T Y(@o0 LayoutInflater layoutInflater, int i5, @q0 ViewGroup viewGroup, boolean z5, @q0 Object obj) {
        return (T) androidx.databinding.m.k(layoutInflater, i5, viewGroup, z5, m(obj));
    }

    protected static void Y0(int[] iArr, int i5, int i6) {
        if (iArr == null || i5 < 0 || i5 >= iArr.length) {
            return;
        }
        iArr[i5] = i6;
    }

    protected static void Z0(long[] jArr, int i5, long j5) {
        if (jArr == null || i5 < 0 || i5 >= jArr.length) {
            return;
        }
        jArr[i5] = j5;
    }

    private static boolean a0(String str, int i5) {
        int length = str.length();
        if (length == i5) {
            return false;
        }
        while (i5 < length) {
            if (!Character.isDigit(str.charAt(i5))) {
                return false;
            }
            i5++;
        }
        return true;
    }

    protected static <T> void a1(T[] tArr, int i5, T t5) {
        if (tArr == null || i5 < 0 || i5 >= tArr.length) {
            return;
        }
        tArr[i5] = t5;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b0(androidx.databinding.l r17, android.view.View r18, java.lang.Object[] r19, androidx.databinding.ViewDataBinding.i r20, android.util.SparseIntArray r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.b0(androidx.databinding.l, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$i, android.util.SparseIntArray, boolean):void");
    }

    protected static void b1(short[] sArr, int i5, short s5) {
        if (sArr == null || i5 < 0 || i5 >= sArr.length) {
            return;
        }
        sArr[i5] = s5;
    }

    protected static Object[] c0(androidx.databinding.l lVar, View view, int i5, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i5];
        b0(lVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    protected static void c1(boolean[] zArr, int i5, boolean z5) {
        if (zArr == null || i5 < 0 || i5 >= zArr.length) {
            return;
        }
        zArr[i5] = z5;
    }

    protected static Object[] d0(androidx.databinding.l lVar, View[] viewArr, int i5, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i5];
        for (View view : viewArr) {
            b0(lVar, view, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    protected static byte f0(String str, byte b6) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b6;
        }
    }

    protected static char g0(String str, char c6) {
        return (str == null || str.isEmpty()) ? c6 : str.charAt(0);
    }

    protected static double h0(String str, double d6) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d6;
        }
    }

    protected static float i0(String str, float f6) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f6;
        }
    }

    protected static int j0(String str, int i5) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i5;
        }
    }

    protected static long k0(String str, long j5) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j5;
        }
    }

    protected static ViewDataBinding l(Object obj, View view, int i5) {
        return androidx.databinding.m.c(m(obj), view, i5);
    }

    protected static short l0(String str, short s5) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s5;
        }
    }

    private static androidx.databinding.l m(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof androidx.databinding.l) {
            return (androidx.databinding.l) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    protected static boolean o0(String str, boolean z5) {
        return str == null ? z5 : Boolean.parseBoolean(str);
    }

    private static int p0(String str, int i5) {
        int i6 = 0;
        while (i5 < str.length()) {
            i6 = (i6 * 10) + (str.charAt(i5) - '0');
            i5++;
        }
        return i6;
    }

    private void q() {
        if (this.f6015v) {
            t0();
            return;
        }
        if (X()) {
            this.f6015v = true;
            this.f6011r = false;
            androidx.databinding.i<b0, ViewDataBinding, Void> iVar = this.f6014u;
            if (iVar != null) {
                iVar.j(this, 1, null);
                if (this.f6011r) {
                    this.f6014u.j(this, 2, null);
                }
            }
            if (!this.f6011r) {
                p();
                androidx.databinding.i<b0, ViewDataBinding, Void> iVar2 = this.f6014u;
                if (iVar2 != null) {
                    iVar2.j(this, 3, null);
                }
            }
            this.f6015v = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q0() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = R.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof h0) {
                ((h0) poll).e();
            }
        }
    }

    protected static void r(ViewDataBinding viewDataBinding) {
        viewDataBinding.q();
    }

    private static int t(String str, int i5, i iVar, int i6) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f6023a[i6];
        int length = strArr.length;
        while (i5 < length) {
            if (TextUtils.equals(subSequence, strArr[i5])) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    private static int u(ViewGroup viewGroup, int i5) {
        String str = (String) viewGroup.getChildAt(i5).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i6 = i5 + 1; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i5;
                }
                if (a0(str2, length)) {
                    i5 = i6;
                }
            }
        }
        return i5;
    }

    protected static byte u0(Byte b6) {
        if (b6 == null) {
            return (byte) 0;
        }
        return b6.byteValue();
    }

    protected static char v0(Character ch) {
        if (ch == null) {
            return (char) 0;
        }
        return ch.charValue();
    }

    static ViewDataBinding w(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(b.e.f33238j);
        }
        return null;
    }

    protected static double w0(Double d6) {
        return d6 == null ? com.google.firebase.remoteconfig.p.f18289o : d6.doubleValue();
    }

    public static int x() {
        return F;
    }

    protected static float x0(Float f6) {
        if (f6 == null) {
            return 0.0f;
        }
        return f6.floatValue();
    }

    protected static int y(View view, int i5) {
        return view.getContext().getColor(i5);
    }

    protected static int y0(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected static long z0(Long l5) {
        if (l5 == null) {
            return 0L;
        }
        return l5.longValue();
    }

    protected void G0(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.A = this;
        }
    }

    @androidx.annotation.l0
    public void H0(@q0 android.view.a0 a0Var) {
        boolean z5 = a0Var instanceof Fragment;
        android.view.a0 a0Var2 = this.B;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 != null) {
            a0Var2.getLifecycle().c(this.C);
        }
        this.B = a0Var;
        if (a0Var != null) {
            if (this.C == null) {
                this.C = new OnStartListener(this, null);
            }
            a0Var.getLifecycle().a(this.C);
        }
        for (h0 h0Var : this.f6012s) {
            if (h0Var != null) {
                h0Var.c(a0Var);
            }
        }
    }

    protected void I0(View view) {
        view.setTag(b.e.f33238j, this);
    }

    protected void J0(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(b.e.f33238j, this);
        }
    }

    @q0
    public android.view.a0 U() {
        return this.B;
    }

    protected Object V(int i5) {
        h0 h0Var = this.f6012s[i5];
        if (h0Var == null) {
            return null;
        }
        return h0Var.b();
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected void W(int i5, Object obj, int i6) {
        if (this.D || this.E || !e0(i5, obj, i6)) {
            return;
        }
        t0();
    }

    public abstract boolean X();

    public abstract void Z();

    public abstract boolean d1(int i5, @q0 Object obj);

    protected abstract boolean e0(int i5, Object obj, int i6);

    public void e1() {
        for (h0 h0Var : this.f6012s) {
            if (h0Var != null) {
                h0Var.e();
            }
        }
    }

    protected boolean g1(int i5) {
        h0 h0Var = this.f6012s[i5];
        if (h0Var != null) {
            return h0Var.e();
        }
        return false;
    }

    @Override // t0.c
    @o0
    public View getRoot() {
        return this.f6013t;
    }

    protected boolean h1(int i5, LiveData<?> liveData) {
        this.D = true;
        try {
            return l1(i5, liveData, P);
        } finally {
            this.D = false;
        }
    }

    protected boolean i1(int i5, u uVar) {
        return l1(i5, uVar, M);
    }

    protected boolean j1(int i5, y yVar) {
        return l1(i5, yVar, N);
    }

    public void k(@o0 b0 b0Var) {
        if (this.f6014u == null) {
            this.f6014u = new androidx.databinding.i<>(Q);
        }
        this.f6014u.a(b0Var);
    }

    protected boolean k1(int i5, z zVar) {
        return l1(i5, zVar, O);
    }

    @c1({c1.a.LIBRARY_GROUP})
    protected boolean l1(int i5, Object obj, androidx.databinding.j jVar) {
        if (obj == null) {
            return g1(i5);
        }
        h0 h0Var = this.f6012s[i5];
        if (h0Var == null) {
            r0(i5, obj, jVar);
            return true;
        }
        if (h0Var.b() == obj) {
            return false;
        }
        g1(i5);
        r0(i5, obj, jVar);
        return true;
    }

    protected void n(Class<?> cls) {
        if (this.f6019z != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    protected abstract void p();

    protected void r0(int i5, Object obj, androidx.databinding.j jVar) {
        if (obj == null) {
            return;
        }
        h0 h0Var = this.f6012s[i5];
        if (h0Var == null) {
            h0Var = jVar.a(this, i5, R);
            this.f6012s[i5] = h0Var;
            android.view.a0 a0Var = this.B;
            if (a0Var != null) {
                h0Var.c(a0Var);
            }
        }
        h0Var.d(obj);
    }

    public void s() {
        ViewDataBinding viewDataBinding = this.A;
        if (viewDataBinding == null) {
            q();
        } else {
            viewDataBinding.s();
        }
    }

    public void s0(@o0 b0 b0Var) {
        androidx.databinding.i<b0, ViewDataBinding, Void> iVar = this.f6014u;
        if (iVar != null) {
            iVar.o(b0Var);
        }
    }

    protected void t0() {
        ViewDataBinding viewDataBinding = this.A;
        if (viewDataBinding != null) {
            viewDataBinding.t0();
            return;
        }
        android.view.a0 a0Var = this.B;
        if (a0Var == null || a0Var.getLifecycle().b().isAtLeast(t.c.STARTED)) {
            synchronized (this) {
                if (this.f6010q) {
                    return;
                }
                this.f6010q = true;
                if (L) {
                    this.f6016w.postFrameCallback(this.f6017x);
                } else {
                    this.f6018y.post(this.f6009p);
                }
            }
        }
    }

    void v() {
        p();
    }

    protected ViewDataBinding(Object obj, View view, int i5) {
        this(m(obj), view, i5);
    }
}
