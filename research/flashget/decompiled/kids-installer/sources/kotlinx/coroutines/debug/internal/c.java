package kotlinx.coroutines.debug.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlinx.coroutines.internal.r0;
import q3.p;
import r3.g;

/* compiled from: ConcurrentWeakMap.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003()*B\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00052\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0019\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0007J\r\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0007R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010 ¨\u0006+"}, d2 = {"Lkotlinx/coroutines/debug/internal/c;", "", "K", "V", "Lkotlin/collections/g;", "Lkotlin/m2;", "m", "()V", "key", "value", "n", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/l;", "w", "l", "(Lkotlinx/coroutines/debug/internal/l;)V", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "remove", "clear", "p", "Ljava/lang/ref/ReferenceQueue;", "o", "Ljava/lang/ref/ReferenceQueue;", "weakRefQueue", "", "g", "()I", "size", "", "f", "()Ljava/util/Set;", "keys", "", "d", "entries", "", "<init>", "(Z)V", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class c<K, V> extends AbstractMutableMap<K, V> {

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27623p = AtomicIntegerFieldUpdater.newUpdater(c.class, ProtectedSandApp.s("郆"));

    @d5.d
    private volatile /* synthetic */ int _size;

    @d5.d
    volatile /* synthetic */ Object core;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final ReferenceQueue<K> weakRefQueue;

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00072\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u001b\"\u0004\b\u0002\u0010\u00182\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f¨\u0006%"}, d2 = {"Lkotlinx/coroutines/debug/internal/c$a;", "", "", "hash", "d", "(I)I", "index", "Lkotlin/m2;", "i", "(I)V", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lkotlinx/coroutines/debug/internal/l;", "weakKey0", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/l;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/c;", "h", "()Lkotlinx/coroutines/debug/internal/c$a;", "weakRef", "b", "(Lkotlinx/coroutines/debug/internal/l;)V", "E", "Lkotlin/Function2;", "factory", "", "e", "(Lq3/p;)Ljava/util/Iterator;", "a", "I", "allocated", "shift", "threshold", "<init>", "(Lkotlinx/coroutines/debug/internal/c;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    private final class a {

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f27625g = AtomicIntegerFieldUpdater.newUpdater(a.class, ProtectedSandApp.s("峹"));

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int allocated;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int shift;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int threshold;

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        /* synthetic */ AtomicReferenceArray f27629d;

        /* renamed from: e, reason: collision with root package name */
        @d5.d
        /* synthetic */ AtomicReferenceArray f27630e;

        @d5.d
        private volatile /* synthetic */ int load = 0;

        /* compiled from: ConcurrentWeakMap.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0007\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016R&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00028\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/debug/internal/c$a$a;", "E", "", "Lkotlin/m2;", "a", "", "hasNext", "next", "()Ljava/lang/Object;", "", "d", "Lkotlin/Function2;", "o", "Lq3/p;", "factory", "", "p", "I", "index", "q", "Ljava/lang/Object;", "key", "r", "value", "<init>", "(Lkotlinx/coroutines/debug/internal/c$a;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.debug.internal.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        private final class C0413a<E> implements Iterator<E>, r3.d {

            /* renamed from: o, reason: collision with root package name and from kotlin metadata */
            @d5.d
            private final p<K, V, E> factory;

            /* renamed from: p, reason: collision with root package name and from kotlin metadata */
            private int index = -1;

            /* renamed from: q, reason: collision with root package name and from kotlin metadata */
            private K key;

            /* renamed from: r, reason: collision with root package name and from kotlin metadata */
            private V value;

            /* JADX WARN: Multi-variable type inference failed */
            public C0413a(@d5.d p<? super K, ? super V, ? extends E> pVar) {
                this.factory = pVar;
                a();
            }

            private final void a() {
                K k5;
                while (true) {
                    int i5 = this.index + 1;
                    this.index = i5;
                    if (i5 >= ((a) a.this).allocated) {
                        return;
                    }
                    l lVar = (l) a.this.f27629d.get(this.index);
                    if (lVar != null && (k5 = (K) lVar.get()) != null) {
                        this.key = k5;
                        Object obj = (V) a.this.f27630e.get(this.index);
                        if (obj instanceof m) {
                            obj = (V) ((m) obj).ref;
                        }
                        if (obj != null) {
                            this.value = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            @d5.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                kotlinx.coroutines.debug.internal.d.e();
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
                K k5 = this.key;
                if (k5 == false) {
                    l0.S(ProtectedSandApp.s("郄"));
                    k5 = (K) m2.f23662a;
                }
                V v5 = this.value;
                if (v5 == false) {
                    l0.S(ProtectedSandApp.s("郅"));
                    v5 = (V) m2.f23662a;
                }
                E e6 = (E) pVar.g0(k5, v5);
                a();
                return e6;
            }
        }

        public a(int i5) {
            this.allocated = i5;
            this.shift = Integer.numberOfLeadingZeros(i5) + 1;
            this.threshold = (i5 * 2) / 3;
            this.f27629d = new AtomicReferenceArray(i5);
            this.f27630e = new AtomicReferenceArray(i5);
        }

        private final int d(int hash) {
            return (hash * (-1640531527)) >>> this.shift;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object g(a aVar, Object obj, Object obj2, l lVar, int i5, Object obj3) {
            if ((i5 & 4) != 0) {
                lVar = null;
            }
            return aVar.f(obj, obj2, lVar);
        }

        private final void i(int index) {
            Object obj;
            do {
                obj = this.f27630e.get(index);
                if (obj == null || (obj instanceof m)) {
                    return;
                }
            } while (!kotlinx.coroutines.debug.internal.b.a(this.f27630e, index, obj, null));
            c.this.m();
        }

        public final void b(@d5.d l<?> weakRef) {
            int d6 = d(weakRef.hash);
            while (true) {
                l<?> lVar = (l) this.f27629d.get(d6);
                if (lVar == null) {
                    return;
                }
                if (lVar == weakRef) {
                    i(d6);
                    return;
                } else {
                    if (d6 == 0) {
                        d6 = this.allocated;
                    }
                    d6--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.e
        public final V c(@d5.d K key) {
            int d6 = d(key.hashCode());
            while (true) {
                l lVar = (l) this.f27629d.get(d6);
                if (lVar == null) {
                    return null;
                }
                T t5 = lVar.get();
                if (l0.g(key, t5)) {
                    V v5 = (V) this.f27630e.get(d6);
                    return v5 instanceof m ? (V) ((m) v5).ref : v5;
                }
                if (t5 == 0) {
                    i(d6);
                }
                if (d6 == 0) {
                    d6 = this.allocated;
                }
                d6--;
            }
        }

        @d5.d
        public final <E> Iterator<E> e(@d5.d p<? super K, ? super V, ? extends E> factory) {
            return new C0413a(factory);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            r6 = r5.f27630e.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if ((r6 instanceof kotlinx.coroutines.debug.internal.m) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (kotlinx.coroutines.debug.internal.b.a(r5.f27630e, r0, r6, r7) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        
            r6 = kotlinx.coroutines.debug.internal.d.f27645c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        
            return r6;
         */
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(@d5.d K r6, @d5.e V r7, @d5.e kotlinx.coroutines.debug.internal.l<K> r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.d(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f27629d
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.l r2 = (kotlinx.coroutines.debug.internal.l) r2
                if (r2 != 0) goto L46
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L30
            L19:
                int r1 = r5.load
                int r3 = r5.threshold
                if (r1 < r3) goto L24
                kotlinx.coroutines.internal.r0 r6 = kotlinx.coroutines.debug.internal.d.a()
                return r6
            L24:
                int r3 = r1 + 1
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.debug.internal.c.a.f27625g
                boolean r1 = r4.compareAndSet(r5, r1, r3)
                if (r1 != 0) goto L2f
                goto L19
            L2f:
                r1 = 1
            L30:
                if (r8 != 0) goto L3d
                kotlinx.coroutines.debug.internal.l r8 = new kotlinx.coroutines.debug.internal.l
                kotlinx.coroutines.debug.internal.c<K, V> r3 = kotlinx.coroutines.debug.internal.c.this
                java.lang.ref.ReferenceQueue r3 = kotlinx.coroutines.debug.internal.c.k(r3)
                r8.<init>(r6, r3)
            L3d:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f27629d
                boolean r2 = kotlinx.coroutines.debug.internal.b.a(r3, r0, r2, r8)
                if (r2 != 0) goto L57
                goto L9
            L46:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.l0.g(r6, r2)
                if (r3 == 0) goto L6f
                if (r1 == 0) goto L57
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.debug.internal.c.a.f27625g
                r6.decrementAndGet(r5)
            L57:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.f27630e
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof kotlinx.coroutines.debug.internal.m
                if (r8 == 0) goto L66
                kotlinx.coroutines.internal.r0 r6 = kotlinx.coroutines.debug.internal.d.a()
                return r6
            L66:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f27630e
                boolean r8 = kotlinx.coroutines.debug.internal.b.a(r8, r0, r6, r7)
                if (r8 == 0) goto L57
                return r6
            L6f:
                if (r2 != 0) goto L74
                r5.i(r0)
            L74:
                if (r0 != 0) goto L78
                int r0 = r5.allocated
            L78:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.c.a.f(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.l):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.d
        public final c<K, V>.a h() {
            Object obj;
            r0 r0Var;
            m d6;
            while (true) {
                int i5 = c.this.get_size();
                if (i5 < 4) {
                    i5 = 4;
                }
                c<K, V>.a aVar = (c<K, V>.a) c.this.new a(Integer.highestOneBit(i5) * 4);
                int i6 = this.allocated;
                for (int i7 = 0; i7 < i6; i7++) {
                    l lVar = (l) this.f27629d.get(i7);
                    Object obj2 = lVar != null ? lVar.get() : null;
                    if (lVar != null && obj2 == null) {
                        i(i7);
                    }
                    while (true) {
                        obj = this.f27630e.get(i7);
                        if (obj instanceof m) {
                            obj = ((m) obj).ref;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f27630e;
                        d6 = kotlinx.coroutines.debug.internal.d.d(obj);
                        if (kotlinx.coroutines.debug.internal.b.a(atomicReferenceArray, i7, obj, d6)) {
                            break;
                        }
                    }
                    if (obj2 != null && obj != null) {
                        Object f6 = aVar.f(obj2, obj, lVar);
                        r0Var = kotlinx.coroutines.debug.internal.d.f27645c;
                        if (f6 != r0Var) {
                        }
                    }
                }
                return aVar;
            }
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00028\u0002\u0012\u0006\u0010\u000e\u001a\u00028\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/debug/internal/c$b;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "o", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "p", "getValue", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static final class b<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final K key;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final V value;

        public b(K k5, V v5) {
            this.key = k5;
            this.value = v5;
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
            kotlinx.coroutines.debug.internal.d.e();
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u0096\u0002R&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/debug/internal/c$c;", "E", "Lkotlin/collections/h;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "iterator", "Lkotlin/Function2;", "o", "Lq3/p;", "factory", "", "b", "()I", "size", "<init>", "(Lkotlinx/coroutines/debug/internal/c;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.debug.internal.c$c, reason: collision with other inner class name */
    private final class C0414c<E> extends AbstractMutableSet<E> {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final p<K, V, E> factory;

        /* JADX WARN: Multi-variable type inference failed */
        public C0414c(@d5.d p<? super K, ? super V, ? extends E> pVar) {
            this.factory = pVar;
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E element) {
            kotlinx.coroutines.debug.internal.d.e();
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int b() {
            return c.this.get_size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @d5.d
        public Iterator<E> iterator() {
            a aVar = (a) c.this.core;
            p<K, V, E> pVar = this.factory;
            aVar.getClass();
            return aVar.new C0413a(pVar);
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010'\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "K", "V", "k", "v", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements p<K, V, Map.Entry<K, V>> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f27641p = new d();

        d() {
            super(2);
        }

        @d5.d
        public final Map.Entry<K, V> a(@d5.d K k5, @d5.d V v5) {
            return new b(k5, v5);
        }

        @Override // q3.p
        public Object g0(Object obj, Object obj2) {
            return new b(obj, obj2);
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0006\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "V", "k", "<anonymous parameter 1>", "g0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements p<K, V, K> {

        /* renamed from: p, reason: collision with root package name */
        public static final e f27642p = new e();

        e() {
            super(2);
        }

        @Override // q3.p
        @d5.d
        public final K g0(@d5.d K k5, @d5.d V v5) {
            return k5;
        }
    }

    public c() {
        this(false, 1, null);
    }

    private final void l(l<?> w5) {
        ((a) this.core).b(w5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        f27623p.decrementAndGet(this);
    }

    private final synchronized V n(K key, V value) {
        V v5;
        r0 r0Var;
        a aVar = (a) this.core;
        while (true) {
            v5 = (V) a.g(aVar, key, value, null, 4, null);
            r0Var = kotlinx.coroutines.debug.internal.d.f27645c;
            if (v5 == r0Var) {
                aVar = aVar.h();
                this.core = aVar;
            }
        }
        return v5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = f().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // kotlin.collections.AbstractMutableMap
    @d5.d
    public Set<Map.Entry<K, V>> d() {
        return new C0414c(d.f27641p);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @d5.d
    public Set<K> f() {
        return new C0414c(e.f27642p);
    }

    @Override // kotlin.collections.AbstractMutableMap
    /* renamed from: g, reason: from getter */
    public int get_size() {
        return this._size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @d5.e
    public V get(@d5.e Object key) {
        if (key == null) {
            return null;
        }
        return (V) ((a) this.core).c(key);
    }

    public final void p() {
        if (!(this.weakRefQueue != null)) {
            throw new IllegalStateException(ProtectedSandApp.s("郈").toString());
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.weakRefQueue.remove();
                if (remove == null) {
                    throw new NullPointerException(ProtectedSandApp.s("郇"));
                }
                l((l) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @d5.e
    public V put(@d5.d K key, @d5.d V value) {
        r0 r0Var;
        V v5 = (V) a.g((a) this.core, key, value, null, 4, null);
        r0Var = kotlinx.coroutines.debug.internal.d.f27645c;
        if (v5 == r0Var) {
            v5 = n(key, value);
        }
        if (v5 == null) {
            f27623p.incrementAndGet(this);
        }
        return v5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @d5.e
    public V remove(@d5.e Object key) {
        r0 r0Var;
        if (key == 0) {
            return null;
        }
        V v5 = (V) a.g((a) this.core, key, null, null, 4, null);
        r0Var = kotlinx.coroutines.debug.internal.d.f27645c;
        if (v5 == r0Var) {
            v5 = n(key, null);
        }
        if (v5 != null) {
            f27623p.decrementAndGet(this);
        }
        return v5;
    }

    public /* synthetic */ c(boolean z5, int i5, w wVar) {
        this((i5 & 1) != 0 ? false : z5);
    }

    public c(boolean z5) {
        this._size = 0;
        this.core = new a(16);
        this.weakRefQueue = z5 ? new ReferenceQueue<>() : null;
    }
}
