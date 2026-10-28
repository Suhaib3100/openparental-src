package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.functions.f;
import kotlin.text.v;

/* compiled from: FunctionTypeKindExtractor.kt */
@r1({"SMAP\nFunctionTypeKindExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionTypeKindExtractor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionTypeKindExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,70:1\n1477#2:71\n1502#2,3:72\n1505#2,3:82\n1747#2,3:85\n372#3,7:75\n*S KotlinDebug\n*F\n+ 1 FunctionTypeKindExtractor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionTypeKindExtractor\n*L\n32#1:71\n32#1:72,3\n32#1:82,3\n54#1:85,3\n32#1:75,7\n*E\n"})
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    @l
    public static final a f75692c = new a();

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final g f75693d = new g(w.O(f.a.f75688e, f.d.f75691e, f.b.f75689e, f.c.f75690e));

    /* renamed from: a, reason: collision with root package name */
    @l
    private final List<f> f75694a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final Map<kotlin.reflect.jvm.internal.impl.name.c, List<f>> f75695b;

    /* compiled from: FunctionTypeKindExtractor.kt */
    public static final class a {
        private a() {
        }

        @l
        public final g a() {
            return g.f75693d;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: FunctionTypeKindExtractor.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        private final f f75696a;

        /* renamed from: b, reason: collision with root package name */
        private final int f75697b;

        public b(@l f fVar, int i4) {
            l0.p(fVar, ProtectedSandApp.s("棧\u0001"));
            this.f75696a = fVar;
            this.f75697b = i4;
        }

        @l
        public final f a() {
            return this.f75696a;
        }

        public final int b() {
            return this.f75697b;
        }

        @l
        public final f c() {
            return this.f75696a;
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l0.g(this.f75696a, bVar.f75696a) && this.f75697b == bVar.f75697b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f75697b) + (this.f75696a.hashCode() * 31);
        }

        @l
        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("棨\u0001"));
            sb.append(this.f75696a);
            sb.append(ProtectedSandApp.s("棩\u0001"));
            return androidx.view.e.a(sb, this.f75697b, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@l List<? extends f> list) {
        l0.p(list, ProtectedSandApp.s("棪\u0001"));
        this.f75694a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            kotlin.reflect.jvm.internal.impl.name.c b5 = ((f) obj).b();
            Object obj2 = linkedHashMap.get(b5);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(b5, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f75695b = linkedHashMap;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int charAt = str.charAt(i5) - '0';
            if (charAt < 0 || charAt >= 10) {
                return null;
            }
            i4 = (i4 * 10) + charAt;
        }
        return Integer.valueOf(i4);
    }

    @m
    public final f b(@l kotlin.reflect.jvm.internal.impl.name.c cVar, @l String str) {
        l0.p(cVar, ProtectedSandApp.s("棫\u0001"));
        l0.p(str, ProtectedSandApp.s("棬\u0001"));
        b c5 = c(cVar, str);
        if (c5 != null) {
            return c5.c();
        }
        return null;
    }

    @m
    public final b c(@l kotlin.reflect.jvm.internal.impl.name.c cVar, @l String str) {
        l0.p(cVar, ProtectedSandApp.s("棫\u0001"));
        l0.p(str, ProtectedSandApp.s("棬\u0001"));
        List<f> list = this.f75695b.get(cVar);
        if (list == null) {
            return null;
        }
        for (f fVar : list) {
            if (v.s2(str, fVar.a(), false, 2, null)) {
                String substring = str.substring(fVar.a().length());
                l0.o(substring, ProtectedSandApp.s("棭\u0001"));
                Integer d5 = d(substring);
                if (d5 != null) {
                    return new b(fVar, d5.intValue());
                }
            }
        }
        return null;
    }
}
