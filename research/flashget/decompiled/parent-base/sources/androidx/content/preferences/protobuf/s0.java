package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes3.dex */
public class s0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f28938b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f28939c = true;

    /* renamed from: f, reason: collision with root package name */
    private static volatile s0 f28942f;

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, i1.h<?, ?>> f28944a;

    /* renamed from: d, reason: collision with root package name */
    static final String f28940d = "androidx.datastore.preferences.protobuf.Extension";

    /* renamed from: e, reason: collision with root package name */
    private static final Class<?> f28941e = h();

    /* renamed from: g, reason: collision with root package name */
    static final s0 f28943g = new s0(true);

    /* compiled from: ExtensionRegistryLite.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f28945a;

        /* renamed from: b, reason: collision with root package name */
        private final int f28946b;

        a(Object obj, int i4) {
            this.f28945a = obj;
            this.f28946b = i4;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28945a == aVar.f28945a && this.f28946b == aVar.f28946b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f28945a) * 65535) + this.f28946b;
        }
    }

    s0() {
        this.f28944a = new HashMap();
    }

    public static s0 d() {
        s0 s0Var = f28942f;
        if (s0Var == null) {
            synchronized (s0.class) {
                try {
                    s0Var = f28942f;
                    if (s0Var == null) {
                        s0Var = f28939c ? r0.b() : f28943g;
                        f28942f = s0Var;
                    }
                } finally {
                }
            }
        }
        return s0Var;
    }

    public static boolean f() {
        return f28938b;
    }

    public static s0 g() {
        return f28939c ? r0.a() : new s0();
    }

    static Class<?> h() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void i(boolean z4) {
        f28938b = z4;
    }

    public final void a(q0<?, ?> q0Var) {
        if (i1.h.class.isAssignableFrom(q0Var.getClass())) {
            b((i1.h) q0Var);
        }
        if (f28939c && r0.d(this)) {
            try {
                getClass().getMethod("add", f28941e).invoke(this, q0Var);
            } catch (Exception e4) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", q0Var), e4);
            }
        }
    }

    public final void b(i1.h<?, ?> hVar) {
        this.f28944a.put(new a(hVar.h(), hVar.d()), hVar);
    }

    public <ContainingType extends i2> i1.h<ContainingType, ?> c(ContainingType containingtype, int i4) {
        return (i1.h) this.f28944a.get(new a(containingtype, i4));
    }

    public s0 e() {
        return new s0(this);
    }

    s0(s0 s0Var) {
        if (s0Var == f28943g) {
            this.f28944a = Collections.emptyMap();
        } else {
            this.f28944a = Collections.unmodifiableMap(s0Var.f28944a);
        }
    }

    s0(boolean z4) {
        this.f28944a = Collections.emptyMap();
    }
}
