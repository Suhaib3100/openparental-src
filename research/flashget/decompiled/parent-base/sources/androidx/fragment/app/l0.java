package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.core.view.x1;
import androidx.view.AbstractC1450w;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes3.dex */
public abstract class l0 {
    static final int A = 7;
    static final int B = 8;
    static final int C = 9;
    static final int D = 10;
    public static final int E = 4096;
    public static final int F = 8192;
    public static final int G = -1;
    public static final int H = 0;
    public static final int I = 4097;
    public static final int J = 8194;
    public static final int K = 4099;
    public static final int L = 4100;
    public static final int M = 8197;

    /* renamed from: t, reason: collision with root package name */
    static final int f29984t = 0;

    /* renamed from: u, reason: collision with root package name */
    static final int f29985u = 1;

    /* renamed from: v, reason: collision with root package name */
    static final int f29986v = 2;

    /* renamed from: w, reason: collision with root package name */
    static final int f29987w = 3;

    /* renamed from: x, reason: collision with root package name */
    static final int f29988x = 4;

    /* renamed from: y, reason: collision with root package name */
    static final int f29989y = 5;

    /* renamed from: z, reason: collision with root package name */
    static final int f29990z = 6;

    /* renamed from: a, reason: collision with root package name */
    private final n f29991a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f29992b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<a> f29993c;

    /* renamed from: d, reason: collision with root package name */
    int f29994d;

    /* renamed from: e, reason: collision with root package name */
    int f29995e;

    /* renamed from: f, reason: collision with root package name */
    int f29996f;

    /* renamed from: g, reason: collision with root package name */
    int f29997g;

    /* renamed from: h, reason: collision with root package name */
    int f29998h;

    /* renamed from: i, reason: collision with root package name */
    boolean f29999i;

    /* renamed from: j, reason: collision with root package name */
    boolean f30000j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.q0
    String f30001k;

    /* renamed from: l, reason: collision with root package name */
    int f30002l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f30003m;

    /* renamed from: n, reason: collision with root package name */
    int f30004n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f30005o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<String> f30006p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList<String> f30007q;

    /* renamed from: r, reason: collision with root package name */
    boolean f30008r;

    /* renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f30009s;

    /* compiled from: FragmentTransaction.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f30010a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f30011b;

        /* renamed from: c, reason: collision with root package name */
        boolean f30012c;

        /* renamed from: d, reason: collision with root package name */
        int f30013d;

        /* renamed from: e, reason: collision with root package name */
        int f30014e;

        /* renamed from: f, reason: collision with root package name */
        int f30015f;

        /* renamed from: g, reason: collision with root package name */
        int f30016g;

        /* renamed from: h, reason: collision with root package name */
        AbstractC1450w.b f30017h;

        /* renamed from: i, reason: collision with root package name */
        AbstractC1450w.b f30018i;

        a() {
        }

        a(int i4, Fragment fragment) {
            this.f30010a = i4;
            this.f30011b = fragment;
            this.f30012c = false;
            AbstractC1450w.b bVar = AbstractC1450w.b.RESUMED;
            this.f30017h = bVar;
            this.f30018i = bVar;
        }

        a(int i4, Fragment fragment, boolean z4) {
            this.f30010a = i4;
            this.f30011b = fragment;
            this.f30012c = z4;
            AbstractC1450w.b bVar = AbstractC1450w.b.RESUMED;
            this.f30017h = bVar;
            this.f30018i = bVar;
        }

        a(int i4, @androidx.annotation.o0 Fragment fragment, AbstractC1450w.b bVar) {
            this.f30010a = i4;
            this.f30011b = fragment;
            this.f30012c = false;
            this.f30017h = fragment.mMaxState;
            this.f30018i = bVar;
        }

