package com.coremedia.iso;

import com.coremedia.iso.boxes.MovieBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.BasicContainer;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.WritableByteChannel;

/* compiled from: IsoFile.java */
@va.a
/* loaded from: classes3.dex */
public class f extends BasicContainer implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private static com.googlecode.mp4parser.util.i f47637b = com.googlecode.mp4parser.util.i.a(f.class);

    public f(String str) throws IOException {
        this(new com.googlecode.mp4parser.c(new File(str)));
    }

    public static String a(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 4));
        }
        try {
            return new String(bArr2, ProtectedSandApp.s("ᒬ"));
        } catch (UnsupportedEncodingException e4) {
            throw new Error(ProtectedSandApp.s("ᒭ"), e4);
        }
    }

    public static byte[] b(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i4 = 0; i4 < Math.min(4, str.length()); i4++) {
                bArr[i4] = (byte) str.charAt(i4);
            }
        }
        return bArr;
    }

    public MovieBox c() {
        for (com.coremedia.iso.boxes.b bVar : getBoxes()) {
            if (bVar instanceof MovieBox) {
                return (MovieBox) bVar;
            }
        }
        return null;
    }

    @Override // com.googlecode.mp4parser.BasicContainer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.dataSource.close();
    }

    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writeContainer(writableByteChannel);
    }

    public long getSize() {
        return getContainerSize();
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public String toString() {
        return ProtectedSandApp.s("ᒮ") + this.dataSource.toString() + ProtectedSandApp.s("ᒯ");
    }

    public f(com.googlecode.mp4parser.a aVar) throws IOException {
        this(aVar, new k(new String[0]));
    }

    public f(com.googlecode.mp4parser.a aVar, c cVar) throws IOException {
        initContainer(aVar, aVar.size(), cVar);
    }
}
