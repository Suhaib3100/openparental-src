package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.InputStream;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
import kotlin.reflect.jvm.internal.impl.storage.n;

/* compiled from: BuiltInsPackageFragmentImpl.kt */
/* loaded from: classes7.dex */
public final class c extends p implements kotlin.reflect.jvm.internal.impl.builtins.b {

    /* renamed from: p, reason: collision with root package name */
    @l
    public static final a f78054p = new a();

    /* renamed from: o, reason: collision with root package name */
    private final boolean f78055o;

    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class a {
        private a() {
        }

        @l
        public final c a(@l kotlin.reflect.jvm.internal.impl.name.c cVar, @l n nVar, @l h0 h0Var, @l InputStream inputStream, boolean z4) {
            l0.p(cVar, ProtectedSandApp.s("笙\u0001"));
            l0.p(nVar, ProtectedSandApp.s("笚\u0001"));
            l0.p(h0Var, ProtectedSandApp.s("笛\u0001"));
            l0.p(inputStream, ProtectedSandApp.s("笜\u0001"));
            q0<a.m, xd.a> a5 = xd.c.a(inputStream);
            a.m a6 = a5.a();
            xd.a b5 = a5.b();
            if (a6 != null) {
                return new c(cVar, nVar, h0Var, a6, b5, z4, null);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("笝\u0001") + xd.a.f92952h + ProtectedSandApp.s("笞\u0001") + b5 + ProtectedSandApp.s("笟\u0001"));
        }

        public a(w wVar) {
        }
    }

    public /* synthetic */ c(kotlin.reflect.jvm.internal.impl.name.c cVar, n nVar, h0 h0Var, a.m mVar, xd.a aVar, boolean z4, w wVar) {
        this(cVar, nVar, h0Var, mVar, aVar, z4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @l
    public String toString() {
        return ProtectedSandApp.s("笰\u0001") + g() + ProtectedSandApp.s("笱\u0001") + kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(this);
    }

    private c(kotlin.reflect.jvm.internal.impl.name.c cVar, n nVar, h0 h0Var, a.m mVar, xd.a aVar, boolean z4) {
        super(cVar, nVar, h0Var, mVar, aVar, null);
        this.f78055o = z4;
    }
}
