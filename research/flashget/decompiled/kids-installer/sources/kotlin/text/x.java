package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Indent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\f\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,123:1\n113#1,2:125\n115#1,4:140\n120#1,2:153\n113#1,2:162\n115#1,4:177\n120#1,2:184\n1#2:124\n1#2:150\n1#2:181\n1#2:205\n1569#3,11:127\n1864#3,2:138\n1866#3:151\n1580#3:152\n766#3:155\n857#3,2:156\n1549#3:158\n1620#3,3:159\n1569#3,11:164\n1864#3,2:175\n1866#3:182\n1580#3:183\n1569#3,11:192\n1864#3,2:203\n1866#3:206\n1580#3:207\n151#4,6:144\n151#4,6:186\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n38#1:125,2\n38#1:140,4\n38#1:153,2\n78#1:162,2\n78#1:177,4\n78#1:184,2\n38#1:150\n78#1:181\n114#1:205\n38#1:127,11\n38#1:138,2\n38#1:151\n38#1:152\n74#1:155\n74#1:156,2\n75#1:158\n75#1:159,3\n78#1:164,11\n78#1:175,2\n78#1:182\n78#1:183\n114#1:192,11\n114#1:203,2\n114#1:206\n114#1:207\n39#1:144,6\n101#1:186,6\n*E\n"})
/* loaded from: classes5.dex */
public class x extends w {

    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<String, String> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f27181p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        public String N(String str) {
            String str2 = str;
            kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("連"));
            return str2;
        }

        @d5.d
        public final String a(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("逤"));
            return str;
        }
    }

    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<String, String> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f27182p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f27182p = str;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String N(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("逥"));
            return androidx.concurrent.futures.a.a(new StringBuilder(), this.f27182p, str);
        }
    }

    /* compiled from: Indent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<String, String> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f27183p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f27183p = str;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String N(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("逦"));
            return e0.S1(str) ? str.length() < this.f27183p.length() ? this.f27183p : str : androidx.concurrent.futures.a.a(new StringBuilder(), this.f27183p, str);
        }
    }

    private static final q3.l<String, String> g(String str) {
        return str.length() == 0 ? a.f27181p : new b(str);
    }

    private static final int h(String str) {
        int length = str.length();
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (!d.r(str.charAt(i5))) {
                break;
            }
            i5++;
        }
        return i5 == -1 ? str.length() : i5;
    }

    @d5.d
    public static final String i(@d5.d String str, @d5.d String str2) {
        Sequence k12;
        String e12;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("寛"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("寜"));
        k12 = kotlin.sequences.v.k1(h0.I3(str), new c(str2));
        e12 = kotlin.sequences.v.e1(k12, ProtectedSandApp.s("寝"), null, null, 0, null, null, 62, null);
        return e12;
    }

    public static /* synthetic */ String j(String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str2 = ProtectedSandApp.s("寞");
        }
        return i(str, str2);
    }

    private static final String k(List<String> list, int i5, q3.l<? super String, String> lVar, q3.l<? super String, String> lVar2) {
        int J;
        String N;
        J = kotlin.collections.a0.J(list);
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        for (Object obj : list) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                if (!kotlin.internal.m.a(1, 3, 0)) {
                    throw new ArithmeticException(ProtectedSandApp.s("察"));
                }
                kotlin.collections.a0.Z();
            }
            String str = (String) obj;
            if ((i6 == 0 || i6 == J) && e0.S1(str)) {
                str = null;
            } else {
                String N2 = lVar2.N(str);
                if (N2 != null && (N = lVar.N(N2)) != null) {
                    str = N;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i6 = i7;
        }
        String sb = ((StringBuilder) kotlin.collections.y.k3(arrayList, new StringBuilder(i5), ProtectedSandApp.s("寠"), null, null, 0, null, null, 124, null)).toString();
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("寡"));
        return sb;
    }

    @d5.d
    public static final String l(@d5.d String str, @d5.d String str2) {
        int b02;
        Comparable h42;
        int J;
        String N;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("寢"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("寣"));
        List<String> J3 = h0.J3(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : J3) {
            if (!e0.S1((String) obj)) {
                arrayList.add(obj);
            }
        }
        b02 = kotlin.collections.b0.b0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(b02);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(h((String) it.next())));
        }
        h42 = kotlin.collections.j0.h4(arrayList2);
        Integer num = (Integer) h42;
        int i5 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int size = (J3.size() * str2.length()) + str.length();
        q3.l<String, String> g5 = g(str2);
        J = kotlin.collections.a0.J(J3);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : J3) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.a0.Z();
            }
            String str3 = (String) obj2;
            if ((i5 == 0 || i5 == J) && e0.S1(str3)) {
                str3 = null;
            } else {
                String y6 = j0.y6(str3, intValue);
                if (y6 != null && (N = g5.N(y6)) != null) {
                    str3 = N;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i5 = i6;
        }
        String sb = ((StringBuilder) kotlin.collections.y.k3(arrayList3, new StringBuilder(size), ProtectedSandApp.s("寤"), null, null, 0, null, null, 124, null)).toString();
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("寥"));
        return sb;
    }

    public static /* synthetic */ String m(String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str2 = "";
        }
        return l(str, str2);
    }

    @d5.d
    public static final String n(@d5.d String str, @d5.d String str2, @d5.d String str3) {
        int J;
        int i5;
        String N;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("實"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("寧"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("寨"));
        if (!(!e0.S1(str3))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("寭").toString());
        }
        List<String> J3 = h0.J3(str);
        int size = (J3.size() * str2.length()) + str.length();
        q3.l<String, String> g5 = g(str2);
        J = kotlin.collections.a0.J(J3);
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        for (Object obj : J3) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                kotlin.collections.a0.Z();
            }
            String str4 = (String) obj;
            String str5 = null;
            if ((i6 == 0 || i6 == J) && e0.S1(str4)) {
                str4 = null;
            } else {
                int length = str4.length();
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        i5 = -1;
                        break;
                    }
                    if (!d.r(str4.charAt(i8))) {
                        i5 = i8;
                        break;
                    }
                    i8++;
                }
                if (i5 != -1) {
                    int i9 = i5;
                    if (e0.r2(str4, str3, i5, false, 4, null)) {
                        int length2 = str3.length() + i9;
                        kotlin.jvm.internal.l0.n(str4, ProtectedSandApp.s("審"));
                        str5 = str4.substring(length2);
                        kotlin.jvm.internal.l0.o(str5, ProtectedSandApp.s("寪"));
                    }
                }
                if (str5 != null && (N = g5.N(str5)) != null) {
                    str4 = N;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i6 = i7;
        }
        String sb = ((StringBuilder) kotlin.collections.y.k3(arrayList, new StringBuilder(size), ProtectedSandApp.s("寫"), null, null, 0, null, null, 124, null)).toString();
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("寬"));
        return sb;
    }

    public static /* synthetic */ String o(String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str2 = "";
        }
        if ((i5 & 2) != 0) {
            str3 = ProtectedSandApp.s("寮");
        }
        return n(str, str2, str3);
    }

    @IntrinsicConstEvaluation
    @d5.d
    public static String p(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("寯"));
        return l(str, "");
    }

    @IntrinsicConstEvaluation
    @d5.d
    public static final String q(@d5.d String str, @d5.d String str2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("寰"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("寱"));
        return n(str, "", str2);
    }

    public static /* synthetic */ String r(String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str2 = ProtectedSandApp.s("寲");
        }
        return q(str, str2);
    }
}
