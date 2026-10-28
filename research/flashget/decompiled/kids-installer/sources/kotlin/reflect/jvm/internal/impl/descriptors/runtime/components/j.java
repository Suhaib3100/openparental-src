package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;

/* compiled from: RuntimeErrorReporter.kt */
/* loaded from: classes5.dex */
public final class j implements r {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    public static final j f24366b = new j();

    private j() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.r
    public void a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("䡛"));
        throw new IllegalStateException(ProtectedSandApp.s("䡜") + bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.r
    public void b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d List<String> list) {
        l0.p(eVar, ProtectedSandApp.s("䡝"));
        l0.p(list, ProtectedSandApp.s("䡞"));
        throw new IllegalStateException(ProtectedSandApp.s("䡟") + eVar.getName() + ProtectedSandApp.s("䡠") + list);
    }
}
