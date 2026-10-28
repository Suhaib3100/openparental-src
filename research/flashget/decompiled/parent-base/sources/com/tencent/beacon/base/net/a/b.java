package com.tencent.beacon.base.net.a;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.a.c;
import com.tencent.beacon.d.h;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.beacon.pack.RequestPackageV2;
import com.tencent.beacon.pack.ResponsePackageV2;

/* compiled from: ByteV2ConverterFactory.java */
/* loaded from: classes6.dex */
public class b extends c.a<byte[], AbstractJceStruct> {

    /* renamed from: a, reason: collision with root package name */
    private final a f71143a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final C0997b f71144b = new C0997b();

    /* compiled from: ByteV2ConverterFactory.java */
    static final class a implements c<RequestPackageV2, byte[]> {
        a() {
        }

        @Override // com.tencent.beacon.base.net.a.c
        public byte[] a(RequestPackageV2 requestPackageV2) {
            if (requestPackageV2 == null) {
                return null;
            }
            String s4 = ProtectedSandApp.s("パ\u0001");
            com.tencent.beacon.base.util.c.a(s4, ProtectedSandApp.s("バ\u0001") + requestPackageV2.toString(), new Object[0]);
            com.tencent.beacon.pack.b bVar = new com.tencent.beacon.pack.b();
            requestPackageV2.writeTo(bVar);
            byte[] a5 = a(bVar.b());
            if (a5 != null) {
                com.tencent.beacon.base.util.c.a(s4, ProtectedSandApp.s("ヒ\u0001") + a5.length, new Object[0]);
            }
            return a5;
        }

        private byte[] a(byte[] bArr) {
            int a5 = com.tencent.beacon.d.b.b().a();
            h d5 = h.d();
            if (com.tencent.beacon.d.b.b().v()) {
                return com.tencent.beacon.base.util.b.b(bArr, a5, 3, d5.a());
            }
            return com.tencent.beacon.base.util.b.b(bArr, a5);
        }
    }

    /* compiled from: ByteV2ConverterFactory.java */
    /* renamed from: com.tencent.beacon.base.net.a.b$b, reason: collision with other inner class name */
    static final class C0997b implements c<byte[], ResponsePackageV2> {
        C0997b() {
        }

        private byte[] b(byte[] bArr) {
            return com.tencent.beacon.d.b.b().v() ? com.tencent.beacon.base.util.b.a(bArr, 2, 3, h.d().a()) : com.tencent.beacon.base.util.b.a(bArr, 2);
        }

        @Override // com.tencent.beacon.base.net.a.c
        public ResponsePackageV2 a(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            byte[] b5 = b(bArr);
            ResponsePackageV2 responsePackageV2 = new ResponsePackageV2();
            responsePackageV2.readFrom(new com.tencent.beacon.pack.a(b5));
            return responsePackageV2;
        }
    }

    public static b a() {
        return new b();
    }

    public c<byte[], ResponsePackageV2> b() {
        return this.f71144b;
    }

    public c<RequestPackageV2, byte[]> c() {
        return this.f71143a;
    }
}
