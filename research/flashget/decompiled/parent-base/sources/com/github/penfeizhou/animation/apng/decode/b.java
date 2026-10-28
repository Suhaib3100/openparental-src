package com.github.penfeizhou.animation.apng.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.penfeizhou.animation.decode.b;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: APNGDecoder.java */
/* loaded from: classes5.dex */
public class b extends com.github.penfeizhou.animation.decode.b<com.github.penfeizhou.animation.apng.io.a, com.github.penfeizhou.animation.apng.io.b> {
    private static final String C = ProtectedSandApp.s("쑬");
    private final Paint A;
    private final C0778b B;

    /* renamed from: y, reason: collision with root package name */
    private com.github.penfeizhou.animation.apng.io.b f50709y;

    /* renamed from: z, reason: collision with root package name */
    private int f50710z;

    /* compiled from: APNGDecoder.java */
    /* renamed from: com.github.penfeizhou.animation.apng.decode.b$b, reason: collision with other inner class name */
    private static class C0778b {

        /* renamed from: a, reason: collision with root package name */
        byte f50711a;

        /* renamed from: b, reason: collision with root package name */
        Rect f50712b;

        /* renamed from: c, reason: collision with root package name */
        ByteBuffer f50713c;

        private C0778b() {
            this.f50712b = new Rect();
        }
    }

    public b(com.github.penfeizhou.animation.loader.d dVar, b.j jVar) {
        super(dVar, jVar);
        Paint paint = new Paint();
        this.A = paint;
        this.B = new C0778b();
        paint.setAntiAlias(true);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void N() {
        this.B.f50713c = null;
        this.f50709y = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void P(com.github.penfeizhou.animation.decode.a<com.github.penfeizhou.animation.apng.io.a, com.github.penfeizhou.animation.apng.io.b> aVar) {
        if (aVar == null || this.f50775p == null) {
            return;
        }
        try {
            Bitmap J = J(this.f50775p.width() / this.f50770k, this.f50775p.height() / this.f50770k);
            Canvas canvas = this.f50773n.get(J);
            if (canvas == null) {
                canvas = new Canvas(J);
                this.f50773n.put(J, canvas);
            }
            Canvas canvas2 = canvas;
            if (aVar instanceof c) {
                this.f50774o.rewind();
                J.copyPixelsFromBuffer(this.f50774o);
                if (this.f50764e == 0) {
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                } else {
                    canvas2.save();
                    canvas2.clipRect(this.B.f50712b);
                    C0778b c0778b = this.B;
                    byte b5 = c0778b.f50711a;
                    if (b5 == 1) {
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    } else if (b5 == 2) {
                        c0778b.f50713c.rewind();
                        J.copyPixelsFromBuffer(this.B.f50713c);
                    }
                    canvas2.restore();
                }
                if (((c) aVar).f50719b == 2) {
                    C0778b c0778b2 = this.B;
                    if (c0778b2.f50711a != 2) {
                        c0778b2.f50713c.rewind();
                        J.copyPixelsToBuffer(this.B.f50713c);
                    }
                }
                this.B.f50711a = ((c) aVar).f50719b;
                canvas2.save();
                if (((c) aVar).f50718a == 0) {
                    int i4 = aVar.frameX;
                    int i5 = this.f50770k;
                    int i6 = aVar.frameY;
                    canvas2.clipRect(i4 / i5, i6 / i5, (i4 + aVar.frameWidth) / i5, (i6 + aVar.frameHeight) / i5);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                Rect rect = this.B.f50712b;
                int i7 = aVar.frameX;
                int i10 = this.f50770k;
                int i11 = aVar.frameY;
                rect.set(i7 / i10, i11 / i10, (i7 + aVar.frameWidth) / i10, (i11 + aVar.frameHeight) / i10);
                canvas2.restore();
            }
            Bitmap J2 = J(aVar.frameWidth, aVar.frameHeight);
            M(aVar.draw(canvas2, this.A, this.f50770k, J2, D()));
            M(J2);
            this.f50774o.rewind();
            J.copyPixelsToBuffer(this.f50774o);
            M(J);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public com.github.penfeizhou.animation.apng.io.a B(Reader reader) {
        return new com.github.penfeizhou.animation.apng.io.a(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public com.github.penfeizhou.animation.apng.io.b D() {
        if (this.f50709y == null) {
            this.f50709y = new com.github.penfeizhou.animation.apng.io.b();
        }
        return this.f50709y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Rect L(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        e next;
        boolean z4;
        List<e> e4 = d.e(aVar);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[0];
        Iterator<e> it = e4.iterator();
        c cVar = null;
        boolean z5 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!it.hasNext() || ((z4 = (next = it.next()) instanceof i))) {
                break;
            }
            if (next instanceof com.github.penfeizhou.animation.apng.decode.a) {
                this.f50710z = ((com.github.penfeizhou.animation.apng.decode.a) next).f50708f;
                z5 = true;
            } else if (next instanceof f) {
                cVar = new c(aVar, (f) next);
                cVar.f50722e = arrayList;
                cVar.f50720c = bArr;
                this.f50763d.add(cVar);
            } else if (next instanceof g) {
                if (cVar != null) {
                    cVar.f50721d.add(next);
                }
            } else if (next instanceof h) {
                if (!z5) {
                    k kVar = new k(aVar);
                    kVar.frameWidth = i4;
                    kVar.frameHeight = i5;
                    this.f50763d.add(kVar);
                    this.f50710z = 1;
                    break;
                }
                if (cVar != null) {
                    cVar.f50721d.add(next);
                }
            } else if (next instanceof j) {
                j jVar = (j) next;
                i4 = jVar.f50747e;
                i5 = jVar.f50748f;
                bArr = jVar.f50749g;
            } else if (!z4) {
                arrayList.add(next);
            }
        }
        int i6 = i4 * i5;
        int i7 = this.f50770k;
        this.f50774o = ByteBuffer.allocate(((i6 / (i7 * i7)) + 1) * 4);
        C0778b c0778b = this.B;
        int i10 = this.f50770k;
        c0778b.f50713c = ByteBuffer.allocate(((i6 / (i10 * i10)) + 1) * 4);
        return new Rect(0, 0, i4, i5);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int y() {
        return this.f50710z;
    }
}
