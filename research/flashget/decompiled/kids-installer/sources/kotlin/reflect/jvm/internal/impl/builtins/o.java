package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: UnsignedType.kt */
/* loaded from: classes5.dex */
public final class o {
    private static final /* synthetic */ o[] $VALUES;
    public static final o UBYTE;
    public static final o UINT;
    public static final o ULONG;
    public static final o USHORT;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.b arrayClassId;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.b classId;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    private static final /* synthetic */ o[] $values() {
        return new o[]{UBYTE, USHORT, UINT, ULONG};
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.b e6 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("䚹"));
        l0.o(e6, ProtectedSandApp.s("䚺"));
        UBYTE = new o(ProtectedSandApp.s("䚻"), 0, e6);
        kotlin.reflect.jvm.internal.impl.name.b e7 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("䚼"));
        l0.o(e7, ProtectedSandApp.s("䚽"));
        USHORT = new o(ProtectedSandApp.s("䚾"), 1, e7);
        kotlin.reflect.jvm.internal.impl.name.b e8 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("䚿"));
        l0.o(e8, ProtectedSandApp.s("䛀"));
        UINT = new o(ProtectedSandApp.s("䛁"), 2, e8);
        kotlin.reflect.jvm.internal.impl.name.b e9 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("䛂"));
        l0.o(e9, ProtectedSandApp.s("䛃"));
        ULONG = new o(ProtectedSandApp.s("䛄"), 3, e9);
        $VALUES = $values();
    }

    private o(String str, int i5, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        this.classId = bVar;
        kotlin.reflect.jvm.internal.impl.name.f j5 = bVar.j();
        l0.o(j5, ProtectedSandApp.s("䛅"));
        this.typeName = j5;
        this.arrayClassId = new kotlin.reflect.jvm.internal.impl.name.b(bVar.h(), kotlin.reflect.jvm.internal.impl.name.f.p(j5.h() + ProtectedSandApp.s("䛆")));
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.b getArrayClassId() {
        return this.arrayClassId;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.b getClassId() {
        return this.classId;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
        return this.typeName;
    }
}
