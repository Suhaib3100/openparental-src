package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.n;

/* compiled from: SimpleSubscriberInfo.java */
/* loaded from: classes6.dex */
public class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final e[] f32190d;

    public b(Class cls, boolean z5, e[] eVarArr) {
        super(cls, null, z5);
        this.f32190d = eVarArr;
    }

    @Override // org.greenrobot.eventbus.meta.c
    public synchronized n[] a() {
        n[] nVarArr;
        int length = this.f32190d.length;
        nVarArr = new n[length];
        for (int i5 = 0; i5 < length; i5++) {
            e eVar = this.f32190d[i5];
            nVarArr[i5] = g(eVar.f32191a, eVar.f32193c, eVar.f32192b, eVar.f32194d, eVar.f32195e);
        }
        return nVarArr;
    }
}
