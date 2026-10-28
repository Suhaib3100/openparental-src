package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f77696b;

    /* renamed from: c, reason: collision with root package name */
    private static final f f77697c = new f(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, h.g<?, ?>> f77698a;

    /* compiled from: ExtensionRegistryLite.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f77699a;

        /* renamed from: b, reason: collision with root package name */
        private final int f77700b;

        a(Object obj, int i4) {
            this.f77699a = obj;
            this.f77700b = i4;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f77699a == aVar.f77699a && this.f77700b == aVar.f77700b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f77699a) * 65535) + this.f77700b;
        }
    }

    f() {
        this.f77698a = new HashMap();
    }

    public static f c() {
        return f77697c;
    }

    public static f d() {
        return new f();
    }

    public final void a(h.g<?, ?> gVar) {
        this.f77698a.put(new a(gVar.b(), gVar.d()), gVar);
    }

    public <ContainingType extends o> h.g<ContainingType, ?> b(ContainingType containingtype, int i4) {
        return (h.g) this.f77698a.get(new a(containingtype, i4));
    }

    private f(boolean z4) {
        this.f77698a = Collections.emptyMap();
    }
}