        a(a aVar) {
            this.f30010a = aVar.f30010a;
            this.f30011b = aVar.f30011b;
            this.f30012c = aVar.f30012c;
            this.f30013d = aVar.f30013d;
            this.f30014e = aVar.f30014e;
            this.f30015f = aVar.f30015f;
            this.f30016g = aVar.f30016g;
            this.f30017h = aVar.f30017h;
            this.f30018i = aVar.f30018i;
        }
    }

    @Deprecated
    public l0() {
        this.f29993c = new ArrayList<>();
        this.f30000j = true;
        this.f30008r = false;
        this.f29991a = null;
        this.f29992b = null;
    }

    @androidx.annotation.o0
    private Fragment v(@androidx.annotation.o0 Class<? extends Fragment> cls, @androidx.annotation.q0 Bundle bundle) {
        n nVar = this.f29991a;
        if (nVar == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f29992b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment instantiate = nVar.instantiate(classLoader, cls.getName());
        if (bundle != null) {
            instantiate.setArguments(bundle);
        }
        return instantiate;
    }

    public boolean A() {
        return this.f30000j;
    }

    public boolean B() {
        return this.f29993c.isEmpty();
    }

    @androidx.annotation.o0
    public l0 C(@androidx.annotation.o0 Fragment fragment) {
        n(new a(3, fragment));
        return this;
    }

    @androidx.annotation.o0
    public l0 D(@androidx.annotation.d0 int i4, @androidx.annotation.o0 Fragment fragment) {
        return E(i4, fragment, null);
    }

    @androidx.annotation.o0
    public l0 E(@androidx.annotation.d0 int i4, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.q0 String str) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        y(i4, fragment, str, 2);
        return this;
    }

    @androidx.annotation.o0
    public final l0 F(@androidx.annotation.d0 int i4, @androidx.annotation.o0 Class<? extends Fragment> cls, @androidx.annotation.q0 Bundle bundle) {
        return G(i4, cls, bundle, null);
    }

    @androidx.annotation.o0
    public final l0 G(@androidx.annotation.d0 int i4, @androidx.annotation.o0 Class<? extends Fragment> cls, @androidx.annotation.q0 Bundle bundle, @androidx.annotation.q0 String str) {
        return E(i4, v(cls, bundle), str);
    }

    @androidx.annotation.o0
    public l0 H(@androidx.annotation.o0 Runnable runnable) {
        x();
        if (this.f30009s == null) {
            this.f30009s = new ArrayList<>();
        }
        this.f30009s.add(runnable);
        return this;
    }

    @androidx.annotation.o0
    @Deprecated
    public l0 I(boolean z4) {
        return R(z4);
    }

    @androidx.annotation.o0
    @Deprecated
    public l0 J(@g1 int i4) {
        this.f30004n = i4;
        this.f30005o = null;
        return this;
    }

    @androidx.annotation.o0
    @Deprecated
    public l0 K(@androidx.annotation.q0 CharSequence charSequence) {
        this.f30004n = 0;
        this.f30005o = charSequence;
        return this;
    }

    @androidx.annotation.o0
    @Deprecated
    public l0 L(@g1 int i4) {
        this.f30002l = i4;
        this.f30003m = null;
        return this;
    }

    @androidx.annotation.o0
    @Deprecated
    public l0 M(@androidx.annotation.q0 CharSequence charSequence) {
        this.f30002l = 0;
        this.f30003m = charSequence;
        return this;
    }

    @androidx.annotation.o0
    public l0 N(@androidx.annotation.a @androidx.annotation.b int i4, @androidx.annotation.a @androidx.annotation.b int i5) {
        return O(i4, i5, 0, 0);
    }

    @androidx.annotation.o0
    public l0 O(@androidx.annotation.a @androidx.annotation.b int i4, @androidx.annotation.a @androidx.annotation.b int i5, @androidx.annotation.a @androidx.annotation.b int i6, @androidx.annotation.a @androidx.annotation.b int i7) {
        this.f29994d = i4;
        this.f29995e = i5;
        this.f29996f = i6;
        this.f29997g = i7;
        return this;
    }

    @androidx.annotation.o0
    public l0 P(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 AbstractC1450w.b bVar) {
        n(new a(10, fragment, bVar));
        return this;
    }

    @androidx.annotation.o0
    public l0 Q(@androidx.annotation.q0 Fragment fragment) {
        n(new a(8, fragment));
        return this;
    }

    @androidx.annotation.o0
    public l0 R(boolean z4) {
        this.f30008r = z4;
        return this;
    }

    @androidx.annotation.o0
    public l0 S(int i4) {
        this.f29998h = i4;
        return this;
    }

    @androidx.annotation.o0
    @Deprecated
    public l0 T(@h1 int i4) {
        return this;
    }

    @androidx.annotation.o0
    public l0 U(@androidx.annotation.o0 Fragment fragment) {
        n(new a(5, fragment));
        return this;
    }

    @androidx.annotation.o0
    public l0 g(@androidx.annotation.d0 int i4, @androidx.annotation.o0 Fragment fragment) {
        y(i4, fragment, null, 1);
        return this;
    }

    @androidx.annotation.o0
    public l0 h(@androidx.annotation.d0 int i4, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.q0 String str) {
        y(i4, fragment, str, 1);
        return this;
    }

    @androidx.annotation.o0
    public final l0 i(@androidx.annotation.d0 int i4, @androidx.annotation.o0 Class<? extends Fragment> cls, @androidx.annotation.q0 Bundle bundle) {
        return g(i4, v(cls, bundle));
    }

    @androidx.annotation.o0
    public final l0 j(@androidx.annotation.d0 int i4, @androidx.annotation.o0 Class<? extends Fragment> cls, @androidx.annotation.q0 Bundle bundle, @androidx.annotation.q0 String str) {
        return h(i4, v(cls, bundle), str);
    }

    l0 k(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 Fragment fragment, @androidx.annotation.q0 String str) {
        fragment.mContainer = viewGroup;
        return h(viewGroup.getId(), fragment, str);
    }

    @androidx.annotation.o0
    public l0 l(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.q0 String str) {
        y(0, fragment, str, 1);
        return this;
    }

    @androidx.annotation.o0
    public final l0 m(@androidx.annotation.o0 Class<? extends Fragment> cls, @androidx.annotation.q0 Bundle bundle, @androidx.annotation.q0 String str) {
        return l(v(cls, bundle), str);
    }

    void n(a aVar) {
        this.f29993c.add(aVar);
        aVar.f30013d = this.f29994d;
        aVar.f30014e = this.f29995e;
        aVar.f30015f = this.f29996f;
        aVar.f30016g = this.f29997g;
    }

    @androidx.annotation.o0
    public l0 o(@androidx.annotation.o0 View view, @androidx.annotation.o0 String str) {
        if (n0.f()) {
            String A0 = x1.A0(view);
            if (A0 == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f30006p == null) {
                this.f30006p = new ArrayList<>();
                this.f30007q = new ArrayList<>();
            } else {
                if (this.f30007q.contains(str)) {
                    throw new IllegalArgumentException(android.support.v4.media.d.a("A shared element with the target name '", str, "' has already been added to the transaction."));
                }
                if (this.f30006p.contains(A0)) {
                    throw new IllegalArgumentException(android.support.v4.media.d.a("A shared element with the source name '", A0, "' has already been added to the transaction."));
                }
            }
            this.f30006p.add(A0);
            this.f30007q.add(str);
        }
        return this;
    }

    @androidx.annotation.o0
    public l0 p(@androidx.annotation.q0 String str) {
        if (!this.f30000j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f29999i = true;
        this.f30001k = str;
        return this;
    }

    @androidx.annotation.o0
    public l0 q(@androidx.annotation.o0 Fragment fragment) {
        n(new a(7, fragment));
        return this;
    }

    public abstract int r();

    public abstract int s();

    public abstract void t();

    public abstract void u();

    @androidx.annotation.o0
    public l0 w(@androidx.annotation.o0 Fragment fragment) {
        n(new a(6, fragment));
        return this;
    }

    @androidx.annotation.o0
    public l0 x() {
        if (this.f29999i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f30000j = false;
        return this;
    }

    void y(int i4, Fragment fragment, @androidx.annotation.q0 String str, int i5) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            w1.c.i(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                sb.append(": was ");
                throw new IllegalStateException(k0.a(sb, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i4 != 0) {
            if (i4 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i6 = fragment.mFragmentId;
            if (i6 != 0 && i6 != i4) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i4);
            }
            fragment.mFragmentId = i4;
            fragment.mContainerId = i4;
        }
        n(new a(i5, fragment));
    }

    @androidx.annotation.o0
    public l0 z(@androidx.annotation.o0 Fragment fragment) {
        n(new a(4, fragment));
        return this;
    }

    l0(@androidx.annotation.o0 n nVar, @androidx.annotation.q0 ClassLoader classLoader) {
        this.f29993c = new ArrayList<>();
        this.f30000j = true;
        this.f30008r = false;
        this.f29991a = nVar;
        this.f29992b = classLoader;
    }

    l0(@androidx.annotation.o0 n nVar, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 l0 l0Var) {
        this(nVar, classLoader);
        Iterator<a> it = l0Var.f29993c.iterator();
        while (it.hasNext()) {
            this.f29993c.add(new a(it.next()));
        }
        this.f29994d = l0Var.f29994d;
        this.f29995e = l0Var.f29995e;
        this.f29996f = l0Var.f29996f;
        this.f29997g = l0Var.f29997g;
        this.f29998h = l0Var.f29998h;
        this.f29999i = l0Var.f29999i;
        this.f30000j = l0Var.f30000j;
        this.f30001k = l0Var.f30001k;
        this.f30004n = l0Var.f30004n;
        this.f30005o = l0Var.f30005o;
        this.f30002l = l0Var.f30002l;
        this.f30003m = l0Var.f30003m;
        if (l0Var.f30006p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f30006p = arrayList;
            arrayList.addAll(l0Var.f30006p);
        }
        if (l0Var.f30007q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f30007q = arrayList2;
            arrayList2.addAll(l0Var.f30007q);
        }
        this.f30008r = l0Var.f30008r;
    }
}
