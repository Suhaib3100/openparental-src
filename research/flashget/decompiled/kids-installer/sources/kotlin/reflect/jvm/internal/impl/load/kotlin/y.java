package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;

/* compiled from: SignatureBuildingComponents.kt */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final y f25078a = new y();

    /* compiled from: SignatureBuildingComponents.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<String, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f25079p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("蘙"));
            return y.f25078a.c(str);
        }
    }

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return ProtectedSandApp.s("䳓") + str + ';';
    }

    @d5.d
    public final String[] b(@d5.d String... strArr) {
        l0.p(strArr, ProtectedSandApp.s("䳔"));
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ProtectedSandApp.s("䳕") + str + ProtectedSandApp.s("䳖"));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @d5.d
    public final Set<String> d(@d5.d String str, @d5.d String... strArr) {
        l0.p(str, ProtectedSandApp.s("䳗"));
        l0.p(strArr, ProtectedSandApp.s("䳘"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + org.apache.commons.io.k.f32026a + str2);
        }
        return linkedHashSet;
    }

    @d5.d
    public final Set<String> e(@d5.d String str, @d5.d String... strArr) {
        l0.p(str, ProtectedSandApp.s("䳙"));
        l0.p(strArr, ProtectedSandApp.s("䳚"));
        return d(h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @d5.d
    public final Set<String> f(@d5.d String str, @d5.d String... strArr) {
        l0.p(str, ProtectedSandApp.s("䳛"));
        l0.p(strArr, ProtectedSandApp.s("䳜"));
        return d(i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @d5.d
    public final String g(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("䳝"));
        return ProtectedSandApp.s("䳞") + str;
    }

    @d5.d
    public final String h(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("䳟"));
        return ProtectedSandApp.s("䳠") + str;
    }

    @d5.d
    public final String i(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("䳡"));
        return ProtectedSandApp.s("䳢") + str;
    }

    @d5.d
    public final String j(@d5.d String str, @d5.d List<String> list, @d5.d String str2) {
        String m32;
        l0.p(str, ProtectedSandApp.s("䳣"));
        l0.p(list, ProtectedSandApp.s("䳤"));
        l0.p(str2, ProtectedSandApp.s("䳥"));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        m32 = j0.m3(list, "", null, null, 0, null, a.f25079p, 30, null);
        sb.append(m32);
        sb.append(')');
        sb.append(c(str2));
        return sb.toString();
    }

    @d5.d
    public final String k(@d5.d String str, @d5.d String str2) {
        l0.p(str, ProtectedSandApp.s("䳦"));
        l0.p(str2, ProtectedSandApp.s("䳧"));
        return str + org.apache.commons.io.k.f32026a + str2;
    }
}
