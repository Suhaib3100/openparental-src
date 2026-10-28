package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.o0;
import androidx.annotation.x0;
import com.bumptech.glide.load.data.e;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    private final InternalRewinder f43760a;

    @x0(21)
    private static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        private final ParcelFileDescriptor f43761a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f43761a = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f43761a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f43761a;
            } catch (ErrnoException e4) {
                throw new IOException(e4);
            }
        }
    }

    @x0(21)
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        @o0
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @o0
        public e<ParcelFileDescriptor> b(@o0 ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @o0
        public e<ParcelFileDescriptor> c(@o0 ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @x0(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f43760a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return !ProtectedSandApp.s("ࡤ").equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.e
    @o0
    @x0(21)
    public ParcelFileDescriptor a() throws IOException {
        return this.f43760a.rewind();
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @o0
    @x0(21)
    public ParcelFileDescriptor d() throws IOException {
        return this.f43760a.rewind();
    }
}
