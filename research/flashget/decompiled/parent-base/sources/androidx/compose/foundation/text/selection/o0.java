package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.a3;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SelectionRegistrar.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/selection/l0;", "", "selectableId", "", "b", "(Landroidx/compose/foundation/text/selection/l0;J)Z", "Landroidx/compose/runtime/a3;", "a", "Landroidx/compose/runtime/a3;", "()Landroidx/compose/runtime/a3;", "LocalSelectionRegistrar", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final a3<l0> f8079a = androidx.compose.runtime.f0.e(null, a.f8080b, 1, null);

    /* compiled from: SelectionRegistrar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/l0;", "a", "()Landroidx/compose/foundation/text/selection/l0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<l0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f8080b = new a(0);

        a() {
            super(0);
        }

        @fg.m
        public final l0 a() {
            return null;
        }

        @Override // ld.a
        public l0 invoke() {
            return null;
        }
    }

    @fg.l
    public static final a3<l0> a() {
        return f8079a;
    }

    public static final boolean b(@fg.m l0 l0Var, long j4) {
        Map<Long, q> b5;
        if (l0Var == null || (b5 = l0Var.b()) == null) {
            return false;
        }
        return b5.containsKey(Long.valueOf(j4));
    }
}
