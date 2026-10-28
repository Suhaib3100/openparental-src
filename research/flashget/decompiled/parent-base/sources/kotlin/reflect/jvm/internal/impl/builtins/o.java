package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnsignedType.kt */
/* loaded from: classes7.dex */
public final class o {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o UBYTE;
    public static final o UINT;
    public static final o ULONG;
    public static final o USHORT;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.b arrayClassId;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.b classId;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    private static final /* synthetic */ o[] $values() {
        return new o[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.b e4 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("檼\u0001"));
        String s4 = ProtectedSandApp.s("檽\u0001");
        l0.o(e4, s4);
        UBYTE = new o(ProtectedSandApp.s("檾\u0001"), 0, e4);
        kotlin.reflect.jvm.internal.impl.name.b e5 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("檿\u0001"));
        l0.o(e5, s4);
        USHORT = new o(ProtectedSandApp.s("櫀\u0001"), 1, e5);
        kotlin.reflect.jvm.internal.impl.name.b e6 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("櫁\u0001"));
        l0.o(e6, s4);
        UINT = new o(ProtectedSandApp.s("櫂\u0001"), 2, e6);
        kotlin.reflect.jvm.internal.impl.name.b e7 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("櫃\u0001"));
        l0.o(e7, s4);
        ULONG = new o(ProtectedSandApp.s("櫄\u0001"), 3, e7);
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private o(String str, int i4, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        this.classId = bVar;
        kotlin.reflect.jvm.internal.impl.name.f j4 = bVar.j();
        l0.o(j4, ProtectedSandApp.s("櫅\u0001"));
        this.typeName = j4;
        this.arrayClassId = new kotlin.reflect.jvm.internal.impl.name.b(bVar.h(), kotlin.reflect.jvm.internal.impl.name.f.f(j4.b() + ProtectedSandApp.s("櫆\u0001")));
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.b getArrayClassId() {
        return this.arrayClassId;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.b getClassId() {
        return this.classId;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
        return this.typeName;
    }
}
