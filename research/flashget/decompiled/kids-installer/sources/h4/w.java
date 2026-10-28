package h4;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: TypeSystemContext.kt */
/* loaded from: classes5.dex */
public enum w {
    IN(ProtectedSandApp.s("㛯")),
    OUT(ProtectedSandApp.s("㛱")),
    INV("");


    @d5.d
    private final String presentation;

    w(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    @d5.d
    public String toString() {
        return this.presentation;
    }
}
