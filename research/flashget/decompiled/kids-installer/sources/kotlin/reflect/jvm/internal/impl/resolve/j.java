package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import kotlin.jvm.internal.l0;

/* compiled from: OverridingStrategy.kt */
/* loaded from: classes5.dex */
public abstract class j {
    public abstract void a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar);

    public abstract void b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar2);

    public abstract void c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar2);

    public void d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        l0.p(bVar, ProtectedSandApp.s("則"));
        l0.p(collection, ProtectedSandApp.s("剈"));
        bVar.E0(collection);
    }
}
