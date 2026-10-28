package androidx.constraintlayout.core;

import androidx.compose.material3.j4;
import androidx.constraintlayout.core.b;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public class i extends androidx.constraintlayout.core.b {

    /* renamed from: o, reason: collision with root package name */
    private static final float f21890o = 1.0E-4f;

    /* renamed from: p, reason: collision with root package name */
    private static final boolean f21891p = false;

    /* renamed from: q, reason: collision with root package name */
    static final int f21892q = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f21893i;

    /* renamed from: j, reason: collision with root package name */
    private j[] f21894j;

    /* renamed from: k, reason: collision with root package name */
    private j[] f21895k;

    /* renamed from: l, reason: collision with root package name */
    private int f21896l;

    /* renamed from: m, reason: collision with root package name */
    b f21897m;

    /* renamed from: n, reason: collision with root package name */
    c f21898n;

    /* compiled from: PriorityGoalRow.java */
    class a implements Comparator<j> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(j jVar, j jVar2) {
            return jVar.f21913d - jVar2.f21913d;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    class b {

        /* renamed from: a, reason: collision with root package name */
        j f21900a;

        /* renamed from: b, reason: collision with root package name */
        i f21901b;

        public b(i iVar) {
            this.f21901b = iVar;
        }

        public void a(j jVar) {
            for (int i4 = 0; i4 < 9; i4++) {
                float[] fArr = this.f21900a.f21919j;
                float f4 = fArr[i4] + jVar.f21919j[i4];
                fArr[i4] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.f21900a.f21919j[i4] = 0.0f;
                }
            }
        }

        public boolean b(j jVar, float f4) {
            boolean z4 = true;
            if (!this.f21900a.f21911b) {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f5 = jVar.f21919j[i4];
                    if (f5 != 0.0f) {
                        float f6 = f5 * f4;
                        if (Math.abs(f6) < 1.0E-4f) {
                            f6 = 0.0f;
                        }
                        this.f21900a.f21919j[i4] = f6;
                    } else {
                        this.f21900a.f21919j[i4] = 0.0f;
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < 9; i5++) {
                float[] fArr = this.f21900a.f21919j;
                float f7 = (jVar.f21919j[i5] * f4) + fArr[i5];
                fArr[i5] = f7;
                if (Math.abs(f7) < 1.0E-4f) {
                    this.f21900a.f21919j[i5] = 0.0f;
                } else {
                    z4 = false;
                }
            }
            if (z4) {
                i.this.J(this.f21900a);
            }
            return false;
        }

        public void c(j jVar) {
            this.f21900a = jVar;
        }

        public final boolean d() {
            for (int i4 = 8; i4 >= 0; i4--) {
                float f4 = this.f21900a.f21919j[i4];
                if (f4 > 0.0f) {
                    return false;
                }
                if (f4 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (int i4 = 0; i4 < 9; i4++) {
                if (this.f21900a.f21919j[i4] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean f(j jVar) {
            int i4 = 8;
            while (true) {
                if (i4 < 0) {
                    break;
                }
                float f4 = jVar.f21919j[i4];
                float f5 = this.f21900a.f21919j[i4];
                if (f5 == f4) {
                    i4--;
                } else if (f5 < f4) {
                    return true;
                }
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.f21900a.f21919j, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f21900a != null) {
                for (int i4 = 0; i4 < 9; i4++) {
                    str = androidx.compose.foundation.shape.j.a(j4.a(str), this.f21900a.f21919j[i4], " ");
                }
            }
            StringBuilder a5 = e.a(str, "] ");
            a5.append(this.f21900a);
            return a5.toString();
        }
    }

    public i(c cVar) {
        super(cVar);
        this.f21893i = 128;
        this.f21894j = new j[128];
        this.f21895k = new j[128];
        this.f21896l = 0;
        this.f21897m = new b(this);
        this.f21898n = cVar;
    }

    private final void I(j jVar) {
        int i4;
        int i5 = this.f21896l + 1;
        j[] jVarArr = this.f21894j;
        if (i5 > jVarArr.length) {
            j[] jVarArr2 = (j[]) Arrays.copyOf(jVarArr, jVarArr.length * 2);
            this.f21894j = jVarArr2;
            this.f21895k = (j[]) Arrays.copyOf(jVarArr2, jVarArr2.length * 2);
        }
        j[] jVarArr3 = this.f21894j;
        int i6 = this.f21896l;
        jVarArr3[i6] = jVar;
        int i7 = i6 + 1;
        this.f21896l = i7;
        if (i7 > 1 && jVarArr3[i6].f21913d > jVar.f21913d) {
            int i10 = 0;
            while (true) {
                i4 = this.f21896l;
                if (i10 >= i4) {
                    break;
                }
                this.f21895k[i10] = this.f21894j[i10];
                i10++;
            }
            Arrays.sort(this.f21895k, 0, i4, new a());
            for (int i11 = 0; i11 < this.f21896l; i11++) {
                this.f21894j[i11] = this.f21895k[i11];
            }
        }
        jVar.f21911b = true;
        jVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(j jVar) {
        int i4 = 0;
        while (i4 < this.f21896l) {
            if (this.f21894j[i4] == jVar) {
                while (true) {
                    int i5 = this.f21896l;
                    if (i4 >= i5 - 1) {
                        this.f21896l = i5 - 1;
                        jVar.f21911b = false;
                        return;
                    } else {
                        j[] jVarArr = this.f21894j;
                        int i6 = i4 + 1;
                        jVarArr[i4] = jVarArr[i6];
                        i4 = i6;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.f.a
    public void c(f fVar, androidx.constraintlayout.core.b bVar, boolean z4) {
        j jVar = bVar.f21824a;
        if (jVar == null) {
            return;
        }
        b.a aVar = bVar.f21828e;
        int e4 = aVar.e();
        for (int i4 = 0; i4 < e4; i4++) {
            j h4 = aVar.h(i4);
            float p4 = aVar.p(i4);
            this.f21897m.c(h4);
            if (this.f21897m.b(jVar, p4)) {
                I(h4);
            }
            this.f21825b = (bVar.f21825b * p4) + this.f21825b;
        }
        J(jVar);
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.f.a
    public void clear() {
        this.f21896l = 0;
        this.f21825b = 0.0f;
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.f.a
    public j e(f fVar, boolean[] zArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < this.f21896l; i5++) {
            j jVar = this.f21894j[i5];
            if (!zArr[jVar.f21913d]) {
                this.f21897m.c(jVar);
                if (i4 == -1) {
                    if (!this.f21897m.d()) {
                    }
                    i4 = i5;
                } else {
                    if (!this.f21897m.f(this.f21894j[i4])) {
                    }
                    i4 = i5;
                }
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.f21894j[i4];
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.f.a
    public void f(j jVar) {
        this.f21897m.c(jVar);
        this.f21897m.g();
        jVar.f21919j[jVar.f21915f] = 1.0f;
        I(jVar);
    }

    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.f.a
    public boolean isEmpty() {
        return this.f21896l == 0;
    }

    @Override // androidx.constraintlayout.core.b
    public String toString() {
        String a5 = androidx.compose.foundation.shape.j.a(new StringBuilder(" goal -> ("), this.f21825b, ") : ");
        for (int i4 = 0; i4 < this.f21896l; i4++) {
            this.f21897m.c(this.f21894j[i4]);
            StringBuilder a6 = j4.a(a5);
            a6.append(this.f21897m);
            a6.append(" ");
            a5 = a6.toString();
        }
        return a5;
    }
}
