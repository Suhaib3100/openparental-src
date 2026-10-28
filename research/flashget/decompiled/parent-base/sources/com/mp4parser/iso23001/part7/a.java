package com.mp4parser.iso23001.part7;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: CencSampleAuxiliaryDataFormat.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f70084a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public k[] f70085b = null;

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private abstract class b implements k {
        private b() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            k kVar = (k) obj;
            return clear() == kVar.clear() && a() == kVar.a();
        }

        public String toString() {
            return ProtectedSandApp.s("ᧆ\u0001") + clear() + ProtectedSandApp.s("ᧇ\u0001") + a() + ProtectedSandApp.s("ᧈ\u0001");
        }

        /* synthetic */ b(a aVar, b bVar) {
            this();
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class c extends b {

        /* renamed from: b, reason: collision with root package name */
        private byte f70087b;

        /* renamed from: c, reason: collision with root package name */
        private byte f70088c;

        public c(int i4, long j4) {
            super(a.this, null);
            this.f70087b = (byte) i4;
            this.f70088c = (byte) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70088c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70087b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class d extends b {

        /* renamed from: b, reason: collision with root package name */
        private byte f70090b;

        /* renamed from: c, reason: collision with root package name */
        private int f70091c;

        public d(int i4, long j4) {
            super(a.this, null);
            this.f70090b = (byte) i4;
            this.f70091c = (int) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70091c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70090b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class e extends b {

        /* renamed from: b, reason: collision with root package name */
        private byte f70093b;

        /* renamed from: c, reason: collision with root package name */
        private long f70094c;

        public e(int i4, long j4) {
            super(a.this, null);
            this.f70093b = (byte) i4;
            this.f70094c = j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70094c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70093b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class f extends b {

        /* renamed from: b, reason: collision with root package name */
        private byte f70096b;

        /* renamed from: c, reason: collision with root package name */
        private short f70097c;

        public f(int i4, long j4) {
            super(a.this, null);
            this.f70096b = (byte) i4;
            this.f70097c = (short) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70097c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70096b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class g extends b {

        /* renamed from: b, reason: collision with root package name */
        private int f70099b;

        /* renamed from: c, reason: collision with root package name */
        private byte f70100c;

        public g(int i4, long j4) {
            super(a.this, null);
            this.f70099b = i4;
            this.f70100c = (byte) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70100c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70099b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class h extends b {

        /* renamed from: b, reason: collision with root package name */
        private int f70102b;

        /* renamed from: c, reason: collision with root package name */
        private int f70103c;

        public h(int i4, long j4) {
            super(a.this, null);
            this.f70102b = i4;
            this.f70103c = (int) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70103c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70102b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class i extends b {

        /* renamed from: b, reason: collision with root package name */
        private int f70105b;

        /* renamed from: c, reason: collision with root package name */
        private long f70106c;

        public i(int i4, long j4) {
            super(a.this, null);
            this.f70105b = i4;
            this.f70106c = j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70106c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70105b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class j extends b {

        /* renamed from: b, reason: collision with root package name */
        private int f70108b;

        /* renamed from: c, reason: collision with root package name */
        private short f70109c;

        public j(int i4, long j4) {
            super(a.this, null);
            this.f70108b = i4;
            this.f70109c = (short) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70109c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70108b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    public interface k {
        long a();

        int clear();
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class l extends b {

        /* renamed from: b, reason: collision with root package name */
        private short f70111b;

        /* renamed from: c, reason: collision with root package name */
        private byte f70112c;

        public l(int i4, long j4) {
            super(a.this, null);
            this.f70111b = (short) i4;
            this.f70112c = (byte) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70112c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70111b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class m extends b {

        /* renamed from: b, reason: collision with root package name */
        private short f70114b;

        /* renamed from: c, reason: collision with root package name */
        private int f70115c;

        public m(int i4, long j4) {
            super(a.this, null);
            this.f70114b = (short) i4;
            this.f70115c = (int) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70115c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70114b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class n extends b {

        /* renamed from: b, reason: collision with root package name */
        private short f70117b;

        /* renamed from: c, reason: collision with root package name */
        private long f70118c;

        public n(int i4, long j4) {
            super(a.this, null);
            this.f70117b = (short) i4;
            this.f70118c = j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70118c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70117b;
        }
    }

    /* compiled from: CencSampleAuxiliaryDataFormat.java */
    private class o extends b {

        /* renamed from: b, reason: collision with root package name */
        private short f70120b;

        /* renamed from: c, reason: collision with root package name */
        private short f70121c;

        public o(int i4, long j4) {
            super(a.this, null);
            this.f70120b = (short) i4;
            this.f70121c = (short) j4;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public long a() {
            return this.f70121c;
        }

        @Override // com.mp4parser.iso23001.part7.a.k
        public int clear() {
            return this.f70120b;
        }
    }

    public k a(int i4, long j4) {
        return i4 <= 127 ? j4 <= 127 ? new c(i4, j4) : j4 <= 32767 ? new f(i4, j4) : j4 <= 2147483647L ? new d(i4, j4) : new e(i4, j4) : i4 <= 32767 ? j4 <= 127 ? new l(i4, j4) : j4 <= 32767 ? new o(i4, j4) : j4 <= 2147483647L ? new m(i4, j4) : new n(i4, j4) : j4 <= 127 ? new g(i4, j4) : j4 <= 32767 ? new j(i4, j4) : j4 <= 2147483647L ? new h(i4, j4) : new i(i4, j4);
    }

    public int b() {
        int length = this.f70084a.length;
        k[] kVarArr = this.f70085b;
        return (kVarArr == null || kVarArr.length <= 0) ? length : length + 2 + (kVarArr.length * 6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!new BigInteger(this.f70084a).equals(new BigInteger(aVar.f70084a))) {
            return false;
        }
        k[] kVarArr = this.f70085b;
        k[] kVarArr2 = aVar.f70085b;
        return kVarArr == null ? kVarArr2 == null : Arrays.equals(kVarArr, kVarArr2);
    }

    public int hashCode() {
        byte[] bArr = this.f70084a;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        k[] kVarArr = this.f70085b;
        return hashCode + (kVarArr != null ? Arrays.hashCode(kVarArr) : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᧉ\u0001"));
        sb.append(com.coremedia.iso.e.b(this.f70084a));
        sb.append(ProtectedSandApp.s("\u19ca\u0001"));
        return f3.a(sb, Arrays.toString(this.f70085b), '}');
    }
}
