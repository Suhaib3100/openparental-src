package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LazyStaggeredGridDsl.kt */
@c0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001JQ\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH&¢\u0006\u0004\b\f\u0010\rJ¿\u0001\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062%\b\u0002\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000621\u0010\u0014\u001a-\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u0013¢\u0006\u0002\b\t¢\u0006\u0002\b\nH&¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0001\u0001\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/b0;", "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/n0;", "span", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/p;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "r", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/n0;Lld/q;)V", "", "count", "Lkotlin/r0;", "name", "index", "Lkotlin/Function2;", "itemContent", "o", "(ILld/l;Lld/l;Lld/l;Lld/r;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/i;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface b0 {

    /* compiled from: LazyStaggeredGridDsl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final a f6252b = new a(1);

        a() {
            super(1);
        }

        @fg.m
        public final Void a(int i4) {
            return null;
        }

        @Override // ld.l
        public Object invoke(Object obj) {
            ((Number) obj).intValue();
            return null;
        }
    }

    static /* synthetic */ void b(b0 b0Var, int i4, ld.l lVar, ld.l lVar2, ld.l lVar3, ld.r rVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        ld.l lVar4 = (i5 & 2) != 0 ? null : lVar;
        if ((i5 & 4) != 0) {
            lVar2 = a.f6252b;
        }
        b0Var.o(i4, lVar4, lVar2, (i5 & 8) != 0 ? null : lVar3, rVar);
    }

    static /* synthetic */ void n(b0 b0Var, Object obj, Object obj2, n0 n0Var, ld.q qVar, int i4, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i4 & 1) != 0) {
            obj = null;
        }
        if ((i4 & 2) != 0) {
            obj2 = null;
        }
        if ((i4 & 4) != 0) {
            n0Var = null;
        }
        b0Var.r(obj, obj2, n0Var, qVar);
    }

    void o(int count, @fg.m ld.l<? super Integer, ? extends Object> key, @fg.l ld.l<? super Integer, ? extends Object> contentType, @fg.m ld.l<? super Integer, n0> span, @fg.l ld.r<? super p, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> itemContent);

    void r(@fg.m Object key, @fg.m Object contentType, @fg.m n0 span, @fg.l ld.q<? super p, ? super androidx.compose.runtime.t, ? super Integer, k2> content);
}
