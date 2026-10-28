package androidx.media;

import android.content.Context;
import androidx.annotation.o0;
import androidx.annotation.x0;
import androidx.media.h;

/* compiled from: MediaSessionManagerImplApi21.java */
@x0(21)
/* loaded from: classes3.dex */
class i extends q {
    i(Context context) {
        super(context);
        this.f30786a = context;
    }

    private boolean d(@o0 h.c cVar) {
        return getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", cVar.b(), cVar.a()) == 0;
    }

    @Override // androidx.media.q, androidx.media.h.a
    public boolean a(@o0 h.c cVar) {
        return d(cVar) || super.a(cVar);
    }
}
