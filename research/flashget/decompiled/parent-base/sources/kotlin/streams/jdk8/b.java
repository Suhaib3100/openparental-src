package kotlin.streams.jdk8;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kd.i;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.sequences.m;

/* compiled from: Streams.kt */
@i(name = "StreamsKt")
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002*\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002*\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013*\u00020\u0005H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0013*\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"T", "Ljava/util/stream/Stream;", "Lkotlin/sequences/m;", "e", "(Ljava/util/stream/Stream;)Lkotlin/sequences/m;", "Ljava/util/stream/IntStream;", "", "c", "(Ljava/util/stream/IntStream;)Lkotlin/sequences/m;", "Ljava/util/stream/LongStream;", "", "d", "(Ljava/util/stream/LongStream;)Lkotlin/sequences/m;", "Ljava/util/stream/DoubleStream;", "", "b", "(Ljava/util/stream/DoubleStream;)Lkotlin/sequences/m;", "f", "(Lkotlin/sequences/m;)Ljava/util/stream/Stream;", "", "k", "(Ljava/util/stream/Stream;)Ljava/util/List;", "i", "(Ljava/util/stream/IntStream;)Ljava/util/List;", "j", "(Ljava/util/stream/LongStream;)Ljava/util/List;", "h", "(Ljava/util/stream/DoubleStream;)Ljava/util/List;", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/sequences/s$a", "Lkotlin/sequences/m;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n31#2:681\n*E\n"})
    public static final class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Stream f79053a;

        public a(Stream stream) {
            this.f79053a = stream;
        }

        @Override // kotlin.sequences.m
        @l
        public Iterator<T> iterator() {
            Iterator<T> it = this.f79053a.iterator();
            l0.o(it, ProtectedSandApp.s("荛\u0001"));
            return it;
        }
    }

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/sequences/s$a", "Lkotlin/sequences/m;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n39#2:681\n*E\n"})
    /* renamed from: kotlin.streams.jdk8.b$b, reason: collision with other inner class name */
    public static final class C1209b implements m<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntStream f79054a;

        public C1209b(IntStream intStream) {
            this.f79054a = intStream;
        }

        @Override // kotlin.sequences.m
        @l
        public Iterator<Integer> iterator() {
            Iterator<Integer> it = this.f79054a.iterator();
            l0.o(it, ProtectedSandApp.s("荜\u0001"));
            return it;
        }
    }

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/sequences/s$a", "Lkotlin/sequences/m;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n47#2:681\n*E\n"})
    public static final class c implements m<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LongStream f79055a;

        public c(LongStream longStream) {
            this.f79055a = longStream;
        }

        @Override // kotlin.sequences.m
        @l
        public Iterator<Long> iterator() {
            Iterator<Long> it = this.f79055a.iterator();
            l0.o(it, ProtectedSandApp.s("荝\u0001"));
            return it;
        }
    }

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"kotlin/sequences/s$a", "Lkotlin/sequences/m;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n55#2:681\n*E\n"})
    public static final class d implements m<Double> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DoubleStream f79056a;

        public d(DoubleStream doubleStream) {
            this.f79056a = doubleStream;
        }

        @Override // kotlin.sequences.m
        @l
        public Iterator<Double> iterator() {
            Iterator<Double> it = this.f79056a.iterator();
            l0.o(it, ProtectedSandApp.s("荞\u0001"));
            return it;
        }
    }

    @l
    @c1(version = "1.2")
    public static final m<Double> b(@l DoubleStream doubleStream) {
        l0.p(doubleStream, ProtectedSandApp.s("荟\u0001"));
        return new d(doubleStream);
    }

    @l
    @c1(version = "1.2")
    public static final m<Integer> c(@l IntStream intStream) {
        l0.p(intStream, ProtectedSandApp.s("荟\u0001"));
        return new C1209b(intStream);
    }

    @l
    @c1(version = "1.2")
    public static final m<Long> d(@l LongStream longStream) {
        l0.p(longStream, ProtectedSandApp.s("荟\u0001"));
        return new c(longStream);
    }

    @l
    @c1(version = "1.2")
    public static final <T> m<T> e(@l Stream<T> stream) {
        l0.p(stream, ProtectedSandApp.s("荟\u0001"));
        return new a(stream);
    }

    @l
    @c1(version = "1.2")
    public static final <T> Stream<T> f(@l final m<? extends T> mVar) {
        l0.p(mVar, ProtectedSandApp.s("荟\u0001"));
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: kotlin.streams.jdk8.a
            @Override // java.util.function.Supplier
            public final Object get() {
                Spliterator g4;
                g4 = b.g(m.this);
                return g4;
            }
        }, 16, false);
        l0.o(stream, ProtectedSandApp.s("荠\u0001"));
        return stream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spliterator g(m mVar) {
        l0.p(mVar, ProtectedSandApp.s("荡\u0001"));
        return Spliterators.spliteratorUnknownSize(mVar.iterator(), 16);
    }

    @l
    @c1(version = "1.2")
    public static final List<Double> h(@l DoubleStream doubleStream) {
        l0.p(doubleStream, ProtectedSandApp.s("荟\u0001"));
        double[] array = doubleStream.toArray();
        l0.o(array, ProtectedSandApp.s("荢\u0001"));
        return kotlin.collections.l.p(array);
    }

    @l
    @c1(version = "1.2")
    public static final List<Integer> i(@l IntStream intStream) {
        l0.p(intStream, ProtectedSandApp.s("荟\u0001"));
        int[] array = intStream.toArray();
        l0.o(array, ProtectedSandApp.s("荢\u0001"));
        return kotlin.collections.l.r(array);
    }

    @l
    @c1(version = "1.2")
    public static final List<Long> j(@l LongStream longStream) {
        l0.p(longStream, ProtectedSandApp.s("荟\u0001"));
        long[] array = longStream.toArray();
        l0.o(array, ProtectedSandApp.s("荢\u0001"));
        return kotlin.collections.l.s(array);
    }

    @l
    @c1(version = "1.2")
    public static final <T> List<T> k(@l Stream<T> stream) {
        l0.p(stream, ProtectedSandApp.s("荟\u0001"));
        Object collect = stream.collect(Collectors.toList());
        l0.o(collect, ProtectedSandApp.s("荣\u0001"));
        return (List) collect;
    }
}
