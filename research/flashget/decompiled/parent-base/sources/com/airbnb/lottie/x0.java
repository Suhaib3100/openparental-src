package com.airbnb.lottie;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PerformanceTracker.java */
/* loaded from: classes3.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f39449a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b> f39450b = new androidx.collection.d();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, com.airbnb.lottie.utils.h> f39451c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Comparator<androidx.core.util.s<String, Float>> f39452d = new a();

    /* compiled from: PerformanceTracker.java */
    class a implements Comparator<androidx.core.util.s<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(androidx.core.util.s<String, Float> sVar, androidx.core.util.s<String, Float> sVar2) {
            float floatValue = sVar.f26882b.floatValue();
            float floatValue2 = sVar2.f26882b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* compiled from: PerformanceTracker.java */
    public interface b {
        void a(float f4);
    }

    public void a(b bVar) {
        this.f39450b.add(bVar);
    }

    public void b() {
        this.f39451c.clear();
    }

    public List<androidx.core.util.s<String, Float>> c() {
        if (!this.f39449a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f39451c.size());
        for (Map.Entry<String, com.airbnb.lottie.utils.h> entry : this.f39451c.entrySet()) {
            arrayList.add(new androidx.core.util.s(entry.getKey(), Float.valueOf(entry.getValue().b())));
        }
        Collections.sort(arrayList, this.f39452d);
        return arrayList;
    }

    public void d() {
        if (this.f39449a) {
            List<androidx.core.util.s<String, Float>> c5 = c();
            for (int i4 = 0; i4 < c5.size(); i4++) {
                androidx.core.util.s<String, Float> sVar = c5.get(i4);
                String.format(ProtectedSandApp.s("̖"), sVar.f26881a, sVar.f26882b);
            }
        }
    }

    public void e(String str, float f4) {
        if (this.f39449a) {
            com.airbnb.lottie.utils.h hVar = this.f39451c.get(str);
            if (hVar == null) {
                hVar = new com.airbnb.lottie.utils.h();
                this.f39451c.put(str, hVar);
            }
            hVar.a(f4);
            if (str.equals(ProtectedSandApp.s("̗"))) {
                Iterator<b> it = this.f39450b.iterator();
                while (it.hasNext()) {
                    it.next().a(f4);
                }
            }
        }
    }

    public void f(b bVar) {
        this.f39450b.remove(bVar);
    }

    void g(boolean z4) {
        this.f39449a = z4;
    }
}
