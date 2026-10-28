package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import androidx.compose.ui.graphics.l6;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: InitialObjectDescriptor.java */
/* loaded from: classes6.dex */
public abstract class k extends l {

    /* renamed from: e, reason: collision with root package name */
    int f63997e;

    /* renamed from: f, reason: collision with root package name */
    int f63998f;

    /* renamed from: g, reason: collision with root package name */
    int f63999g;

    /* renamed from: h, reason: collision with root package name */
    String f64000h;

    /* renamed from: i, reason: collision with root package name */
    int f64001i;

    /* renamed from: j, reason: collision with root package name */
    int f64002j;

    /* renamed from: k, reason: collision with root package name */
    int f64003k;

    /* renamed from: l, reason: collision with root package name */
    int f64004l;

    /* renamed from: m, reason: collision with root package name */
    int f64005m;

    /* renamed from: n, reason: collision with root package name */
    List<h> f64006n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    List<i> f64007o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    List<b> f64008p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    private int f64009q;

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        int i4;
        int i5 = com.coremedia.iso.g.i(byteBuffer);
        this.f64009q = (65472 & i5) >> 6;
        this.f63997e = (i5 & 63) >> 5;
        this.f63998f = (i5 & 31) >> 4;
        int b5 = b();
        int i6 = b5 - 2;
        if (this.f63997e == 1) {
            int p4 = com.coremedia.iso.g.p(byteBuffer);
            this.f63999g = p4;
            this.f64000h = com.coremedia.iso.g.h(byteBuffer, p4);
            i4 = i6 - (this.f63999g + 1);
        } else {
            this.f64001i = com.coremedia.iso.g.p(byteBuffer);
            this.f64002j = com.coremedia.iso.g.p(byteBuffer);
            this.f64003k = com.coremedia.iso.g.p(byteBuffer);
            this.f64004l = com.coremedia.iso.g.p(byteBuffer);
            this.f64005m = com.coremedia.iso.g.p(byteBuffer);
            i4 = b5 - 7;
            if (i4 > 2) {
                b a5 = m.a(-1, byteBuffer);
                i4 -= a5.b();
                if (a5 instanceof h) {
                    this.f64006n.add((h) a5);
                } else {
                    this.f64008p.add(a5);
                }
            }
        }
        if (i4 > 2) {
            b a6 = m.a(-1, byteBuffer);
            if (a6 instanceof i) {
                this.f64007o.add((i) a6);
            } else {
                this.f64008p.add(a6);
            }
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ፍ\u0001"));
        sb.append(this.f64009q);
        sb.append(ProtectedSandApp.s("ፎ\u0001"));
        sb.append(this.f63997e);
        sb.append(ProtectedSandApp.s("ፏ\u0001"));
        sb.append(this.f63998f);
        sb.append(ProtectedSandApp.s("ፐ\u0001"));
        sb.append(this.f63999g);
        sb.append(ProtectedSandApp.s("ፑ\u0001"));
        sb.append(this.f64000h);
        sb.append(ProtectedSandApp.s("ፒ\u0001"));
        sb.append(this.f64001i);
        sb.append(ProtectedSandApp.s("ፓ\u0001"));
        sb.append(this.f64002j);
        sb.append(ProtectedSandApp.s("ፔ\u0001"));
        sb.append(this.f64003k);
        sb.append(ProtectedSandApp.s("ፕ\u0001"));
        sb.append(this.f64004l);
        sb.append(ProtectedSandApp.s("ፖ\u0001"));
        sb.append(this.f64005m);
        sb.append(ProtectedSandApp.s("ፗ\u0001"));
        sb.append(this.f64006n);
        sb.append(ProtectedSandApp.s("ፘ\u0001"));
        sb.append(this.f64007o);
        sb.append(ProtectedSandApp.s("ፙ\u0001"));
        return l6.a(sb, this.f64008p, '}');
    }
}
