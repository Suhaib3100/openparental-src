package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes7.dex */
public final class k {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ALL = new k(ProtectedSandApp.s("硖\u0001"), 0);
    public static final k ONLY_NON_SYNTHESIZED = new k(ProtectedSandApp.s("硗\u0001"), 1);
    public static final k NONE = new k(ProtectedSandApp.s("硘\u0001"), 2);

    private static final /* synthetic */ k[] $values() {
        return new k[]{ALL, ONLY_NON_SYNTHESIZED, NONE};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private k(String str, int i4) {
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
