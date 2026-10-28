package androidx.compose.foundation.pager;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* compiled from: PagerState.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@z0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/pager/d0;", "Landroidx/compose/foundation/pager/c0;", "", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "updatedPageCount", "<init>", "(IFLld/a;)V", "Landroidx/compose/runtime/k2;", "I", "Landroidx/compose/runtime/k2;", "E0", "()Landroidx/compose/runtime/k2;", "F0", "(Landroidx/compose/runtime/k2;)V", "pageCountState", "K", "()I", "pageCount", "J", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 extends c0 {
    public static final int K = 0;

    /* renamed from: I, reason: from kotlin metadata */
    @fg.l
    private k2<ld.a<Integer>> pageCountState;

    /* renamed from: J, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    @fg.l
    private static final androidx.compose.runtime.saveable.l<d0, ?> L = androidx.compose.runtime.saveable.a.a(a.f6768b, b.f6769b);

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/foundation/pager/d0;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/pager/d0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.p<androidx.compose.runtime.saveable.n, d0, List<? extends Object>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f6768b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l d0 d0Var) {
            return kotlin.collections.w.O(Integer.valueOf(d0Var.y()), Float.valueOf(d0Var.z()), Integer.valueOf(d0Var.K()));
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/foundation/pager/d0;", "a", "(Ljava/util/List;)Landroidx/compose/foundation/pager/d0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<List, d0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f6769b = new b(1);

        /* compiled from: PagerState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.a<Integer> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<Object> f6770b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<? extends Object> list) {
                super(0);
                this.f6770b = list;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                Object obj = this.f6770b.get(2);
                l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            }
        }

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0 invoke(@fg.l List<? extends Object> list) {
            Object obj = list.get(0);
            l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            l0.n(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new d0(intValue, ((Float) obj2).floatValue(), new a(list));
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/pager/d0$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/pager/d0;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.pager.d0$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<d0, ?> a() {
            return d0.L;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public d0(int i4, float f4, @fg.l ld.a<Integer> aVar) {
        super(i4, f4);
        k2<ld.a<Integer>> g4;
        g4 = t4.g(aVar, null, 2, null);
        this.pageCountState = g4;
    }

    @fg.l
    public final k2<ld.a<Integer>> E0() {
        return this.pageCountState;
    }

    public final void F0(@fg.l k2<ld.a<Integer>> k2Var) {
        this.pageCountState = k2Var;
    }

    @Override // androidx.compose.foundation.pager.c0
    public int K() {
        return this.pageCountState.getValue().invoke().intValue();
    }
}
