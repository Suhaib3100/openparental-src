package com.tencent.liteav.videobase.utils;

import java.util.LinkedList;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList<Runnable> f72286a = new LinkedList<>();

    public final void a() {
        LinkedList linkedList;
        synchronized (this.f72286a) {
            try {
                if (this.f72286a.isEmpty()) {
                    linkedList = null;
                } else {
                    linkedList = new LinkedList(this.f72286a);
                    this.f72286a.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        while (linkedList != null && !linkedList.isEmpty()) {
            ((Runnable) linkedList.removeFirst()).run();
        }
    }
}
