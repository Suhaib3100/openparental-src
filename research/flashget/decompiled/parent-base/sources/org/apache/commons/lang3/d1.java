package org.apache.commons.lang3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: ThreadUtils.java */
/* loaded from: classes6.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f85946a = new b();

    /* compiled from: ThreadUtils.java */
    private static final class b implements f, d {
        private b() {
        }

        @Override // org.apache.commons.lang3.d1.f
        public boolean a(Thread thread) {
            return true;
        }

        @Override // org.apache.commons.lang3.d1.d
        public boolean b(ThreadGroup threadGroup) {
            return true;
        }

        b(a aVar) {
        }
    }

    /* compiled from: ThreadUtils.java */
    public static class c implements f, d {

        /* renamed from: a, reason: collision with root package name */
        private final String f85947a;

        public c(String str) {
            k1.b0(str, "The name must not be null", new Object[0]);
            this.f85947a = str;
        }

        @Override // org.apache.commons.lang3.d1.f
        public boolean a(Thread thread) {
            return thread != null && thread.getName().equals(this.f85947a);
        }

        @Override // org.apache.commons.lang3.d1.d
        public boolean b(ThreadGroup threadGroup) {
            return threadGroup != null && threadGroup.getName().equals(this.f85947a);
        }
    }

    /* compiled from: ThreadUtils.java */
    @FunctionalInterface
    public interface d {
        boolean b(ThreadGroup threadGroup);
    }

    /* compiled from: ThreadUtils.java */
    public static class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final long f85948a;

        public e(long j4) {
            if (j4 <= 0) {
                throw new IllegalArgumentException("The thread id must be greater than zero");
            }
            this.f85948a = j4;
        }

        @Override // org.apache.commons.lang3.d1.f
        public boolean a(Thread thread) {
            return thread != null && thread.getId() == this.f85948a;
        }
    }

    /* compiled from: ThreadUtils.java */
    @FunctionalInterface
    public interface f {
        boolean a(Thread thread);
    }

    public static Thread a(long j4) {
        Collection<Thread> h4 = h(new e(j4));
        if (h4.isEmpty()) {
            return null;
        }
        return h4.iterator().next();
    }

    public static Thread b(long j4, String str) {
        k1.b0(str, "The thread group name must not be null", new Object[0]);
        Thread a5 = a(j4);
        if (a5 == null || a5.getThreadGroup() == null || !a5.getThreadGroup().getName().equals(str)) {
            return null;
        }
        return a5;
    }

    public static Thread c(long j4, ThreadGroup threadGroup) {
        k1.b0(threadGroup, "The thread group must not be null", new Object[0]);
        Thread a5 = a(j4);
        if (a5 == null || !threadGroup.equals(a5.getThreadGroup())) {
            return null;
        }
        return a5;
    }

    public static Collection<ThreadGroup> d(ThreadGroup threadGroup, boolean z4, d dVar) {
        ThreadGroup[] threadGroupArr;
        int enumerate;
        k1.b0(threadGroup, "The group must not be null", new Object[0]);
        k1.b0(dVar, "The predicate must not be null", new Object[0]);
        int activeGroupCount = threadGroup.activeGroupCount();
        while (true) {
            int i4 = (activeGroupCount / 2) + activeGroupCount + 1;
            threadGroupArr = new ThreadGroup[i4];
            enumerate = threadGroup.enumerate(threadGroupArr, z4);
            if (enumerate < i4) {
                break;
            }
            activeGroupCount = enumerate;
        }
        ArrayList arrayList = new ArrayList(enumerate);
        for (int i5 = 0; i5 < enumerate; i5++) {
            if (dVar.b(threadGroupArr[i5])) {
                arrayList.add(threadGroupArr[i5]);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<ThreadGroup> e(d dVar) {
        return d(n(), true, dVar);
    }

    public static Collection<ThreadGroup> f(String str) {
        return e(new c(str));
    }

    public static Collection<Thread> g(ThreadGroup threadGroup, boolean z4, f fVar) {
        Thread[] threadArr;
        int enumerate;
        k1.b0(threadGroup, "The group must not be null", new Object[0]);
        k1.b0(fVar, "The predicate must not be null", new Object[0]);
        int activeCount = threadGroup.activeCount();
        while (true) {
            int i4 = (activeCount / 2) + activeCount + 1;
            threadArr = new Thread[i4];
            enumerate = threadGroup.enumerate(threadArr, z4);
            if (enumerate < i4) {
                break;
            }
            activeCount = enumerate;
        }
        ArrayList arrayList = new ArrayList(enumerate);
        for (int i5 = 0; i5 < enumerate; i5++) {
            if (fVar.a(threadArr[i5])) {
                arrayList.add(threadArr[i5]);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<Thread> h(f fVar) {
        return g(n(), true, fVar);
    }

    public static Collection<Thread> i(String str) {
        return h(new c(str));
    }

    public static Collection<Thread> j(String str, String str2) {
        k1.b0(str, "The thread name must not be null", new Object[0]);
        k1.b0(str2, "The thread group name must not be null", new Object[0]);
        Collection<ThreadGroup> e4 = e(new c(str2));
        if (e4.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        c cVar = new c(str);
        Iterator<ThreadGroup> it = e4.iterator();
        while (it.hasNext()) {
            arrayList.addAll(g(it.next(), false, cVar));
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public static Collection<Thread> k(String str, ThreadGroup threadGroup) {
        return g(threadGroup, false, new c(str));
    }

    public static Collection<ThreadGroup> l() {
        return e(f85946a);
    }

    public static Collection<Thread> m() {
        return h(f85946a);
    }

    public static ThreadGroup n() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        return threadGroup;
    }
}
