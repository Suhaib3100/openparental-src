package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* compiled from: OpReorderer.java */
/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    final a f9613a;

    /* compiled from: OpReorderer.java */
    interface a {
        void a(a.b bVar);

        a.b b(int i5, int i6, int i7, Object obj);
    }

    y(a aVar) {
        this.f9613a = aVar;
    }

    private int a(List<a.b> list) {
        boolean z5 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f9143a != 8) {
                z5 = true;
            } else if (z5) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int i5, a.b bVar, int i6, a.b bVar2) {
        int i7 = bVar.f9146d;
        int i8 = bVar2.f9144b;
        int i9 = i7 < i8 ? -1 : 0;
        int i10 = bVar.f9144b;
        if (i10 < i8) {
            i9++;
        }
        if (i8 <= i10) {
            bVar.f9144b = i10 + bVar2.f9146d;
        }
        int i11 = bVar2.f9144b;
        if (i11 <= i7) {
            bVar.f9146d = i7 + bVar2.f9146d;
        }
        bVar2.f9144b = i11 + i9;
        list.set(i5, bVar2);
        list.set(i6, bVar);
    }

    private void d(List<a.b> list, int i5, int i6) {
        a.b bVar = list.get(i5);
        a.b bVar2 = list.get(i6);
        int i7 = bVar2.f9143a;
        if (i7 == 1) {
            c(list, i5, bVar, i6, bVar2);
        } else if (i7 == 2) {
            e(list, i5, bVar, i6, bVar2);
        } else {
            if (i7 != 4) {
                return;
            }
            f(list, i5, bVar, i6, bVar2);
        }
    }

    void b(List<a.b> list) {
        while (true) {
            int a6 = a(list);
            if (a6 == -1) {
                return;
            } else {
                d(list, a6, a6 + 1);
            }
        }
    }

    void e(List<a.b> list, int i5, a.b bVar, int i6, a.b bVar2) {
        boolean z5;
        int i7 = bVar.f9144b;
        int i8 = bVar.f9146d;
        boolean z6 = false;
        if (i7 < i8) {
            if (bVar2.f9144b == i7 && bVar2.f9146d == i8 - i7) {
                z5 = false;
                z6 = true;
            } else {
                z5 = false;
            }
        } else if (bVar2.f9144b == i8 + 1 && bVar2.f9146d == i7 - i8) {
            z5 = true;
            z6 = true;
        } else {
            z5 = true;
        }
        int i9 = bVar2.f9144b;
        if (i8 < i9) {
            bVar2.f9144b = i9 - 1;
        } else {
            int i10 = bVar2.f9146d;
            if (i8 < i9 + i10) {
                bVar2.f9146d = i10 - 1;
                bVar.f9143a = 2;
                bVar.f9146d = 1;
                if (bVar2.f9146d == 0) {
                    list.remove(i6);
                    this.f9613a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i11 = bVar.f9144b;
        int i12 = bVar2.f9144b;
        a.b bVar3 = null;
        if (i11 <= i12) {
            bVar2.f9144b = i12 + 1;
        } else {
            int i13 = bVar2.f9146d;
            if (i11 < i12 + i13) {
                bVar3 = this.f9613a.b(2, i11 + 1, (i12 + i13) - i11, null);
                bVar2.f9146d = bVar.f9144b - bVar2.f9144b;
            }
        }
        if (z6) {
            list.set(i5, bVar2);
            list.remove(i6);
            this.f9613a.a(bVar);
            return;
        }
        if (z5) {
            if (bVar3 != null) {
                int i14 = bVar.f9144b;
                if (i14 > bVar3.f9144b) {
                    bVar.f9144b = i14 - bVar3.f9146d;
                }
                int i15 = bVar.f9146d;
                if (i15 > bVar3.f9144b) {
                    bVar.f9146d = i15 - bVar3.f9146d;
                }
            }
            int i16 = bVar.f9144b;
            if (i16 > bVar2.f9144b) {
                bVar.f9144b = i16 - bVar2.f9146d;
            }
            int i17 = bVar.f9146d;
            if (i17 > bVar2.f9144b) {
                bVar.f9146d = i17 - bVar2.f9146d;
            }
        } else {
            if (bVar3 != null) {
                int i18 = bVar.f9144b;
                if (i18 >= bVar3.f9144b) {
                    bVar.f9144b = i18 - bVar3.f9146d;
                }
                int i19 = bVar.f9146d;
                if (i19 >= bVar3.f9144b) {
                    bVar.f9146d = i19 - bVar3.f9146d;
                }
            }
            int i20 = bVar.f9144b;
            if (i20 >= bVar2.f9144b) {
                bVar.f9144b = i20 - bVar2.f9146d;
            }
            int i21 = bVar.f9146d;
            if (i21 >= bVar2.f9144b) {
                bVar.f9146d = i21 - bVar2.f9146d;
            }
        }
        list.set(i5, bVar2);
        if (bVar.f9144b != bVar.f9146d) {
            list.set(i6, bVar);
        } else {
            list.remove(i6);
        }
        if (bVar3 != null) {
            list.add(i5, bVar3);
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
            int r0 = r11.f9146d
            int r1 = r13.f9144b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f9144b = r1
            goto L20
        Ld:
            int r5 = r13.f9146d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f9146d = r5
            androidx.recyclerview.widget.y$a r0 = r8.f9613a
            int r1 = r11.f9144b
            java.lang.Object r5 = r13.f9145c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f9144b
            int r5 = r13.f9144b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f9144b = r5
            goto L41
        L2b:
            int r6 = r13.f9146d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.y$a r4 = r8.f9613a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f9145c
            androidx.recyclerview.widget.a$b r4 = r4.b(r2, r1, r5, r3)
            int r1 = r13.f9146d
            int r1 = r1 - r5
            r13.f9146d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f9146d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.y$a r11 = r8.f9613a
            r11.a(r13)
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
