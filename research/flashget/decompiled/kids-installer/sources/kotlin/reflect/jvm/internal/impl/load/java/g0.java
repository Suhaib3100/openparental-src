package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: ReportLevel.kt */
/* loaded from: classes5.dex */
public enum g0 {
    IGNORE(ProtectedSandApp.s("䧨")),
    WARN(ProtectedSandApp.s("䧪")),
    STRICT(ProtectedSandApp.s("䧬"));


    @d5.d
    public static final a Companion = new a(null);

    @d5.d
    private final String description;

    /* compiled from: ReportLevel.kt */
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    g0(String str) {
        this.description = str;
    }

    @d5.d
    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
