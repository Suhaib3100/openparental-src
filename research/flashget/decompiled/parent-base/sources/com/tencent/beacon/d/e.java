package com.tencent.beacon.d;

import java.util.Map;
import java.util.Set;

/* compiled from: ModuleStrategyBean.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f71428a;

    /* renamed from: b, reason: collision with root package name */
    public String f71429b = "";

    /* renamed from: c, reason: collision with root package name */
    private boolean f71430c = false;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f71431d = null;

    /* renamed from: e, reason: collision with root package name */
    private Set<String> f71432e = null;

    /* renamed from: f, reason: collision with root package name */
    private Set<String> f71433f = null;

    public e(int i4) {
        this.f71428a = i4;
    }

    public void a(boolean z4) {
        this.f71430c = z4;
    }

    public int b() {
        return this.f71428a;
    }

    public boolean c() {
        return this.f71430c;
    }

    public Map<String, String> a() {
        return this.f71431d;
    }

    public void b(Set<String> set) {
        this.f71433f = set;
    }

    public void a(Map<String, String> map) {
        this.f71431d = map;
    }

    public void a(Set<String> set) {
        this.f71432e = set;
    }
}
