package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeserializedContainerSource.kt */
/* loaded from: classes7.dex */
public final class f {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f STABLE = new f(ProtectedSandApp.s("箘\u0001"), 0);
    public static final f FIR_UNSTABLE = new f(ProtectedSandApp.s("箙\u0001"), 1);
    public static final f IR_UNSTABLE = new f(ProtectedSandApp.s("箚\u0001"), 2);

    private static final /* synthetic */ f[] $values() {
        return new f[]{STABLE, FIR_UNSTABLE, IR_UNSTABLE};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private f(String str, int i4) {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
