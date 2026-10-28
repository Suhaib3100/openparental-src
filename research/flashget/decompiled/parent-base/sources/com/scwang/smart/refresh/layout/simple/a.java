package com.scwang.smart.refresh.layout.simple;

import android.graphics.PointF;
import android.view.View;
import sc.j;

/* compiled from: SimpleBoundaryDecider.java */
/* loaded from: classes6.dex */
public class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public PointF f70694a;

    /* renamed from: b, reason: collision with root package name */
    public j f70695b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f70696c = true;

    @Override // sc.j
    public boolean a(View view) {
        j jVar = this.f70695b;
        return jVar != null ? jVar.a(view) : com.scwang.smart.refresh.layout.util.b.b(view, this.f70694a);
    }

    @Override // sc.j
    public boolean b(View view) {
        j jVar = this.f70695b;
        return jVar != null ? jVar.b(view) : com.scwang.smart.refresh.layout.util.b.a(view, this.f70694a, this.f70696c);
    }
}
