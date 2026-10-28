package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClassKind.kt */
/* loaded from: classes7.dex */
public final class f {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @fg.m
    private final String codeRepresentation;
    public static final f CLASS = new f(ProtectedSandApp.s("歽\u0001"), 0, ProtectedSandApp.s("歼\u0001"));
    public static final f INTERFACE = new f(ProtectedSandApp.s("歿\u0001"), 1, ProtectedSandApp.s("歾\u0001"));
    public static final f ENUM_CLASS = new f(ProtectedSandApp.s("殁\u0001"), 2, ProtectedSandApp.s("殀\u0001"));
    public static final f ENUM_ENTRY = new f(ProtectedSandApp.s("殂\u0001"), 3, null);
    public static final f ANNOTATION_CLASS = new f(ProtectedSandApp.s("殄\u0001"), 4, ProtectedSandApp.s("殃\u0001"));
    public static final f OBJECT = new f(ProtectedSandApp.s("殆\u0001"), 5, ProtectedSandApp.s("殅\u0001"));

    private static final /* synthetic */ f[] $values() {
        return new f[]{CLASS, INTERFACE, ENUM_CLASS, ENUM_ENTRY, ANNOTATION_CLASS, OBJECT};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private f(String str, int i4, String str2) {
        this.codeRepresentation = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
