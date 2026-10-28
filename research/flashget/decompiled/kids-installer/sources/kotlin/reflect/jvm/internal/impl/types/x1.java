package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: Variance.kt */
/* loaded from: classes5.dex */
public enum x1 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE(ProtectedSandApp.s("塟"), true, false, -1),
    OUT_VARIANCE(ProtectedSandApp.s("塡"), false, true, 1);

    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;

    @d5.d
    private final String label;
    private final int superpositionFactor;

    x1(String str, boolean z5, boolean z6, int i5) {
        this.label = str;
        this.allowsInPosition = z5;
        this.allowsOutPosition = z6;
        this.superpositionFactor = i5;
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    @d5.d
    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    @d5.d
    public String toString() {
        return this.label;
    }
}
