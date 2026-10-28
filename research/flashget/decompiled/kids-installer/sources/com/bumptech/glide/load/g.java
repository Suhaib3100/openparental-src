package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MultiTransformation.java */
/* loaded from: classes3.dex */
public class g<T> implements m<T> {

    /* renamed from: c, reason: collision with root package name */
    private final Collection<? extends m<T>> f11502c;

    @SafeVarargs
    public g(@o0 m<T>... mVarArr) {
        if (mVarArr.length == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᴙ"));
        }
        this.f11502c = Arrays.asList(mVarArr);
    }

    @Override // com.bumptech.glide.load.f
    public void a(@o0 MessageDigest messageDigest) {
        Iterator<? extends m<T>> it = this.f11502c.iterator();
        while (it.hasNext()) {
            it.next().a(messageDigest);
        }
    }

    @Override // com.bumptech.glide.load.m
    @o0
    public u<T> b(@o0 Context context, @o0 u<T> uVar, int i5, int i6) {
        Iterator<? extends m<T>> it = this.f11502c.iterator();
        u<T> uVar2 = uVar;
        while (it.hasNext()) {
            u<T> b6 = it.next().b(context, uVar2, i5, i6);
            if (uVar2 != null && !uVar2.equals(uVar) && !uVar2.equals(b6)) {
                uVar2.recycle();
            }
            uVar2 = b6;
        }
        return uVar2;
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f11502c.equals(((g) obj).f11502c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f11502c.hashCode();
    }

    public g(@o0 Collection<? extends m<T>> collection) {
        if (!collection.isEmpty()) {
            this.f11502c = collection;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ᴘ"));
    }
}
