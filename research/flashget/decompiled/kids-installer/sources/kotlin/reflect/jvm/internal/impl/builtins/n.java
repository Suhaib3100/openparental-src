package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTEARRAY' uses external variables
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
public final class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n UBYTEARRAY;
    public static final n UINTARRAY;
    public static final n ULONGARRAY;
    public static final n USHORTARRAY;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.b classId;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    private static final /* synthetic */ n[] $values() {
        return new n[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.b e6 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("䚬"));
        l0.o(e6, ProtectedSandApp.s("䚭"));
        UBYTEARRAY = new n(ProtectedSandApp.s("䚮"), 0, e6);
        kotlin.reflect.jvm.internal.impl.name.b e7 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("䚯"));
        l0.o(e7, ProtectedSandApp.s("䚰"));
        USHORTARRAY = new n(ProtectedSandApp.s("䚱"), 1, e7);
        kotlin.reflect.jvm.internal.impl.name.b e8 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("䚲"));
        l0.o(e8, ProtectedSandApp.s("䚳"));
        UINTARRAY = new n(ProtectedSandApp.s("䚴"), 2, e8);
        kotlin.reflect.jvm.internal.impl.name.b e9 = kotlin.reflect.jvm.internal.impl.name.b.e(ProtectedSandApp.s("䚵"));
        l0.o(e9, ProtectedSandApp.s("䚶"));
        ULONGARRAY = new n(ProtectedSandApp.s("䚷"), 3, e9);
        $VALUES = $values();
    }

    private n(String str, int i5, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        this.classId = bVar;
        kotlin.reflect.jvm.internal.impl.name.f j5 = bVar.j();
        l0.o(j5, ProtectedSandApp.s("䚸"));
        this.typeName = j5;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
        return this.typeName;
    }
}
