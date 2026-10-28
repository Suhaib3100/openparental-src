package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Variance.kt */
/* loaded from: classes7.dex */
public final class x1 {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ x1[] $VALUES;
    public static final x1 INVARIANT = new x1(ProtectedSandApp.s("肜\u0001"), 0, "", true, true, 0);
    public static final x1 IN_VARIANCE = new x1(ProtectedSandApp.s("肝\u0001"), 1, ProtectedSandApp.s("肞\u0001"), true, false, -1);
    public static final x1 OUT_VARIANCE = new x1(ProtectedSandApp.s("肟\u0001"), 2, ProtectedSandApp.s("肠\u0001"), false, true, 1);
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;

    @fg.l
    private final String label;
    private final int superpositionFactor;

    private static final /* synthetic */ x1[] $values() {
        return new x1[]{INVARIANT, IN_VARIANCE, OUT_VARIANCE};
    }

    static {
        x1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private x1(String str, int i4, String str2, boolean z4, boolean z5, int i5) {
        this.label = str2;
        this.allowsInPosition = z4;
        this.allowsOutPosition = z5;
        this.superpositionFactor = i5;
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) $VALUES.clone();
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    @fg.l
    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    @fg.l
    public String toString() {
        return this.label;
    }
}
