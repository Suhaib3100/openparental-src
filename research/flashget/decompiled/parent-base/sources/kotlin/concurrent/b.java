package kotlin.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kd.i;
import kotlin.Metadata;
import kotlin.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Thread.kt */
@i(name = "ThreadsKt")
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"", "start", "isDaemon", "Ljava/lang/ClassLoader;", "contextClassLoader", "", "name", "", "priority", "Lkotlin/Function0;", "Lkotlin/k2;", "block", "Ljava/lang/Thread;", "b", "(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILld/a;)Ljava/lang/Thread;", "", "T", "Ljava/lang/ThreadLocal;", "default", "a", "(Ljava/lang/ThreadLocal;Lld/a;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes7.dex */
public final class b {

    /* compiled from: Thread.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/concurrent/b$a", "Ljava/lang/Thread;", "Lkotlin/k2;", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f75039b;

        a(ld.a<k2> aVar) {
            this.f75039b = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f75039b.invoke();
        }
    }

    @f
    private static final <T> T a(ThreadLocal<T> threadLocal, ld.a<? extends T> aVar) {
        l0.p(threadLocal, ProtectedSandApp.s("拧\u0001"));
        l0.p(aVar, ProtectedSandApp.s("拨\u0001"));
        T t4 = threadLocal.get();
        if (t4 != null) {
            return t4;
        }
        T invoke = aVar.invoke();
        threadLocal.set(invoke);
        return invoke;
    }

    @l
    public static final Thread b(boolean z4, boolean z5, @m ClassLoader classLoader, @m String str, int i4, @l ld.a<k2> aVar) {
        l0.p(aVar, ProtectedSandApp.s("择\u0001"));
        a aVar2 = new a(aVar);
        if (z5) {
            aVar2.setDaemon(true);
        }
        if (i4 > 0) {
            aVar2.setPriority(i4);
        }
        if (str != null) {
            aVar2.setName(str);
        }
        if (classLoader != null) {
            aVar2.setContextClassLoader(classLoader);
        }
        if (z4) {
            aVar2.start();
        }
        return aVar2;
    }

    public static /* synthetic */ Thread c(boolean z4, boolean z5, ClassLoader classLoader, String str, int i4, ld.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        boolean z6 = z4;
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        boolean z7 = z5;
        ClassLoader classLoader2 = (i5 & 4) != 0 ? null : classLoader;
        String str2 = (i5 & 8) != 0 ? null : str;
        if ((i5 & 16) != 0) {
            i4 = -1;
        }
        return b(z6, z7, classLoader2, str2, i4, aVar);
    }
}
