package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: SignatureBuildingComponents.kt */
@r1({"SMAP\nSignatureBuildingComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponents\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,39:1\n11065#2:40\n11400#2,3:41\n11400#2,3:46\n37#3,2:44\n*S KotlinDebug\n*F\n+ 1 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponents\n*L\n20#1:40\n20#1:41,3\n25#1:46,3\n20#1:44,2\n*E\n"})
/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final a0 f76824a = new a0();

    /* compiled from: SignatureBuildingComponents.kt */
    static final class a extends n0 implements ld.l<String, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76825b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("獞\u0001"));
            return a0.f76824a.c(str);
        }
    }

    private a0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return ProtectedSandApp.s("獟\u0001") + str + ';';
    }

    @fg.l
    public final String[] b(@fg.l String... strArr) {
        l0.p(strArr, ProtectedSandApp.s("獠\u0001"));
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ProtectedSandApp.s("獡\u0001") + str + ProtectedSandApp.s("獢\u0001"));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @fg.l
    public final Set<String> d(@fg.l String str, @fg.l String... strArr) {
        l0.p(str, ProtectedSandApp.s("獣\u0001"));
        l0.p(strArr, ProtectedSandApp.s("獠\u0001"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    @fg.l
    public final Set<String> e(@fg.l String str, @fg.l String... strArr) {
        l0.p(str, ProtectedSandApp.s("獤\u0001"));
        l0.p(strArr, ProtectedSandApp.s("獠\u0001"));
        return d(h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fg.l
    public final Set<String> f(@fg.l String str, @fg.l String... strArr) {
        l0.p(str, ProtectedSandApp.s("獤\u0001"));
        l0.p(strArr, ProtectedSandApp.s("獠\u0001"));
        return d(i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @fg.l
    public final String g(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("獤\u0001"));
        return ProtectedSandApp.s("獥\u0001") + str;
    }

    @fg.l
    public final String h(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("獤\u0001"));
        return ProtectedSandApp.s("獦\u0001") + str;
    }

    @fg.l
    public final String i(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("獤\u0001"));
        return ProtectedSandApp.s("獧\u0001") + str;
    }

    @fg.l
    public final String j(@fg.l String str, @fg.l List<String> list, @fg.l String str2) {
        l0.p(str, ProtectedSandApp.s("獤\u0001"));
        l0.p(list, ProtectedSandApp.s("獨\u0001"));
        l0.p(str2, ProtectedSandApp.s("獩\u0001"));
        return str + '(' + kotlin.collections.w.m3(list, "", null, null, 0, null, a.f76825b, 30, null) + ')' + c(str2);
    }

    @fg.l
    public final String k(@fg.l String str, @fg.l String str2) {
        l0.p(str, ProtectedSandApp.s("獣\u0001"));
        l0.p(str2, ProtectedSandApp.s("獪\u0001"));
        return str + '.' + str2;
    }
}
