package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import androidx.annotation.x0;
import androidx.media.h;
import java.util.Objects;

/* compiled from: MediaSessionManagerImplApi28.java */
@x0(28)
/* loaded from: classes3.dex */
class p extends i {

    /* renamed from: h, reason: collision with root package name */
    MediaSessionManager f30779h;

    p(Context context) {
        super(context);
        this.f30779h = (MediaSessionManager) context.getSystemService("media_session");
    }

    @Override // androidx.media.i, androidx.media.q, androidx.media.h.a
    public boolean a(h.c cVar) {
        boolean isTrustedForMediaControl;
        if (!(cVar instanceof a)) {
            return false;
        }
        isTrustedForMediaControl = this.f30779h.isTrustedForMediaControl(((a) cVar).f30780a);
        return isTrustedForMediaControl;
    }

    /* compiled from: MediaSessionManagerImplApi28.java */
    static final class a implements h.c {

        /* renamed from: a, reason: collision with root package name */
        final MediaSessionManager.RemoteUserInfo f30780a;

        a(String str, int i4, int i5) {
            this.f30780a = o.a(str, i4, i5);
        }

        @Override // androidx.media.h.c
        public int a() {
            int uid;
            uid = this.f30780a.getUid();
            return uid;
        }

        @Override // androidx.media.h.c
        public int b() {
            int pid;
            pid = this.f30780a.getPid();
            return pid;
        }

        public boolean equals(Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            equals = this.f30780a.equals(((a) obj).f30780a);
            return equals;
        }

        @Override // androidx.media.h.c
        public String getPackageName() {
            String packageName;
            packageName = this.f30780a.getPackageName();
            return packageName;
        }

        public int hashCode() {
            return Objects.hash(this.f30780a);
        }

        a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.f30780a = remoteUserInfo;
        }
    }
}
