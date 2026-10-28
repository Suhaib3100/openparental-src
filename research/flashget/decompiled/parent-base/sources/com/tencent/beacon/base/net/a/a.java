package com.tencent.beacon.base.net.a;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.a.c;
import com.tencent.beacon.d.h;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.beacon.pack.RequestPackage;
import com.tencent.beacon.pack.ResponsePackage;

/* compiled from: ByteConverterFactory.java */
/* loaded from: classes6.dex */
public final class a extends c.a<byte[], AbstractJceStruct> {

    /* renamed from: a, reason: collision with root package name */
    private final C0996a f71141a = new C0996a();

    /* renamed from: b, reason: collision with root package name */
    private final b f71142b = new b();

    /* compiled from: ByteConverterFactory.java */
    /* renamed from: com.tencent.beacon.base.net.a.a$a, reason: collision with other inner class name */
    static final class C0996a implements c<RequestPackage, byte[]> {
        C0996a() {
        }

        private byte[] b(RequestPackage requestPackage) {
            com.tencent.beacon.pack.c cVar = new com.tencent.beacon.pack.c();
            cVar.a(1);
            String s4 = ProtectedSandApp.s("ナ\u0001");
            cVar.b(s4);
            cVar.a(s4);
            cVar.b(ProtectedSandApp.s("ニ\u0001"), requestPackage);
            return cVar.a();
        }

        @Override // com.tencent.beacon.base.net.a.c
        public byte[] a(RequestPackage requestPackage) {
            if (requestPackage == null) {
                return null;
            }
            String s4 = ProtectedSandApp.s("ネ\u0001");
            com.tencent.beacon.base.util.c.a(s4, ProtectedSandApp.s("ヌ\u0001") + requestPackage.toString(), new Object[0]);
            byte[] a5 = a(b(requestPackage));
            if (a5 != null) {
                com.tencent.beacon.base.util.c.a(s4, ProtectedSandApp.s("ノ\u0001") + a5.length, new Object[0]);
            }
            return a5;
        }

        private byte[] a(byte[] bArr) {
            h d5 = h.d();
            return d5 != null ? com.tencent.beacon.base.util.b.b(bArr, 2, 3, d5.a()) : bArr;
        }
    }

    /* compiled from: ByteConverterFactory.java */
    static final class b implements c<byte[], ResponsePackage> {
        b() {
        }

        private ResponsePackage b(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            try {
                if (bArr.length <= 0) {
                    return null;
                }
                com.tencent.beacon.pack.c cVar = new com.tencent.beacon.pack.c();
                cVar.a(bArr);
                return (ResponsePackage) cVar.a(ProtectedSandApp.s("ハ\u0001"), (String) new ResponsePackage());
            } catch (Throwable unused) {
                return null;
            }
        }

        private byte[] c(byte[] bArr) {
            return com.tencent.beacon.base.util.b.a(bArr, 2, 3, h.d().a());
        }

        @Override // com.tencent.beacon.base.net.a.c
        public ResponsePackage a(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            return b(c(bArr));
        }
    }

    public static a a() {
        return new a();
    }

    public c<byte[], ResponsePackage> b() {
        return this.f71142b;
    }

    public c<RequestPackage, byte[]> c() {
        return this.f71141a;
    }
}
