package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.l0;

/* compiled from: OverridingStrategy.kt */
/* loaded from: classes7.dex */
public abstract class k {
    public abstract void a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar);

    public abstract void b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar2);

    public abstract void c(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar2);

    public void d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @fg.l Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        l0.p(bVar, ProtectedSandApp.s("洯\u0001"));
        l0.p(collection, ProtectedSandApp.s("洰\u0001"));
        bVar.F0(collection);
    }
}
