package androidx.compose.runtime;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Composition.kt */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0014\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aK\u0010\u001f\u001a\u00020\u001e\"\b\b\u0000\u0010\u0019*\u00020\u0018\"\b\b\u0001\u0010\u001a*\u00020\u0018*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c0\u001b2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a>\u0010'\u001a\u00020\u001e\"\u0004\b\u0000\u0010!*\u0012\u0012\u0004\u0012\u00028\u00000\"j\b\u0012\u0004\u0012\u00028\u0000`#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020%0$H\u0082\b¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)\" \u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010.\"\u001e\u0010\u0013\u001a\u00020\u0012*\u00020\u000f8GX\u0087\u0004¢\u0006\f\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"T", "Landroidx/compose/runtime/y;", "Landroidx/compose/runtime/k0;", "key", "j", "(Landroidx/compose/runtime/y;Landroidx/compose/runtime/k0;)Ljava/lang/Object;", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/z;", "parent", "a", "(Landroidx/compose/runtime/e;Landroidx/compose/runtime/z;)Landroidx/compose/runtime/y;", "Landroidx/compose/runtime/r3;", "e", "(Landroidx/compose/runtime/e;Landroidx/compose/runtime/z;)Landroidx/compose/runtime/r3;", "Landroidx/compose/runtime/n0;", "c", "(Landroidx/compose/runtime/e;Landroidx/compose/runtime/z;)Landroidx/compose/runtime/n0;", "Lkotlin/coroutines/g;", "recomposeCoroutineContext", "b", "(Landroidx/compose/runtime/e;Landroidx/compose/runtime/z;Lkotlin/coroutines/g;)Landroidx/compose/runtime/y;", "d", "(Landroidx/compose/runtime/e;Landroidx/compose/runtime/z;Lkotlin/coroutines/g;)Landroidx/compose/runtime/n0;", "", "K", "V", "Landroidx/compose/runtime/collection/c;", "Landroidx/compose/runtime/collection/d;", "value", "Lkotlin/k2;", "h", "(Landroidx/compose/runtime/collection/c;Ljava/lang/Object;Ljava/lang/Object;)V", "E", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Lkotlin/Function1;", "", "predicate", "m", "(Ljava/util/HashSet;Lld/l;)V", "Ljava/lang/Object;", "PendingApplyNoModifications", "Landroidx/compose/runtime/b0;", "Landroidx/compose/runtime/k0;", "i", "()Landroidx/compose/runtime/k0;", "CompositionImplServiceKey", "k", "(Landroidx/compose/runtime/n0;)Lkotlin/coroutines/g;", "l", "(Landroidx/compose/runtime/n0;)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1381:1\n1#2:1382\n*E\n"})
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final Object f15978a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final k0<b0> f15979b = new a();

    /* compiled from: Composition.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/runtime/c0$a", "Landroidx/compose/runtime/k0;", "Landroidx/compose/runtime/b0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements k0<b0> {
        a() {
        }
    }

    @fg.l
    public static final y a(@fg.l e<?> eVar, @fg.l z zVar) {
        return new b0(zVar, eVar, null, 4, null);
    }

    @fg.l
    @c1
    public static final y b(@fg.l e<?> eVar, @fg.l z zVar, @fg.l kotlin.coroutines.g gVar) {
        return new b0(zVar, eVar, gVar);
    }

    @fg.l
    @fg.p
    public static final n0 c(@fg.l e<?> eVar, @fg.l z zVar) {
        return new b0(zVar, eVar, null, 4, null);
    }

    @fg.l
    @fg.p
    @c1
    public static final n0 d(@fg.l e<?> eVar, @fg.l z zVar, @fg.l kotlin.coroutines.g gVar) {
        return new b0(zVar, eVar, gVar);
    }

    @fg.l
    public static final r3 e(@fg.l e<?> eVar, @fg.l z zVar) {
        return new b0(zVar, eVar, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> void h(androidx.compose.runtime.collection.c<K, androidx.compose.runtime.collection.d<V>> cVar, K k4, V v4) {
        if (cVar.d(k4)) {
            androidx.compose.runtime.collection.d<V> h4 = cVar.h(k4);
            if (h4 != null) {
                h4.add(v4);
                return;
            }
            return;
        }
        androidx.compose.runtime.collection.d<V> dVar = new androidx.compose.runtime.collection.d<>();
        dVar.add(v4);
        kotlin.k2 k2Var = kotlin.k2.f75408a;
        cVar.q(k4, dVar);
    }

    @fg.l
    public static final k0<b0> i() {
        return f15979b;
    }

    @fg.m
    public static final <T> T j(@fg.l y yVar, @fg.l k0<T> k0Var) {
        l0 l0Var = yVar instanceof l0 ? (l0) yVar : null;
        if (l0Var != null) {
            return (T) l0Var.h(k0Var);
        }
        return null;
    }

    @fg.l
    @c1
    public static final kotlin.coroutines.g k(@fg.l n0 n0Var) {
        kotlin.coroutines.g R;
        b0 b0Var = n0Var instanceof b0 ? (b0) n0Var : null;
        return (b0Var == null || (R = b0Var.R()) == null) ? kotlin.coroutines.i.f75057b : R;
    }

    @c1
    public static /* synthetic */ void l(n0 n0Var) {
    }

    private static final <E> void m(HashSet<E> hashSet, ld.l<? super E, Boolean> lVar) {
        Iterator<E> it = hashSet.iterator();
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue()) {
                it.remove();
            }
        }
    }
}
