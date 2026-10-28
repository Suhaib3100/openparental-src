package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ErrorScopeKind.kt */
/* loaded from: classes5.dex */
public enum g {
    CAPTURED_TYPE_SCOPE(ProtectedSandApp.s("嘭")),
    INTEGER_LITERAL_TYPE_SCOPE(ProtectedSandApp.s("嘯")),
    ERASED_RECEIVER_TYPE_SCOPE(ProtectedSandApp.s("嘱")),
    SCOPE_FOR_ABBREVIATION_TYPE(ProtectedSandApp.s("嘳")),
    STUB_TYPE_SCOPE(ProtectedSandApp.s("嘵")),
    NON_CLASSIFIER_SUPER_TYPE_SCOPE(ProtectedSandApp.s("嘷")),
    ERROR_TYPE_SCOPE(ProtectedSandApp.s("嘹")),
    UNSUPPORTED_TYPE_SCOPE(ProtectedSandApp.s("嘻")),
    SCOPE_FOR_ERROR_CLASS(ProtectedSandApp.s("嘽")),
    SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE(ProtectedSandApp.s("嘿"));


    @d5.d
    private final String debugMessage;

    g(String str) {
        this.debugMessage = str;
    }

    @d5.d
    public final String getDebugMessage() {
        return this.debugMessage;
    }
}
