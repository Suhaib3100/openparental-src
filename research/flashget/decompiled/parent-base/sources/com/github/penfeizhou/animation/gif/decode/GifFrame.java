package com.github.penfeizhou.animation.gif.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* loaded from: classes5.dex */
public class GifFrame extends com.github.penfeizhou.animation.decode.a<GifReader, com.github.penfeizhou.animation.gif.io.a> {
    private static final int DEFAULT_DELAY = 10;
    private static final ThreadLocal<byte[]> sDataBlock;
    public final c colorTable;
    public final int disposalMethod;
    private final int imageDataOffset;
    private final boolean interlace;
    private final int lzwMinCodeSize;
    public final int transparentColorIndex;

    static {
        System.loadLibrary(ProtectedSandApp.s("쑻"));
        sDataBlock = new ThreadLocal<>();
    }

    public GifFrame(GifReader gifReader, c cVar, @q0 i iVar, j jVar) {
        super(gifReader);
        if (iVar != null) {
            this.disposalMethod = iVar.c();
            int i4 = iVar.f50811c;
            this.frameDuration = (i4 <= 0 ? 10 : i4) * 10;
            if (iVar.d()) {
                this.transparentColorIndex = iVar.f50812d;
            } else {
                this.transparentColorIndex = -1;
            }
        } else {
            this.disposalMethod = 0;
            this.transparentColorIndex = -1;
        }
        this.frameX = jVar.f50813a;
        this.frameY = jVar.f50814b;
        this.frameWidth = jVar.f50815c;
        this.frameHeight = jVar.f50816d;
        this.interlace = jVar.b();
        if (jVar.c()) {
            this.colorTable = jVar.f50818f;
        } else {
            this.colorTable = cVar;
        }
        this.lzwMinCodeSize = jVar.f50819g;
        this.imageDataOffset = jVar.f50820h;
    }

    private native void uncompressLZW(GifReader gifReader, int[] iArr, int i4, int[] iArr2, int i5, int i6, int i7, boolean z4, byte[] bArr);

    public void encode(int[] iArr, int i4) throws IOException {
        ((GifReader) this.reader).reset();
        ((GifReader) this.reader).skip(this.imageDataOffset);
        ThreadLocal<byte[]> threadLocal = sDataBlock;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[255];
            threadLocal.set(bArr);
        }
        uncompressLZW((GifReader) this.reader, this.colorTable.b(), this.transparentColorIndex, iArr, this.frameWidth / i4, this.frameHeight / i4, this.lzwMinCodeSize, this.interlace, bArr);
    }

    public boolean transparencyFlag() {
        return this.transparentColorIndex >= 0;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    public Bitmap draw(Canvas canvas, Paint paint, int i4, Bitmap bitmap, com.github.penfeizhou.animation.gif.io.a aVar) {
        try {
            aVar.e((this.frameWidth * this.frameHeight) / (i4 * i4));
            encode(aVar.f(), i4);
            bitmap.copyPixelsFromBuffer(aVar.c().rewind());
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmap.getWidth();
            this.srcRect.bottom = bitmap.getHeight();
            Rect rect2 = this.dstRect;
            int i5 = this.frameX;
            float f4 = i4;
            rect2.left = (int) (i5 / f4);
            rect2.top = (int) (this.frameY / f4);
            rect2.right = (int) ((i5 / f4) + bitmap.getWidth());
            this.dstRect.bottom = (int) ((this.frameY / f4) + bitmap.getHeight());
            canvas.drawBitmap(bitmap, this.srcRect, this.dstRect, paint);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return bitmap;
    }
}
