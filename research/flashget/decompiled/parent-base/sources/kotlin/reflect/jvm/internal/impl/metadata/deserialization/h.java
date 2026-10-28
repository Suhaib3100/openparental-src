package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.metadata.a;

/* compiled from: VersionRequirement.kt */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    @l
    public static final a f77444b = new a();

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final h f77445c = new h(j0.f74919b);

    /* renamed from: a, reason: collision with root package name */
    @l
    private final List<a.v> f77446a;

    /* compiled from: VersionRequirement.kt */
    public static final class a {
        private a() {
        }

        @l
        public final h a(@l a.w wVar) {
            l0.p(wVar, ProtectedSandApp.s("甽\u0001"));
            if (wVar.u() == 0) {
                return h.f77445c;
            }
            List<a.v> v4 = wVar.v();
            l0.o(v4, ProtectedSandApp.s("甾\u0001"));
            return new h(v4, null);
        }

        @l
        public final h b() {
            return h.f77445c;
        }

        public a(w wVar) {
        }
    }

    public /* synthetic */ h(List list, w wVar) {
        this(list);
    }

    private h(List<a.v> list) {
        this.f77446a = list;
    }
}
