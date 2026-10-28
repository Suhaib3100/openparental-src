package com.tencent.liteav.videoproducer.capture;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.liteav.base.util.Size;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    private Size f72523d = null;

    /* renamed from: a, reason: collision with root package name */
    public int f72520a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f72521b = false;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList<FaceRect> f72522c = new LinkedList<>();

    public final void a(int i4, int i5) {
        this.f72523d = new Size(i4, i5);
    }

    public final synchronized void b() {
        this.f72522c.clear();
    }

    public final void a(List<Rect> list, float f4) {
        Size size;
        if (list.size() <= 0 || (size = this.f72523d) == null || size.width <= 0 || size.height <= 0) {
            return;
        }
        RectF rectF = new RectF(a(list));
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, this.f72521b ? -1.0f : 1.0f);
        matrix.postRotate(this.f72520a);
        Size size2 = this.f72523d;
        matrix.postScale(size2.height / 2000.0f, size2.width / 2000.0f);
        matrix.postScale(f4, f4);
        Size size3 = this.f72523d;
        matrix.postTranslate(size3.height / 2.0f, size3.width / 2.0f);
        matrix.mapRect(rectF);
        synchronized (this) {
            this.f72522c.clear();
            this.f72522c.addLast(new FaceRect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.width()), Math.round(rectF.height())));
        }
    }

    public final void a(List<Rect> list, Rect rect, Rect rect2) {
        Size size;
        int i4;
        int i5;
        if (list.size() <= 0 || (size = this.f72523d) == null || size.width <= 0 || size.height <= 0 || rect == null || rect.width() <= 0 || rect.height() <= 0 || rect2 == null || rect2.width() <= 0 || rect2.height() <= 0) {
            return;
        }
        Rect a5 = a(list);
        Size size2 = this.f72523d;
        int i6 = size2.width;
        int i7 = size2.height;
        float f4 = i6 > i7 ? i6 / i7 : i7 / i6;
        int width = rect.width();
        int height = rect.height();
        float f5 = width;
        float f6 = height;
        if (f4 > f5 / f6) {
            i5 = (int) (f5 / f4);
            i4 = width;
        } else {
            i4 = (int) (f6 * f4);
            i5 = height;
        }
        int abs = Math.abs(i4 - width);
        int abs2 = Math.abs(i5 - height);
        float width2 = f5 / rect2.width();
        RectF rectF = new RectF((a5.left - rect2.left) * width2, (a5.top - rect2.top) * width2, rect.right - ((rect2.right - a5.right) * width2), rect.bottom - ((rect2.bottom - a5.bottom) * width2));
        Matrix matrix = new Matrix();
        matrix.postTranslate((-abs) / 2.0f, (-abs2) / 2.0f);
        matrix.postTranslate((-i4) / 2.0f, (-i5) / 2.0f);
        Size size3 = this.f72523d;
        matrix.postScale(size3.height / i5, size3.width / i4);
        matrix.postScale(1.0f, this.f72521b ? -1.0f : 1.0f);
        matrix.postRotate(this.f72520a);
        Size size4 = this.f72523d;
        matrix.postTranslate(size4.height / 2.0f, size4.width / 2.0f);
        Size size5 = this.f72523d;
        matrix.postScale(width2, width2, size5.height / 2.0f, size5.width / 2.0f);
        matrix.mapRect(rectF);
        synchronized (this) {
            this.f72522c.clear();
            this.f72522c.addLast(new FaceRect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.width()), Math.round(rectF.height())));
        }
    }

    private static Rect a(List<Rect> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        Rect rect = list.get(0);
        for (Rect rect2 : list) {
            if (rect2.height() * rect2.width() > rect.height() * rect.width()) {
                rect = rect2;
            }
        }
        return rect;
    }

    public final synchronized FaceRect a() {
        if (this.f72522c.size() <= 0) {
            return null;
        }
        return this.f72522c.removeFirst();
    }
}
