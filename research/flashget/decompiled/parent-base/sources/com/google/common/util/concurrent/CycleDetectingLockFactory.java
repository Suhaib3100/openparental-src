package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d6;
import com.google.common.collect.l4;
import com.google.common.collect.n4;
import com.google.common.collect.p4;
import com.google.common.collect.q3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;

@b0
@d9.c
@f9.a
@d9.a
/* loaded from: classes6.dex */
public class CycleDetectingLockFactory {

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, h>> f57641b = new n4().l().i();

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f57642c = Logger.getLogger(CycleDetectingLockFactory.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<h>> f57643d = new a();

    /* renamed from: a, reason: collision with root package name */
    final j f57644a;

    @d9.a
    public static final class PotentialDeadlockException extends g {

        /* renamed from: d, reason: collision with root package name */
        private final g f57645d;

        /* synthetic */ PotentialDeadlockException(h hVar, h hVar2, g gVar, a aVar) {
            this(hVar, hVar2, gVar);
        }

        public g a() {
            return this.f57645d;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable th = this.f57645d; th != null; th = th.getCause()) {
                sb.append(ProtectedSandApp.s("淚"));
                sb.append(th.getMessage());
            }
            return sb.toString();
        }

        private PotentialDeadlockException(h hVar, h hVar2, g gVar) {
            super(hVar, hVar2);
            this.f57645d = gVar;
            initCause(gVar);
        }
    }

