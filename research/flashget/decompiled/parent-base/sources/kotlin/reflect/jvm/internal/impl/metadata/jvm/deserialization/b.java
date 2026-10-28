package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.w;
import kotlin.internal.n;
import kotlin.jvm.internal.l0;
import kotlin.text.v;

/* compiled from: ClassMapperLite.kt */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b f77534a = new b();

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final String f77535b = w.m3(w.O('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final Map<String, String> f77536c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List O = w.O(ProtectedSandApp.s("畓\u0001"), ProtectedSandApp.s("畔\u0001"), ProtectedSandApp.s("畕\u0001"), ProtectedSandApp.s("畖\u0001"), ProtectedSandApp.s("畗\u0001"), ProtectedSandApp.s("畘\u0001"), ProtectedSandApp.s("留\u0001"), ProtectedSandApp.s("畚\u0001"), ProtectedSandApp.s("畛\u0001"), ProtectedSandApp.s("畜\u0001"), ProtectedSandApp.s("畝\u0001"), ProtectedSandApp.s("畞\u0001"), ProtectedSandApp.s("畟\u0001"), ProtectedSandApp.s("畠\u0001"), ProtectedSandApp.s("畑\u0001"), ProtectedSandApp.s("畒\u0001"));
        int c5 = n.c(0, O.size() - 1, 2);
        if (c5 >= 0) {
            int i4 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f77535b;
                sb.append(str);
                sb.append('/');
                sb.append((String) O.get(i4));
                int i5 = i4 + 1;
                linkedHashMap.put(sb.toString(), O.get(i5));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(android.support.v4.media.c.a(sb2, (String) O.get(i4), ProtectedSandApp.s("畡\u0001")), ProtectedSandApp.s("畢\u0001") + ((String) O.get(i5)));
                if (i4 == c5) {
                    break;
                } else {
                    i4 += 2;
                }
            }
        }
        linkedHashMap.put(f77535b + ProtectedSandApp.s("畣\u0001"), ProtectedSandApp.s("畤\u0001"));
        a(linkedHashMap, ProtectedSandApp.s("略\u0001"), ProtectedSandApp.s("畦\u0001"));
        a(linkedHashMap, ProtectedSandApp.s("畧\u0001"), ProtectedSandApp.s("畨\u0001"));
        a(linkedHashMap, ProtectedSandApp.s("畩\u0001"), ProtectedSandApp.s("番\u0001"));
        for (String str2 : w.O(ProtectedSandApp.s("畭\u0001"), ProtectedSandApp.s("畮\u0001"), ProtectedSandApp.s("畯\u0001"), ProtectedSandApp.s("異\u0001"), ProtectedSandApp.s("畱\u0001"), ProtectedSandApp.s("畫\u0001"), ProtectedSandApp.s("畬\u0001"))) {
            a(linkedHashMap, str2, androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("畲\u0001"), str2));
        }
        for (String str3 : w.O(ProtectedSandApp.s("畵\u0001"), ProtectedSandApp.s("當\u0001"), ProtectedSandApp.s("畷\u0001"), ProtectedSandApp.s("畸\u0001"), ProtectedSandApp.s("畳\u0001"), ProtectedSandApp.s("畴\u0001"))) {
            String a5 = androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("畹\u0001"), str3);
            String s4 = ProtectedSandApp.s("畺\u0001");
            a(linkedHashMap, a5, androidx.constraintlayout.core.motion.key.c.a(s4, str3));
            a(linkedHashMap, androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("畻\u0001"), str3), androidx.constraintlayout.core.motion.key.c.a(s4, str3));
        }
        String s5 = ProtectedSandApp.s("畼\u0001");
        String s6 = ProtectedSandApp.s("畽\u0001");
        a(linkedHashMap, s5, s6);
        a(linkedHashMap, ProtectedSandApp.s("畾\u0001"), s6);
        String s7 = ProtectedSandApp.s("畿\u0001");
        String s10 = ProtectedSandApp.s("疀\u0001");
        a(linkedHashMap, s7, s10);
        a(linkedHashMap, ProtectedSandApp.s("疁\u0001"), s10);
        for (int i6 = 0; i6 < 23; i6++) {
            String a6 = android.support.v4.media.a.a(ProtectedSandApp.s("疂\u0001"), i6);
            StringBuilder sb3 = new StringBuilder();
            String str4 = f77535b;
            sb3.append(str4);
            sb3.append(ProtectedSandApp.s("疃\u0001"));
            sb3.append(i6);
            a(linkedHashMap, a6, sb3.toString());
            a(linkedHashMap, android.support.v4.media.a.a(ProtectedSandApp.s("疄\u0001"), i6), androidx.compose.runtime.changelist.j.a(str4, ProtectedSandApp.s("疅\u0001")));
        }
        for (String str5 : w.O(ProtectedSandApp.s("畕\u0001"), ProtectedSandApp.s("畗\u0001"), ProtectedSandApp.s("留\u0001"), ProtectedSandApp.s("畛\u0001"), ProtectedSandApp.s("畝\u0001"), ProtectedSandApp.s("畟\u0001"), ProtectedSandApp.s("畑\u0001"), ProtectedSandApp.s("畭\u0001"), ProtectedSandApp.s("畬\u0001"))) {
            a(linkedHashMap, androidx.compose.runtime.changelist.j.a(str5, ProtectedSandApp.s("疆\u0001")), androidx.fragment.app.c.a(new StringBuilder(), f77535b, ProtectedSandApp.s("疇\u0001"), str5, ProtectedSandApp.s("疈\u0001")));
        }
        f77536c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(f77535b + '/' + str, ProtectedSandApp.s("疉\u0001") + str2 + ';');
    }

    @l
    @kd.n
    public static final String b(@l String str) {
        l0.p(str, ProtectedSandApp.s("疊\u0001"));
        String str2 = f77536c.get(str);
        return str2 == null ? f3.a(new StringBuilder(ProtectedSandApp.s("疉\u0001")), v.h2(str, '.', '$', false, 4, null), ';') : str2;
    }
}
