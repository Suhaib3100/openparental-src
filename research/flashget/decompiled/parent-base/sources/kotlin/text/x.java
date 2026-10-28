package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aL\u0010\u0016\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u000fH\u0082\b¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "marginPrefix", "q", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "newIndent", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "p", "(Ljava/lang/String;)Ljava/lang/String;", "l", "indent", "i", "", "h", "(Ljava/lang/String;)I", "Lkotlin/Function1;", "g", "(Ljava/lang/String;)Lld/l;", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "k", "(Ljava/util/List;ILld/l;Lld/l;)Ljava/lang/String;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,123:1\n113#1,2:125\n115#1,4:140\n120#1,2:153\n113#1,2:162\n115#1,4:177\n120#1,2:184\n1#2:124\n1#2:150\n1#2:181\n1#2:205\n1569#3,11:127\n1864#3,2:138\n1866#3:151\n1580#3:152\n766#3:155\n857#3,2:156\n1549#3:158\n1620#3,3:159\n1569#3,11:164\n1864#3,2:175\n1866#3:182\n1580#3:183\n1569#3,11:192\n1864#3,2:203\n1866#3:206\n1580#3:207\n151#4,6:144\n151#4,6:186\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n38#1:125,2\n38#1:140,4\n38#1:153,2\n78#1:162,2\n78#1:177,4\n78#1:184,2\n38#1:150\n78#1:181\n114#1:205\n38#1:127,11\n38#1:138,2\n38#1:151\n38#1:152\n74#1:155\n74#1:156,2\n75#1:158\n75#1:159,3\n78#1:164,11\n78#1:175,2\n78#1:182\n78#1:183\n114#1:192,11\n114#1:203,2\n114#1:206\n114#1:207\n39#1:144,6\n101#1:186,6\n*E\n"})
/* loaded from: classes7.dex */
public class x extends w {

    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<String, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f79194b = new a(1);

        a() {
            super(1);
        }

        @fg.l
        public final String a(@fg.l String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓿\u0001"));
            return str;
        }