    class a extends ThreadLocal<ArrayList<h>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<h> initialValue() {
            return l4.u(3);
        }
    }

    private interface b {
        h a();

        boolean b();
    }

    final class c extends ReentrantLock implements b {

        /* renamed from: b, reason: collision with root package name */
        private final h f57646b;

        /* synthetic */ c(CycleDetectingLockFactory cycleDetectingLockFactory, h hVar, boolean z4, a aVar) {
            this(hVar, z4);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public h a() {
            return this.f57646b;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public boolean b() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }

        private c(h hVar, boolean z4) {
            super(z4);
            hVar.getClass();
            this.f57646b = hVar;
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j4, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this);
            try {
                return super.tryLock(j4, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this);
            }
        }
    }

    final class e extends ReentrantReadWriteLock implements b {

        /* renamed from: b, reason: collision with root package name */
        private final d f57650b;

        /* renamed from: c, reason: collision with root package name */
        private final f f57651c;

        /* renamed from: d, reason: collision with root package name */
        private final h f57652d;

        /* synthetic */ e(CycleDetectingLockFactory cycleDetectingLockFactory, h hVar, boolean z4, a aVar) {
            this(cycleDetectingLockFactory, hVar, z4);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public h a() {
            return this.f57652d;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.b
        public boolean b() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return this.f57650b;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return this.f57651c;
        }

        private e(CycleDetectingLockFactory cycleDetectingLockFactory, h hVar, boolean z4) {
            super(z4);
            this.f57650b = cycleDetectingLockFactory.new d(this);
            this.f57651c = cycleDetectingLockFactory.new f(this);
            hVar.getClass();
            this.f57652d = hVar;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return this.f57650b;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return this.f57651c;
        }
    }

    private static class g extends IllegalStateException {

        /* renamed from: b, reason: collision with root package name */
        static final StackTraceElement[] f57655b = new StackTraceElement[0];

        /* renamed from: c, reason: collision with root package name */
        static final q3<String> f57656c = q3.O(CycleDetectingLockFactory.class.getName(), g.class.getName(), h.class.getName());

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        g(com.google.common.util.concurrent.CycleDetectingLockFactory.h r4, com.google.common.util.concurrent.CycleDetectingLockFactory.h r5) {
            /*
                r3 = this;
                java.lang.String r4 = r4.d()
                java.lang.String r5 = r5.d()
                r0 = 4
                int r0 = com.google.android.gms.common.internal.b.a(r4, r0)
                int r0 = com.google.android.gms.common.internal.b.a(r5, r0)
                java.lang.String r1 = "樓"
                java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                java.lang.String r4 = com.google.common.base.h.a(r0, r4, r1, r5)
                r3.<init>(r4)
                java.lang.StackTraceElement[] r4 = r3.getStackTrace()
                int r5 = r4.length
                r0 = 0
            L24:
                if (r0 >= r5) goto L59
                java.lang.Class<com.google.common.util.concurrent.CycleDetectingLockFactory$k> r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.k.class
                java.lang.String r1 = r1.getName()
                r2 = r4[r0]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L3e
                java.lang.StackTraceElement[] r4 = com.google.common.util.concurrent.CycleDetectingLockFactory.g.f57655b
                r3.setStackTrace(r4)
                goto L59
            L3e:
                com.google.common.collect.q3<java.lang.String> r1 = com.google.common.util.concurrent.CycleDetectingLockFactory.g.f57656c
                r2 = r4[r0]
                java.lang.String r2 = r2.getClassName()
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L56
                java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r4, r0, r5)
                java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4
                r3.setStackTrace(r4)
                goto L59
            L56:
                int r0 = r0 + 1
                goto L24
            L59:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.CycleDetectingLockFactory.g.<init>(com.google.common.util.concurrent.CycleDetectingLockFactory$h, com.google.common.util.concurrent.CycleDetectingLockFactory$h):void");
        }
    }

    private static class h {

        /* renamed from: a, reason: collision with root package name */
        final Map<h, g> f57657a = new n4().l().i();

        /* renamed from: b, reason: collision with root package name */
        final Map<h, PotentialDeadlockException> f57658b = new n4().l().i();

        /* renamed from: c, reason: collision with root package name */
        final String f57659c;

        h(String str) {
            str.getClass();
            this.f57659c = str;
        }

        @zc.a
        private g c(h hVar, Set<h> set) {
            if (!set.add(this)) {
                return null;
            }
            g gVar = this.f57657a.get(hVar);
            if (gVar != null) {
                return gVar;
            }
            for (Map.Entry<h, g> entry : this.f57657a.entrySet()) {
                h key = entry.getKey();
                g c5 = key.c(hVar, set);
                if (c5 != null) {
                    g gVar2 = new g(key, this);
                    gVar2.setStackTrace(entry.getValue().getStackTrace());
                    gVar2.initCause(c5);
                    return gVar2;
                }
            }
            return null;
        }

        void a(j jVar, h hVar) {
            com.google.common.base.l0.x0(this != hVar, ProtectedSandApp.s("漏"), hVar.d());
            if (this.f57657a.containsKey(hVar)) {
                return;
            }
            PotentialDeadlockException potentialDeadlockException = this.f57658b.get(hVar);
            a aVar = null;
            if (potentialDeadlockException != null) {
                jVar.handlePotentialDeadlock(new PotentialDeadlockException(hVar, this, potentialDeadlockException.a(), aVar));
                return;
            }
            g c5 = hVar.c(this, d6.z());
            if (c5 == null) {
                this.f57657a.put(hVar, new g(hVar, this));
                return;
            }
            PotentialDeadlockException potentialDeadlockException2 = new PotentialDeadlockException(hVar, this, c5, aVar);
            this.f57658b.put(hVar, potentialDeadlockException2);
            jVar.handlePotentialDeadlock(potentialDeadlockException2);
        }

        void b(j jVar, List<h> list) {
            Iterator<h> it = list.iterator();
            while (it.hasNext()) {
                a(jVar, it.next());
            }
        }

        String d() {
            return this.f57659c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @d9.a
    public static abstract class i implements j {
        public static final i THROW = new a(ProtectedSandApp.s("累"), 0);
        public static final i WARN = new b(ProtectedSandApp.s("縷"), 1);
        public static final i DISABLED = new c(ProtectedSandApp.s("陋"), 2);
        private static final /* synthetic */ i[] $VALUES = $values();

        enum a extends i {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.j
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        }

        enum b extends i {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.j
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
                CycleDetectingLockFactory.f57642c.log(Level.SEVERE, ProtectedSandApp.s("勒"), (Throwable) potentialDeadlockException);
            }
        }

        enum c extends i {
            c(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.j
            public void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException) {
            }
        }

        private static /* synthetic */ i[] $values() {
            return new i[]{THROW, WARN, DISABLED};
        }

        private i(String str, int i4) {
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) $VALUES.clone();
        }

        /* synthetic */ i(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    @d9.a
    public interface j {
        void handlePotentialDeadlock(PotentialDeadlockException potentialDeadlockException);
    }

    @d9.a
    public static final class k<E extends Enum<E>> extends CycleDetectingLockFactory {

        /* renamed from: e, reason: collision with root package name */
        private final Map<E, h> f57660e;

        @d9.d
        k(j jVar, Map<E, h> map) {
            super(jVar, null);
            this.f57660e = map;
        }

        public ReentrantLock o(E e4) {
            return p(e4, false);
        }

        public ReentrantLock p(E e4, boolean z4) {
            if (this.f57644a == i.DISABLED) {
                return new ReentrantLock(z4);
            }
            h hVar = this.f57660e.get(e4);
            Objects.requireNonNull(hVar);
            return new c(this, hVar, z4, null);
        }

        public ReentrantReadWriteLock q(E e4) {
            return r(e4, false);
        }

        public ReentrantReadWriteLock r(E e4, boolean z4) {
            if (this.f57644a == i.DISABLED) {
                return new ReentrantReadWriteLock(z4);
            }
            h hVar = this.f57660e.get(e4);
            Objects.requireNonNull(hVar);
            return new e(this, hVar, z4, null);
        }
    }

    /* synthetic */ CycleDetectingLockFactory(j jVar, a aVar) {
        this(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        if (bVar.b()) {
            return;
        }
        ArrayList<h> arrayList = f57643d.get();
        h a5 = bVar.a();
        a5.b(this.f57644a, arrayList);
        arrayList.add(a5);
    }

    @d9.d
    static <E extends Enum<E>> Map<E, h> e(Class<E> cls) {
        EnumMap W = p4.W(cls);
        E[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        ArrayList u4 = l4.u(length);
        int i4 = 0;
        for (E e4 : enumConstants) {
            h hVar = new h(f(e4));
            u4.add(hVar);
            W.put((EnumMap) e4, (E) hVar);
        }
        for (int i5 = 1; i5 < length; i5++) {
            ((h) u4.get(i5)).b(i.THROW, u4.subList(0, i5));
        }
        while (i4 < length - 1) {
            i4++;
            ((h) u4.get(i4)).b(i.DISABLED, u4.subList(i4, length));
        }
        return Collections.unmodifiableMap(W);
    }

    private static String f(Enum<?> r32) {
        String simpleName = r32.getDeclaringClass().getSimpleName();
        String name = r32.name();
        return com.google.common.base.h.a(com.google.android.gms.common.internal.b.a(name, simpleName.length() + 1), simpleName, ProtectedSandApp.s("肋"), name);
    }

    private static <E extends Enum<E>> Map<? extends E, h> g(Class<E> cls) {
        ConcurrentMap<Class<? extends Enum<?>>, Map<? extends Enum<?>, h>> concurrentMap = f57641b;
        Map<? extends E, h> map = (Map) concurrentMap.get(cls);
        if (map != null) {
            return map;
        }
        Map<? extends Enum<?>, h> e4 = e(cls);
        return (Map) com.google.common.base.d0.a(concurrentMap.putIfAbsent(cls, e4), e4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(b bVar) {
        if (bVar.b()) {
            return;
        }
        ArrayList<h> arrayList = f57643d.get();
        h a5 = bVar.a();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == a5) {
                arrayList.remove(size);
                return;
            }
        }
    }

    public static CycleDetectingLockFactory i(j jVar) {
        return new CycleDetectingLockFactory(jVar);
    }

    public static <E extends Enum<E>> k<E> j(Class<E> cls, j jVar) {
        cls.getClass();
        jVar.getClass();
        return new k<>(jVar, g(cls));
    }

    public ReentrantLock k(String str) {
        return l(str, false);
    }

    public ReentrantLock l(String str, boolean z4) {
        return this.f57644a == i.DISABLED ? new ReentrantLock(z4) : new c(this, new h(str), z4, null);
    }

    public ReentrantReadWriteLock m(String str) {
        return n(str, false);
    }

    public ReentrantReadWriteLock n(String str, boolean z4) {
        return this.f57644a == i.DISABLED ? new ReentrantReadWriteLock(z4) : new e(this, new h(str), z4, null);
    }

    private CycleDetectingLockFactory(j jVar) {
        jVar.getClass();
        this.f57644a = jVar;
    }

    private class d extends ReentrantReadWriteLock.ReadLock {

        /* renamed from: b, reason: collision with root package name */
        @ma.i
        final e f57648b;

        d(e eVar) {
            super(eVar);
            this.f57648b = eVar;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this.f57648b);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this.f57648b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f57648b);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this.f57648b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this.f57648b);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this.f57648b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this.f57648b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j4, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f57648b);
            try {
                return super.tryLock(j4, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this.f57648b);
            }
        }
    }

    private class f extends ReentrantReadWriteLock.WriteLock {

        /* renamed from: b, reason: collision with root package name */
        @ma.i
        final e f57653b;

        f(e eVar) {
            super(eVar);
            this.f57653b = eVar;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.this.a(this.f57653b);
            try {
                super.lock();
            } finally {
                CycleDetectingLockFactory.h(this.f57653b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f57653b);
            try {
                super.lockInterruptibly();
            } finally {
                CycleDetectingLockFactory.h(this.f57653b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.this.a(this.f57653b);
            try {
                return super.tryLock();
            } finally {
                CycleDetectingLockFactory.h(this.f57653b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.h(this.f57653b);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j4, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.this.a(this.f57653b);
            try {
                return super.tryLock(j4, timeUnit);
            } finally {
                CycleDetectingLockFactory.h(this.f57653b);
            }
        }
    }
}
