package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.d;
import com.google.common.util.concurrent.ListenableFuture;
import fg.m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlinx.coroutines.z0;
import ld.l;

/* compiled from: CoroutineAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lkotlinx/coroutines/z0;", "", "tag", "Lcom/google/common/util/concurrent/ListenableFuture;", "b", "(Lkotlinx/coroutines/z0;Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;", "ads-adservices-java_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: CoroutineAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.a<T> f32638b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0<T> f32639c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d.a<T> aVar, z0<? extends T> z0Var) {
            super(1);
            this.f32638b = aVar;
            this.f32639c = z0Var;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            if (th == null) {
                this.f32638b.c(this.f32639c.k());
            } else if (th instanceof CancellationException) {
                this.f32638b.d();
            } else {
                this.f32638b.f(th);
            }
        }
    }

    @fg.l
    public static final <T> ListenableFuture<T> b(@fg.l final z0<? extends T> z0Var, @m final Object obj) {
        l0.p(z0Var, "<this>");
        ListenableFuture<T> a5 = d.a(new d.c() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            @Override // androidx.concurrent.futures.d.c
            public final Object a(d.a aVar) {
                Object d5;
                d5 = b.d(z0.this, obj, aVar);
                return d5;
            }
        });
        l0.o(a5, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a5;
    }

    public static /* synthetic */ ListenableFuture c(z0 z0Var, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(z0Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(z0 this_asListenableFuture, Object obj, d.a completer) {
        l0.p(this_asListenableFuture, "$this_asListenableFuture");
        l0.p(completer, "completer");
        this_asListenableFuture.F(new a(completer, this_asListenableFuture));
        return obj;
    }
}
