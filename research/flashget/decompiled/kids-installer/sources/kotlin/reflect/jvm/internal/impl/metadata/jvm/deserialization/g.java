package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.IndexedValue;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.collections.e1;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.text.Typography;
import kotlin.text.e0;
import org.apache.commons.io.k;

/* compiled from: JvmNameResolverBase.kt */
/* loaded from: classes5.dex */
public class g implements kotlin.reflect.jvm.internal.impl.metadata.deserialization.c {

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    public static final a f25569d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final String f25570e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final List<String> f25571f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final Map<String, Integer> f25572g;

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final String[] f25573a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Set<Integer> f25574b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final List<a.e.c> f25575c;

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
        public static final /* synthetic */ int[] f25576a;

        static {
            int[] iArr = new int[a.e.c.EnumC0359c.values().length];
            try {
                iArr[a.e.c.EnumC0359c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.e.c.EnumC0359c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.e.c.EnumC0359c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25576a = iArr;
        }
    }

    static {
        List O;
        String m32;
        List<String> O2;
        Iterable<IndexedValue> h6;
        int b02;
        int j5;
        O = a0.O('k', 'o', 't', 'l', 'i', 'n');
        m32 = j0.m3(O, "", null, null, 0, null, null, 62, null);
        f25570e = m32;
        O2 = a0.O(androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷛")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷜")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷝")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷞")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷟")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷠")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷡")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷢")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷣")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷤")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷥")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷦")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷧")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷨")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷩")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷪")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷫")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷬")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷭")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷮")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷯")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷰")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷱")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷲")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷳")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷴")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷵")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷶")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷷")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷸")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷹")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷺")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷻")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷼")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷽")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷾")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("䷿")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("一")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("丁")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("丂")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("七")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("丄")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("丅")), androidx.concurrent.futures.b.a(m32, ProtectedSandApp.s("丆")));
        f25571f = O2;
        h6 = j0.h6(O2);
        b02 = b0.b0(h6, 10);
        j5 = e1.j(b02);
        LinkedHashMap linkedHashMap = new LinkedHashMap(j5 >= 16 ? j5 : 16);
        for (IndexedValue indexedValue : h6) {
            linkedHashMap.put((String) indexedValue.f(), Integer.valueOf(indexedValue.e()));
        }
        f25572g = linkedHashMap;
    }

    public g(@d5.d String[] strArr, @d5.d Set<Integer> set, @d5.d List<a.e.c> list) {
        l0.p(strArr, ProtectedSandApp.s("万"));
        l0.p(set, ProtectedSandApp.s("丈"));
        l0.p(list, ProtectedSandApp.s("三"));
        this.f25573a = strArr;
        this.f25574b = set;
        this.f25575c = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @d5.d
    public String a(int i5) {
        return getString(i5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    public boolean b(int i5) {
        return this.f25574b.contains(Integer.valueOf(i5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.c
    @d5.d
    public String getString(int i5) {
        String str;
        a.e.c cVar = this.f25575c.get(i5);
        if (cVar.Q()) {
            str = cVar.J();
        } else {
            if (cVar.O()) {
                List<String> list = f25571f;
                int size = list.size();
                int F = cVar.F();
                if (F >= 0 && F < size) {
                    str = list.get(cVar.F());
                }
            }
            str = this.f25573a[i5];
        }
        int L = cVar.L();
        String s5 = ProtectedSandApp.s("上");
        String s6 = ProtectedSandApp.s("下");
        if (L >= 2) {
            List<Integer> M = cVar.M();
            l0.o(M, ProtectedSandApp.s("丌"));
            Integer num = M.get(0);
            Integer num2 = M.get(1);
            l0.o(num, ProtectedSandApp.s("不"));
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                l0.o(num2, ProtectedSandApp.s("与"));
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    l0.o(str, s6);
                    str = str.substring(num.intValue(), num2.intValue());
                    l0.o(str, s5);
                }
            }
        }
        String str2 = str;
        if (cVar.H() >= 2) {
            List<Integer> I = cVar.I();
            l0.o(I, ProtectedSandApp.s("丏"));
            Integer num3 = I.get(0);
            Integer num4 = I.get(1);
            l0.o(str2, s6);
            str2 = e0.h2(str2, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        String str3 = str2;
        a.e.c.EnumC0359c E = cVar.E();
        if (E == null) {
            E = a.e.c.EnumC0359c.NONE;
        }
        int i6 = b.f25576a[E.ordinal()];
        if (i6 == 2) {
            l0.o(str3, s6);
            str3 = e0.h2(str3, Typography.f27127c, k.f32026a, false, 4, null);
        } else if (i6 == 3) {
            if (str3.length() >= 2) {
                l0.o(str3, s6);
                str3 = str3.substring(1, str3.length() - 1);
                l0.o(str3, s5);
            }
            String str4 = str3;
            l0.o(str4, s6);
            str3 = e0.h2(str4, Typography.f27127c, k.f32026a, false, 4, null);
        }
        l0.o(str3, s6);
        return str3;
    }
}
