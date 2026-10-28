package com.tencent.beacon.pack;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PacketUtil.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, byte[]> f71683a;

    /* renamed from: b, reason: collision with root package name */
    public final RequestPacket f71684b = new RequestPacket();

    /* renamed from: c, reason: collision with root package name */
    public HashMap<String, byte[]> f71685c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public String f71686d = ProtectedSandApp.s("㐵\u0001");

    /* renamed from: e, reason: collision with root package name */
    a f71687e = new a();

    static {
        HashMap<String, byte[]> hashMap = new HashMap<>();
        f71683a = hashMap;
        hashMap.put("", new byte[0]);
    }

    public void a(int i4) {
        this.f71684b.iRequestId = i4;
    }

    public void b(String str) {
        this.f71684b.sServantName = str;
    }

    public void a(String str) {
        this.f71684b.sFuncName = str;
    }

    public <T> void b(String str, T t4) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㐹\u0001"));
        }
        if (t4 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㐸\u0001"));
        }
        if (t4 instanceof Set) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㐷\u0001"));
        }
        b bVar = new b();
        bVar.a(this.f71686d);
        bVar.a(t4, 0);
        this.f71685c.put(str, a(bVar.a()));
    }

    public byte[] a() {
        b bVar = new b(0);
        bVar.a(this.f71686d);
        bVar.a((Map) this.f71685c, 0);
        RequestPacket requestPacket = this.f71684b;
        requestPacket.iVersion = (short) 3;
        requestPacket.sBuffer = a(bVar.a());
        b bVar2 = new b(0);
        bVar2.a(this.f71686d);
        this.f71684b.writeTo(bVar2);
        byte[] a5 = a(bVar2.a());
        int length = a5.length + 4;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length).put(a5).flip();
        return allocate.array();
    }

    private void b() {
        a aVar = new a(this.f71684b.sBuffer);
        aVar.a(this.f71686d);
        this.f71685c = aVar.a((Map) f71683a, 0, false);
    }

    public void a(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                a aVar = new a(bArr, 4);
                aVar.a(this.f71686d);
                this.f71684b.readFrom(aVar);
                b();
                return;
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㐶\u0001"));
    }

    public <T> T a(String str, T t4) throws Exception {
        if (!this.f71685c.containsKey(str)) {
            return null;
        }
        try {
            return (T) a(this.f71685c.get(str), t4);
        } catch (Exception e4) {
            throw new Exception(e4);
        }
    }

    private Object a(byte[] bArr, Object obj) {
        this.f71687e.a(bArr);
        this.f71687e.a(this.f71686d);
        return this.f71687e.a((a) obj, 0, true);
    }

    private byte[] a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte[] bArr = new byte[position];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, position);
        return bArr;
    }
}
