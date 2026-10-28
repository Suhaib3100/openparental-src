package androidx.compose.runtime.saveable;

import androidx.compose.runtime.a3;
import androidx.compose.runtime.f0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;

/* compiled from: SaveableStateRegistry.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\"\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b8\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "Landroidx/compose/runtime/saveable/i;", "a", "(Ljava/util/Map;Lld/l;)Landroidx/compose/runtime/saveable/i;", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/a3;", "b", "()Landroidx/compose/runtime/a3;", "LocalSaveableStateRegistry", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final a3<i> f17009a = f0.f(a.f17010b);

    /* compiled from: SaveableStateRegistry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/runtime/saveable/i;", "a", "()Landroidx/compose/runtime/saveable/i;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<i> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17010b = new a(0);

        a() {
            super(0);
        }

        @fg.m
        public final i a() {
            return null;
        }

        @Override // ld.a
        public i invoke() {
            return null;
        }
    }

    @fg.l
    public static final i a(@fg.m Map<String, ? extends List<? extends Object>> map, @fg.l ld.l<Object, Boolean> lVar) {
        return new j(map, lVar);
    }

    @fg.l
    public static final a3<i> b() {
        return f17009a;
    }
}
