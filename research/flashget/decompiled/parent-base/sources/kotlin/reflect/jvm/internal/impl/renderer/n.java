package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.text.v;

/* compiled from: RenderingUtils.kt */
@r1({"SMAP\nRenderingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,78:1\n1083#2,2:79\n*S KotlinDebug\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n*L\n30#1:79,2\n*E\n"})
/* loaded from: classes7.dex */
public final class n {
    @fg.l
    public static final String a(@fg.l kotlin.reflect.jvm.internal.impl.name.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("硤\u0001"));
        List<kotlin.reflect.jvm.internal.impl.name.f> h4 = dVar.h();
        l0.o(h4, ProtectedSandApp.s("硥\u0001"));
        return c(h4);
    }

    @fg.l
    public static final String b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("硤\u0001"));
        boolean e4 = e(fVar);
        String s4 = ProtectedSandApp.s("硦\u0001");
        if (!e4) {
            String b5 = fVar.b();
            l0.o(b5, s4);
            return b5;
        }
        StringBuilder sb = new StringBuilder();
        String b6 = fVar.b();
        l0.o(b6, s4);
        sb.append(ProtectedSandApp.s("硧\u0001") + b6);
        sb.append('`');
        return sb.toString();
    }

    @fg.l
    public static final String c(@fg.l List<kotlin.reflect.jvm.internal.impl.name.f> list) {
        l0.p(list, ProtectedSandApp.s("硨\u0001"));
        StringBuilder sb = new StringBuilder();
        for (kotlin.reflect.jvm.internal.impl.name.f fVar : list) {
            if (sb.length() > 0) {
                sb.append(ProtectedSandApp.s("硩\u0001"));
            }
            sb.append(b(fVar));
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("硪\u0001"));
        return sb2;
    }

    @fg.m
    public static final String d(@fg.l String str, @fg.l String str2, @fg.l String str3, @fg.l String str4, @fg.l String str5) {
        l0.p(str, ProtectedSandApp.s("硫\u0001"));
        l0.p(str2, ProtectedSandApp.s("硬\u0001"));
        l0.p(str3, ProtectedSandApp.s("硭\u0001"));
        l0.p(str4, ProtectedSandApp.s("确\u0001"));
        l0.p(str5, ProtectedSandApp.s("硯\u0001"));
        if (v.s2(str, str2, false, 2, null) && v.s2(str3, str4, false, 2, null)) {
            String substring = str.substring(str2.length());
            String s4 = ProtectedSandApp.s("硰\u0001");
            l0.o(substring, s4);
            String substring2 = str3.substring(str4.length());
            l0.o(substring2, s4);
            String a5 = androidx.compose.runtime.changelist.j.a(str5, substring);
            if (l0.g(substring, substring2)) {
                return a5;
            }
            if (f(substring, substring2)) {
                return a5 + '!';
            }
        }
        return null;
    }

    private static final boolean e(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        String b5 = fVar.b();
        l0.o(b5, ProtectedSandApp.s("硦\u0001"));
        if (!i.f77858a.contains(b5)) {
            int i4 = 0;
            while (true) {
                if (i4 < b5.length()) {
                    char charAt = b5.charAt(i4);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                        break;
                    }
                    i4++;
                } else if (b5.length() != 0 && Character.isJavaIdentifierStart(b5.codePointAt(0))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        if (kotlin.jvm.internal.l0.g(r7 + '?', r8) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(@fg.l java.lang.String r7, @fg.l java.lang.String r8) {
        /*
            java.lang.String r0 = "硱\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "硲\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r8, r0)
            r5 = 4
            r6 = 0
            java.lang.String r2 = "硳\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            java.lang.String r3 = ""
            r4 = 0
            r1 = r8
            java.lang.String r0 = kotlin.text.v.i2(r1, r2, r3, r4, r5, r6)
            boolean r0 = kotlin.jvm.internal.l0.g(r7, r0)
            if (r0 != 0) goto L6f
            r0 = 2
            r1 = 0
            java.lang.String r2 = "硳\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
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
            java.lang.String r1 = "硴\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = "硵\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
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
