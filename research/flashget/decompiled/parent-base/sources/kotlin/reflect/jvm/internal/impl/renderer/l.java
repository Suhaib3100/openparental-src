package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes7.dex */
public final class l {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l PRETTY = new l(ProtectedSandApp.s("硙\u0001"), 0);
    public static final l DEBUG = new l(ProtectedSandApp.s("硚\u0001"), 1);
    public static final l NONE = new l(ProtectedSandApp.s("硛\u0001"), 2);

    private static final /* synthetic */ l[] $values() {
        return new l[]{PRETTY, DEBUG, NONE};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private l(String str, int i4) {
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
