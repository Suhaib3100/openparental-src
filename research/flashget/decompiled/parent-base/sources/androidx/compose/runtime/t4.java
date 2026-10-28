package androidx.compose.runtime;

import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotState.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0086\n¢\u0006\u0004\b\f\u0010\r\u001a>\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0001\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0014\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aS\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001c2*\u0010!\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0\u0014\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0007¢\u0006\u0004\b\"\u0010#\u001a;\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001c*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0$¢\u0006\u0004\b%\u0010&\u001a#\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010'\u001a\u00028\u0000H\u0007¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"T", "value", "Landroidx/compose/runtime/m4;", "policy", "Landroidx/compose/runtime/k2;", "f", "(Ljava/lang/Object;Landroidx/compose/runtime/m4;)Landroidx/compose/runtime/k2;", "Landroidx/compose/runtime/b5;", "", "thisObj", "Lkotlin/reflect/o;", "property", "a", "(Landroidx/compose/runtime/b5;Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;", "Lkotlin/k2;", "i", "(Landroidx/compose/runtime/k2;Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V", "Landroidx/compose/runtime/snapshots/b0;", "b", "()Landroidx/compose/runtime/snapshots/b0;", "", "elements", "c", "([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/b0;", "", "j", "(Ljava/util/Collection;)Landroidx/compose/runtime/snapshots/b0;", "K", "V", "Landroidx/compose/runtime/snapshots/d0;", "d", "()Landroidx/compose/runtime/snapshots/d0;", "Lkotlin/q0;", "pairs", "e", "([Lkotlin/q0;)Landroidx/compose/runtime/snapshots/d0;", "", "k", "(Ljava/lang/Iterable;)Landroidx/compose/runtime/snapshots/d0;", "newValue", "h", "(Ljava/lang/Object;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
@kotlin.jvm.internal.r1({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,307:1\n1#2:308\n25#3:309\n1116#4,6:310\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n304#1:309\n304#1:310,6\n*E\n"})
/* loaded from: classes.dex */
public final /* synthetic */ class t4 {
    public static final <T> T a(@fg.l b5<? extends T> b5Var, @fg.m Object obj, @fg.l kotlin.reflect.o<?> oVar) {
        return b5Var.getValue();
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <T> androidx.compose.runtime.snapshots.b0<T> b() {
        return new androidx.compose.runtime.snapshots.b0<>();
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <T> androidx.compose.runtime.snapshots.b0<T> c(@fg.l T... tArr) {
        androidx.compose.runtime.snapshots.b0<T> b0Var = new androidx.compose.runtime.snapshots.b0<>();
        b0Var.addAll(kotlin.collections.l.Ky(tArr));
        return b0Var;
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <K, V> androidx.compose.runtime.snapshots.d0<K, V> d() {
        return new androidx.compose.runtime.snapshots.d0<>();
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <K, V> androidx.compose.runtime.snapshots.d0<K, V> e(@fg.l kotlin.q0<? extends K, ? extends V>... q0VarArr) {
        androidx.compose.runtime.snapshots.d0<K, V> d0Var = new androidx.compose.runtime.snapshots.d0<>();
        d0Var.putAll(kotlin.collections.z0.H0(q0VarArr));
        return d0Var;
    }

    @androidx.compose.runtime.snapshots.j0
    @fg.l
    public static final <T> k2<T> f(T t4, @fg.l m4<T> m4Var) {
        return b.e(t4, m4Var);
    }

    public static k2 g(Object obj, m4 m4Var, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            m4Var = s4.c();
        }
        return b.e(obj, m4Var);
    }

    @fg.l
    @i
    public static final <T> b5<T> h(T t4, @fg.m t tVar, int i4) {
        tVar.P(-1058319986);
        if (x.b0()) {
            x.r0(-1058319986, i4, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:303)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        if (Q == t.INSTANCE.a()) {
            Q = g(t4, null, 2, null);
            tVar.E(Q);
        }
        tVar.p0();
        k2 k2Var = (k2) Q;
        k2Var.setValue(t4);
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return k2Var;
    }

    public static final <T> void i(@fg.l k2<T> k2Var, @fg.m Object obj, @fg.l kotlin.reflect.o<?> oVar, T t4) {
        k2Var.setValue(t4);
    }

    @fg.l
    public static final <T> androidx.compose.runtime.snapshots.b0<T> j(@fg.l Collection<? extends T> collection) {
        androidx.compose.runtime.snapshots.b0<T> b0Var = new androidx.compose.runtime.snapshots.b0<>();
        b0Var.addAll(collection);
        return b0Var;
    }

    @fg.l
    public static final <K, V> androidx.compose.runtime.snapshots.d0<K, V> k(@fg.l Iterable<? extends kotlin.q0<? extends K, ? extends V>> iterable) {
        androidx.compose.runtime.snapshots.d0<K, V> d0Var = new androidx.compose.runtime.snapshots.d0<>();
        d0Var.putAll(kotlin.collections.z0.B0(iterable));
        return d0Var;
    }
}
