package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.o0;
import com.bumptech.glide.load.engine.u;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MultiTransformation.java */
/* loaded from: classes3.dex */
public class g<T> implements m<T> {

    /* renamed from: c, reason: collision with root package name */
    private final Collection<? extends m<T>> f44242c;

    @SafeVarargs
    public g(@o0 m<T>... mVarArr) {
        if (mVarArr.length == 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ॎ"));
        }
        this.f44242c = Arrays.asList(mVarArr);
    }

    @Override // com.bumptech.glide.load.m
    @o0
    public u<T> a(@o0 Context context, @o0 u<T> uVar, int i4, int i5) {
        Iterator<? extends m<T>> it = this.f44242c.iterator();
        u<T> uVar2 = uVar;
        while (it.hasNext()) {
            u<T> a5 = it.next().a(context, uVar2, i4, i5);
            if (uVar2 != null && !uVar2.equals(uVar) && !uVar2.equals(a5)) {
                uVar2.recycle();
            }
            uVar2 = a5;
        }
        return uVar2;
    }

    @Override // com.bumptech.glide.load.f
    public void b(@o0 MessageDigest messageDigest) {
        Iterator<? extends m<T>> it = this.f44242c.iterator();
        while (it.hasNext()) {
            it.next().b(messageDigest);
        }
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f44242c.equals(((g) obj).f44242c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return this.f44242c.hashCode();
    }

    public g(@o0 Collection<? extends m<T>> collection) {
        if (!collection.isEmpty()) {
            this.f44242c = collection;
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ॎ"));
    }
}
