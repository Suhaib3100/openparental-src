package e9;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Finalizer.java */
/* loaded from: classes6.dex */
public class a implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    @zc.a
    private static final Constructor<Thread> f73761g;

    /* renamed from: h, reason: collision with root package name */
    @zc.a
    private static final Field f73762h;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Class<?>> f73763b;

    /* renamed from: c, reason: collision with root package name */
    private final PhantomReference<Object> f73764c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<Object> f73765d;

    /* renamed from: f, reason: collision with root package name */
    private static final String f73760f = ProtectedSandApp.s("㝄\u0001");

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f73759e = Logger.getLogger(a.class.getName());

    static {
        Constructor<Thread> b5 = b();
        f73761g = b5;
        f73762h = b5 == null ? d() : null;
    }

    private a(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        this.f73765d = referenceQueue;
        this.f73763b = new WeakReference<>(cls);
        this.f73764c = phantomReference;
    }

    private boolean a(Reference<?> reference) {
        Method c5 = c();
        if (c5 == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.f73764c) {
                return false;
            }
            try {
                c5.invoke(reference, null);
            } catch (Throwable th) {
                f73759e.log(Level.SEVERE, ProtectedSandApp.s("㝅\u0001"), th);
            }
            reference = this.f73765d.poll();
        } while (reference != null);
        return true;
    }

    @zc.a
    private static Constructor<Thread> b() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    @zc.a
    private Method c() {
        Class<?> cls = this.f73763b.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(ProtectedSandApp.s("㝆\u0001"), null);
        } catch (NoSuchMethodException e4) {
            throw new AssertionError(e4);
        }
    }

    @zc.a
    private static Field d() {
        try {
            Field declaredField = Thread.class.getDeclaredField(ProtectedSandApp.s("㝇\u0001"));
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            f73759e.log(Level.INFO, ProtectedSandApp.s("㝈\u0001"));
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(10:5|6|7|(1:9)|10|11|12|(1:14)|16|17)|24|(0)|10|11|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        e9.a.f73759e.log(java.util.logging.Level.INFO, com.flashget.parentalcontrol.ProtectedSandApp.s("㝋\u0001"), r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:12:0x004d, B:14:0x0051), top: B:11:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.Class<?> r4, java.lang.ref.ReferenceQueue<java.lang.Object> r5, java.lang.ref.PhantomReference<java.lang.Object> r6) {
        /*
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "㝉\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L67
            e9.a r0 = new e9.a
            r0.<init>(r4, r5, r6)
            java.lang.Class<e9.a> r4 = e9.a.class
            java.lang.String r4 = r4.getName()
            java.lang.reflect.Constructor<java.lang.Thread> r5 = e9.a.f73761g
            r6 = 0
            if (r5 == 0) goto L41
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L33
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r0, r4, r1, r2}     // Catch: java.lang.Throwable -> L33
            java.lang.Object r5 = r5.newInstance(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Thread r5 = (java.lang.Thread) r5     // Catch: java.lang.Throwable -> L33
            goto L42
        L33:
            r5 = move-exception
            java.util.logging.Logger r1 = e9.a.f73759e
            java.util.logging.Level r2 = java.util.logging.Level.INFO
            java.lang.String r3 = "㝊\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r1.log(r2, r3, r5)
        L41:
            r5 = r6
        L42:
            if (r5 != 0) goto L49
            java.lang.Thread r5 = new java.lang.Thread
            r5.<init>(r6, r0, r4)
        L49:
            r4 = 1
            r5.setDaemon(r4)
            java.lang.reflect.Field r4 = e9.a.f73762h     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L63
            r4.set(r5, r6)     // Catch: java.lang.Throwable -> L55
            goto L63
        L55:
            r4 = move-exception
            java.util.logging.Logger r6 = e9.a.f73759e
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            java.lang.String r1 = "㝋\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r6.log(r0, r1, r4)
        L63:
            r5.start()
            return
        L67:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "㝌\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.a.e(java.lang.Class, java.lang.ref.ReferenceQueue, java.lang.ref.PhantomReference):void");
    }

    @Override // java.lang.Runnable
    public void run() {
        while (a(this.f73765d.remove())) {
        }
    }
}
