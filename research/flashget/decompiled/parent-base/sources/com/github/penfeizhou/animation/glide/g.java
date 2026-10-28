package com.github.penfeizhou.animation.glide;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import com.github.penfeizhou.animation.gif.decode.h;
import com.github.penfeizhou.animation.webp.decode.m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: StreamAnimationDecoder.java */
/* loaded from: classes5.dex */
public class g implements k<InputStream, com.github.penfeizhou.animation.decode.b> {

    /* renamed from: a, reason: collision with root package name */
    private final k<ByteBuffer, com.github.penfeizhou.animation.decode.b> f50847a;

    public g(k<ByteBuffer, com.github.penfeizhou.animation.decode.b> kVar) {
        this.f50847a = kVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.bumptech.glide.load.k
    @q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<com.github.penfeizhou.animation.decode.b> b(@o0 InputStream inputStream, int i4, int i5, @o0 i iVar) throws IOException {
        byte[] e4 = e(inputStream);
        if (e4 == null) {
            return null;
        }
        return this.f50847a.b(ByteBuffer.wrap(e4), i4, i5, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 InputStream inputStream, @o0 i iVar) {
        return (!((Boolean) iVar.c(a.f50829b)).booleanValue() && m.c(new com.github.penfeizhou.animation.io.e(inputStream))) || (!((Boolean) iVar.c(a.f50830c)).booleanValue() && com.github.penfeizhou.animation.apng.decode.d.c(new com.github.penfeizhou.animation.io.e(inputStream))) || ((!((Boolean) iVar.c(a.f50828a)).booleanValue() && h.d(new com.github.penfeizhou.animation.io.e(inputStream))) || (!((Boolean) iVar.c(a.f50832e)).booleanValue() && com.github.penfeizhou.animation.avif.decode.c.c(new com.github.penfeizhou.animation.io.e(inputStream))));
    }
}
