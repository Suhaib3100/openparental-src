package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PreFillQueue.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<d, Integer> f11444a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f11445b;

    /* renamed from: c, reason: collision with root package name */
    private int f11446c;

    /* renamed from: d, reason: collision with root package name */
    private int f11447d;

    public c(Map<d, Integer> map) {
        this.f11444a = map;
        this.f11445b = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.f11446c = num.intValue() + this.f11446c;
        }
    }

    public int a() {
        return this.f11446c;
    }

    public boolean b() {
        return this.f11446c == 0;
    }

    public d c() {
        d dVar = this.f11445b.get(this.f11447d);
        Integer num = this.f11444a.get(dVar);
        if (num.intValue() == 1) {
            this.f11444a.remove(dVar);
            this.f11445b.remove(this.f11447d);
        } else {
            this.f11444a.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f11446c--;
        this.f11447d = this.f11445b.isEmpty() ? 0 : (this.f11447d + 1) % this.f11445b.size();
        return dVar;
    }
}
