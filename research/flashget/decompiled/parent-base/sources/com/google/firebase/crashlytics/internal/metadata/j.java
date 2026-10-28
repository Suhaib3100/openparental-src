package com.google.firebase.crashlytics.internal.metadata;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: RolloutAssignmentList.java */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    static final String f58948c = ProtectedSandApp.s("﴿");

    /* renamed from: a, reason: collision with root package name */
    private final List<i> f58949a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final int f58950b;

    public j(int i4) {
        this.f58950b = i4;
    }

    public List<g0.f.d.e> a() {
        List<i> b5 = b();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < b5.size(); i4++) {
            arrayList.add(b5.get(i4).h());
        }
        return arrayList;
    }

    public synchronized List<i> b() {
        return Collections.unmodifiableList(new ArrayList(this.f58949a));
    }

    @f9.a
    public synchronized boolean c(List<i> list) {
        String s4 = ProtectedSandApp.s("﴾");
        synchronized (this) {
            this.f58949a.clear();
            if (list.size() <= this.f58950b) {
                return this.f58949a.addAll(list);
            }
            com.google.firebase.crashlytics.internal.g.f().m(s4 + this.f58950b);
            return this.f58949a.addAll(list.subList(0, this.f58950b));
        }
    }
}
