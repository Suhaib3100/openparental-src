package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: VersionRequirement.kt */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    public static final a f25466b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final h f25467c = new h(EmptyList.f23167o);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final List<a.v> f25468a;

    /* compiled from: VersionRequirement.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final h a(@d5.d a.w wVar) {
            l0.p(wVar, ProtectedSandApp.s("䵼"));
            if (wVar.t() == 0) {
                return h.f25467c;
            }
            List<a.v> v5 = wVar.v();
            l0.o(v5, ProtectedSandApp.s("䵽"));
            return new h(v5, null);
        }

        @d5.d
        public final h b() {
            return h.f25467c;
        }

        public a(w wVar) {
        }
    }

    public /* synthetic */ h(List list, w wVar) {
        this(list);
    }

    private h(List<a.v> list) {
        this.f25468a = list;
    }
}
