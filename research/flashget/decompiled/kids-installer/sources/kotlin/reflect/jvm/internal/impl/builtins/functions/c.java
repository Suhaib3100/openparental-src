package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.name.f;
import p3.n;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'KFunction' uses external variables
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
/* compiled from: FunctionClassKind.kt */
/* loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;

    @d5.d
    public static final a Companion;
    public static final c KFunction;
    public static final c KSuspendFunction;

    @d5.d
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;

    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.c packageFqName;
    public static final c Function = new c(ProtectedSandApp.s("䒷"), 0, l.f24035u, ProtectedSandApp.s("䒸"), false, false);
    public static final c SuspendFunction = new c(ProtectedSandApp.s("䒹"), 1, l.f24027m, ProtectedSandApp.s("䒺"), true, false);

    /* compiled from: FunctionClassKind.kt */
    public static final class a {

        /* compiled from: FunctionClassKind.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.c$a$a, reason: collision with other inner class name */
        public static final class C0271a {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private final c f23903a;

            /* renamed from: b, reason: collision with root package name */
            private final int f23904b;

            public C0271a(@d5.d c cVar, int i5) {
                l0.p(cVar, ProtectedSandApp.s("䒭"));
                this.f23903a = cVar;
                this.f23904b = i5;
            }

            @d5.d
            public final c a() {
                return this.f23903a;
            }

            public final int b() {
                return this.f23904b;
            }

            @d5.d
            public final c c() {
                return this.f23903a;
            }

            public boolean equals(@d5.e Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0271a)) {
                    return false;
                }
                C0271a c0271a = (C0271a) obj;
                return this.f23903a == c0271a.f23903a && this.f23904b == c0271a.f23904b;
            }

            public int hashCode() {
                return Integer.hashCode(this.f23904b) + (this.f23903a.hashCode() * 31);
            }

            @d5.d
            public String toString() {
                return ProtectedSandApp.s("䒮") + this.f23903a + ProtectedSandApp.s("䒯") + this.f23904b + ')';
            }
        }

        private a() {
        }

        private final Integer d(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                int charAt = str.charAt(i6) - '0';
                if (!(charAt >= 0 && charAt < 10)) {
                    return null;
                }
                i5 = (i5 * 10) + charAt;
            }
            return Integer.valueOf(i5);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[LOOP:0: B:2:0x0019->B:10:0x003a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[SYNTHETIC] */
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.reflect.jvm.internal.impl.builtins.functions.c a(@d5.d kotlin.reflect.jvm.internal.impl.name.c r9, @d5.d java.lang.String r10) {
            /*
                r8 = this;
                java.lang.String r0 = "䒰"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r9, r0)
                java.lang.String r0 = "䒱"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r10, r0)
                kotlin.reflect.jvm.internal.impl.builtins.functions.c[] r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.c.values()
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L19:
                r4 = 0
                if (r3 >= r1) goto L3d
                r5 = r0[r3]
                kotlin.reflect.jvm.internal.impl.name.c r6 = r5.getPackageFqName()
                boolean r6 = kotlin.jvm.internal.l0.g(r6, r9)
                if (r6 == 0) goto L35
                java.lang.String r6 = r5.getClassNamePrefix()
                r7 = 2
                boolean r4 = kotlin.text.v.s2(r10, r6, r2, r7, r4)
                if (r4 == 0) goto L35
                r4 = 1
                goto L36
            L35:
                r4 = r2
            L36:
                if (r4 == 0) goto L3a
                r4 = r5
                goto L3d
            L3a:
                int r3 = r3 + 1
                goto L19
            L3d:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.functions.c.a.a(kotlin.reflect.jvm.internal.impl.name.c, java.lang.String):kotlin.reflect.jvm.internal.impl.builtins.functions.c");
        }

        @d5.e
        @n
        public final c b(@d5.d String str, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            l0.p(str, ProtectedSandApp.s("䒲"));
            l0.p(cVar, ProtectedSandApp.s("䒳"));
            C0271a c6 = c(str, cVar);
            if (c6 != null) {
                return c6.c();
            }
            return null;
        }

        @d5.e
        public final C0271a c(@d5.d String str, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            l0.p(str, ProtectedSandApp.s("䒴"));
            l0.p(cVar, ProtectedSandApp.s("䒵"));
            c a6 = a(cVar, str);
            if (a6 == null) {
                return null;
            }
            String substring = str.substring(a6.getClassNamePrefix().length());
            l0.o(substring, ProtectedSandApp.s("䒶"));
            Integer d6 = d(substring);
            if (d6 != null) {
                return new C0271a(a6, d6.intValue());
            }
            return null;
        }

        public a(w wVar) {
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{Function, SuspendFunction, KFunction, KSuspendFunction};
    }

    static {
        String s5 = ProtectedSandApp.s("䒻");
        kotlin.reflect.jvm.internal.impl.name.c cVar = l.f24032r;
        KFunction = new c(s5, 2, cVar, ProtectedSandApp.s("䒼"), false, true);
        KSuspendFunction = new c(ProtectedSandApp.s("䒽"), 3, cVar, ProtectedSandApp.s("䒾"), true, true);
        $VALUES = $values();
        Companion = new a(null);
    }

    private c(String str, int i5, kotlin.reflect.jvm.internal.impl.name.c cVar, String str2, boolean z5, boolean z6) {
        this.packageFqName = cVar;
        this.classNamePrefix = str2;
        this.isSuspendType = z5;
        this.isReflectType = z6;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @d5.d
    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.c getPackageFqName() {
        return this.packageFqName;
    }

    @d5.d
    public final f numberedClassName(int i5) {
        f p5 = f.p(this.classNamePrefix + i5);
        l0.o(p5, ProtectedSandApp.s("䒿"));
        return p5;
    }
}
