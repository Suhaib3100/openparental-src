package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ClassKind.kt */
/* loaded from: classes5.dex */
public enum f {
    CLASS(ProtectedSandApp.s("䝻")),
    INTERFACE(ProtectedSandApp.s("䝽")),
    ENUM_CLASS(ProtectedSandApp.s("䝿")),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS(ProtectedSandApp.s("䞂")),
    OBJECT(ProtectedSandApp.s("䞄"));


    @d5.e
    private final String codeRepresentation;

    f(String str) {
        this.codeRepresentation = str;
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
