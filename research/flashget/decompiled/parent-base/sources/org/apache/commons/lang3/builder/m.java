package org.apache.commons.lang3.builder;

/* compiled from: MultilineRecursiveToStringStyle.java */
/* loaded from: classes6.dex */
public class m extends n {
    private static final long G = 1;
    private static final int H = 2;
    private int F = 2;

    public m() {
        j1();
    }

    private void j1() {
        Q0("{" + System.lineSeparator() + ((Object) k1(this.F)));
        P0("," + System.lineSeparator() + ((Object) k1(this.F)));
        O0(System.lineSeparator() + ((Object) k1(this.F + (-2))) + "}");
        StringBuilder sb = new StringBuilder("[");
        sb.append(System.lineSeparator());
        sb.append((Object) k1(this.F));
        S0(sb.toString());
        V0("," + System.lineSeparator() + ((Object) k1(this.F)));
        R0(System.lineSeparator() + ((Object) k1(this.F + (-2))) + "]");
    }

    private StringBuilder k1(int i4) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(" ");
        }
        return sb;
    }

    @Override // org.apache.commons.lang3.builder.n, org.apache.commons.lang3.builder.t
    public void D(StringBuffer stringBuffer, String str, Object obj) {
        if (org.apache.commons.lang3.s.V(obj.getClass()) || String.class.equals(obj.getClass()) || !i1(obj.getClass())) {
            super.D(stringBuffer, str, obj);
            return;
        }
        this.F += 2;
        j1();
        stringBuffer.append(p.A0(obj, this));
        this.F -= 2;
        j1();
    }

    @Override // org.apache.commons.lang3.builder.t
    protected void I(StringBuffer stringBuffer, String str, byte[] bArr) {
        this.F += 2;
        j1();
        super.I(stringBuffer, str, bArr);
        this.F -= 2;
        j1();
    }

    @Override // org.apache.commons.lang3.builder.t
    protected void J(StringBuffer stringBuffer, String str, char[] cArr) {
        this.F += 2;
        j1();
        super.J(stringBuffer, str, cArr);
        this.F -= 2;
        j1();
    }

    @Override // org.apache.commons.lang3.builder.t
    protected void K(StringBuffer stringBuffer, String str, double[] dArr) {
        this.F += 2;
        j1();
        super.K(stringBuffer, str, dArr);
        this.F -= 2;
        j1();
    }

    @Override // org.apache.commons.lang3.builder.t
    protected void K0(StringBuffer stringBuffer, String str, Object obj) {
        this.F += 2;
        j1();
        super.K0(stringBuffer, str, obj);
        this.F -= 2;
        j1();
    }

    @Override // org.apache.commons.lang3.builder.t
    protected void L(StringBuffer stringBuffer, String str, float[] fArr) {
        this.F += 2;
        j1();
        super.L(stringBuffer, str, fArr);
        this.F -= 2;
        j1();
    }

    @Override // org.apache.commons.lang3.builder.t
    protected void M(StringBuffer stringBuffer, String str, int[] iArr) {
        this.F += 2;
        j1();
        super.M(stringBuffer, str, iArr);
        this.F -= 2;
        j1();
    }

    @Override // org.apache.commons.lang3.builder.t
    protected void N(StringBuffer stringBuffer, String str, long[] jArr) {
        this.F += 2;
        j1();
        super.N(stringBuffer, str, jArr);
        this.F -= 2;
        j1();
    }

    @Override // org.apache.commons.lang3.builder.t
    protected void O(StringBuffer stringBuffer, String str, Object[] objArr) {
        this.F += 2;
        j1();
        super.O(stringBuffer, str, objArr);
        this.F -= 2;
        j1();
    }

    @Override // org.apache.commons.lang3.builder.t
    protected void P(StringBuffer stringBuffer, String str, short[] sArr) {
        this.F += 2;
        j1();
        super.P(stringBuffer, str, sArr);
        this.F -= 2;
        j1();
    }

    @Override // org.apache.commons.lang3.builder.t
    protected void Q(StringBuffer stringBuffer, String str, boolean[] zArr) {
        this.F += 2;
        j1();
        super.Q(stringBuffer, str, zArr);
        this.F -= 2;
        j1();
    }
}
