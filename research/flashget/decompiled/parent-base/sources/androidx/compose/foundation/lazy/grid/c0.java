package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.k2;

/* compiled from: LazyGridDsl.kt */
@d0
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001Jb\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\r\u0010\u000eJÊ\u0001\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000320\b\u0002\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014¢\u0006\u0002\b\u00062%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000321\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0001\u0001\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/c0;", "", "key", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/s;", "Landroidx/compose/foundation/lazy/grid/b;", "Lkotlin/u;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/q;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "t", "(Ljava/lang/Object;Lld/l;Ljava/lang/Object;Lld/q;)V", "", "count", "Lkotlin/r0;", "name", "index", "Lkotlin/Function2;", "itemContent", "m", "(ILld/l;Lld/p;Lld/l;Lld/r;)V", "Landroidx/compose/foundation/lazy/grid/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5595b = new a(1);

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

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void c(c0 c0Var, Object obj, ld.l lVar, Object obj2, ld.q qVar, int i4, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i4 & 1) != 0) {
            obj = null;
        }
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        if ((i4 & 4) != 0) {
            obj2 = null;
        }
        c0Var.t(obj, lVar, obj2, qVar);
    }

    static /* synthetic */ void f(c0 c0Var, int i4, ld.l lVar, ld.p pVar, ld.l lVar2, ld.r rVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        ld.l lVar3 = (i5 & 2) != 0 ? null : lVar;
        ld.p pVar2 = (i5 & 4) != 0 ? null : pVar;
        if ((i5 & 8) != 0) {
            lVar2 = a.f5595b;
        }
        c0Var.m(i4, lVar3, pVar2, lVar2, rVar);
    }

    void m(int count, @fg.m ld.l<? super Integer, ? extends Object> key, @fg.m ld.p<? super s, ? super Integer, b> span, @fg.l ld.l<? super Integer, ? extends Object> contentType, @fg.l ld.r<? super q, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> itemContent);

    void t(@fg.m Object key, @fg.m ld.l<? super s, b> span, @fg.m Object contentType, @fg.l ld.q<? super q, ? super androidx.compose.runtime.t, ? super Integer, k2> content);
}
