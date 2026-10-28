package kotlin.streams.jdk8;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.sequences.Sequence;
import p3.i;

/* compiled from: Streams.kt */
@i(name = "StreamsKt")
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0001H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0003H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f*\u00020\u0005H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\u0007H\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007¨\u0006\r"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "", "Ljava/util/stream/DoubleStream;", "", "Ljava/util/stream/IntStream;", "", "Ljava/util/stream/LongStream;", "T", "Ljava/util/stream/Stream;", "asStream", "toList", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, pn = "kotlin.streams", xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n31#2:681\n*E\n"})
    public static final class a<T> implements Sequence<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Stream f27043a;

        public a(Stream stream) {
            this.f27043a = stream;
        }

        @Override // kotlin.sequences.Sequence
        @d5.d
        public Iterator<T> iterator() {
            Iterator<T> it = this.f27043a.iterator();
            l0.o(it, ProtectedSandApp.s("娻"));
            return it;
        }
    }

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n39#2:681\n*E\n"})
    /* renamed from: kotlin.streams.jdk8.b$b, reason: collision with other inner class name */
    public static final class C0405b implements Sequence<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntStream f27044a;

        public C0405b(IntStream intStream) {
            this.f27044a = intStream;
        }

        @Override // kotlin.sequences.Sequence
        @d5.d
        public Iterator<Integer> iterator() {
            Iterator<Integer> it = this.f27044a.iterator();
            l0.o(it, ProtectedSandApp.s("娼"));
            return it;
        }
    }

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n47#2:681\n*E\n"})
    public static final class c implements Sequence<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LongStream f27045a;

        public c(LongStream longStream) {
            this.f27045a = longStream;
        }

        @Override // kotlin.sequences.Sequence
        @d5.d
        public Iterator<Long> iterator() {
            Iterator<Long> it = this.f27045a.iterator();
            l0.o(it, ProtectedSandApp.s("娽"));
            return it;
        }
    }

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n55#2:681\n*E\n"})
    public static final class d implements Sequence<Double> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DoubleStream f27046a;

        public d(DoubleStream doubleStream) {
            this.f27046a = doubleStream;
        }

        @Override // kotlin.sequences.Sequence
        @d5.d
        public Iterator<Double> iterator() {
            Iterator<Double> it = this.f27046a.iterator();
            l0.o(it, ProtectedSandApp.s("娾"));
            return it;
        }
    }

    @SinceKotlin(version = "1.2")
    @d5.d
    public static final Sequence<Double> b(@d5.d DoubleStream doubleStream) {
        l0.p(doubleStream, ProtectedSandApp.s("娿"));
        return new d(doubleStream);
    }

    @SinceKotlin(version = "1.2")
    @d5.d
    public static final Sequence<Integer> c(@d5.d IntStream intStream) {
        l0.p(intStream, ProtectedSandApp.s("婀"));
        return new C0405b(intStream);
    }

    @SinceKotlin(version = "1.2")
    @d5.d
    public static final Sequence<Long> d(@d5.d LongStream longStream) {
        l0.p(longStream, ProtectedSandApp.s("婁"));
        return new c(longStream);
    }

    @SinceKotlin(version = "1.2")
    @d5.d
    public static final <T> Sequence<T> e(@d5.d Stream<T> stream) {
        l0.p(stream, ProtectedSandApp.s("婂"));
        return new a(stream);
    }

    @SinceKotlin(version = "1.2")
    @d5.d
    public static final <T> Stream<T> f(@d5.d final Sequence<? extends T> sequence) {
        l0.p(sequence, ProtectedSandApp.s("婃"));
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: kotlin.streams.jdk8.a
            @Override // java.util.function.Supplier
            public final Object get() {
                Spliterator g5;
                g5 = b.g(Sequence.this);
                return g5;
            }
        }, 16, false);
        l0.o(stream, ProtectedSandApp.s("婄"));
        return stream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spliterator g(Sequence sequence) {
        l0.p(sequence, ProtectedSandApp.s("婅"));
        return Spliterators.spliteratorUnknownSize(sequence.iterator(), 16);
    }

    @SinceKotlin(version = "1.2")
    @d5.d
    public static final List<Double> h(@d5.d DoubleStream doubleStream) {
        List<Double> p5;
        l0.p(doubleStream, ProtectedSandApp.s("婆"));
        double[] array = doubleStream.toArray();
        l0.o(array, ProtectedSandApp.s("婇"));
        p5 = p.p(array);
        return p5;
    }

    @SinceKotlin(version = "1.2")
    @d5.d
    public static final List<Integer> i(@d5.d IntStream intStream) {
        List<Integer> r5;
        l0.p(intStream, ProtectedSandApp.s("婈"));
        int[] array = intStream.toArray();
        l0.o(array, ProtectedSandApp.s("婉"));
        r5 = p.r(array);
        return r5;
    }

    @SinceKotlin(version = "1.2")
    @d5.d
    public static final List<Long> j(@d5.d LongStream longStream) {
        List<Long> s5;
        l0.p(longStream, ProtectedSandApp.s("婊"));
        long[] array = longStream.toArray();
        l0.o(array, ProtectedSandApp.s("婋"));
        s5 = p.s(array);
        return s5;
    }

    @SinceKotlin(version = "1.2")
    @d5.d
    public static final <T> List<T> k(@d5.d Stream<T> stream) {
        l0.p(stream, ProtectedSandApp.s("婌"));
        Object collect = stream.collect(Collectors.toList());
        l0.o(collect, ProtectedSandApp.s("婍"));
        return (List) collect;
    }
}
