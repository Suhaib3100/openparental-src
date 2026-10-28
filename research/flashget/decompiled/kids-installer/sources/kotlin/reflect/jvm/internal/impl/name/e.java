package kotlin.reflect.jvm.internal.impl.name;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l0;
import kotlin.text.e0;

/* compiled from: FqNamesUtil.kt */
/* loaded from: classes5.dex */
public final class e {

    /* compiled from: FqNamesUtil.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25600a;

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
            f25600a = iArr;
        }
    }

    @d5.e
    public static final <V> V a(@d5.d c cVar, @d5.d Map<c, ? extends V> map) {
        Object next;
        l0.p(cVar, ProtectedSandApp.s("亄"));
        l0.p(map, ProtectedSandApp.s("亅"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<c, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            boolean z5 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<c, ? extends V> next2 = it.next();
            c key = next2.getKey();
            if (!l0.g(cVar, key) && !b(cVar, key)) {
                z5 = false;
            }
            if (z5) {
                linkedHashMap.put(next2.getKey(), next2.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).b().length();
                do {
                    Object next3 = it2.next();
                    int length2 = g((c) ((Map.Entry) next3).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next3;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (V) entry.getValue();
        }
        return null;
    }

    public static final boolean b(@d5.d c cVar, @d5.d c cVar2) {
        l0.p(cVar, ProtectedSandApp.s("了"));
        l0.p(cVar2, ProtectedSandApp.s("亇"));
        return l0.g(f(cVar), cVar2);
    }

    private static final boolean c(String str, String str2) {
        boolean s22;
        s22 = e0.s2(str, str2, false, 2, null);
        return s22 && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(@d5.d c cVar, @d5.d c cVar2) {
        l0.p(cVar, ProtectedSandApp.s("予"));
        l0.p(cVar2, ProtectedSandApp.s("争"));
        if (l0.g(cVar, cVar2) || cVar2.d()) {
            return true;
        }
        String b6 = cVar.b();
        l0.o(b6, ProtectedSandApp.s("亊"));
        String b7 = cVar2.b();
        l0.o(b7, ProtectedSandApp.s("事"));
        return c(b6, b7);
    }

    public static final boolean e(@d5.e String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.BEGINNING;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            int i6 = a.f25600a[kVar.ordinal()];
            if (i6 == 1 || i6 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                kVar = k.MIDDLE;
            } else if (i6 != 3) {
                continue;
            } else if (charAt == '.') {
                kVar = k.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        return kVar != k.AFTER_DOT;
    }

    @d5.e
    public static final c f(@d5.d c cVar) {
        l0.p(cVar, ProtectedSandApp.s("二"));
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    @d5.d
    public static final c g(@d5.d c cVar, @d5.d c cVar2) {
        l0.p(cVar, ProtectedSandApp.s("亍"));
        l0.p(cVar2, ProtectedSandApp.s("于"));
        if (!d(cVar, cVar2) || cVar2.d()) {
            return cVar;
        }
        if (l0.g(cVar, cVar2)) {
            c cVar3 = c.f25590c;
            l0.o(cVar3, ProtectedSandApp.s("亏"));
            return cVar3;
        }
        String b6 = cVar.b();
        l0.o(b6, ProtectedSandApp.s("亐"));
        String substring = b6.substring(cVar2.b().length() + 1);
        l0.o(substring, ProtectedSandApp.s("云"));
        return new c(substring);
    }
}
