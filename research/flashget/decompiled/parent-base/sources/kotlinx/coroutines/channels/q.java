package kotlinx.coroutines.channels;

import com.google.common.util.concurrent.d2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.internal.p0;

/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0019\u0010\u0015J!\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u001a\u0010\u0011J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b!\u0010\"J)\u0010'\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001d¢\u0006\u0004\b*\u0010+R\u001c\u0010.\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r048\u0002X\u0082\u0004¨\u00066"}, d2 = {"Lkotlinx/coroutines/channels/q;", "E", "Lkotlinx/coroutines/internal/p0;", "", "id", "prev", "Lkotlinx/coroutines/channels/j;", "channel", "", "pointers", "<init>", "(JLkotlinx/coroutines/channels/q;Lkotlinx/coroutines/channels/j;I)V", "index", "", "value", "Lkotlin/k2;", "B", "(ILjava/lang/Object;)V", "element", "D", "x", "(I)Ljava/lang/Object;", "A", "u", "(I)V", "y", "C", "from", "to", "", "t", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "update", "v", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lkotlin/coroutines/g;", "context", "q", "(ILjava/lang/Throwable;Lkotlin/coroutines/g;)V", "receiver", "z", "(IZ)V", "f", "Lkotlinx/coroutines/channels/j;", "_channel", "w", "()Lkotlinx/coroutines/channels/j;", "p", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "data", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n1#2:3056\n*E\n"})
/* loaded from: classes7.dex */
public final class q<E> extends p0<q<E>> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final j<E> _channel;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private final AtomicReferenceArray f79415g;

    public q(long j4, @fg.m q<E> qVar, @fg.m j<E> jVar, int i4) {
        super(j4, qVar, i4);
        this._channel = jVar;
        this.f79415g = new AtomicReferenceArray(k.f79365b * 2);
    }

    private final void B(int index, Object value) {
        this.f79415g.lazySet(index * 2, value);
    }

    public final E A(int index) {
        E x4 = x(index);
        B(index, null);
        return x4;
    }

    public final void C(int index, @fg.m Object value) {
        this.f79415g.set((index * 2) + 1, value);
    }

    public final void D(int index, E element) {
        B(index, element);
    }

    @Override // kotlinx.coroutines.internal.p0
    public int p() {
        return k.f79365b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0065, code lost:
    
        B(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0068, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006a, code lost:
    
        r5 = r4._channel;
        kotlin.jvm.internal.l0.m(r5);
        r5 = r5.onUndeliveredElement;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0071, code lost:
    
        if (r5 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0073, code lost:
    
        kotlinx.coroutines.internal.j0.b(r5, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0076, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(int r5, @fg.m java.lang.Throwable r6, @fg.l kotlin.coroutines.g r7) {
        /*
            r4 = this;
            int r6 = kotlinx.coroutines.channels.k.f79365b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            java.lang.Object r6 = r4.x(r5)
        Le:
            java.lang.Object r1 = r4.y(r5)
            boolean r2 = r1 instanceof kotlinx.coroutines.y3
            r3 = 0
            if (r2 != 0) goto L77
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.h0
            if (r2 == 0) goto L1c
            goto L77
        L1c:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.k.j()
            if (r1 == r2) goto L65
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.k.i()
            if (r1 != r2) goto L29
            goto L65
        L29:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.k.p()
            if (r1 == r2) goto Le
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.k.q()
            if (r1 != r2) goto L36
            goto Le
        L36:
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.k.f()
            if (r1 == r5) goto L64
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.k.f79369f
            if (r1 != r5) goto L41
            goto L64
        L41:
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.channels.k.z()
            if (r1 != r5) goto L48
            return
        L48:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "虡\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L64:
            return
        L65:
            r4.B(r5, r3)
            if (r0 == 0) goto L76
            kotlinx.coroutines.channels.j<E> r5 = r4._channel
            kotlin.jvm.internal.l0.m(r5)
            ld.l<E, kotlin.k2> r5 = r5.onUndeliveredElement
            if (r5 == 0) goto L76
            kotlinx.coroutines.internal.j0.b(r5, r6, r7)
        L76:
            return
        L77:
            if (r0 == 0) goto L7e
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.k.j()
            goto L82
        L7e:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.k.i()
        L82:
            boolean r1 = r4.t(r5, r1, r2)
            if (r1 == 0) goto Le
            r4.B(r5, r3)
            r1 = r0 ^ 1
            r4.z(r5, r1)
            if (r0 == 0) goto L9e
            kotlinx.coroutines.channels.j<E> r5 = r4._channel
            kotlin.jvm.internal.l0.m(r5)
            ld.l<E, kotlin.k2> r5 = r5.onUndeliveredElement
            if (r5 == 0) goto L9e
            kotlinx.coroutines.internal.j0.b(r5, r6, r7)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.q.q(int, java.lang.Throwable, kotlin.coroutines.g):void");
    }

    public final boolean t(int index, @fg.m Object from, @fg.m Object to) {
        return d2.a(this.f79415g, (index * 2) + 1, from, to);
    }

    public final void u(int index) {
        B(index, null);
    }

    @fg.m
    public final Object v(int index, @fg.m Object update) {
        return this.f79415g.getAndSet((index * 2) + 1, update);
    }

    @fg.l
    public final j<E> w() {
        j<E> jVar = this._channel;
        l0.m(jVar);
        return jVar;
    }

    public final E x(int index) {
        return (E) this.f79415g.get(index * 2);
    }

    @fg.m
    public final Object y(int index) {
        return this.f79415g.get((index * 2) + 1);
    }

    public final void z(int index, boolean receiver) {
        if (receiver) {
            j<E> jVar = this._channel;
            l0.m(jVar);
            jVar.I1((this.id * k.f79365b) + index);
        }
        r();
    }
}
