package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.c1;
import androidx.core.view.y1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    static final boolean W = false;
    public static final int X = 1;
    private static final int Y = 1;
    public static final int Z = 2;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f9781a0 = 3;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f9782b0 = 4;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f9783c0 = 4;
    private ArrayList<d0> H;
    private ArrayList<d0> I;
    a0 R;
    private f S;
    private androidx.collection.a<String, String> T;
    private static final String V = "Transition";

    /* renamed from: g0, reason: collision with root package name */
    private static final String f9787g0 = "itemId";

    /* renamed from: f0, reason: collision with root package name */
    private static final String f9786f0 = "id";

    /* renamed from: e0, reason: collision with root package name */
    private static final String f9785e0 = "name";

    /* renamed from: d0, reason: collision with root package name */
    private static final String f9784d0 = "instance";

    /* renamed from: h0, reason: collision with root package name */
    private static final int[] f9788h0 = {2, 1, 3, 4};

    /* renamed from: i0, reason: collision with root package name */
    private static final PathMotion f9789i0 = new a();

    /* renamed from: j0, reason: collision with root package name */
    private static ThreadLocal<androidx.collection.a<Animator, d>> f9790j0 = new ThreadLocal<>();

    /* renamed from: o, reason: collision with root package name */
    private String f9791o = getClass().getName();

    /* renamed from: p, reason: collision with root package name */
    private long f9792p = -1;

    /* renamed from: q, reason: collision with root package name */
    long f9793q = -1;

    /* renamed from: r, reason: collision with root package name */
    private TimeInterpolator f9794r = null;

    /* renamed from: s, reason: collision with root package name */
    ArrayList<Integer> f9795s = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    ArrayList<View> f9796t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<String> f9797u = null;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList<Class<?>> f9798v = null;

    /* renamed from: w, reason: collision with root package name */
    private ArrayList<Integer> f9799w = null;

    /* renamed from: x, reason: collision with root package name */
    private ArrayList<View> f9800x = null;

    /* renamed from: y, reason: collision with root package name */
    private ArrayList<Class<?>> f9801y = null;

    /* renamed from: z, reason: collision with root package name */
    private ArrayList<String> f9802z = null;
    private ArrayList<Integer> A = null;
    private ArrayList<View> B = null;
    private ArrayList<Class<?>> C = null;
    private e0 D = new e0();
    private e0 E = new e0();
    TransitionSet F = null;
    private int[] G = f9788h0;
    private ViewGroup J = null;
    boolean K = false;
    ArrayList<Animator> L = new ArrayList<>();
    private int M = 0;
    private boolean N = false;
    private boolean O = false;
    private ArrayList<h> P = null;
    private ArrayList<Animator> Q = new ArrayList<>();
    private PathMotion U = f9789i0;

    /* loaded from: classes3.dex */
    static class a extends PathMotion {
        a() {
        }

        @Override // androidx.transition.PathMotion
        public Path a(float f6, float f7, float f8, float f9) {
            Path path = new Path();
            path.moveTo(f6, f7);
            path.lineTo(f8, f9);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f9803a;

        b(androidx.collection.a aVar) {
            this.f9803a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9803a.remove(animator);
            Transition.this.L.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.L.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.w();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f9806a;

        /* renamed from: b, reason: collision with root package name */
        String f9807b;

        /* renamed from: c, reason: collision with root package name */
        d0 f9808c;

        /* renamed from: d, reason: collision with root package name */
        h1 f9809d;

        /* renamed from: e, reason: collision with root package name */
        Transition f9810e;

        d(View view, String str, Transition transition, h1 h1Var, d0 d0Var) {
            this.f9806a = view;
            this.f9807b = str;
            this.f9808c = d0Var;
            this.f9809d = h1Var;
            this.f9810e = transition;
        }
    }

    private static class e {
        private e() {
        }

        static <T> ArrayList<T> a(ArrayList<T> arrayList, T t5) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t5)) {
                arrayList.add(t5);
            }
            return arrayList;
        }

        static <T> ArrayList<T> b(ArrayList<T> arrayList, T t5) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t5);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    public static abstract class f {
        public abstract Rect a(@androidx.annotation.o0 Transition transition);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    public interface h {
        void a(@androidx.annotation.o0 Transition transition);

        void b(@androidx.annotation.o0 Transition transition);

        void c(@androidx.annotation.o0 Transition transition);

        void d(@androidx.annotation.o0 Transition transition);

        void e(@androidx.annotation.o0 Transition transition);
    }

    public Transition() {
    }

    private ArrayList<Integer> A(ArrayList<Integer> arrayList, int i5, boolean z5) {
        return i5 > 0 ? z5 ? e.a(arrayList, Integer.valueOf(i5)) : e.b(arrayList, Integer.valueOf(i5)) : arrayList;
    }

    private static <T> ArrayList<T> B(ArrayList<T> arrayList, T t5, boolean z5) {
        return t5 != null ? z5 ? e.a(arrayList, t5) : e.b(arrayList, t5) : arrayList;
    }

    private void B0(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            k(animator);
        }
    }

    private ArrayList<Class<?>> G(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z5) {
        return cls != null ? z5 ? e.a(arrayList, cls) : e.b(arrayList, cls) : arrayList;
    }

    private ArrayList<View> I(ArrayList<View> arrayList, View view, boolean z5) {
        return view != null ? z5 ? e.a(arrayList, view) : e.b(arrayList, view) : arrayList;
    }

    private static androidx.collection.a<Animator, d> W() {
        androidx.collection.a<Animator, d> aVar = f9790j0.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
        f9790j0.set(aVar2);
        return aVar2;
    }

    private void f(androidx.collection.a<View, d0> aVar, androidx.collection.a<View, d0> aVar2) {
        for (int i5 = 0; i5 < aVar.size(); i5++) {
            d0 q5 = aVar.q(i5);
            if (j0(q5.f9860b)) {
                this.H.add(q5);
                this.I.add(null);
            }
        }
        for (int i6 = 0; i6 < aVar2.size(); i6++) {
            d0 q6 = aVar2.q(i6);
            if (j0(q6.f9860b)) {
                this.I.add(q6);
                this.H.add(null);
            }
        }
    }

    private static void i(e0 e0Var, View view, d0 d0Var) {
        e0Var.f9870a.put(view, d0Var);
        int id = view.getId();
        if (id >= 0) {
            if (e0Var.f9871b.indexOfKey(id) >= 0) {
                e0Var.f9871b.put(id, null);
            } else {
                e0Var.f9871b.put(id, view);
            }
        }
        String x02 = y1.x0(view);
        if (x02 != null) {
            if (e0Var.f9873d.containsKey(x02)) {
                e0Var.f9873d.put(x02, null);
            } else {
                e0Var.f9873d.put(x02, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (e0Var.f9872c.l(itemIdAtPosition) < 0) {
                    y1.Q1(view, true);
                    e0Var.f9872c.p(itemIdAtPosition, view);
                    return;
                }
                View j5 = e0Var.f9872c.j(itemIdAtPosition);
                if (j5 != null) {
                    y1.Q1(j5, false);
                    e0Var.f9872c.p(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean i0(int i5) {
        return i5 >= 1 && i5 <= 4;
    }

    private static boolean j(int[] iArr, int i5) {
        int i6 = iArr[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            if (iArr[i7] == i6) {
                return true;
            }
        }
        return false;
    }

    private static boolean k0(d0 d0Var, d0 d0Var2, String str) {
        Object obj = d0Var.f9859a.get(str);
        Object obj2 = d0Var2.f9859a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void l0(androidx.collection.a<View, d0> aVar, androidx.collection.a<View, d0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            View valueAt = sparseArray.valueAt(i5);
            if (valueAt != null && j0(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i5))) != null && j0(view)) {
                d0 d0Var = aVar.get(valueAt);
                d0 d0Var2 = aVar2.get(view);
                if (d0Var != null && d0Var2 != null) {
                    this.H.add(d0Var);
                    this.I.add(d0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void m(View view, boolean z5) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f9799w;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.f9800x;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f9801y;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        if (this.f9801y.get(i5).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    d0 d0Var = new d0(view);
                    if (z5) {
                        o(d0Var);
                    } else {
                        l(d0Var);
                    }
                    d0Var.f9861c.add(this);
                    n(d0Var);
                    if (z5) {
                        i(this.D, view, d0Var);
                    } else {
                        i(this.E, view, d0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.A;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.B;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.C;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    if (this.C.get(i6).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                                m(viewGroup.getChildAt(i7), z5);
                            }
                        }
                    }
                }
            }
        }
    }

    private void m0(androidx.collection.a<View, d0> aVar, androidx.collection.a<View, d0> aVar2) {
        d0 remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View l5 = aVar.l(size);
            if (l5 != null && j0(l5) && (remove = aVar2.remove(l5)) != null && j0(remove.f9860b)) {
                this.H.add(aVar.n(size));
                this.I.add(remove);
            }
        }
    }

    private void n0(androidx.collection.a<View, d0> aVar, androidx.collection.a<View, d0> aVar2, androidx.collection.f<View> fVar, androidx.collection.f<View> fVar2) {
        View j5;
        int A = fVar.A();
        for (int i5 = 0; i5 < A; i5++) {
            View B = fVar.B(i5);
            if (B != null && j0(B) && (j5 = fVar2.j(fVar.o(i5))) != null && j0(j5)) {
                d0 d0Var = aVar.get(B);
                d0 d0Var2 = aVar2.get(j5);
                if (d0Var != null && d0Var2 != null) {
                    this.H.add(d0Var);
                    this.I.add(d0Var2);
                    aVar.remove(B);
                    aVar2.remove(j5);
                }
            }
        }
    }

    private void o0(androidx.collection.a<View, d0> aVar, androidx.collection.a<View, d0> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i5 = 0; i5 < size; i5++) {
            View q5 = aVar3.q(i5);
            if (q5 != null && j0(q5) && (view = aVar4.get(aVar3.l(i5))) != null && j0(view)) {
                d0 d0Var = aVar.get(q5);
                d0 d0Var2 = aVar2.get(view);
                if (d0Var != null && d0Var2 != null) {
                    this.H.add(d0Var);
                    this.I.add(d0Var2);
                    aVar.remove(q5);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void q0(e0 e0Var, e0 e0Var2) {
        androidx.collection.a<View, d0> aVar = new androidx.collection.a<>(e0Var.f9870a);
        androidx.collection.a<View, d0> aVar2 = new androidx.collection.a<>(e0Var2.f9870a);
        int i5 = 0;
        while (true) {
            int[] iArr = this.G;
            if (i5 >= iArr.length) {
                f(aVar, aVar2);
                return;
            }
            int i6 = iArr[i5];
            if (i6 == 1) {
                m0(aVar, aVar2);
            } else if (i6 == 2) {
                o0(aVar, aVar2, e0Var.f9873d, e0Var2.f9873d);
            } else if (i6 == 3) {
                l0(aVar, aVar2, e0Var.f9871b, e0Var2.f9871b);
            } else if (i6 == 4) {
                n0(aVar, aVar2, e0Var.f9872c, e0Var2.f9872c);
            }
            i5++;
        }
    }

    private static int[] r0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i5 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i5] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i5] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i5] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i5] = 4;
            } else {
                if (!trim.isEmpty()) {
                    throw new InflateException(androidx.constraintlayout.solver.widgets.analyzer.e.a("Unknown match type in matchOrder: '", trim, "'"));
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i5);
                i5--;
                iArr = iArr2;
            }
            i5++;
        }
        return iArr;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void A0(View view) {
        if (this.N) {
            if (!this.O) {
                androidx.collection.a<Animator, d> W2 = W();
                int size = W2.size();
                h1 d6 = q0.d(view);
                for (int i5 = size - 1; i5 >= 0; i5--) {
                    d q5 = W2.q(i5);
                    if (q5.f9806a != null && d6.equals(q5.f9809d)) {
                        W2.l(i5).resume();
                    }
                }
                ArrayList<h> arrayList = this.P;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.P.clone();
                    int size2 = arrayList2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        ((h) arrayList2.get(i6)).e(this);
                    }
                }
            }
            this.N = false;
        }
    }

    @androidx.annotation.o0
    public Transition C(@androidx.annotation.d0 int i5, boolean z5) {
        this.f9799w = A(this.f9799w, i5, z5);
        return this;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void C0() {
        M0();
        androidx.collection.a<Animator, d> W2 = W();
        Iterator<Animator> it = this.Q.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (W2.containsKey(next)) {
                M0();
                B0(next, W2);
            }
        }
        this.Q.clear();
        w();
    }

    @androidx.annotation.o0
    public Transition D(@androidx.annotation.o0 View view, boolean z5) {
        this.f9800x = I(this.f9800x, view, z5);
        return this;
    }

    void D0(boolean z5) {
        this.K = z5;
    }

    @androidx.annotation.o0
    public Transition E(@androidx.annotation.o0 Class<?> cls, boolean z5) {
        this.f9801y = G(this.f9801y, cls, z5);
        return this;
    }

    @androidx.annotation.o0
    public Transition E0(long j5) {
        this.f9793q = j5;
        return this;
    }

    @androidx.annotation.o0
    public Transition F(@androidx.annotation.o0 String str, boolean z5) {
        this.f9802z = B(this.f9802z, str, z5);
        return this;
    }

    public void F0(@androidx.annotation.q0 f fVar) {
        this.S = fVar;
    }

    @androidx.annotation.o0
    public Transition G0(@androidx.annotation.q0 TimeInterpolator timeInterpolator) {
        this.f9794r = timeInterpolator;
        return this;
    }

    public void H0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.G = f9788h0;
            return;
        }
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (!i0(iArr[i5])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (j(iArr, i5)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.G = (int[]) iArr.clone();
    }

    public void I0(@androidx.annotation.q0 PathMotion pathMotion) {
        if (pathMotion == null) {
            this.U = f9789i0;
        } else {
            this.U = pathMotion;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void J(ViewGroup viewGroup) {
        androidx.collection.a<Animator, d> W2 = W();
        int size = W2.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        h1 d6 = q0.d(viewGroup);
        androidx.collection.a aVar = new androidx.collection.a(W2);
        W2.clear();
        for (int i5 = size - 1; i5 >= 0; i5--) {
            d dVar = (d) aVar.q(i5);
            if (dVar.f9806a != null && d6 != null && d6.equals(dVar.f9809d)) {
                ((Animator) aVar.l(i5)).end();
            }
        }
    }

    public void J0(@androidx.annotation.q0 a0 a0Var) {
        this.R = a0Var;
    }

    public long K() {
        return this.f9793q;
    }

    Transition K0(ViewGroup viewGroup) {
        this.J = viewGroup;
        return this;
    }

    @androidx.annotation.q0
    public Rect L() {
        f fVar = this.S;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    @androidx.annotation.o0
    public Transition L0(long j5) {
        this.f9792p = j5;
        return this;
    }

    @androidx.annotation.q0
    public f M() {
        return this.S;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void M0() {
        if (this.M == 0) {
            ArrayList<h> arrayList = this.P;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.P.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((h) arrayList2.get(i5)).a(this);
                }
            }
            this.O = false;
        }
        this.M++;
    }

    @androidx.annotation.q0
    public TimeInterpolator N() {
        return this.f9794r;
    }

    String O0(String str) {
        StringBuilder a6 = androidx.constraintlayout.motion.widget.r.a(str);
        a6.append(getClass().getSimpleName());
        a6.append("@");
        a6.append(Integer.toHexString(hashCode()));
        a6.append(": ");
        String sb = a6.toString();
        if (this.f9793q != -1) {
            StringBuilder a7 = androidx.constraintlayout.motion.widget.c.a(sb, "dur(");
            a7.append(this.f9793q);
            a7.append(") ");
            sb = a7.toString();
        }
        if (this.f9792p != -1) {
            StringBuilder a8 = androidx.constraintlayout.motion.widget.c.a(sb, "dly(");
            a8.append(this.f9792p);
            a8.append(") ");
            sb = a8.toString();
        }
        if (this.f9794r != null) {
            StringBuilder a9 = androidx.constraintlayout.motion.widget.c.a(sb, "interp(");
            a9.append(this.f9794r);
            a9.append(") ");
            sb = a9.toString();
        }
        if (this.f9795s.size() <= 0 && this.f9796t.size() <= 0) {
            return sb;
        }
        String a10 = androidx.concurrent.futures.b.a(sb, "tgts(");
        if (this.f9795s.size() > 0) {
            for (int i5 = 0; i5 < this.f9795s.size(); i5++) {
                if (i5 > 0) {
                    a10 = androidx.concurrent.futures.b.a(a10, ", ");
                }
                StringBuilder a11 = androidx.constraintlayout.motion.widget.r.a(a10);
                a11.append(this.f9795s.get(i5));
                a10 = a11.toString();
            }
        }
        if (this.f9796t.size() > 0) {
            for (int i6 = 0; i6 < this.f9796t.size(); i6++) {
                if (i6 > 0) {
                    a10 = androidx.concurrent.futures.b.a(a10, ", ");
                }
                StringBuilder a12 = androidx.constraintlayout.motion.widget.r.a(a10);
                a12.append(this.f9796t.get(i6));
                a10 = a12.toString();
            }
        }
        return androidx.concurrent.futures.b.a(a10, ")");
    }

    d0 Q(View view, boolean z5) {
        TransitionSet transitionSet = this.F;
        if (transitionSet != null) {
            return transitionSet.Q(view, z5);
        }
        ArrayList<d0> arrayList = z5 ? this.H : this.I;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            }
            d0 d0Var = arrayList.get(i5);
            if (d0Var == null) {
                return null;
            }
            if (d0Var.f9860b == view) {
                break;
            }
            i5++;
        }
        if (i5 >= 0) {
            return (z5 ? this.I : this.H).get(i5);
        }
        return null;
    }

    @androidx.annotation.o0
    public String S() {
        return this.f9791o;
    }

    @androidx.annotation.o0
    public PathMotion T() {
        return this.U;
    }

    @androidx.annotation.q0
    public a0 V() {
        return this.R;
    }

    public long Y() {
        return this.f9792p;
    }

    @androidx.annotation.o0
    public Transition a(@androidx.annotation.o0 h hVar) {
        if (this.P == null) {
            this.P = new ArrayList<>();
        }
        this.P.add(hVar);
        return this;
    }

    @androidx.annotation.o0
    public List<Integer> a0() {
        return this.f9795s;
    }

    @androidx.annotation.o0
    public Transition b(@androidx.annotation.d0 int i5) {
        if (i5 != 0) {
            this.f9795s.add(Integer.valueOf(i5));
        }
        return this;
    }

    @androidx.annotation.q0
    public List<String> b0() {
        return this.f9797u;
    }

    @androidx.annotation.o0
    public Transition c(@androidx.annotation.o0 View view) {
        this.f9796t.add(view);
        return this;
    }

    @androidx.annotation.q0
    public List<Class<?>> c0() {
        return this.f9798v;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void cancel() {
        for (int size = this.L.size() - 1; size >= 0; size--) {
            this.L.get(size).cancel();
        }
        ArrayList<h> arrayList = this.P;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.P.clone();
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((h) arrayList2.get(i5)).d(this);
        }
    }

    @androidx.annotation.o0
    public Transition d(@androidx.annotation.o0 Class<?> cls) {
        if (this.f9798v == null) {
            this.f9798v = new ArrayList<>();
        }
        this.f9798v.add(cls);
        return this;
    }

    @androidx.annotation.o0
    public List<View> d0() {
        return this.f9796t;
    }

    @androidx.annotation.o0
    public Transition e(@androidx.annotation.o0 String str) {
        if (this.f9797u == null) {
            this.f9797u = new ArrayList<>();
        }
        this.f9797u.add(str);
        return this;
    }

    @androidx.annotation.q0
    public String[] e0() {
        return null;
    }

    @androidx.annotation.q0
    public d0 g0(@androidx.annotation.o0 View view, boolean z5) {
        TransitionSet transitionSet = this.F;
        if (transitionSet != null) {
            return transitionSet.g0(view, z5);
        }
        return (z5 ? this.D : this.E).f9870a.get(view);
    }

    public boolean h0(@androidx.annotation.q0 d0 d0Var, @androidx.annotation.q0 d0 d0Var2) {
        if (d0Var == null || d0Var2 == null) {
            return false;
        }
        String[] e02 = e0();
        if (e02 == null) {
            Iterator<String> it = d0Var.f9859a.keySet().iterator();
            while (it.hasNext()) {
                if (k0(d0Var, d0Var2, it.next())) {
                }
            }
            return false;
        }
        for (String str : e02) {
            if (!k0(d0Var, d0Var2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean j0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f9799w;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f9800x;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f9801y;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (this.f9801y.get(i5).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f9802z != null && y1.x0(view) != null && this.f9802z.contains(y1.x0(view))) {
            return false;
        }
        if ((this.f9795s.size() == 0 && this.f9796t.size() == 0 && (((arrayList = this.f9798v) == null || arrayList.isEmpty()) && ((arrayList2 = this.f9797u) == null || arrayList2.isEmpty()))) || this.f9795s.contains(Integer.valueOf(id)) || this.f9796t.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f9797u;
        if (arrayList6 != null && arrayList6.contains(y1.x0(view))) {
            return true;
        }
        if (this.f9798v != null) {
            for (int i6 = 0; i6 < this.f9798v.size(); i6++) {
                if (this.f9798v.get(i6).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void k(Animator animator) {
        if (animator == null) {
            w();
            return;
        }
        if (K() >= 0) {
            animator.setDuration(K());
        }
        if (Y() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + Y());
        }
        if (N() != null) {
            animator.setInterpolator(N());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void l(@androidx.annotation.o0 d0 d0Var);

    void n(d0 d0Var) {
        String[] b6;
        if (this.R == null || d0Var.f9859a.isEmpty() || (b6 = this.R.b()) == null) {
            return;
        }
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= b6.length) {
                z5 = true;
                break;
            } else if (!d0Var.f9859a.containsKey(b6[i5])) {
                break;
            } else {
                i5++;
            }
        }
        if (z5) {
            return;
        }
        this.R.a(d0Var);
    }

    public abstract void o(@androidx.annotation.o0 d0 d0Var);

    void p(ViewGroup viewGroup, boolean z5) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        q(z5);
        if ((this.f9795s.size() > 0 || this.f9796t.size() > 0) && (((arrayList = this.f9797u) == null || arrayList.isEmpty()) && ((arrayList2 = this.f9798v) == null || arrayList2.isEmpty()))) {
            for (int i5 = 0; i5 < this.f9795s.size(); i5++) {
                View findViewById = viewGroup.findViewById(this.f9795s.get(i5).intValue());
                if (findViewById != null) {
                    d0 d0Var = new d0(findViewById);
                    if (z5) {
                        o(d0Var);
                    } else {
                        l(d0Var);
                    }
                    d0Var.f9861c.add(this);
                    n(d0Var);
                    if (z5) {
                        i(this.D, findViewById, d0Var);
                    } else {
                        i(this.E, findViewById, d0Var);
                    }
                }
            }
            for (int i6 = 0; i6 < this.f9796t.size(); i6++) {
                View view = this.f9796t.get(i6);
                d0 d0Var2 = new d0(view);
                if (z5) {
                    o(d0Var2);
                } else {
                    l(d0Var2);
                }
                d0Var2.f9861c.add(this);
                n(d0Var2);
                if (z5) {
                    i(this.D, view, d0Var2);
                } else {
                    i(this.E, view, d0Var2);
                }
            }
        } else {
            m(viewGroup, z5);
        }
        if (z5 || (aVar = this.T) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            arrayList3.add(this.D.f9873d.remove(this.T.l(i7)));
        }
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) arrayList3.get(i8);
            if (view2 != null) {
                this.D.f9873d.put(this.T.q(i8), view2);
            }
        }
    }

    void q(boolean z5) {
        if (z5) {
            this.D.f9870a.clear();
            this.D.f9871b.clear();
            this.D.f9872c.b();
        } else {
            this.E.f9870a.clear();
            this.E.f9871b.clear();
            this.E.f9872c.b();
        }
    }

    @Override // 
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.Q = new ArrayList<>();
            transition.D = new e0();
            transition.E = new e0();
            transition.H = null;
            transition.I = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void s0(View view) {
        if (this.O) {
            return;
        }
        androidx.collection.a<Animator, d> W2 = W();
        int size = W2.size();
        h1 d6 = q0.d(view);
        for (int i5 = size - 1; i5 >= 0; i5--) {
            d q5 = W2.q(i5);
            if (q5.f9806a != null && d6.equals(q5.f9809d)) {
                W2.l(i5).pause();
            }
        }
        ArrayList<h> arrayList = this.P;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.P.clone();
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((h) arrayList2.get(i6)).b(this);
            }
        }
        this.N = true;
    }

    void t0(ViewGroup viewGroup) {
        d dVar;
        this.H = new ArrayList<>();
        this.I = new ArrayList<>();
        q0(this.D, this.E);
        androidx.collection.a<Animator, d> W2 = W();
        int size = W2.size();
        h1 d6 = q0.d(viewGroup);
        for (int i5 = size - 1; i5 >= 0; i5--) {
            Animator l5 = W2.l(i5);
            if (l5 != null && (dVar = W2.get(l5)) != null && dVar.f9806a != null && d6.equals(dVar.f9809d)) {
                d0 d0Var = dVar.f9808c;
                View view = dVar.f9806a;
                d0 g02 = g0(view, true);
                d0 Q = Q(view, true);
                if (g02 == null && Q == null) {
                    Q = this.E.f9870a.get(view);
                }
                if (!(g02 == null && Q == null) && dVar.f9810e.h0(d0Var, Q)) {
                    if (l5.isRunning() || l5.isStarted()) {
                        l5.cancel();
                    } else {
                        W2.remove(l5);
                    }
                }
            }
        }
        v(viewGroup, this.D, this.E, this.H, this.I);
        C0();
    }

    public String toString() {
        return O0("");
    }

    @androidx.annotation.q0
    public Animator u(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 d0 d0Var, @androidx.annotation.q0 d0 d0Var2) {
        return null;
    }

    @androidx.annotation.o0
    public Transition u0(@androidx.annotation.o0 h hVar) {
        ArrayList<h> arrayList = this.P;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(hVar);
        if (this.P.size() == 0) {
            this.P = null;
        }
        return this;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void v(ViewGroup viewGroup, e0 e0Var, e0 e0Var2, ArrayList<d0> arrayList, ArrayList<d0> arrayList2) {
        Animator u5;
        int i5;
        View view;
        Animator animator;
        d0 d0Var;
        Animator animator2;
        d0 d0Var2;
        androidx.collection.a<Animator, d> W2 = W();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j5 = Long.MAX_VALUE;
        int i6 = 0;
        while (i6 < size) {
            d0 d0Var3 = arrayList.get(i6);
            d0 d0Var4 = arrayList2.get(i6);
            if (d0Var3 != null && !d0Var3.f9861c.contains(this)) {
                d0Var3 = null;
            }
            if (d0Var4 != null && !d0Var4.f9861c.contains(this)) {
                d0Var4 = null;
            }
            if (d0Var3 != null || d0Var4 != null) {
                if ((d0Var3 == null || d0Var4 == null || h0(d0Var3, d0Var4)) && (u5 = u(viewGroup, d0Var3, d0Var4)) != null) {
                    if (d0Var4 != null) {
                        view = d0Var4.f9860b;
                        String[] e02 = e0();
                        if (e02 != null && e02.length > 0) {
                            d0Var2 = new d0(view);
                            i5 = size;
                            d0 d0Var5 = e0Var2.f9870a.get(view);
                            if (d0Var5 != null) {
                                int i7 = 0;
                                while (i7 < e02.length) {
                                    Map<String, Object> map = d0Var2.f9859a;
                                    String str = e02[i7];
                                    map.put(str, d0Var5.f9859a.get(str));
                                    i7++;
                                    e02 = e02;
                                }
                            }
                            int size2 = W2.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size2) {
                                    animator2 = u5;
                                    break;
                                }
                                d dVar = W2.get(W2.l(i8));
                                if (dVar.f9808c != null && dVar.f9806a == view && dVar.f9807b.equals(S()) && dVar.f9808c.equals(d0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i8++;
                            }
                        } else {
                            i5 = size;
                            animator2 = u5;
                            d0Var2 = null;
                        }
                        animator = animator2;
                        d0Var = d0Var2;
                    } else {
                        i5 = size;
                        view = d0Var3.f9860b;
                        animator = u5;
                        d0Var = null;
                    }
                    if (animator != null) {
                        a0 a0Var = this.R;
                        if (a0Var != null) {
                            long c6 = a0Var.c(viewGroup, this, d0Var3, d0Var4);
                            sparseIntArray.put(this.Q.size(), (int) c6);
                            j5 = Math.min(c6, j5);
                        }
                        W2.put(animator, new d(view, S(), this, q0.d(viewGroup), d0Var));
                        this.Q.add(animator);
                        j5 = j5;
                    }
                    i6++;
                    size = i5;
                }
            }
            i5 = size;
            i6++;
            size = i5;
        }
        if (sparseIntArray.size() != 0) {
            for (int i9 = 0; i9 < sparseIntArray.size(); i9++) {
                Animator animator3 = this.Q.get(sparseIntArray.keyAt(i9));
                animator3.setStartDelay(animator3.getStartDelay() + (sparseIntArray.valueAt(i9) - j5));
            }
        }
    }

    @androidx.annotation.o0
    public Transition v0(@androidx.annotation.d0 int i5) {
        if (i5 != 0) {
            this.f9795s.remove(Integer.valueOf(i5));
        }
        return this;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void w() {
        int i5 = this.M - 1;
        this.M = i5;
        if (i5 == 0) {
            ArrayList<h> arrayList = this.P;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.P.clone();
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((h) arrayList2.get(i6)).c(this);
                }
            }
            for (int i7 = 0; i7 < this.D.f9872c.A(); i7++) {
                View B = this.D.f9872c.B(i7);
                if (B != null) {
                    y1.Q1(B, false);
                }
            }
            for (int i8 = 0; i8 < this.E.f9872c.A(); i8++) {
                View B2 = this.E.f9872c.B(i8);
                if (B2 != null) {
                    y1.Q1(B2, false);
                }
            }
            this.O = true;
        }
    }

    @androidx.annotation.o0
    public Transition w0(@androidx.annotation.o0 View view) {
        this.f9796t.remove(view);
        return this;
    }

    @androidx.annotation.o0
    public Transition x(@androidx.annotation.d0 int i5, boolean z5) {
        this.A = A(this.A, i5, z5);
        return this;
    }

    @androidx.annotation.o0
    public Transition x0(@androidx.annotation.o0 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.f9798v;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @androidx.annotation.o0
    public Transition y(@androidx.annotation.o0 View view, boolean z5) {
        this.B = I(this.B, view, z5);
        return this;
    }

    @androidx.annotation.o0
    public Transition z(@androidx.annotation.o0 Class<?> cls, boolean z5) {
        this.C = G(this.C, cls, z5);
        return this;
    }

    @androidx.annotation.o0
    public Transition z0(@androidx.annotation.o0 String str) {
        ArrayList<String> arrayList = this.f9797u;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f10082c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k5 = androidx.core.content.res.p.k(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (k5 >= 0) {
            E0(k5);
        }
        long k6 = androidx.core.content.res.p.k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k6 > 0) {
            L0(k6);
        }
        int l5 = androidx.core.content.res.p.l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l5 > 0) {
            G0(AnimationUtils.loadInterpolator(context, l5));
        }
        String m5 = androidx.core.content.res.p.m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m5 != null) {
            H0(r0(m5));
        }
        obtainStyledAttributes.recycle();
    }
}
