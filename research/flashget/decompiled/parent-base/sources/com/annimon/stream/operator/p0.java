package com.annimon.stream.operator;

import com.annimon.stream.iterator.e;
import com.annimon.stream.iterator.g;

/* compiled from: IntScanIdentity.java */
/* loaded from: classes3.dex */
public class p0 extends e.b {

    /* renamed from: e, reason: collision with root package name */
    private final g.b f41723e;

    /* renamed from: f, reason: collision with root package name */
    private final int f41724f;

    /* renamed from: g, reason: collision with root package name */
    private final com.annimon.stream.function.g0 f41725g;

    public p0(g.b bVar, int i4, com.annimon.stream.function.g0 g0Var) {
        this.f41723e = bVar;
        this.f41724f = i4;
        this.f41725g = g0Var;
    }

    @Override // com.annimon.stream.iterator.e.b
    protected void c() {
        if (!this.f41524d) {
            this.f41523c = true;
            this.f41522b = this.f41724f;
            return;
        }
        boolean hasNext = this.f41723e.hasNext();
        this.f41523c = hasNext;
        if (hasNext) {
            this.f41522b = this.f41725g.a(this.f41522b, this.f41723e.next().intValue());
        }
    }
}
