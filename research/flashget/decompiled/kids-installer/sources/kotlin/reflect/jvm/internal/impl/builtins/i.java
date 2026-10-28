package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.q1;
import kotlin.d0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kotlin.reflect.jvm.internal.impl.builtins.i, still in use, count: 1, list:
  (r0v1 kotlin.reflect.jvm.internal.impl.builtins.i) from 0x00ae: FILLED_NEW_ARRAY 
  (r0v1 kotlin.reflect.jvm.internal.impl.builtins.i)
  (r1v4 kotlin.reflect.jvm.internal.impl.builtins.i)
  (r2v6 kotlin.reflect.jvm.internal.impl.builtins.i)
  (r5v4 kotlin.reflect.jvm.internal.impl.builtins.i)
  (r7v4 kotlin.reflect.jvm.internal.impl.builtins.i)
  (r9v4 kotlin.reflect.jvm.internal.impl.builtins.i)
  (r11v4 kotlin.reflect.jvm.internal.impl.builtins.i)
 A[WRAPPED] (LINE:111) elemType: kotlin.reflect.jvm.internal.impl.builtins.i
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: PrimitiveType.kt */
/* loaded from: classes5.dex */
public final class i {
    BOOLEAN(ProtectedSandApp.s("䓲")),
    CHAR(ProtectedSandApp.s("䓴")),
    BYTE(ProtectedSandApp.s("䓶")),
    SHORT(ProtectedSandApp.s("䓸")),
    INT(ProtectedSandApp.s("䓺")),
    FLOAT(ProtectedSandApp.s("䓼")),
    LONG(ProtectedSandApp.s("䓾")),
    DOUBLE(ProtectedSandApp.s("䔀"));


    @d5.d
    @p3.f
    public static final Set<i> NUMBER_TYPES;

    @d5.d
    private final Lazy arrayTypeFqName$delegate;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.f arrayTypeName;

    @d5.d
    private final Lazy typeFqName$delegate;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.f typeName;

    @d5.d
    public static final a Companion = new a(null);

    /* compiled from: PrimitiveType.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: PrimitiveType.kt */
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.name.c> {
        b() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.c n() {
            kotlin.reflect.jvm.internal.impl.name.c c6 = l.f24035u.c(i.this.getArrayTypeName());
            l0.o(c6, ProtectedSandApp.s("胚"));
            return c6;
        }
    }

    /* compiled from: PrimitiveType.kt */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.name.c> {
        c() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.name.c n() {
            kotlin.reflect.jvm.internal.impl.name.c c6 = l.f24035u.c(i.this.getTypeName());
            l0.o(c6, ProtectedSandApp.s("胛"));
            return c6;
        }
    }

    static {
        Set<i> u5;
        u5 = q1.u(new i(ProtectedSandApp.s("䓴")), new i(ProtectedSandApp.s("䓶")), new i(ProtectedSandApp.s("䓸")), new i(ProtectedSandApp.s("䓺")), new i(ProtectedSandApp.s("䓼")), new i(ProtectedSandApp.s("䓾")), new i(ProtectedSandApp.s("䔀")));
        NUMBER_TYPES = u5;
    }

    private i(String str) {
        Lazy b6;
        Lazy b7;
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(str);
        l0.o(p5, ProtectedSandApp.s("䔂"));
        this.typeName = p5;
        kotlin.reflect.jvm.internal.impl.name.f p6 = kotlin.reflect.jvm.internal.impl.name.f.p(str + ProtectedSandApp.s("䔃"));
        l0.o(p6, ProtectedSandApp.s("䔄"));
        this.arrayTypeName = p6;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        b6 = d0.b(lazyThreadSafetyMode, new c());
        this.typeFqName$delegate = b6;
        b7 = d0.b(lazyThreadSafetyMode, new b());
        this.arrayTypeFqName$delegate = b7;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.c getArrayTypeFqName() {
        return (kotlin.reflect.jvm.internal.impl.name.c) this.arrayTypeFqName$delegate.getValue();
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.f getArrayTypeName() {
        return this.arrayTypeName;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.c getTypeFqName() {
        return (kotlin.reflect.jvm.internal.impl.name.c) this.typeFqName$delegate.getValue();
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.f getTypeName() {
        return this.typeName;
    }
}
