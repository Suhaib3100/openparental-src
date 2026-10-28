package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.a0;
import kotlin.collections.f0;
import kotlin.collections.r1;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.y;

/* compiled from: JvmBuiltInsSignatures.kt */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final k f24008a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Set<String> f24009b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final Set<String> f24010c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final Set<String> f24011d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final Set<String> f24012e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final Set<String> f24013f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final Set<String> f24014g;

    static {
        Set<String> D;
        Set C;
        Set C2;
        Set C3;
        Set C4;
        Set C5;
        Set<String> C6;
        Set C7;
        Set C8;
        Set C9;
        Set C10;
        Set C11;
        Set<String> C12;
        Set C13;
        Set<String> C14;
        Set C15;
        Set<String> C16;
        k kVar = new k();
        f24008a = kVar;
        y yVar = y.f25078a;
        String[] strArr = {ProtectedSandApp.s("䖘"), ProtectedSandApp.s("䖙")};
        String s5 = ProtectedSandApp.s("䖚");
        D = r1.D(yVar.f(s5, strArr), ProtectedSandApp.s("䖛"));
        f24009b = D;
        Set<String> b6 = kVar.b();
        String s6 = ProtectedSandApp.s("䖜");
        String s7 = ProtectedSandApp.s("䖝");
        C = r1.C(b6, yVar.f(s7, s6));
        String[] strArr2 = {ProtectedSandApp.s("䖞"), ProtectedSandApp.s("䖟"), ProtectedSandApp.s("䖠"), ProtectedSandApp.s("䖡"), ProtectedSandApp.s("䖢"), ProtectedSandApp.s("䖣"), ProtectedSandApp.s("䖤"), ProtectedSandApp.s("䖥"), ProtectedSandApp.s("䖦"), ProtectedSandApp.s("䖧"), ProtectedSandApp.s("䖨"), ProtectedSandApp.s("䖩"), ProtectedSandApp.s("䖪"), ProtectedSandApp.s("䖫"), ProtectedSandApp.s("䖬"), ProtectedSandApp.s("䖭"), ProtectedSandApp.s("䖮"), ProtectedSandApp.s("䖯"), ProtectedSandApp.s("䖰"), ProtectedSandApp.s("䖱"), ProtectedSandApp.s("䖲"), ProtectedSandApp.s("䖳"), ProtectedSandApp.s("䖴"), ProtectedSandApp.s("䖵"), ProtectedSandApp.s("䖶"), ProtectedSandApp.s("䖷"), ProtectedSandApp.s("䖸"), ProtectedSandApp.s("䖹"), ProtectedSandApp.s("䖺"), ProtectedSandApp.s("䖻"), ProtectedSandApp.s("䖼"), ProtectedSandApp.s("䖽"), ProtectedSandApp.s("䖾"), ProtectedSandApp.s("䖿"), ProtectedSandApp.s("䗀"), ProtectedSandApp.s("䗁"), ProtectedSandApp.s("䗂"), ProtectedSandApp.s("䗃"), ProtectedSandApp.s("䗄"), ProtectedSandApp.s("䗅"), ProtectedSandApp.s("䗆"), ProtectedSandApp.s("䗇"), ProtectedSandApp.s("䗈"), ProtectedSandApp.s("䗉"), ProtectedSandApp.s("䗊"), ProtectedSandApp.s("䗋"), ProtectedSandApp.s("䗌"), ProtectedSandApp.s("䗍")};
        String s8 = ProtectedSandApp.s("䗎");
        C2 = r1.C(C, yVar.e(s8, strArr2));
        String s9 = ProtectedSandApp.s("䗏");
        String s10 = ProtectedSandApp.s("䗐");
        C3 = r1.C(C2, yVar.e(ProtectedSandApp.s("䗑"), s9, s10));
        String[] strArr3 = {s9, s10};
        String s11 = ProtectedSandApp.s("䗒");
        C4 = r1.C(C3, yVar.e(s11, strArr3));
        C5 = r1.C(C4, yVar.e(ProtectedSandApp.s("䗕"), ProtectedSandApp.s("䗓"), ProtectedSandApp.s("䗔")));
        String[] strArr4 = {ProtectedSandApp.s("䗖")};
        String s12 = ProtectedSandApp.s("䗗");
        C6 = r1.C(C5, yVar.e(s12, strArr4));
        f24010c = C6;
        C7 = r1.C(yVar.e(s12, ProtectedSandApp.s("䗘"), ProtectedSandApp.s("䗙")), yVar.f(ProtectedSandApp.s("䗛"), ProtectedSandApp.s("䗚")));
        String s13 = ProtectedSandApp.s("䗜");
        String s14 = ProtectedSandApp.s("䗝");
        C8 = r1.C(C7, yVar.e(ProtectedSandApp.s("䗞"), s13, s14));
        String[] strArr5 = {ProtectedSandApp.s("䗟"), ProtectedSandApp.s("䗠"), ProtectedSandApp.s("䗡"), ProtectedSandApp.s("䗢"), ProtectedSandApp.s("䗣"), ProtectedSandApp.s("䗤"), ProtectedSandApp.s("䗥"), ProtectedSandApp.s("䗦"), ProtectedSandApp.s("䗧"), ProtectedSandApp.s("䗨")};
        String s15 = ProtectedSandApp.s("䗩");
        C9 = r1.C(C8, yVar.e(s15, strArr5));
        String s16 = ProtectedSandApp.s("䗪");
        String s17 = ProtectedSandApp.s("䗫");
        String s18 = ProtectedSandApp.s("䗬");
        C10 = r1.C(C9, yVar.f(s5, s14, s16, s17, s18));
        String s19 = ProtectedSandApp.s("䗭");
        C11 = r1.C(C10, yVar.f(s7, s19));
        String[] strArr6 = {ProtectedSandApp.s("䗮"), ProtectedSandApp.s("䗯"), ProtectedSandApp.s("䗰"), ProtectedSandApp.s("䗱"), ProtectedSandApp.s("䗲"), ProtectedSandApp.s("䗳"), ProtectedSandApp.s("䗴"), ProtectedSandApp.s("䗵"), ProtectedSandApp.s("䗶"), ProtectedSandApp.s("䗷")};
        String s20 = ProtectedSandApp.s("䗸");
        C12 = r1.C(C11, yVar.f(s20, strArr6));
        f24011d = C12;
        C13 = r1.C(yVar.f(s5, s18), yVar.f(s7, s19, s6));
        C14 = r1.C(C13, yVar.f(s20, ProtectedSandApp.s("䗹"), ProtectedSandApp.s("䗺"), ProtectedSandApp.s("䗻"), ProtectedSandApp.s("䗼"), ProtectedSandApp.s("䗽"), ProtectedSandApp.s("䗾"), ProtectedSandApp.s("䗿"), ProtectedSandApp.s("䘀"), ProtectedSandApp.s("䘁")));
        f24012e = C14;
        Set<String> a6 = kVar.a();
        String[] b7 = yVar.b(ProtectedSandApp.s("䘂"));
        C15 = r1.C(a6, yVar.e(s11, (String[]) Arrays.copyOf(b7, b7.length)));
        String[] b8 = yVar.b(ProtectedSandApp.s("䘃"), ProtectedSandApp.s("䘄"), ProtectedSandApp.s("䘅"), ProtectedSandApp.s("䘆"), ProtectedSandApp.s("䘇"), ProtectedSandApp.s("䘈"), ProtectedSandApp.s("䘉"), ProtectedSandApp.s("䘊"), ProtectedSandApp.s("䘋"), ProtectedSandApp.s("䘌"), ProtectedSandApp.s("䘍"));
        C16 = r1.C(C15, yVar.e(s8, (String[]) Arrays.copyOf(b8, b8.length)));
        f24013f = C16;
        String[] b9 = yVar.b(ProtectedSandApp.s("䘎"));
        f24014g = yVar.e(s15, (String[]) Arrays.copyOf(b9, b9.length));
    }

    private k() {
    }

    private final Set<String> a() {
        List O;
        y yVar = y.f25078a;
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BYTE;
        O = a0.O(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BOOLEAN, eVar, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.DOUBLE, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.FLOAT, eVar, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.INT, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.LONG, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = O.iterator();
        while (it.hasNext()) {
            String h5 = ((kotlin.reflect.jvm.internal.impl.resolve.jvm.e) it.next()).getWrapperFqName().g().h();
            l0.o(h5, ProtectedSandApp.s("䘏"));
            String[] b6 = yVar.b(ProtectedSandApp.s("䘐"));
            f0.q0(linkedHashSet, yVar.e(h5, (String[]) Arrays.copyOf(b6, b6.length)));
        }
        return linkedHashSet;
    }

    private final Set<String> b() {
        List<kotlin.reflect.jvm.internal.impl.resolve.jvm.e> O;
        y yVar = y.f25078a;
        O = a0.O(kotlin.reflect.jvm.internal.impl.resolve.jvm.e.BOOLEAN, kotlin.reflect.jvm.internal.impl.resolve.jvm.e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar : O) {
            String h5 = eVar.getWrapperFqName().g().h();
            l0.o(h5, ProtectedSandApp.s("䘑"));
            f0.q0(linkedHashSet, yVar.e(h5, eVar.getJavaKeywordName() + ProtectedSandApp.s("䘒") + eVar.getDesc()));
        }
        return linkedHashSet;
    }

    @d5.d
    public final Set<String> c() {
        return f24009b;
    }

    @d5.d
    public final Set<String> d() {
        return f24013f;
    }

    @d5.d
    public final Set<String> e() {
        return f24010c;
    }

    @d5.d
    public final Set<String> f() {
        return f24012e;
    }

    @d5.d
    public final Set<String> g() {
        return f24014g;
    }

    @d5.d
    public final Set<String> h() {
        return f24011d;
    }

    public final boolean i(@d5.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("䘓"));
        return l0.g(dVar, l.a.f24057i) || kotlin.reflect.jvm.internal.impl.builtins.l.e(dVar);
    }

    public final boolean j(@d5.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("䘔"));
        if (i(dVar)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.name.b n5 = c.f23942a.n(dVar);
        if (n5 == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(n5.b().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
