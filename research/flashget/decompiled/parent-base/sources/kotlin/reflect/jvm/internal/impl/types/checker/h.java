package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: KotlinTypeRefiner.kt */
@r1({"SMAP\nKotlinTypeRefiner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypeRefiner.kt\norg/jetbrains/kotlin/types/checker/KotlinTypeRefinerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1549#2:91\n1620#2,3:92\n*S KotlinDebug\n*F\n+ 1 KotlinTypeRefiner.kt\norg/jetbrains/kotlin/types/checker/KotlinTypeRefinerKt\n*L\n78#1:91\n78#1:92,3\n*E\n"})
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final g0<p<x>> f78352a = new g0<>(ProtectedSandApp.s("絲\u0001"));

    @fg.l
    public static final g0<p<x>> a() {
        return f78352a;
    }

    @fg.l
    public static final List<h0> b(@fg.l g gVar, @fg.l Iterable<? extends h0> iterable) {
        l0.p(gVar, ProtectedSandApp.s("絳\u0001"));
        l0.p(iterable, ProtectedSandApp.s("絴\u0001"));
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(iterable, 10));
        Iterator<? extends h0> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a(it.next()));
        }
        return arrayList;
    }
}
