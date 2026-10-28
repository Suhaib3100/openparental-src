package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.e1;
import kotlin.collections.p;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e;
import p3.n;

/* compiled from: KotlinClassHeader.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final EnumC0299a f25011a;

    /* renamed from: b, reason: collision with root package name */
    @d
    private final e f25012b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final String[] f25013c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private final String[] f25014d;

    /* renamed from: e, reason: collision with root package name */
    @d5.e
    private final String[] f25015e;

    /* renamed from: f, reason: collision with root package name */
    @d5.e
    private final String f25016f;

    /* renamed from: g, reason: collision with root package name */
    private final int f25017g;

    /* renamed from: h, reason: collision with root package name */
    @d5.e
    private final String f25018h;

    /* renamed from: i, reason: collision with root package name */
    @d5.e
    private final byte[] f25019i;

    /* compiled from: KotlinClassHeader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$a, reason: collision with other inner class name */
    public enum EnumC0299a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        @d
        public static final C0300a Companion = new C0300a(null);

        @d
        private static final Map<Integer, EnumC0299a> entryById;
        private final int id;

        /* compiled from: KotlinClassHeader.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$a$a, reason: collision with other inner class name */
        public static final class C0300a {
            private C0300a() {
            }

            @d
            @n
            public final EnumC0299a a(int i5) {
                EnumC0299a enumC0299a = (EnumC0299a) EnumC0299a.entryById.get(Integer.valueOf(i5));
                return enumC0299a == null ? EnumC0299a.UNKNOWN : enumC0299a;
            }

            public C0300a(w wVar) {
            }
        }

        static {
            int j5;
            EnumC0299a[] values = values();
            j5 = e1.j(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(j5 < 16 ? 16 : j5);
            for (EnumC0299a enumC0299a : values) {
                linkedHashMap.put(Integer.valueOf(enumC0299a.id), enumC0299a);
            }
            entryById = linkedHashMap;
        }

        EnumC0299a(int i5) {
            this.id = i5;
        }

        @d
        @n
        public static final EnumC0299a getById(int i5) {
            return Companion.a(i5);
        }
    }

    public a(@d EnumC0299a enumC0299a, @d e eVar, @d5.e String[] strArr, @d5.e String[] strArr2, @d5.e String[] strArr3, @d5.e String str, int i5, @d5.e String str2, @d5.e byte[] bArr) {
        l0.p(enumC0299a, ProtectedSandApp.s("䱍"));
        l0.p(eVar, ProtectedSandApp.s("䱎"));
        this.f25011a = enumC0299a;
        this.f25012b = eVar;
        this.f25013c = strArr;
        this.f25014d = strArr2;
        this.f25015e = strArr3;
        this.f25016f = str;
        this.f25017g = i5;
        this.f25018h = str2;
        this.f25019i = bArr;
    }

    private final boolean h(int i5, int i6) {
        return (i5 & i6) != 0;
    }

    @d5.e
    public final String[] a() {
        return this.f25013c;
    }

    @d5.e
    public final String[] b() {
        return this.f25014d;
    }

    @d
    public final EnumC0299a c() {
        return this.f25011a;
    }

    @d
    public final e d() {
        return this.f25012b;
    }

    @d5.e
    public final String e() {
        String str = this.f25016f;
        if (this.f25011a == EnumC0299a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    @d
    public final List<String> f() {
        String[] strArr = this.f25013c;
        if (!(this.f25011a == EnumC0299a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        List<String> t5 = strArr != null ? p.t(strArr) : null;
        return t5 == null ? EmptyList.f23167o : t5;
    }

    @d5.e
    public final String[] g() {
        return this.f25015e;
    }

    public final boolean i() {
        return h(this.f25017g, 2);
    }

    public final boolean j() {
        return h(this.f25017g, 64) && !h(this.f25017g, 32);
    }

    public final boolean k() {
        return h(this.f25017g, 16) && !h(this.f25017g, 32);
    }

    @d
    public String toString() {
        return this.f25011a + ProtectedSandApp.s("䱏") + this.f25012b;
    }
}
