package org.apache.commons.lang3;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;
import org.apache.commons.lang3.m0;
import org.apache.commons.lang3.z0;

/* compiled from: Streams.java */
@Deprecated
/* loaded from: classes6.dex */
public class z0 {

    /* compiled from: Streams.java */
    @Deprecated
    public static class a<O> implements Collector<O, List<O>, O[]> {

        /* renamed from: b, reason: collision with root package name */
        private static final Set<Collector.Characteristics> f86420b = Collections.emptySet();

        /* renamed from: a, reason: collision with root package name */
        private final Class<O> f86421a;

        public a(Class<O> cls) {
            this.f86421a = cls;
        }

        public static /* synthetic */ List a(List list, List list2) {
            list.addAll(list2);
            return list;
        }

        private static /* synthetic */ List c(List list, List list2) {
            list.addAll(list2);
            return list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object[] d(List list) {
            return list.toArray((Object[]) Array.newInstance((Class<?>) this.f86421a, list.size()));
        }

        @Override // java.util.stream.Collector
        public BiConsumer<List<O>, O> accumulator() {
            return new x0();
        }

        @Override // java.util.stream.Collector
        public Set<Collector.Characteristics> characteristics() {
            return f86420b;
        }

        @Override // java.util.stream.Collector
        public BinaryOperator<List<O>> combiner() {
            return new w0();
        }

        @Override // java.util.stream.Collector
        public Function<List<O>, O[]> finisher() {
            return new Function() { // from class: org.apache.commons.lang3.v0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Object[] d5;
                    d5 = z0.a.this.d((List) obj);
                    return d5;
                }
            };
        }

        @Override // java.util.stream.Collector
        public Supplier<List<O>> supplier() {
            return new y0();
        }
    }

    /* compiled from: Streams.java */
    @Deprecated
    public static class b<O> {

        /* renamed from: a, reason: collision with root package name */
        private Stream<O> f86422a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f86423b;

        public b(Stream<O> stream) {
            this.f86422a = stream;
        }

        public boolean a(m0.g<O, ?> gVar) {
            c();
            return k().allMatch(new v(gVar));
        }

        public boolean b(m0.g<O, ?> gVar) {
            c();
            return k().anyMatch(new v(gVar));
        }

        protected void c() {
            if (this.f86423b) {
                throw new IllegalStateException("This stream is already terminated.");
            }
        }

        public <A, R> R d(Supplier<R> supplier, BiConsumer<R, ? super O> biConsumer, BiConsumer<R, R> biConsumer2) {
            h();
            return (R) k().collect(supplier, biConsumer, biConsumer2);
        }

        public <A, R> R e(Collector<? super O, A, R> collector) {
            h();
            return (R) k().collect(collector);
        }

        public b<O> f(m0.g<O, ?> gVar) {
            c();
            this.f86422a = this.f86422a.filter(new v(gVar));
            return this;
        }

        public void g(m0.e<O, ?> eVar) {
            h();
            k().forEach(new y(eVar));
        }

        protected void h() {
            c();
            this.f86423b = true;
        }

        public <R> b<R> i(m0.f<O, R, ?> fVar) {
            c();
            return new b<>(this.f86422a.map(new l0(fVar)));
        }

        public O j(O o4, BinaryOperator<O> binaryOperator) {
            h();
            return k().reduce(o4, binaryOperator);
        }

        public Stream<O> k() {
            return this.f86422a;
        }
    }

    public static <O> b<O> a(Collection<O> collection) {
        return new b<>(collection.stream());
    }

    public static <O> b<O> b(Stream<O> stream) {
        return new b<>(stream);
    }

    public static <O> Collector<O, ?, O[]> c(Class<O> cls) {
        return new a(cls);
    }
}
