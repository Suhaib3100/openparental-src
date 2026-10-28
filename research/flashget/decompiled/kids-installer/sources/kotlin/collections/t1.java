package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

/* compiled from: SlidingWindow.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SlidingWindow.kt */
    @DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a<T> extends RestrictedSuspendLambda implements q3.p<SequenceScope<? super List<? extends T>>, Continuation<? super m2>, Object> {

        /* renamed from: q, reason: collision with root package name */
        Object f23220q;

        /* renamed from: r, reason: collision with root package name */
        Object f23221r;

        /* renamed from: s, reason: collision with root package name */
        int f23222s;

        /* renamed from: t, reason: collision with root package name */
        int f23223t;

        /* renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f23224u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f23225v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f23226w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Iterator<T> f23227x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ boolean f23228y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ boolean f23229z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i5, int i6, Iterator<? extends T> it, boolean z5, boolean z6, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f23225v = i5;
            this.f23226w = i6;
            this.f23227x = it;
            this.f23228y = z5;
            this.f23229z = z6;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00b0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x014d -> B:12:0x0150). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x011f -> B:30:0x0122). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a5 -> B:50:0x005a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.t1.a.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d SequenceScope<? super List<? extends T>> sequenceScope, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(sequenceScope, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            a aVar = new a(this.f23225v, this.f23226w, this.f23227x, this.f23228y, this.f23229z, continuation);
            aVar.f23224u = obj;
            return aVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"})
    public static final class b<T> implements Sequence<List<? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Sequence f23230a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f23231b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f23232c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f23233d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f23234e;

        public b(Sequence sequence, int i5, int i6, boolean z5, boolean z6) {
            this.f23230a = sequence;
            this.f23231b = i5;
            this.f23232c = i6;
            this.f23233d = z5;
            this.f23234e = z6;
        }

        @Override // kotlin.sequences.Sequence
        @d5.d
        public Iterator<List<? extends T>> iterator() {
            return t1.b(this.f23230a.iterator(), this.f23231b, this.f23232c, this.f23233d, this.f23234e);
        }
    }

    public static final void a(int i5, int i6) {
        String a6;
        if (i5 > 0 && i6 > 0) {
            return;
        }
        String s5 = ProtectedSandApp.s("㡂");
        if (i5 != i6) {
            a6 = ProtectedSandApp.s("㡃") + i5 + ProtectedSandApp.s("㡄") + i6 + s5;
        } else {
            a6 = androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("㡅"), i5, s5);
        }
        throw new IllegalArgumentException(a6.toString());
    }

    @d5.d
    public static final <T> Iterator<List<T>> b(@d5.d Iterator<? extends T> it, int i5, int i6, boolean z5, boolean z6) {
        Iterator<List<T>> a6;
        kotlin.jvm.internal.l0.p(it, ProtectedSandApp.s("㡆"));
        if (!it.hasNext()) {
            return EmptyIterator.f23163o;
        }
        a6 = kotlin.sequences.q.a(new a(i5, i6, it, z6, z5, null));
        return a6;
    }

    @d5.d
    public static final <T> Sequence<List<T>> c(@d5.d Sequence<? extends T> sequence, int i5, int i6, boolean z5, boolean z6) {
        kotlin.jvm.internal.l0.p(sequence, ProtectedSandApp.s("㡇"));
        a(i5, i6);
        return new b(sequence, i5, i6, z5, z6);
    }
}
