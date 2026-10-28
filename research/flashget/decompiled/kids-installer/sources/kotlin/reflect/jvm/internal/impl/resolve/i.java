package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: OverridingStrategy.kt */
/* loaded from: classes5.dex */
public abstract class i extends j {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.j
    public void b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
        l0.p(bVar, ProtectedSandApp.s("剉"));
        l0.p(bVar2, ProtectedSandApp.s("削"));
        e(bVar, bVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.j
    public void c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
        l0.p(bVar, ProtectedSandApp.s("剋"));
        l0.p(bVar2, ProtectedSandApp.s("剌"));
        e(bVar, bVar2);
    }

    protected abstract void e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar2);
}
