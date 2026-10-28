package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.y3;

/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001e\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/c0;", "E", "Lkotlinx/coroutines/y3;", "Lkotlinx/coroutines/q;", "Lkotlinx/coroutines/channels/p;", "cont", "<init>", "(Lkotlinx/coroutines/q;)V", "Lkotlinx/coroutines/internal/p0;", "segment", "", "index", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/internal/p0;I)V", "b", "Lkotlinx/coroutines/q;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class c0<E> implements y3 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final kotlinx.coroutines.q<p<? extends E>> cont;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(@fg.l kotlinx.coroutines.q<? super p<? extends E>> qVar) {
        this.cont = qVar;
    }

    @Override // kotlinx.coroutines.y3
    public void a(@fg.l p0<?> segment, int index) {
        this.cont.a(segment, index);
    }
}
