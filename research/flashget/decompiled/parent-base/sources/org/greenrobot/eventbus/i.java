package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PendingPost.java */
/* loaded from: classes6.dex */
final class i {

    /* renamed from: d, reason: collision with root package name */
    private static final List<i> f86850d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    Object f86851a;

    /* renamed from: b, reason: collision with root package name */
    p f86852b;

    /* renamed from: c, reason: collision with root package name */
    i f86853c;

    private i(Object obj, p pVar) {
        this.f86851a = obj;
        this.f86852b = pVar;
    }

    static i a(p pVar, Object obj) {
        List<i> list = f86850d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new i(obj, pVar);
                }
                i remove = list.remove(size - 1);
                remove.f86851a = obj;
                remove.f86852b = pVar;
                remove.f86853c = null;
                return remove;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void b(i iVar) {
        iVar.f86851a = null;
        iVar.f86852b = null;
        iVar.f86853c = null;
        List<i> list = f86850d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(iVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
