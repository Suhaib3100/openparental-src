package com.bumptech.glide.signature;

import android.content.Context;
import androidx.annotation.o0;
import com.bumptech.glide.load.f;
import com.bumptech.glide.util.n;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: AndroidResourceSignature.java */
/* loaded from: classes3.dex */
public final class a implements f {

    /* renamed from: c, reason: collision with root package name */
    private final int f12127c;

    /* renamed from: d, reason: collision with root package name */
    private final f f12128d;

    private a(int i5, f fVar) {
        this.f12127c = i5;
        this.f12128d = fVar;
    }

    @o0
    public static f c(@o0 Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // com.bumptech.glide.load.f
    public void a(@o0 MessageDigest messageDigest) {
        this.f12128d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f12127c).array());
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12127c == aVar.f12127c && this.f12128d.equals(aVar.f12128d);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return n.q(this.f12128d, this.f12127c);
    }
}
