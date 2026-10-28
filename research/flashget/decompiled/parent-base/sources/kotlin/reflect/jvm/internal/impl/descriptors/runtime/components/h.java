package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.text.v;

/* compiled from: ReflectKotlinClassFinder.kt */
/* loaded from: classes7.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        String b5 = bVar.i().b();
        l0.o(b5, ProtectedSandApp.s("湪\u0001"));
        String h22 = v.h2(b5, '.', '$', false, 4, null);
        if (bVar.h().d()) {
            return h22;
        }
        return bVar.h() + '.' + h22;
    }
}
