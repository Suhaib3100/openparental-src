package com.google.firebase.crashlytics.internal.metadata;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: RolloutAssignmentList.java */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    static final String f15846c = ProtectedSandApp.s("ᔉ");

    /* renamed from: a, reason: collision with root package name */
    private final List<i> f15847a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final int f15848b;

    public j(int i5) {
        this.f15848b = i5;
    }

    public List<f0.f.d.e> a() {
        List<i> b6 = b();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < b6.size(); i5++) {
            arrayList.add(b6.get(i5).h());
        }
        return arrayList;
    }

    public synchronized List<i> b() {
        return Collections.unmodifiableList(new ArrayList(this.f15847a));
    }

    public synchronized boolean c(List<i> list) {
        String s5 = ProtectedSandApp.s("ᔈ");
        synchronized (this) {
            this.f15847a.clear();
            if (list.size() <= this.f15848b) {
                return this.f15847a.addAll(list);
            }
            com.google.firebase.crashlytics.internal.g.f().m(s5 + this.f15848b);
            return this.f15847a.addAll(list.subList(0, this.f15848b));
        }
    }
}
