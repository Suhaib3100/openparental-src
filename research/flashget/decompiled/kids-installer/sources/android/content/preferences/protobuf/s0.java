package android.content.preferences.protobuf;

import android.content.preferences.protobuf.i1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes.dex */
public class s0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f7500b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f7501c = true;

    /* renamed from: f, reason: collision with root package name */
    private static volatile s0 f7504f;

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, i1.h<?, ?>> f7506a;

    /* renamed from: d, reason: collision with root package name */
    static final String f7502d = "androidx.datastore.preferences.protobuf.Extension";

    /* renamed from: e, reason: collision with root package name */
    private static final Class<?> f7503e = h();

    /* renamed from: g, reason: collision with root package name */
    static final s0 f7505g = new s0(true);

    /* compiled from: ExtensionRegistryLite.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f7507a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7508b;

        a(Object obj, int i5) {
            this.f7507a = obj;
            this.f7508b = i5;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7507a == aVar.f7507a && this.f7508b == aVar.f7508b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f7507a) * 65535) + this.f7508b;
        }
    }

    s0() {
        this.f7506a = new HashMap();
    }

    public static s0 d() {
        s0 s0Var = f7504f;
        if (s0Var == null) {
            synchronized (s0.class) {
                s0Var = f7504f;
                if (s0Var == null) {
                    s0Var = f7501c ? r0.b() : f7505g;
                    f7504f = s0Var;
                }
            }
        }
        return s0Var;
    }

    public static boolean f() {
        return f7500b;
    }

    public static s0 g() {
        return f7501c ? r0.a() : new s0();
    }

    static Class<?> h() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void i(boolean z5) {
        f7500b = z5;
    }

    public final void a(q0<?, ?> q0Var) {
        if (i1.h.class.isAssignableFrom(q0Var.getClass())) {
            b((i1.h) q0Var);
        }
        if (f7501c && r0.d(this)) {
            try {
                getClass().getMethod("add", f7503e).invoke(this, q0Var);
            } catch (Exception e6) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", q0Var), e6);
            }
        }
    }

    public final void b(i1.h<?, ?> hVar) {
        this.f7506a.put(new a(hVar.h(), hVar.d()), hVar);
    }

    public <ContainingType extends h2> i1.h<ContainingType, ?> c(ContainingType containingtype, int i5) {
        return (i1.h) this.f7506a.get(new a(containingtype, i5));
    }

    public s0 e() {
        return new s0(this);
    }

    s0(s0 s0Var) {
        if (s0Var == f7505g) {
            this.f7506a = Collections.emptyMap();
        } else {
            this.f7506a = Collections.unmodifiableMap(s0Var.f7506a);
        }
    }

    s0(boolean z5) {
        this.f7506a = Collections.emptyMap();
    }
}
