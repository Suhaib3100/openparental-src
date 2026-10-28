package kotlin.collections;

import androidx.collection.q2;
import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SlidingWindow.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aK\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0007\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000e\"\u0004\b\u0000\u0010\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "size", "step", "Lkotlin/k2;", "a", "(II)V", "T", "Lkotlin/sequences/m;", "", "partialWindows", "reuseBuffer", "", "c", "(Lkotlin/sequences/m;IIZZ)Lkotlin/sequences/m;", "", "iterator", "b", "(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class q1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SlidingWindow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/sequences/o;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
    static final class a<T> extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super List<? extends T>>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f74949c;

        /* renamed from: d, reason: collision with root package name */
        Object f74950d;

        /* renamed from: e, reason: collision with root package name */
        int f74951e;

        /* renamed from: f, reason: collision with root package name */
        int f74952f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f74953g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f74954h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f74955i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Iterator<T> f74956j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f74957k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f74958l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i4, int i5, Iterator<? extends T> it, boolean z4, boolean z5, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f74954h = i4;
            this.f74955i = i5;
            this.f74956j = it;
            this.f74957k = z4;
            this.f74958l = z5;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlin.sequences.o<? super List<? extends T>> oVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(oVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f74954h, this.f74955i, this.f74956j, this.f74957k, this.f74958l, dVar);
            aVar.f74953g = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00d6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00ac  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0147 -> B:12:0x014a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0119 -> B:30:0x011c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a1 -> B:50:0x0057). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.q1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/sequences/s$a", "Lkotlin/sequences/m;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"})
    public static final class b<T> implements kotlin.sequences.m<List<? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.sequences.m f74959a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f74960b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f74961c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f74962d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f74963e;

        public b(kotlin.sequences.m mVar, int i4, int i5, boolean z4, boolean z5) {
            this.f74959a = mVar;
            this.f74960b = i4;
            this.f74961c = i5;
            this.f74962d = z4;
            this.f74963e = z5;
        }

        @Override // kotlin.sequences.m
        @fg.l
        public Iterator<List<? extends T>> iterator() {
            return q1.b(this.f74959a.iterator(), this.f74960b, this.f74961c, this.f74962d, this.f74963e);
        }
    }

    public static final void a(int i4, int i5) {
        if (i4 <= 0 || i5 <= 0) {
            String s4 = ProtectedSandApp.s("戄\u0001");
            throw new IllegalArgumentException((i4 != i5 ? q2.a(ProtectedSandApp.s("戅\u0001"), i4, ProtectedSandApp.s("戆\u0001"), i5, s4) : r2.a(ProtectedSandApp.s("戇\u0001"), i4, s4)).toString());
        }
    }

    @fg.l
    public static final <T> Iterator<List<T>> b(@fg.l Iterator<? extends T> it, int i4, int i5, boolean z4, boolean z5) {
        kotlin.jvm.internal.l0.p(it, ProtectedSandApp.s("戈\u0001"));
        return !it.hasNext() ? i0.f74913b : kotlin.sequences.p.a(new a(i4, i5, it, z5, z4, null));
    }

    @fg.l
    public static final <T> kotlin.sequences.m<List<T>> c(@fg.l kotlin.sequences.m<? extends T> mVar, int i4, int i5, boolean z4, boolean z5) {
        kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("戉\u0001"));
        a(i4, i5);
        return new b(mVar, i4, i5, z4, z5);
    }
}
