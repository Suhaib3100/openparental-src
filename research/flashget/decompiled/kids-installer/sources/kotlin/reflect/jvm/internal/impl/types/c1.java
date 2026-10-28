package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: TypeAttributeTranslator.kt */
/* loaded from: classes5.dex */
public interface c1 {

    /* compiled from: TypeAttributeTranslator.kt */
    public static final class a {
        public static /* synthetic */ d1 a(c1 c1Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, h1 h1Var, kotlin.reflect.jvm.internal.impl.descriptors.m mVar, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("哆"));
            }
            if ((i5 & 2) != 0) {
                h1Var = null;
            }
            if ((i5 & 4) != 0) {
                mVar = null;
            }
            return c1Var.a(gVar, h1Var, mVar);
        }
    }

    @d5.d
    d1 a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @d5.e h1 h1Var, @d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar);
}
