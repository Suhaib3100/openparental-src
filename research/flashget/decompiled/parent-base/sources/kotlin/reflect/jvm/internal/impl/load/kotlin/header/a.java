package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd.n;
import kotlin.collections.j0;
import kotlin.collections.z0;
import kotlin.enums.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e;

/* compiled from: KotlinClassHeader.kt */
@r1({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final EnumC1104a f76884a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final e f76885b;

    /* renamed from: c, reason: collision with root package name */
    @m
    private final String[] f76886c;

    /* renamed from: d, reason: collision with root package name */
    @m
    private final String[] f76887d;

    /* renamed from: e, reason: collision with root package name */
    @m
    private final String[] f76888e;

    /* renamed from: f, reason: collision with root package name */
    @m
    private final String f76889f;

    /* renamed from: g, reason: collision with root package name */
    private final int f76890g;

    /* renamed from: h, reason: collision with root package name */
    @m
    private final String f76891h;

    /* renamed from: i, reason: collision with root package name */
    @m
    private final byte[] f76892i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KotlinClassHeader.kt */
    @r1({"SMAP\nKotlinClassHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n8541#2,2:79\n8801#2,4:81\n*S KotlinDebug\n*F\n+ 1 KotlinClassHeader.kt\norg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader$Kind\n*L\n34#1:79,2\n34#1:81,4\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$a, reason: collision with other inner class name */
    public static final class EnumC1104a {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ EnumC1104a[] $VALUES;

        @l
        public static final C1105a Companion;

        @l
        private static final Map<Integer, EnumC1104a> entryById;

        /* renamed from: id, reason: collision with root package name */
        private final int f76893id;
        public static final EnumC1104a UNKNOWN = new EnumC1104a(ProtectedSandApp.s("琍\u0001"), 0, 0);
        public static final EnumC1104a CLASS = new EnumC1104a(ProtectedSandApp.s("琎\u0001"), 1, 1);
        public static final EnumC1104a FILE_FACADE = new EnumC1104a(ProtectedSandApp.s("琏\u0001"), 2, 2);
        public static final EnumC1104a SYNTHETIC_CLASS = new EnumC1104a(ProtectedSandApp.s("琐\u0001"), 3, 3);
        public static final EnumC1104a MULTIFILE_CLASS = new EnumC1104a(ProtectedSandApp.s("琑\u0001"), 4, 4);
        public static final EnumC1104a MULTIFILE_CLASS_PART = new EnumC1104a(ProtectedSandApp.s("琒\u0001"), 5, 5);

        /* compiled from: KotlinClassHeader.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$a$a, reason: collision with other inner class name */
        public static final class C1105a {
            private C1105a() {
            }

            @l
            @n
            public final EnumC1104a a(int i4) {
                EnumC1104a enumC1104a = (EnumC1104a) EnumC1104a.entryById.get(Integer.valueOf(i4));
                return enumC1104a == null ? EnumC1104a.UNKNOWN : enumC1104a;
            }

            public C1105a(w wVar) {
            }
        }

        private static final /* synthetic */ EnumC1104a[] $values() {
            return new EnumC1104a[]{UNKNOWN, CLASS, FILE_FACADE, SYNTHETIC_CLASS, MULTIFILE_CLASS, MULTIFILE_CLASS_PART};
        }

        static {
            EnumC1104a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
            Companion = new C1105a();
            EnumC1104a[] values = values();
            int j4 = z0.j(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(j4 < 16 ? 16 : j4);
            for (EnumC1104a enumC1104a : values) {
                linkedHashMap.put(Integer.valueOf(enumC1104a.f76893id), enumC1104a);
            }
            entryById = linkedHashMap;
        }

        private EnumC1104a(String str, int i4, int i5) {
            this.f76893id = i5;
        }

        @l
        @n
        public static final EnumC1104a getById(int i4) {
            return Companion.a(i4);
        }

        public static EnumC1104a valueOf(String str) {
            return (EnumC1104a) Enum.valueOf(EnumC1104a.class, str);
        }

        public static EnumC1104a[] values() {
            return (EnumC1104a[]) $VALUES.clone();
        }
    }

    public a(@l EnumC1104a enumC1104a, @l e eVar, @m String[] strArr, @m String[] strArr2, @m String[] strArr3, @m String str, int i4, @m String str2, @m byte[] bArr) {
        l0.p(enumC1104a, ProtectedSandApp.s("琓\u0001"));
        l0.p(eVar, ProtectedSandApp.s("琔\u0001"));
        this.f76884a = enumC1104a;
        this.f76885b = eVar;
        this.f76886c = strArr;
        this.f76887d = strArr2;
        this.f76888e = strArr3;
        this.f76889f = str;
        this.f76890g = i4;
        this.f76891h = str2;
        this.f76892i = bArr;
    }

    private final boolean h(int i4, int i5) {
        return (i4 & i5) != 0;
    }

    @m
    public final String[] a() {
        return this.f76886c;
    }

    @m
    public final String[] b() {
        return this.f76887d;
    }

    @l
    public final EnumC1104a c() {
        return this.f76884a;
    }

    @l
    public final e d() {
        return this.f76885b;
    }

    @m
    public final String e() {
        String str = this.f76889f;
        if (this.f76884a == EnumC1104a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    @l
    public final List<String> f() {
        String[] strArr = this.f76886c;
        if (this.f76884a != EnumC1104a.MULTIFILE_CLASS) {
            strArr = null;
        }
        List<String> t4 = strArr != null ? kotlin.collections.l.t(strArr) : null;
        return t4 == null ? j0.f74919b : t4;
    }

    @m
    public final String[] g() {
        return this.f76888e;
    }

    public final boolean i() {
        return h(this.f76890g, 2);
    }

    public final boolean j() {
        return h(this.f76890g, 64) && !h(this.f76890g, 32);
    }

    public final boolean k() {
        return h(this.f76890g, 16) && !h(this.f76890g, 32);
    }

    @l
    public String toString() {
        return this.f76884a + ProtectedSandApp.s("琕\u0001") + this.f76885b;
    }
}
