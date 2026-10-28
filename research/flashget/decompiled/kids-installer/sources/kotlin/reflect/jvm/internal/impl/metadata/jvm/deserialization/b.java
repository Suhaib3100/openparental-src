package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a0;
import kotlin.collections.j0;
import kotlin.internal.n;
import kotlin.jvm.internal.l0;
import kotlin.text.Typography;
import kotlin.text.e0;
import org.apache.commons.io.k;

/* compiled from: ClassMapperLite.kt */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final b f25553a = new b();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final String f25554b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final Map<String, String> f25555c;

    static {
        List O;
        String m32;
        List O2;
        List<String> O3;
        List<String> O4;
        List<String> O5;
        O = a0.O('k', 'o', 't', 'l', 'i', 'n');
        m32 = j0.m3(O, "", null, null, 0, null, null, 62, null);
        f25554b = m32;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        O2 = a0.O(ProtectedSandApp.s("䶑"), ProtectedSandApp.s("䶒"), ProtectedSandApp.s("䶓"), ProtectedSandApp.s("䶔"), ProtectedSandApp.s("䶕"), ProtectedSandApp.s("䶖"), ProtectedSandApp.s("䶗"), ProtectedSandApp.s("䶘"), ProtectedSandApp.s("䶙"), ProtectedSandApp.s("䶚"), ProtectedSandApp.s("䶛"), ProtectedSandApp.s("䶜"), ProtectedSandApp.s("䶝"), ProtectedSandApp.s("䶞"), ProtectedSandApp.s("䶟"), ProtectedSandApp.s("䶠"));
        int c6 = n.c(0, O2.size() - 1, 2);
        if (c6 >= 0) {
            int i5 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f25554b;
                sb.append(str);
                sb.append(org.apache.commons.io.n.f32060b);
                sb.append((String) O2.get(i5));
                int i6 = i5 + 1;
                linkedHashMap.put(sb.toString(), O2.get(i6));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(org.apache.commons.io.n.f32060b);
                linkedHashMap.put(androidx.concurrent.futures.a.a(sb2, (String) O2.get(i5), ProtectedSandApp.s("䶡")), ProtectedSandApp.s("䶢") + ((String) O2.get(i6)));
                if (i5 == c6) {
                    break;
                } else {
                    i5 += 2;
                }
            }
        }
        linkedHashMap.put(f25554b + ProtectedSandApp.s("䶣"), ProtectedSandApp.s("䶤"));
        a(linkedHashMap, ProtectedSandApp.s("䶥"), ProtectedSandApp.s("䶦"));
        a(linkedHashMap, ProtectedSandApp.s("䶧"), ProtectedSandApp.s("䶨"));
        a(linkedHashMap, ProtectedSandApp.s("䶩"), ProtectedSandApp.s("䶪"));
        O3 = a0.O(ProtectedSandApp.s("䶫"), ProtectedSandApp.s("䶬"), ProtectedSandApp.s("䶭"), ProtectedSandApp.s("䶮"), ProtectedSandApp.s("䶯"), ProtectedSandApp.s("䶰"), ProtectedSandApp.s("䶱"));
        for (String str2 : O3) {
            a(linkedHashMap, str2, androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("䶲"), str2));
        }
        O4 = a0.O(ProtectedSandApp.s("䶳"), ProtectedSandApp.s("䶴"), ProtectedSandApp.s("䶵"), ProtectedSandApp.s("䶶"), ProtectedSandApp.s("䶷"), ProtectedSandApp.s("䶸"));
        for (String str3 : O4) {
            String a6 = androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("䶹"), str3);
            String s5 = ProtectedSandApp.s("䶺");
            a(linkedHashMap, a6, androidx.constraintlayout.motion.widget.g.a(s5, str3));
            a(linkedHashMap, androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("䶻"), str3), androidx.constraintlayout.motion.widget.g.a(s5, str3));
        }
        String s6 = ProtectedSandApp.s("䶼");
        String s7 = ProtectedSandApp.s("䶽");
        a(linkedHashMap, s6, s7);
        a(linkedHashMap, ProtectedSandApp.s("䶾"), s7);
        String s8 = ProtectedSandApp.s("䶿");
        String s9 = ProtectedSandApp.s("䷀");
        a(linkedHashMap, s8, s9);
        a(linkedHashMap, ProtectedSandApp.s("䷁"), s9);
        for (int i7 = 0; i7 < 23; i7++) {
            String a7 = s.a(ProtectedSandApp.s("䷂"), i7);
            StringBuilder sb3 = new StringBuilder();
            String str4 = f25554b;
            sb3.append(str4);
            sb3.append(ProtectedSandApp.s("䷃"));
            sb3.append(i7);
            a(linkedHashMap, a7, sb3.toString());
            a(linkedHashMap, s.a(ProtectedSandApp.s("䷄"), i7), androidx.concurrent.futures.b.a(str4, ProtectedSandApp.s("䷅")));
        }
        O5 = a0.O(ProtectedSandApp.s("䷆"), ProtectedSandApp.s("䷇"), ProtectedSandApp.s("䷈"), ProtectedSandApp.s("䷉"), ProtectedSandApp.s("䷊"), ProtectedSandApp.s("䷋"), ProtectedSandApp.s("䷌"), ProtectedSandApp.s("䷍"), ProtectedSandApp.s("䷎"));
        for (String str5 : O5) {
            a(linkedHashMap, androidx.concurrent.futures.b.a(str5, ProtectedSandApp.s("䷏")), f25554b + ProtectedSandApp.s("䷐") + str5 + ProtectedSandApp.s("䷑"));
        }
        f25555c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(f25554b + org.apache.commons.io.n.f32060b + str, ProtectedSandApp.s("䷒") + str2 + ';');
    }

    @d5.d
    @p3.n
    public static final String b(@d5.d String str) {
        String h22;
        l0.p(str, ProtectedSandApp.s("䷓"));
        String str2 = f25555c.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䷔"));
        h22 = e0.h2(str, k.f32026a, Typography.f27127c, false, 4, null);
        return c1.c.a(sb, h22, ';');
    }
}
