package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* compiled from: OpReorderer.java */
/* loaded from: classes3.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    final a f33480a;

    /* compiled from: OpReorderer.java */
    interface a {
        a.b a(int i4, int i5, int i6, Object obj);

        void b(a.b bVar);
    }

    y(a aVar) {
        this.f33480a = aVar;
    }

    private int a(List<a.b> list) {
        boolean z4 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f33044a != 8) {
                z4 = true;
            } else if (z4) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int i4, a.b bVar, int i5, a.b bVar2) {
        int i6 = bVar.f33047d;
        int i7 = bVar2.f33045b;
        int i10 = i6 < i7 ? -1 : 0;
        int i11 = bVar.f33045b;
        if (i11 < i7) {
            i10++;
        }
        if (i7 <= i11) {
            bVar.f33045b = i11 + bVar2.f33047d;
        }
        int i12 = bVar2.f33045b;
        if (i12 <= i6) {
            bVar.f33047d = i6 + bVar2.f33047d;
        }
        bVar2.f33045b = i12 + i10;
        list.set(i4, bVar2);
        list.set(i5, bVar);
    }

    private void d(List<a.b> list, int i4, int i5) {
        a.b bVar = list.get(i4);
        a.b bVar2 = list.get(i5);
        int i6 = bVar2.f33044a;
        if (i6 == 1) {
            c(list, i4, bVar, i5, bVar2);
        } else if (i6 == 2) {
            e(list, i4, bVar, i5, bVar2);
        } else {
            if (i6 != 4) {
                return;
            }
            f(list, i4, bVar, i5, bVar2);
        }
    }

    void b(List<a.b> list) {
        while (true) {
            int a5 = a(list);
            if (a5 == -1) {
                return;
            } else {
                d(list, a5, a5 + 1);
            }
        }
    }

    void e(List<a.b> list, int i4, a.b bVar, int i5, a.b bVar2) {
        boolean z4;
        int i6 = bVar.f33045b;
        int i7 = bVar.f33047d;
        boolean z5 = false;
        if (i6 < i7) {
            if (bVar2.f33045b == i6 && bVar2.f33047d == i7 - i6) {
                z4 = false;
                z5 = true;
            } else {
                z4 = false;
            }
        } else if (bVar2.f33045b == i7 + 1 && bVar2.f33047d == i6 - i7) {
            z4 = true;
            z5 = true;
        } else {
            z4 = true;
        }
        int i10 = bVar2.f33045b;
        if (i7 < i10) {
            bVar2.f33045b = i10 - 1;
        } else {
            int i11 = bVar2.f33047d;
            if (i7 < i10 + i11) {
                bVar2.f33047d = i11 - 1;
                bVar.f33044a = 2;
                bVar.f33047d = 1;
                if (bVar2.f33047d == 0) {
                    list.remove(i5);
                    this.f33480a.b(bVar2);
                    return;
                }
                return;
            }
        }
        int i12 = bVar.f33045b;
        int i13 = bVar2.f33045b;
        a.b bVar3 = null;
        if (i12 <= i13) {
            bVar2.f33045b = i13 + 1;
        } else {
            int i14 = bVar2.f33047d;
            if (i12 < i13 + i14) {
                bVar3 = this.f33480a.a(2, i12 + 1, (i13 + i14) - i12, null);
                bVar2.f33047d = bVar.f33045b - bVar2.f33045b;
            }
        }
        if (z5) {
            list.set(i4, bVar2);
            list.remove(i5);
            this.f33480a.b(bVar);
            return;
        }
        if (z4) {
            if (bVar3 != null) {
                int i15 = bVar.f33045b;
                if (i15 > bVar3.f33045b) {
                    bVar.f33045b = i15 - bVar3.f33047d;
                }
                int i16 = bVar.f33047d;
                if (i16 > bVar3.f33045b) {
                    bVar.f33047d = i16 - bVar3.f33047d;
                }
            }
            int i17 = bVar.f33045b;
            if (i17 > bVar2.f33045b) {
                bVar.f33045b = i17 - bVar2.f33047d;
            }
            int i18 = bVar.f33047d;
            if (i18 > bVar2.f33045b) {
                bVar.f33047d = i18 - bVar2.f33047d;
            }
        } else {
            if (bVar3 != null) {
                int i19 = bVar.f33045b;
                if (i19 >= bVar3.f33045b) {
                    bVar.f33045b = i19 - bVar3.f33047d;
                }
                int i20 = bVar.f33047d;
                if (i20 >= bVar3.f33045b) {
                    bVar.f33047d = i20 - bVar3.f33047d;
                }
            }
            int i21 = bVar.f33045b;
            if (i21 >= bVar2.f33045b) {
                bVar.f33045b = i21 - bVar2.f33047d;
            }
            int i22 = bVar.f33047d;
            if (i22 >= bVar2.f33045b) {
                bVar.f33047d = i22 - bVar2.f33047d;
            }
        }
        list.set(i4, bVar2);
        if (bVar.f33045b != bVar.f33047d) {
            list.set(i5, bVar);
        } else {
            list.remove(i5);
        }
        if (bVar3 != null) {
            list.add(i4, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void f(java.util.List<androidx.recyclerview.widget.a.b> r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f33047d
            int r1 = r13.f33045b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f33045b = r1
            goto L20
        Ld:
            int r5 = r13.f33047d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f33047d = r5
            androidx.recyclerview.widget.y$a r0 = r8.f33480a
            int r1 = r11.f33045b
            java.lang.Object r5 = r13.f33046c
            androidx.recyclerview.widget.a$b r0 = r0.a(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f33045b
            int r5 = r13.f33045b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f33045b = r5
            goto L41
        L2b:
            int r6 = r13.f33047d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.y$a r4 = r8.f33480a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f33046c
            androidx.recyclerview.widget.a$b r4 = r4.a(r2, r1, r5, r3)
            int r1 = r13.f33047d
            int r1 = r1 - r5
            r13.f33047d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f33047d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.y$a r11 = r8.f33480a
            r11.b(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.y.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
