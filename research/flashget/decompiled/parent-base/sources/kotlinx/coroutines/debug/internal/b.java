package kotlinx.coroutines.debug.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.d2;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kd.x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlinx.coroutines.internal.s0;
import ld.p;
import md.g;

/* compiled from: ConcurrentWeakMap.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003,\u001b\"B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u000bJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R&\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010#R\u000b\u0010(\u001a\u00020'8\u0002X\u0082\u0004R!\u0010+\u001a\u0018\u0012\u0014\u0012\u00120*R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000)8\u0002X\u0082\u0004¨\u0006-"}, d2 = {"Lkotlinx/coroutines/debug/internal/b;", "", "K", "V", "Lkotlin/collections/g;", "", "weakRefQueue", "<init>", "(Z)V", "Lkotlin/k2;", "l", "()V", "key", "value", "m", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/k;", "w", "j", "(Lkotlinx/coroutines/debug/internal/k;)V", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "remove", "clear", "o", "Ljava/lang/ref/ReferenceQueue;", "b", "Ljava/lang/ref/ReferenceQueue;", "", "d", "()I", "size", "", "c", "()Ljava/util/Set;", "keys", "", "entries", "Lkotlinx/atomicfu/AtomicInt;", "_size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/b$a;", "core", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
/* loaded from: classes7.dex */
public final class b<K, V> extends kotlin.collections.g<K, V> {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f79649c = AtomicIntegerFieldUpdater.newUpdater(b.class, ProtectedSandApp.s("蚍\u0001"));

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f79650d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, ProtectedSandApp.s("蚎\u0001"));

    @x
    private volatile int _size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ReferenceQueue<K> weakRefQueue;

    @fg.m
    @x
    private volatile Object core;

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\n2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00020\u001e\"\u0004\b\u0002\u0010\u001b2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0019\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110'8\u0002X\u0082\u0004R\u000b\u0010*\u001a\u00020)8\u0002X\u0082\u0004R\u0013\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010'8\u0002X\u0082\u0004¨\u0006,"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$a;", "", "", "allocated", "<init>", "(Lkotlinx/coroutines/debug/internal/b;I)V", "hash", "f", "(I)I", "index", "Lkotlin/k2;", "k", "(I)V", "key", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lkotlinx/coroutines/debug/internal/k;", "weakKey0", "h", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/k;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/b;", "j", "()Lkotlinx/coroutines/debug/internal/b$a;", "weakRef", "d", "(Lkotlinx/coroutines/debug/internal/k;)V", "E", "Lkotlin/Function2;", "factory", "", "g", "(Lld/p;)Ljava/util/Iterator;", "a", "I", "b", "shift", "c", "threshold", "Lkotlinx/atomicfu/AtomicArray;", "keys", "Lkotlinx/atomicfu/AtomicInt;", "load", "values", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a {

        /* renamed from: g, reason: collision with root package name */
        @fg.l
        private static final AtomicIntegerFieldUpdater f79652g = AtomicIntegerFieldUpdater.newUpdater(a.class, ProtectedSandApp.s("蚌\u0001"));

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int allocated;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int shift;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int threshold;

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        private final AtomicReferenceArray f79656d;

        /* renamed from: e, reason: collision with root package name */
        @fg.l
        private final AtomicReferenceArray f79657e;

        @x
        private volatile int load;

        /* compiled from: ConcurrentWeakMap.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00028\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$a$a;", "E", "", "Lkotlin/Function2;", "factory", "<init>", "(Lkotlinx/coroutines/debug/internal/b$a;Lld/p;)V", "Lkotlin/k2;", "b", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "c", "()Ljava/lang/Void;", "Lld/p;", "", "I", "index", "d", "Ljava/lang/Object;", "key", "e", "value", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
        /* renamed from: kotlinx.coroutines.debug.internal.b$a$a, reason: collision with other inner class name */
        private final class C1219a<E> implements Iterator<E>, md.d {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final p<K, V, E> factory;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int index = -1;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private K key;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private V value;

            /* JADX WARN: Multi-variable type inference failed */
            public C1219a(@fg.l p<? super K, ? super V, ? extends E> pVar) {
                this.factory = pVar;
                b();
            }

            private final void b() {
                K k4;
                while (true) {
                    int i4 = this.index + 1;
                    this.index = i4;
                    if (i4 >= ((a) a.this).allocated) {
                        return;
                    }
                    k kVar = (k) ((a) a.this).f79656d.get(this.index);
                    if (kVar != null && (k4 = (K) kVar.get()) != null) {
                        this.key = k4;
                        Object obj = (V) ((a) a.this).f79657e.get(this.index);
                        if (obj instanceof l) {
                            obj = (V) ((l) obj).ref;
                        }
                        if (obj != null) {
                            this.value = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            @fg.l
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                kotlinx.coroutines.debug.internal.c.e();
                throw new KotlinNothingValueException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < ((a) a.this).allocated;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.index >= ((a) a.this).allocated) {
                    throw new NoSuchElementException();
                }
                p<K, V, E> pVar = this.factory;
                K k4 = this.key;
                if (k4 == false) {
                    l0.S(ProtectedSandApp.s("蚊\u0001"));
                    k4 = (K) k2.f75408a;
                }
                V v4 = this.value;
                if (v4 == false) {
                    l0.S(ProtectedSandApp.s("蚋\u0001"));
                    v4 = (V) k2.f75408a;
                }
                E e4 = (E) pVar.invoke(k4, v4);
                b();
                return e4;
            }
        }

        public a(int i4) {
            this.allocated = i4;
            this.shift = Integer.numberOfLeadingZeros(i4) + 1;
            this.threshold = (i4 * 2) / 3;
            this.f79656d = new AtomicReferenceArray(i4);
            this.f79657e = new AtomicReferenceArray(i4);
        }

        private final int f(int hash) {
            return (hash * (-1640531527)) >>> this.shift;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object i(a aVar, Object obj, Object obj2, k kVar, int i4, Object obj3) {
            if ((i4 & 4) != 0) {
                kVar = null;
            }
            return aVar.h(obj, obj2, kVar);
        }

        private final void k(int index) {
            Object obj;
            do {
                obj = this.f79657e.get(index);
                if (obj == null || (obj instanceof l)) {
                    return;
                }
            } while (!d2.a(this.f79657e, index, obj, null));
            b.this.l();
        }

        private final void l(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ld.l<? super Integer, Integer> lVar, Object obj) {
            int i4;
            do {
                i4 = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i4, lVar.invoke(Integer.valueOf(i4)).intValue()));
        }

        public final void d(@fg.l k<?> weakRef) {
            int f4 = f(weakRef.hash);
            while (true) {
                k<?> kVar = (k) this.f79656d.get(f4);
                if (kVar == null) {
                    return;
                }
                if (kVar == weakRef) {
                    k(f4);
                    return;
                } else {
                    if (f4 == 0) {
                        f4 = this.allocated;
                    }
                    f4--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.m
        public final V e(@fg.l K key) {
            int f4 = f(key.hashCode());
            while (true) {
                k kVar = (k) this.f79656d.get(f4);
                if (kVar == null) {
                    return null;
                }
                T t4 = kVar.get();
                if (l0.g(key, t4)) {
                    V v4 = (V) this.f79657e.get(f4);
                    return v4 instanceof l ? (V) ((l) v4).ref : v4;
                }
                if (t4 == 0) {
                    k(f4);
                }
                if (f4 == 0) {
                    f4 = this.allocated;
                }
                f4--;
            }
        }

        @fg.l
        public final <E> Iterator<E> g(@fg.l p<? super K, ? super V, ? extends E> factory) {
            return new C1219a(factory);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            r6 = r5.f79657e.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            if ((r6 instanceof kotlinx.coroutines.debug.internal.l) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        
            if (com.google.common.util.concurrent.d2.a(r5.f79657e, r0, r6, r7) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        
            r6 = kotlinx.coroutines.debug.internal.c.f79672c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        
            return r6;
         */
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object h(@fg.l K r6, @fg.m V r7, @fg.m kotlinx.coroutines.debug.internal.k<K> r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.f(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f79656d
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.k r2 = (kotlinx.coroutines.debug.internal.k) r2
                if (r2 != 0) goto L47
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L31
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.debug.internal.b.a.f79652g
            L1b:
                int r1 = r3.get(r5)
                int r4 = r5.threshold
                if (r1 < r4) goto L28
                kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.debug.internal.c.a()
                return r6
            L28:
                int r4 = r1 + 1
                boolean r1 = r3.compareAndSet(r5, r1, r4)
                if (r1 == 0) goto L1b
                r1 = 1
            L31:
                if (r8 != 0) goto L3e
                kotlinx.coroutines.debug.internal.k r8 = new kotlinx.coroutines.debug.internal.k
                kotlinx.coroutines.debug.internal.b<K, V> r3 = kotlinx.coroutines.debug.internal.b.this
                java.lang.ref.ReferenceQueue r3 = kotlinx.coroutines.debug.internal.b.i(r3)
                r8.<init>(r6, r3)
            L3e:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f79656d
                boolean r2 = com.google.common.util.concurrent.d2.a(r3, r0, r2, r8)
                if (r2 != 0) goto L58
                goto L9
            L47:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.l0.g(r6, r2)
                if (r3 == 0) goto L70
                if (r1 == 0) goto L58
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.debug.internal.b.a.f79652g
                r6.decrementAndGet(r5)
            L58:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.f79657e
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof kotlinx.coroutines.debug.internal.l
                if (r8 == 0) goto L67
                kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.debug.internal.c.a()
                return r6
            L67:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f79657e
                boolean r8 = com.google.common.util.concurrent.d2.a(r8, r0, r6, r7)
                if (r8 == 0) goto L58
                return r6
            L70:
                if (r2 != 0) goto L75
                r5.k(r0)
            L75:
                if (r0 != 0) goto L79
                int r0 = r5.allocated
            L79:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.b.a.h(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.k):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.l
        public final b<K, V>.a j() {
            Object obj;
            s0 s0Var;
            l d5;
            while (true) {
                int size = b.this.getSize();
                if (size < 4) {
                    size = 4;
                }
                b<K, V>.a aVar = (b<K, V>.a) b.this.new a(Integer.highestOneBit(size) * 4);
                int i4 = this.allocated;
                for (int i5 = 0; i5 < i4; i5++) {
                    k kVar = (k) this.f79656d.get(i5);
                    Object obj2 = kVar != null ? kVar.get() : null;
                    if (kVar != null && obj2 == null) {
                        k(i5);
                    }
                    while (true) {
                        obj = this.f79657e.get(i5);
                        if (obj instanceof l) {
                            obj = ((l) obj).ref;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f79657e;
                        d5 = kotlinx.coroutines.debug.internal.c.d(obj);
                        if (d2.a(atomicReferenceArray, i5, obj, d5)) {
                            break;
                        }
                    }
                    if (obj2 != null && obj != null) {
                        Object h4 = aVar.h(obj2, obj, kVar);
                        s0Var = kotlinx.coroutines.debug.internal.c.f79672c;
                        if (h4 != s0Var) {
                        }
                    }
                }
                return aVar;
            }
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00028\u00032\u0006\u0010\b\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$b;", "K", "V", "", "key", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "c", "getValue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.debug.internal.b$b, reason: collision with other inner class name */
    private static final class C1220b<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final K key;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final V value;

        public C1220b(K k4, V v4) {
            this.key = k4;
            this.value = v4;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            kotlinx.coroutines.debug.internal.c.e();
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/debug/internal/b$c;", "E", "Lkotlin/collections/h;", "Lkotlin/Function2;", "factory", "<init>", "(Lkotlinx/coroutines/debug/internal/b;Lld/p;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "b", "Lld/p;", "", "()I", "size", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class c<E> extends kotlin.collections.h<E> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final p<K, V, E> factory;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@fg.l p<? super K, ? super V, ? extends E> pVar) {
            this.factory = pVar;
        }

        @Override // kotlin.collections.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E element) {
            kotlinx.coroutines.debug.internal.c.e();
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.collections.h
        public int b() {
            return b.this.getSize();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @fg.l
        public Iterator<E> iterator() {
            a aVar = (a) b.f79650d.get(b.this);
            p<K, V, E> pVar = this.factory;
            aVar.getClass();
            return aVar.new C1219a(pVar);
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010'\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "K", "V", "k", "v", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements p<K, V, Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f79668b = new d(2);

        d() {
            super(2);
        }

        @fg.l
        public final Map.Entry<K, V> a(@fg.l K k4, @fg.l V v4) {
            return new C1220b(k4, v4);
        }

        @Override // ld.p
        public Object invoke(Object obj, Object obj2) {
            return new C1220b(obj, obj2);
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "K", "", "V", "k", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends n0 implements p<K, V, K> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f79669b = new e(2);

        e() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        public final K invoke(@fg.l K k4, @fg.l V v4) {
            return k4;
        }
    }

    public b() {
        this(false, 1, null);
    }

    private final void j(k<?> w4) {
        ((a) f79650d.get(this)).d(w4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        f79649c.decrementAndGet(this);
    }

    private final synchronized V m(K key, V value) {
        V v4;
        s0 s0Var;
        a aVar = (a) f79650d.get(this);
        while (true) {
            v4 = (V) a.i(aVar, key, value, null, 4, null);
            s0Var = kotlinx.coroutines.debug.internal.c.f79672c;
            if (v4 == s0Var) {
                aVar = aVar.j();
                f79650d.set(this, aVar);
            }
        }
        return v4;
    }

    @Override // kotlin.collections.g
    @fg.l
    public Set<Map.Entry<K, V>> b() {
        return new c(d.f79668b);
    }

    @Override // kotlin.collections.g
    @fg.l
    public Set<K> c() {
        return new c(e.f79669b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = c().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // kotlin.collections.g
    /* renamed from: d */
    public int getSize() {
        return f79649c.get(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @fg.m
    public V get(@fg.m Object key) {
        if (key == null) {
            return null;
        }
        return (V) ((a) f79650d.get(this)).e(key);
    }

    public final void o() {
        if (this.weakRefQueue == null) {
            throw new IllegalStateException(ProtectedSandApp.s("蚐\u0001"));
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.weakRefQueue.remove();
                l0.n(remove, ProtectedSandApp.s("蚏\u0001"));
                j((k) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    @Override // kotlin.collections.g, java.util.AbstractMap, java.util.Map
    @fg.m
    public V put(@fg.l K key, @fg.l V value) {
        s0 s0Var;
        V v4 = (V) a.i((a) f79650d.get(this), key, value, null, 4, null);
        s0Var = kotlinx.coroutines.debug.internal.c.f79672c;
        if (v4 == s0Var) {
            v4 = m(key, value);
        }
        if (v4 == null) {
            f79649c.incrementAndGet(this);
        }
        return v4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @fg.m
    public V remove(@fg.m Object key) {
        s0 s0Var;
        if (key == 0) {
            return null;
        }
        V v4 = (V) a.i((a) f79650d.get(this), key, null, null, 4, null);
        s0Var = kotlinx.coroutines.debug.internal.c.f79672c;
        if (v4 == s0Var) {
            v4 = m(key, null);
        }
        if (v4 != null) {
            f79649c.decrementAndGet(this);
        }
        return v4;
    }

    public /* synthetic */ b(boolean z4, int i4, w wVar) {
        this((i4 & 1) != 0 ? false : z4);
    }

    public b(boolean z4) {
        this.core = new a(16);
        this.weakRefQueue = z4 ? new ReferenceQueue<>() : null;
    }
}
