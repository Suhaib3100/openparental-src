package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.a1;
import kotlin.collections.f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.random.Random;
import org.apache.log4j.net.SyslogAppender;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001ab\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00050\u000eH\u0000\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000e\u001a=\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0017\"\u0002H\u0002¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00050\u000eH\u0002¢\u0006\u0002\b\u001c\u001a)\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001d0\u0001H\u0007¢\u0006\u0002\b\u001e\u001a\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a2\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a!\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a&\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0007\u001a@\u0010%\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0'0&\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0&0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "flatMapIndexed", "R", "C", "source", "transform", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "generateSequence", "", "nextFunction", "seedFunction", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "shuffled", "random", "Lkotlin/random/Random;", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes6.dex */
public class s extends r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,680:1\n*E\n"})
    /* loaded from: classes5.dex */
    public static final class a<T> implements Sequence<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.a<Iterator<T>> f26929a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(q3.a<? extends Iterator<? extends T>> aVar) {
            this.f26929a = aVar;
        }

        @Override // kotlin.sequences.Sequence
        @d5.d
        public Iterator<T> iterator() {
            return this.f26929a.n();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,680:1\n30#2:681\n*E\n"})
    /* loaded from: classes5.dex */
    public static final class b<T> implements Sequence<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f26930a;

        public b(Iterator it) {
            this.f26930a = it;
        }

        @Override // kotlin.sequences.Sequence
        @d5.d
        public Iterator<T> iterator() {
            return this.f26930a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Sequences.kt */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {332}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "C", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c<R> extends RestrictedSuspendLambda implements q3.p<SequenceScope<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: q, reason: collision with root package name */
        Object f26931q;

        /* renamed from: r, reason: collision with root package name */
        int f26932r;

        /* renamed from: s, reason: collision with root package name */
        int f26933s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f26934t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f26935u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ q3.p<Integer, T, C> f26936v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ q3.l<C, Iterator<R>> f26937w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Sequence<? extends T> sequence, q3.p<? super Integer, ? super T, ? extends C> pVar, q3.l<? super C, ? extends Iterator<? extends R>> lVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f26935u = sequence;
            this.f26936v = pVar;
            this.f26937w = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            SequenceScope sequenceScope;
            int i5;
            Iterator it;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.f26933s;
            if (i6 == 0) {
                a1.n(obj);
                sequenceScope = (SequenceScope) this.f26934t;
                i5 = 0;
                it = this.f26935u.iterator();
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("豣"));
                }
                int i7 = this.f26932r;
                it = (Iterator) this.f26931q;
                sequenceScope = (SequenceScope) this.f26934t;
                a1.n(obj);
                i5 = i7;
            }
            while (it.hasNext()) {
                Object next = it.next();
                q3.p<Integer, T, C> pVar = this.f26936v;
                int i8 = i5 + 1;
                if (i5 < 0) {
                    kotlin.collections.a0.Z();
                }
                Iterator<R> N = this.f26937w.N(pVar.g0(new Integer(i5), next));
                this.f26934t = sequenceScope;
                this.f26931q = it;
                this.f26932r = i8;
                this.f26933s = 1;
                if (sequenceScope.h(N, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i5 = i8;
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d SequenceScope<? super R> sequenceScope, @d5.e Continuation<? super m2> continuation) {
            return ((c) c(sequenceScope, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            c cVar = new c(this.f26935u, this.f26936v, this.f26937w, continuation);
            cVar.f26934t = obj;
            return cVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlin/sequences/Sequence;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d<T> extends Lambda implements q3.l<Sequence<? extends T>, Iterator<? extends T>> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f26938p = new d();

        d() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> N(@d5.d Sequence<? extends T> sequence) {
            l0.p(sequence, ProtectedSandApp.s("豤"));
            return sequence.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e<T> extends Lambda implements q3.l<Iterable<? extends T>, Iterator<? extends T>> {

        /* renamed from: p, reason: collision with root package name */
        public static final e f26939p = new e();

        e() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator<T> N(@d5.d Iterable<? extends T> iterable) {
            l0.p(iterable, ProtectedSandApp.s("豥"));
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f<T> extends Lambda implements q3.l<T, T> {

        /* renamed from: p, reason: collision with root package name */
        public static final f f26940p = new f();

        f() {
            super(1);
        }

        @Override // q3.l
        public final T N(T t5) {
            return t5;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g<T> extends Lambda implements q3.l<T, T> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.a<T> f26941p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(q3.a<? extends T> aVar) {
            super(1);
            this.f26941p = aVar;
        }

        @Override // q3.l
        @d5.e
        public final T N(@d5.d T t5) {
            l0.p(t5, ProtectedSandApp.s("豦"));
            return this.f26941p.n();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h<T> extends Lambda implements q3.a<T> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ T f26942p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(T t5) {
            super(0);
            this.f26942p = t5;
        }

        @Override // q3.a
        @d5.e
        public final T n() {
            return this.f26942p;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i<T> extends RestrictedSuspendLambda implements q3.p<SequenceScope<? super T>, Continuation<? super m2>, Object> {

        /* renamed from: q, reason: collision with root package name */
        int f26943q;

        /* renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f26944r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f26945s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ q3.a<Sequence<T>> f26946t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Sequence<? extends T> sequence, q3.a<? extends Sequence<? extends T>> aVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f26945s = sequence;
            this.f26946t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f26943q;
            if (i5 == 0) {
                a1.n(obj);
                SequenceScope sequenceScope = (SequenceScope) this.f26944r;
                Iterator<? extends T> it = this.f26945s.iterator();
                if (it.hasNext()) {
                    this.f26943q = 1;
                    if (sequenceScope.h(it, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    Sequence<T> n5 = this.f26946t.n();
                    this.f26943q = 2;
                    if (sequenceScope.j(n5, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i5 != 1 && i5 != 2) {
                    throw new IllegalStateException(ProtectedSandApp.s("豧"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d SequenceScope<? super T> sequenceScope, @d5.e Continuation<? super m2> continuation) {
            return ((i) c(sequenceScope, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            i iVar = new i(this.f26945s, this.f26946t, continuation);
            iVar.f26944r = obj;
            return iVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j<T> extends RestrictedSuspendLambda implements q3.p<SequenceScope<? super T>, Continuation<? super m2>, Object> {

        /* renamed from: q, reason: collision with root package name */
        Object f26947q;

        /* renamed from: r, reason: collision with root package name */
        int f26948r;

        /* renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f26949s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Sequence<T> f26950t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Random f26951u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(Sequence<? extends T> sequence, Random random, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f26950t = sequence;
            this.f26951u = random;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            List d32;
            SequenceScope sequenceScope;
            Object O0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f26948r;
            if (i5 == 0) {
                a1.n(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.f26949s;
                d32 = v.d3(this.f26950t);
                sequenceScope = sequenceScope2;
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("豨"));
                }
                d32 = (List) this.f26947q;
                SequenceScope sequenceScope3 = (SequenceScope) this.f26949s;
                a1.n(obj);
                sequenceScope = sequenceScope3;
            }
            while (!d32.isEmpty()) {
                int m5 = this.f26951u.m(d32.size());
                O0 = f0.O0(d32);
                if (m5 < d32.size()) {
                    O0 = d32.set(m5, O0);
                }
                this.f26949s = sequenceScope;
                this.f26947q = d32;
                this.f26948r = 1;
                if (sequenceScope.f(O0, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d SequenceScope<? super T> sequenceScope, @d5.e Continuation<? super m2> continuation) {
            return ((j) c(sequenceScope, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            j jVar = new j(this.f26950t, this.f26951u, continuation);
            jVar.f26949s = obj;
            return jVar;
        }
    }

    @InlineOnly
    private static final <T> Sequence<T> d(q3.a<? extends Iterator<? extends T>> aVar) {
        l0.p(aVar, ProtectedSandApp.s("誽"));
        return new a(aVar);
    }

    @d5.d
    public static <T> Sequence<T> e(@d5.d Iterator<? extends T> it) {
        l0.p(it, ProtectedSandApp.s("誾"));
        return f(new b(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static <T> Sequence<T> f(@d5.d Sequence<? extends T> sequence) {
        l0.p(sequence, ProtectedSandApp.s("調"));
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence(sequence);
    }

    @d5.d
    public static <T> Sequence<T> g() {
        return EmptySequence.f26890a;
    }

    @d5.d
    public static final <T, C, R> Sequence<R> h(@d5.d Sequence<? extends T> sequence, @d5.d q3.p<? super Integer, ? super T, ? extends C> pVar, @d5.d q3.l<? super C, ? extends Iterator<? extends R>> lVar) {
        l0.p(sequence, ProtectedSandApp.s("諀"));
        l0.p(pVar, ProtectedSandApp.s("諁"));
        l0.p(lVar, ProtectedSandApp.s("諂"));
        return q.b(new c(sequence, pVar, lVar, null));
    }

    @d5.d
    public static final <T> Sequence<T> i(@d5.d Sequence<? extends Sequence<? extends T>> sequence) {
        l0.p(sequence, ProtectedSandApp.s("諃"));
        return j(sequence, d.f26938p);
    }

    private static final <T, R> Sequence<R> j(Sequence<? extends T> sequence, q3.l<? super T, ? extends Iterator<? extends R>> lVar) {
        return sequence instanceof TransformingSequence ? ((TransformingSequence) sequence).e(lVar) : new FlatteningSequence(sequence, f.f26940p, lVar);
    }

    @p3.i(name = "flattenSequenceOfIterable")
    @d5.d
    public static final <T> Sequence<T> k(@d5.d Sequence<? extends Iterable<? extends T>> sequence) {
        l0.p(sequence, ProtectedSandApp.s("諄"));
        return j(sequence, e.f26939p);
    }

    @LowPriorityInOverloadResolution
    @d5.d
    public static <T> Sequence<T> l(@d5.e T t5, @d5.d q3.l<? super T, ? extends T> lVar) {
        l0.p(lVar, ProtectedSandApp.s("諅"));
        return t5 == null ? EmptySequence.f26890a : new GeneratorSequence(new h(t5), lVar);
    }

    @d5.d
    public static <T> Sequence<T> m(@d5.d q3.a<? extends T> aVar) {
        l0.p(aVar, ProtectedSandApp.s("諆"));
        return f(new GeneratorSequence(aVar, new g(aVar)));
    }

    @d5.d
    public static <T> Sequence<T> n(@d5.d q3.a<? extends T> aVar, @d5.d q3.l<? super T, ? extends T> lVar) {
        l0.p(aVar, ProtectedSandApp.s("談"));
        l0.p(lVar, ProtectedSandApp.s("諈"));
        return new GeneratorSequence(aVar, lVar);
    }

    @SinceKotlin(version = "1.3")
    @d5.d
    public static final <T> Sequence<T> o(@d5.d Sequence<? extends T> sequence, @d5.d q3.a<? extends Sequence<? extends T>> aVar) {
        l0.p(sequence, ProtectedSandApp.s("諉"));
        l0.p(aVar, ProtectedSandApp.s("諊"));
        return q.b(new i(sequence, aVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Sequence<T> p(Sequence<? extends T> sequence) {
        return sequence == 0 ? EmptySequence.f26890a : sequence;
    }

    @d5.d
    public static <T> Sequence<T> q(@d5.d T... tArr) {
        Sequence<T> K5;
        l0.p(tArr, ProtectedSandApp.s("請"));
        if (tArr.length == 0) {
            return EmptySequence.f26890a;
        }
        K5 = kotlin.collections.t.K5(tArr);
        return K5;
    }

    @SinceKotlin(version = "1.4")
    @d5.d
    public static final <T> Sequence<T> r(@d5.d Sequence<? extends T> sequence) {
        l0.p(sequence, ProtectedSandApp.s("諌"));
        return s(sequence, Random.f23691o);
    }

    @SinceKotlin(version = "1.4")
    @d5.d
    public static final <T> Sequence<T> s(@d5.d Sequence<? extends T> sequence, @d5.d Random random) {
        l0.p(sequence, ProtectedSandApp.s("諍"));
        l0.p(random, ProtectedSandApp.s("諎"));
        return q.b(new j(sequence, random, null));
    }

    @d5.d
    public static final <T, R> Pair<List<T>, List<R>> t(@d5.d Sequence<? extends Pair<? extends T, ? extends R>> sequence) {
        l0.p(sequence, ProtectedSandApp.s("諏"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<? extends T, ? extends R> pair : sequence) {
            arrayList.add(pair.e());
            arrayList2.add(pair.f());
        }
        return new Pair<>(arrayList, arrayList2);
    }
}
