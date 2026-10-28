package x0;

import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.util.l;

/* compiled from: BytesResource.java */
/* loaded from: classes3.dex */
public class b implements u<byte[]> {

    /* renamed from: o, reason: collision with root package name */
    private final byte[] f34145o;

    public b(byte[] bArr) {
        this.f34145o = (byte[]) l.d(bArr);
    }

    @Override // com.bumptech.glide.load.engine.u
    public int a() {
        return this.f34145o.length;
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f34145o;
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<byte[]> c() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
    }
}
