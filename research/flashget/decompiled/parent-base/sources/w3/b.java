package w3;

import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.util.m;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: BytesResource.java */
/* loaded from: classes3.dex */
public class b implements u<byte[]> {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f92883b;

    public b(byte[] bArr) {
        this.f92883b = (byte[]) m.f(bArr, ProtectedSandApp.s("ⅰ"));
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<byte[]> a() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f92883b;
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
        return this.f92883b.length;
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
    }
}
