package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.g;
import java.util.Arrays;

/* compiled from: ViewPreloadSizeProvider.java */
/* loaded from: classes3.dex */
public class p<T> implements g.b<T>, com.bumptech.glide.request.target.o {

    /* renamed from: a, reason: collision with root package name */
    private int[] f44985a;

    /* renamed from: b, reason: collision with root package name */
    private a f44986b;

    /* compiled from: ViewPreloadSizeProvider.java */
    static final class a extends com.bumptech.glide.request.target.f<View, Object> {
        a(@o0 View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.p
        public void j(@o0 Object obj, @q0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.request.target.f
        protected void k(@q0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void m(@q0 Drawable drawable) {
        }
    }

    public p() {
    }

    @Override // com.bumptech.glide.g.b
    @q0
    public int[] a(@o0 T t4, int i4, int i5) {
        int[] iArr = this.f44985a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void b(@o0 View view) {
        if (this.f44985a == null && this.f44986b == null) {
            a aVar = new a(view);
            this.f44986b = aVar;
            aVar.p(this);
        }
    }

    @Override // com.bumptech.glide.request.target.o
    public void d(int i4, int i5) {
        this.f44985a = new int[]{i4, i5};
        this.f44986b = null;
    }

    public p(@o0 View view) {
        a aVar = new a(view);
        this.f44986b = aVar;
        aVar.p(this);
    }
}
