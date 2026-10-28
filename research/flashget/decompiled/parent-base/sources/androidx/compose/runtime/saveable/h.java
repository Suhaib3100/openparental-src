package androidx.compose.runtime.saveable;

import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: SaveableStateHolder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/saveable/f;", "a", "(Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/saveable/f;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,142:1\n74#2:143\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n*L\n65#1:143\n*E\n"})
/* loaded from: classes.dex */
public final class h {

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/runtime/saveable/g;", "a", "()Landroidx/compose/runtime/saveable/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<g> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17002b = new a(0);

        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g(null, 1, null);
        }
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final f a(@fg.m t tVar, int i4) {
        tVar.P(15454635);
        if (x.b0()) {
            x.r0(15454635, i4, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:59)");
        }
        g.INSTANCE.getClass();
        g gVar = (g) d.d(new Object[0], g.f16981e, null, a.f17002b, tVar, 3080, 4);
        gVar.i((i) tVar.x(k.b()));
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return gVar;
    }
}
