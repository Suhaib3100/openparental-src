package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.o0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.k;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: StreamGifDecoder.java */
/* loaded from: classes3.dex */
public class j implements k<InputStream, c> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f44649d = ProtectedSandApp.s("ਠ");

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f44650a;

    /* renamed from: b, reason: collision with root package name */
    private final k<ByteBuffer, c> f44651b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f44652c;

    public j(List<ImageHeaderParser> list, k<ByteBuffer, c> kVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f44650a = list;
        this.f44651b = kVar;
        this.f44652c = bVar;
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
            Log.isLoggable(ProtectedSandApp.s("ਠ"), 5);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<c> b(@o0 InputStream inputStream, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) throws IOException {
        byte[] e4 = e(inputStream);
        if (e4 == null) {
            return null;
        }
        return this.f44651b.b(ByteBuffer.wrap(e4), i4, i5, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 InputStream inputStream, @o0 com.bumptech.glide.load.i iVar) throws IOException {
        return !((Boolean) iVar.c(i.f44648b)).booleanValue() && com.bumptech.glide.load.e.f(this.f44650a, inputStream, this.f44652c) == ImageHeaderParser.ImageType.GIF;
    }
}
