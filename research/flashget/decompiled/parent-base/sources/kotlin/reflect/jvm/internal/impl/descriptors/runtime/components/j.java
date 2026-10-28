package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;

/* compiled from: RuntimeErrorReporter.kt */
/* loaded from: classes7.dex */
public final class j implements r {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final j f76216b = new j();

    private j() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.r
    public void a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("湫\u0001"));
        throw new IllegalStateException(ProtectedSandApp.s("湬\u0001") + bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.r
    public void b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l List<String> list) {
        l0.p(eVar, ProtectedSandApp.s("湫\u0001"));
        l0.p(list, ProtectedSandApp.s("湭\u0001"));
        throw new IllegalStateException(ProtectedSandApp.s("湮\u0001") + eVar.getName() + ProtectedSandApp.s("湯\u0001") + list);
    }
}
