package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.text.Typography;
import kotlin.text.e0;

/* compiled from: ReflectKotlinClassFinder.kt */
/* loaded from: classes5.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        String h22;
        String b6 = bVar.i().b();
        l0.o(b6, ProtectedSandApp.s("䡚"));
        h22 = e0.h2(b6, org.apache.commons.io.k.f32026a, Typography.f27127c, false, 4, null);
        if (bVar.h().d()) {
            return h22;
        }
        return bVar.h() + org.apache.commons.io.k.f32026a + h22;
    }
}
