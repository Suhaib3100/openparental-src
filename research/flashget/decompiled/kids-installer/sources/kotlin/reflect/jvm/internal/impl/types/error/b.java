package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ErrorEntity.kt */
/* loaded from: classes5.dex */
public enum b {
    ERROR_CLASS(ProtectedSandApp.s("嘔")),
    ERROR_FUNCTION(ProtectedSandApp.s("嘖")),
    ERROR_SCOPE(ProtectedSandApp.s("嘘")),
    ERROR_MODULE(ProtectedSandApp.s("嘚")),
    ERROR_PROPERTY(ProtectedSandApp.s("嘜")),
    ERROR_TYPE(ProtectedSandApp.s("嘞")),
    PARENT_OF_ERROR_SCOPE(ProtectedSandApp.s("嘠"));


    @d5.d
    private final String debugText;

    b(String str) {
        this.debugText = str;
    }

    @d5.d
    public final String getDebugText() {
        return this.debugText;
    }
}
