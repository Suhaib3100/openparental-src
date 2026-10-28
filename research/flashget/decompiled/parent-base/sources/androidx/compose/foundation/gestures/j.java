package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.l;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;

/* compiled from: BringIntoViewRequestPriorityQueue.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ@\u0010\u0012\u001a\u00020\u00102#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0003J@\u0010\u0015\u001a\u00020\u00102#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00040\u000bH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/foundation/gestures/j;", "", "<init>", "()V", "", "f", "()Z", "Landroidx/compose/foundation/gestures/l$a;", "request", "c", "(Landroidx/compose/foundation/gestures/l$a;)Z", "Lkotlin/Function1;", "Li0/i;", "Lkotlin/r0;", "name", "bounds", "Lkotlin/k2;", "block", "d", "(Lld/l;)V", "g", "h", "", "cause", "b", "(Ljava/lang/Throwable;)V", "Landroidx/compose/runtime/collection/g;", "a", "Landroidx/compose/runtime/collection/g;", "requests", "", "e", "()I", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1208#2:139\n1187#2,2:140\n53#3:142\n523#3:143\n523#3:144\n492#3,11:145\n53#3:156\n523#3:157\n48#3:158\n664#3,2:159\n523#3:161\n13579#4,2:162\n1#5:164\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:139\n43#1:140,2\n72#1:142\n73#1:143\n91#1:144\n107#1:145,11\n111#1:156\n112#1:157\n121#1:158\n132#1:159,2\n132#1:161\n132#1:162,2\n*E\n"})
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final int f4099b = androidx.compose.runtime.collection.g.f16132e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<l.a> requests = new androidx.compose.runtime.collection.g<>(new l.a[16], 0);

    /* compiled from: BringIntoViewRequestPriorityQueue.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Throwable, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l.a f4102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l.a aVar) {
            super(1);
            this.f4102c = aVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            j.this.requests.j0(this.f4102c);
        }
    }

    public final void b(@fg.m Throwable cause) {
        androidx.compose.runtime.collection.g<l.a> gVar = this.requests;
        int size = gVar.getSize();
        kotlinx.coroutines.p[] pVarArr = new kotlinx.coroutines.p[size];
        for (int i4 = 0; i4 < size; i4++) {
            pVarArr[i4] = gVar.L()[i4].a();
        }
        for (int i5 = 0; i5 < size; i5++) {
            pVarArr[i5].f(cause);
        }
        if (!this.requests.U()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(@fg.l l.a request) {
        i0.i invoke = request.b().invoke();
        if (invoke == null) {
            kotlinx.coroutines.p<k2> a5 = request.a();
            z0.Companion companion = kotlin.z0.INSTANCE;
            a5.resumeWith(k2.f75408a);
            return false;
        }
        request.a().k0(new a(request));
        kotlin.ranges.l lVar = new kotlin.ranges.l(0, this.requests.getSize() - 1, 1);
        int first = lVar.getFirst();
        int last = lVar.getLast();
        if (first <= last) {
            while (true) {
                i0.i invoke2 = this.requests.L()[last].b().invoke();
                if (invoke2 != null) {
                    i0.i K = invoke.K(invoke2);
                    if (kotlin.jvm.internal.l0.g(K, invoke)) {
                        this.requests.a(last + 1, request);
                        return true;
                    }
                    if (!kotlin.jvm.internal.l0.g(K, invoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= last) {
                            while (true) {
                                this.requests.L()[last].a().f(cancellationException);
                                if (size == last) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (last == first) {
                    break;
                }
                last--;
            }
        }
        this.requests.a(0, request);
        return true;
    }

    public final void d(@fg.l ld.l<? super i0.i, k2> block) {
        androidx.compose.runtime.collection.g<l.a> gVar = this.requests;
        int size = gVar.getSize();
        if (size > 0) {
            int i4 = size - 1;
            l.a[] L = gVar.L();
            do {
                block.invoke(L[i4].b().invoke());
                i4--;
            } while (i4 >= 0);
        }
    }

    public final int e() {
        return this.requests.getSize();
    }

    public final boolean f() {
        return this.requests.U();
    }

    public final void g() {
        kotlin.ranges.l lVar = new kotlin.ranges.l(0, this.requests.getSize() - 1, 1);
        int first = lVar.getFirst();
        int last = lVar.getLast();
        if (first <= last) {
            while (true) {
                kotlinx.coroutines.p<k2> a5 = this.requests.L()[first].a();
                k2 k2Var = k2.f75408a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                a5.resumeWith(k2Var);
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        this.requests.m();
    }

    public final void h(@fg.l ld.l<? super i0.i, Boolean> block) {
        while (this.requests.V() && block.invoke(this.requests.W().b().invoke()).booleanValue()) {
            kotlinx.coroutines.p<k2> a5 = ((l.a) i.a(this.requests, 1)).a();
            k2 k2Var = k2.f75408a;
            z0.Companion companion = kotlin.z0.INSTANCE;
            a5.resumeWith(k2Var);
        }
    }
}
