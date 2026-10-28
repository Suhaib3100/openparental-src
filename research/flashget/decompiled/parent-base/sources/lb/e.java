package lb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SampleFlagsSampleExtension.java */
/* loaded from: classes6.dex */
public class e implements com.mp4parser.streaming.b {

    /* renamed from: h, reason: collision with root package name */
    public static Map<Long, e> f81447h = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private byte f81448a;

    /* renamed from: b, reason: collision with root package name */
    private byte f81449b;

    /* renamed from: c, reason: collision with root package name */
    private byte f81450c;

    /* renamed from: d, reason: collision with root package name */
    private byte f81451d;

    /* renamed from: e, reason: collision with root package name */
    private byte f81452e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f81453f;

    /* renamed from: g, reason: collision with root package name */
    private int f81454g;

    public static e a(byte b5, byte b6, byte b7, byte b10, byte b11, boolean z4, int i4) {
        long j4 = (b6 << 2) + b5 + (b7 << 4) + (b10 << 6) + (b11 << 8) + (i4 << 11) + ((z4 ? 1 : 0) << 27);
        e eVar = f81447h.get(Long.valueOf(j4));
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        eVar2.f81448a = b5;
        eVar2.f81449b = b6;
        eVar2.f81450c = b7;
        eVar2.f81451d = b10;
        eVar2.f81452e = b11;
        eVar2.f81453f = z4;
        eVar2.f81454g = i4;
        f81447h.put(Long.valueOf(j4), eVar2);
        return eVar2;
    }

    public byte b() {
        return this.f81448a;
    }

    public int c() {
        return this.f81454g;
    }

    public byte d() {
        return this.f81449b;
    }

    public byte e() {
        return this.f81451d;
    }

    public byte f() {
        return this.f81450c;
    }

    public byte g() {
        return this.f81452e;
    }

    public boolean h() {
        return this.f81453f;
    }

    public boolean i() {
        return !this.f81453f;
    }

    public void j(byte b5) {
        this.f81448a = b5;
    }

    public void k(int i4) {
        this.f81454g = i4;
    }

    public void l(byte b5) {
        this.f81449b = b5;
    }

    public void m(byte b5) {
        this.f81451d = b5;
    }

    public void n(byte b5) {
        this.f81450c = b5;
    }

    public void o(boolean z4) {
        this.f81453f = z4;
    }

    public void p(byte b5) {
        this.f81452e = b5;
    }
}
