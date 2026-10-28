package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;

/* compiled from: ResolutionScope.kt */
/* loaded from: classes5.dex */
public interface k {

    /* compiled from: ResolutionScope.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection a(k kVar, d dVar, q3.l lVar, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("卍"));
            }
            if ((i5 & 1) != 0) {
                dVar = d.f25989o;
            }
            if ((i5 & 2) != 0) {
                lVar = h.f26014a.a();
            }
            return kVar.g(dVar, lVar);
        }

        public static void b(@d5.d k kVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar) {
            l0.p(fVar, ProtectedSandApp.s("华"));
            l0.p(bVar, ProtectedSandApp.s("协"));
            kVar.a(fVar, bVar);
        }
    }

    @d5.d
    Collection<? extends z> a(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar);

    void e(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar);

    @d5.d
    Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);

    @d5.e
    kotlin.reflect.jvm.internal.impl.descriptors.h h(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d z3.b bVar);
}
