package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes7.dex */
public final class j {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j RENDER_OVERRIDE = new j(ProtectedSandApp.s("硓\u0001"), 0);
    public static final j RENDER_OPEN = new j(ProtectedSandApp.s("硔\u0001"), 1);
    public static final j RENDER_OPEN_OVERRIDE = new j(ProtectedSandApp.s("硕\u0001"), 2);

    private static final /* synthetic */ j[] $values() {
        return new j[]{RENDER_OVERRIDE, RENDER_OPEN, RENDER_OPEN_OVERRIDE};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private j(String str, int i4) {
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
