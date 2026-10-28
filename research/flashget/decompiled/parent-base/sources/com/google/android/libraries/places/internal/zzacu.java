package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzacu extends zzacx {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzacu(byte[] bArr, int i4, int i5) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue749"));
        }
        int length = bArr.length;
        if (((length - i5) | i5) < 0) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("\ue748"), Integer.valueOf(length), 0, Integer.valueOf(i5)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i5;
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzb(byte b5) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i4 = this.zzd;
            this.zzd = i4 + 1;
            bArr[i4] = b5;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzacv(String.format(ProtectedSandApp.s("\ue74a"), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    public final void zzc(byte[] bArr, int i4, int i5) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i5);
            this.zzd += i5;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzacv(String.format(ProtectedSandApp.s("\ue74a"), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i5)), e4);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzd(int i4, boolean z4) throws IOException {
        zzq(i4 << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zze(int i4, zzacp zzacpVar) throws IOException {
        zzq((i4 << 3) | 2);
        zzq(zzacpVar.zzd());
        zzacpVar.zzh(this);
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzf(int i4, int i5) throws IOException {
        zzq((i4 << 3) | 5);
        zzg(i5);
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzg(int i4) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i5 = this.zzd;
            int i6 = i5 + 1;
            this.zzd = i6;
            bArr[i5] = (byte) (i4 & 255);
            int i7 = i5 + 2;
            this.zzd = i7;
            bArr[i6] = (byte) ((i4 >> 8) & 255);
            int i10 = i5 + 3;
            this.zzd = i10;
            bArr[i7] = (byte) ((i4 >> 16) & 255);
            this.zzd = i5 + 4;
            bArr[i10] = (byte) ((i4 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzacv(String.format(ProtectedSandApp.s("\ue74a"), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzh(int i4, long j4) throws IOException {
        zzq((i4 << 3) | 1);
        zzi(j4);
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzi(long j4) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i4 = this.zzd;
            int i5 = i4 + 1;
            this.zzd = i5;
            bArr[i4] = (byte) (((int) j4) & 255);
            int i6 = i4 + 2;
            this.zzd = i6;
            bArr[i5] = (byte) (((int) (j4 >> 8)) & 255);
            int i7 = i4 + 3;
            this.zzd = i7;
            bArr[i6] = (byte) (((int) (j4 >> 16)) & 255);
            int i10 = i4 + 4;
            this.zzd = i10;
            bArr[i7] = (byte) (((int) (j4 >> 24)) & 255);
            int i11 = i4 + 5;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j4 >> 32)) & 255);
            int i12 = i4 + 6;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j4 >> 40)) & 255);
            int i13 = i4 + 7;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j4 >> 48)) & 255);
            this.zzd = i4 + 8;
            bArr[i13] = (byte) (((int) (j4 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzacv(String.format(ProtectedSandApp.s("\ue74a"), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzj(int i4, int i5) throws IOException {
        zzq(i4 << 3);
        zzk(i5);
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzk(int i4) throws IOException {
        if (i4 >= 0) {
            zzq(i4);
        } else {
            zzs(i4);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzl(byte[] bArr, int i4, int i5) throws IOException {
        zzc(bArr, 0, i5);
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzm(int i4, String str) throws IOException {
        zzq((i4 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i4 = this.zzd;
        try {
            int zzA = zzacx.zzA(str.length() * 3);
            int zzA2 = zzacx.zzA(str.length());
            if (zzA2 != zzA) {
                zzq(zzagh.zzc(str));
                byte[] bArr = this.zzb;
                int i5 = this.zzd;
                this.zzd = zzagh.zzb(str, bArr, i5, this.zzc - i5);
                return;
            }
            int i6 = i4 + zzA2;
            this.zzd = i6;
            int zzb = zzagh.zzb(str, this.zzb, i6, this.zzc - i6);
            this.zzd = i4;
            zzq((zzb - i4) - zzA2);
            this.zzd = zzb;
        } catch (zzagg e4) {
            this.zzd = i4;
            zzE(str, e4);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzacv(e5);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzo(int i4, int i5) throws IOException {
        zzq((i4 << 3) | i5);
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzp(int i4, int i5) throws IOException {
        zzq(i4 << 3);
        zzq(i5);
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzq(int i4) throws IOException {
        boolean z4;
        z4 = zzacx.zzc;
        if (z4) {
            int i5 = zzace.zza;
        }
        while ((i4 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i6 = this.zzd;
                this.zzd = i6 + 1;
                bArr[i6] = (byte) ((i4 & 127) | 128);
                i4 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzacv(String.format(ProtectedSandApp.s("\ue74a"), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }
        byte[] bArr2 = this.zzb;
        int i7 = this.zzd;
        this.zzd = i7 + 1;
        bArr2[i7] = (byte) i4;
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzr(int i4, long j4) throws IOException {
        zzq(i4 << 3);
        zzs(j4);
    }

    @Override // com.google.android.libraries.places.internal.zzacx
    public final void zzs(long j4) throws IOException {
        boolean z4;
        z4 = zzacx.zzc;
        if (z4 && this.zzc - this.zzd >= 10) {
            while ((j4 & (-128)) != 0) {
                byte[] bArr = this.zzb;
                int i4 = this.zzd;
                this.zzd = i4 + 1;
                zzagd.zzn(bArr, i4, (byte) ((((int) j4) & 127) | 128));
                j4 >>>= 7;
            }
            byte[] bArr2 = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            zzagd.zzn(bArr2, i5, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzb;
                int i6 = this.zzd;
                this.zzd = i6 + 1;
                bArr3[i6] = (byte) ((((int) j4) & 127) | 128);
                j4 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzacv(String.format(ProtectedSandApp.s("\ue74a"), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }
        byte[] bArr4 = this.zzb;
        int i7 = this.zzd;
        this.zzd = i7 + 1;
        bArr4[i7] = (byte) j4;
    }
}
