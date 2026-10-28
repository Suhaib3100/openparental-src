package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class VersionedParcel {

    /* renamed from: d, reason: collision with root package name */
    private static final String f10295d = "VersionedParcel";

    /* renamed from: e, reason: collision with root package name */
    private static final int f10296e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f10297f = -2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f10298g = -3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f10299h = -4;

    /* renamed from: i, reason: collision with root package name */
    private static final int f10300i = -5;

    /* renamed from: j, reason: collision with root package name */
    private static final int f10301j = -6;

    /* renamed from: k, reason: collision with root package name */
    private static final int f10302k = -7;

    /* renamed from: l, reason: collision with root package name */
    private static final int f10303l = -9;

    /* renamed from: m, reason: collision with root package name */
    private static final int f10304m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f10305n = 2;

    /* renamed from: o, reason: collision with root package name */
    private static final int f10306o = 3;

    /* renamed from: p, reason: collision with root package name */
    private static final int f10307p = 4;

    /* renamed from: q, reason: collision with root package name */
    private static final int f10308q = 5;

    /* renamed from: r, reason: collision with root package name */
    private static final int f10309r = 7;

    /* renamed from: s, reason: collision with root package name */
    private static final int f10310s = 8;

    /* renamed from: a, reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f10311a;

    /* renamed from: b, reason: collision with root package name */
    protected final androidx.collection.a<String, Method> f10312b;

    /* renamed from: c, reason: collision with root package name */
    protected final androidx.collection.a<String, Class> f10313c;

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    class a extends ObjectInputStream {
        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    public VersionedParcel(androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        this.f10311a = aVar;
        this.f10312b = aVar2;
        this.f10313c = aVar3;
    }

    private <T> void A0(Collection<T> collection) {
        if (collection == null) {
            L0(-1);
        }
        int size = collection.size();
        L0(size);
        if (size > 0) {
            int g5 = g(collection.iterator().next());
            L0(g5);
            switch (g5) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        l1((g) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        W0((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        Y0((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        e1((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        g1((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        L0(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        H0(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    private <T> void B0(Collection<T> collection, int i5) {
        i0(i5);
        A0(collection);
    }

    private Exception C(int i5, String str) {
        return b(i5, str);
    }

    private int E() {
        return L();
    }

    private void Y0(Serializable serializable) {
        if (serializable == null) {
            e1(null);
            return;
        }
        String name = serializable.getClass().getName();
        e1(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            t0(byteArrayOutputStream.toByteArray());
        } catch (IOException e6) {
            throw new RuntimeException(androidx.constraintlayout.solver.widgets.analyzer.e.a("VersionedParcelable encountered IOException writing serializable object (name = ", name, ")"), e6);
        }
    }

    private Exception b(int i5, String str) {
        switch (i5) {
            case f10303l /* -9 */:
                return (Exception) V();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i5 + " msg " + str);
            case f10302k /* -7 */:
                return new UnsupportedOperationException(str);
            case f10301j /* -6 */:
                return new NetworkOnMainThreadException();
            case f10300i /* -5 */:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    private Class d(Class<? extends g> cls) throws ClassNotFoundException {
        Class cls2 = this.f10313c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f10313c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method e(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f10311a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f10311a.put(str, declaredMethod);
        return declaredMethod;
    }

    @o0
    protected static Throwable f(@o0 Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private <T> int g(T t5) {
        if (t5 instanceof String) {
            return 4;
        }
        if (t5 instanceof Parcelable) {
            return 2;
        }
        if (t5 instanceof g) {
            return 1;
        }
        if (t5 instanceof Serializable) {
            return 3;
        }
        if (t5 instanceof IBinder) {
            return 5;
        }
        if (t5 instanceof Integer) {
            return 7;
        }
        if (t5 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t5.getClass().getName().concat(" cannot be VersionedParcelled"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Method h(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f10312b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class d6 = d(cls);
        System.currentTimeMillis();
        Method declaredMethod = d6.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f10312b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n1(g gVar) {
        try {
            e1(d(gVar.getClass()).getName());
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(gVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }

    private <T, S extends Collection<T>> S x(S s5) {
        int L = L();
        if (L < 0) {
            return null;
        }
        if (L != 0) {
            int L2 = L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    s5.add(g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    s5.add(V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    s5.add(X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    s5.add(c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    s5.add(e0());
                    L--;
                }
            }
        }
        return s5;
    }

    protected double[] A() {
        int L = L();
        if (L < 0) {
            return null;
        }
        double[] dArr = new double[L];
        for (int i5 = 0; i5 < L; i5++) {
            dArr[i5] = y();
        }
        return dArr;
    }

    public double[] B(double[] dArr, int i5) {
        return !F(i5) ? dArr : A();
    }

    protected abstract void C0(double d6);

    public Exception D(Exception exc, int i5) {
        if (!F(i5)) {
            return exc;
        }
        int L = L();
        return L != 0 ? b(L, c0()) : exc;
    }

    public void D0(double d6, int i5) {
        i0(i5);
        C0(d6);
    }

    protected void E0(double[] dArr) {
        if (dArr == null) {
            L0(-1);
            return;
        }
        L0(dArr.length);
        for (double d6 : dArr) {
            C0(d6);
        }
    }

    protected abstract boolean F(int i5);

    public void F0(double[] dArr, int i5) {
        i0(i5);
        E0(dArr);
    }

    protected abstract float G();

    /* JADX WARN: Multi-variable type inference failed */
    public void G0(Exception exc, int i5) {
        i0(i5);
        if (exc == 0) {
            V0();
            return;
        }
        int i6 = ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) ? f10303l : exc instanceof SecurityException ? -1 : exc instanceof BadParcelableException ? -2 : exc instanceof IllegalArgumentException ? -3 : exc instanceof NullPointerException ? -4 : exc instanceof IllegalStateException ? f10300i : exc instanceof NetworkOnMainThreadException ? f10301j : exc instanceof UnsupportedOperationException ? f10302k : 0;
        L0(i6);
        if (i6 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        e1(exc.getMessage());
        if (i6 != f10303l) {
            return;
        }
        W0((Parcelable) exc);
    }

    public float H(float f6, int i5) {
        return !F(i5) ? f6 : G();
    }

    protected abstract void H0(float f6);

    protected float[] I() {
        int L = L();
        if (L < 0) {
            return null;
        }
        float[] fArr = new float[L];
        for (int i5 = 0; i5 < L; i5++) {
            fArr[i5] = G();
        }
        return fArr;
    }

    public void I0(float f6, int i5) {
        i0(i5);
        H0(f6);
    }

    public float[] J(float[] fArr, int i5) {
        return !F(i5) ? fArr : I();
    }

    protected void J0(float[] fArr) {
        if (fArr == null) {
            L0(-1);
            return;
        }
        L0(fArr.length);
        for (float f6 : fArr) {
            H0(f6);
        }
    }

    protected <T extends g> T K(String str, VersionedParcel versionedParcel) {
        try {
            return (T) e(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (e9.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e9.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
        }
    }

    public void K0(float[] fArr, int i5) {
        i0(i5);
        J0(fArr);
    }

    protected abstract int L();

    protected abstract void L0(int i5);

    public int M(int i5, int i6) {
        return !F(i6) ? i5 : L();
    }

    public void M0(int i5, int i6) {
        i0(i6);
        L0(i5);
    }

    protected int[] N() {
        int L = L();
        if (L < 0) {
            return null;
        }
        int[] iArr = new int[L];
        for (int i5 = 0; i5 < L; i5++) {
            iArr[i5] = L();
        }
        return iArr;
    }

    protected void N0(int[] iArr) {
        if (iArr == null) {
            L0(-1);
            return;
        }
        L0(iArr.length);
        for (int i5 : iArr) {
            L0(i5);
        }
    }

    public int[] O(int[] iArr, int i5) {
        return !F(i5) ? iArr : N();
    }

    public void O0(int[] iArr, int i5) {
        i0(i5);
        N0(iArr);
    }

    public <T> List<T> P(List<T> list, int i5) {
        return !F(i5) ? list : (List) x(new ArrayList());
    }

    public <T> void P0(List<T> list, int i5) {
        B0(list, i5);
    }

    protected abstract long Q();

    protected abstract void Q0(long j5);

    public long R(long j5, int i5) {
        return !F(i5) ? j5 : Q();
    }

    public void R0(long j5, int i5) {
        i0(i5);
        Q0(j5);
    }

    protected long[] S() {
        int L = L();
        if (L < 0) {
            return null;
        }
        long[] jArr = new long[L];
        for (int i5 = 0; i5 < L; i5++) {
            jArr[i5] = Q();
        }
        return jArr;
    }

    protected void S0(long[] jArr) {
        if (jArr == null) {
            L0(-1);
            return;
        }
        L0(jArr.length);
        for (long j5 : jArr) {
            Q0(j5);
        }
    }

    public long[] T(long[] jArr, int i5) {
        return !F(i5) ? jArr : S();
    }

    public void T0(long[] jArr, int i5) {
        i0(i5);
        S0(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> U(Map<K, V> map, int i5) {
        if (!F(i5)) {
            return map;
        }
        int L = L();
        if (L < 0) {
            return null;
        }
        androidx.collection.a aVar = new androidx.collection.a();
        if (L == 0) {
            return aVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        x(arrayList);
        x(arrayList2);
        for (int i6 = 0; i6 < L; i6++) {
            aVar.put(arrayList.get(i6), arrayList2.get(i6));
        }
        return aVar;
    }

    public <K, V> void U0(Map<K, V> map, int i5) {
        i0(i5);
        if (map == null) {
            L0(-1);
            return;
        }
        int size = map.size();
        L0(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        A0(arrayList);
        A0(arrayList2);
    }

    protected abstract <T extends Parcelable> T V();

    protected void V0() {
        L0(0);
    }

    public <T extends Parcelable> T W(T t5, int i5) {
        return !F(i5) ? t5 : (T) V();
    }

    protected abstract void W0(Parcelable parcelable);

    protected Serializable X() {
        String c02 = c0();
        if (c02 == null) {
            return null;
        }
        try {
            return (Serializable) new a(new ByteArrayInputStream(s())).readObject();
        } catch (IOException e6) {
            throw new RuntimeException(androidx.constraintlayout.solver.widgets.analyzer.e.a("VersionedParcelable encountered IOException reading a Serializable object (name = ", c02, ")"), e6);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(androidx.constraintlayout.solver.widgets.analyzer.e.a("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ", c02, ")"), e7);
        }
    }

    public void X0(Parcelable parcelable, int i5) {
        i0(i5);
        W0(parcelable);
    }

    public <T> Set<T> Y(Set<T> set, int i5) {
        return !F(i5) ? set : (Set) x(new androidx.collection.b());
    }

    @x0(api = 21)
    public Size Z(Size size, int i5) {
        if (!F(i5)) {
            return size;
        }
        if (l()) {
            return new Size(L(), L());
        }
        return null;
    }

    public void Z0(Serializable serializable, int i5) {
        i0(i5);
        Y0(serializable);
    }

    protected abstract void a();

    @x0(api = 21)
    public SizeF a0(SizeF sizeF, int i5) {
        if (!F(i5)) {
            return sizeF;
        }
        if (l()) {
            return new SizeF(G(), G());
        }
        return null;
    }

    public <T> void a1(Set<T> set, int i5) {
        B0(set, i5);
    }

    public SparseBooleanArray b0(SparseBooleanArray sparseBooleanArray, int i5) {
        if (!F(i5)) {
            return sparseBooleanArray;
        }
        int L = L();
        if (L < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(L);
        for (int i6 = 0; i6 < L; i6++) {
            sparseBooleanArray2.put(L(), l());
        }
        return sparseBooleanArray2;
    }

    @x0(api = 21)
    public void b1(Size size, int i5) {
        i0(i5);
        m0(size != null);
        if (size != null) {
            L0(size.getWidth());
            L0(size.getHeight());
        }
    }

    protected abstract VersionedParcel c();

    protected abstract String c0();

    @x0(api = 21)
    public void c1(SizeF sizeF, int i5) {
        i0(i5);
        m0(sizeF != null);
        if (sizeF != null) {
            H0(sizeF.getWidth());
            H0(sizeF.getHeight());
        }
    }

    public String d0(String str, int i5) {
        return !F(i5) ? str : c0();
    }

    public void d1(SparseBooleanArray sparseBooleanArray, int i5) {
        i0(i5);
        if (sparseBooleanArray == null) {
            L0(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        L0(size);
        for (int i6 = 0; i6 < size; i6++) {
            L0(sparseBooleanArray.keyAt(i6));
            m0(sparseBooleanArray.valueAt(i6));
        }
    }

    protected abstract IBinder e0();

    protected abstract void e1(String str);

    public IBinder f0(IBinder iBinder, int i5) {
        return !F(i5) ? iBinder : e0();
    }

    public void f1(String str, int i5) {
        i0(i5);
        e1(str);
    }

    protected <T extends g> T g0() {
        String c02 = c0();
        if (c02 == null) {
            return null;
        }
        return (T) K(c02, c());
    }

    protected abstract void g1(IBinder iBinder);

    public <T extends g> T h0(T t5, int i5) {
        return !F(i5) ? t5 : (T) g0();
    }

    public void h1(IBinder iBinder, int i5) {
        i0(i5);
        g1(iBinder);
    }

    public boolean i() {
        return false;
    }

    protected abstract void i0(int i5);

    protected abstract void i1(IInterface iInterface);

    protected <T> T[] j(T[] tArr) {
        int L = L();
        if (L < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(L);
        if (L != 0) {
            int L2 = L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    arrayList.add(g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    arrayList.add(V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    arrayList.add(X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    arrayList.add(c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    arrayList.add(e0());
                    L--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public void j0(boolean z5, boolean z6) {
    }

    public void j1(IInterface iInterface, int i5) {
        i0(i5);
        i1(iInterface);
    }

    public <T> T[] k(T[] tArr, int i5) {
        return !F(i5) ? tArr : (T[]) j(tArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T> void k0(T[] tArr) {
        if (tArr == 0) {
            L0(-1);
            return;
        }
        int length = tArr.length;
        L0(length);
        if (length > 0) {
            int i5 = 0;
            int g5 = g(tArr[0]);
            L0(g5);
            if (g5 == 1) {
                while (i5 < length) {
                    l1((g) tArr[i5]);
                    i5++;
                }
                return;
            }
            if (g5 == 2) {
                while (i5 < length) {
                    W0((Parcelable) tArr[i5]);
                    i5++;
                }
                return;
            }
            if (g5 == 3) {
                while (i5 < length) {
                    Y0((Serializable) tArr[i5]);
                    i5++;
                }
            } else if (g5 == 4) {
                while (i5 < length) {
                    e1((String) tArr[i5]);
                    i5++;
                }
            } else {
                if (g5 != 5) {
                    return;
                }
                while (i5 < length) {
                    g1((IBinder) tArr[i5]);
                    i5++;
                }
            }
        }
    }

    protected <T extends g> void k1(T t5, VersionedParcel versionedParcel) {
        try {
            h(t5.getClass()).invoke(null, t5, versionedParcel);
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (!(e9.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
            }
            throw ((RuntimeException) e9.getCause());
        }
    }

    protected abstract boolean l();

    public <T> void l0(T[] tArr, int i5) {
        i0(i5);
        k0(tArr);
    }

    protected void l1(g gVar) {
        if (gVar == null) {
            e1(null);
            return;
        }
        n1(gVar);
        VersionedParcel c6 = c();
        k1(gVar, c6);
        c6.a();
    }

    public boolean m(boolean z5, int i5) {
        return !F(i5) ? z5 : l();
    }

    protected abstract void m0(boolean z5);

    public void m1(g gVar, int i5) {
        i0(i5);
        l1(gVar);
    }

    protected boolean[] n() {
        int L = L();
        if (L < 0) {
            return null;
        }
        boolean[] zArr = new boolean[L];
        for (int i5 = 0; i5 < L; i5++) {
            zArr[i5] = L() != 0;
        }
        return zArr;
    }

    public void n0(boolean z5, int i5) {
        i0(i5);
        m0(z5);
    }

    public boolean[] o(boolean[] zArr, int i5) {
        return !F(i5) ? zArr : n();
    }

    protected void o0(boolean[] zArr) {
        if (zArr == null) {
            L0(-1);
            return;
        }
        L0(zArr.length);
        for (boolean z5 : zArr) {
            L0(z5 ? 1 : 0);
        }
    }

    protected abstract Bundle p();

    public void p0(boolean[] zArr, int i5) {
        i0(i5);
        o0(zArr);
    }

    public Bundle q(Bundle bundle, int i5) {
        return !F(i5) ? bundle : p();
    }

    protected abstract void q0(Bundle bundle);

    public byte r(byte b6, int i5) {
        return !F(i5) ? b6 : (byte) (L() & 255);
    }

    public void r0(Bundle bundle, int i5) {
        i0(i5);
        q0(bundle);
    }

    protected abstract byte[] s();

    public void s0(byte b6, int i5) {
        i0(i5);
        L0(b6);
    }

    public byte[] t(byte[] bArr, int i5) {
        return !F(i5) ? bArr : s();
    }

    protected abstract void t0(byte[] bArr);

    public char[] u(char[] cArr, int i5) {
        if (!F(i5)) {
            return cArr;
        }
        int L = L();
        if (L < 0) {
            return null;
        }
        char[] cArr2 = new char[L];
        for (int i6 = 0; i6 < L; i6++) {
            cArr2[i6] = (char) L();
        }
        return cArr2;
    }

    public void u0(byte[] bArr, int i5) {
        i0(i5);
        t0(bArr);
    }

    protected abstract CharSequence v();

    protected abstract void v0(byte[] bArr, int i5, int i6);

    public CharSequence w(CharSequence charSequence, int i5) {
        return !F(i5) ? charSequence : v();
    }

    public void w0(byte[] bArr, int i5, int i6, int i7) {
        i0(i7);
        v0(bArr, i5, i6);
    }

    public void x0(char[] cArr, int i5) {
        i0(i5);
        if (cArr == null) {
            L0(-1);
            return;
        }
        L0(cArr.length);
        for (char c6 : cArr) {
            L0(c6);
        }
    }

    protected abstract double y();

    protected abstract void y0(CharSequence charSequence);

    public double z(double d6, int i5) {
        return !F(i5) ? d6 : y();
    }

    public void z0(CharSequence charSequence, int i5) {
        i0(i5);
        y0(charSequence);
    }
}
