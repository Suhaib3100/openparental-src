package androidx.compose.foundation.lazy;

import androidx.compose.foundation.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.k2;

/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0098\u0001\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042%\b\u0002\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000421\u0010\u0014\u001a-\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jq\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000421\u0010\u0014\u001a-\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0017¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH'¢\u0006\u0004\b\u0019\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "", "key", "contentType", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/b;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Lkotlin/u;", "content", "e", "(Ljava/lang/Object;Ljava/lang/Object;Lld/q;)V", "s", "(Ljava/lang/Object;Lld/q;)V", "", "count", "Lkotlin/r0;", "name", "index", "Lkotlin/Function2;", "itemContent", "i", "(ILld/l;Lld/l;Lld/r;)V", "g", "(ILld/l;Lld/r;)V", "u", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@e0
/* loaded from: classes.dex */
public interface y {

    /* compiled from: LazyDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static void a(@fg.l y yVar, @fg.m Object obj, @fg.m Object obj2, @fg.l ld.q<? super androidx.compose.foundation.lazy.b, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
            y.super.e(obj, obj2, qVar);
        }

        @Deprecated
        public static void e(@fg.l y yVar, int i4, @fg.m ld.l<? super Integer, ? extends Object> lVar, @fg.l ld.l<? super Integer, ? extends Object> lVar2, @fg.l ld.r<? super androidx.compose.foundation.lazy.b, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> rVar) {
            y.super.i(i4, lVar, lVar2, rVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends n0 implements ld.l {

        /* renamed from: b, reason: collision with root package name */
        public static final b f6576b = new b(1);

        b() {
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

    /* compiled from: LazyDsl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<Integer, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f6577b = new c(1);

        c() {
            super(1);
        }

        @fg.m
        public final Object a(int i4) {
            return null;
        }

        @Override // ld.l
        public Object invoke(Integer num) {
            num.intValue();
            return null;
        }
    }

    static /* synthetic */ void a(y yVar, Object obj, Object obj2, ld.q qVar, int i4, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i4 & 1) != 0) {
            obj = null;
        }
        if ((i4 & 2) != 0) {
            obj2 = null;
        }
        yVar.u(obj, obj2, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void h(y yVar, int i4, ld.l lVar, ld.l lVar2, ld.r rVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        if ((i5 & 4) != 0) {
            lVar2 = b.f6576b;
        }
        yVar.i(i4, lVar, lVar2, rVar);
    }

    static /* synthetic */ void j(y yVar, Object obj, Object obj2, ld.q qVar, int i4, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i4 & 1) != 0) {
            obj = null;
        }
        if ((i4 & 2) != 0) {
            obj2 = null;
        }
        yVar.e(obj, obj2, qVar);
    }

    static /* synthetic */ void k(y yVar, int i4, ld.l lVar, ld.r rVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        yVar.g(i4, lVar, rVar);
    }

    static /* synthetic */ void p(y yVar, Object obj, ld.q qVar, int i4, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i4 & 1) != 0) {
            obj = null;
        }
        yVar.s(obj, qVar);
    }

    default void e(@fg.m Object key, @fg.m Object contentType, @fg.l ld.q<? super androidx.compose.foundation.lazy.b, ? super androidx.compose.runtime.t, ? super Integer, k2> content) {
        throw new IllegalStateException("The method is not implemented");
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void g(int count, ld.l key, ld.r itemContent) {
        i(count, key, c.f6577b, itemContent);
    }

    default void i(int count, @fg.m ld.l<? super Integer, ? extends Object> key, @fg.l ld.l<? super Integer, ? extends Object> contentType, @fg.l ld.r<? super androidx.compose.foundation.lazy.b, ? super Integer, ? super androidx.compose.runtime.t, ? super Integer, k2> itemContent) {
        throw new IllegalStateException("The method is not implemented");
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void s(Object key, ld.q content) {
        e(key, null, content);
    }

    @z0
    void u(@fg.m Object key, @fg.m Object contentType, @fg.l ld.q<? super androidx.compose.foundation.lazy.b, ? super androidx.compose.runtime.t, ? super Integer, k2> content);
}
