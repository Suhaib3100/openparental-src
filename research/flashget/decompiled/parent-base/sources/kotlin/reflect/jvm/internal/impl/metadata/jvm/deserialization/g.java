package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.r0;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.text.v;

/* compiled from: JvmNameResolverBase.kt */
@r1({"SMAP\nJvmNameResolverBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1208#2,2:107\n1238#2,4:109\n*S KotlinDebug\n*F\n+ 1 JvmNameResolverBase.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolverBase\n*L\n101#1:107,2\n101#1:109,4\n*E\n"})
/* loaded from: classes7.dex */
public class g implements kotlin.reflect.jvm.internal.impl.metadata.deserialization.c {

    /* renamed from: d, reason: collision with root package name */
    @l
    public static final a f77551d = new a();

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final String f77552e;

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final List<String> f77553f;

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final Map<String, Integer> f77554g;

    /* renamed from: a, reason: collision with root package name */
    @l
    private final String[] f77555a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final Set<Integer> f77556b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private final List<a.e.c> f77557c;

    /* compiled from: JvmNameResolverBase.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: JvmNameResolverBase.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77558a;

        static {
            int[] iArr = new int[a.e.c.EnumC1164c.values().length];
            try {
                iArr[a.e.c.EnumC1164c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.e.c.EnumC1164c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.e.c.EnumC1164c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f77558a = iArr;
        }
    }

    static {
        String m32 = kotlin.collections.w.m3(kotlin.collections.w.O('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f77552e = m32;
        List<String> O = kotlin.collections.w.O(androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疒\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疓\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疔\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疕\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疖\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疗\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疘\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疙\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疚\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疛\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疜\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疝\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疞\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疟\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疠\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疡\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疢\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疣\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疤\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疥\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疦\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疧\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疨\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疩\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疪\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疫\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疬\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疭\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疮\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疯\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疰\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疱\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疲\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疳\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疴\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疵\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疶\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疷\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疸\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疹\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疺\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疻\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疼\u0001")), androidx.compose.runtime.changelist.j.a(m32, ProtectedSandApp.s("疽\u0001")));
        f77553f = O;
        Iterable<r0> h6 = kotlin.collections.w.h6(O);
        int j4 = z0.j(kotlin.collections.w.b0(h6, 10));
        if (j4 < 16) {
            j4 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
        for (r0 r0Var : h6) {
            linkedHashMap.put((String) r0Var.f(), Integer.valueOf(r0Var.e()));
        }
        f77554g = linkedHashMap;
    }

    public g(@l String[] strArr, @l Set<Integer> set, @l List<a.e.c> list) {
        l0.p(strArr, ProtectedSandApp.s("疾\u0001"));
        l0.p(set, ProtectedSandApp.s("疿\u0001"));
        l0.p(list, ProtectedSandApp.s("痀\u0001"));
        this.f77555a = strArr;
        this.f77556b = set;
        this.f77557c = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    public boolean a(int i4) {
        return this.f77556b.contains(Integer.valueOf(i4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @l
    public String b(int i4) {
        return getString(i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @l
    public String getString(int i4) {
        String str;
        a.e.c cVar = this.f77557c.get(i4);
        if (cVar.R()) {
            str = cVar.K();
        } else {
            if (cVar.P()) {
                List<String> list = f77553f;
                int size = list.size();
                int G = cVar.G();
                if (G >= 0 && G < size) {
                    str = list.get(cVar.G());
                }
            }
            str = this.f77555a[i4];
        }
        int M = cVar.M();
        String s4 = ProtectedSandApp.s("痁\u0001");
        if (M >= 2) {
            List<Integer> N = cVar.N();
            l0.m(N);
            Integer num = N.get(0);
            Integer num2 = N.get(1);
            l0.m(num);
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                l0.m(num2);
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    l0.m(str);
                    str = str.substring(num.intValue(), num2.intValue());
                    l0.o(str, s4);
                }
            }
        }
        String str2 = str;
        if (cVar.I() >= 2) {
            List<Integer> J = cVar.J();
            l0.m(J);
            Integer num3 = J.get(0);
            Integer num4 = J.get(1);
            l0.m(str2);
            str2 = v.h2(str2, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        String str3 = str2;
        a.e.c.EnumC1164c F = cVar.F();
        if (F == null) {
            F = a.e.c.EnumC1164c.NONE;
        }
        int i5 = b.f77558a[F.ordinal()];
        if (i5 == 2) {
            l0.m(str3);
            str3 = v.h2(str3, '$', '.', false, 4, null);
        } else if (i5 == 3) {
            if (str3.length() >= 2) {
                l0.m(str3);
                str3 = str3.substring(1, str3.length() - 1);
                l0.o(str3, s4);
            }
            String str4 = str3;
            l0.m(str4);
            str3 = v.h2(str4, '$', '.', false, 4, null);
        }
        l0.m(str3);
        return str3;
    }
}
