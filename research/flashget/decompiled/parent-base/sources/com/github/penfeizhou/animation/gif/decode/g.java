package com.github.penfeizhou.animation.gif.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.gif.io.GifReader;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: GifDecoder.java */
/* loaded from: classes5.dex */
public class g extends com.github.penfeizhou.animation.decode.b<GifReader, com.github.penfeizhou.animation.gif.io.a> {
    private static final String D = ProtectedSandApp.s("쑿");
    private int A;
    private final b B;
    private int C;

    /* renamed from: y, reason: collision with root package name */
    private com.github.penfeizhou.animation.gif.io.a f50806y;

    /* renamed from: z, reason: collision with root package name */
    private final Paint f50807z;

    /* compiled from: GifDecoder.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        ByteBuffer f50808a;

        private b() {
        }

        b(a aVar) {
        }
    }

    public g(com.github.penfeizhou.animation.loader.d dVar, b.j jVar) {
        super(dVar, jVar);
        this.f50806y = new com.github.penfeizhou.animation.gif.io.a();
        Paint paint = new Paint();
        this.f50807z = paint;
        this.A = 0;
        this.B = new b();
        this.C = 1;
        paint.setAntiAlias(true);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void N() {
        this.B.f50808a = null;
        this.f50806y = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void P(com.github.penfeizhou.animation.decode.a<GifReader, com.github.penfeizhou.animation.gif.io.a> aVar) {
        GifFrame gifFrame = (GifFrame) aVar;
        Bitmap J = J(this.f50775p.width() / this.f50770k, this.f50775p.height() / this.f50770k);
        Canvas canvas = this.f50773n.get(J);
        if (canvas == null) {
            canvas = new Canvas(J);
            this.f50773n.put(J, canvas);
        }
        Canvas canvas2 = canvas;
        this.f50774o.rewind();
        J.copyPixelsFromBuffer(this.f50774o);
        int i4 = !gifFrame.transparencyFlag() ? this.A : 0;
        int i5 = this.f50764e;
        if (i5 == 0) {
            J.eraseColor(i4);
        } else {
            GifFrame gifFrame2 = (GifFrame) this.f50763d.get(i5 - 1);
            canvas2.save();
            int i6 = gifFrame2.frameX;
            int i7 = this.f50770k;
            int i10 = gifFrame2.frameY;
            canvas2.clipRect(i6 / i7, i10 / i7, (i6 + gifFrame2.frameWidth) / i7, (i10 + gifFrame2.frameHeight) / i7);
            int i11 = gifFrame2.disposalMethod;
            if (i11 == 2) {
                canvas2.drawColor(this.A, PorterDuff.Mode.CLEAR);
            } else if (i11 == 3) {
                this.B.f50808a.rewind();
                canvas2.drawColor(this.A, PorterDuff.Mode.CLEAR);
                Bitmap J2 = J(this.f50775p.width() / this.f50770k, this.f50775p.height() / this.f50770k);
                J2.copyPixelsFromBuffer(this.B.f50808a);
                canvas2.drawBitmap(J2, 0.0f, 0.0f, this.f50807z);
                M(J2);
            }
            canvas2.restore();
            if (gifFrame.disposalMethod == 3 && gifFrame2.disposalMethod != 3) {
                this.f50774o.rewind();
                this.B.f50808a.rewind();
                this.B.f50808a.put(this.f50774o);
            }
        }
        int i12 = aVar.frameWidth;
        int i13 = this.f50770k;
        Bitmap J3 = J(i12 / i13, aVar.frameHeight / i13);
        gifFrame.draw(canvas2, this.f50807z, this.f50770k, J3, D());
        canvas2.drawColor(i4, PorterDuff.Mode.DST_OVER);
        M(J3);
        this.f50774o.rewind();
        J.copyPixelsToBuffer(this.f50774o);
        M(J);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public GifReader B(Reader reader) {
        return new GifReader(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public com.github.penfeizhou.animation.gif.io.a D() {
        if (this.f50806y == null) {
            this.f50806y = new com.github.penfeizhou.animation.gif.io.a();
        }
        return this.f50806y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Rect L(GifReader gifReader) throws IOException {
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        c cVar = null;
        i iVar = null;
        for (com.github.penfeizhou.animation.gif.decode.b bVar : h.f(gifReader)) {
            if (bVar instanceof k) {
                k kVar = (k) bVar;
                i5 = kVar.f50821a;
                i6 = kVar.f50822b;
                if (kVar.c()) {
                    i4 = kVar.f50824d & 255;
                }
            } else if (bVar instanceof c) {
                cVar = (c) bVar;
            } else if (bVar instanceof i) {
                iVar = (i) bVar;
            } else if (bVar instanceof j) {
                this.f50763d.add(new GifFrame(gifReader, cVar, iVar, (j) bVar));
            } else if (bVar instanceof com.github.penfeizhou.animation.gif.decode.a) {
                com.github.penfeizhou.animation.gif.decode.a aVar = (com.github.penfeizhou.animation.gif.decode.a) bVar;
                if (ProtectedSandApp.s("쑽").equals(aVar.f50800b)) {
                    int i7 = aVar.f50799a;
                    if (i7 == 0) {
                        this.C = 0;
                    } else if (i7 > 0) {
                        this.C = i7 + 1;
                    }
                }
            }
        }
        int i10 = this.f50770k;
        long j4 = (((i5 * i6) / (i10 * i10)) + 1) * 4;
        int i11 = (int) j4;
        try {
            this.f50774o = ByteBuffer.allocate(i11);
            this.B.f50808a = ByteBuffer.allocate(i11);
            if (cVar != null && i4 >= 0 && i4 < cVar.b().length) {
                int i12 = cVar.b()[i4];
                this.A = Color.rgb(i12 & 255, (i12 >> 8) & 255, (i12 >> 16) & 255);
            }
            return new Rect(0, 0, i5, i6);
        } catch (OutOfMemoryError e4) {
            String.format(ProtectedSandApp.s("쑾"), Double.valueOf(j4 / 1048576.0d), Long.valueOf(j4));
            this.f50774o = null;
            this.B.f50808a = null;
            throw e4;
        }
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int t(int i4, int i5) {
        return 1;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int y() {
        return this.C;
    }
}
