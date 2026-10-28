package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.x0;

/* compiled from: VolumeProviderCompatApi21.java */
@x0(21)
/* loaded from: classes3.dex */
class t {

    /* compiled from: VolumeProviderCompatApi21.java */
    static class a extends VolumeProvider {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f30944a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, int i5, int i6, b bVar) {
            super(i4, i5, i6);
            this.f30944a = bVar;
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i4) {
            this.f30944a.b(i4);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i4) {
            this.f30944a.a(i4);
        }
    }

    /* compiled from: VolumeProviderCompatApi21.java */
    public interface b {
        void a(int i4);

        void b(int i4);
    }

    private t() {
    }

    public static Object a(int i4, int i5, int i6, b bVar) {
        return new a(i4, i5, i6, bVar);
    }

    public static void b(Object obj, int i4) {
        ((VolumeProvider) obj).setCurrentVolume(i4);
    }
}
