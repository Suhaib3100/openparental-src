package com.nostra13.universalimageloader.cache.memory;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.utils.d;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: LimitedMemoryCache.java */
/* loaded from: classes6.dex */
public abstract class b extends a {

    /* renamed from: e, reason: collision with root package name */
    private static final int f70234e = 16;

    /* renamed from: f, reason: collision with root package name */
    private static final int f70235f = 16777216;

    /* renamed from: b, reason: collision with root package name */
    private final int f70236b;

    /* renamed from: d, reason: collision with root package name */
    private final List<Bitmap> f70238d = Collections.synchronizedList(new LinkedList());

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f70237c = new AtomicInteger();

    public b(int i4) {
        this.f70236b = i4;
        if (i4 > 16777216) {
            d.i(ProtectedSandApp.s("ᨶ\u0001"), 16);
        }
    }

    @Override // com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public boolean a(String str, Bitmap bitmap) {
        boolean z4;
        int c5 = c(bitmap);
        int d5 = d();
        int i4 = this.f70237c.get();
        if (c5 < d5) {
            while (i4 + c5 > d5) {
                Bitmap e4 = e();
                if (this.f70238d.remove(e4)) {
                    i4 = this.f70237c.addAndGet(-c(e4));
                }
            }
            this.f70238d.add(bitmap);
            this.f70237c.addAndGet(c5);
            z4 = true;
        } else {
            z4 = false;
        }
        super.a(str, bitmap);
        return z4;
    }

    protected abstract int c(Bitmap bitmap);

    @Override // com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public void clear() {
        this.f70238d.clear();
        this.f70237c.set(0);
        super.clear();
    }

    protected int d() {
        return this.f70236b;
    }

    protected abstract Bitmap e();

    @Override // com.nostra13.universalimageloader.cache.memory.a, com.nostra13.universalimageloader.cache.memory.c
    public Bitmap remove(String str) {
        Bitmap bitmap = super.get(str);
        if (bitmap != null && this.f70238d.remove(bitmap)) {
            this.f70237c.addAndGet(-c(bitmap));
        }
        return super.remove(str);
    }
}
