package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Set;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.l1;
import kotlin.f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrimitiveType.kt */
/* loaded from: classes7.dex */
public final class i {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i BOOLEAN = new i(ProtectedSandApp.s("椈\u0001"), 0, ProtectedSandApp.s("椇\u0001"));
    public static final i BYTE;
    public static final i CHAR;

    @fg.l
    public static final a Companion;
    public static final i DOUBLE;
    public static final i FLOAT;
    public static final i INT;
    public static final i LONG;

    @fg.l
    @kd.f
    public static final Set<i> NUMBER_TYPES;
    public static final i SHORT;

    @fg.l
    private final b0 arrayTypeFqName$delegate;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.f arrayTypeName;

    @fg.l
    private final b0 typeFqName$delegate;

    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    /* compiled from: PrimitiveType.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: PrimitiveType.kt */
    static final class b extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.name.c> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.c invoke() {
            kotlin.reflect.jvm.internal.impl.name.c c5 = l.f75836y.c(i.this.getArrayTypeName());
            l0.o(c5, ProtectedSandApp.s("椅\u0001"));
            return c5;
        }
    }

    /* compiled from: PrimitiveType.kt */
    static final class c extends n0 implements ld.a<kotlin.reflect.jvm.internal.impl.name.c> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.c invoke() {
            kotlin.reflect.jvm.internal.impl.name.c c5 = l.f75836y.c(i.this.getTypeName());
            l0.o(c5, ProtectedSandApp.s("椆\u0001"));
            return c5;
        }
    }

    private static final /* synthetic */ i[] $values() {
        return new i[]{BOOLEAN, CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE};
    }

    static {
        i iVar = new i(ProtectedSandApp.s("椊\u0001"), 1, ProtectedSandApp.s("椉\u0001"));
        CHAR = iVar;
        i iVar2 = new i(ProtectedSandApp.s("椌\u0001"), 2, ProtectedSandApp.s("椋\u0001"));
        BYTE = iVar2;
        i iVar3 = new i(ProtectedSandApp.s("椎\u0001"), 3, ProtectedSandApp.s("植\u0001"));
        SHORT = iVar3;
        i iVar4 = new i(ProtectedSandApp.s("椐\u0001"), 4, ProtectedSandApp.s("椏\u0001"));
        INT = iVar4;
        i iVar5 = new i(ProtectedSandApp.s("椒\u0001"), 5, ProtectedSandApp.s("椑\u0001"));
        FLOAT = iVar5;
        i iVar6 = new i(ProtectedSandApp.s("椔\u0001"), 6, ProtectedSandApp.s("椓\u0001"));
        LONG = iVar6;
        i iVar7 = new i(ProtectedSandApp.s("椖\u0001"), 7, ProtectedSandApp.s("椕\u0001"));
        DOUBLE = iVar7;
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
        Companion = new a();
        NUMBER_TYPES = l1.u(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7);
    }

    private i(String str, int i4, String str2) {
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(str2);
        String s4 = ProtectedSandApp.s("椗\u0001");
        l0.o(f4, s4);
        this.typeName = f4;
        kotlin.reflect.jvm.internal.impl.name.f f5 = kotlin.reflect.jvm.internal.impl.name.f.f(str2 + ProtectedSandApp.s("椘\u0001"));
        l0.o(f5, s4);
        this.arrayTypeName = f5;
        f0 f0Var = f0.PUBLICATION;
        this.typeFqName$delegate = c0.b(f0Var, new c());
        this.arrayTypeFqName$delegate = c0.b(f0Var, new b());
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.c getArrayTypeFqName() {
        return (kotlin.reflect.jvm.internal.impl.name.c) this.arrayTypeFqName$delegate.getValue();
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.f getArrayTypeName() {
        return this.arrayTypeName;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.c getTypeFqName() {
        return (kotlin.reflect.jvm.internal.impl.name.c) this.typeFqName$delegate.getValue();
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
        return this.typeName;
    }
}
