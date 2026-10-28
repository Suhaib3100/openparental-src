package com.github.penfeizhou.animation.webp.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;

/* compiled from: WebPDecoder.java */
/* loaded from: classes5.dex */
public class l extends com.github.penfeizhou.animation.decode.b<com.github.penfeizhou.animation.webp.io.a, com.github.penfeizhou.animation.webp.io.b> {
    private static final String G = ProtectedSandApp.s("쒑");
    private int A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    private com.github.penfeizhou.animation.webp.io.b F;

    /* renamed from: y, reason: collision with root package name */
    private final Paint f50897y;

    /* renamed from: z, reason: collision with root package name */
    private Paint f50898z;

    public l(com.github.penfeizhou.animation.loader.d dVar, b.j jVar) {
        super(dVar, jVar);
        Paint paint = new Paint();
        this.f50897y = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void N() {
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void P(com.github.penfeizhou.animation.decode.a<com.github.penfeizhou.animation.webp.io.a, com.github.penfeizhou.animation.webp.io.b> aVar) {
        Bitmap J;
        Bitmap bitmap;
        int i4;
        if (aVar == null || this.f50775p == null || this.f50775p.width() <= 0 || this.f50775p.height() <= 0 || (J = J(this.f50775p.width() / this.f50770k, this.f50775p.height() / this.f50770k)) == null) {
            return;
        }
        Canvas canvas = this.f50773n.get(J);
        if (canvas == null) {
            canvas = new Canvas(J);
            this.f50773n.put(J, canvas);
        }
        this.f50774o.rewind();
        J.copyPixelsFromBuffer(this.f50774o);
        int i5 = this.f50764e;
        if (i5 != 0) {
            com.github.penfeizhou.animation.decode.a aVar2 = (com.github.penfeizhou.animation.decode.a) this.f50763d.get(i5 - 1);
            if ((aVar2 instanceof d) && ((d) aVar2).f50880d) {
                int i6 = aVar2.frameX;
                int i7 = this.f50770k;
                canvas.drawRect((i6 * 2.0f) / i7, (aVar2.frameY * 2.0f) / i7, ((i6 * 2) + aVar2.frameWidth) / i7, ((r7 * 2) + aVar2.frameHeight) / i7, this.f50897y);
            }
        } else if (this.D) {
            canvas.drawColor(0, PorterDuff.Mode.SRC);
        } else {
            canvas.drawColor(this.E, PorterDuff.Mode.SRC);
        }
        int i10 = aVar.frameWidth;
        if (i10 <= 0 || (i4 = aVar.frameHeight) <= 0) {
            bitmap = null;
        } else {
            int i11 = this.f50770k;
            bitmap = J(i10 / i11, i4 / i11);
        }
        M(aVar.draw(canvas, this.f50898z, this.f50770k, bitmap, D()));
        M(bitmap);
        this.f50774o.rewind();
        J.copyPixelsToBuffer(this.f50774o);
        M(J);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public com.github.penfeizhou.animation.webp.io.a B(Reader reader) {
        return new com.github.penfeizhou.animation.webp.io.a(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public com.github.penfeizhou.animation.webp.io.b D() {
        if (this.F == null) {
            this.F = new com.github.penfeizhou.animation.webp.io.b();
        }
        return this.F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Rect L(com.github.penfeizhou.animation.webp.io.a aVar) throws IOException {
        boolean z4 = false;
        boolean z5 = false;
        for (e eVar : m.e(aVar)) {
            if (eVar instanceof k) {
                k kVar = (k) eVar;
                this.B = kVar.f50895f;
                this.C = kVar.f50896g;
                this.D = kVar.d();
                z5 = true;
            } else if (eVar instanceof b) {
                b bVar = (b) eVar;
                this.E = bVar.f50860e;
                this.A = bVar.f50861f;
                z4 = true;
            } else if (eVar instanceof c) {
                this.f50763d.add(new d(aVar, (c) eVar));
            }
        }
        if (!z4) {
            if (!z5) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(aVar.toInputStream(), null, options);
                this.B = options.outWidth;
                this.C = options.outHeight;
            }
            this.f50763d.add(new h(aVar, this.B, this.C));
            this.A = 1;
        }
        Paint paint = new Paint();
        this.f50898z = paint;
        paint.setAntiAlias(true);
        if (!this.D) {
            this.f50897y.setColor(this.E);
        }
        return new Rect(0, 0, this.B, this.C);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int y() {
        return this.A;
    }
}
