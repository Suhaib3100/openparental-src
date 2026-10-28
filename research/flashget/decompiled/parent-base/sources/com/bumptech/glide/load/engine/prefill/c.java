package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PreFillQueue.java */
/* loaded from: classes3.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<d, Integer> f44184a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f44185b;

    /* renamed from: c, reason: collision with root package name */
    private int f44186c;

    /* renamed from: d, reason: collision with root package name */
    private int f44187d;

    public c(Map<d, Integer> map) {
        this.f44184a = map;
        this.f44185b = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.f44186c = num.intValue() + this.f44186c;
        }
    }

    public int a() {
        return this.f44186c;
    }

    public boolean b() {
        return this.f44186c == 0;
    }

    public d c() {
        d dVar = this.f44185b.get(this.f44187d);
        Integer num = this.f44184a.get(dVar);
        if (num.intValue() == 1) {
            this.f44184a.remove(dVar);
            this.f44185b.remove(this.f44187d);
        } else {
            this.f44184a.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f44186c--;
        this.f44187d = this.f44185b.isEmpty() ? 0 : (this.f44187d + 1) % this.f44185b.size();
        return dVar;
    }
}
