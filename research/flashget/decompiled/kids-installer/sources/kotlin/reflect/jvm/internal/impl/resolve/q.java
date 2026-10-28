package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;

/* compiled from: VisibilityUtil.kt */
/* loaded from: classes5.dex */
public final class q {
    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.b a(@d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        Integer d6;
        l0.p(collection, ProtectedSandApp.s("匼"));
        collection.isEmpty();
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar = null;
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : collection) {
            if (bVar == null || ((d6 = t.d(bVar.c(), bVar2.c())) != null && d6.intValue() < 0)) {
                bVar = bVar2;
            }
        }
        l0.m(bVar);
        return bVar;
    }
}
