package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: OverridingStrategy.kt */
/* loaded from: classes7.dex */
public abstract class j extends k {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.k
    public void b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
        l0.p(bVar, ProtectedSandApp.s("洱\u0001"));
        l0.p(bVar2, ProtectedSandApp.s("洲\u0001"));
        e(bVar, bVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.k
    public void c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
        l0.p(bVar, ProtectedSandApp.s("洳\u0001"));
        l0.p(bVar2, ProtectedSandApp.s("洴\u0001"));
        e(bVar, bVar2);
    }

    protected abstract void e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar2);
}
