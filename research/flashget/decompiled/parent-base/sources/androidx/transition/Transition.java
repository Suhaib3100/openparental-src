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
import androidx.compose.material3.j4;
import androidx.core.view.x1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public abstract class Transition implements Cloneable {
    static final boolean I = false;
    public static final int J = 1;
    private static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int N = 4;
    private static final int O = 4;
    y D;
    private f E;
    private androidx.collection.a<String, String> F;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<b0> f34313u;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList<b0> f34314v;
    private static final String P = "instance";
    private static final String Q = "name";
    private static final String R = "id";
    private static final String H = "Transition";
    private static final String X = "itemId";
    private static final int[] Y = {2, 1, 3, 4};
    private static final PathMotion Z = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> Q1 = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private String f34294b = getClass().getName();

    /* renamed from: c, reason: collision with root package name */
    private long f34295c = -1;

    /* renamed from: d, reason: collision with root package name */
    long f34296d = -1;

    /* renamed from: e, reason: collision with root package name */
    private TimeInterpolator f34297e = null;

    /* renamed from: f, reason: collision with root package name */
    ArrayList<Integer> f34298f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    ArrayList<View> f34299g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<String> f34300h = null;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<Class<?>> f34301i = null;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<Integer> f34302j = null;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<View> f34303k = null;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<Class<?>> f34304l = null;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<String> f34305m = null;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<Integer> f34306n = null;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<View> f34307o = null;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList<Class<?>> f34308p = null;

    /* renamed from: q, reason: collision with root package name */
    private c0 f34309q = new c0();

    /* renamed from: r, reason: collision with root package name */
    private c0 f34310r = new c0();

    /* renamed from: s, reason: collision with root package name */
    TransitionSet f34311s = null;

    /* renamed from: t, reason: collision with root package name */
    private int[] f34312t = Y;

    /* renamed from: w, reason: collision with root package name */
    boolean f34315w = false;

    /* renamed from: x, reason: collision with root package name */
    ArrayList<Animator> f34316x = new ArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    private int f34317y = 0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f34318z = false;
    private boolean A = false;
    private ArrayList<h> B = null;
    private ArrayList<Animator> C = new ArrayList<>();
    private PathMotion G = Z;

    class a extends PathMotion {
        a() {
        }

        @Override // androidx.transition.PathMotion
        public Path a(float f4, float f5, float f6, float f7) {
            Path path = new Path();
            path.moveTo(f4, f5);
            path.lineTo(f6, f7);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f34319b;

        b(androidx.collection.a aVar) {
            this.f34319b = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34319b.remove(animator);
            Transition.this.f34316x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.f34316x.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.v();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f34322a;

        /* renamed from: b, reason: collision with root package name */
        String f34323b;

        /* renamed from: c, reason: collision with root package name */
        b0 f34324c;

        /* renamed from: d, reason: collision with root package name */
        e1 f34325d;

        /* renamed from: e, reason: collision with root package name */
        Transition f34326e;

        d(View view, String str, Transition transition, e1 e1Var, b0 b0Var) {
            this.f34322a = view;
            this.f34323b = str;
            this.f34324c = b0Var;
            this.f34325d = e1Var;
            this.f34326e = transition;
        }
    }

    private static class e {
        private e() {
        }

        static <T> ArrayList<T> a(ArrayList<T> arrayList, T t4) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t4)) {
                arrayList.add(t4);
            }
            return arrayList;
        }

        static <T> ArrayList<T> b(ArrayList<T> arrayList, T t4) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t4);
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

    private ArrayList<Integer> A(ArrayList<Integer> arrayList, int i4, boolean z4) {
        return i4 > 0 ? z4 ? e.a(arrayList, Integer.valueOf(i4)) : e.b(arrayList, Integer.valueOf(i4)) : arrayList;
    }

    private static <T> ArrayList<T> B(ArrayList<T> arrayList, T t4, boolean z4) {
        return t4 != null ? z4 ? e.a(arrayList, t4) : e.b(arrayList, t4) : arrayList;
    }

    private ArrayList<Class<?>> G(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z4) {
        return cls != null ? z4 ? e.a(arrayList, cls) : e.b(arrayList, cls) : arrayList;
    }

    private ArrayList<View> H(ArrayList<View> arrayList, View view, boolean z4) {
        return view != null ? z4 ? e.a(arrayList, view) : e.b(arrayList, view) : arrayList;
    }

    private static androidx.collection.a<Animator, d> T() {
        androidx.collection.a<Animator, d> aVar = Q1.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
        Q1.set(aVar2);
        return aVar2;
    }

    private static boolean d0(int i4) {
        return i4 >= 1 && i4 <= 4;
    }

    private static boolean f0(b0 b0Var, b0 b0Var2, String str) {
        Object obj = b0Var.f34363a.get(str);
        Object obj2 = b0Var2.f34363a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void g(androidx.collection.a<View, b0> aVar, androidx.collection.a<View, b0> aVar2) {
        for (int i4 = 0; i4 < aVar.getSize(); i4++) {
            b0 valueAt = aVar.valueAt(i4);
            if (e0(valueAt.f34364b)) {
                this.f34313u.add(valueAt);
                this.f34314v.add(null);
            }
        }
        for (int i5 = 0; i5 < aVar2.getSize(); i5++) {
            b0 valueAt2 = aVar2.valueAt(i5);
            if (e0(valueAt2.f34364b)) {
                this.f34314v.add(valueAt2);
                this.f34313u.add(null);
            }
        }
    }

    private void g0(androidx.collection.a<View, b0> aVar, androidx.collection.a<View, b0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            View valueAt = sparseArray.valueAt(i4);
            if (valueAt != null && e0(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i4))) != null && e0(view)) {
                b0 b0Var = aVar.get(valueAt);
                b0 b0Var2 = aVar2.get(view);
                if (b0Var != null && b0Var2 != null) {
                    this.f34313u.add(b0Var);
                    this.f34314v.add(b0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void h0(androidx.collection.a<View, b0> aVar, androidx.collection.a<View, b0> aVar2) {
        b0 remove;
        for (int size = aVar.getSize() - 1; size >= 0; size--) {
            View keyAt = aVar.keyAt(size);
            if (keyAt != null && e0(keyAt) && (remove = aVar2.remove(keyAt)) != null && e0(remove.f34364b)) {
                this.f34313u.add(aVar.removeAt(size));
                this.f34314v.add(remove);
            }
        }
    }

    private static void i(c0 c0Var, View view, b0 b0Var) {
        c0Var.f34370a.put(view, b0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (c0Var.f34371b.indexOfKey(id2) >= 0) {
                c0Var.f34371b.put(id2, null);
            } else {
                c0Var.f34371b.put(id2, view);
            }
        }
        String A0 = x1.A0(view);
        if (A0 != null) {
            if (c0Var.f34373d.containsKey(A0)) {
                c0Var.f34373d.put(A0, null);
            } else {
                c0Var.f34373d.put(A0, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0Var.f34372c.l(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0Var.f34372c.p(itemIdAtPosition, view);
                    return;
                }
                View i4 = c0Var.f34372c.i(itemIdAtPosition);
                if (i4 != null) {
                    i4.setHasTransientState(false);
                    c0Var.f34372c.p(itemIdAtPosition, null);
                }
            }
        }
    }

    private void i0(androidx.collection.a<View, b0> aVar, androidx.collection.a<View, b0> aVar2, androidx.collection.e1<View> e1Var, androidx.collection.e1<View> e1Var2) {
        View i4;
        int z4 = e1Var.z();
        for (int i5 = 0; i5 < z4; i5++) {
            View A = e1Var.A(i5);
            if (A != null && e0(A) && (i4 = e1Var2.i(e1Var.o(i5))) != null && e0(i4)) {
                b0 b0Var = aVar.get(A);
                b0 b0Var2 = aVar2.get(i4);
                if (b0Var != null && b0Var2 != null) {
                    this.f34313u.add(b0Var);
                    this.f34314v.add(b0Var2);
                    aVar.remove(A);
                    aVar2.remove(i4);
                }
            }
        }
    }

    private static boolean k(int[] iArr, int i4) {
        int i5 = iArr[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            if (iArr[i6] == i5) {
                return true;
            }
        }
        return false;
    }

    private void k0(androidx.collection.a<View, b0> aVar, androidx.collection.a<View, b0> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            View valueAt = aVar3.valueAt(i4);
            if (valueAt != null && e0(valueAt) && (view = aVar4.get(aVar3.keyAt(i4))) != null && e0(view)) {
                b0 b0Var = aVar.get(valueAt);
                b0 b0Var2 = aVar2.get(view);
                if (b0Var != null && b0Var2 != null) {
                    this.f34313u.add(b0Var);
                    this.f34314v.add(b0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void l0(c0 c0Var, c0 c0Var2) {
        androidx.collection.a<View, b0> aVar = new androidx.collection.a<>(c0Var.f34370a);
        androidx.collection.a<View, b0> aVar2 = new androidx.collection.a<>(c0Var2.f34370a);
        int i4 = 0;
        while (true) {
            int[] iArr = this.f34312t;
            if (i4 >= iArr.length) {
                g(aVar, aVar2);
                return;
            }
            int i5 = iArr[i4];
            if (i5 == 1) {
                h0(aVar, aVar2);
            } else if (i5 == 2) {
                k0(aVar, aVar2, c0Var.f34373d, c0Var2.f34373d);
            } else if (i5 == 3) {
                g0(aVar, aVar2, c0Var.f34371b, c0Var2.f34371b);
            } else if (i5 == 4) {
                i0(aVar, aVar2, c0Var.f34372c, c0Var2.f34372c);
            }
            i4++;
        }
    }

    private static int[] m0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i4 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i4] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i4] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i4] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i4] = 4;
            } else {
                if (!trim.isEmpty()) {
                    throw new InflateException(android.support.v4.media.d.a("Unknown match type in matchOrder: '", trim, "'"));
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i4);
                i4--;
                iArr = iArr2;
            }
            i4++;
        }
        return iArr;
    }

    private void n(View view, boolean z4) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f34302j;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f34303k;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f34304l;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (this.f34304l.get(i4).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    b0 b0Var = new b0(view);
                    if (z4) {
                        p(b0Var);
                    } else {
                        m(b0Var);
                    }
                    b0Var.f34365c.add(this);
                    o(b0Var);
                    if (z4) {
                        i(this.f34309q, view, b0Var);
                    } else {
                        i(this.f34310r, view, b0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f34306n;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f34307o;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f34308p;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    if (this.f34308p.get(i5).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                                n(viewGroup.getChildAt(i6), z4);
                            }
                        }
                    }
                }
            }
        }
    }

    private void x0(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            l(animator);
        }
    }

    @androidx.annotation.o0
    public Transition A0(long j4) {
        this.f34296d = j4;
        return this;
    }

    public void B0(@androidx.annotation.q0 f fVar) {
        this.E = fVar;
    }

    @androidx.annotation.o0
    public Transition C(@androidx.annotation.d0 int i4, boolean z4) {
        this.f34302j = A(this.f34302j, i4, z4);
        return this;
    }

    @androidx.annotation.o0
    public Transition C0(@androidx.annotation.q0 TimeInterpolator timeInterpolator) {
        this.f34297e = timeInterpolator;
        return this;
    }

    @androidx.annotation.o0
    public Transition D(@androidx.annotation.o0 View view, boolean z4) {
        this.f34303k = H(this.f34303k, view, z4);
        return this;
    }

    public void D0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f34312t = Y;
            return;
        }
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (!d0(iArr[i4])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (k(iArr, i4)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f34312t = (int[]) iArr.clone();
    }

    @androidx.annotation.o0
    public Transition E(@androidx.annotation.o0 Class<?> cls, boolean z4) {
        this.f34304l = G(this.f34304l, cls, z4);
        return this;
    }

    public void E0(@androidx.annotation.q0 PathMotion pathMotion) {
        if (pathMotion == null) {
            this.G = Z;
        } else {
            this.G = pathMotion;
        }
    }

    @androidx.annotation.o0
    public Transition F(@androidx.annotation.o0 String str, boolean z4) {
        this.f34305m = B(this.f34305m, str, z4);
        return this;
    }

    public void F0(@androidx.annotation.q0 y yVar) {
        this.D = yVar;
    }

    @androidx.annotation.o0
    public Transition G0(long j4) {
        this.f34295c = j4;
        return this;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void H0() {
        if (this.f34317y == 0) {
            ArrayList<h> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((h) arrayList2.get(i4)).b(this);
                }
            }
            this.A = false;
        }
        this.f34317y++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void I(ViewGroup viewGroup) {
        androidx.collection.a<Animator, d> T = T();
        int size = T.getSize();
        if (viewGroup == null || size == 0) {
            return;
        }
        e1 d5 = o0.d(viewGroup);
        androidx.collection.a aVar = new androidx.collection.a(T);
        T.clear();
        for (int i4 = size - 1; i4 >= 0; i4--) {
            d dVar = (d) aVar.valueAt(i4);
            if (dVar.f34322a != null && d5 != null && d5.equals(dVar.f34325d)) {
                ((Animator) aVar.keyAt(i4)).end();
            }
        }
    }

    String I0(String str) {
        StringBuilder a5 = j4.a(str);
        a5.append(getClass().getSimpleName());
        a5.append("@");
        a5.append(Integer.toHexString(hashCode()));
        a5.append(": ");
        String sb = a5.toString();
        if (this.f34296d != -1) {
            sb = android.support.v4.media.session.b.a(androidx.constraintlayout.core.e.a(sb, "dur("), this.f34296d, ") ");
        }
        if (this.f34295c != -1) {
            sb = android.support.v4.media.session.b.a(androidx.constraintlayout.core.e.a(sb, "dly("), this.f34295c, ") ");
        }
        if (this.f34297e != null) {
            StringBuilder a6 = androidx.constraintlayout.core.e.a(sb, "interp(");
            a6.append(this.f34297e);
            a6.append(") ");
            sb = a6.toString();
        }
        if (this.f34298f.size() <= 0 && this.f34299g.size() <= 0) {
            return sb;
        }
        String a7 = androidx.compose.runtime.changelist.j.a(sb, "tgts(");
        if (this.f34298f.size() > 0) {
            for (int i4 = 0; i4 < this.f34298f.size(); i4++) {
                if (i4 > 0) {
                    a7 = androidx.compose.runtime.changelist.j.a(a7, ", ");
                }
                StringBuilder a8 = j4.a(a7);
                a8.append(this.f34298f.get(i4));
                a7 = a8.toString();
            }
        }
        if (this.f34299g.size() > 0) {
            for (int i5 = 0; i5 < this.f34299g.size(); i5++) {
                if (i5 > 0) {
                    a7 = androidx.compose.runtime.changelist.j.a(a7, ", ");
                }
                StringBuilder a10 = j4.a(a7);
                a10.append(this.f34299g.get(i5));
                a7 = a10.toString();
            }
        }
        return androidx.compose.runtime.changelist.j.a(a7, ")");
    }

    public long J() {
        return this.f34296d;
    }

    @androidx.annotation.q0
    public Rect K() {
        f fVar = this.E;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    @androidx.annotation.q0
    public f M() {
        return this.E;
    }

    @androidx.annotation.q0
    public TimeInterpolator N() {
        return this.f34297e;
    }

    b0 O(View view, boolean z4) {
        TransitionSet transitionSet = this.f34311s;
        if (transitionSet != null) {
            return transitionSet.O(view, z4);
        }
        ArrayList<b0> arrayList = z4 ? this.f34313u : this.f34314v;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            }
            b0 b0Var = arrayList.get(i4);
            if (b0Var == null) {
                return null;
            }
            if (b0Var.f34364b == view) {
                break;
            }
            i4++;
        }
        if (i4 >= 0) {
            return (z4 ? this.f34314v : this.f34313u).get(i4);
        }
        return null;
    }

    @androidx.annotation.o0
    public String P() {
        return this.f34294b;
    }

    @androidx.annotation.o0
    public PathMotion R() {
        return this.G;
    }

    @androidx.annotation.q0
    public y S() {
        return this.D;
    }

    public long U() {
        return this.f34295c;
    }

    @androidx.annotation.o0
    public List<Integer> V() {
        return this.f34298f;
    }

    @androidx.annotation.q0
    public List<String> W() {
        return this.f34300h;
    }

    @androidx.annotation.q0
    public List<Class<?>> Y() {
        return this.f34301i;
    }

    @androidx.annotation.o0
    public List<View> Z() {
        return this.f34299g;
    }

    @androidx.annotation.q0
    public String[] a0() {
        return null;
    }

    @androidx.annotation.o0
    public Transition b(@androidx.annotation.o0 h hVar) {
        if (this.B == null) {
            this.B = new ArrayList<>();
        }
        this.B.add(hVar);
        return this;
    }

    @androidx.annotation.q0
    public b0 b0(@androidx.annotation.o0 View view, boolean z4) {
        TransitionSet transitionSet = this.f34311s;
        if (transitionSet != null) {
            return transitionSet.b0(view, z4);
        }
        return (z4 ? this.f34309q : this.f34310r).f34370a.get(view);
    }

    @androidx.annotation.o0
    public Transition c(@androidx.annotation.d0 int i4) {
        if (i4 != 0) {
            this.f34298f.add(Integer.valueOf(i4));
        }
        return this;
    }

    public boolean c0(@androidx.annotation.q0 b0 b0Var, @androidx.annotation.q0 b0 b0Var2) {
        if (b0Var == null || b0Var2 == null) {
            return false;
        }
        String[] a02 = a0();
        if (a02 == null) {
            Iterator<String> it = b0Var.f34363a.keySet().iterator();
            while (it.hasNext()) {
                if (f0(b0Var, b0Var2, it.next())) {
                }
            }
            return false;
        }
        for (String str : a02) {
            if (!f0(b0Var, b0Var2, str)) {
            }
        }
        return false;
        return true;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void cancel() {
        for (int size = this.f34316x.size() - 1; size >= 0; size--) {
            this.f34316x.get(size).cancel();
        }
        ArrayList<h> arrayList = this.B;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.B.clone();
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((h) arrayList2.get(i4)).e(this);
        }
    }

    @androidx.annotation.o0
    public Transition d(@androidx.annotation.o0 View view) {
        this.f34299g.add(view);
        return this;
    }

    @androidx.annotation.o0
    public Transition e(@androidx.annotation.o0 Class<?> cls) {
        if (this.f34301i == null) {
            this.f34301i = new ArrayList<>();
        }
        this.f34301i.add(cls);
        return this;
    }

    boolean e0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f34302j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f34303k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f34304l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f34304l.get(i4).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f34305m != null && x1.A0(view) != null && this.f34305m.contains(x1.A0(view))) {
            return false;
        }
        if ((this.f34298f.size() == 0 && this.f34299g.size() == 0 && (((arrayList = this.f34301i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f34300h) == null || arrayList2.isEmpty()))) || this.f34298f.contains(Integer.valueOf(id2)) || this.f34299g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f34300h;
        if (arrayList6 != null && arrayList6.contains(x1.A0(view))) {
            return true;
        }
        if (this.f34301i != null) {
            for (int i5 = 0; i5 < this.f34301i.size(); i5++) {
                if (this.f34301i.get(i5).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @androidx.annotation.o0
    public Transition f(@androidx.annotation.o0 String str) {
        if (this.f34300h == null) {
            this.f34300h = new ArrayList<>();
        }
        this.f34300h.add(str);
        return this;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void l(Animator animator) {
        if (animator == null) {
            v();
            return;
        }
        if (J() >= 0) {
            animator.setDuration(J());
        }
        if (U() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + U());
        }
        if (N() != null) {
            animator.setInterpolator(N());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void m(@androidx.annotation.o0 b0 b0Var);

    void o(b0 b0Var) {
        String[] b5;
        if (this.D == null || b0Var.f34363a.isEmpty() || (b5 = this.D.b()) == null) {
            return;
        }
        for (String str : b5) {
            if (!b0Var.f34363a.containsKey(str)) {
                this.D.a(b0Var);
                return;
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void o0(View view) {
        if (this.A) {
            return;
        }
        for (int size = this.f34316x.size() - 1; size >= 0; size--) {
            this.f34316x.get(size).pause();
        }
        ArrayList<h> arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.B.clone();
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((h) arrayList2.get(i4)).c(this);
            }
        }
        this.f34318z = true;
    }

    public abstract void p(@androidx.annotation.o0 b0 b0Var);

    void p0(ViewGroup viewGroup) {
        d dVar;
        this.f34313u = new ArrayList<>();
        this.f34314v = new ArrayList<>();
        l0(this.f34309q, this.f34310r);
        androidx.collection.a<Animator, d> T = T();
        int size = T.getSize();
        e1 d5 = o0.d(viewGroup);
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator keyAt = T.keyAt(i4);
            if (keyAt != null && (dVar = T.get(keyAt)) != null && dVar.f34322a != null && d5.equals(dVar.f34325d)) {
                b0 b0Var = dVar.f34324c;
                View view = dVar.f34322a;
                b0 b02 = b0(view, true);
                b0 O2 = O(view, true);
                if (b02 == null && O2 == null) {
                    O2 = this.f34310r.f34370a.get(view);
                }
                if ((b02 != null || O2 != null) && dVar.f34326e.c0(b0Var, O2)) {
                    if (keyAt.isRunning() || keyAt.isStarted()) {
                        keyAt.cancel();
                    } else {
                        T.remove(keyAt);
                    }
                }
            }
        }
        u(viewGroup, this.f34309q, this.f34310r, this.f34313u, this.f34314v);
        y0();
    }

    void q(ViewGroup viewGroup, boolean z4) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        r(z4);
        if ((this.f34298f.size() > 0 || this.f34299g.size() > 0) && (((arrayList = this.f34300h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f34301i) == null || arrayList2.isEmpty()))) {
            for (int i4 = 0; i4 < this.f34298f.size(); i4++) {
                View findViewById = viewGroup.findViewById(this.f34298f.get(i4).intValue());
                if (findViewById != null) {
                    b0 b0Var = new b0(findViewById);
                    if (z4) {
                        p(b0Var);
                    } else {
                        m(b0Var);
                    }
                    b0Var.f34365c.add(this);
                    o(b0Var);
                    if (z4) {
                        i(this.f34309q, findViewById, b0Var);
                    } else {
                        i(this.f34310r, findViewById, b0Var);
                    }
                }
            }
            for (int i5 = 0; i5 < this.f34299g.size(); i5++) {
                View view = this.f34299g.get(i5);
                b0 b0Var2 = new b0(view);
                if (z4) {
                    p(b0Var2);
                } else {
                    m(b0Var2);
                }
                b0Var2.f34365c.add(this);
                o(b0Var2);
                if (z4) {
                    i(this.f34309q, view, b0Var2);
                } else {
                    i(this.f34310r, view, b0Var2);
                }
            }
        } else {
            n(viewGroup, z4);
        }
        if (z4 || (aVar = this.F) == null) {
            return;
        }
        int size = aVar.getSize();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            arrayList3.add(this.f34309q.f34373d.remove(this.F.keyAt(i6)));
        }
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) arrayList3.get(i7);
            if (view2 != null) {
                this.f34309q.f34373d.put(this.F.valueAt(i7), view2);
            }
        }
    }

    @androidx.annotation.o0
    public Transition q0(@androidx.annotation.o0 h hVar) {
        ArrayList<h> arrayList = this.B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(hVar);
        if (this.B.size() == 0) {
            this.B = null;
        }
        return this;
    }

    void r(boolean z4) {
        if (z4) {
            this.f34309q.f34370a.clear();
            this.f34309q.f34371b.clear();
            this.f34309q.f34372c.c();
        } else {
            this.f34310r.f34370a.clear();
            this.f34310r.f34371b.clear();
            this.f34310r.f34372c.c();
        }
    }

    @Override // 
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.C = new ArrayList<>();
            transition.f34309q = new c0();
            transition.f34310r = new c0();
            transition.f34313u = null;
            transition.f34314v = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @androidx.annotation.o0
    public Transition s0(@androidx.annotation.d0 int i4) {
        if (i4 != 0) {
            this.f34298f.remove(Integer.valueOf(i4));
        }
        return this;
    }

    @androidx.annotation.q0
    public Animator t(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 b0 b0Var, @androidx.annotation.q0 b0 b0Var2) {
        return null;
    }

    @androidx.annotation.o0
    public Transition t0(@androidx.annotation.o0 View view) {
        this.f34299g.remove(view);
        return this;
    }

    public String toString() {
        return I0("");
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void u(ViewGroup viewGroup, c0 c0Var, c0 c0Var2, ArrayList<b0> arrayList, ArrayList<b0> arrayList2) {
        Animator t4;
        int i4;
        View view;
        Animator animator;
        b0 b0Var;
        Animator animator2;
        b0 b0Var2;
        androidx.collection.a<Animator, d> T = T();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j4 = Long.MAX_VALUE;
        int i5 = 0;
        while (i5 < size) {
            b0 b0Var3 = arrayList.get(i5);
            b0 b0Var4 = arrayList2.get(i5);
            if (b0Var3 != null && !b0Var3.f34365c.contains(this)) {
                b0Var3 = null;
            }
            if (b0Var4 != null && !b0Var4.f34365c.contains(this)) {
                b0Var4 = null;
            }
            if (!(b0Var3 == null && b0Var4 == null) && ((b0Var3 == null || b0Var4 == null || c0(b0Var3, b0Var4)) && (t4 = t(viewGroup, b0Var3, b0Var4)) != null)) {
                if (b0Var4 != null) {
                    view = b0Var4.f34364b;
                    String[] a02 = a0();
                    if (a02 != null && a02.length > 0) {
                        b0Var2 = new b0(view);
                        i4 = size;
                        b0 b0Var5 = c0Var2.f34370a.get(view);
                        if (b0Var5 != null) {
                            int i6 = 0;
                            while (i6 < a02.length) {
                                Map<String, Object> map = b0Var2.f34363a;
                                String str = a02[i6];
                                map.put(str, b0Var5.f34363a.get(str));
                                i6++;
                                a02 = a02;
                            }
                        }
                        int size2 = T.getSize();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                animator2 = t4;
                                break;
                            }
                            d dVar = T.get(T.keyAt(i7));
                            if (dVar.f34324c != null && dVar.f34322a == view && dVar.f34323b.equals(P()) && dVar.f34324c.equals(b0Var2)) {
                                animator2 = null;
                                break;
                            }
                            i7++;
                        }
                    } else {
                        i4 = size;
                        animator2 = t4;
                        b0Var2 = null;
                    }
                    animator = animator2;
                    b0Var = b0Var2;
                } else {
                    i4 = size;
                    view = b0Var3.f34364b;
                    animator = t4;
                    b0Var = null;
                }
                if (animator != null) {
                    y yVar = this.D;
                    if (yVar != null) {
                        long c5 = yVar.c(viewGroup, this, b0Var3, b0Var4);
                        sparseIntArray.put(this.C.size(), (int) c5);
                        j4 = Math.min(c5, j4);
                    }
                    T.put(animator, new d(view, P(), this, o0.d(viewGroup), b0Var));
                    this.C.add(animator);
                    j4 = j4;
                }
            } else {
                i4 = size;
            }
            i5++;
            size = i4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
                Animator animator3 = this.C.get(sparseIntArray.keyAt(i10));
                animator3.setStartDelay(animator3.getStartDelay() + (sparseIntArray.valueAt(i10) - j4));
            }
        }
    }

    @androidx.annotation.o0
    public Transition u0(@androidx.annotation.o0 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.f34301i;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void v() {
        int i4 = this.f34317y - 1;
        this.f34317y = i4;
        if (i4 == 0) {
            ArrayList<h> arrayList = this.B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.B.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((h) arrayList2.get(i5)).d(this);
                }
            }
            for (int i6 = 0; i6 < this.f34309q.f34372c.z(); i6++) {
                View A = this.f34309q.f34372c.A(i6);
                if (A != null) {
                    x1.Y1(A, false);
                }
            }
            for (int i7 = 0; i7 < this.f34310r.f34372c.z(); i7++) {
                View A2 = this.f34310r.f34372c.A(i7);
                if (A2 != null) {
                    x1.Y1(A2, false);
                }
            }
            this.A = true;
        }
    }

    @androidx.annotation.o0
    public Transition v0(@androidx.annotation.o0 String str) {
        ArrayList<String> arrayList = this.f34300h;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @androidx.annotation.o0
    public Transition w(@androidx.annotation.d0 int i4, boolean z4) {
        this.f34306n = A(this.f34306n, i4, z4);
        return this;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void w0(View view) {
        if (this.f34318z) {
            if (!this.A) {
                for (int size = this.f34316x.size() - 1; size >= 0; size--) {
                    this.f34316x.get(size).resume();
                }
                ArrayList<h> arrayList = this.B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.B.clone();
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((h) arrayList2.get(i4)).a(this);
                    }
                }
            }
            this.f34318z = false;
        }
    }

    @androidx.annotation.o0
    public Transition y(@androidx.annotation.o0 View view, boolean z4) {
        this.f34307o = H(this.f34307o, view, z4);
        return this;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected void y0() {
        H0();
        androidx.collection.a<Animator, d> T = T();
        Iterator<Animator> it = this.C.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (T.containsKey(next)) {
                H0();
                x0(next, T);
            }
        }
        this.C.clear();
        v();
    }

    @androidx.annotation.o0
    public Transition z(@androidx.annotation.o0 Class<?> cls, boolean z4) {
        this.f34308p = G(this.f34308p, cls, z4);
        return this;
    }

    void z0(boolean z4) {
        this.f34315w = z4;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f35207c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k4 = androidx.core.content.res.n.k(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (k4 >= 0) {
            A0(k4);
        }
        long k5 = androidx.core.content.res.n.k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k5 > 0) {
            G0(k5);
        }
        int l4 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l4 > 0) {
            C0(AnimationUtils.loadInterpolator(context, l4));
        }
        String m4 = androidx.core.content.res.n.m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m4 != null) {
            D0(m0(m4));
        }
        obtainStyledAttributes.recycle();
    }
}
