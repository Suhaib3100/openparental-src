package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.h0;

/* compiled from: KotlinTypeRefiner.kt */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final g0<p<x>> f26344a = new g0<>(ProtectedSandApp.s("喝"));

    @d5.d
    public static final g0<p<x>> a() {
        return f26344a;
    }

    @d5.d
    public static final List<h0> b(@d5.d g gVar, @d5.d Iterable<? extends h0> iterable) {
        int b02;
        l0.p(gVar, ProtectedSandApp.s("喞"));
        l0.p(iterable, ProtectedSandApp.s("喟"));
        b02 = b0.b0(iterable, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<? extends h0> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(gVar.a(it.next()));
        }
        return arrayList;
    }
}
