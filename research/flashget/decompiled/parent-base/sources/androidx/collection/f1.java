package androidx.collection;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: LongSparseArray.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a*\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a0\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0007\u0010\b\u001a<\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\t*\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\n\u0010\b\u001a(\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a0\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a(\u0010\u0014\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\b\u001a8\u0010\u0019\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a \u0010\u001b\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a0\u0010\u001d\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a0\u0010 \u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b \u0010!\u001a2\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\"\u0010\b\u001a \u0010#\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b#\u0010$\u001a \u0010%\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b%\u0010&\u001a(\u0010'\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0080\b¢\u0006\u0004\b'\u0010(\u001a(\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0080\b¢\u0006\u0004\b)\u0010*\u001a0\u0010+\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b+\u0010,\u001a(\u0010-\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b-\u0010.\u001a(\u0010/\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b/\u00100\u001a(\u00101\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b1\u00102\u001a(\u00103\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b3\u00104\u001a \u00105\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b5\u0010\u001c\u001a0\u00106\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b6\u0010\u001e\u001a \u00108\u001a\u000207\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¢\u0006\u0004\b8\u00109\u001a(\u0010:\u001a\u00020\u000f\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b:\u00102\u001a0\u0010;\u001a\u00020\u000b\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b;\u0010\u001e\u001a4\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b<\u0010=\u001a0\u0010>\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b>\u0010\b\u001a9\u0010@\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0086\bø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a \u0010B\u001a\u00020\u000f\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\bB\u0010&\u001a/\u0010C\u001a\u00020\u000f\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0007¢\u0006\u0004\bC\u0010\u0011\u001a[\u0010H\u001a\u00020\u000b\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010G\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0DH\u0086\bø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001a\u001d\u0010K\u001a\u00020J\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bK\u0010L\u001a#\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000M\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bN\u0010O\"\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\"(\u0010U\u001a\u00020\u0012\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\f\u0012\u0004\b\u0000\u0010\u001c\u001a\u0004\bT\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006V"}, d2 = {"E", "Landroidx/collection/e1;", "", "key", "g", "(Landroidx/collection/e1;J)Ljava/lang/Object;", "defaultValue", "h", "(Landroidx/collection/e1;JLjava/lang/Object;)Ljava/lang/Object;", "T", "i", "Lkotlin/k2;", "q", "(Landroidx/collection/e1;J)V", "value", "", "r", "(Landroidx/collection/e1;JLjava/lang/Object;)Z", "", "index", "s", "(Landroidx/collection/e1;I)V", "t", "oldValue", "newValue", "u", "(Landroidx/collection/e1;JLjava/lang/Object;Ljava/lang/Object;)Z", "f", "(Landroidx/collection/e1;)V", "n", "(Landroidx/collection/e1;JLjava/lang/Object;)V", "other", "o", "(Landroidx/collection/e1;Landroidx/collection/e1;)V", "p", "w", "(Landroidx/collection/e1;)I", "l", "(Landroidx/collection/e1;)Z", "m", "(Landroidx/collection/e1;I)J", "y", "(Landroidx/collection/e1;I)Ljava/lang/Object;", "v", "(Landroidx/collection/e1;ILjava/lang/Object;)V", "j", "(Landroidx/collection/e1;J)I", "k", "(Landroidx/collection/e1;Ljava/lang/Object;)I", "d", "(Landroidx/collection/e1;J)Z", "e", "(Landroidx/collection/e1;Ljava/lang/Object;)Z", "c", "b", "", "x", "(Landroidx/collection/e1;)Ljava/lang/String;", "z", "J", "H", "(Landroidx/collection/e1;Landroidx/collection/e1;)Landroidx/collection/e1;", "B", "Lkotlin/Function0;", "C", "(Landroidx/collection/e1;JLld/a;)Ljava/lang/Object;", "F", "I", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "action", "A", "(Landroidx/collection/e1;Lld/p;)V", "Lkotlin/collections/v0;", "G", "(Landroidx/collection/e1;)Lkotlin/collections/v0;", "", "K", "(Landroidx/collection/e1;)Ljava/util/Iterator;", "", "a", "Ljava/lang/Object;", "DELETED", "D", "size", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,606:1\n256#1,6:607\n256#1,6:613\n328#1,18:619\n328#1,18:637\n328#1,18:655\n328#1,18:673\n328#1,18:691\n328#1,18:709\n328#1,18:727\n328#1,18:745\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n243#1:607,6\n248#1:613,6\n360#1:619,18\n410#1:637,18\n425#1:655,18\n437#1:673,18\n451#1:691,18\n459#1:709,18\n467#1:727,18\n505#1:745,18\n*E\n"})
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final Object f2222a = new Object();

    /* compiled from: LongSparseArray.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"androidx/collection/f1$a", "Lkotlin/collections/v0;", "", "hasNext", "()Z", "", "c", "()J", "", "b", "I", "d", "()I", "e", "(I)V", "index", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends kotlin.collections.v0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e1<T> f2224c;

        a(e1<T> e1Var) {
            this.f2224c = e1Var;
        }

        @Override // kotlin.collections.v0
        public long c() {
            e1<T> e1Var = this.f2224c;
            int i4 = this.index;
            this.index = i4 + 1;
            return e1Var.o(i4);
        }

        /* renamed from: d, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void e(int i4) {
            this.index = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f2224c.z();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LongSparseArray.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/collection/f1$b", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "b", "I", "()I", "c", "(I)V", "index", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> implements Iterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e1<T> f2226c;

        b(e1<T> e1Var) {
            this.f2226c = e1Var;
        }

        /* renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void c(int i4) {
            this.index = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f2226c.z();
        }

        @Override // java.util.Iterator
        public T next() {
            e1<T> e1Var = this.f2226c;
            int i4 = this.index;
            this.index = i4 + 1;
            return e1Var.A(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> void A(@fg.l e1<T> e1Var, @fg.l ld.p<? super Long, ? super T, kotlin.k2> action) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        int z4 = e1Var.z();
        for (int i4 = 0; i4 < z4; i4++) {
            action.invoke(Long.valueOf(e1Var.o(i4)), e1Var.A(i4));
        }
    }

    public static final <T> T B(@fg.l e1<T> e1Var, long j4, T t4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        return e1Var.k(j4, t4);
    }

    public static final <T> T C(@fg.l e1<T> e1Var, long j4, @fg.l ld.a<? extends T> defaultValue) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        T i4 = e1Var.i(j4);
        return i4 == null ? defaultValue.invoke() : i4;
    }

    public static final <T> int D(@fg.l e1<T> e1Var) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        return e1Var.z();
    }

    public static /* synthetic */ void E(e1 e1Var) {
    }

    public static final <T> boolean F(@fg.l e1<T> e1Var) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        return !e1Var.n();
    }

    @fg.l
    public static final <T> kotlin.collections.v0 G(@fg.l e1<T> e1Var) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        return new a(e1Var);
    }

    @fg.l
    public static final <T> e1<T> H(@fg.l e1<T> e1Var, @fg.l e1<T> other) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        e1<T> e1Var2 = new e1<>(other.z() + e1Var.z());
        e1Var2.q(e1Var);
        e1Var2.q(other);
        return e1Var2;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean I(e1 e1Var, long j4, Object obj) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        return e1Var.t(j4, obj);
    }

    public static final <T> void J(@fg.l e1<T> e1Var, long j4, T t4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        e1Var.p(j4, t4);
    }

    @fg.l
    public static final <T> Iterator<T> K(@fg.l e1<T> e1Var) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        return new b(e1Var);
    }

    public static final <E> void b(@fg.l e1<E> e1Var, long j4, E e4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        int i4 = e1Var.size;
        if (i4 != 0 && j4 <= e1Var.keys[i4 - 1]) {
            e1Var.p(j4, e4);
            return;
        }
        if (e1Var.garbage) {
            long[] jArr = e1Var.keys;
            if (i4 >= jArr.length) {
                Object[] objArr = e1Var.values;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj = objArr[i6];
                    if (obj != f2222a) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr[i5] = obj;
                            objArr[i6] = null;
                        }
                        i5++;
                    }
                }
                e1Var.garbage = false;
                e1Var.size = i5;
            }
        }
        int i7 = e1Var.size;
        if (i7 >= e1Var.keys.length) {
            int f4 = m.a.f(i7 + 1);
            long[] copyOf = Arrays.copyOf(e1Var.keys, f4);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            e1Var.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(e1Var.values, f4);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            e1Var.values = copyOf2;
        }
        e1Var.keys[i7] = j4;
        e1Var.values[i7] = e4;
        e1Var.size = i7 + 1;
    }

    public static final <E> void c(@fg.l e1<E> e1Var) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        int i4 = e1Var.size;
        Object[] objArr = e1Var.values;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        e1Var.size = 0;
        e1Var.garbage = false;
    }

    public static final <E> boolean d(@fg.l e1<E> e1Var, long j4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        return e1Var.l(j4) >= 0;
    }

    public static final <E> boolean e(@fg.l e1<E> e1Var, E e4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        return e1Var.m(e4) >= 0;
    }

    public static final <E> void f(@fg.l e1<E> e1Var) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        int i4 = e1Var.size;
        long[] jArr = e1Var.keys;
        Object[] objArr = e1Var.values;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f2222a) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        e1Var.garbage = false;
        e1Var.size = i5;
    }

    @fg.m
    public static final <E> E g(@fg.l e1<E> e1Var, long j4) {
        E e4;
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        int b5 = m.a.b(e1Var.keys, e1Var.size, j4);
        if (b5 < 0 || (e4 = (E) e1Var.values[b5]) == f2222a) {
            return null;
        }
        return e4;
    }

    public static final <E> E h(@fg.l e1<E> e1Var, long j4, E e4) {
        E e5;
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        int b5 = m.a.b(e1Var.keys, e1Var.size, j4);
        return (b5 < 0 || (e5 = (E) e1Var.values[b5]) == f2222a) ? e4 : e5;
    }

    public static final <T extends E, E> T i(@fg.l e1<E> e1Var, long j4, T t4) {
        T t5;
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        int b5 = m.a.b(e1Var.keys, e1Var.size, j4);
        return (b5 < 0 || (t5 = (T) e1Var.values[b5]) == f2222a) ? t4 : t5;
    }

    public static final <E> int j(@fg.l e1<E> e1Var, long j4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        if (e1Var.garbage) {
            int i4 = e1Var.size;
            long[] jArr = e1Var.keys;
            Object[] objArr = e1Var.values;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != f2222a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            e1Var.garbage = false;
            e1Var.size = i5;
        }
        return m.a.b(e1Var.keys, e1Var.size, j4);
    }

    public static final <E> int k(@fg.l e1<E> e1Var, E e4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        if (e1Var.garbage) {
            int i4 = e1Var.size;
            long[] jArr = e1Var.keys;
            Object[] objArr = e1Var.values;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != f2222a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            e1Var.garbage = false;
            e1Var.size = i5;
        }
        int i7 = e1Var.size;
        for (int i10 = 0; i10 < i7; i10++) {
            if (e1Var.values[i10] == e4) {
                return i10;
            }
        }
        return -1;
    }

    public static final <E> boolean l(@fg.l e1<E> e1Var) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        return e1Var.z() == 0;
    }

    public static final <E> long m(@fg.l e1<E> e1Var, int i4) {
        int i5;
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        if (i4 < 0 || i4 >= (i5 = e1Var.size)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        if (e1Var.garbage) {
            long[] jArr = e1Var.keys;
            Object[] objArr = e1Var.values;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != f2222a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            e1Var.garbage = false;
            e1Var.size = i6;
        }
        return e1Var.keys[i4];
    }

    public static final <E> void n(@fg.l e1<E> e1Var, long j4, E e4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        int b5 = m.a.b(e1Var.keys, e1Var.size, j4);
        if (b5 >= 0) {
            e1Var.values[b5] = e4;
            return;
        }
        int i4 = ~b5;
        int i5 = e1Var.size;
        if (i4 < i5) {
            Object[] objArr = e1Var.values;
            if (objArr[i4] == f2222a) {
                e1Var.keys[i4] = j4;
                objArr[i4] = e4;
                return;
            }
        }
        if (e1Var.garbage) {
            long[] jArr = e1Var.keys;
            if (i5 >= jArr.length) {
                Object[] objArr2 = e1Var.values;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    Object obj = objArr2[i7];
                    if (obj != f2222a) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr2[i6] = obj;
                            objArr2[i7] = null;
                        }
                        i6++;
                    }
                }
                e1Var.garbage = false;
                e1Var.size = i6;
                i4 = ~m.a.b(e1Var.keys, i6, j4);
            }
        }
        int i10 = e1Var.size;
        if (i10 >= e1Var.keys.length) {
            int f4 = m.a.f(i10 + 1);
            long[] copyOf = Arrays.copyOf(e1Var.keys, f4);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            e1Var.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(e1Var.values, f4);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            e1Var.values = copyOf2;
        }
        int i11 = e1Var.size;
        if (i11 - i4 != 0) {
            long[] jArr2 = e1Var.keys;
            int i12 = i4 + 1;
            kotlin.collections.l.A0(jArr2, jArr2, i12, i4, i11);
            Object[] objArr3 = e1Var.values;
            kotlin.collections.l.B0(objArr3, objArr3, i12, i4, e1Var.size);
        }
        e1Var.keys[i4] = j4;
        e1Var.values[i4] = e4;
        e1Var.size++;
    }

    public static final <E> void o(@fg.l e1<E> e1Var, @fg.l e1<? extends E> other) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        kotlin.jvm.internal.l0.p(other, "other");
        int z4 = other.z();
        for (int i4 = 0; i4 < z4; i4++) {
            e1Var.p(other.o(i4), other.A(i4));
        }
    }

    @fg.m
    public static final <E> E p(@fg.l e1<E> e1Var, long j4, E e4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        E i4 = e1Var.i(j4);
        if (i4 == null) {
            e1Var.p(j4, e4);
        }
        return i4;
    }

    public static final <E> void q(@fg.l e1<E> e1Var, long j4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        int b5 = m.a.b(e1Var.keys, e1Var.size, j4);
        if (b5 >= 0) {
            Object[] objArr = e1Var.values;
            Object obj = objArr[b5];
            Object obj2 = f2222a;
            if (obj != obj2) {
                objArr[b5] = obj2;
                e1Var.garbage = true;
            }
        }
    }

    public static final <E> boolean r(@fg.l e1<E> e1Var, long j4, E e4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        int l4 = e1Var.l(j4);
        if (l4 < 0 || !kotlin.jvm.internal.l0.g(e4, e1Var.A(l4))) {
            return false;
        }
        e1Var.u(l4);
        return true;
    }

    public static final <E> void s(@fg.l e1<E> e1Var, int i4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        Object[] objArr = e1Var.values;
        Object obj = objArr[i4];
        Object obj2 = f2222a;
        if (obj != obj2) {
            objArr[i4] = obj2;
            e1Var.garbage = true;
        }
    }

    @fg.m
    public static final <E> E t(@fg.l e1<E> e1Var, long j4, E e4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        int l4 = e1Var.l(j4);
        if (l4 < 0) {
            return null;
        }
        Object[] objArr = e1Var.values;
        E e5 = (E) objArr[l4];
        objArr[l4] = e4;
        return e5;
    }

    public static final <E> boolean u(@fg.l e1<E> e1Var, long j4, E e4, E e5) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        int l4 = e1Var.l(j4);
        if (l4 < 0 || !kotlin.jvm.internal.l0.g(e1Var.values[l4], e4)) {
            return false;
        }
        e1Var.values[l4] = e5;
        return true;
    }

    public static final <E> void v(@fg.l e1<E> e1Var, int i4, E e4) {
        int i5;
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        if (i4 < 0 || i4 >= (i5 = e1Var.size)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        if (e1Var.garbage) {
            long[] jArr = e1Var.keys;
            Object[] objArr = e1Var.values;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != f2222a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            e1Var.garbage = false;
            e1Var.size = i6;
        }
        e1Var.values[i4] = e4;
    }

    public static final <E> int w(@fg.l e1<E> e1Var) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        if (e1Var.garbage) {
            int i4 = e1Var.size;
            long[] jArr = e1Var.keys;
            Object[] objArr = e1Var.values;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != f2222a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            e1Var.garbage = false;
            e1Var.size = i5;
        }
        return e1Var.size;
    }

    @fg.l
    public static final <E> String x(@fg.l e1<E> e1Var) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        if (e1Var.z() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(e1Var.size * 28);
        sb.append('{');
        int i4 = e1Var.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(e1Var.o(i5));
            sb.append('=');
            E A = e1Var.A(i5);
            if (A != sb) {
                sb.append(A);
            } else {
                sb.append("(this Map)");
            }
        }
        return c.a(sb, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public static final <E> E y(@fg.l e1<E> e1Var, int i4) {
        int i5;
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        if (i4 < 0 || i4 >= (i5 = e1Var.size)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        if (e1Var.garbage) {
            long[] jArr = e1Var.keys;
            Object[] objArr = e1Var.values;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != f2222a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            e1Var.garbage = false;
            e1Var.size = i6;
        }
        return (E) e1Var.values[i4];
    }

    public static final <T> boolean z(@fg.l e1<T> e1Var, long j4) {
        kotlin.jvm.internal.l0.p(e1Var, "<this>");
        return e1Var.e(j4);
    }
}
