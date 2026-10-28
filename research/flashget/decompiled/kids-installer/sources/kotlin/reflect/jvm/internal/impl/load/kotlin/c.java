package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* loaded from: classes5.dex */
public final class c {
    @d5.e
    public static final u a(@d5.d a.n nVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z5, boolean z6, boolean z7) {
        l0.p(nVar, ProtectedSandApp.s("䯟"));
        l0.p(cVar, ProtectedSandApp.s("䯠"));
        l0.p(gVar, ProtectedSandApp.s("䯡"));
        h.g<a.n, a.d> gVar2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25472d;
        l0.o(gVar2, ProtectedSandApp.s("䯢"));
        a.d dVar = (a.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(nVar, gVar2);
        if (dVar == null) {
            return null;
        }
        if (z5) {
            d.a c6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f25577a.c(nVar, cVar, gVar, z7);
            if (c6 == null) {
                return null;
            }
            return u.f25075b.b(c6);
        }
        if (!z6 || !dVar.J()) {
            return null;
        }
        u.a aVar = u.f25075b;
        a.c E = dVar.E();
        l0.o(E, ProtectedSandApp.s("䯣"));
        return aVar.c(cVar, E);
    }

    public static /* synthetic */ u b(a.n nVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z5, boolean z6, boolean z7, int i5, Object obj) {
        boolean z8 = (i5 & 8) != 0 ? false : z5;
        boolean z9 = (i5 & 16) != 0 ? false : z6;
        if ((i5 & 32) != 0) {
            z7 = true;
        }
        return a(nVar, cVar, gVar, z8, z9, z7);
    }
}
