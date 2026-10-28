package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: ProtoBufUtil.kt */
/* loaded from: classes5.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @d5.e
    public static final <M extends h.d<M>, T> T a(@d5.d h.d<M> dVar, @d5.d h.g<M, T> gVar) {
        l0.p(dVar, ProtectedSandApp.s("䴻"));
        l0.p(gVar, ProtectedSandApp.s("䴼"));
        if (dVar.v(gVar)) {
            return (T) dVar.r(gVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.e
    public static final <M extends h.d<M>, T> T b(@d5.d h.d<M> dVar, @d5.d h.g<M, List<T>> gVar, int i5) {
        l0.p(dVar, ProtectedSandApp.s("䴽"));
        l0.p(gVar, ProtectedSandApp.s("䴾"));
        if (i5 < dVar.t(gVar)) {
            return (T) dVar.s(gVar, i5);
        }
        return null;
    }
}
