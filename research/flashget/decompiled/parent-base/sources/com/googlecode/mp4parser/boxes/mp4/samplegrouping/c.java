package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* compiled from: RateShareEntry.java */
/* loaded from: classes6.dex */
public class c extends b {

    /* renamed from: g, reason: collision with root package name */
    public static final String f64022g = ProtectedSandApp.s("Ꭵ\u0001");

    /* renamed from: a, reason: collision with root package name */
    private short f64023a;

    /* renamed from: b, reason: collision with root package name */
    private short f64024b;

    /* renamed from: c, reason: collision with root package name */
    private List<a> f64025c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private int f64026d;

    /* renamed from: e, reason: collision with root package name */
    private int f64027e;

    /* renamed from: f, reason: collision with root package name */
    private short f64028f;

    /* compiled from: RateShareEntry.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f64029a;

        /* renamed from: b, reason: collision with root package name */
        short f64030b;

        public a(int i4, short s4) {
            this.f64029a = i4;
            this.f64030b = s4;
        }

        public int a() {
            return this.f64029a;
        }

        public short b() {
            return this.f64030b;
        }

        public void c(int i4) {
            this.f64029a = i4;
        }

        public void d(short s4) {
            this.f64030b = s4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f64029a == aVar.f64029a && this.f64030b == aVar.f64030b;
        }

        public int hashCode() {
            return (this.f64029a * 31) + this.f64030b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ꭳ\u0001"));
            sb.append(this.f64029a);
            sb.append(ProtectedSandApp.s("Ꭴ\u0001"));
            return androidx.view.e.a(sb, this.f64030b, '}');
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        short s4 = this.f64023a;
        ByteBuffer allocate = ByteBuffer.allocate(s4 == 1 ? 13 : (s4 * 6) + 11);
        allocate.putShort(this.f64023a);
        if (this.f64023a == 1) {
            allocate.putShort(this.f64024b);
        } else {
            for (a aVar : this.f64025c) {
                allocate.putInt(aVar.a());
                allocate.putShort(aVar.b());
            }
        }
        allocate.putInt(this.f64026d);
        allocate.putInt(this.f64027e);
        i.m(allocate, this.f64028f);
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return ProtectedSandApp.s("Ꭵ\u0001");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
        short s4 = byteBuffer.getShort();
        this.f64023a = s4;
        if (s4 == 1) {
            this.f64024b = byteBuffer.getShort();
        } else {
            while (true) {
                ?? r12 = s4 - 1;
                if (s4 <= 0) {
                    break;
                }
                this.f64025c.add(new a(com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer)), byteBuffer.getShort()));
                s4 = r12;
            }
        }
        this.f64026d = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f64027e = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f64028f = (short) com.coremedia.iso.g.p(byteBuffer);
    }

    public short e() {
        return this.f64028f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f64028f != cVar.f64028f || this.f64026d != cVar.f64026d || this.f64027e != cVar.f64027e || this.f64023a != cVar.f64023a || this.f64024b != cVar.f64024b) {
            return false;
        }
        List<a> list = this.f64025c;
        List<a> list2 = cVar.f64025c;
        return list == null ? list2 == null : list.equals(list2);
    }

    public List<a> f() {
        return this.f64025c;
    }

    public int g() {
        return this.f64026d;
    }

    public int h() {
        return this.f64027e;
    }

    public int hashCode() {
        int i4 = ((this.f64023a * 31) + this.f64024b) * 31;
        List<a> list = this.f64025c;
        return ((((((i4 + (list != null ? list.hashCode() : 0)) * 31) + this.f64026d) * 31) + this.f64027e) * 31) + this.f64028f;
    }

    public short i() {
        return this.f64023a;
    }

    public short j() {
        return this.f64024b;
    }

    public void k(short s4) {
        this.f64028f = s4;
    }

    public void l(List<a> list) {
        this.f64025c = list;
    }

    public void m(int i4) {
        this.f64026d = i4;
    }

    public void n(int i4) {
        this.f64027e = i4;
    }

    public void o(short s4) {
        this.f64023a = s4;
    }

    public void p(short s4) {
        this.f64024b = s4;
    }
}
