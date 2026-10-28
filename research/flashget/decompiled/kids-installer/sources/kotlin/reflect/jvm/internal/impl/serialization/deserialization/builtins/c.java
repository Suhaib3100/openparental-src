package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;
import kotlin.reflect.jvm.internal.impl.storage.n;

/* compiled from: BuiltInsPackageFragmentImpl.kt */
/* loaded from: classes6.dex */
public final class c extends q implements kotlin.reflect.jvm.internal.impl.builtins.b {

    @d5.d
    public static final a C = new a(null);
    private final boolean B;

    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        @d5.d
        public final c a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d n nVar, @d5.d h0 h0Var, @d5.d InputStream inputStream, boolean z5) {
            l0.p(cVar, ProtectedSandApp.s("厊"));
            l0.p(nVar, ProtectedSandApp.s("压"));
            l0.p(h0Var, ProtectedSandApp.s("厌"));
            l0.p(inputStream, ProtectedSandApp.s("厍"));
            Pair<a.m, c4.a> a6 = c4.c.a(inputStream);
            a.m a7 = a6.a();
            c4.a b6 = a6.b();
            if (a7 != null) {
                return new c(cVar, nVar, h0Var, a7, b6, z5, null);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("厎") + c4.a.f10674h + ProtectedSandApp.s("厏") + b6 + ProtectedSandApp.s("厐"));
        }

        public a(w wVar) {
        }
    }

    public /* synthetic */ c(kotlin.reflect.jvm.internal.impl.name.c cVar, n nVar, h0 h0Var, a.m mVar, c4.a aVar, boolean z5, w wVar) {
        this(cVar, nVar, h0Var, mVar, aVar, z5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z, kotlin.reflect.jvm.internal.impl.descriptors.impl.j
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("蜰") + f() + ProtectedSandApp.s("蜱") + kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(this);
    }

    private c(kotlin.reflect.jvm.internal.impl.name.c cVar, n nVar, h0 h0Var, a.m mVar, c4.a aVar, boolean z5) {
        super(cVar, nVar, h0Var, mVar, aVar, null);
        this.B = z5;
    }
}
