package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.l0;

/* compiled from: VisibilityUtil.kt */
/* loaded from: classes7.dex */
public final class t {
    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.descriptors.b a(@fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        Integer d5;
        l0.p(collection, ProtectedSandApp.s("竦\u0001"));
        collection.isEmpty();
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar = null;
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar2 : collection) {
            if (bVar == null || ((d5 = kotlin.reflect.jvm.internal.impl.descriptors.t.d(bVar.getVisibility(), bVar2.getVisibility())) != null && d5.intValue() < 0)) {
                bVar = bVar2;
            }
        }
        l0.m(bVar);
        return bVar;
    }
}
