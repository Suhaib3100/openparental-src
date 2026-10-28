package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;

/* compiled from: modifierChecks.kt */
/* loaded from: classes5.dex */
public interface f {

    /* compiled from: modifierChecks.kt */
    public static final class a {
        @d5.e
        public static String a(@d5.d f fVar, @d5.d z zVar) {
            l0.p(zVar, ProtectedSandApp.s("塾"));
            if (fVar.c(zVar)) {
                return null;
            }
            return fVar.a();
        }
    }

    @d5.d
    String a();

    @d5.e
    String b(@d5.d z zVar);

    boolean c(@d5.d z zVar);
}
