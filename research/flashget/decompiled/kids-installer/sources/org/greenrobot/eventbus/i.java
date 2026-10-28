package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PendingPost.java */
/* loaded from: classes5.dex */
final class i {

    /* renamed from: d, reason: collision with root package name */
    private static final List<i> f32177d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    Object f32178a;

    /* renamed from: b, reason: collision with root package name */
    p f32179b;

    /* renamed from: c, reason: collision with root package name */
    i f32180c;

    private i(Object obj, p pVar) {
        this.f32178a = obj;
        this.f32179b = pVar;
    }

    static i a(p pVar, Object obj) {
        List<i> list = f32177d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new i(obj, pVar);
            }
            i remove = list.remove(size - 1);
            remove.f32178a = obj;
            remove.f32179b = pVar;
            remove.f32180c = null;
            return remove;
        }
    }

    static void b(i iVar) {
        iVar.f32178a = null;
        iVar.f32179b = null;
        iVar.f32180c = null;
        List<i> list = f32177d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(iVar);
            }
        }
    }
}
