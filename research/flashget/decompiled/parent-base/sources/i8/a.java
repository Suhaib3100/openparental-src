package i8;

import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.d;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: AVIFReader.java */
/* loaded from: classes5.dex */
public class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f74307b;

    public a(Reader reader) {
        super(reader);
        this.f74307b = null;
    }

    public ByteBuffer a() throws IOException {
        if (this.f74307b == null) {
            int available = available();
            byte[] bArr = new byte[available];
            read(bArr, 0, available);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(available);
            this.f74307b = allocateDirect;
            allocateDirect.put(bArr);
        }
        this.f74307b.flip();
        return this.f74307b;
    }
}
