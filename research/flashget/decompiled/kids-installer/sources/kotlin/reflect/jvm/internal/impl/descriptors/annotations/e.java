package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.w;

/* compiled from: AnnotationUseSiteTarget.kt */
/* loaded from: classes5.dex */
public enum e {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER(ProtectedSandApp.s("䛬")),
    PROPERTY_SETTER(ProtectedSandApp.s("䛮")),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER(ProtectedSandApp.s("䛱")),
    SETTER_PARAMETER(ProtectedSandApp.s("䛳")),
    PROPERTY_DELEGATE_FIELD(ProtectedSandApp.s("䛵"));


    @d5.d
    private final String renderName;

    e(String str) {
        this.renderName = str == null ? i4.a.f(name()) : str;
    }

    @d5.d
    public final String getRenderName() {
        return this.renderName;
    }

    /* synthetic */ e(String str, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : str);
    }
}
