package kotlin.concurrent;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import p3.i;

/* compiled from: Thread.kt */
@i(name = "ThreadsKt")
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a3\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"thread", "Ljava/lang/Thread;", "start", "", "isDaemon", "contextClassLoader", "Ljava/lang/ClassLoader;", "name", "", "priority", "", "block", "Lkotlin/Function0;", "", "getOrSet", "T", "", "Ljava/lang/ThreadLocal;", "default", "(Ljava/lang/ThreadLocal;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: Thread.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"kotlin/concurrent/ThreadsKt$thread$thread$1", "Ljava/lang/Thread;", "run", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Thread {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.a<m2> f23276o;

        a(q3.a<m2> aVar) {
            this.f23276o = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f23276o.n();
        }
    }

    @InlineOnly
    private static final <T> T a(ThreadLocal<T> threadLocal, q3.a<? extends T> aVar) {
        l0.p(threadLocal, ProtectedSandApp.s("㹳"));
        l0.p(aVar, ProtectedSandApp.s("㹴"));
        T t5 = threadLocal.get();
        if (t5 != null) {
            return t5;
        }
        T n5 = aVar.n();
        threadLocal.set(n5);
        return n5;
    }

    @d5.d
    public static final Thread b(boolean z5, boolean z6, @e ClassLoader classLoader, @e String str, int i5, @d5.d q3.a<m2> aVar) {
        l0.p(aVar, ProtectedSandApp.s("㹵"));
        a aVar2 = new a(aVar);
        if (z6) {
            aVar2.setDaemon(true);
        }
        if (i5 > 0) {
            aVar2.setPriority(i5);
        }
        if (str != null) {
            aVar2.setName(str);
        }
        if (classLoader != null) {
            aVar2.setContextClassLoader(classLoader);
        }
        if (z5) {
            aVar2.start();
        }
        return aVar2;
    }

    public static /* synthetic */ Thread c(boolean z5, boolean z6, ClassLoader classLoader, String str, int i5, q3.a aVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z5 = true;
        }
        boolean z7 = z5;
        if ((i6 & 2) != 0) {
            z6 = false;
        }
        boolean z8 = z6;
        ClassLoader classLoader2 = (i6 & 4) != 0 ? null : classLoader;
        String str2 = (i6 & 8) != 0 ? null : str;
        if ((i6 & 16) != 0) {
            i5 = -1;
        }
        return b(z7, z8, classLoader2, str2, i5, aVar);
    }
}
