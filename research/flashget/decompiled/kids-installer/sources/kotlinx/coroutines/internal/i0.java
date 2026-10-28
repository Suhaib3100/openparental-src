package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;

/* compiled from: OnUndeliveredElement.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, d2 = {"E", "Lkotlin/Function1;", "Lkotlin/m2;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "c", "(Lq3/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "Lkotlin/coroutines/g;", "context", "b", "(Lq3/l;Ljava/lang/Object;Lkotlin/coroutines/g;)V", "", "a", "(Lq3/l;Ljava/lang/Object;Lkotlin/coroutines/g;)Lq3/l;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class i0 {

    /* compiled from: OnUndeliveredElement.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "<anonymous parameter 0>", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.l<Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.l<E, m2> f28714p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ E f28715q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f28716r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q3.l<? super E, m2> lVar, E e6, CoroutineContext coroutineContext) {
            super(1);
            this.f28714p = lVar;
            this.f28715q = e6;
            this.f28716r = coroutineContext;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.d Throwable th) {
            i0.b(this.f28714p, this.f28715q, this.f28716r);
        }
    }

    @d5.d
    public static final <E> q3.l<Throwable, m2> a(@d5.d q3.l<? super E, m2> lVar, E e6, @d5.d CoroutineContext coroutineContext) {
        return new a(lVar, e6, coroutineContext);
    }

    public static final <E> void b(@d5.d q3.l<? super E, m2> lVar, E e6, @d5.d CoroutineContext coroutineContext) {
        UndeliveredElementException c6 = c(lVar, e6, null);
        if (c6 != null) {
            kotlinx.coroutines.r0.b(coroutineContext, c6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.e
    public static final <E> UndeliveredElementException c(@d5.d q3.l<? super E, m2> lVar, E e6, @d5.e UndeliveredElementException undeliveredElementException) {
        try {
            lVar.N(e6);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(ProtectedSandApp.s("巙") + e6, th);
            }
            kotlin.p.a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(q3.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}
