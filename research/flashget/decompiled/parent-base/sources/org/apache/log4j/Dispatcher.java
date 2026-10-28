package org.apache.log4j;

import org.apache.log4j.helpers.AppenderAttachableImpl;
import org.apache.log4j.helpers.BoundedFIFO;

/* loaded from: classes3.dex */
class Dispatcher extends Thread {
    private AppenderAttachableImpl aai;

    /* renamed from: bf, reason: collision with root package name */
    private BoundedFIFO f86716bf;
    AsyncAppender container;
    private boolean interrupted = false;

    Dispatcher(BoundedFIFO boundedFIFO, AsyncAppender asyncAppender) {
        this.f86716bf = boundedFIFO;
        this.container = asyncAppender;
        this.aai = asyncAppender.aai;
        setDaemon(true);
        setPriority(1);
        setName("Dispatcher-" + getName());
    }

    void close() {
        synchronized (this.f86716bf) {
            try {
                this.interrupted = true;
                if (this.f86716bf.length() == 0) {
                    this.f86716bf.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r2 = r3.container.aai;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        r0 = r3.aai;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r0.appendLoopOnAppenders(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0043, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        throw r0;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r3 = this;
        L0:
            org.apache.log4j.helpers.BoundedFIFO r0 = r3.f86716bf
            monitor-enter(r0)
            org.apache.log4j.helpers.BoundedFIFO r1 = r3.f86716bf     // Catch: java.lang.Throwable -> L11
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L20
            boolean r1 = r3.interrupted     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L1a
        L11:
            r1 = move-exception
            goto L49
        L13:
            org.apache.log4j.helpers.BoundedFIFO r1 = r3.f86716bf     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L19
            r1.wait()     // Catch: java.lang.Throwable -> L11 java.lang.InterruptedException -> L19
            goto L20
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
        L1a:
            org.apache.log4j.helpers.AppenderAttachableImpl r0 = r3.aai
            r0.removeAllAppenders()
            return
        L20:
            org.apache.log4j.helpers.BoundedFIFO r1 = r3.f86716bf     // Catch: java.lang.Throwable -> L11
            org.apache.log4j.spi.LoggingEvent r1 = r1.get()     // Catch: java.lang.Throwable -> L11
            org.apache.log4j.helpers.BoundedFIFO r2 = r3.f86716bf     // Catch: java.lang.Throwable -> L11
            boolean r2 = r2.wasFull()     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L33
            org.apache.log4j.helpers.BoundedFIFO r2 = r3.f86716bf     // Catch: java.lang.Throwable -> L11
            r2.notify()     // Catch: java.lang.Throwable -> L11
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            org.apache.log4j.AsyncAppender r0 = r3.container
            org.apache.log4j.helpers.AppenderAttachableImpl r2 = r0.aai
            monitor-enter(r2)
            org.apache.log4j.helpers.AppenderAttachableImpl r0 = r3.aai     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L45
            if (r1 == 0) goto L45
            r0.appendLoopOnAppenders(r1)     // Catch: java.lang.Throwable -> L43
            goto L45
        L43:
            r0 = move-exception
            goto L47
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L43
            goto L0
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L43
            throw r0
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.log4j.Dispatcher.run():void");
    }
}
