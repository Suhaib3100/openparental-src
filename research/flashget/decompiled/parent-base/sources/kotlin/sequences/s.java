package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.q0;
import org.apache.log4j.net.SyslogAppender;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\u001a5\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004¢\u0006\u0004\b\u0014\u0010\u0010\u001a+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0010\u001aE\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aG\u0010\u001d\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u001b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0017*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b0\u0004¢\u0006\u0004\b\u001d\u0010\u001e\u001a%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u001f\u0010\u0010\u001a-\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#\u001ai\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010$\"\u0004\b\u0002\u0010\u00172\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00020\u0018H\u0000¢\u0006\u0004\b)\u0010*\u001a#\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b+\u0010\u0010\u001a-\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020,2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b.\u0010\u0006\u001a?\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020,2\b\u0010/\u001a\u0004\u0018\u00018\u00002\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0018H\u0007¢\u0006\u0004\b0\u00101\u001aC\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0000*\u00020,2\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0018¢\u0006\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"T", "Lkotlin/Function0;", "", "iterator", "Lkotlin/sequences/m;", "d", "(Lld/a;)Lkotlin/sequences/m;", "e", "(Ljava/util/Iterator;)Lkotlin/sequences/m;", "", "elements", "q", "([Ljava/lang/Object;)Lkotlin/sequences/m;", "g", "()Lkotlin/sequences/m;", "p", "(Lkotlin/sequences/m;)Lkotlin/sequences/m;", "defaultValue", "o", "(Lkotlin/sequences/m;Lld/a;)Lkotlin/sequences/m;", "i", "", "k", "R", "Lkotlin/Function1;", "j", "(Lkotlin/sequences/m;Lld/l;)Lkotlin/sequences/m;", "Lkotlin/q0;", "", "t", "(Lkotlin/sequences/m;)Lkotlin/q0;", "r", "Lkotlin/random/f;", "random", "s", "(Lkotlin/sequences/m;Lkotlin/random/f;)Lkotlin/sequences/m;", "C", "source", "Lkotlin/Function2;", "", "transform", "h", "(Lkotlin/sequences/m;Lld/p;Lld/l;)Lkotlin/sequences/m;", "f", "", "nextFunction", "m", "seed", "l", "(Ljava/lang/Object;Lld/l;)Lkotlin/sequences/m;", "seedFunction", "n", "(Lld/a;Lld/l;)Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes7.dex */
public class s extends r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/sequences/s$a", "Lkotlin/sequences/m;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,680:1\n*E\n"})
    public static final class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.a<Iterator<T>> f78939a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ld.a<? extends Iterator<? extends T>> aVar) {
            this.f78939a = aVar;
        }

        @Override // kotlin.sequences.m
        @fg.l
        public Iterator<T> iterator() {
            return this.f78939a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/sequences/s$a", "Lkotlin/sequences/m;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,680:1\n30#2:681\n*E\n"})
    public static final class b<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f78940a;

        public b(Iterator it) {
            this.f78940a = it;
        }

        @Override // kotlin.sequences.m
        @fg.l
        public Iterator<T> iterator() {
            return this.f78940a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Sequences.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {332}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "C", "R", "Lkotlin/sequences/o;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
    static final class c<R> extends kotlin.coroutines.jvm.internal.k implements ld.p<o<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f78941c;

        /* renamed from: d, reason: collision with root package name */
        int f78942d;

        /* renamed from: e, reason: collision with root package name */
        int f78943e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f78944f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ m<T> f78945g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<Integer, T, C> f78946h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<C, Iterator<R>> f78947i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(m<? extends T> mVar, ld.p<? super Integer, ? super T, ? extends C> pVar, ld.l<? super C, ? extends Iterator<? extends R>> lVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f78945g = mVar;
            this.f78946h = pVar;
            this.f78947i = lVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l o<? super R> oVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(oVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f78945g, this.f78946h, this.f78947i, dVar);
            cVar.f78944f = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            o oVar;
            int i4;
            Iterator it;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i5 = this.f78943e;
            if (i5 == 0) {
                a1.n(obj);
                oVar = (o) this.f78944f;
                i4 = 0;
                it = this.f78945g.iterator();
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("茱\u0001"));
                }
                int i6 = this.f78942d;
                it = (Iterator) this.f78941c;
                oVar = (o) this.f78944f;
                a1.n(obj);
                i4 = i6;
            }
            while (it.hasNext()) {
                Object next = it.next();
                ld.p<Integer, T, C> pVar = this.f78946h;
                int i7 = i4 + 1;
                if (i4 < 0) {
                    kotlin.collections.w.Z();
                }
                Iterator<R> invoke = this.f78947i.invoke(pVar.invoke(new Integer(i4), next));
                this.f78944f = oVar;
                this.f78941c = it;
                this.f78942d = i7;
                this.f78943e = 1;
                if (oVar.d(invoke, this) == aVar) {
                    return aVar;
                }
                i4 = i7;
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/sequences/m;", "it", "", "a", "(Lkotlin/sequences/m;)Ljava/util/Iterator;"}, k = 3, mv = {1, 9, 0})
    static final class d<T> extends n0 implements ld.l<m<? extends T>, Iterator<? extends T>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f78948b = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> invoke(@fg.l m<? extends T> mVar) {
            l0.p(mVar, ProtectedSandApp.s("茲\u0001"));
            return mVar.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Iterable;)Ljava/util/Iterator;"}, k = 3, mv = {1, 9, 0})
    static final class e<T> extends n0 implements ld.l<Iterable<? extends T>, Iterator<? extends T>> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f78949b = new e(1);

        e() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> invoke(@fg.l Iterable<? extends T> iterable) {
            l0.p(iterable, ProtectedSandApp.s("茳\u0001"));
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f<T> extends n0 implements ld.l<T, T> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f78950b = new f(1);

        f() {
            super(1);
        }

        @Override // ld.l
        public final T invoke(T t4) {
            return t4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g<T> extends n0 implements ld.l<T, T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<T> f78951b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ld.a<? extends T> aVar) {
            super(1);
            this.f78951b = aVar;
        }

        @Override // ld.l
        @fg.m
        public final T invoke(@fg.l T t4) {
            l0.p(t4, ProtectedSandApp.s("茴\u0001"));
            return this.f78951b.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h<T> extends n0 implements ld.a<T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f78952b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(T t4) {
            super(0);
            this.f78952b = t4;
        }

        @Override // ld.a
        @fg.m
        public final T invoke() {
            return this.f78952b;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/sequences/o;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
    static final class i<T> extends kotlin.coroutines.jvm.internal.k implements ld.p<o<? super T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        int f78953c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f78954d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m<T> f78955e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.a<m<T>> f78956f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(m<? extends T> mVar, ld.a<? extends m<? extends T>> aVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f78955e = mVar;
            this.f78956f = aVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l o<? super T> oVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((i) create(oVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            i iVar = new i(this.f78955e, this.f78956f, dVar);
            iVar.f78954d = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f78953c;
            if (i4 == 0) {
                a1.n(obj);
                o oVar = (o) this.f78954d;
                Iterator<? extends T> it = this.f78955e.iterator();
                if (it.hasNext()) {
                    this.f78953c = 1;
                    if (oVar.d(it, this) == aVar) {
                        return aVar;
                    }
                } else {
                    m<T> invoke = this.f78956f.invoke();
                    this.f78953c = 2;
                    if (oVar.e(invoke, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException(ProtectedSandApp.s("茵\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/sequences/o;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
    static final class j<T> extends kotlin.coroutines.jvm.internal.k implements ld.p<o<? super T>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f78957c;

        /* renamed from: d, reason: collision with root package name */
        int f78958d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f78959e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m<T> f78960f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.random.f f78961g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(m<? extends T> mVar, kotlin.random.f fVar, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f78960f = mVar;
            this.f78961g = fVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l o<? super T> oVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((j) create(oVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            j jVar = new j(this.f78960f, this.f78961g, dVar);
            jVar.f78959e = obj;
            return jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            List d32;
            o oVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f78958d;
            if (i4 == 0) {
                a1.n(obj);
                o oVar2 = (o) this.f78959e;
                d32 = v.d3(this.f78960f);
                oVar = oVar2;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("茶\u0001"));
                }
                d32 = (List) this.f78957c;
                o oVar3 = (o) this.f78959e;
                a1.n(obj);
                oVar = oVar3;
            }
            while (!d32.isEmpty()) {
                int m4 = this.f78961g.m(d32.size());
                Object O0 = kotlin.collections.w.O0(d32);
                if (m4 < d32.size()) {
                    O0 = d32.set(m4, O0);
                }
                this.f78959e = oVar;
                this.f78957c = d32;
                this.f78958d = 1;
                if (oVar.b(O0, this) == aVar) {
                    return aVar;
                }
            }
            return k2.f75408a;
        }
    }

    @kotlin.internal.f
    private static final <T> m<T> d(ld.a<? extends Iterator<? extends T>> aVar) {
        l0.p(aVar, ProtectedSandApp.s("苾\u0001"));
        return new a(aVar);
    }

    @fg.l
    public static <T> m<T> e(@fg.l Iterator<? extends T> it) {
        l0.p(it, ProtectedSandApp.s("苿\u0001"));
        return f(new b(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static <T> m<T> f(@fg.l m<? extends T> mVar) {
        l0.p(mVar, ProtectedSandApp.s("苿\u0001"));
        return mVar instanceof kotlin.sequences.a ? mVar : new kotlin.sequences.a(mVar);
    }

    @fg.l
    public static <T> m<T> g() {
        return kotlin.sequences.g.f78900a;
    }

    @fg.l
    public static final <T, C, R> m<R> h(@fg.l m<? extends T> mVar, @fg.l ld.p<? super Integer, ? super T, ? extends C> pVar, @fg.l ld.l<? super C, ? extends Iterator<? extends R>> lVar) {
        l0.p(mVar, ProtectedSandApp.s("茀\u0001"));
        l0.p(pVar, ProtectedSandApp.s("茁\u0001"));
        l0.p(lVar, ProtectedSandApp.s("苾\u0001"));
        return q.b(new c(mVar, pVar, lVar, null));
    }

    @fg.l
    public static final <T> m<T> i(@fg.l m<? extends m<? extends T>> mVar) {
        l0.p(mVar, ProtectedSandApp.s("苿\u0001"));
        return j(mVar, d.f78948b);
    }

    private static final <T, R> m<R> j(m<? extends T> mVar, ld.l<? super T, ? extends Iterator<? extends R>> lVar) {
        return mVar instanceof a0 ? ((a0) mVar).e(lVar) : new kotlin.sequences.i(mVar, f.f78950b, lVar);
    }

    @fg.l
    @kd.i(name = "flattenSequenceOfIterable")
    public static final <T> m<T> k(@fg.l m<? extends Iterable<? extends T>> mVar) {
        l0.p(mVar, ProtectedSandApp.s("苿\u0001"));
        return j(mVar, e.f78949b);
    }

    @fg.l
    @kotlin.internal.h
    public static <T> m<T> l(@fg.m T t4, @fg.l ld.l<? super T, ? extends T> lVar) {
        l0.p(lVar, ProtectedSandApp.s("茂\u0001"));
        return t4 == null ? kotlin.sequences.g.f78900a : new kotlin.sequences.j(new h(t4), lVar);
    }

    @fg.l
    public static <T> m<T> m(@fg.l ld.a<? extends T> aVar) {
        l0.p(aVar, ProtectedSandApp.s("茂\u0001"));
        return f(new kotlin.sequences.j(aVar, new g(aVar)));
    }

    @fg.l
    public static <T> m<T> n(@fg.l ld.a<? extends T> aVar, @fg.l ld.l<? super T, ? extends T> lVar) {
        l0.p(aVar, ProtectedSandApp.s("范\u0001"));
        l0.p(lVar, ProtectedSandApp.s("茂\u0001"));
        return new kotlin.sequences.j(aVar, lVar);
    }

    @fg.l
    @c1(version = "1.3")
    public static final <T> m<T> o(@fg.l m<? extends T> mVar, @fg.l ld.a<? extends m<? extends T>> aVar) {
        l0.p(mVar, ProtectedSandApp.s("苿\u0001"));
        l0.p(aVar, ProtectedSandApp.s("茄\u0001"));
        return q.b(new i(mVar, aVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <T> m<T> p(m<? extends T> mVar) {
        return mVar == 0 ? kotlin.sequences.g.f78900a : mVar;
    }

    @fg.l
    public static <T> m<T> q(@fg.l T... tArr) {
        l0.p(tArr, ProtectedSandApp.s("茅\u0001"));
        return tArr.length == 0 ? kotlin.sequences.g.f78900a : kotlin.collections.l.K5(tArr);
    }

    @fg.l
    @c1(version = "1.4")
    public static final <T> m<T> r(@fg.l m<? extends T> mVar) {
        l0.p(mVar, ProtectedSandApp.s("苿\u0001"));
        return s(mVar, kotlin.random.f.INSTANCE);
    }

    @fg.l
    @c1(version = "1.4")
    public static final <T> m<T> s(@fg.l m<? extends T> mVar, @fg.l kotlin.random.f fVar) {
        l0.p(mVar, ProtectedSandApp.s("苿\u0001"));
        l0.p(fVar, ProtectedSandApp.s("茆\u0001"));
        return q.b(new j(mVar, fVar, null));
    }

    @fg.l
    public static final <T, R> q0<List<T>, List<R>> t(@fg.l m<? extends q0<? extends T, ? extends R>> mVar) {
        l0.p(mVar, ProtectedSandApp.s("苿\u0001"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (q0<? extends T, ? extends R> q0Var : mVar) {
            arrayList.add(q0Var.e());
            arrayList2.add(q0Var.f());
        }
        return new q0<>(arrayList, arrayList2);
    }
}
