package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TypeAttributeTranslator.kt */
/* loaded from: classes7.dex */
public interface c1 {

    /* compiled from: TypeAttributeTranslator.kt */
    public static final class a {
        public static /* synthetic */ d1 a(c1 c1Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, h1 h1Var, kotlin.reflect.jvm.internal.impl.descriptors.m mVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("絅\u0001"));
            }
            if ((i4 & 2) != 0) {
                h1Var = null;
            }
            if ((i4 & 4) != 0) {
                mVar = null;
            }
            return c1Var.a(gVar, h1Var, mVar);
        }
    }

    @fg.l
    d1 a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @fg.m h1 h1Var, @fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar);
}
