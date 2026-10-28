package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.text.e0;

/* compiled from: RenderingUtils.kt */
/* loaded from: classes5.dex */
public final class n {
    @d5.d
    public static final String a(@d5.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("兇"));
        List<kotlin.reflect.jvm.internal.impl.name.f> h5 = dVar.h();
        l0.o(h5, ProtectedSandApp.s("先"));
        return c(h5);
    }

    @d5.d
    public static final String b(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("光"));
        boolean e6 = e(fVar);
        String s5 = ProtectedSandApp.s("兊");
        if (!e6) {
            String h5 = fVar.h();
            l0.o(h5, s5);
            return h5;
        }
        StringBuilder sb = new StringBuilder();
        String h6 = fVar.h();
        l0.o(h6, s5);
        sb.append(ProtectedSandApp.s("克") + h6);
        sb.append('`');
        return sb.toString();
    }

    @d5.d
    public static final String c(@d5.d List<kotlin.reflect.jvm.internal.impl.name.f> list) {
        l0.p(list, ProtectedSandApp.s("兌"));
        StringBuilder sb = new StringBuilder();
        for (kotlin.reflect.jvm.internal.impl.name.f fVar : list) {
            if (sb.length() > 0) {
                sb.append(ProtectedSandApp.s("免"));
            }
            sb.append(b(fVar));
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("兎"));
        return sb2;
    }

    @d5.e
    public static final String d(@d5.d String str, @d5.d String str2, @d5.d String str3, @d5.d String str4, @d5.d String str5) {
        boolean s22;
        boolean s23;
        l0.p(str, ProtectedSandApp.s("兏"));
        l0.p(str2, ProtectedSandApp.s("児"));
        l0.p(str3, ProtectedSandApp.s("兑"));
        l0.p(str4, ProtectedSandApp.s("兒"));
        l0.p(str5, ProtectedSandApp.s("兓"));
        s22 = e0.s2(str, str2, false, 2, null);
        if (s22) {
            s23 = e0.s2(str3, str4, false, 2, null);
            if (s23) {
                String substring = str.substring(str2.length());
                String s5 = ProtectedSandApp.s("兔");
                l0.o(substring, s5);
                String substring2 = str3.substring(str4.length());
                l0.o(substring2, s5);
                String a6 = androidx.concurrent.futures.b.a(str5, substring);
                if (l0.g(substring, substring2)) {
                    return a6;
                }
                if (f(substring, substring2)) {
                    return a6 + '!';
                }
            }
        }
        return null;
    }

    private static final boolean e(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        boolean z5;
        String h5 = fVar.h();
        l0.o(h5, ProtectedSandApp.s("兕"));
        if (i.f25877a.contains(h5)) {
            return true;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= h5.length()) {
                z5 = false;
                break;
            }
            char charAt = h5.charAt(i5);
            if ((Character.isLetterOrDigit(charAt) || charAt == '_') ? false : true) {
                z5 = true;
                break;
            }
            i5++;
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        if (kotlin.jvm.internal.l0.g(r7 + '?', r8) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(@d5.d java.lang.String r7, @d5.d java.lang.String r8) {
        /*
            java.lang.String r0 = "兖"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "兗"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r2 = "兘"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            java.lang.String r3 = ""
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r8
            java.lang.String r0 = kotlin.text.v.i2(r1, r2, r3, r4, r5, r6)
            boolean r0 = kotlin.jvm.internal.l0.g(r7, r0)
            if (r0 != 0) goto L6f
            r0 = 2
            r1 = 0
            java.lang.String r2 = "兙"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r3 = 0
            boolean r0 = kotlin.text.v.J1(r8, r2, r3, r0, r1)
            if (r0 == 0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r1 = 63
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = kotlin.jvm.internal.l0.g(r0, r8)
            if (r0 != 0) goto L6f
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "党"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = "兛"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            boolean r7 = kotlin.jvm.internal.l0.g(r7, r8)
            if (r7 == 0) goto L70
        L6f:
            r3 = 1
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.n.f(java.lang.String, java.lang.String):boolean");
    }
}
