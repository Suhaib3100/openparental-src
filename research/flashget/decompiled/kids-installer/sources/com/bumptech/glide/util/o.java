package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.f;
import java.util.Arrays;

/* compiled from: ViewPreloadSizeProvider.java */
/* loaded from: classes3.dex */
public class o<T> implements f.b<T>, com.bumptech.glide.request.target.o {

    /* renamed from: a, reason: collision with root package name */
    private int[] f12176a;

    /* renamed from: b, reason: collision with root package name */
    private a f12177b;

    /* compiled from: ViewPreloadSizeProvider.java */
    /* loaded from: classes4.dex */
    static final class a extends com.bumptech.glide.request.target.f<View, Object> {
        a(@o0 View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.p
        public void b(@o0 Object obj, @q0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.request.target.f
        protected void i(@q0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void k(@q0 Drawable drawable) {
        }
    }

    public o() {
    }

    @Override // com.bumptech.glide.f.b
    @q0
    public int[] a(@o0 T t5, int i5, int i6) {
        int[] iArr = this.f12176a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void b(@o0 View view) {
        if (this.f12176a == null && this.f12177b == null) {
            a aVar = new a(view);
            this.f12177b = aVar;
            aVar.q(this);
        }
    }

    @Override // com.bumptech.glide.request.target.o
    public void e(int i5, int i6) {
        this.f12176a = new int[]{i5, i6};
        this.f12177b = null;
    }

    public o(@o0 View view) {
        a aVar = new a(view);
        this.f12177b = aVar;
        aVar.q(this);
    }
}
