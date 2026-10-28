package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: ProtoBufUtil.kt */
/* loaded from: classes7.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @m
    public static final <M extends h.d<M>, T> T a(@l h.d<M> dVar, @l h.g<M, T> gVar) {
        l0.p(dVar, ProtectedSandApp.s("甪\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甫\u0001"));
        if (dVar.v(gVar)) {
            return (T) dVar.r(gVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public static final <M extends h.d<M>, T> T b(@l h.d<M> dVar, @l h.g<M, List<T>> gVar, int i4) {
        l0.p(dVar, ProtectedSandApp.s("甪\u0001"));
        l0.p(gVar, ProtectedSandApp.s("甫\u0001"));
        if (i4 < dVar.u(gVar)) {
            return (T) dVar.s(gVar, i4);
        }
        return null;
    }
}
