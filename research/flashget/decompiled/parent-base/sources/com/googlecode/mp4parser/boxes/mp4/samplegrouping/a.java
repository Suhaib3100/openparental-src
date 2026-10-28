package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.util.o;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: CencSampleEncryptionInformationGroupEntry.java */
/* loaded from: classes6.dex */
public class a extends b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f64018d = ProtectedSandApp.s("\u139f\u0001");

    /* renamed from: a, reason: collision with root package name */
    private boolean f64019a;

    /* renamed from: b, reason: collision with root package name */
    private byte f64020b;

    /* renamed from: c, reason: collision with root package name */
    private UUID f64021c;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        i.h(allocate, this.f64019a ? 1 : 0);
        if (this.f64019a) {
            i.m(allocate, this.f64020b);
            allocate.put(o.b(this.f64021c));
        } else {
            allocate.put(new byte[17]);
        }
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return ProtectedSandApp.s("\u139f\u0001");
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
        this.f64019a = com.coremedia.iso.g.k(byteBuffer) == 1;
        this.f64020b = (byte) com.coremedia.iso.g.p(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.f64021c = o.a(bArr);
    }

    public byte e() {
        return this.f64020b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f64019a != aVar.f64019a || this.f64020b != aVar.f64020b) {
            return false;
        }
        UUID uuid = this.f64021c;
        UUID uuid2 = aVar.f64021c;
        return uuid == null ? uuid2 == null : uuid.equals(uuid2);
    }

    public UUID f() {
        return this.f64021c;
    }

    public boolean g() {
        return this.f64019a;
    }

    public void h(boolean z4) {
        this.f64019a = z4;
    }

    public int hashCode() {
        int i4 = (((this.f64019a ? 7 : 19) * 31) + this.f64020b) * 31;
        UUID uuid = this.f64021c;
        return i4 + (uuid != null ? uuid.hashCode() : 0);
    }

    public void i(int i4) {
        this.f64020b = (byte) i4;
    }

    public void j(UUID uuid) {
        this.f64021c = uuid;
    }

    public String toString() {
        return ProtectedSandApp.s("Ꭰ\u0001") + this.f64019a + ProtectedSandApp.s("Ꭱ\u0001") + ((int) this.f64020b) + ProtectedSandApp.s("Ꭲ\u0001") + this.f64021c + '}';
    }
}
