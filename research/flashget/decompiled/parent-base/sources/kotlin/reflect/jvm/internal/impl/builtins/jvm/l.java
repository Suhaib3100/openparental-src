package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.l1;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.a0;

/* compiled from: JvmBuiltInsSignatures.kt */
@r1({"SMAP\nJvmBuiltInsSignatures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmBuiltInsSignatures.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSignatures\n+ 2 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n13#2:205\n13#2:211\n13#2:217\n13#2:218\n13#2:219\n13#2:220\n13#2:221\n13#2:222\n1446#3,5:206\n1446#3,5:212\n*S KotlinDebug\n*F\n+ 1 JvmBuiltInsSignatures.kt\norg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsSignatures\n*L\n64#1:205\n177#1:211\n23#1:217\n71#1:218\n80#1:219\n136#1:220\n155#1:221\n172#1:222\n65#1:206,5\n181#1:212,5\n*E\n"})
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final l f75804a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final Set<String> f75805b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final Set<String> f75806c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final Set<String> f75807d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final Set<String> f75808e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final Set<String> f75809f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final Set<String> f75810g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final Set<String> f75811h;

    static {
        l lVar = new l();
        f75804a = lVar;
        a0 a0Var = a0.f76824a;
        String[] strArr = {ProtectedSandApp.s("榺\u0001"), ProtectedSandApp.s("榻\u0001")};
        String s4 = ProtectedSandApp.s("榼\u0001");
        f75805b = l1.D(a0Var.f(s4, strArr), ProtectedSandApp.s("榽\u0001"));
        Set<String> b5 = lVar.b();
        String s5 = ProtectedSandApp.s("榾\u0001");
        String s6 = ProtectedSandApp.s("榿\u0001");
        String s7 = ProtectedSandApp.s("槀\u0001");
        Set C = l1.C(b5, a0Var.f(s7, s6, s5));
        String[] strArr2 = {ProtectedSandApp.s("槃\u0001"), ProtectedSandApp.s("槄\u0001"), ProtectedSandApp.s("槅\u0001"), ProtectedSandApp.s("槆\u0001"), ProtectedSandApp.s("槇\u0001"), ProtectedSandApp.s("槈\u0001"), ProtectedSandApp.s("槉\u0001"), ProtectedSandApp.s("槊\u0001"), ProtectedSandApp.s("構\u0001"), ProtectedSandApp.s("槌\u0001"), ProtectedSandApp.s("槍\u0001"), ProtectedSandApp.s("槎\u0001"), ProtectedSandApp.s("槏\u0001"), ProtectedSandApp.s("槐\u0001"), ProtectedSandApp.s("槑\u0001"), ProtectedSandApp.s("槒\u0001"), ProtectedSandApp.s("槓\u0001"), ProtectedSandApp.s("槔\u0001"), ProtectedSandApp.s("槕\u0001"), ProtectedSandApp.s("槖\u0001"), ProtectedSandApp.s("槗\u0001"), ProtectedSandApp.s("様\u0001"), ProtectedSandApp.s("槙\u0001"), ProtectedSandApp.s("槚\u0001"), ProtectedSandApp.s("槛\u0001"), ProtectedSandApp.s("槜\u0001"), ProtectedSandApp.s("槝\u0001"), ProtectedSandApp.s("槞\u0001"), ProtectedSandApp.s("槟\u0001"), ProtectedSandApp.s("槠\u0001"), ProtectedSandApp.s("槡\u0001"), ProtectedSandApp.s("槢\u0001"), ProtectedSandApp.s("槣\u0001"), ProtectedSandApp.s("槤\u0001"), ProtectedSandApp.s("槥\u0001"), ProtectedSandApp.s("槦\u0001"), ProtectedSandApp.s("槧\u0001"), ProtectedSandApp.s("槨\u0001"), ProtectedSandApp.s("槩\u0001"), ProtectedSandApp.s("槪\u0001"), ProtectedSandApp.s("槫\u0001"), ProtectedSandApp.s("槬\u0001"), ProtectedSandApp.s("槭\u0001"), ProtectedSandApp.s("槮\u0001"), ProtectedSandApp.s("槯\u0001"), ProtectedSandApp.s("槰\u0001"), ProtectedSandApp.s("槁\u0001"), ProtectedSandApp.s("槂\u0001")};
        String s10 = ProtectedSandApp.s("槱\u0001");
        Set C2 = l1.C(C, a0Var.e(s10, strArr2));
        String s11 = ProtectedSandApp.s("槲\u0001");
        String s12 = ProtectedSandApp.s("槳\u0001");
        String s13 = ProtectedSandApp.s("槴\u0001");
        Set C3 = l1.C(C2, a0Var.e(s11, s12, s13));
        String[] strArr3 = {s12, s13};
        String s14 = ProtectedSandApp.s("槵\u0001");
        Set C4 = l1.C(l1.C(C3, a0Var.e(s14, strArr3)), a0Var.e(ProtectedSandApp.s("槸\u0001"), ProtectedSandApp.s("槶\u0001"), ProtectedSandApp.s("槷\u0001")));
        String[] strArr4 = {ProtectedSandApp.s("槗\u0001")};
        String s15 = ProtectedSandApp.s("槹\u0001");
        f75806c = l1.C(C4, a0Var.e(s15, strArr4));
        f75807d = a0Var.f(s7, ProtectedSandApp.s("槺\u0001"), ProtectedSandApp.s("槻\u0001"));
        Set C5 = l1.C(a0Var.e(s15, ProtectedSandApp.s("槼\u0001"), ProtectedSandApp.s("槽\u0001")), a0Var.f(ProtectedSandApp.s("槿\u0001"), ProtectedSandApp.s("槾\u0001")));
        String s16 = ProtectedSandApp.s("樀\u0001");
        String s17 = ProtectedSandApp.s("樁\u0001");
        Set C6 = l1.C(C5, a0Var.e(ProtectedSandApp.s("樂\u0001"), s16, s17));
        String[] strArr5 = {ProtectedSandApp.s("樅\u0001"), ProtectedSandApp.s("樆\u0001"), ProtectedSandApp.s("樇\u0001"), ProtectedSandApp.s("樈\u0001"), ProtectedSandApp.s("樉\u0001"), ProtectedSandApp.s("樊\u0001"), ProtectedSandApp.s("樋\u0001"), ProtectedSandApp.s("樌\u0001"), ProtectedSandApp.s("樃\u0001"), ProtectedSandApp.s("樄\u0001")};
        String s18 = ProtectedSandApp.s("樍\u0001");
        Set C7 = l1.C(C6, a0Var.e(s18, strArr5));
        String s19 = ProtectedSandApp.s("樎\u0001");
        String s20 = ProtectedSandApp.s("樏\u0001");
        String s21 = ProtectedSandApp.s("樐\u0001");
        Set C8 = l1.C(C7, a0Var.f(s4, s17, s19, s20, s21));
        String s22 = ProtectedSandApp.s("樑\u0001");
        String s23 = ProtectedSandApp.s("樒\u0001");
        String s24 = ProtectedSandApp.s("樓\u0001");
        Set C9 = l1.C(C8, a0Var.f(s7, s24, ProtectedSandApp.s("樔\u0001"), ProtectedSandApp.s("樕\u0001"), s22, s23));
        String[] strArr6 = {ProtectedSandApp.s("樘\u0001"), ProtectedSandApp.s("標\u0001"), ProtectedSandApp.s("樚\u0001"), ProtectedSandApp.s("樛\u0001"), ProtectedSandApp.s("樜\u0001"), ProtectedSandApp.s("樝\u0001"), ProtectedSandApp.s("樞\u0001"), ProtectedSandApp.s("樟\u0001"), ProtectedSandApp.s("樖\u0001"), ProtectedSandApp.s("樗\u0001")};
        String s25 = ProtectedSandApp.s("樠\u0001");
        f75808e = l1.C(C9, a0Var.f(s25, strArr6));
        f75809f = l1.C(l1.C(a0Var.f(s4, s21), a0Var.f(s7, s24, s6)), a0Var.f(s25, ProtectedSandApp.s("樖\u0001"), ProtectedSandApp.s("樜\u0001"), ProtectedSandApp.s("樗\u0001"), ProtectedSandApp.s("樛\u0001"), ProtectedSandApp.s("樝\u0001"), ProtectedSandApp.s("模\u0001"), ProtectedSandApp.s("樚\u0001"), ProtectedSandApp.s("樟\u0001"), ProtectedSandApp.s("樞\u0001")));
        Set<String> a5 = lVar.a();
        String[] b6 = a0Var.b(ProtectedSandApp.s("樢\u0001"));
        Set C10 = l1.C(a5, a0Var.e(s14, (String[]) Arrays.copyOf(b6, b6.length)));
        String[] b7 = a0Var.b(ProtectedSandApp.s("樥\u0001"), ProtectedSandApp.s("樦\u0001"), ProtectedSandApp.s("樧\u0001"), ProtectedSandApp.s("樨\u0001"), ProtectedSandApp.s("権\u0001"), ProtectedSandApp.s("横\u0001"), ProtectedSandApp.s("樫\u0001"), ProtectedSandApp.s("樬\u0001"), ProtectedSandApp.s("樭\u0001"), ProtectedSandApp.s("樣\u0001"), ProtectedSandApp.s("樤\u0001"));
        f75810g = l1.C(C10, a0Var.e(s10, (String[]) Arrays.copyOf(b7, b7.length)));
        String[] b10 = a0Var.b(ProtectedSandApp.s("樮\u0001"));
        f75811h = a0Var.e(s18, (String[]) Arrays.copyOf(b10, b10.length));
    }

    private l() {
    }

    private final Set<String> a() {
        a0 a0Var = a0.f76824a;
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BOOLEAN;
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BYTE;
        List O = w.O(eVar, eVar2, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.DOUBLE, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.FLOAT, eVar2, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.INT, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.LONG, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = O.iterator();
        while (it.hasNext()) {
            String b5 = ((kotlin.reflect.jvm.internal.impl.resolve.jvm.e) it.next()).getWrapperFqName().g().b();
            l0.o(b5, ProtectedSandApp.s("樯\u0001"));
            String[] b6 = a0Var.b(ProtectedSandApp.s("樰\u0001"));
            w.q0(linkedHashSet, a0Var.e(b5, (String[]) Arrays.copyOf(b6, b6.length)));
        }
        return linkedHashSet;
    }

    private final Set<String> b() {
        a0 a0Var = a0.f76824a;
        List<kotlin.reflect.jvm.internal.impl.resolve.jvm.e> O = w.O(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BOOLEAN, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar : O) {
            String b5 = eVar.getWrapperFqName().g().b();
            l0.o(b5, ProtectedSandApp.s("樯\u0001"));
            w.q0(linkedHashSet, a0Var.e(b5, eVar.getJavaKeywordName() + ProtectedSandApp.s("樱\u0001") + eVar.getDesc()));
        }
        return linkedHashSet;
    }

    @fg.l
    public final Set<String> c() {
        return f75807d;
    }

    @fg.l
    public final Set<String> d() {
        return f75805b;
    }

    @fg.l
    public final Set<String> e() {
        return f75810g;
    }

    @fg.l
    public final Set<String> f() {
        return f75806c;
    }

    @fg.l
    public final Set<String> g() {
        return f75809f;
    }

    @fg.l
    public final Set<String> h() {
        return f75811h;
    }

    @fg.l
    public final Set<String> i() {
        return f75808e;
    }

    public final boolean j(@fg.l kotlin.reflect.jvm.internal.impl.name.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("樲\u0001"));
        return l0.g(dVar, l.a.f75854i) || kotlin.reflect.jvm.internal.impl.builtins.l.e(dVar);
    }

    public final boolean k(@fg.l kotlin.reflect.jvm.internal.impl.name.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("樲\u0001"));
        if (j(dVar)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.name.b n4 = c.f75734a.n(dVar);
        if (n4 == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(n4.b().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
