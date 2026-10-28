package com.googlecode.mp4parser.authoring.tracks.h264;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import ya.h;

/* compiled from: SliceHeader.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f63605a;

    /* renamed from: b, reason: collision with root package name */
    public a f63606b;

    /* renamed from: c, reason: collision with root package name */
    public int f63607c;

    /* renamed from: d, reason: collision with root package name */
    public int f63608d;

    /* renamed from: e, reason: collision with root package name */
    public int f63609e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f63610f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f63611g;

    /* renamed from: h, reason: collision with root package name */
    public int f63612h;

    /* renamed from: i, reason: collision with root package name */
    public int f63613i;

    /* renamed from: j, reason: collision with root package name */
    public int f63614j;

    /* renamed from: k, reason: collision with root package name */
    public int f63615k;

    /* renamed from: l, reason: collision with root package name */
    public int f63616l;

    /* renamed from: m, reason: collision with root package name */
    ya.e f63617m;

    /* renamed from: n, reason: collision with root package name */
    h f63618n;

    /* compiled from: SliceHeader.java */
    public enum a {
        P,
        B,
        I,
        SP,
        SI;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            int length = valuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(valuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public e(InputStream inputStream, Map<Integer, h> map, Map<Integer, ya.e> map2, boolean z4) {
        this.f63610f = false;
        this.f63611g = false;
        try {
            inputStream.read();
            com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(inputStream);
            this.f63605a = bVar.y(ProtectedSandApp.s("ඁ\u0001"));
            switch (bVar.y(ProtectedSandApp.s("ං\u0001"))) {
                case 0:
                case 5:
                    this.f63606b = a.P;
                    break;
                case 1:
                case 6:
                    this.f63606b = a.B;
                    break;
                case 2:
                case 7:
                    this.f63606b = a.I;
                    break;
                case 3:
                case 8:
                    this.f63606b = a.SP;
                    break;
                case 4:
                case 9:
                    this.f63606b = a.SI;
                    break;
            }
            int y4 = bVar.y(ProtectedSandApp.s("ඃ\u0001"));
            this.f63607c = y4;
            ya.e eVar = map2.get(Integer.valueOf(y4));
            this.f63617m = eVar;
            h hVar = map.get(Integer.valueOf(eVar.f93318f));
            this.f63618n = hVar;
            if (hVar.A) {
                this.f63608d = (int) bVar.s(2, ProtectedSandApp.s("\u0d84\u0001"));
            }
            this.f63609e = (int) bVar.s(this.f63618n.f93353j + 4, ProtectedSandApp.s("අ\u0001"));
            if (!this.f63618n.F) {
                boolean p4 = bVar.p(ProtectedSandApp.s("ආ\u0001"));
                this.f63610f = p4;
                if (p4) {
                    this.f63611g = bVar.p(ProtectedSandApp.s("ඇ\u0001"));
                }
            }
            if (z4) {
                this.f63612h = bVar.y(ProtectedSandApp.s("ඈ\u0001"));
            }
            h hVar2 = this.f63618n;
            if (hVar2.f93344a == 0) {
                this.f63613i = (int) bVar.s(hVar2.f93354k + 4, ProtectedSandApp.s("ඉ\u0001"));
                if (this.f63617m.f93319g && !this.f63610f) {
                    this.f63614j = bVar.t(ProtectedSandApp.s("ඊ\u0001"));
                }
            }
            h hVar3 = this.f63618n;
            if (hVar3.f93344a != 1 || hVar3.f93346c) {
                return;
            }
            this.f63615k = bVar.t(ProtectedSandApp.s("උ\u0001"));
            if (!this.f63617m.f93319g || this.f63610f) {
                return;
            }
            this.f63616l = bVar.t(ProtectedSandApp.s("ඌ\u0001"));
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ඍ\u0001"));
        sb.append(this.f63605a);
        sb.append(ProtectedSandApp.s("ඎ\u0001"));
        sb.append(this.f63606b);
        sb.append(ProtectedSandApp.s("ඏ\u0001"));
        sb.append(this.f63607c);
        sb.append(ProtectedSandApp.s("ඐ\u0001"));
        sb.append(this.f63608d);
        sb.append(ProtectedSandApp.s("එ\u0001"));
        sb.append(this.f63609e);
        sb.append(ProtectedSandApp.s("ඒ\u0001"));
        sb.append(this.f63610f);
        sb.append(ProtectedSandApp.s("ඓ\u0001"));
        sb.append(this.f63611g);
        sb.append(ProtectedSandApp.s("ඔ\u0001"));
        sb.append(this.f63612h);
        sb.append(ProtectedSandApp.s("ඕ\u0001"));
        sb.append(this.f63613i);
        sb.append(ProtectedSandApp.s("ඖ\u0001"));
        return androidx.view.e.a(sb, this.f63614j, '}');
    }
}
