package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.v;

/* compiled from: FqNamesUtil.kt */
@r1({"SMAP\nFqNamesUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FqNamesUtil.kt\norg/jetbrains/kotlin/name/FqNamesUtilKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n526#2:87\n511#2,6:88\n1#3:94\n*S KotlinDebug\n*F\n+ 1 FqNamesUtil.kt\norg/jetbrains/kotlin/name/FqNamesUtilKt\n*L\n73#1:87\n73#1:88,6\n*E\n"})
/* loaded from: classes7.dex */
public final class e {

    /* compiled from: FqNamesUtil.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77582a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f77582a = iArr;
        }
    }

    @m
    public static final <V> V a(@l c cVar, @l Map<c, ? extends V> map) {
        Object next;
        l0.p(cVar, ProtectedSandApp.s("瘣\u0001"));
        l0.p(map, ProtectedSandApp.s("瘤\u0001"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<c, ? extends V> entry : map.entrySet()) {
            c key = entry.getKey();
            if (l0.g(cVar, key) || b(cVar, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).b().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((c) ((Map.Entry) next2).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final boolean b(@l c cVar, @l c cVar2) {
        l0.p(cVar, ProtectedSandApp.s("瘣\u0001"));
        l0.p(cVar2, ProtectedSandApp.s("瘥\u0001"));
        return l0.g(f(cVar), cVar2);
    }

    private static final boolean c(String str, String str2) {
        return v.s2(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(@l c cVar, @l c cVar2) {
        l0.p(cVar, ProtectedSandApp.s("瘣\u0001"));
        l0.p(cVar2, ProtectedSandApp.s("瘥\u0001"));
        if (l0.g(cVar, cVar2) || cVar2.d()) {
            return true;
        }
        String b5 = cVar.b();
        String s4 = ProtectedSandApp.s("瘦\u0001");
        l0.o(b5, s4);
        String b6 = cVar2.b();
        l0.o(b6, s4);
        return c(b5, b6);
    }

    public static final boolean e(@m String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.BEGINNING;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            int i5 = a.f77582a[kVar.ordinal()];
            if (i5 == 1 || i5 == 2) {
                if (!Character.isJavaIdentifierStart(charAt)) {
                    return false;
                }
                kVar = k.MIDDLE;
            } else if (i5 != 3) {
                continue;
            } else if (charAt == '.') {
                kVar = k.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        return kVar != k.AFTER_DOT;
    }

    @m
    public static final c f(@l c cVar) {
        l0.p(cVar, ProtectedSandApp.s("瘣\u0001"));
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    @l
    public static final c g(@l c cVar, @l c cVar2) {
        l0.p(cVar, ProtectedSandApp.s("瘣\u0001"));
        l0.p(cVar2, ProtectedSandApp.s("瘧\u0001"));
        if (!d(cVar, cVar2) || cVar2.d()) {
            return cVar;
        }
        if (l0.g(cVar, cVar2)) {
            c cVar3 = c.f77572c;
            l0.o(cVar3, ProtectedSandApp.s("瘨\u0001"));
            return cVar3;
        }
        String b5 = cVar.b();
        l0.o(b5, ProtectedSandApp.s("瘦\u0001"));
        String substring = b5.substring(cVar2.b().length() + 1);
        l0.o(substring, ProtectedSandApp.s("瘩\u0001"));
        return new c(substring);
    }
}
