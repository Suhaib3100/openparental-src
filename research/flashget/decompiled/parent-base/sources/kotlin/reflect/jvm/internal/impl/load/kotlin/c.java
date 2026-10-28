package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.w;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* loaded from: classes7.dex */
public final class c {
    @fg.m
    public static final w a(@fg.l a.n nVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z4, boolean z5, boolean z6) {
        l0.p(nVar, ProtectedSandApp.s("玠\u0001"));
        l0.p(cVar, ProtectedSandApp.s("玡\u0001"));
        l0.p(gVar, ProtectedSandApp.s("玢\u0001"));
        h.g<a.n, a.d> gVar2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77450d;
        l0.o(gVar2, ProtectedSandApp.s("玣\u0001"));
        a.d dVar = (a.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(nVar, gVar2);
        if (dVar == null) {
            return null;
        }
        if (z4) {
            d.a c5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f77559a.c(nVar, cVar, gVar, z6);
            if (c5 == null) {
                return null;
            }
            return w.f76957b.b(c5);
        }
        if (!z5 || !dVar.K()) {
            return null;
        }
        w.a aVar = w.f76957b;
        a.c F = dVar.F();
        l0.o(F, ProtectedSandApp.s("玤\u0001"));
        return aVar.c(cVar, F);
    }

    public static /* synthetic */ w b(a.n nVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, boolean z4, boolean z5, boolean z6, int i4, Object obj) {
        boolean z7 = (i4 & 8) != 0 ? false : z4;
        boolean z10 = (i4 & 16) != 0 ? false : z5;
        if ((i4 & 32) != 0) {
            z6 = true;
        }
        return a(nVar, cVar, gVar, z7, z10, z6);
    }
}
