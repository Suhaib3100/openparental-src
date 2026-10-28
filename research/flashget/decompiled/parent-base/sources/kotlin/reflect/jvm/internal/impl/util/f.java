package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;

/* compiled from: modifierChecks.kt */
/* loaded from: classes7.dex */
public interface f {

    /* compiled from: modifierChecks.kt */
    public static final class a {
        @fg.m
        public static String a(@fg.l f fVar, @fg.l z zVar) {
            l0.p(zVar, ProtectedSandApp.s("肹\u0001"));
            if (fVar.c(zVar)) {
                return null;
            }
            return fVar.a();
        }
    }

    @fg.l
    String a();

    @fg.m
    String b(@fg.l z zVar);

    boolean c(@fg.l z zVar);
}
