package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.i0;
import androidx.compose.ui.text.font.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.z0;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "Landroidx/compose/ui/text/font/x;", "Landroidx/compose/ui/text/font/q1;", "typefaceRequest", "Landroidx/compose/ui/text/font/o;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/u0;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/q0;", "b", "(Ljava/util/List;Landroidx/compose/ui/text/font/q1;Landroidx/compose/ui/text/font/o;Landroidx/compose/ui/text/font/u0;Lld/l;)Lkotlin/q0;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n420#2:433\n421#2,9:435\n420#2:444\n421#2,7:446\n428#2,2:454\n26#3:434\n26#3:445\n1#4:453\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n189#1:433\n189#1:435,9\n205#1:444\n205#1:446,7\n205#1:454,2\n189#1:434\n205#1:445\n*E\n"})
/* loaded from: classes.dex */
public final class h0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.q0<List<x>, Object> b(List<? extends x> list, q1 q1Var, o oVar, u0 u0Var, ld.l<? super q1, ? extends Object> lVar) {
        androidx.compose.ui.text.platform.z zVar;
        androidx.compose.ui.text.caches.b bVar;
        Object a5;
        x xVar;
        androidx.compose.ui.text.caches.c cVar;
        androidx.compose.ui.text.platform.z zVar2;
        androidx.compose.ui.text.caches.b bVar2;
        Object a6;
        x xVar2;
        androidx.compose.ui.text.caches.c cVar2;
        int size = list.size();
        List list2 = null;
        for (int i4 = 0; i4 < size; i4++) {
            x xVar3 = list.get(i4);
            int loadingStrategy = xVar3.getLoadingStrategy();
            i0.Companion companion = i0.INSTANCE;
            companion.getClass();
            if (i0.g(loadingStrategy, i0.f20743c)) {
                zVar = oVar.cacheLock;
                synchronized (zVar) {
                    try {
                        o.b bVar3 = new o.b(xVar3, u0Var.getCacheKey());
                        bVar = oVar.resultCache;
                        o.a aVar = (o.a) bVar.g(bVar3);
                        if (aVar == null) {
                            cVar = oVar.permanentCache;
                            aVar = (o.a) cVar.e(bVar3);
                        }
                        if (aVar != null) {
                            a5 = aVar.i();
                            xVar = xVar3;
                        } else {
                            k2 k2Var = k2.f75408a;
                            try {
                                a5 = u0Var.a(xVar3);
                                xVar = xVar3;
                                o.f(oVar, xVar3, u0Var, a5, false, 8, null);
                            } catch (Exception e4) {
                                throw new IllegalStateException("Unable to load font " + xVar3, e4);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (a5 != null) {
                    return new kotlin.q0<>(list2, m0.a(q1Var.j(), a5, xVar, q1Var.k(), q1Var.i()));
                }
                throw new IllegalStateException("Unable to load font " + xVar);
            }
            companion.getClass();
            if (i0.g(loadingStrategy, i0.f20744d)) {
                zVar2 = oVar.cacheLock;
                synchronized (zVar2) {
                    try {
                        o.b bVar4 = new o.b(xVar3, u0Var.getCacheKey());
                        bVar2 = oVar.resultCache;
                        o.a aVar2 = (o.a) bVar2.g(bVar4);
                        if (aVar2 == null) {
                            cVar2 = oVar.permanentCache;
                            aVar2 = (o.a) cVar2.e(bVar4);
                        }
                        if (aVar2 != null) {
                            a6 = aVar2.i();
                            xVar2 = xVar3;
                        } else {
                            k2 k2Var2 = k2.f75408a;
                            try {
                                z0.Companion companion2 = kotlin.z0.INSTANCE;
                                a6 = kotlin.z0.b(u0Var.a(xVar3));
                            } catch (Throwable th2) {
                                z0.Companion companion3 = kotlin.z0.INSTANCE;
                                a6 = kotlin.a1.a(th2);
                            }
                            if (kotlin.z0.i(a6)) {
                                a6 = null;
                            }
                            xVar2 = xVar3;
                            o.f(oVar, xVar3, u0Var, a6, false, 8, null);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (a6 != null) {
                    return new kotlin.q0<>(list2, m0.a(q1Var.j(), a6, xVar2, q1Var.k(), q1Var.i()));
                }
            } else {
                companion.getClass();
                if (!i0.g(loadingStrategy, i0.f20745e)) {
                    throw new IllegalStateException("Unknown font type " + xVar3);
                }
                o.a d5 = oVar.d(xVar3, u0Var);
                if (d5 == null) {
                    if (list2 == null) {
                        list2 = kotlin.collections.w.S(xVar3);
                    } else {
                        list2.add(xVar3);
                    }
                } else if (d5.i() != null && d5.i() != null) {
                    return new kotlin.q0<>(list2, m0.a(q1Var.j(), d5.i(), xVar3, q1Var.k(), q1Var.i()));
                }
            }
        }
        return new kotlin.q0<>(list2, lVar.invoke(q1Var));
    }
}