        @Override // ld.l
        public String invoke(String str) {
            String str2 = str;
            kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蓿\u0001"));
            return str2;
        }
    }

    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<String, String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79195b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f79195b = str;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.l String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蔀\u0001"));
            return android.support.v4.media.c.a(new StringBuilder(), this.f79195b, str);
        }
    }

    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<String, String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f79196b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f79196b = str;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.l String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蔁\u0001"));
            return e0.S1(str) ? str.length() < this.f79196b.length() ? this.f79196b : str : android.support.v4.media.c.a(new StringBuilder(), this.f79196b, str);
        }
    }

    private static final ld.l<String, String> g(String str) {
        return str.length() == 0 ? a.f79194b : new b(str);
    }

    private static final int h(String str) {
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (!d.r(str.charAt(i4))) {
                break;
            }
            i4++;
        }
        return i4 == -1 ? str.length() : i4;
    }

    @fg.l
    public static final String i(@fg.l String str, @fg.l String str2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("荱\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("荲\u0001"));
        return kotlin.sequences.p.e1(kotlin.sequences.p.k1(h0.I3(str), new c(str2)), ProtectedSandApp.s("荳\u0001"), null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String j(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = ProtectedSandApp.s("荴\u0001");
        }
        return i(str, str2);
    }

    private static final String k(List<String> list, int i4, ld.l<? super String, String> lVar, ld.l<? super String, String> lVar2) {
        Appendable j32;
        String invoke;
        int J = kotlin.collections.w.J(list);
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException(ProtectedSandApp.s("荵\u0001"));
                }
                kotlin.collections.w.Z();
            }
            String str = (String) obj;
            if ((i5 == 0 || i5 == J) && e0.S1(str)) {
                str = null;
            } else {
                String invoke2 = lVar2.invoke(str);
                if (invoke2 != null && (invoke = lVar.invoke(invoke2)) != null) {
                    str = invoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i5 = i6;
        }
        j32 = kotlin.collections.g0.j3(arrayList, new StringBuilder(i4), (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : ProtectedSandApp.s("荳\u0001"), (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) j32).toString();
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("荶\u0001"));
        return sb;
    }

    @fg.l
    public static final String l(@fg.l String str, @fg.l String str2) {
        Appendable j32;
        String invoke;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("荱\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("荷\u0001"));
        List<String> J3 = h0.J3(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : J3) {
            if (!e0.S1((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(h((String) it.next())));
        }
        Integer num = (Integer) kotlin.collections.w.h4(arrayList2);
        int i4 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int a5 = androidx.content.preferences.protobuf.n.a(J3, str2.length(), str.length());
        ld.l<String, String> g4 = g(str2);
        int J = kotlin.collections.w.J(J3);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : J3) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            String str3 = (String) obj2;
            if ((i4 == 0 || i4 == J) && e0.S1(str3)) {
                str3 = null;
            } else {
                String y6 = j0.y6(str3, intValue);
                if (y6 != null && (invoke = g4.invoke(y6)) != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i4 = i5;
        }
        j32 = kotlin.collections.g0.j3(arrayList3, new StringBuilder(a5), (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : ProtectedSandApp.s("荳\u0001"), (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) j32).toString();
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("荶\u0001"));
        return sb;
    }

    public static /* synthetic */ String m(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = "";
        }
        return l(str, str2);
    }

    @fg.l
    public static final String n(@fg.l String str, @fg.l String str2, @fg.l String str3) {
        Appendable j32;
        int i4;
        String invoke;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("荱\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("荷\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("荸\u0001"));
        if (e0.S1(str3)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("荻\u0001"));
        }
        List<String> J3 = h0.J3(str);
        int a5 = androidx.content.preferences.protobuf.n.a(J3, str2.length(), str.length());
        ld.l<String, String> g4 = g(str2);
        int J = kotlin.collections.w.J(J3);
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (Object obj : J3) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.w.Z();
            }
            String str4 = (String) obj;
            String str5 = null;
            if ((i5 == 0 || i5 == J) && e0.S1(str4)) {
                str4 = null;
            } else {
                int length = str4.length();
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        i4 = -1;
                        break;
                    }
                    if (!d.r(str4.charAt(i7))) {
                        i4 = i7;
                        break;
                    }
                    i7++;
                }
                if (i4 != -1) {
                    int i10 = i4;
                    if (e0.r2(str4, str3, i4, false, 4, null)) {
                        int length2 = str3.length() + i10;
                        kotlin.jvm.internal.l0.n(str4, ProtectedSandApp.s("荹\u0001"));
                        str5 = str4.substring(length2);
                        kotlin.jvm.internal.l0.o(str5, ProtectedSandApp.s("荺\u0001"));
                    }
                }
                if (str5 != null && (invoke = g4.invoke(str5)) != null) {
                    str4 = invoke;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i5 = i6;
        }
        j32 = kotlin.collections.g0.j3(arrayList, new StringBuilder(a5), (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : ProtectedSandApp.s("荳\u0001"), (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : null);
        String sb = ((StringBuilder) j32).toString();
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("荶\u0001"));
        return sb;
    }

    public static /* synthetic */ String o(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = "";
        }
        if ((i4 & 2) != 0) {
            str3 = ProtectedSandApp.s("荼\u0001");
        }
        return n(str, str2, str3);
    }

    @fg.l
    @kotlin.internal.g
    public static String p(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("荱\u0001"));
        return l(str, "");
    }

    @fg.l
    @kotlin.internal.g
    public static final String q(@fg.l String str, @fg.l String str2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("荱\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("荸\u0001"));
        return n(str, "", str2);
    }

    public static /* synthetic */ String r(String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str2 = ProtectedSandApp.s("荼\u0001");
        }
        return q(str, str2);
    }
}
