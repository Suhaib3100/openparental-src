package com.github.penfeizhou.animation.avif.decode;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.annotation.q0;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.loader.d;
import java.io.IOException;
import org.aomedia.avif.android.AvifDecoder;

/* compiled from: AVIFDecoder.java */
/* loaded from: classes5.dex */
public class a extends com.github.penfeizhou.animation.decode.b<i8.a, i8.b> {

    /* renamed from: y, reason: collision with root package name */
    private AvifDecoder f50754y;

    public a(d dVar, @q0 b.j jVar) {
        super(dVar, jVar);
        this.f50754y = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public int C() {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void N() {
        AvifDecoder avifDecoder = this.f50754y;
        if (avifDecoder != null) {
            avifDecoder.release();
            this.f50754y = null;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void P(com.github.penfeizhou.animation.decode.a<i8.a, i8.b> aVar) {
        Bitmap J = J(this.f50754y.getWidth(), this.f50754y.getHeight());
        AvifDecoder avifDecoder = this.f50754y;
        if (avifDecoder == null) {
            return;
        }
        int i4 = this.f50764e;
        int i5 = ((b) aVar).f50755a;
        if (i4 != i5) {
            avifDecoder.nthFrame(i5, J);
        } else if (i4 == 0) {
            avifDecoder.nthFrame(0, J);
        } else {
            avifDecoder.nextFrame(J);
        }
        this.f50774o.rewind();
        try {
            J.copyPixelsToBuffer(this.f50774o);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        M(J);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public i8.a B(Reader reader) {
        return new i8.a(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public i8.b D() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Rect L(i8.a aVar) throws IOException {
        this.f50754y = AvifDecoder.create(aVar.a());
        return new Rect(0, 0, this.f50754y.getWidth(), this.f50754y.getHeight());
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public com.github.penfeizhou.animation.decode.a<i8.a, i8.b> u(int i4) {
        b bVar = new b(null);
        bVar.f50755a = i4;
        bVar.frameDuration = (int) (this.f50754y.getFrameDurations()[i4] * 1000.0d);
        return bVar;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public Bitmap v(int i4) throws IOException {
        if (this.f50754y == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(s().width() / C(), s().height() / C(), Bitmap.Config.ARGB_8888);
        this.f50754y.nthFrame(i4, createBitmap);
        return createBitmap;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    public int w() {
        AvifDecoder avifDecoder = this.f50754y;
        if (avifDecoder == null) {
            return 0;
        }
        return avifDecoder.getFrameCount();
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int y() {
        AvifDecoder avifDecoder = this.f50754y;
        if (avifDecoder == null) {
            return 0;
        }
        if (avifDecoder.getFrameCount() == 1) {
            return 1;
        }
        return this.f50754y.getRepetitionCount();
    }
}
