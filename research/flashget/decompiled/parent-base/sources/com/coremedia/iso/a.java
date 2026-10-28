package com.coremedia.iso;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* compiled from: AbstractBoxParser.java */
/* loaded from: classes3.dex */
public abstract class a implements c {

    /* renamed from: b, reason: collision with root package name */
    private static Logger f47567b = Logger.getLogger(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    ThreadLocal<ByteBuffer> f47568a = new C0768a();

    /* compiled from: AbstractBoxParser.java */
    /* renamed from: com.coremedia.iso.a$a, reason: collision with other inner class name */
    class C0768a extends ThreadLocal<ByteBuffer> {
        C0768a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ByteBuffer initialValue() {
            return ByteBuffer.allocate(32);
        }
    }

    @Override // com.coremedia.iso.c
    public com.coremedia.iso.boxes.b a(com.googlecode.mp4parser.a aVar, com.coremedia.iso.boxes.c cVar) throws IOException {
        int read;
        long j4;
        long j5;
        long position = aVar.position();
        this.f47568a.get().rewind().limit(8);
        do {
            read = aVar.read(this.f47568a.get());
            if (read == 8) {
                this.f47568a.get().rewind();
                long l4 = g.l(this.f47568a.get());
                long j6 = 8;
                byte[] bArr = null;
                if (l4 < 8 && l4 > 1) {
                    f47567b.severe(ProtectedSandApp.s("ག") + l4 + ProtectedSandApp.s("གྷ"));
                    return null;
                }
                String b5 = g.b(this.f47568a.get());
                if (l4 == 1) {
                    this.f47568a.get().limit(16);
                    aVar.read(this.f47568a.get());
                    this.f47568a.get().position(8);
                    j4 = g.o(this.f47568a.get()) - 16;
                } else {
                    if (l4 == 0) {
                        l4 = aVar.size();
                        j6 = aVar.position();
                    }
                    j4 = l4 - j6;
                }
                if (ProtectedSandApp.s("ང").equals(b5)) {
                    this.f47568a.get().limit(this.f47568a.get().limit() + 16);
                    aVar.read(this.f47568a.get());
                    byte[] bArr2 = new byte[16];
                    for (int position2 = this.f47568a.get().position() - 16; position2 < this.f47568a.get().position(); position2++) {
                        bArr2[position2 - (this.f47568a.get().position() - 16)] = this.f47568a.get().get(position2);
                    }
                    j5 = j4 - 16;
                    bArr = bArr2;
                } else {
                    j5 = j4;
                }
                com.coremedia.iso.boxes.b b6 = b(b5, bArr, cVar instanceof com.coremedia.iso.boxes.b ? ((com.coremedia.iso.boxes.b) cVar).getType() : "");
                b6.setParent(cVar);
                this.f47568a.get().rewind();
                b6.parse(aVar, this.f47568a.get(), j5, this);
                return b6;
            }
        } while (read >= 0);
        aVar.O1(position);
        throw new EOFException();
    }

    public abstract com.coremedia.iso.boxes.b b(String str, byte[] bArr, String str2);
}
