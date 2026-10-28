package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f25714b;

    /* renamed from: c, reason: collision with root package name */
    private static final f f25715c = new f(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, h.g<?, ?>> f25716a;

    /* compiled from: ExtensionRegistryLite.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f25717a;

        /* renamed from: b, reason: collision with root package name */
        private final int f25718b;

        a(Object obj, int i5) {
            this.f25717a = obj;
            this.f25718b = i5;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25717a == aVar.f25717a && this.f25718b == aVar.f25718b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f25717a) * 65535) + this.f25718b;
        }
    }

    f() {
        this.f25716a = new HashMap();
    }

    public static f c() {
        return f25715c;
    }

    public static f d() {
        return new f();
    }

    public final void a(h.g<?, ?> gVar) {
        this.f25716a.put(new a(gVar.b(), gVar.d()), gVar);
    }

    public <ContainingType extends o> h.g<ContainingType, ?> b(ContainingType containingtype, int i5) {
        return (h.g) this.f25716a.get(new a(containingtype, i5));
    }

    private f(boolean z5) {
        this.f25716a = Collections.emptyMap();
    }
}
