package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: MemberScope.kt */
@r1({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n1#1,261:1\n223#2,2:262\n288#2,2:264\n766#2:271\n857#2,2:272\n206#3,5:266\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeKt\n*L\n71#1:262,2\n74#1:264,2\n87#1:271\n87#1:272,2\n77#1:266,5\n*E\n"})
/* loaded from: classes7.dex */
public final class j {
    @fg.m
    public static final Set<kotlin.reflect.jvm.internal.impl.name.f> a(@fg.l Iterable<? extends h> iterable) {
        l0.p(iterable, ProtectedSandApp.s("窟\u0001"));
        HashSet hashSet = new HashSet();
        Iterator<? extends h> it = iterable.iterator();
        while (it.hasNext()) {
            Set<kotlin.reflect.jvm.internal.impl.name.f> h4 = it.next().h();
            if (h4 == null) {
                return null;
            }
            w.q0(hashSet, h4);
        }
        return hashSet;
    }
}
