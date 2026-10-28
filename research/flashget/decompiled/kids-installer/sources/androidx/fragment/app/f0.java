package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.t;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.q0;
import androidx.core.view.y1;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class f0 {
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
    static final int f8229t = 0;

    /* renamed from: u, reason: collision with root package name */
    static final int f8230u = 1;

    /* renamed from: v, reason: collision with root package name */
    static final int f8231v = 2;

    /* renamed from: w, reason: collision with root package name */
    static final int f8232w = 3;

    /* renamed from: x, reason: collision with root package name */
    static final int f8233x = 4;

    /* renamed from: y, reason: collision with root package name */
    static final int f8234y = 5;

    /* renamed from: z, reason: collision with root package name */
    static final int f8235z = 6;

    /* renamed from: a, reason: collision with root package name */
    private final l f8236a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f8237b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<a> f8238c;

    /* renamed from: d, reason: collision with root package name */
    int f8239d;

    /* renamed from: e, reason: collision with root package name */
    int f8240e;

    /* renamed from: f, reason: collision with root package name */
    int f8241f;

    /* renamed from: g, reason: collision with root package name */
    int f8242g;

    /* renamed from: h, reason: collision with root package name */
    int f8243h;

    /* renamed from: i, reason: collision with root package name */
    boolean f8244i;

    /* renamed from: j, reason: collision with root package name */
    boolean f8245j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    String f8246k;

    /* renamed from: l, reason: collision with root package name */
    int f8247l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f8248m;

    /* renamed from: n, reason: collision with root package name */
    int f8249n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f8250o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<String> f8251p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList<String> f8252q;

    /* renamed from: r, reason: collision with root package name */
    boolean f8253r;

    /* renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f8254s;

    /* compiled from: FragmentTransaction.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f8255a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f8256b;

        /* renamed from: c, reason: collision with root package name */
        boolean f8257c;

        /* renamed from: d, reason: collision with root package name */
        int f8258d;

        /* renamed from: e, reason: collision with root package name */
        int f8259e;

        /* renamed from: f, reason: collision with root package name */
        int f8260f;

        /* renamed from: g, reason: collision with root package name */
        int f8261g;

        /* renamed from: h, reason: collision with root package name */
        t.c f8262h;

        /* renamed from: i, reason: collision with root package name */
        t.c f8263i;

        a() {
        }

        a(int i5, Fragment fragment) {
            this.f8255a = i5;
            this.f8256b = fragment;
            this.f8257c = false;
            t.c cVar = t.c.RESUMED;
            this.f8262h = cVar;
            this.f8263i = cVar;
        }

        a(int i5, Fragment fragment, boolean z5) {
            this.f8255a = i5;
            this.f8256b = fragment;
            this.f8257c = z5;
            t.c cVar = t.c.RESUMED;
            this.f8262h = cVar;
            this.f8263i = cVar;
        }

        a(int i5, @androidx.annotation.o0 Fragment fragment, t.c cVar) {
            this.f8255a = i5;
            this.f8256b = fragment;
            this.f8257c = false;
            this.f8262h = fragment.mMaxState;
            this.f8263i = cVar;
        }

        a(a aVar) {
            this.f8255a = aVar.f8255a;
            this.f8256b = aVar.f8256b;
            this.f8257c = aVar.f8257c;
            this.f8258d = aVar.f8258d;
            this.f8259e = aVar.f8259e;
            this.f8260f = aVar.f8260f;
            this.f8261g = aVar.f8261g;
            this.f8262h = aVar.f8262h;
            this.f8263i = aVar.f8263i;
        }
    }

    @Deprecated
    public f0() {
        this.f8238c = new ArrayList<>();
        this.f8245j = true;
        this.f8253r = false;
        this.f8236a = null;
        this.f8237b = null;
    }

    @androidx.annotation.o0
    private Fragment q(@androidx.annotation.o0 Class<? extends Fragment> cls, @q0 Bundle bundle) {
        l lVar = this.f8236a;
        if (lVar == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f8237b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment a6 = lVar.a(classLoader, cls.getName());
        if (bundle != null) {
            a6.setArguments(bundle);
        }
        return a6;
    }

    @androidx.annotation.o0
    public final f0 A(@androidx.annotation.d0 int i5, @androidx.annotation.o0 Class<? extends Fragment> cls, @q0 Bundle bundle) {
        return B(i5, cls, bundle, null);
    }

    @androidx.annotation.o0
    public final f0 B(@androidx.annotation.d0 int i5, @androidx.annotation.o0 Class<? extends Fragment> cls, @q0 Bundle bundle, @q0 String str) {
        return z(i5, q(cls, bundle), str);
    }

    @androidx.annotation.o0
    public f0 C(@androidx.annotation.o0 Runnable runnable) {
        s();
        if (this.f8254s == null) {
            this.f8254s = new ArrayList<>();
        }
        this.f8254s.add(runnable);
        return this;
    }

    @androidx.annotation.o0
    @Deprecated
    public f0 D(boolean z5) {
        return M(z5);
    }

    @androidx.annotation.o0
    @Deprecated
    public f0 E(@g1 int i5) {
        this.f8249n = i5;
        this.f8250o = null;
        return this;
    }

    @androidx.annotation.o0
    @Deprecated
    public f0 F(@q0 CharSequence charSequence) {
        this.f8249n = 0;
        this.f8250o = charSequence;
        return this;
    }

    @androidx.annotation.o0
    @Deprecated
    public f0 G(@g1 int i5) {
        this.f8247l = i5;
        this.f8248m = null;
        return this;
    }

    @androidx.annotation.o0
    @Deprecated
    public f0 H(@q0 CharSequence charSequence) {
        this.f8247l = 0;
        this.f8248m = charSequence;
        return this;
    }

    @androidx.annotation.o0
    public f0 I(@androidx.annotation.a @androidx.annotation.b int i5, @androidx.annotation.a @androidx.annotation.b int i6) {
        return J(i5, i6, 0, 0);
    }

    @androidx.annotation.o0
    public f0 J(@androidx.annotation.a @androidx.annotation.b int i5, @androidx.annotation.a @androidx.annotation.b int i6, @androidx.annotation.a @androidx.annotation.b int i7, @androidx.annotation.a @androidx.annotation.b int i8) {
        this.f8239d = i5;
        this.f8240e = i6;
        this.f8241f = i7;
        this.f8242g = i8;
        return this;
    }

    @androidx.annotation.o0
    public f0 K(@androidx.annotation.o0 Fragment fragment, @androidx.annotation.o0 t.c cVar) {
        i(new a(10, fragment, cVar));
        return this;
    }

    @androidx.annotation.o0
    public f0 L(@q0 Fragment fragment) {
        i(new a(8, fragment));
        return this;
    }

    @androidx.annotation.o0
    public f0 M(boolean z5) {
        this.f8253r = z5;
        return this;
    }

    @androidx.annotation.o0
    public f0 N(int i5) {
        this.f8243h = i5;
        return this;
    }

    @androidx.annotation.o0
    @Deprecated
    public f0 O(@h1 int i5) {
        return this;
    }

    @androidx.annotation.o0
    public f0 P(@androidx.annotation.o0 Fragment fragment) {
        i(new a(5, fragment));
        return this;
    }

    @androidx.annotation.o0
    public f0 b(@androidx.annotation.d0 int i5, @androidx.annotation.o0 Fragment fragment) {
        t(i5, fragment, null, 1);
        return this;
    }

    @androidx.annotation.o0
    public f0 c(@androidx.annotation.d0 int i5, @androidx.annotation.o0 Fragment fragment, @q0 String str) {
        t(i5, fragment, str, 1);
        return this;
    }

    @androidx.annotation.o0
    public final f0 d(@androidx.annotation.d0 int i5, @androidx.annotation.o0 Class<? extends Fragment> cls, @q0 Bundle bundle) {
        return b(i5, q(cls, bundle));
    }

    @androidx.annotation.o0
    public final f0 e(@androidx.annotation.d0 int i5, @androidx.annotation.o0 Class<? extends Fragment> cls, @q0 Bundle bundle, @q0 String str) {
        return c(i5, q(cls, bundle), str);
    }

    f0 f(@androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.o0 Fragment fragment, @q0 String str) {
        fragment.mContainer = viewGroup;
        return c(viewGroup.getId(), fragment, str);
    }

    @androidx.annotation.o0
    public f0 g(@androidx.annotation.o0 Fragment fragment, @q0 String str) {
        t(0, fragment, str, 1);
        return this;
    }

    @androidx.annotation.o0
    public final f0 h(@androidx.annotation.o0 Class<? extends Fragment> cls, @q0 Bundle bundle, @q0 String str) {
        return g(q(cls, bundle), str);
    }

    void i(a aVar) {
        this.f8238c.add(aVar);
        aVar.f8258d = this.f8239d;
        aVar.f8259e = this.f8240e;
        aVar.f8260f = this.f8241f;
        aVar.f8261g = this.f8242g;
    }

    @androidx.annotation.o0
    public f0 j(@androidx.annotation.o0 View view, @androidx.annotation.o0 String str) {
        if (g0.f()) {
            String x02 = y1.x0(view);
            if (x02 == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f8251p == null) {
                this.f8251p = new ArrayList<>();
                this.f8252q = new ArrayList<>();
            } else {
                if (this.f8252q.contains(str)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.solver.widgets.analyzer.e.a("A shared element with the target name '", str, "' has already been added to the transaction."));
                }
                if (this.f8251p.contains(x02)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.solver.widgets.analyzer.e.a("A shared element with the source name '", x02, "' has already been added to the transaction."));
                }
            }
            this.f8251p.add(x02);
            this.f8252q.add(str);
        }
        return this;
    }

    @androidx.annotation.o0
    public f0 k(@q0 String str) {
        if (!this.f8245j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f8244i = true;
        this.f8246k = str;
        return this;
    }

    @androidx.annotation.o0
    public f0 l(@androidx.annotation.o0 Fragment fragment) {
        i(new a(7, fragment));
        return this;
    }

    public abstract int m();

    public abstract int n();

    public abstract void o();

    public abstract void p();

    @androidx.annotation.o0
    public f0 r(@androidx.annotation.o0 Fragment fragment) {
        i(new a(6, fragment));
        return this;
    }

    @androidx.annotation.o0
    public f0 s() {
        if (this.f8244i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f8245j = false;
        return this;
    }

    void t(int i5, Fragment fragment, @q0 String str, int i6) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            a0.c.i(fragment, str2);
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
                throw new IllegalStateException(e0.a(sb, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i5 != 0) {
            if (i5 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i7 = fragment.mFragmentId;
            if (i7 != 0 && i7 != i5) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i5);
            }
            fragment.mFragmentId = i5;
            fragment.mContainerId = i5;
        }
        i(new a(i6, fragment));
    }

    @androidx.annotation.o0
    public f0 u(@androidx.annotation.o0 Fragment fragment) {
        i(new a(4, fragment));
        return this;
    }

    public boolean v() {
        return this.f8245j;
    }

    public boolean w() {
        return this.f8238c.isEmpty();
    }

    @androidx.annotation.o0
    public f0 x(@androidx.annotation.o0 Fragment fragment) {
        i(new a(3, fragment));
        return this;
    }

    @androidx.annotation.o0
    public f0 y(@androidx.annotation.d0 int i5, @androidx.annotation.o0 Fragment fragment) {
        return z(i5, fragment, null);
    }

    @androidx.annotation.o0
    public f0 z(@androidx.annotation.d0 int i5, @androidx.annotation.o0 Fragment fragment, @q0 String str) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        t(i5, fragment, str, 2);
        return this;
    }

    f0(@androidx.annotation.o0 l lVar, @q0 ClassLoader classLoader) {
        this.f8238c = new ArrayList<>();
        this.f8245j = true;
        this.f8253r = false;
        this.f8236a = lVar;
        this.f8237b = classLoader;
    }

    f0(@androidx.annotation.o0 l lVar, @q0 ClassLoader classLoader, @androidx.annotation.o0 f0 f0Var) {
        this(lVar, classLoader);
        Iterator<a> it = f0Var.f8238c.iterator();
        while (it.hasNext()) {
            this.f8238c.add(new a(it.next()));
        }
        this.f8239d = f0Var.f8239d;
        this.f8240e = f0Var.f8240e;
        this.f8241f = f0Var.f8241f;
        this.f8242g = f0Var.f8242g;
        this.f8243h = f0Var.f8243h;
        this.f8244i = f0Var.f8244i;
        this.f8245j = f0Var.f8245j;
        this.f8246k = f0Var.f8246k;
        this.f8249n = f0Var.f8249n;
        this.f8250o = f0Var.f8250o;
        this.f8247l = f0Var.f8247l;
        this.f8248m = f0Var.f8248m;
        if (f0Var.f8251p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f8251p = arrayList;
            arrayList.addAll(f0Var.f8251p);
        }
        if (f0Var.f8252q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f8252q = arrayList2;
            arrayList2.addAll(f0Var.f8252q);
        }
        this.f8253r = f0Var.f8253r;
    }
}
