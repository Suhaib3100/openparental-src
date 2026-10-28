package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReportLevel.kt */
/* loaded from: classes7.dex */
public final class g0 {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;

    @fg.l
    public static final a Companion;

    @fg.l
    private final String description;
    public static final g0 IGNORE = new g0(ProtectedSandApp.s("烄\u0001"), 0, ProtectedSandApp.s("烃\u0001"));
    public static final g0 WARN = new g0(ProtectedSandApp.s("烆\u0001"), 1, ProtectedSandApp.s("烅\u0001"));
    public static final g0 STRICT = new g0(ProtectedSandApp.s("烈\u0001"), 2, ProtectedSandApp.s("烇\u0001"));

    /* compiled from: ReportLevel.kt */
    @r1({"SMAP\nReportLevel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportLevel.kt\norg/jetbrains/kotlin/load/java/ReportLevel$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,20:1\n1282#2,2:21\n*S KotlinDebug\n*F\n+ 1 ReportLevel.kt\norg/jetbrains/kotlin/load/java/ReportLevel$Companion\n*L\n15#1:21,2\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    private static final /* synthetic */ g0[] $values() {
        return new g0[]{IGNORE, WARN, STRICT};
    }

    static {
        g0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
        Companion = new a();
    }

    private g0(String str, int i4, String str2) {
        this.description = str2;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }

    @fg.l
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
