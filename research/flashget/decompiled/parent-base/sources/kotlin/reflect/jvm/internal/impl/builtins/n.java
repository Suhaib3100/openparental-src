package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnsignedType.kt */
/* loaded from: classes7.dex */
public final class n {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n UBYTEARRAY;
    public static final n UINTARRAY;
    public static final n ULONGARRAY;
    public static final n USHORTARRAY;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.b classId;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    private static final /* synthetic */ n[] $values() {
        return new n[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.b e4 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("檲\u0001"));
        String s4 = ProtectedSandApp.s("檳\u0001");
        l0.o(e4, s4);
        UBYTEARRAY = new n(ProtectedSandApp.s("檴\u0001"), 0, e4);
        kotlin.reflect.jvm.internal.impl.name.b e5 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("檵\u0001"));
        l0.o(e5, s4);
        USHORTARRAY = new n(ProtectedSandApp.s("檶\u0001"), 1, e5);
        kotlin.reflect.jvm.internal.impl.name.b e6 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("檷\u0001"));
        l0.o(e6, s4);
        UINTARRAY = new n(ProtectedSandApp.s("檸\u0001"), 2, e6);
        kotlin.reflect.jvm.internal.impl.name.b e7 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("檹\u0001"));
        l0.o(e7, s4);
        ULONGARRAY = new n(ProtectedSandApp.s("檺\u0001"), 3, e7);
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private n(String str, int i4, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        this.classId = bVar;
        kotlin.reflect.jvm.internal.impl.name.f j4 = bVar.j();
        l0.o(j4, ProtectedSandApp.s("檻\u0001"));
        this.typeName = j4;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
        return this.typeName;
    }
}
