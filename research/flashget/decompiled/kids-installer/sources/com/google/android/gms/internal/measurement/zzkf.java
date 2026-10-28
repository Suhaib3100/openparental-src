package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzkf extends zzki {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzkf(byte[] bArr, int i5, int i6) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException(ProtectedSandApp.s("⎄"));
        }
        int length = bArr.length;
        if (((length - i6) | i6) < 0) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⎃"), Integer.valueOf(length), 0, Integer.valueOf(i6)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i6;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzb(byte b6) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i5 = this.zze;
            this.zze = i5 + 1;
            bArr[i5] = b6;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzkg(String.format(ProtectedSandApp.s("⎅"), Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e6);
        }
    }

    public final void zzc(byte[] bArr, int i5, int i6) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i6);
            this.zze += i6;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzkg(String.format(ProtectedSandApp.s("⎆"), Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i6)), e6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzd(int i5, boolean z5) throws IOException {
        zzq(i5 << 3);
        zzb(z5 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zze(int i5, zzka zzkaVar) throws IOException {
        zzq((i5 << 3) | 2);
        zzq(zzkaVar.zzd());
        zzkaVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzf(int i5, int i6) throws IOException {
        zzq((i5 << 3) | 5);
        zzg(i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzg(int i5) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i6 = this.zze;
            int i7 = i6 + 1;
            bArr[i6] = (byte) (i5 & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((i5 >> 8) & 255);
            int i9 = i8 + 1;
            bArr[i8] = (byte) ((i5 >> 16) & 255);
            this.zze = i9 + 1;
            bArr[i9] = (byte) ((i5 >> 24) & 255);
        } catch (IndexOutOfBoundsException e6) {
            throw new zzkg(String.format(ProtectedSandApp.s("⎇"), Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzh(int i5, long j5) throws IOException {
        zzq((i5 << 3) | 1);
        zzi(j5);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzi(long j5) throws IOException {
        try {
            byte[] bArr = this.zzc;
            int i5 = this.zze;
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) j5) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j5 >> 8)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j5 >> 16)) & 255);
            int i9 = i8 + 1;
            bArr[i8] = (byte) (((int) (j5 >> 24)) & 255);
            int i10 = i9 + 1;
            bArr[i9] = (byte) (((int) (j5 >> 32)) & 255);
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) (j5 >> 40)) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j5 >> 48)) & 255);
            this.zze = i12 + 1;
            bArr[i12] = (byte) (((int) (j5 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e6) {
            throw new zzkg(String.format(ProtectedSandApp.s("⎈"), Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzj(int i5, int i6) throws IOException {
        zzq(i5 << 3);
        zzk(i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzk(int i5) throws IOException {
        if (i5 >= 0) {
            zzq(i5);
        } else {
            zzs(i5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzl(byte[] bArr, int i5, int i6) throws IOException {
        zzc(bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzm(int i5, String str) throws IOException {
        zzq((i5 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i5 = this.zze;
        try {
            int zzx = zzki.zzx(str.length() * 3);
            int zzx2 = zzki.zzx(str.length());
            if (zzx2 != zzx) {
                zzq(zznz.zzc(str));
                byte[] bArr = this.zzc;
                int i6 = this.zze;
                this.zze = zznz.zzb(str, bArr, i6, this.zzd - i6);
                return;
            }
            int i7 = i5 + zzx2;
            this.zze = i7;
            int zzb = zznz.zzb(str, this.zzc, i7, this.zzd - i7);
            this.zze = i5;
            zzq((zzb - i5) - zzx2);
            this.zze = zzb;
        } catch (zzny e6) {
            this.zze = i5;
            zzB(str, e6);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzkg(e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzo(int i5, int i6) throws IOException {
        zzq((i5 << 3) | i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzp(int i5, int i6) throws IOException {
        zzq(i5 << 3);
        zzq(i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzq(int i5) throws IOException {
        while ((i5 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i6 = this.zze;
                this.zze = i6 + 1;
                bArr[i6] = (byte) ((i5 & 127) | 128);
                i5 >>>= 7;
            } catch (IndexOutOfBoundsException e6) {
                throw new zzkg(String.format(ProtectedSandApp.s("⎉"), Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e6);
            }
        }
        byte[] bArr2 = this.zzc;
        int i7 = this.zze;
        this.zze = i7 + 1;
        bArr2[i7] = (byte) i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzr(int i5, long j5) throws IOException {
        zzq(i5 << 3);
        zzs(j5);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzs(long j5) throws IOException {
        boolean z5;
        z5 = zzki.zzd;
        if (z5 && this.zzd - this.zze >= 10) {
            while ((j5 & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i5 = this.zze;
                this.zze = i5 + 1;
                zznu.zzn(bArr, i5, (byte) ((((int) j5) & 127) | 128));
                j5 >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i6 = this.zze;
            this.zze = i6 + 1;
            zznu.zzn(bArr2, i6, (byte) j5);
            return;
        }
        while ((j5 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzc;
                int i7 = this.zze;
                this.zze = i7 + 1;
                bArr3[i7] = (byte) ((((int) j5) & 127) | 128);
                j5 >>>= 7;
            } catch (IndexOutOfBoundsException e6) {
                throw new zzkg(String.format(ProtectedSandApp.s("⎊"), Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e6);
            }
        }
        byte[] bArr4 = this.zzc;
        int i8 = this.zze;
        this.zze = i8 + 1;
        bArr4[i8] = (byte) j5;
    }
}
