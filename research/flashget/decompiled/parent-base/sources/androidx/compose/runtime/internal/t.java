package androidx.compose.runtime.internal;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.d0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.h;
import androidx.compose.runtime.t2;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;
import kotlin.q0;

/* compiled from: PersistentCompositionLocalMap.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a[\u0010\n\u001a\u00020\t2J\u0010\b\u001a&\u0012\"\b\u0001\u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00070\u00040\u0003\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00070\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/internal/s;", "b", "()Landroidx/compose/runtime/internal/s;", "", "Lkotlin/q0;", "Landroidx/compose/runtime/d0;", "", "Landroidx/compose/runtime/b5;", "pairs", "Landroidx/compose/runtime/t2;", "a", "([Lkotlin/q0;)Landroidx/compose/runtime/t2;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPersistentCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n+ 2 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n*L\n1#1,85:1\n75#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n*L\n84#1:86\n*E\n"})
/* loaded from: classes.dex */
public final class t {
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.t2] */
    @fg.l
    public static final t2 a(@fg.l q0<? extends d0<Object>, ? extends b5<? extends Object>>... q0VarArr) {
        s.INSTANCE.getClass();
        h.a<d0<Object>, b5<? extends Object>> g4 = s.f16802l.g();
        z0.y0(g4, q0VarArr);
        return g4.a2();
    }

    @fg.l
    public static final s b() {
        s.INSTANCE.getClass();
        return s.f16802l;
    }
}
