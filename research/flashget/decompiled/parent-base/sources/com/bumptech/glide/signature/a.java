package com.bumptech.glide.signature;

import android.content.Context;
import androidx.annotation.o0;
import com.bumptech.glide.load.f;
import com.bumptech.glide.util.o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: AndroidResourceSignature.java */
/* loaded from: classes3.dex */
public final class a implements f {

    /* renamed from: c, reason: collision with root package name */
    private final int f44933c;

    /* renamed from: d, reason: collision with root package name */
    private final f f44934d;

    private a(int i4, f fVar) {
        this.f44933c = i4;
        this.f44934d = fVar;
    }

    @o0
    public static f c(@o0 Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // com.bumptech.glide.load.f
    public void b(@o0 MessageDigest messageDigest) {
        this.f44934d.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f44933c).array());
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f44933c == aVar.f44933c && this.f44934d.equals(aVar.f44934d);
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return o.r(this.f44934d, this.f44933c);
    }
}
