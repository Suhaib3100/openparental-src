package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.k;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: StreamGifDecoder.java */
/* loaded from: classes3.dex */
public class j implements k<InputStream, c> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11869d = ProtectedSandApp.s("ᶈ");

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f11870a;

    /* renamed from: b, reason: collision with root package name */
    private final k<ByteBuffer, c> f11871b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f11872c;

    public j(List<ImageHeaderParser> list, k<ByteBuffer, c> kVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f11870a = list;
        this.f11871b = kVar;
        this.f11872c = bVar;
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
            Log.isLoggable(ProtectedSandApp.s("ᶇ"), 5);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<c> b(@o0 InputStream inputStream, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) throws IOException {
        byte[] e6 = e(inputStream);
        if (e6 == null) {
            return null;
        }
        return this.f11871b.b(ByteBuffer.wrap(e6), i5, i6, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 InputStream inputStream, @o0 com.bumptech.glide.load.i iVar) throws IOException {
        return !((Boolean) iVar.c(i.f11868b)).booleanValue() && com.bumptech.glide.load.e.e(this.f11870a, inputStream, this.f11872c) == ImageHeaderParser.ImageType.GIF;
    }
}
