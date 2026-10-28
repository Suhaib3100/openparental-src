package org.mp4parser.aspectj.runtime.internal.cflowstack;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;

/* compiled from: ThreadStackImpl11.java */
/* loaded from: classes9.dex */
public class h implements c {

    /* renamed from: e, reason: collision with root package name */
    private static final int f87726e = 20000;

    /* renamed from: f, reason: collision with root package name */
    private static final int f87727f = 100;

    /* renamed from: b, reason: collision with root package name */
    private Thread f87729b;

    /* renamed from: c, reason: collision with root package name */
    private Stack f87730c;

    /* renamed from: a, reason: collision with root package name */
    private Hashtable f87728a = new Hashtable();

    /* renamed from: d, reason: collision with root package name */
    private int f87731d = 0;

    @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.c
    public synchronized Stack a() {
        try {
            if (Thread.currentThread() != this.f87729b) {
                Thread currentThread = Thread.currentThread();
                this.f87729b = currentThread;
                Stack stack = (Stack) this.f87728a.get(currentThread);
                this.f87730c = stack;
                if (stack == null) {
                    Stack stack2 = new Stack();
                    this.f87730c = stack2;
                    this.f87728a.put(this.f87729b, stack2);
                }
                this.f87731d++;
                if (this.f87731d > Math.max(100, 20000 / Math.max(1, this.f87728a.size()))) {
                    Stack stack3 = new Stack();
                    Enumeration keys = this.f87728a.keys();
                    while (keys.hasMoreElements()) {
                        Thread thread = (Thread) keys.nextElement();
                        if (!thread.isAlive()) {
                            stack3.push(thread);
                        }
                    }
                    Enumeration elements = stack3.elements();
                    while (elements.hasMoreElements()) {
                        this.f87728a.remove((Thread) elements.nextElement());
                    }
                    this.f87731d = 0;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f87730c;
    }

    @Override // org.mp4parser.aspectj.runtime.internal.cflowstack.c
    public void b() {
    }
}
