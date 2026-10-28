package org.apache.commons.lang3.stream;

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
import org.apache.commons.lang3.stream.c;
import org.apache.commons.lang3.x0;
import org.apache.commons.lang3.y0;
import xe.m0;
import xe.n;
import xe.n1;
import xe.q;
import xe.r;
import xe.r3;

/* compiled from: Streams.java */
/* loaded from: classes6.dex */
public class c {

    /* compiled from: Streams.java */
    public static class a<O> implements Collector<O, List<O>, O[]> {

        /* renamed from: b, reason: collision with root package name */
        private static final Set<Collector.Characteristics> f86116b = Collections.emptySet();

        /* renamed from: a, reason: collision with root package name */
        private final Class<O> f86117a;

        public a(Class<O> cls) {
            this.f86117a = cls;
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
            return list.toArray((Object[]) Array.newInstance((Class<?>) this.f86117a, list.size()));
        }

        @Override // java.util.stream.Collector
        public BiConsumer<List<O>, O> accumulator() {
            return new x0();
        }

        @Override // java.util.stream.Collector
        public Set<Collector.Characteristics> characteristics() {
            return f86116b;
        }

        @Override // java.util.stream.Collector
        public BinaryOperator<List<O>> combiner() {
            return new org.apache.commons.lang3.stream.b();
        }

        @Override // java.util.stream.Collector
        public Function<List<O>, O[]> finisher() {
            return new Function() { // from class: org.apache.commons.lang3.stream.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Object[] d5;
                    d5 = c.a.this.d((List) obj);
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
    public static class b<O> {

        /* renamed from: a, reason: collision with root package name */
        private Stream<O> f86118a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f86119b;

        public b(Stream<O> stream) {
            this.f86118a = stream;
        }

        public boolean a(r3<O, ?> r3Var) {
            c();
            return k().allMatch(new q(r3Var));
        }

        public boolean b(r3<O, ?> r3Var) {
            c();
            return k().anyMatch(new q(r3Var));
        }

        protected void c() {
            if (this.f86119b) {
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

        public b<O> f(r3<O, ?> r3Var) {
            c();
            this.f86118a = this.f86118a.filter(new q(r3Var));
            return this;
        }

        public void g(m0<O, ?> m0Var) {
            h();
            k().forEach(new r(m0Var));
        }

        protected void h() {
            c();
            this.f86119b = true;
        }

        public <R> b<R> i(n1<O, R, ?> n1Var) {
            c();
            return new b<>(this.f86118a.map(new n(n1Var)));
        }

        public O j(O o4, BinaryOperator<O> binaryOperator) {
            h();
            return k().reduce(o4, binaryOperator);
        }

        public Stream<O> k() {
            return this.f86118a;
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
